import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test001");
        edu.osu.cs362.Queue<java.io.Serializable> queue_serializable0 = new edu.osu.cs362.Queue<java.io.Serializable>();
        queue_serializable0.enqueue((java.io.Serializable) 1L);
        java.util.Iterator<java.io.Serializable> iterator_serializable3 = queue_serializable0.iterator();
        java.io.Serializable serializable4 = queue_serializable0.peek();
        java.lang.String str5 = queue_serializable0.toString();
        org.junit.Assert.assertNotNull(iterator_serializable3);
        org.junit.Assert.assertTrue("'" + serializable4 + "' != '" + 1L + "'", serializable4.equals(1L));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "1 " + "'", str5.equals("1 "));
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        edu.osu.cs362.Queue<java.io.Serializable> queue_serializable0 = new edu.osu.cs362.Queue<java.io.Serializable>();
        queue_serializable0.enqueue((java.io.Serializable) 1L);
        java.io.Serializable serializable3 = queue_serializable0.peek();
        java.io.Serializable serializable4 = queue_serializable0.peek();
        java.util.Spliterator<java.io.Serializable> spliterator_serializable5 = queue_serializable0.spliterator();
        org.junit.Assert.assertTrue("'" + serializable3 + "' != '" + 1L + "'", serializable3.equals(1L));
        org.junit.Assert.assertTrue("'" + serializable4 + "' != '" + 1L + "'", serializable4.equals(1L));
        org.junit.Assert.assertNotNull(spliterator_serializable5);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        edu.osu.cs362.Queue<java.util.Iterator<java.io.Serializable>> queue_iterator_serializable0 = new edu.osu.cs362.Queue<java.util.Iterator<java.io.Serializable>>();
        try {
            java.util.Iterator<java.io.Serializable> iterator_serializable1 = queue_iterator_serializable0.dequeue();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException");
        } catch (java.util.NoSuchElementException e) {
        }
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        edu.osu.cs362.Queue<java.util.Iterator<java.io.Serializable>> queue_iterator_serializable0 = new edu.osu.cs362.Queue<java.util.Iterator<java.io.Serializable>>();
        try {
            java.util.Iterator<java.io.Serializable> iterator_serializable1 = queue_iterator_serializable0.peek();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException");
        } catch (java.util.NoSuchElementException e) {
        }
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        edu.osu.cs362.Queue<java.io.Serializable> queue_serializable0 = new edu.osu.cs362.Queue<java.io.Serializable>();
        queue_serializable0.enqueue((java.io.Serializable) 1L);
        java.util.Iterator<java.io.Serializable> iterator_serializable3 = queue_serializable0.iterator();
        java.lang.String str4 = queue_serializable0.toString();
        java.io.Serializable serializable5 = queue_serializable0.dequeue();
        org.junit.Assert.assertNotNull(iterator_serializable3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "1 " + "'", str4.equals("1 "));
        org.junit.Assert.assertTrue("'" + serializable5 + "' != '" + 1L + "'", serializable5.equals(1L));
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        edu.osu.cs362.Queue<java.io.Serializable> queue_serializable0 = new edu.osu.cs362.Queue<java.io.Serializable>();
        queue_serializable0.enqueue((java.io.Serializable) 1L);
        java.io.Serializable serializable3 = queue_serializable0.peek();
        java.util.Iterator<java.io.Serializable> iterator_serializable4 = queue_serializable0.iterator();
        java.util.Iterator<java.io.Serializable> iterator_serializable5 = queue_serializable0.iterator();
        java.io.Serializable serializable6 = queue_serializable0.dequeue();
        java.util.Spliterator<java.io.Serializable> spliterator_serializable7 = queue_serializable0.spliterator();
        org.junit.Assert.assertTrue("'" + serializable3 + "' != '" + 1L + "'", serializable3.equals(1L));
        org.junit.Assert.assertNotNull(iterator_serializable4);
        org.junit.Assert.assertNotNull(iterator_serializable5);
        org.junit.Assert.assertTrue("'" + serializable6 + "' != '" + 1L + "'", serializable6.equals(1L));
        org.junit.Assert.assertNotNull(spliterator_serializable7);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        edu.osu.cs362.Queue<java.util.Iterator<java.io.Serializable>> queue_iterator_serializable0 = new edu.osu.cs362.Queue<java.util.Iterator<java.io.Serializable>>();
        java.util.Iterator<java.util.Iterator<java.io.Serializable>> iterator_iterator_serializable1 = queue_iterator_serializable0.iterator();
        int i2 = queue_iterator_serializable0.size();
        org.junit.Assert.assertNotNull(iterator_iterator_serializable1);
        org.junit.Assert.assertTrue(i2 == 0);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        edu.osu.cs362.Queue<java.util.Iterator<java.io.Serializable>> queue_iterator_serializable0 = new edu.osu.cs362.Queue<java.util.Iterator<java.io.Serializable>>();
        boolean b1 = queue_iterator_serializable0.isEmpty();
        try {
            java.util.Iterator<java.io.Serializable> iterator_serializable2 = queue_iterator_serializable0.dequeue();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException");
        } catch (java.util.NoSuchElementException e) {
        }
        org.junit.Assert.assertTrue(b1 == true);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.io.Serializable>> queue_queue_serializable0 = new edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.io.Serializable>>();
        try {
            edu.osu.cs362.Queue<java.io.Serializable> queue_serializable1 = queue_queue_serializable0.peek();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException");
        } catch (java.util.NoSuchElementException e) {
        }
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        edu.osu.cs362.Queue<java.io.Serializable> queue_serializable0 = new edu.osu.cs362.Queue<java.io.Serializable>();
        queue_serializable0.enqueue((java.io.Serializable) 1L);
        java.io.Serializable serializable3 = queue_serializable0.peek();
        queue_serializable0.enqueue((java.io.Serializable) '4');
        java.io.Serializable serializable6 = queue_serializable0.peek();
        org.junit.Assert.assertTrue("'" + serializable3 + "' != '" + 1L + "'", serializable3.equals(1L));
        org.junit.Assert.assertTrue("'" + serializable6 + "' != '" + 1L + "'", serializable6.equals(1L));
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        edu.osu.cs362.Queue<java.io.Serializable> queue_serializable0 = new edu.osu.cs362.Queue<java.io.Serializable>();
        queue_serializable0.enqueue((java.io.Serializable) 1L);
        java.io.Serializable serializable3 = queue_serializable0.peek();
        java.io.Serializable serializable4 = queue_serializable0.peek();
        queue_serializable0.enqueue((java.io.Serializable) (short) -1);
        java.io.Serializable serializable7 = queue_serializable0.peek();
        java.util.Spliterator<java.io.Serializable> spliterator_serializable8 = queue_serializable0.spliterator();
        org.junit.Assert.assertTrue("'" + serializable3 + "' != '" + 1L + "'", serializable3.equals(1L));
        org.junit.Assert.assertTrue("'" + serializable4 + "' != '" + 1L + "'", serializable4.equals(1L));
        org.junit.Assert.assertTrue("'" + serializable7 + "' != '" + 1L + "'", serializable7.equals(1L));
        org.junit.Assert.assertNotNull(spliterator_serializable8);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>> queue_iterable_iterator_serializable0 = new edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>();
        try {
            java.lang.Iterable<java.util.Iterator<java.io.Serializable>> iterable_iterator_serializable1 = queue_iterable_iterator_serializable0.dequeue();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException");
        } catch (java.util.NoSuchElementException e) {
        }
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.io.Serializable>> queue_queue_serializable0 = new edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.io.Serializable>>();
        java.util.Spliterator<edu.osu.cs362.Queue<java.io.Serializable>> spliterator_queue_serializable1 = queue_queue_serializable0.spliterator();
        boolean b2 = queue_queue_serializable0.isEmpty();
        try {
            edu.osu.cs362.Queue<java.io.Serializable> queue_serializable3 = queue_queue_serializable0.dequeue();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException");
        } catch (java.util.NoSuchElementException e) {
        }
        org.junit.Assert.assertNotNull(spliterator_queue_serializable1);
        org.junit.Assert.assertTrue(b2 == true);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>> queue_iterable_iterator_serializable0 = new edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>();
        java.util.Iterator<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>> iterator_iterable_iterator_serializable1 = queue_iterable_iterator_serializable0.iterator();
        try {
            java.lang.Iterable<java.util.Iterator<java.io.Serializable>> iterable_iterator_serializable2 = queue_iterable_iterator_serializable0.dequeue();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException");
        } catch (java.util.NoSuchElementException e) {
        }
        org.junit.Assert.assertNotNull(iterator_iterable_iterator_serializable1);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.io.Serializable>> queue_queue_serializable0 = new edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.io.Serializable>>();
        java.util.Spliterator<edu.osu.cs362.Queue<java.io.Serializable>> spliterator_queue_serializable1 = queue_queue_serializable0.spliterator();
        java.util.Iterator<edu.osu.cs362.Queue<java.io.Serializable>> iterator_queue_serializable2 = queue_queue_serializable0.iterator();
        java.lang.String str3 = queue_queue_serializable0.toString();
        try {
            edu.osu.cs362.Queue<java.io.Serializable> queue_serializable4 = queue_queue_serializable0.peek();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException");
        } catch (java.util.NoSuchElementException e) {
        }
        org.junit.Assert.assertNotNull(spliterator_queue_serializable1);
        org.junit.Assert.assertNotNull(iterator_queue_serializable2);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.io.Serializable>> queue_queue_serializable0 = new edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.io.Serializable>>();
        java.util.Spliterator<edu.osu.cs362.Queue<java.io.Serializable>> spliterator_queue_serializable1 = queue_queue_serializable0.spliterator();
        java.util.Spliterator<edu.osu.cs362.Queue<java.io.Serializable>> spliterator_queue_serializable2 = queue_queue_serializable0.spliterator();
        boolean b3 = queue_queue_serializable0.isEmpty();
        try {
            edu.osu.cs362.Queue<java.io.Serializable> queue_serializable4 = queue_queue_serializable0.peek();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException");
        } catch (java.util.NoSuchElementException e) {
        }
        org.junit.Assert.assertNotNull(spliterator_queue_serializable1);
        org.junit.Assert.assertNotNull(spliterator_queue_serializable2);
        org.junit.Assert.assertTrue(b3 == true);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        edu.osu.cs362.Queue<java.lang.Object> queue_obj0 = new edu.osu.cs362.Queue<java.lang.Object>();
        int i1 = queue_obj0.size();
        java.util.Spliterator<java.lang.Object> spliterator_obj2 = queue_obj0.spliterator();
        java.util.Iterator<java.lang.Object> iterator_obj3 = queue_obj0.iterator();
        try {
            java.lang.Object obj4 = queue_obj0.peek();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException");
        } catch (java.util.NoSuchElementException e) {
        }
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertNotNull(spliterator_obj2);
        org.junit.Assert.assertNotNull(iterator_obj3);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        edu.osu.cs362.Queue<java.io.Serializable> queue_serializable0 = new edu.osu.cs362.Queue<java.io.Serializable>();
        queue_serializable0.enqueue((java.io.Serializable) 1L);
        java.io.Serializable serializable3 = queue_serializable0.peek();
        java.io.Serializable serializable4 = queue_serializable0.peek();
        java.io.Serializable serializable5 = queue_serializable0.dequeue();
        org.junit.Assert.assertTrue("'" + serializable3 + "' != '" + 1L + "'", serializable3.equals(1L));
        org.junit.Assert.assertTrue("'" + serializable4 + "' != '" + 1L + "'", serializable4.equals(1L));
        org.junit.Assert.assertTrue("'" + serializable5 + "' != '" + 1L + "'", serializable5.equals(1L));
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        edu.osu.cs362.Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new edu.osu.cs362.Queue<java.lang.Comparable<java.lang.String>>();
        try {
            java.lang.Comparable<java.lang.String> comparable_str1 = queue_comparable_str0.peek();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException");
        } catch (java.util.NoSuchElementException e) {
        }
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.io.Serializable>> queue_queue_serializable0 = new edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.io.Serializable>>();
        java.util.Spliterator<edu.osu.cs362.Queue<java.io.Serializable>> spliterator_queue_serializable1 = queue_queue_serializable0.spliterator();
        boolean b2 = queue_queue_serializable0.isEmpty();
        boolean b3 = queue_queue_serializable0.isEmpty();
        org.junit.Assert.assertNotNull(spliterator_queue_serializable1);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b3 == true);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        edu.osu.cs362.Queue<java.io.Serializable> queue_serializable0 = new edu.osu.cs362.Queue<java.io.Serializable>();
        queue_serializable0.enqueue((java.io.Serializable) 1L);
        java.io.Serializable serializable3 = queue_serializable0.peek();
        java.io.Serializable serializable4 = queue_serializable0.peek();
        queue_serializable0.enqueue((java.io.Serializable) (short) -1);
        boolean b7 = queue_serializable0.isEmpty();
        org.junit.Assert.assertTrue("'" + serializable3 + "' != '" + 1L + "'", serializable3.equals(1L));
        org.junit.Assert.assertTrue("'" + serializable4 + "' != '" + 1L + "'", serializable4.equals(1L));
        org.junit.Assert.assertTrue(b7 == false);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        edu.osu.cs362.Queue<java.lang.Object> queue_obj0 = new edu.osu.cs362.Queue<java.lang.Object>();
        int i1 = queue_obj0.size();
        java.util.Spliterator<java.lang.Object> spliterator_obj2 = queue_obj0.spliterator();
        try {
            java.lang.Object obj3 = queue_obj0.peek();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException");
        } catch (java.util.NoSuchElementException e) {
        }
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertNotNull(spliterator_obj2);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        edu.osu.cs362.Queue<java.util.Iterator<edu.osu.cs362.Queue<java.io.Serializable>>> queue_iterator_queue_serializable0 = new edu.osu.cs362.Queue<java.util.Iterator<edu.osu.cs362.Queue<java.io.Serializable>>>();
        int i1 = queue_iterator_queue_serializable0.size();
        java.lang.String str2 = queue_iterator_queue_serializable0.toString();
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.io.Serializable>> queue_queue_serializable0 = new edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.io.Serializable>>();
        java.util.Spliterator<edu.osu.cs362.Queue<java.io.Serializable>> spliterator_queue_serializable1 = queue_queue_serializable0.spliterator();
        java.util.Iterator<edu.osu.cs362.Queue<java.io.Serializable>> iterator_queue_serializable2 = queue_queue_serializable0.iterator();
        java.lang.String str3 = queue_queue_serializable0.toString();
        java.lang.String str4 = queue_queue_serializable0.toString();
        try {
            edu.osu.cs362.Queue<java.io.Serializable> queue_serializable5 = queue_queue_serializable0.peek();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException");
        } catch (java.util.NoSuchElementException e) {
        }
        org.junit.Assert.assertNotNull(spliterator_queue_serializable1);
        org.junit.Assert.assertNotNull(iterator_queue_serializable2);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        edu.osu.cs362.Queue<java.io.Serializable> queue_serializable0 = new edu.osu.cs362.Queue<java.io.Serializable>();
        queue_serializable0.enqueue((java.io.Serializable) 1L);
        java.util.Iterator<java.io.Serializable> iterator_serializable3 = queue_serializable0.iterator();
        java.lang.String str4 = queue_serializable0.toString();
        java.lang.String str5 = queue_serializable0.toString();
        java.io.Serializable serializable6 = queue_serializable0.peek();
        org.junit.Assert.assertNotNull(iterator_serializable3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "1 " + "'", str4.equals("1 "));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "1 " + "'", str5.equals("1 "));
        org.junit.Assert.assertTrue("'" + serializable6 + "' != '" + 1L + "'", serializable6.equals(1L));
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        edu.osu.cs362.Queue<java.lang.Object> queue_obj0 = new edu.osu.cs362.Queue<java.lang.Object>();
        int i1 = queue_obj0.size();
        try {
            java.lang.Object obj2 = queue_obj0.dequeue();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException");
        } catch (java.util.NoSuchElementException e) {
        }
        org.junit.Assert.assertTrue(i1 == 0);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        edu.osu.cs362.Queue<java.util.Iterator<java.io.Serializable>> queue_iterator_serializable0 = new edu.osu.cs362.Queue<java.util.Iterator<java.io.Serializable>>();
        java.lang.String str1 = queue_iterator_serializable0.toString();
        try {
            java.util.Iterator<java.io.Serializable> iterator_serializable2 = queue_iterator_serializable0.peek();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException");
        } catch (java.util.NoSuchElementException e) {
        }
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        edu.osu.cs362.Queue<java.util.Iterator<java.io.Serializable>> queue_iterator_serializable0 = new edu.osu.cs362.Queue<java.util.Iterator<java.io.Serializable>>();
        boolean b1 = queue_iterator_serializable0.isEmpty();
        edu.osu.cs362.Queue<java.io.Serializable> queue_serializable2 = new edu.osu.cs362.Queue<java.io.Serializable>();
        queue_serializable2.enqueue((java.io.Serializable) 1L);
        java.util.Iterator<java.io.Serializable> iterator_serializable5 = queue_serializable2.iterator();
        queue_iterator_serializable0.enqueue(iterator_serializable5);
        java.util.Iterator<java.io.Serializable> iterator_serializable7 = queue_iterator_serializable0.peek();
        org.junit.Assert.assertTrue(b1 == true);
        org.junit.Assert.assertNotNull(iterator_serializable5);
        org.junit.Assert.assertNotNull(iterator_serializable7);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.io.Serializable>> queue_queue_serializable0 = new edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.io.Serializable>>();
        java.util.Spliterator<edu.osu.cs362.Queue<java.io.Serializable>> spliterator_queue_serializable1 = queue_queue_serializable0.spliterator();
        java.util.Iterator<edu.osu.cs362.Queue<java.io.Serializable>> iterator_queue_serializable2 = queue_queue_serializable0.iterator();
        try {
            edu.osu.cs362.Queue<java.io.Serializable> queue_serializable3 = queue_queue_serializable0.peek();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException");
        } catch (java.util.NoSuchElementException e) {
        }
        org.junit.Assert.assertNotNull(spliterator_queue_serializable1);
        org.junit.Assert.assertNotNull(iterator_queue_serializable2);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        edu.osu.cs362.Queue<java.io.Serializable> queue_serializable0 = new edu.osu.cs362.Queue<java.io.Serializable>();
        queue_serializable0.enqueue((java.io.Serializable) 1L);
        java.io.Serializable serializable3 = queue_serializable0.peek();
        java.io.Serializable serializable4 = queue_serializable0.peek();
        queue_serializable0.enqueue((java.io.Serializable) (short) -1);
        java.io.Serializable serializable7 = queue_serializable0.peek();
        queue_serializable0.enqueue((java.io.Serializable) 1L);
        queue_serializable0.enqueue((java.io.Serializable) (short) 1);
        boolean b12 = queue_serializable0.isEmpty();
        org.junit.Assert.assertTrue("'" + serializable3 + "' != '" + 1L + "'", serializable3.equals(1L));
        org.junit.Assert.assertTrue("'" + serializable4 + "' != '" + 1L + "'", serializable4.equals(1L));
        org.junit.Assert.assertTrue("'" + serializable7 + "' != '" + 1L + "'", serializable7.equals(1L));
        org.junit.Assert.assertTrue(b12 == false);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        edu.osu.cs362.Queue<java.util.Iterator<edu.osu.cs362.Queue<java.io.Serializable>>> queue_iterator_queue_serializable0 = new edu.osu.cs362.Queue<java.util.Iterator<edu.osu.cs362.Queue<java.io.Serializable>>>();
        int i1 = queue_iterator_queue_serializable0.size();
        java.util.Iterator<java.util.Iterator<edu.osu.cs362.Queue<java.io.Serializable>>> iterator_iterator_queue_serializable2 = queue_iterator_queue_serializable0.iterator();
        boolean b3 = queue_iterator_queue_serializable0.isEmpty();
        try {
            java.util.Iterator<edu.osu.cs362.Queue<java.io.Serializable>> iterator_queue_serializable4 = queue_iterator_queue_serializable0.peek();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException");
        } catch (java.util.NoSuchElementException e) {
        }
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertNotNull(iterator_iterator_queue_serializable2);
        org.junit.Assert.assertTrue(b3 == true);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        edu.osu.cs362.Queue<java.io.Serializable> queue_serializable0 = new edu.osu.cs362.Queue<java.io.Serializable>();
        queue_serializable0.enqueue((java.io.Serializable) 1L);
        java.io.Serializable serializable3 = queue_serializable0.peek();
        java.util.Iterator<java.io.Serializable> iterator_serializable4 = queue_serializable0.iterator();
        java.util.Iterator<java.io.Serializable> iterator_serializable5 = queue_serializable0.iterator();
        java.util.Spliterator<java.io.Serializable> spliterator_serializable6 = queue_serializable0.spliterator();
        java.lang.String str7 = queue_serializable0.toString();
        org.junit.Assert.assertTrue("'" + serializable3 + "' != '" + 1L + "'", serializable3.equals(1L));
        org.junit.Assert.assertNotNull(iterator_serializable4);
        org.junit.Assert.assertNotNull(iterator_serializable5);
        org.junit.Assert.assertNotNull(spliterator_serializable6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "1 " + "'", str7.equals("1 "));
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.io.Serializable>> queue_queue_serializable0 = new edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.io.Serializable>>();
        java.util.Spliterator<edu.osu.cs362.Queue<java.io.Serializable>> spliterator_queue_serializable1 = queue_queue_serializable0.spliterator();
        java.util.Iterator<edu.osu.cs362.Queue<java.io.Serializable>> iterator_queue_serializable2 = queue_queue_serializable0.iterator();
        java.lang.String str3 = queue_queue_serializable0.toString();
        try {
            edu.osu.cs362.Queue<java.io.Serializable> queue_serializable4 = queue_queue_serializable0.dequeue();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException");
        } catch (java.util.NoSuchElementException e) {
        }
        org.junit.Assert.assertNotNull(spliterator_queue_serializable1);
        org.junit.Assert.assertNotNull(iterator_queue_serializable2);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        edu.osu.cs362.Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new edu.osu.cs362.Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.enqueue((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str3 = queue_comparable_str0.peek();
        java.lang.Comparable<java.lang.String> comparable_str4 = queue_comparable_str0.peek();
        org.junit.Assert.assertTrue("'" + comparable_str3 + "' != '" + "hi!" + "'", comparable_str3.equals("hi!"));
        org.junit.Assert.assertTrue("'" + comparable_str4 + "' != '" + "hi!" + "'", comparable_str4.equals("hi!"));
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        edu.osu.cs362.Queue<java.util.Iterator<edu.osu.cs362.Queue<java.io.Serializable>>> queue_iterator_queue_serializable0 = new edu.osu.cs362.Queue<java.util.Iterator<edu.osu.cs362.Queue<java.io.Serializable>>>();
        try {
            java.util.Iterator<edu.osu.cs362.Queue<java.io.Serializable>> iterator_queue_serializable1 = queue_iterator_queue_serializable0.peek();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException");
        } catch (java.util.NoSuchElementException e) {
        }
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        edu.osu.cs362.Queue<java.io.Serializable> queue_serializable0 = new edu.osu.cs362.Queue<java.io.Serializable>();
        queue_serializable0.enqueue((java.io.Serializable) 1L);
        java.io.Serializable serializable3 = queue_serializable0.peek();
        java.util.Iterator<java.io.Serializable> iterator_serializable4 = queue_serializable0.iterator();
        java.io.Serializable serializable5 = queue_serializable0.peek();
        java.io.Serializable serializable6 = queue_serializable0.peek();
        boolean b7 = queue_serializable0.isEmpty();
        org.junit.Assert.assertTrue("'" + serializable3 + "' != '" + 1L + "'", serializable3.equals(1L));
        org.junit.Assert.assertNotNull(iterator_serializable4);
        org.junit.Assert.assertTrue("'" + serializable5 + "' != '" + 1L + "'", serializable5.equals(1L));
        org.junit.Assert.assertTrue("'" + serializable6 + "' != '" + 1L + "'", serializable6.equals(1L));
        org.junit.Assert.assertTrue(b7 == false);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        edu.osu.cs362.Queue<java.io.Serializable> queue_serializable0 = new edu.osu.cs362.Queue<java.io.Serializable>();
        queue_serializable0.enqueue((java.io.Serializable) 1L);
        java.io.Serializable serializable3 = queue_serializable0.peek();
        java.util.Iterator<java.io.Serializable> iterator_serializable4 = queue_serializable0.iterator();
        java.util.Iterator<java.io.Serializable> iterator_serializable5 = queue_serializable0.iterator();
        java.util.Spliterator<java.io.Serializable> spliterator_serializable6 = queue_serializable0.spliterator();
        java.util.Spliterator<java.io.Serializable> spliterator_serializable7 = queue_serializable0.spliterator();
        java.io.Serializable serializable8 = queue_serializable0.peek();
        org.junit.Assert.assertTrue("'" + serializable3 + "' != '" + 1L + "'", serializable3.equals(1L));
        org.junit.Assert.assertNotNull(iterator_serializable4);
        org.junit.Assert.assertNotNull(iterator_serializable5);
        org.junit.Assert.assertNotNull(spliterator_serializable6);
        org.junit.Assert.assertNotNull(spliterator_serializable7);
        org.junit.Assert.assertTrue("'" + serializable8 + "' != '" + 1L + "'", serializable8.equals(1L));
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.io.Serializable>> queue_queue_serializable0 = new edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.io.Serializable>>();
        java.util.Spliterator<edu.osu.cs362.Queue<java.io.Serializable>> spliterator_queue_serializable1 = queue_queue_serializable0.spliterator();
        java.util.Spliterator<edu.osu.cs362.Queue<java.io.Serializable>> spliterator_queue_serializable2 = queue_queue_serializable0.spliterator();
        int i3 = queue_queue_serializable0.size();
        org.junit.Assert.assertNotNull(spliterator_queue_serializable1);
        org.junit.Assert.assertNotNull(spliterator_queue_serializable2);
        org.junit.Assert.assertTrue(i3 == 0);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.io.Serializable>> queue_queue_serializable0 = new edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.io.Serializable>>();
        java.util.Spliterator<edu.osu.cs362.Queue<java.io.Serializable>> spliterator_queue_serializable1 = queue_queue_serializable0.spliterator();
        java.util.Iterator<edu.osu.cs362.Queue<java.io.Serializable>> iterator_queue_serializable2 = queue_queue_serializable0.iterator();
        try {
            edu.osu.cs362.Queue<java.io.Serializable> queue_serializable3 = queue_queue_serializable0.dequeue();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException");
        } catch (java.util.NoSuchElementException e) {
        }
        org.junit.Assert.assertNotNull(spliterator_queue_serializable1);
        org.junit.Assert.assertNotNull(iterator_queue_serializable2);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>> queue_iterable_iterator_serializable0 = new edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>();
        java.util.Iterator<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>> iterator_iterable_iterator_serializable1 = queue_iterable_iterator_serializable0.iterator();
        java.util.Spliterator<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>> spliterator_iterable_iterator_serializable2 = queue_iterable_iterator_serializable0.spliterator();
        java.util.Spliterator<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>> spliterator_iterable_iterator_serializable3 = queue_iterable_iterator_serializable0.spliterator();
        int i4 = queue_iterable_iterator_serializable0.size();
        java.lang.String str5 = queue_iterable_iterator_serializable0.toString();
        java.util.Spliterator<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>> spliterator_iterable_iterator_serializable6 = queue_iterable_iterator_serializable0.spliterator();
        int i7 = queue_iterable_iterator_serializable0.size();
        int i8 = queue_iterable_iterator_serializable0.size();
        org.junit.Assert.assertNotNull(iterator_iterable_iterator_serializable1);
        org.junit.Assert.assertNotNull(spliterator_iterable_iterator_serializable2);
        org.junit.Assert.assertNotNull(spliterator_iterable_iterator_serializable3);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertNotNull(spliterator_iterable_iterator_serializable6);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(i8 == 0);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        edu.osu.cs362.Queue<java.lang.Object> queue_obj0 = new edu.osu.cs362.Queue<java.lang.Object>();
        int i1 = queue_obj0.size();
        java.util.Spliterator<java.lang.Object> spliterator_obj2 = queue_obj0.spliterator();
        java.util.Iterator<java.lang.Object> iterator_obj3 = queue_obj0.iterator();
        java.util.Spliterator<java.lang.Object> spliterator_obj4 = queue_obj0.spliterator();
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertNotNull(spliterator_obj2);
        org.junit.Assert.assertNotNull(iterator_obj3);
        org.junit.Assert.assertNotNull(spliterator_obj4);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>> queue_iterable_iterator_serializable0 = new edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>();
        java.util.Iterator<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>> iterator_iterable_iterator_serializable1 = queue_iterable_iterator_serializable0.iterator();
        java.util.Spliterator<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>> spliterator_iterable_iterator_serializable2 = queue_iterable_iterator_serializable0.spliterator();
        java.util.Spliterator<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>> spliterator_iterable_iterator_serializable3 = queue_iterable_iterator_serializable0.spliterator();
        int i4 = queue_iterable_iterator_serializable0.size();
        try {
            java.lang.Iterable<java.util.Iterator<java.io.Serializable>> iterable_iterator_serializable5 = queue_iterable_iterator_serializable0.peek();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException");
        } catch (java.util.NoSuchElementException e) {
        }
        org.junit.Assert.assertNotNull(iterator_iterable_iterator_serializable1);
        org.junit.Assert.assertNotNull(spliterator_iterable_iterator_serializable2);
        org.junit.Assert.assertNotNull(spliterator_iterable_iterator_serializable3);
        org.junit.Assert.assertTrue(i4 == 0);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>> queue_iterable_iterator_serializable0 = new edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>();
        boolean b1 = queue_iterable_iterator_serializable0.isEmpty();
        java.lang.String str2 = queue_iterable_iterator_serializable0.toString();
        boolean b3 = queue_iterable_iterator_serializable0.isEmpty();
        try {
            java.lang.Iterable<java.util.Iterator<java.io.Serializable>> iterable_iterator_serializable4 = queue_iterable_iterator_serializable0.dequeue();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException");
        } catch (java.util.NoSuchElementException e) {
        }
        org.junit.Assert.assertTrue(b1 == true);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
        org.junit.Assert.assertTrue(b3 == true);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        edu.osu.cs362.Queue<java.lang.Iterable<java.lang.Object>> queue_iterable_obj0 = new edu.osu.cs362.Queue<java.lang.Iterable<java.lang.Object>>();
        try {
            java.lang.Iterable<java.lang.Object> iterable_obj1 = queue_iterable_obj0.dequeue();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException");
        } catch (java.util.NoSuchElementException e) {
        }
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>> queue_iterable_iterator_serializable0 = new edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>();
        int i1 = queue_iterable_iterator_serializable0.size();
        try {
            java.lang.Iterable<java.util.Iterator<java.io.Serializable>> iterable_iterator_serializable2 = queue_iterable_iterator_serializable0.peek();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException");
        } catch (java.util.NoSuchElementException e) {
        }
        org.junit.Assert.assertTrue(i1 == 0);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        edu.osu.cs362.Queue<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>> queue_iterable_queue_iterable_iterator_serializable0 = new edu.osu.cs362.Queue<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>();
        try {
            java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>> iterable_queue_iterable_iterator_serializable1 = queue_iterable_queue_iterable_iterator_serializable0.dequeue();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException");
        } catch (java.util.NoSuchElementException e) {
        }
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.io.Serializable>> queue_queue_serializable0 = new edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.io.Serializable>>();
        java.util.Spliterator<edu.osu.cs362.Queue<java.io.Serializable>> spliterator_queue_serializable1 = queue_queue_serializable0.spliterator();
        java.util.Iterator<edu.osu.cs362.Queue<java.io.Serializable>> iterator_queue_serializable2 = queue_queue_serializable0.iterator();
        java.lang.String str3 = queue_queue_serializable0.toString();
        java.lang.String str4 = queue_queue_serializable0.toString();
        java.util.Spliterator<edu.osu.cs362.Queue<java.io.Serializable>> spliterator_queue_serializable5 = queue_queue_serializable0.spliterator();
        org.junit.Assert.assertNotNull(spliterator_queue_serializable1);
        org.junit.Assert.assertNotNull(iterator_queue_serializable2);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        org.junit.Assert.assertNotNull(spliterator_queue_serializable5);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        edu.osu.cs362.Queue<java.lang.Object> queue_obj0 = new edu.osu.cs362.Queue<java.lang.Object>();
        int i1 = queue_obj0.size();
        java.util.Spliterator<java.lang.Object> spliterator_obj2 = queue_obj0.spliterator();
        try {
            java.lang.Object obj3 = queue_obj0.dequeue();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException");
        } catch (java.util.NoSuchElementException e) {
        }
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertNotNull(spliterator_obj2);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        edu.osu.cs362.Queue<java.util.Iterator<java.io.Serializable>> queue_iterator_serializable0 = new edu.osu.cs362.Queue<java.util.Iterator<java.io.Serializable>>();
        boolean b1 = queue_iterator_serializable0.isEmpty();
        boolean b2 = queue_iterator_serializable0.isEmpty();
        java.util.Spliterator<java.util.Iterator<java.io.Serializable>> spliterator_iterator_serializable3 = queue_iterator_serializable0.spliterator();
        try {
            java.util.Iterator<java.io.Serializable> iterator_serializable4 = queue_iterator_serializable0.peek();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException");
        } catch (java.util.NoSuchElementException e) {
        }
        org.junit.Assert.assertTrue(b1 == true);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNotNull(spliterator_iterator_serializable3);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        edu.osu.cs362.Queue<java.io.Serializable> queue_serializable0 = new edu.osu.cs362.Queue<java.io.Serializable>();
        queue_serializable0.enqueue((java.io.Serializable) 1L);
        java.io.Serializable serializable3 = queue_serializable0.peek();
        java.util.Iterator<java.io.Serializable> iterator_serializable4 = queue_serializable0.iterator();
        queue_serializable0.enqueue((java.io.Serializable) 100);
        java.io.Serializable serializable7 = queue_serializable0.dequeue();
        org.junit.Assert.assertTrue("'" + serializable3 + "' != '" + 1L + "'", serializable3.equals(1L));
        org.junit.Assert.assertNotNull(iterator_serializable4);
        org.junit.Assert.assertTrue("'" + serializable7 + "' != '" + 1L + "'", serializable7.equals(1L));
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        edu.osu.cs362.Queue<java.lang.Iterable<java.lang.Iterable<java.lang.Object>>> queue_iterable_iterable_obj0 = new edu.osu.cs362.Queue<java.lang.Iterable<java.lang.Iterable<java.lang.Object>>>();
        try {
            java.lang.Iterable<java.lang.Iterable<java.lang.Object>> iterable_iterable_obj1 = queue_iterable_iterable_obj0.dequeue();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException");
        } catch (java.util.NoSuchElementException e) {
        }
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>> queue_iterable_iterator_serializable0 = new edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>();
        java.util.Iterator<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>> iterator_iterable_iterator_serializable1 = queue_iterable_iterator_serializable0.iterator();
        java.util.Spliterator<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>> spliterator_iterable_iterator_serializable2 = queue_iterable_iterator_serializable0.spliterator();
        java.util.Spliterator<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>> spliterator_iterable_iterator_serializable3 = queue_iterable_iterator_serializable0.spliterator();
        int i4 = queue_iterable_iterator_serializable0.size();
        java.lang.String str5 = queue_iterable_iterator_serializable0.toString();
        try {
            java.lang.Iterable<java.util.Iterator<java.io.Serializable>> iterable_iterator_serializable6 = queue_iterable_iterator_serializable0.dequeue();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException");
        } catch (java.util.NoSuchElementException e) {
        }
        org.junit.Assert.assertNotNull(iterator_iterable_iterator_serializable1);
        org.junit.Assert.assertNotNull(spliterator_iterable_iterator_serializable2);
        org.junit.Assert.assertNotNull(spliterator_iterable_iterator_serializable3);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        edu.osu.cs362.Queue<java.io.Serializable> queue_serializable0 = new edu.osu.cs362.Queue<java.io.Serializable>();
        queue_serializable0.enqueue((java.io.Serializable) 1L);
        java.io.Serializable serializable3 = queue_serializable0.peek();
        java.io.Serializable serializable4 = queue_serializable0.peek();
        java.lang.String str5 = queue_serializable0.toString();
        int i6 = queue_serializable0.size();
        java.lang.String str7 = queue_serializable0.toString();
        org.junit.Assert.assertTrue("'" + serializable3 + "' != '" + 1L + "'", serializable3.equals(1L));
        org.junit.Assert.assertTrue("'" + serializable4 + "' != '" + 1L + "'", serializable4.equals(1L));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "1 " + "'", str5.equals("1 "));
        org.junit.Assert.assertTrue(i6 == 1);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "1 " + "'", str7.equals("1 "));
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        edu.osu.cs362.Queue<java.io.Serializable> queue_serializable0 = new edu.osu.cs362.Queue<java.io.Serializable>();
        queue_serializable0.enqueue((java.io.Serializable) 1L);
        java.lang.String str3 = queue_serializable0.toString();
        java.io.Serializable serializable4 = queue_serializable0.dequeue();
        java.lang.String str5 = queue_serializable0.toString();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "1 " + "'", str3.equals("1 "));
        org.junit.Assert.assertTrue("'" + serializable4 + "' != '" + 1L + "'", serializable4.equals(1L));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        edu.osu.cs362.Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new edu.osu.cs362.Queue<java.lang.Comparable<java.lang.String>>();
        int i1 = queue_comparable_str0.size();
        java.lang.String str2 = queue_comparable_str0.toString();
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        edu.osu.cs362.Queue<java.lang.Iterable<java.lang.Iterable<java.lang.Iterable<java.lang.Object>>>> queue_iterable_iterable_iterable_obj0 = new edu.osu.cs362.Queue<java.lang.Iterable<java.lang.Iterable<java.lang.Iterable<java.lang.Object>>>>();
        java.util.Iterator<java.lang.Iterable<java.lang.Iterable<java.lang.Iterable<java.lang.Object>>>> iterator_iterable_iterable_iterable_obj1 = queue_iterable_iterable_iterable_obj0.iterator();
        edu.osu.cs362.Queue<java.lang.Iterable<java.lang.Iterable<java.lang.Object>>> queue_iterable_iterable_obj2 = new edu.osu.cs362.Queue<java.lang.Iterable<java.lang.Iterable<java.lang.Object>>>();
        queue_iterable_iterable_iterable_obj0.enqueue((java.lang.Iterable<java.lang.Iterable<java.lang.Iterable<java.lang.Object>>>) queue_iterable_iterable_obj2);
        boolean b4 = queue_iterable_iterable_iterable_obj0.isEmpty();
        org.junit.Assert.assertNotNull(iterator_iterable_iterable_iterable_obj1);
        org.junit.Assert.assertTrue(b4 == false);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        edu.osu.cs362.Queue<java.lang.Iterable<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>> queue_iterable_iterable_iterator_serializable0 = new edu.osu.cs362.Queue<java.lang.Iterable<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>();
        try {
            java.lang.Iterable<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>> iterable_iterable_iterator_serializable1 = queue_iterable_iterable_iterator_serializable0.dequeue();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException");
        } catch (java.util.NoSuchElementException e) {
        }
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        edu.osu.cs362.Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new edu.osu.cs362.Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.enqueue((java.lang.Comparable<java.lang.String>) "hi!");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> spliterator_comparable_str3 = queue_comparable_str0.spliterator();
        org.junit.Assert.assertNotNull(spliterator_comparable_str3);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        edu.osu.cs362.Queue<java.util.Iterator<edu.osu.cs362.Queue<java.io.Serializable>>> queue_iterator_queue_serializable0 = new edu.osu.cs362.Queue<java.util.Iterator<edu.osu.cs362.Queue<java.io.Serializable>>>();
        int i1 = queue_iterator_queue_serializable0.size();
        java.util.Iterator<java.util.Iterator<edu.osu.cs362.Queue<java.io.Serializable>>> iterator_iterator_queue_serializable2 = queue_iterator_queue_serializable0.iterator();
        java.lang.String str3 = queue_iterator_queue_serializable0.toString();
        try {
            java.util.Iterator<edu.osu.cs362.Queue<java.io.Serializable>> iterator_queue_serializable4 = queue_iterator_queue_serializable0.dequeue();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException");
        } catch (java.util.NoSuchElementException e) {
        }
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertNotNull(iterator_iterator_queue_serializable2);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        edu.osu.cs362.Queue<java.util.Iterator<edu.osu.cs362.Queue<java.io.Serializable>>> queue_iterator_queue_serializable0 = new edu.osu.cs362.Queue<java.util.Iterator<edu.osu.cs362.Queue<java.io.Serializable>>>();
        int i1 = queue_iterator_queue_serializable0.size();
        java.util.Iterator<java.util.Iterator<edu.osu.cs362.Queue<java.io.Serializable>>> iterator_iterator_queue_serializable2 = queue_iterator_queue_serializable0.iterator();
        edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.io.Serializable>> queue_queue_serializable3 = new edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.io.Serializable>>();
        java.util.Spliterator<edu.osu.cs362.Queue<java.io.Serializable>> spliterator_queue_serializable4 = queue_queue_serializable3.spliterator();
        java.util.Iterator<edu.osu.cs362.Queue<java.io.Serializable>> iterator_queue_serializable5 = queue_queue_serializable3.iterator();
        queue_iterator_queue_serializable0.enqueue(iterator_queue_serializable5);
        java.util.Spliterator<java.util.Iterator<edu.osu.cs362.Queue<java.io.Serializable>>> spliterator_iterator_queue_serializable7 = queue_iterator_queue_serializable0.spliterator();
        java.lang.String str8 = queue_iterator_queue_serializable0.toString();
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertNotNull(iterator_iterator_queue_serializable2);
        org.junit.Assert.assertNotNull(spliterator_queue_serializable4);
        org.junit.Assert.assertNotNull(iterator_queue_serializable5);
        org.junit.Assert.assertNotNull(spliterator_iterator_queue_serializable7);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        edu.osu.cs362.Queue<java.io.Serializable> queue_serializable0 = new edu.osu.cs362.Queue<java.io.Serializable>();
        queue_serializable0.enqueue((java.io.Serializable) 1L);
        boolean b3 = queue_serializable0.isEmpty();
        org.junit.Assert.assertTrue(b3 == false);
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        edu.osu.cs362.Queue<java.util.Iterator<edu.osu.cs362.Queue<java.io.Serializable>>> queue_iterator_queue_serializable0 = new edu.osu.cs362.Queue<java.util.Iterator<edu.osu.cs362.Queue<java.io.Serializable>>>();
        int i1 = queue_iterator_queue_serializable0.size();
        java.util.Iterator<java.util.Iterator<edu.osu.cs362.Queue<java.io.Serializable>>> iterator_iterator_queue_serializable2 = queue_iterator_queue_serializable0.iterator();
        boolean b3 = queue_iterator_queue_serializable0.isEmpty();
        boolean b4 = queue_iterator_queue_serializable0.isEmpty();
        int i5 = queue_iterator_queue_serializable0.size();
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertNotNull(iterator_iterator_queue_serializable2);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.io.Serializable>> queue_queue_serializable0 = new edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.io.Serializable>>();
        java.util.Spliterator<edu.osu.cs362.Queue<java.io.Serializable>> spliterator_queue_serializable1 = queue_queue_serializable0.spliterator();
        java.lang.String str2 = queue_queue_serializable0.toString();
        edu.osu.cs362.Queue<java.io.Serializable> queue_serializable3 = new edu.osu.cs362.Queue<java.io.Serializable>();
        queue_serializable3.enqueue((java.io.Serializable) 1L);
        java.io.Serializable serializable6 = queue_serializable3.peek();
        java.util.Iterator<java.io.Serializable> iterator_serializable7 = queue_serializable3.iterator();
        java.io.Serializable serializable8 = queue_serializable3.peek();
        queue_queue_serializable0.enqueue(queue_serializable3);
        java.util.Iterator<edu.osu.cs362.Queue<java.io.Serializable>> iterator_queue_serializable10 = queue_queue_serializable0.iterator();
        edu.osu.cs362.Queue<java.io.Serializable> queue_serializable11 = queue_queue_serializable0.peek();
        java.util.Spliterator<edu.osu.cs362.Queue<java.io.Serializable>> spliterator_queue_serializable12 = queue_queue_serializable0.spliterator();
        org.junit.Assert.assertNotNull(spliterator_queue_serializable1);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
        org.junit.Assert.assertTrue("'" + serializable6 + "' != '" + 1L + "'", serializable6.equals(1L));
        org.junit.Assert.assertNotNull(iterator_serializable7);
        org.junit.Assert.assertTrue("'" + serializable8 + "' != '" + 1L + "'", serializable8.equals(1L));
        org.junit.Assert.assertNotNull(iterator_queue_serializable10);
        org.junit.Assert.assertNotNull(queue_serializable11);
        org.junit.Assert.assertNotNull(spliterator_queue_serializable12);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        edu.osu.cs362.Queue<java.lang.Iterable<java.lang.Iterable<java.lang.Iterable<java.lang.Object>>>> queue_iterable_iterable_iterable_obj0 = new edu.osu.cs362.Queue<java.lang.Iterable<java.lang.Iterable<java.lang.Iterable<java.lang.Object>>>>();
        java.util.Iterator<java.lang.Iterable<java.lang.Iterable<java.lang.Iterable<java.lang.Object>>>> iterator_iterable_iterable_iterable_obj1 = queue_iterable_iterable_iterable_obj0.iterator();
        int i2 = queue_iterable_iterable_iterable_obj0.size();
        try {
            java.lang.Iterable<java.lang.Iterable<java.lang.Iterable<java.lang.Object>>> iterable_iterable_iterable_obj3 = queue_iterable_iterable_iterable_obj0.dequeue();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException");
        } catch (java.util.NoSuchElementException e) {
        }
        org.junit.Assert.assertNotNull(iterator_iterable_iterable_iterable_obj1);
        org.junit.Assert.assertTrue(i2 == 0);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        edu.osu.cs362.Queue<java.lang.Iterable<java.lang.Iterable<java.lang.Iterable<java.lang.Object>>>> queue_iterable_iterable_iterable_obj0 = new edu.osu.cs362.Queue<java.lang.Iterable<java.lang.Iterable<java.lang.Iterable<java.lang.Object>>>>();
        java.util.Iterator<java.lang.Iterable<java.lang.Iterable<java.lang.Iterable<java.lang.Object>>>> iterator_iterable_iterable_iterable_obj1 = queue_iterable_iterable_iterable_obj0.iterator();
        int i2 = queue_iterable_iterable_iterable_obj0.size();
        int i3 = queue_iterable_iterable_iterable_obj0.size();
        try {
            java.lang.Iterable<java.lang.Iterable<java.lang.Iterable<java.lang.Object>>> iterable_iterable_iterable_obj4 = queue_iterable_iterable_iterable_obj0.peek();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException");
        } catch (java.util.NoSuchElementException e) {
        }
        org.junit.Assert.assertNotNull(iterator_iterable_iterable_iterable_obj1);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(i3 == 0);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        edu.osu.cs362.Queue<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>> queue_iterable_queue_iterable_iterator_serializable0 = new edu.osu.cs362.Queue<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>();
        java.util.Spliterator<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>> spliterator_iterable_queue_iterable_iterator_serializable1 = queue_iterable_queue_iterable_iterator_serializable0.spliterator();
        try {
            java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>> iterable_queue_iterable_iterator_serializable2 = queue_iterable_queue_iterable_iterator_serializable0.dequeue();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException");
        } catch (java.util.NoSuchElementException e) {
        }
        org.junit.Assert.assertNotNull(spliterator_iterable_queue_iterable_iterator_serializable1);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>> queue_iterable_iterator_serializable0 = new edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>();
        java.util.Iterator<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>> iterator_iterable_iterator_serializable1 = queue_iterable_iterator_serializable0.iterator();
        edu.osu.cs362.Queue<java.util.Iterator<java.io.Serializable>> queue_iterator_serializable2 = new edu.osu.cs362.Queue<java.util.Iterator<java.io.Serializable>>();
        boolean b3 = queue_iterator_serializable2.isEmpty();
        edu.osu.cs362.Queue<java.io.Serializable> queue_serializable4 = new edu.osu.cs362.Queue<java.io.Serializable>();
        queue_serializable4.enqueue((java.io.Serializable) 1L);
        java.util.Iterator<java.io.Serializable> iterator_serializable7 = queue_serializable4.iterator();
        queue_iterator_serializable2.enqueue(iterator_serializable7);
        int i9 = queue_iterator_serializable2.size();
        java.util.Iterator<java.io.Serializable> iterator_serializable10 = queue_iterator_serializable2.peek();
        boolean b11 = queue_iterator_serializable2.isEmpty();
        java.util.Iterator<java.io.Serializable> iterator_serializable12 = queue_iterator_serializable2.peek();
        java.util.Spliterator<java.util.Iterator<java.io.Serializable>> spliterator_iterator_serializable13 = queue_iterator_serializable2.spliterator();
        queue_iterable_iterator_serializable0.enqueue((java.lang.Iterable<java.util.Iterator<java.io.Serializable>>) queue_iterator_serializable2);
        java.util.Iterator<java.io.Serializable> iterator_serializable15 = queue_iterator_serializable2.dequeue();
        org.junit.Assert.assertNotNull(iterator_iterable_iterator_serializable1);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertNotNull(iterator_serializable7);
        org.junit.Assert.assertTrue(i9 == 1);
        org.junit.Assert.assertNotNull(iterator_serializable10);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(iterator_serializable12);
        org.junit.Assert.assertNotNull(spliterator_iterator_serializable13);
        org.junit.Assert.assertNotNull(iterator_serializable15);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        edu.osu.cs362.Queue<java.io.Serializable> queue_serializable0 = new edu.osu.cs362.Queue<java.io.Serializable>();
        queue_serializable0.enqueue((java.io.Serializable) 1L);
        java.lang.String str3 = queue_serializable0.toString();
        queue_serializable0.enqueue((java.io.Serializable) (byte) -1);
        java.io.Serializable serializable6 = queue_serializable0.peek();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "1 " + "'", str3.equals("1 "));
        org.junit.Assert.assertTrue("'" + serializable6 + "' != '" + 1L + "'", serializable6.equals(1L));
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.io.Serializable>> queue_queue_serializable0 = new edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.io.Serializable>>();
        java.util.Spliterator<edu.osu.cs362.Queue<java.io.Serializable>> spliterator_queue_serializable1 = queue_queue_serializable0.spliterator();
        edu.osu.cs362.Queue<java.io.Serializable> queue_serializable2 = null;
        queue_queue_serializable0.enqueue(queue_serializable2);
        org.junit.Assert.assertNotNull(spliterator_queue_serializable1);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        edu.osu.cs362.Queue<java.lang.Object> queue_obj0 = new edu.osu.cs362.Queue<java.lang.Object>();
        java.util.Iterator<java.lang.Object> iterator_obj1 = queue_obj0.iterator();
        try {
            java.lang.Object obj2 = queue_obj0.dequeue();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException");
        } catch (java.util.NoSuchElementException e) {
        }
        org.junit.Assert.assertNotNull(iterator_obj1);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        edu.osu.cs362.Queue<java.util.Iterator<java.io.Serializable>> queue_iterator_serializable0 = new edu.osu.cs362.Queue<java.util.Iterator<java.io.Serializable>>();
        boolean b1 = queue_iterator_serializable0.isEmpty();
        boolean b2 = queue_iterator_serializable0.isEmpty();
        java.util.Spliterator<java.util.Iterator<java.io.Serializable>> spliterator_iterator_serializable3 = queue_iterator_serializable0.spliterator();
        int i4 = queue_iterator_serializable0.size();
        org.junit.Assert.assertTrue(b1 == true);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNotNull(spliterator_iterator_serializable3);
        org.junit.Assert.assertTrue(i4 == 0);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        edu.osu.cs362.Queue<java.lang.Iterable<java.io.Serializable>> queue_iterable_serializable0 = new edu.osu.cs362.Queue<java.lang.Iterable<java.io.Serializable>>();
        int i1 = queue_iterable_serializable0.size();
        int i2 = queue_iterable_serializable0.size();
        try {
            java.lang.Iterable<java.io.Serializable> iterable_serializable3 = queue_iterable_serializable0.dequeue();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException");
        } catch (java.util.NoSuchElementException e) {
        }
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        edu.osu.cs362.Queue<java.lang.Object> queue_obj0 = new edu.osu.cs362.Queue<java.lang.Object>();
        int i1 = queue_obj0.size();
        edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>> queue_iterable_iterator_serializable2 = new edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>();
        java.util.Iterator<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>> iterator_iterable_iterator_serializable3 = queue_iterable_iterator_serializable2.iterator();
        java.util.Spliterator<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>> spliterator_iterable_iterator_serializable4 = queue_iterable_iterator_serializable2.spliterator();
        java.lang.String str5 = queue_iterable_iterator_serializable2.toString();
        int i6 = queue_iterable_iterator_serializable2.size();
        queue_obj0.enqueue((java.lang.Object) queue_iterable_iterator_serializable2);
        try {
            java.lang.Iterable<java.util.Iterator<java.io.Serializable>> iterable_iterator_serializable8 = queue_iterable_iterator_serializable2.dequeue();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException");
        } catch (java.util.NoSuchElementException e) {
        }
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertNotNull(iterator_iterable_iterator_serializable3);
        org.junit.Assert.assertNotNull(spliterator_iterable_iterator_serializable4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertTrue(i6 == 0);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        edu.osu.cs362.Queue<java.lang.Iterable<java.io.Serializable>> queue_iterable_serializable0 = new edu.osu.cs362.Queue<java.lang.Iterable<java.io.Serializable>>();
        java.util.Spliterator<java.lang.Iterable<java.io.Serializable>> spliterator_iterable_serializable1 = queue_iterable_serializable0.spliterator();
        int i2 = queue_iterable_serializable0.size();
        try {
            java.lang.Iterable<java.io.Serializable> iterable_serializable3 = queue_iterable_serializable0.dequeue();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException");
        } catch (java.util.NoSuchElementException e) {
        }
        org.junit.Assert.assertNotNull(spliterator_iterable_serializable1);
        org.junit.Assert.assertTrue(i2 == 0);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        edu.osu.cs362.Queue<java.lang.Iterable<java.lang.Object>> queue_iterable_obj0 = new edu.osu.cs362.Queue<java.lang.Iterable<java.lang.Object>>();
        java.util.Spliterator<java.lang.Iterable<java.lang.Object>> spliterator_iterable_obj1 = queue_iterable_obj0.spliterator();
        edu.osu.cs362.Queue<java.lang.Object> queue_obj2 = new edu.osu.cs362.Queue<java.lang.Object>();
        int i3 = queue_obj2.size();
        edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>> queue_iterable_iterator_serializable4 = new edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>();
        java.util.Iterator<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>> iterator_iterable_iterator_serializable5 = queue_iterable_iterator_serializable4.iterator();
        java.util.Spliterator<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>> spliterator_iterable_iterator_serializable6 = queue_iterable_iterator_serializable4.spliterator();
        java.lang.String str7 = queue_iterable_iterator_serializable4.toString();
        int i8 = queue_iterable_iterator_serializable4.size();
        queue_obj2.enqueue((java.lang.Object) queue_iterable_iterator_serializable4);
        queue_iterable_obj0.enqueue((java.lang.Iterable<java.lang.Object>) queue_obj2);
        org.junit.Assert.assertNotNull(spliterator_iterable_obj1);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertNotNull(iterator_iterable_iterator_serializable5);
        org.junit.Assert.assertNotNull(spliterator_iterable_iterator_serializable6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue(i8 == 0);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        edu.osu.cs362.Queue<java.util.Iterator<java.io.Serializable>> queue_iterator_serializable0 = new edu.osu.cs362.Queue<java.util.Iterator<java.io.Serializable>>();
        boolean b1 = queue_iterator_serializable0.isEmpty();
        edu.osu.cs362.Queue<java.io.Serializable> queue_serializable2 = new edu.osu.cs362.Queue<java.io.Serializable>();
        queue_serializable2.enqueue((java.io.Serializable) 1L);
        java.io.Serializable serializable5 = queue_serializable2.peek();
        java.util.Iterator<java.io.Serializable> iterator_serializable6 = queue_serializable2.iterator();
        java.util.Iterator<java.io.Serializable> iterator_serializable7 = queue_serializable2.iterator();
        queue_iterator_serializable0.enqueue(iterator_serializable7);
        java.util.Iterator<java.io.Serializable> iterator_serializable9 = queue_iterator_serializable0.peek();
        java.util.Iterator<java.io.Serializable> iterator_serializable10 = queue_iterator_serializable0.dequeue();
        try {
            java.util.Iterator<java.io.Serializable> iterator_serializable11 = queue_iterator_serializable0.dequeue();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException");
        } catch (java.util.NoSuchElementException e) {
        }
        org.junit.Assert.assertTrue(b1 == true);
        org.junit.Assert.assertTrue("'" + serializable5 + "' != '" + 1L + "'", serializable5.equals(1L));
        org.junit.Assert.assertNotNull(iterator_serializable6);
        org.junit.Assert.assertNotNull(iterator_serializable7);
        org.junit.Assert.assertNotNull(iterator_serializable9);
        org.junit.Assert.assertNotNull(iterator_serializable10);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        edu.osu.cs362.Queue<java.util.Iterator<java.io.Serializable>> queue_iterator_serializable0 = new edu.osu.cs362.Queue<java.util.Iterator<java.io.Serializable>>();
        boolean b1 = queue_iterator_serializable0.isEmpty();
        boolean b2 = queue_iterator_serializable0.isEmpty();
        boolean b3 = queue_iterator_serializable0.isEmpty();
        try {
            java.util.Iterator<java.io.Serializable> iterator_serializable4 = queue_iterator_serializable0.dequeue();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException");
        } catch (java.util.NoSuchElementException e) {
        }
        org.junit.Assert.assertTrue(b1 == true);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b3 == true);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>> queue_queue_iterable_queue_iterable_iterator_serializable0 = new edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>();
        boolean b1 = queue_queue_iterable_queue_iterable_iterator_serializable0.isEmpty();
        try {
            edu.osu.cs362.Queue<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>> queue_iterable_queue_iterable_iterator_serializable2 = queue_queue_iterable_queue_iterable_iterator_serializable0.dequeue();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException");
        } catch (java.util.NoSuchElementException e) {
        }
        org.junit.Assert.assertTrue(b1 == true);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>> queue_queue_iterable_queue_iterable_iterator_serializable0 = new edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>();
        boolean b1 = queue_queue_iterable_queue_iterable_iterator_serializable0.isEmpty();
        try {
            edu.osu.cs362.Queue<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>> queue_iterable_queue_iterable_iterator_serializable2 = queue_queue_iterable_queue_iterable_iterator_serializable0.peek();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException");
        } catch (java.util.NoSuchElementException e) {
        }
        org.junit.Assert.assertTrue(b1 == true);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        edu.osu.cs362.Queue<java.util.Spliterator<java.util.Iterator<java.io.Serializable>>> queue_spliterator_iterator_serializable0 = new edu.osu.cs362.Queue<java.util.Spliterator<java.util.Iterator<java.io.Serializable>>>();
        java.lang.String str1 = queue_spliterator_iterator_serializable0.toString();
        try {
            java.util.Spliterator<java.util.Iterator<java.io.Serializable>> spliterator_iterator_serializable2 = queue_spliterator_iterator_serializable0.peek();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException");
        } catch (java.util.NoSuchElementException e) {
        }
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>> queue_iterable_iterator_serializable0 = new edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>();
        java.util.Iterator<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>> iterator_iterable_iterator_serializable1 = queue_iterable_iterator_serializable0.iterator();
        java.util.Spliterator<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>> spliterator_iterable_iterator_serializable2 = queue_iterable_iterator_serializable0.spliterator();
        try {
            java.lang.Iterable<java.util.Iterator<java.io.Serializable>> iterable_iterator_serializable3 = queue_iterable_iterator_serializable0.peek();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException");
        } catch (java.util.NoSuchElementException e) {
        }
        org.junit.Assert.assertNotNull(iterator_iterable_iterator_serializable1);
        org.junit.Assert.assertNotNull(spliterator_iterable_iterator_serializable2);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        edu.osu.cs362.Queue<java.lang.Iterable<java.lang.Iterable<java.lang.Iterable<java.lang.Object>>>> queue_iterable_iterable_iterable_obj0 = new edu.osu.cs362.Queue<java.lang.Iterable<java.lang.Iterable<java.lang.Iterable<java.lang.Object>>>>();
        java.util.Iterator<java.lang.Iterable<java.lang.Iterable<java.lang.Iterable<java.lang.Object>>>> iterator_iterable_iterable_iterable_obj1 = queue_iterable_iterable_iterable_obj0.iterator();
        edu.osu.cs362.Queue<java.lang.Iterable<java.lang.Iterable<java.lang.Object>>> queue_iterable_iterable_obj2 = new edu.osu.cs362.Queue<java.lang.Iterable<java.lang.Iterable<java.lang.Object>>>();
        queue_iterable_iterable_iterable_obj0.enqueue((java.lang.Iterable<java.lang.Iterable<java.lang.Iterable<java.lang.Object>>>) queue_iterable_iterable_obj2);
        int i4 = queue_iterable_iterable_obj2.size();
        boolean b5 = queue_iterable_iterable_obj2.isEmpty();
        boolean b6 = queue_iterable_iterable_obj2.isEmpty();
        java.util.Spliterator<java.lang.Iterable<java.lang.Iterable<java.lang.Object>>> spliterator_iterable_iterable_obj7 = queue_iterable_iterable_obj2.spliterator();
        org.junit.Assert.assertNotNull(iterator_iterable_iterable_iterable_obj1);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertNotNull(spliterator_iterable_iterable_obj7);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        edu.osu.cs362.Queue<java.lang.Iterable<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>> queue_iterable_iterable_iterator_serializable0 = new edu.osu.cs362.Queue<java.lang.Iterable<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>();
        boolean b1 = queue_iterable_iterable_iterator_serializable0.isEmpty();
        java.util.Spliterator<java.lang.Iterable<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>> spliterator_iterable_iterable_iterator_serializable2 = queue_iterable_iterable_iterator_serializable0.spliterator();
        int i3 = queue_iterable_iterable_iterator_serializable0.size();
        try {
            java.lang.Iterable<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>> iterable_iterable_iterator_serializable4 = queue_iterable_iterable_iterator_serializable0.peek();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException");
        } catch (java.util.NoSuchElementException e) {
        }
        org.junit.Assert.assertTrue(b1 == true);
        org.junit.Assert.assertNotNull(spliterator_iterable_iterable_iterator_serializable2);
        org.junit.Assert.assertTrue(i3 == 0);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        edu.osu.cs362.Queue<java.lang.Iterable<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>> queue_iterable_iterable_iterator_serializable0 = new edu.osu.cs362.Queue<java.lang.Iterable<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>();
        boolean b1 = queue_iterable_iterable_iterator_serializable0.isEmpty();
        java.util.Spliterator<java.lang.Iterable<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>> spliterator_iterable_iterable_iterator_serializable2 = queue_iterable_iterable_iterator_serializable0.spliterator();
        int i3 = queue_iterable_iterable_iterator_serializable0.size();
        try {
            java.lang.Iterable<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>> iterable_iterable_iterator_serializable4 = queue_iterable_iterable_iterator_serializable0.dequeue();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException");
        } catch (java.util.NoSuchElementException e) {
        }
        org.junit.Assert.assertTrue(b1 == true);
        org.junit.Assert.assertNotNull(spliterator_iterable_iterable_iterator_serializable2);
        org.junit.Assert.assertTrue(i3 == 0);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        edu.osu.cs362.Queue<java.lang.Iterable<java.lang.Object>> queue_iterable_obj0 = new edu.osu.cs362.Queue<java.lang.Iterable<java.lang.Object>>();
        java.lang.String str1 = queue_iterable_obj0.toString();
        java.lang.String str2 = queue_iterable_obj0.toString();
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        edu.osu.cs362.Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new edu.osu.cs362.Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.enqueue((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str3 = queue_comparable_str0.toString();
        int i4 = queue_comparable_str0.size();
        int i5 = queue_comparable_str0.size();
        java.lang.String str6 = queue_comparable_str0.toString();
        java.lang.Comparable<java.lang.String> comparable_str7 = queue_comparable_str0.peek();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi! " + "'", str3.equals("hi! "));
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertTrue(i5 == 1);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "hi! " + "'", str6.equals("hi! "));
        org.junit.Assert.assertTrue("'" + comparable_str7 + "' != '" + "hi!" + "'", comparable_str7.equals("hi!"));
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        edu.osu.cs362.Queue<java.lang.Iterable<java.io.Serializable>> queue_iterable_serializable0 = new edu.osu.cs362.Queue<java.lang.Iterable<java.io.Serializable>>();
        int i1 = queue_iterable_serializable0.size();
        int i2 = queue_iterable_serializable0.size();
        try {
            java.lang.Iterable<java.io.Serializable> iterable_serializable3 = queue_iterable_serializable0.peek();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException");
        } catch (java.util.NoSuchElementException e) {
        }
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        edu.osu.cs362.Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new edu.osu.cs362.Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.enqueue((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str3 = queue_comparable_str0.toString();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> spliterator_comparable_str4 = queue_comparable_str0.spliterator();
        queue_comparable_str0.enqueue((java.lang.Comparable<java.lang.String>) "hi! ");
        java.lang.Comparable<java.lang.String> comparable_str7 = queue_comparable_str0.dequeue();
        java.lang.Comparable<java.lang.String> comparable_str8 = queue_comparable_str0.dequeue();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi! " + "'", str3.equals("hi! "));
        org.junit.Assert.assertNotNull(spliterator_comparable_str4);
        org.junit.Assert.assertTrue("'" + comparable_str7 + "' != '" + "hi!" + "'", comparable_str7.equals("hi!"));
        org.junit.Assert.assertTrue("'" + comparable_str8 + "' != '" + "hi! " + "'", comparable_str8.equals("hi! "));
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        edu.osu.cs362.Queue<java.lang.Iterable<java.io.Serializable>> queue_iterable_serializable0 = new edu.osu.cs362.Queue<java.lang.Iterable<java.io.Serializable>>();
        java.util.Spliterator<java.lang.Iterable<java.io.Serializable>> spliterator_iterable_serializable1 = queue_iterable_serializable0.spliterator();
        int i2 = queue_iterable_serializable0.size();
        try {
            java.lang.Iterable<java.io.Serializable> iterable_serializable3 = queue_iterable_serializable0.peek();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException");
        } catch (java.util.NoSuchElementException e) {
        }
        org.junit.Assert.assertNotNull(spliterator_iterable_serializable1);
        org.junit.Assert.assertTrue(i2 == 0);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        edu.osu.cs362.Queue<java.lang.Iterable<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>> queue_iterable_iterable_iterator_serializable0 = new edu.osu.cs362.Queue<java.lang.Iterable<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>();
        boolean b1 = queue_iterable_iterable_iterator_serializable0.isEmpty();
        java.util.Spliterator<java.lang.Iterable<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>> spliterator_iterable_iterable_iterator_serializable2 = queue_iterable_iterable_iterator_serializable0.spliterator();
        try {
            java.lang.Iterable<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>> iterable_iterable_iterator_serializable3 = queue_iterable_iterable_iterator_serializable0.peek();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException");
        } catch (java.util.NoSuchElementException e) {
        }
        org.junit.Assert.assertTrue(b1 == true);
        org.junit.Assert.assertNotNull(spliterator_iterable_iterable_iterator_serializable2);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        edu.osu.cs362.Queue<java.util.Iterator<java.io.Serializable>> queue_iterator_serializable0 = new edu.osu.cs362.Queue<java.util.Iterator<java.io.Serializable>>();
        boolean b1 = queue_iterator_serializable0.isEmpty();
        edu.osu.cs362.Queue<java.io.Serializable> queue_serializable2 = new edu.osu.cs362.Queue<java.io.Serializable>();
        queue_serializable2.enqueue((java.io.Serializable) 1L);
        java.util.Iterator<java.io.Serializable> iterator_serializable5 = queue_serializable2.iterator();
        queue_iterator_serializable0.enqueue(iterator_serializable5);
        int i7 = queue_iterator_serializable0.size();
        java.util.Spliterator<java.util.Iterator<java.io.Serializable>> spliterator_iterator_serializable8 = queue_iterator_serializable0.spliterator();
        java.util.Iterator<java.io.Serializable> iterator_serializable9 = queue_iterator_serializable0.peek();
        org.junit.Assert.assertTrue(b1 == true);
        org.junit.Assert.assertNotNull(iterator_serializable5);
        org.junit.Assert.assertTrue(i7 == 1);
        org.junit.Assert.assertNotNull(spliterator_iterator_serializable8);
        org.junit.Assert.assertNotNull(iterator_serializable9);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        edu.osu.cs362.Queue<java.io.Serializable> queue_serializable0 = new edu.osu.cs362.Queue<java.io.Serializable>();
        queue_serializable0.enqueue((java.io.Serializable) 1L);
        java.io.Serializable serializable3 = queue_serializable0.peek();
        java.lang.String str4 = queue_serializable0.toString();
        org.junit.Assert.assertTrue("'" + serializable3 + "' != '" + 1L + "'", serializable3.equals(1L));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "1 " + "'", str4.equals("1 "));
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        edu.osu.cs362.Queue<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>> queue_iterable_queue_iterable_iterator_serializable0 = new edu.osu.cs362.Queue<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>();
        java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>> iterable_queue_iterable_iterator_serializable1 = null;
        queue_iterable_queue_iterable_iterator_serializable0.enqueue(iterable_queue_iterable_iterator_serializable1);
        java.util.Iterator<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>> iterator_iterable_queue_iterable_iterator_serializable3 = queue_iterable_queue_iterable_iterator_serializable0.iterator();
        int i4 = queue_iterable_queue_iterable_iterator_serializable0.size();
        edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>> queue_queue_iterable_iterator_serializable5 = new edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>();
        boolean b6 = queue_queue_iterable_iterator_serializable5.isEmpty();
        boolean b7 = queue_queue_iterable_iterator_serializable5.isEmpty();
        boolean b8 = queue_queue_iterable_iterator_serializable5.isEmpty();
        int i9 = queue_queue_iterable_iterator_serializable5.size();
        int i10 = queue_queue_iterable_iterator_serializable5.size();
        queue_iterable_queue_iterable_iterator_serializable0.enqueue((java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>) queue_queue_iterable_iterator_serializable5);
        int i12 = queue_queue_iterable_iterator_serializable5.size();
        org.junit.Assert.assertNotNull(iterator_iterable_queue_iterable_iterator_serializable3);
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertTrue(i10 == 0);
        org.junit.Assert.assertTrue(i12 == 0);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        edu.osu.cs362.Queue<java.util.Spliterator<java.util.Iterator<java.io.Serializable>>> queue_spliterator_iterator_serializable0 = new edu.osu.cs362.Queue<java.util.Spliterator<java.util.Iterator<java.io.Serializable>>>();
        java.lang.String str1 = queue_spliterator_iterator_serializable0.toString();
        java.util.Spliterator<java.util.Spliterator<java.util.Iterator<java.io.Serializable>>> spliterator_spliterator_iterator_serializable2 = queue_spliterator_iterator_serializable0.spliterator();
        try {
            java.util.Spliterator<java.util.Iterator<java.io.Serializable>> spliterator_iterator_serializable3 = queue_spliterator_iterator_serializable0.peek();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException");
        } catch (java.util.NoSuchElementException e) {
        }
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertNotNull(spliterator_spliterator_iterator_serializable2);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.io.Serializable>> queue_queue_serializable0 = new edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.io.Serializable>>();
        java.util.Spliterator<edu.osu.cs362.Queue<java.io.Serializable>> spliterator_queue_serializable1 = queue_queue_serializable0.spliterator();
        java.lang.String str2 = queue_queue_serializable0.toString();
        java.util.Spliterator<edu.osu.cs362.Queue<java.io.Serializable>> spliterator_queue_serializable3 = queue_queue_serializable0.spliterator();
        try {
            edu.osu.cs362.Queue<java.io.Serializable> queue_serializable4 = queue_queue_serializable0.peek();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException");
        } catch (java.util.NoSuchElementException e) {
        }
        org.junit.Assert.assertNotNull(spliterator_queue_serializable1);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
        org.junit.Assert.assertNotNull(spliterator_queue_serializable3);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>> queue_iterable_iterator_serializable0 = new edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>();
        java.util.Iterator<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>> iterator_iterable_iterator_serializable1 = queue_iterable_iterator_serializable0.iterator();
        java.lang.String str2 = queue_iterable_iterator_serializable0.toString();
        edu.osu.cs362.Queue<java.util.Iterator<java.io.Serializable>> queue_iterator_serializable3 = new edu.osu.cs362.Queue<java.util.Iterator<java.io.Serializable>>();
        boolean b4 = queue_iterator_serializable3.isEmpty();
        boolean b5 = queue_iterator_serializable3.isEmpty();
        java.util.Spliterator<java.util.Iterator<java.io.Serializable>> spliterator_iterator_serializable6 = queue_iterator_serializable3.spliterator();
        queue_iterable_iterator_serializable0.enqueue((java.lang.Iterable<java.util.Iterator<java.io.Serializable>>) queue_iterator_serializable3);
        java.util.Iterator<java.util.Iterator<java.io.Serializable>> iterator_iterator_serializable8 = queue_iterator_serializable3.iterator();
        try {
            java.util.Iterator<java.io.Serializable> iterator_serializable9 = queue_iterator_serializable3.peek();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException");
        } catch (java.util.NoSuchElementException e) {
        }
        org.junit.Assert.assertNotNull(iterator_iterable_iterator_serializable1);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertNotNull(spliterator_iterator_serializable6);
        org.junit.Assert.assertNotNull(iterator_iterator_serializable8);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        edu.osu.cs362.Queue<java.util.Spliterator<java.util.Iterator<java.io.Serializable>>> queue_spliterator_iterator_serializable0 = new edu.osu.cs362.Queue<java.util.Spliterator<java.util.Iterator<java.io.Serializable>>>();
        java.lang.String str1 = queue_spliterator_iterator_serializable0.toString();
        java.util.Iterator<java.util.Spliterator<java.util.Iterator<java.io.Serializable>>> iterator_spliterator_iterator_serializable2 = queue_spliterator_iterator_serializable0.iterator();
        try {
            java.util.Spliterator<java.util.Iterator<java.io.Serializable>> spliterator_iterator_serializable3 = queue_spliterator_iterator_serializable0.dequeue();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException");
        } catch (java.util.NoSuchElementException e) {
        }
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertNotNull(iterator_spliterator_iterator_serializable2);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>> queue_queue_iterable_iterator_serializable0 = new edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>();
        boolean b1 = queue_queue_iterable_iterator_serializable0.isEmpty();
        boolean b2 = queue_queue_iterable_iterator_serializable0.isEmpty();
        java.lang.String str3 = queue_queue_iterable_iterator_serializable0.toString();
        try {
            edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>> queue_iterable_iterator_serializable4 = queue_queue_iterable_iterator_serializable0.dequeue();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException");
        } catch (java.util.NoSuchElementException e) {
        }
        org.junit.Assert.assertTrue(b1 == true);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<edu.osu.cs362.Queue<java.io.Serializable>>>> queue_iterable_iterator_queue_serializable0 = new edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<edu.osu.cs362.Queue<java.io.Serializable>>>>();
        try {
            java.lang.Iterable<java.util.Iterator<edu.osu.cs362.Queue<java.io.Serializable>>> iterable_iterator_queue_serializable1 = queue_iterable_iterator_queue_serializable0.peek();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException");
        } catch (java.util.NoSuchElementException e) {
        }
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        edu.osu.cs362.Queue<java.lang.Iterable<java.lang.Iterable<java.lang.Iterable<java.lang.Object>>>> queue_iterable_iterable_iterable_obj0 = new edu.osu.cs362.Queue<java.lang.Iterable<java.lang.Iterable<java.lang.Iterable<java.lang.Object>>>>();
        java.util.Iterator<java.lang.Iterable<java.lang.Iterable<java.lang.Iterable<java.lang.Object>>>> iterator_iterable_iterable_iterable_obj1 = queue_iterable_iterable_iterable_obj0.iterator();
        int i2 = queue_iterable_iterable_iterable_obj0.size();
        int i3 = queue_iterable_iterable_iterable_obj0.size();
        edu.osu.cs362.Queue<java.lang.Iterable<java.lang.Iterable<java.lang.Object>>> queue_iterable_iterable_obj4 = new edu.osu.cs362.Queue<java.lang.Iterable<java.lang.Iterable<java.lang.Object>>>();
        boolean b5 = queue_iterable_iterable_obj4.isEmpty();
        java.lang.String str6 = queue_iterable_iterable_obj4.toString();
        queue_iterable_iterable_iterable_obj0.enqueue((java.lang.Iterable<java.lang.Iterable<java.lang.Iterable<java.lang.Object>>>) queue_iterable_iterable_obj4);
        java.lang.Iterable<java.lang.Iterable<java.lang.Iterable<java.lang.Object>>> iterable_iterable_iterable_obj8 = queue_iterable_iterable_iterable_obj0.dequeue();
        org.junit.Assert.assertNotNull(iterator_iterable_iterable_iterable_obj1);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertNotNull(iterable_iterable_iterable_obj8);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        edu.osu.cs362.Queue<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>> queue_iterable_queue_iterable_iterator_serializable0 = new edu.osu.cs362.Queue<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>();
        java.util.Spliterator<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>> spliterator_iterable_queue_iterable_iterator_serializable1 = queue_iterable_queue_iterable_iterator_serializable0.spliterator();
        java.util.Spliterator<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>> spliterator_iterable_queue_iterable_iterator_serializable2 = queue_iterable_queue_iterable_iterator_serializable0.spliterator();
        int i3 = queue_iterable_queue_iterable_iterator_serializable0.size();
        org.junit.Assert.assertNotNull(spliterator_iterable_queue_iterable_iterator_serializable1);
        org.junit.Assert.assertNotNull(spliterator_iterable_queue_iterable_iterator_serializable2);
        org.junit.Assert.assertTrue(i3 == 0);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        edu.osu.cs362.Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new edu.osu.cs362.Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.enqueue((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str3 = queue_comparable_str0.toString();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> iterator_comparable_str4 = queue_comparable_str0.iterator();
        boolean b5 = queue_comparable_str0.isEmpty();
        java.lang.Comparable<java.lang.String> comparable_str6 = queue_comparable_str0.dequeue();
        boolean b7 = queue_comparable_str0.isEmpty();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi! " + "'", str3.equals("hi! "));
        org.junit.Assert.assertNotNull(iterator_comparable_str4);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue("'" + comparable_str6 + "' != '" + "hi!" + "'", comparable_str6.equals("hi!"));
        org.junit.Assert.assertTrue(b7 == true);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.io.Serializable>> queue_queue_serializable0 = new edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.io.Serializable>>();
        java.util.Spliterator<edu.osu.cs362.Queue<java.io.Serializable>> spliterator_queue_serializable1 = queue_queue_serializable0.spliterator();
        java.lang.String str2 = queue_queue_serializable0.toString();
        java.util.Spliterator<edu.osu.cs362.Queue<java.io.Serializable>> spliterator_queue_serializable3 = queue_queue_serializable0.spliterator();
        try {
            edu.osu.cs362.Queue<java.io.Serializable> queue_serializable4 = queue_queue_serializable0.dequeue();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException");
        } catch (java.util.NoSuchElementException e) {
        }
        org.junit.Assert.assertNotNull(spliterator_queue_serializable1);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
        org.junit.Assert.assertNotNull(spliterator_queue_serializable3);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>> queue_iterable_iterator_serializable0 = new edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>();
        boolean b1 = queue_iterable_iterator_serializable0.isEmpty();
        java.lang.String str2 = queue_iterable_iterator_serializable0.toString();
        try {
            java.lang.Iterable<java.util.Iterator<java.io.Serializable>> iterable_iterator_serializable3 = queue_iterable_iterator_serializable0.dequeue();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException");
        } catch (java.util.NoSuchElementException e) {
        }
        org.junit.Assert.assertTrue(b1 == true);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>> queue_queue_iterable_iterator_serializable0 = new edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>();
        edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>> queue_iterable_iterator_serializable1 = new edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>();
        java.util.Iterator<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>> iterator_iterable_iterator_serializable2 = queue_iterable_iterator_serializable1.iterator();
        java.util.Spliterator<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>> spliterator_iterable_iterator_serializable3 = queue_iterable_iterator_serializable1.spliterator();
        queue_queue_iterable_iterator_serializable0.enqueue(queue_iterable_iterator_serializable1);
        edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>> queue_iterable_iterator_serializable5 = queue_queue_iterable_iterator_serializable0.dequeue();
        edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>> queue_iterable_iterator_serializable6 = new edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>();
        queue_queue_iterable_iterator_serializable0.enqueue(queue_iterable_iterator_serializable6);
        org.junit.Assert.assertNotNull(iterator_iterable_iterator_serializable2);
        org.junit.Assert.assertNotNull(spliterator_iterable_iterator_serializable3);
        org.junit.Assert.assertNotNull(queue_iterable_iterator_serializable5);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>> queue_queue_iterable_queue_iterable_iterator_serializable0 = new edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>();
        try {
            edu.osu.cs362.Queue<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>> queue_iterable_queue_iterable_iterator_serializable1 = queue_queue_iterable_queue_iterable_iterator_serializable0.dequeue();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException");
        } catch (java.util.NoSuchElementException e) {
        }
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        edu.osu.cs362.Queue<java.util.Spliterator<java.util.Iterator<java.io.Serializable>>> queue_spliterator_iterator_serializable0 = new edu.osu.cs362.Queue<java.util.Spliterator<java.util.Iterator<java.io.Serializable>>>();
        java.lang.String str1 = queue_spliterator_iterator_serializable0.toString();
        java.util.Spliterator<java.util.Spliterator<java.util.Iterator<java.io.Serializable>>> spliterator_spliterator_iterator_serializable2 = queue_spliterator_iterator_serializable0.spliterator();
        int i3 = queue_spliterator_iterator_serializable0.size();
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertNotNull(spliterator_spliterator_iterator_serializable2);
        org.junit.Assert.assertTrue(i3 == 0);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        edu.osu.cs362.Queue<java.lang.Iterable<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>> queue_iterable_iterable_iterator_serializable0 = new edu.osu.cs362.Queue<java.lang.Iterable<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>();
        java.util.Spliterator<java.lang.Iterable<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>> spliterator_iterable_iterable_iterator_serializable1 = queue_iterable_iterable_iterator_serializable0.spliterator();
        java.util.Spliterator<java.lang.Iterable<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>> spliterator_iterable_iterable_iterator_serializable2 = queue_iterable_iterable_iterator_serializable0.spliterator();
        org.junit.Assert.assertNotNull(spliterator_iterable_iterable_iterator_serializable1);
        org.junit.Assert.assertNotNull(spliterator_iterable_iterable_iterator_serializable2);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        edu.osu.cs362.Queue<java.util.Spliterator<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>> queue_spliterator_iterable_queue_iterable_iterator_serializable0 = new edu.osu.cs362.Queue<java.util.Spliterator<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>();
        boolean b1 = queue_spliterator_iterable_queue_iterable_iterator_serializable0.isEmpty();
        try {
            java.util.Spliterator<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>> spliterator_iterable_queue_iterable_iterator_serializable2 = queue_spliterator_iterable_queue_iterable_iterator_serializable0.peek();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException");
        } catch (java.util.NoSuchElementException e) {
        }
        org.junit.Assert.assertTrue(b1 == true);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        edu.osu.cs362.Queue<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>> queue_iterable_queue_iterable_iterator_serializable0 = new edu.osu.cs362.Queue<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>();
        java.util.Spliterator<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>> spliterator_iterable_queue_iterable_iterator_serializable1 = queue_iterable_queue_iterable_iterator_serializable0.spliterator();
        java.util.Spliterator<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>> spliterator_iterable_queue_iterable_iterator_serializable2 = queue_iterable_queue_iterable_iterator_serializable0.spliterator();
        java.lang.String str3 = queue_iterable_queue_iterable_iterator_serializable0.toString();
        java.util.Iterator<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>> iterator_iterable_queue_iterable_iterator_serializable4 = queue_iterable_queue_iterable_iterator_serializable0.iterator();
        try {
            java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>> iterable_queue_iterable_iterator_serializable5 = queue_iterable_queue_iterable_iterator_serializable0.dequeue();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException");
        } catch (java.util.NoSuchElementException e) {
        }
        org.junit.Assert.assertNotNull(spliterator_iterable_queue_iterable_iterator_serializable1);
        org.junit.Assert.assertNotNull(spliterator_iterable_queue_iterable_iterator_serializable2);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertNotNull(iterator_iterable_queue_iterable_iterator_serializable4);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.lang.Comparable<java.lang.String>>> queue_queue_comparable_str0 = new edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.lang.Comparable<java.lang.String>>>();
        try {
            edu.osu.cs362.Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str1 = queue_queue_comparable_str0.peek();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException");
        } catch (java.util.NoSuchElementException e) {
        }
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        edu.osu.cs362.Queue<java.util.Iterator<java.io.Serializable>> queue_iterator_serializable0 = new edu.osu.cs362.Queue<java.util.Iterator<java.io.Serializable>>();
        boolean b1 = queue_iterator_serializable0.isEmpty();
        edu.osu.cs362.Queue<java.io.Serializable> queue_serializable2 = new edu.osu.cs362.Queue<java.io.Serializable>();
        queue_serializable2.enqueue((java.io.Serializable) 1L);
        java.util.Iterator<java.io.Serializable> iterator_serializable5 = queue_serializable2.iterator();
        queue_iterator_serializable0.enqueue(iterator_serializable5);
        int i7 = queue_iterator_serializable0.size();
        java.util.Iterator<java.io.Serializable> iterator_serializable8 = queue_iterator_serializable0.peek();
        boolean b9 = queue_iterator_serializable0.isEmpty();
        edu.osu.cs362.Queue<java.io.Serializable> queue_serializable10 = new edu.osu.cs362.Queue<java.io.Serializable>();
        queue_serializable10.enqueue((java.io.Serializable) 1L);
        java.util.Iterator<java.io.Serializable> iterator_serializable13 = queue_serializable10.iterator();
        java.lang.String str14 = queue_serializable10.toString();
        java.util.Spliterator<java.io.Serializable> spliterator_serializable15 = queue_serializable10.spliterator();
        java.util.Iterator<java.io.Serializable> iterator_serializable16 = queue_serializable10.iterator();
        queue_iterator_serializable0.enqueue(iterator_serializable16);
        org.junit.Assert.assertTrue(b1 == true);
        org.junit.Assert.assertNotNull(iterator_serializable5);
        org.junit.Assert.assertTrue(i7 == 1);
        org.junit.Assert.assertNotNull(iterator_serializable8);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(iterator_serializable13);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "1 " + "'", str14.equals("1 "));
        org.junit.Assert.assertNotNull(spliterator_serializable15);
        org.junit.Assert.assertNotNull(iterator_serializable16);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        edu.osu.cs362.Queue<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>> queue_iterable_queue_iterable_iterator_serializable0 = new edu.osu.cs362.Queue<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>();
        java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>> iterable_queue_iterable_iterator_serializable1 = null;
        queue_iterable_queue_iterable_iterator_serializable0.enqueue(iterable_queue_iterable_iterator_serializable1);
        java.util.Iterator<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>> iterator_iterable_queue_iterable_iterator_serializable3 = queue_iterable_queue_iterable_iterator_serializable0.iterator();
        int i4 = queue_iterable_queue_iterable_iterator_serializable0.size();
        edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>> queue_queue_iterable_iterator_serializable5 = new edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>();
        boolean b6 = queue_queue_iterable_iterator_serializable5.isEmpty();
        boolean b7 = queue_queue_iterable_iterator_serializable5.isEmpty();
        boolean b8 = queue_queue_iterable_iterator_serializable5.isEmpty();
        int i9 = queue_queue_iterable_iterator_serializable5.size();
        int i10 = queue_queue_iterable_iterator_serializable5.size();
        queue_iterable_queue_iterable_iterator_serializable0.enqueue((java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>) queue_queue_iterable_iterator_serializable5);
        java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>> iterable_queue_iterable_iterator_serializable12 = queue_iterable_queue_iterable_iterator_serializable0.dequeue();
        java.util.Spliterator<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>> spliterator_iterable_queue_iterable_iterator_serializable13 = queue_iterable_queue_iterable_iterator_serializable0.spliterator();
        org.junit.Assert.assertNotNull(iterator_iterable_queue_iterable_iterator_serializable3);
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertTrue(i10 == 0);
        org.junit.Assert.assertNull(iterable_queue_iterable_iterator_serializable12);
        org.junit.Assert.assertNotNull(spliterator_iterable_queue_iterable_iterator_serializable13);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        edu.osu.cs362.Queue<java.util.Iterator<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>> queue_iterator_iterable_queue_iterable_iterator_serializable0 = new edu.osu.cs362.Queue<java.util.Iterator<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>();
        java.util.Iterator<java.util.Iterator<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>> iterator_iterator_iterable_queue_iterable_iterator_serializable1 = queue_iterator_iterable_queue_iterable_iterator_serializable0.iterator();
        java.util.Spliterator<java.util.Iterator<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>> spliterator_iterator_iterable_queue_iterable_iterator_serializable2 = queue_iterator_iterable_queue_iterable_iterator_serializable0.spliterator();
        try {
            java.util.Iterator<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>> iterator_iterable_queue_iterable_iterator_serializable3 = queue_iterator_iterable_queue_iterable_iterator_serializable0.peek();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException");
        } catch (java.util.NoSuchElementException e) {
        }
        org.junit.Assert.assertNotNull(iterator_iterator_iterable_queue_iterable_iterator_serializable1);
        org.junit.Assert.assertNotNull(spliterator_iterator_iterable_queue_iterable_iterator_serializable2);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        edu.osu.cs362.Queue<java.lang.Iterable<java.lang.Iterable<java.lang.Iterable<java.lang.Object>>>> queue_iterable_iterable_iterable_obj0 = new edu.osu.cs362.Queue<java.lang.Iterable<java.lang.Iterable<java.lang.Iterable<java.lang.Object>>>>();
        java.util.Iterator<java.lang.Iterable<java.lang.Iterable<java.lang.Iterable<java.lang.Object>>>> iterator_iterable_iterable_iterable_obj1 = queue_iterable_iterable_iterable_obj0.iterator();
        edu.osu.cs362.Queue<java.lang.Iterable<java.lang.Iterable<java.lang.Object>>> queue_iterable_iterable_obj2 = new edu.osu.cs362.Queue<java.lang.Iterable<java.lang.Iterable<java.lang.Object>>>();
        queue_iterable_iterable_iterable_obj0.enqueue((java.lang.Iterable<java.lang.Iterable<java.lang.Iterable<java.lang.Object>>>) queue_iterable_iterable_obj2);
        int i4 = queue_iterable_iterable_obj2.size();
        try {
            java.lang.Iterable<java.lang.Iterable<java.lang.Object>> iterable_iterable_obj5 = queue_iterable_iterable_obj2.peek();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException");
        } catch (java.util.NoSuchElementException e) {
        }
        org.junit.Assert.assertNotNull(iterator_iterable_iterable_iterable_obj1);
        org.junit.Assert.assertTrue(i4 == 0);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        edu.osu.cs362.Queue<java.util.Iterator<edu.osu.cs362.Queue<java.io.Serializable>>> queue_iterator_queue_serializable0 = new edu.osu.cs362.Queue<java.util.Iterator<edu.osu.cs362.Queue<java.io.Serializable>>>();
        int i1 = queue_iterator_queue_serializable0.size();
        java.util.Iterator<java.util.Iterator<edu.osu.cs362.Queue<java.io.Serializable>>> iterator_iterator_queue_serializable2 = queue_iterator_queue_serializable0.iterator();
        edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.io.Serializable>> queue_queue_serializable3 = new edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.io.Serializable>>();
        java.util.Spliterator<edu.osu.cs362.Queue<java.io.Serializable>> spliterator_queue_serializable4 = queue_queue_serializable3.spliterator();
        java.util.Iterator<edu.osu.cs362.Queue<java.io.Serializable>> iterator_queue_serializable5 = queue_queue_serializable3.iterator();
        queue_iterator_queue_serializable0.enqueue(iterator_queue_serializable5);
        java.lang.String str7 = queue_iterator_queue_serializable0.toString();
        boolean b8 = queue_iterator_queue_serializable0.isEmpty();
        boolean b9 = queue_iterator_queue_serializable0.isEmpty();
        java.util.Spliterator<java.util.Iterator<edu.osu.cs362.Queue<java.io.Serializable>>> spliterator_iterator_queue_serializable10 = queue_iterator_queue_serializable0.spliterator();
        java.util.Spliterator<java.util.Iterator<edu.osu.cs362.Queue<java.io.Serializable>>> spliterator_iterator_queue_serializable11 = queue_iterator_queue_serializable0.spliterator();
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertNotNull(iterator_iterator_queue_serializable2);
        org.junit.Assert.assertNotNull(spliterator_queue_serializable4);
        org.junit.Assert.assertNotNull(iterator_queue_serializable5);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(spliterator_iterator_queue_serializable10);
        org.junit.Assert.assertNotNull(spliterator_iterator_queue_serializable11);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        edu.osu.cs362.Queue<java.util.Spliterator<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>> queue_spliterator_iterable_queue_iterable_iterator_serializable0 = new edu.osu.cs362.Queue<java.util.Spliterator<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>();
        boolean b1 = queue_spliterator_iterable_queue_iterable_iterator_serializable0.isEmpty();
        java.util.Iterator<java.util.Spliterator<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>> iterator_spliterator_iterable_queue_iterable_iterator_serializable2 = queue_spliterator_iterable_queue_iterable_iterator_serializable0.iterator();
        org.junit.Assert.assertTrue(b1 == true);
        org.junit.Assert.assertNotNull(iterator_spliterator_iterable_queue_iterable_iterator_serializable2);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        edu.osu.cs362.Queue<java.lang.Iterable<java.lang.Iterable<java.lang.Iterable<java.lang.Object>>>> queue_iterable_iterable_iterable_obj0 = new edu.osu.cs362.Queue<java.lang.Iterable<java.lang.Iterable<java.lang.Iterable<java.lang.Object>>>>();
        java.util.Iterator<java.lang.Iterable<java.lang.Iterable<java.lang.Iterable<java.lang.Object>>>> iterator_iterable_iterable_iterable_obj1 = queue_iterable_iterable_iterable_obj0.iterator();
        edu.osu.cs362.Queue<java.lang.Iterable<java.lang.Iterable<java.lang.Object>>> queue_iterable_iterable_obj2 = new edu.osu.cs362.Queue<java.lang.Iterable<java.lang.Iterable<java.lang.Object>>>();
        queue_iterable_iterable_iterable_obj0.enqueue((java.lang.Iterable<java.lang.Iterable<java.lang.Iterable<java.lang.Object>>>) queue_iterable_iterable_obj2);
        int i4 = queue_iterable_iterable_obj2.size();
        int i5 = queue_iterable_iterable_obj2.size();
        org.junit.Assert.assertNotNull(iterator_iterable_iterable_iterable_obj1);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        edu.osu.cs362.Queue<java.util.Iterator<java.io.Serializable>> queue_iterator_serializable0 = new edu.osu.cs362.Queue<java.util.Iterator<java.io.Serializable>>();
        edu.osu.cs362.Queue<java.util.Iterator<java.io.Serializable>> queue_iterator_serializable1 = new edu.osu.cs362.Queue<java.util.Iterator<java.io.Serializable>>();
        boolean b2 = queue_iterator_serializable1.isEmpty();
        edu.osu.cs362.Queue<java.io.Serializable> queue_serializable3 = new edu.osu.cs362.Queue<java.io.Serializable>();
        queue_serializable3.enqueue((java.io.Serializable) 1L);
        java.io.Serializable serializable6 = queue_serializable3.peek();
        java.util.Iterator<java.io.Serializable> iterator_serializable7 = queue_serializable3.iterator();
        java.util.Iterator<java.io.Serializable> iterator_serializable8 = queue_serializable3.iterator();
        queue_iterator_serializable1.enqueue(iterator_serializable8);
        java.util.Iterator<java.io.Serializable> iterator_serializable10 = queue_iterator_serializable1.peek();
        java.util.Iterator<java.io.Serializable> iterator_serializable11 = queue_iterator_serializable1.dequeue();
        queue_iterator_serializable0.enqueue(iterator_serializable11);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue("'" + serializable6 + "' != '" + 1L + "'", serializable6.equals(1L));
        org.junit.Assert.assertNotNull(iterator_serializable7);
        org.junit.Assert.assertNotNull(iterator_serializable8);
        org.junit.Assert.assertNotNull(iterator_serializable10);
        org.junit.Assert.assertNotNull(iterator_serializable11);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        edu.osu.cs362.Queue<java.io.Serializable> queue_serializable0 = new edu.osu.cs362.Queue<java.io.Serializable>();
        queue_serializable0.enqueue((java.io.Serializable) 1L);
        java.io.Serializable serializable3 = queue_serializable0.peek();
        java.util.Iterator<java.io.Serializable> iterator_serializable4 = queue_serializable0.iterator();
        java.util.Iterator<java.io.Serializable> iterator_serializable5 = queue_serializable0.iterator();
        boolean b6 = queue_serializable0.isEmpty();
        int i7 = queue_serializable0.size();
        org.junit.Assert.assertTrue("'" + serializable3 + "' != '" + 1L + "'", serializable3.equals(1L));
        org.junit.Assert.assertNotNull(iterator_serializable4);
        org.junit.Assert.assertNotNull(iterator_serializable5);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(i7 == 1);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        edu.osu.cs362.Queue<java.util.Spliterator<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>> queue_spliterator_iterable_queue_iterable_iterator_serializable0 = new edu.osu.cs362.Queue<java.util.Spliterator<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>();
        boolean b1 = queue_spliterator_iterable_queue_iterable_iterator_serializable0.isEmpty();
        try {
            java.util.Spliterator<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>> spliterator_iterable_queue_iterable_iterator_serializable2 = queue_spliterator_iterable_queue_iterable_iterator_serializable0.dequeue();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException");
        } catch (java.util.NoSuchElementException e) {
        }
        org.junit.Assert.assertTrue(b1 == true);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        edu.osu.cs362.Queue<java.lang.Iterable<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>> queue_iterable_iterable_iterator_serializable0 = new edu.osu.cs362.Queue<java.lang.Iterable<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>();
        java.util.Iterator<java.lang.Iterable<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>> iterator_iterable_iterable_iterator_serializable1 = queue_iterable_iterable_iterator_serializable0.iterator();
        java.util.Spliterator<java.lang.Iterable<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>> spliterator_iterable_iterable_iterator_serializable2 = queue_iterable_iterable_iterator_serializable0.spliterator();
        try {
            java.lang.Iterable<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>> iterable_iterable_iterator_serializable3 = queue_iterable_iterable_iterator_serializable0.peek();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException");
        } catch (java.util.NoSuchElementException e) {
        }
        org.junit.Assert.assertNotNull(iterator_iterable_iterable_iterator_serializable1);
        org.junit.Assert.assertNotNull(spliterator_iterable_iterable_iterator_serializable2);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        edu.osu.cs362.Queue<edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.lang.Comparable<java.lang.String>>>> queue_queue_queue_comparable_str0 = new edu.osu.cs362.Queue<edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.lang.Comparable<java.lang.String>>>>();
        boolean b1 = queue_queue_queue_comparable_str0.isEmpty();
        try {
            edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.lang.Comparable<java.lang.String>>> queue_queue_comparable_str2 = queue_queue_queue_comparable_str0.dequeue();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException");
        } catch (java.util.NoSuchElementException e) {
        }
        org.junit.Assert.assertTrue(b1 == true);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        edu.osu.cs362.Queue<java.lang.Iterable<java.lang.Iterable<java.lang.Iterable<java.lang.Object>>>> queue_iterable_iterable_iterable_obj0 = new edu.osu.cs362.Queue<java.lang.Iterable<java.lang.Iterable<java.lang.Iterable<java.lang.Object>>>>();
        java.util.Spliterator<java.lang.Iterable<java.lang.Iterable<java.lang.Iterable<java.lang.Object>>>> spliterator_iterable_iterable_iterable_obj1 = queue_iterable_iterable_iterable_obj0.spliterator();
        java.util.Iterator<java.lang.Iterable<java.lang.Iterable<java.lang.Iterable<java.lang.Object>>>> iterator_iterable_iterable_iterable_obj2 = queue_iterable_iterable_iterable_obj0.iterator();
        boolean b3 = queue_iterable_iterable_iterable_obj0.isEmpty();
        org.junit.Assert.assertNotNull(spliterator_iterable_iterable_iterable_obj1);
        org.junit.Assert.assertNotNull(iterator_iterable_iterable_iterable_obj2);
        org.junit.Assert.assertTrue(b3 == true);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.io.Serializable>> queue_queue_serializable0 = new edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.io.Serializable>>();
        java.util.Iterator<edu.osu.cs362.Queue<java.io.Serializable>> iterator_queue_serializable1 = queue_queue_serializable0.iterator();
        try {
            edu.osu.cs362.Queue<java.io.Serializable> queue_serializable2 = queue_queue_serializable0.peek();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException");
        } catch (java.util.NoSuchElementException e) {
        }
        org.junit.Assert.assertNotNull(iterator_queue_serializable1);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        edu.osu.cs362.Queue<java.lang.Iterable<java.lang.Iterable<java.lang.Iterable<java.lang.Object>>>> queue_iterable_iterable_iterable_obj0 = new edu.osu.cs362.Queue<java.lang.Iterable<java.lang.Iterable<java.lang.Iterable<java.lang.Object>>>>();
        java.util.Iterator<java.lang.Iterable<java.lang.Iterable<java.lang.Iterable<java.lang.Object>>>> iterator_iterable_iterable_iterable_obj1 = queue_iterable_iterable_iterable_obj0.iterator();
        edu.osu.cs362.Queue<java.lang.Iterable<java.lang.Iterable<java.lang.Object>>> queue_iterable_iterable_obj2 = new edu.osu.cs362.Queue<java.lang.Iterable<java.lang.Iterable<java.lang.Object>>>();
        queue_iterable_iterable_iterable_obj0.enqueue((java.lang.Iterable<java.lang.Iterable<java.lang.Iterable<java.lang.Object>>>) queue_iterable_iterable_obj2);
        int i4 = queue_iterable_iterable_obj2.size();
        boolean b5 = queue_iterable_iterable_obj2.isEmpty();
        try {
            java.lang.Iterable<java.lang.Iterable<java.lang.Object>> iterable_iterable_obj6 = queue_iterable_iterable_obj2.dequeue();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException");
        } catch (java.util.NoSuchElementException e) {
        }
        org.junit.Assert.assertNotNull(iterator_iterable_iterable_iterable_obj1);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(b5 == true);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>> queue_iterable_iterator_serializable0 = new edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>();
        java.util.Iterator<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>> iterator_iterable_iterator_serializable1 = queue_iterable_iterator_serializable0.iterator();
        java.util.Spliterator<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>> spliterator_iterable_iterator_serializable2 = queue_iterable_iterator_serializable0.spliterator();
        java.util.Spliterator<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>> spliterator_iterable_iterator_serializable3 = queue_iterable_iterator_serializable0.spliterator();
        java.util.Spliterator<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>> spliterator_iterable_iterator_serializable4 = queue_iterable_iterator_serializable0.spliterator();
        org.junit.Assert.assertNotNull(iterator_iterable_iterator_serializable1);
        org.junit.Assert.assertNotNull(spliterator_iterable_iterator_serializable2);
        org.junit.Assert.assertNotNull(spliterator_iterable_iterator_serializable3);
        org.junit.Assert.assertNotNull(spliterator_iterable_iterator_serializable4);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        edu.osu.cs362.Queue<java.lang.Iterable<java.lang.Iterable<java.lang.Iterable<java.lang.Object>>>> queue_iterable_iterable_iterable_obj0 = new edu.osu.cs362.Queue<java.lang.Iterable<java.lang.Iterable<java.lang.Iterable<java.lang.Object>>>>();
        java.util.Iterator<java.lang.Iterable<java.lang.Iterable<java.lang.Iterable<java.lang.Object>>>> iterator_iterable_iterable_iterable_obj1 = queue_iterable_iterable_iterable_obj0.iterator();
        int i2 = queue_iterable_iterable_iterable_obj0.size();
        int i3 = queue_iterable_iterable_iterable_obj0.size();
        edu.osu.cs362.Queue<java.lang.Iterable<java.lang.Iterable<java.lang.Object>>> queue_iterable_iterable_obj4 = new edu.osu.cs362.Queue<java.lang.Iterable<java.lang.Iterable<java.lang.Object>>>();
        boolean b5 = queue_iterable_iterable_obj4.isEmpty();
        java.lang.String str6 = queue_iterable_iterable_obj4.toString();
        queue_iterable_iterable_iterable_obj0.enqueue((java.lang.Iterable<java.lang.Iterable<java.lang.Iterable<java.lang.Object>>>) queue_iterable_iterable_obj4);
        edu.osu.cs362.Queue<java.lang.Iterable<java.lang.Object>> queue_iterable_obj8 = new edu.osu.cs362.Queue<java.lang.Iterable<java.lang.Object>>();
        edu.osu.cs362.Queue<java.lang.Object> queue_obj9 = new edu.osu.cs362.Queue<java.lang.Object>();
        int i10 = queue_obj9.size();
        java.util.Spliterator<java.lang.Object> spliterator_obj11 = queue_obj9.spliterator();
        edu.osu.cs362.Queue<java.util.Iterator<java.io.Serializable>> queue_iterator_serializable12 = new edu.osu.cs362.Queue<java.util.Iterator<java.io.Serializable>>();
        boolean b13 = queue_iterator_serializable12.isEmpty();
        edu.osu.cs362.Queue<java.io.Serializable> queue_serializable14 = new edu.osu.cs362.Queue<java.io.Serializable>();
        queue_serializable14.enqueue((java.io.Serializable) 1L);
        java.util.Iterator<java.io.Serializable> iterator_serializable17 = queue_serializable14.iterator();
        queue_iterator_serializable12.enqueue(iterator_serializable17);
        int i19 = queue_iterator_serializable12.size();
        java.util.Iterator<java.io.Serializable> iterator_serializable20 = queue_iterator_serializable12.peek();
        boolean b21 = queue_iterator_serializable12.isEmpty();
        java.util.Iterator<java.io.Serializable> iterator_serializable22 = queue_iterator_serializable12.peek();
        queue_obj9.enqueue((java.lang.Object) queue_iterator_serializable12);
        queue_iterable_obj8.enqueue((java.lang.Iterable<java.lang.Object>) queue_obj9);
        queue_iterable_iterable_obj4.enqueue((java.lang.Iterable<java.lang.Iterable<java.lang.Object>>) queue_iterable_obj8);
        int i26 = queue_iterable_iterable_obj4.size();
        org.junit.Assert.assertNotNull(iterator_iterable_iterable_iterable_obj1);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue(i10 == 0);
        org.junit.Assert.assertNotNull(spliterator_obj11);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertNotNull(iterator_serializable17);
        org.junit.Assert.assertTrue(i19 == 1);
        org.junit.Assert.assertNotNull(iterator_serializable20);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertNotNull(iterator_serializable22);
        org.junit.Assert.assertTrue(i26 == 1);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        edu.osu.cs362.Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new edu.osu.cs362.Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.enqueue((java.lang.Comparable<java.lang.String>) "hi!");
        queue_comparable_str0.enqueue((java.lang.Comparable<java.lang.String>) "a ");
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        edu.osu.cs362.Queue<java.lang.Iterable<java.io.Serializable>> queue_iterable_serializable0 = new edu.osu.cs362.Queue<java.lang.Iterable<java.io.Serializable>>();
        try {
            java.lang.Iterable<java.io.Serializable> iterable_serializable1 = queue_iterable_serializable0.peek();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException");
        } catch (java.util.NoSuchElementException e) {
        }
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>> queue_iterable_iterator_iterable_queue_iterable_iterator_serializable0 = new edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>>();
        java.util.Spliterator<java.lang.Iterable<java.util.Iterator<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>> spliterator_iterable_iterator_iterable_queue_iterable_iterator_serializable1 = queue_iterable_iterator_iterable_queue_iterable_iterator_serializable0.spliterator();
        try {
            java.lang.Iterable<java.util.Iterator<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>> iterable_iterator_iterable_queue_iterable_iterator_serializable2 = queue_iterable_iterator_iterable_queue_iterable_iterator_serializable0.dequeue();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException");
        } catch (java.util.NoSuchElementException e) {
        }
        org.junit.Assert.assertNotNull(spliterator_iterable_iterator_iterable_queue_iterable_iterator_serializable1);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>> queue_queue_iterable_queue_iterable_iterator_serializable0 = new edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>();
        java.util.Spliterator<edu.osu.cs362.Queue<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>> spliterator_queue_iterable_queue_iterable_iterator_serializable1 = queue_queue_iterable_queue_iterable_iterator_serializable0.spliterator();
        try {
            edu.osu.cs362.Queue<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>> queue_iterable_queue_iterable_iterator_serializable2 = queue_queue_iterable_queue_iterable_iterator_serializable0.dequeue();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException");
        } catch (java.util.NoSuchElementException e) {
        }
        org.junit.Assert.assertNotNull(spliterator_queue_iterable_queue_iterable_iterator_serializable1);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        edu.osu.cs362.Queue<java.util.Iterator<java.io.Serializable>> queue_iterator_serializable0 = new edu.osu.cs362.Queue<java.util.Iterator<java.io.Serializable>>();
        boolean b1 = queue_iterator_serializable0.isEmpty();
        edu.osu.cs362.Queue<java.io.Serializable> queue_serializable2 = new edu.osu.cs362.Queue<java.io.Serializable>();
        queue_serializable2.enqueue((java.io.Serializable) 1L);
        java.io.Serializable serializable5 = queue_serializable2.peek();
        java.util.Iterator<java.io.Serializable> iterator_serializable6 = queue_serializable2.iterator();
        java.util.Iterator<java.io.Serializable> iterator_serializable7 = queue_serializable2.iterator();
        queue_iterator_serializable0.enqueue(iterator_serializable7);
        edu.osu.cs362.Queue<java.io.Serializable> queue_serializable9 = new edu.osu.cs362.Queue<java.io.Serializable>();
        queue_serializable9.enqueue((java.io.Serializable) 1L);
        java.io.Serializable serializable12 = queue_serializable9.peek();
        java.io.Serializable serializable13 = queue_serializable9.peek();
        queue_serializable9.enqueue((java.io.Serializable) (short) -1);
        java.io.Serializable serializable16 = queue_serializable9.peek();
        java.util.Iterator<java.io.Serializable> iterator_serializable17 = queue_serializable9.iterator();
        queue_iterator_serializable0.enqueue(iterator_serializable17);
        int i19 = queue_iterator_serializable0.size();
        int i20 = queue_iterator_serializable0.size();
        edu.osu.cs362.Queue<java.util.Iterator<java.io.Serializable>> queue_iterator_serializable21 = new edu.osu.cs362.Queue<java.util.Iterator<java.io.Serializable>>();
        boolean b22 = queue_iterator_serializable21.isEmpty();
        edu.osu.cs362.Queue<java.io.Serializable> queue_serializable23 = new edu.osu.cs362.Queue<java.io.Serializable>();
        queue_serializable23.enqueue((java.io.Serializable) 1L);
        java.util.Iterator<java.io.Serializable> iterator_serializable26 = queue_serializable23.iterator();
        queue_iterator_serializable21.enqueue(iterator_serializable26);
        int i28 = queue_iterator_serializable21.size();
        java.util.Iterator<java.io.Serializable> iterator_serializable29 = queue_iterator_serializable21.peek();
        queue_iterator_serializable0.enqueue(iterator_serializable29);
        boolean b31 = queue_iterator_serializable0.isEmpty();
        org.junit.Assert.assertTrue(b1 == true);
        org.junit.Assert.assertTrue("'" + serializable5 + "' != '" + 1L + "'", serializable5.equals(1L));
        org.junit.Assert.assertNotNull(iterator_serializable6);
        org.junit.Assert.assertNotNull(iterator_serializable7);
        org.junit.Assert.assertTrue("'" + serializable12 + "' != '" + 1L + "'", serializable12.equals(1L));
        org.junit.Assert.assertTrue("'" + serializable13 + "' != '" + 1L + "'", serializable13.equals(1L));
        org.junit.Assert.assertTrue("'" + serializable16 + "' != '" + 1L + "'", serializable16.equals(1L));
        org.junit.Assert.assertNotNull(iterator_serializable17);
        org.junit.Assert.assertTrue(i19 == 2);
        org.junit.Assert.assertTrue(i20 == 2);
        org.junit.Assert.assertTrue(b22 == true);
        org.junit.Assert.assertNotNull(iterator_serializable26);
        org.junit.Assert.assertTrue(i28 == 1);
        org.junit.Assert.assertNotNull(iterator_serializable29);
        org.junit.Assert.assertTrue(b31 == false);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        edu.osu.cs362.Queue<java.lang.Iterable<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>> queue_iterable_iterable_iterator_serializable0 = new edu.osu.cs362.Queue<java.lang.Iterable<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>();
        java.util.Iterator<java.lang.Iterable<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>> iterator_iterable_iterable_iterator_serializable1 = queue_iterable_iterable_iterator_serializable0.iterator();
        java.util.Spliterator<java.lang.Iterable<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>> spliterator_iterable_iterable_iterator_serializable2 = queue_iterable_iterable_iterator_serializable0.spliterator();
        edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>> queue_iterable_iterator_serializable3 = new edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>();
        java.util.Iterator<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>> iterator_iterable_iterator_serializable4 = queue_iterable_iterator_serializable3.iterator();
        java.util.Spliterator<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>> spliterator_iterable_iterator_serializable5 = queue_iterable_iterator_serializable3.spliterator();
        java.util.Spliterator<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>> spliterator_iterable_iterator_serializable6 = queue_iterable_iterator_serializable3.spliterator();
        int i7 = queue_iterable_iterator_serializable3.size();
        java.lang.String str8 = queue_iterable_iterator_serializable3.toString();
        java.util.Iterator<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>> iterator_iterable_iterator_serializable9 = queue_iterable_iterator_serializable3.iterator();
        edu.osu.cs362.Queue<java.util.Iterator<java.io.Serializable>> queue_iterator_serializable10 = new edu.osu.cs362.Queue<java.util.Iterator<java.io.Serializable>>();
        java.lang.String str11 = queue_iterator_serializable10.toString();
        int i12 = queue_iterator_serializable10.size();
        queue_iterable_iterator_serializable3.enqueue((java.lang.Iterable<java.util.Iterator<java.io.Serializable>>) queue_iterator_serializable10);
        boolean b14 = queue_iterable_iterator_serializable3.isEmpty();
        queue_iterable_iterable_iterator_serializable0.enqueue((java.lang.Iterable<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>) queue_iterable_iterator_serializable3);
        java.util.Spliterator<java.lang.Iterable<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>> spliterator_iterable_iterable_iterator_serializable16 = queue_iterable_iterable_iterator_serializable0.spliterator();
        org.junit.Assert.assertNotNull(iterator_iterable_iterable_iterator_serializable1);
        org.junit.Assert.assertNotNull(spliterator_iterable_iterable_iterator_serializable2);
        org.junit.Assert.assertNotNull(iterator_iterable_iterator_serializable4);
        org.junit.Assert.assertNotNull(spliterator_iterable_iterator_serializable5);
        org.junit.Assert.assertNotNull(spliterator_iterable_iterator_serializable6);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertNotNull(iterator_iterable_iterator_serializable9);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNotNull(spliterator_iterable_iterable_iterator_serializable16);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.io.Serializable>> queue_queue_serializable0 = new edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.io.Serializable>>();
        java.util.Spliterator<edu.osu.cs362.Queue<java.io.Serializable>> spliterator_queue_serializable1 = queue_queue_serializable0.spliterator();
        java.lang.String str2 = queue_queue_serializable0.toString();
        java.util.Spliterator<edu.osu.cs362.Queue<java.io.Serializable>> spliterator_queue_serializable3 = queue_queue_serializable0.spliterator();
        int i4 = queue_queue_serializable0.size();
        org.junit.Assert.assertNotNull(spliterator_queue_serializable1);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
        org.junit.Assert.assertNotNull(spliterator_queue_serializable3);
        org.junit.Assert.assertTrue(i4 == 0);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        edu.osu.cs362.Queue<java.io.Serializable> queue_serializable0 = new edu.osu.cs362.Queue<java.io.Serializable>();
        queue_serializable0.enqueue((java.io.Serializable) 1L);
        java.io.Serializable serializable3 = queue_serializable0.peek();
        java.io.Serializable serializable4 = queue_serializable0.peek();
        queue_serializable0.enqueue((java.io.Serializable) (short) -1);
        java.io.Serializable serializable7 = queue_serializable0.peek();
        java.util.Iterator<java.io.Serializable> iterator_serializable8 = queue_serializable0.iterator();
        java.util.Spliterator<java.io.Serializable> spliterator_serializable9 = queue_serializable0.spliterator();
        org.junit.Assert.assertTrue("'" + serializable3 + "' != '" + 1L + "'", serializable3.equals(1L));
        org.junit.Assert.assertTrue("'" + serializable4 + "' != '" + 1L + "'", serializable4.equals(1L));
        org.junit.Assert.assertTrue("'" + serializable7 + "' != '" + 1L + "'", serializable7.equals(1L));
        org.junit.Assert.assertNotNull(iterator_serializable8);
        org.junit.Assert.assertNotNull(spliterator_serializable9);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        edu.osu.cs362.Queue<java.util.Iterator<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>> queue_iterator_iterable_queue_iterable_iterator_serializable0 = new edu.osu.cs362.Queue<java.util.Iterator<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>();
        try {
            java.util.Iterator<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>> iterator_iterable_queue_iterable_iterator_serializable1 = queue_iterator_iterable_queue_iterable_iterator_serializable0.peek();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException");
        } catch (java.util.NoSuchElementException e) {
        }
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        edu.osu.cs362.Queue<java.util.Iterator<edu.osu.cs362.Queue<java.io.Serializable>>> queue_iterator_queue_serializable0 = new edu.osu.cs362.Queue<java.util.Iterator<edu.osu.cs362.Queue<java.io.Serializable>>>();
        int i1 = queue_iterator_queue_serializable0.size();
        java.util.Iterator<java.util.Iterator<edu.osu.cs362.Queue<java.io.Serializable>>> iterator_iterator_queue_serializable2 = queue_iterator_queue_serializable0.iterator();
        try {
            java.util.Iterator<edu.osu.cs362.Queue<java.io.Serializable>> iterator_queue_serializable3 = queue_iterator_queue_serializable0.peek();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException");
        } catch (java.util.NoSuchElementException e) {
        }
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertNotNull(iterator_iterator_queue_serializable2);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.lang.Object>>> queue_iterable_iterator_obj0 = new edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.lang.Object>>>();
        edu.osu.cs362.Queue<java.util.Iterator<java.lang.Object>> queue_iterator_obj1 = new edu.osu.cs362.Queue<java.util.Iterator<java.lang.Object>>();
        queue_iterable_iterator_obj0.enqueue((java.lang.Iterable<java.util.Iterator<java.lang.Object>>) queue_iterator_obj1);
        int i3 = queue_iterable_iterator_obj0.size();
        boolean b4 = queue_iterable_iterator_obj0.isEmpty();
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue(b4 == false);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        edu.osu.cs362.Queue<java.lang.Iterable<java.lang.Iterable<java.lang.Iterable<java.lang.Object>>>> queue_iterable_iterable_iterable_obj0 = new edu.osu.cs362.Queue<java.lang.Iterable<java.lang.Iterable<java.lang.Iterable<java.lang.Object>>>>();
        java.util.Iterator<java.lang.Iterable<java.lang.Iterable<java.lang.Iterable<java.lang.Object>>>> iterator_iterable_iterable_iterable_obj1 = queue_iterable_iterable_iterable_obj0.iterator();
        int i2 = queue_iterable_iterable_iterable_obj0.size();
        int i3 = queue_iterable_iterable_iterable_obj0.size();
        java.util.Spliterator<java.lang.Iterable<java.lang.Iterable<java.lang.Iterable<java.lang.Object>>>> spliterator_iterable_iterable_iterable_obj4 = queue_iterable_iterable_iterable_obj0.spliterator();
        edu.osu.cs362.Queue<java.lang.Iterable<java.lang.Iterable<java.lang.Iterable<java.lang.Object>>>> queue_iterable_iterable_iterable_obj5 = new edu.osu.cs362.Queue<java.lang.Iterable<java.lang.Iterable<java.lang.Iterable<java.lang.Object>>>>();
        java.util.Iterator<java.lang.Iterable<java.lang.Iterable<java.lang.Iterable<java.lang.Object>>>> iterator_iterable_iterable_iterable_obj6 = queue_iterable_iterable_iterable_obj5.iterator();
        edu.osu.cs362.Queue<java.lang.Iterable<java.lang.Iterable<java.lang.Object>>> queue_iterable_iterable_obj7 = new edu.osu.cs362.Queue<java.lang.Iterable<java.lang.Iterable<java.lang.Object>>>();
        queue_iterable_iterable_iterable_obj5.enqueue((java.lang.Iterable<java.lang.Iterable<java.lang.Iterable<java.lang.Object>>>) queue_iterable_iterable_obj7);
        int i9 = queue_iterable_iterable_obj7.size();
        boolean b10 = queue_iterable_iterable_obj7.isEmpty();
        boolean b11 = queue_iterable_iterable_obj7.isEmpty();
        queue_iterable_iterable_iterable_obj0.enqueue((java.lang.Iterable<java.lang.Iterable<java.lang.Iterable<java.lang.Object>>>) queue_iterable_iterable_obj7);
        java.lang.Iterable<java.lang.Iterable<java.lang.Iterable<java.lang.Object>>> iterable_iterable_iterable_obj13 = queue_iterable_iterable_iterable_obj0.peek();
        java.util.Spliterator<java.lang.Iterable<java.lang.Iterable<java.lang.Object>>> spliterator_iterable_iterable_obj14 = iterable_iterable_iterable_obj13.spliterator();
        org.junit.Assert.assertNotNull(iterator_iterable_iterable_iterable_obj1);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertNotNull(spliterator_iterable_iterable_iterable_obj4);
        org.junit.Assert.assertNotNull(iterator_iterable_iterable_iterable_obj6);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertNotNull(iterable_iterable_iterable_obj13);
        org.junit.Assert.assertNotNull(spliterator_iterable_iterable_obj14);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        edu.osu.cs362.Queue<edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.lang.Comparable<java.lang.String>>>> queue_queue_queue_comparable_str0 = new edu.osu.cs362.Queue<edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.lang.Comparable<java.lang.String>>>>();
        edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.lang.Comparable<java.lang.String>>> queue_queue_comparable_str1 = new edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.lang.Comparable<java.lang.String>>>();
        edu.osu.cs362.Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str2 = new edu.osu.cs362.Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str2.enqueue((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str5 = queue_comparable_str2.dequeue();
        queue_queue_comparable_str1.enqueue(queue_comparable_str2);
        queue_queue_queue_comparable_str0.enqueue(queue_queue_comparable_str1);
        java.lang.String str8 = queue_queue_comparable_str1.toString();
        java.util.Spliterator<edu.osu.cs362.Queue<java.lang.Comparable<java.lang.String>>> spliterator_queue_comparable_str9 = queue_queue_comparable_str1.spliterator();
        org.junit.Assert.assertTrue("'" + comparable_str5 + "' != '" + "hi!" + "'", comparable_str5.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + " " + "'", str8.equals(" "));
        org.junit.Assert.assertNotNull(spliterator_queue_comparable_str9);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        edu.osu.cs362.Queue<java.io.Serializable> queue_serializable0 = new edu.osu.cs362.Queue<java.io.Serializable>();
        queue_serializable0.enqueue((java.io.Serializable) 1L);
        java.io.Serializable serializable3 = queue_serializable0.peek();
        java.util.Iterator<java.io.Serializable> iterator_serializable4 = queue_serializable0.iterator();
        java.io.Serializable serializable5 = queue_serializable0.peek();
        queue_serializable0.enqueue((java.io.Serializable) "1  ");
        org.junit.Assert.assertTrue("'" + serializable3 + "' != '" + 1L + "'", serializable3.equals(1L));
        org.junit.Assert.assertNotNull(iterator_serializable4);
        org.junit.Assert.assertTrue("'" + serializable5 + "' != '" + 1L + "'", serializable5.equals(1L));
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        edu.osu.cs362.Queue<java.lang.Iterable<java.lang.Iterable<java.lang.Object>>> queue_iterable_iterable_obj0 = new edu.osu.cs362.Queue<java.lang.Iterable<java.lang.Iterable<java.lang.Object>>>();
        int i1 = queue_iterable_iterable_obj0.size();
        java.util.Spliterator<java.lang.Iterable<java.lang.Iterable<java.lang.Object>>> spliterator_iterable_iterable_obj2 = queue_iterable_iterable_obj0.spliterator();
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertNotNull(spliterator_iterable_iterable_obj2);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        edu.osu.cs362.Queue<java.lang.Iterable<java.lang.Iterable<java.lang.Iterable<java.lang.Object>>>> queue_iterable_iterable_iterable_obj0 = new edu.osu.cs362.Queue<java.lang.Iterable<java.lang.Iterable<java.lang.Iterable<java.lang.Object>>>>();
        java.util.Iterator<java.lang.Iterable<java.lang.Iterable<java.lang.Iterable<java.lang.Object>>>> iterator_iterable_iterable_iterable_obj1 = queue_iterable_iterable_iterable_obj0.iterator();
        boolean b2 = queue_iterable_iterable_iterable_obj0.isEmpty();
        java.util.Iterator<java.lang.Iterable<java.lang.Iterable<java.lang.Iterable<java.lang.Object>>>> iterator_iterable_iterable_iterable_obj3 = queue_iterable_iterable_iterable_obj0.iterator();
        try {
            java.lang.Iterable<java.lang.Iterable<java.lang.Iterable<java.lang.Object>>> iterable_iterable_iterable_obj4 = queue_iterable_iterable_iterable_obj0.peek();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException");
        } catch (java.util.NoSuchElementException e) {
        }
        org.junit.Assert.assertNotNull(iterator_iterable_iterable_iterable_obj1);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNotNull(iterator_iterable_iterable_iterable_obj3);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        edu.osu.cs362.Queue<java.util.Iterator<edu.osu.cs362.Queue<java.io.Serializable>>> queue_iterator_queue_serializable0 = new edu.osu.cs362.Queue<java.util.Iterator<edu.osu.cs362.Queue<java.io.Serializable>>>();
        int i1 = queue_iterator_queue_serializable0.size();
        java.util.Iterator<java.util.Iterator<edu.osu.cs362.Queue<java.io.Serializable>>> iterator_iterator_queue_serializable2 = queue_iterator_queue_serializable0.iterator();
        edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.io.Serializable>> queue_queue_serializable3 = new edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.io.Serializable>>();
        java.util.Spliterator<edu.osu.cs362.Queue<java.io.Serializable>> spliterator_queue_serializable4 = queue_queue_serializable3.spliterator();
        java.util.Iterator<edu.osu.cs362.Queue<java.io.Serializable>> iterator_queue_serializable5 = queue_queue_serializable3.iterator();
        queue_iterator_queue_serializable0.enqueue(iterator_queue_serializable5);
        java.lang.String str7 = queue_iterator_queue_serializable0.toString();
        java.util.Iterator<java.util.Iterator<edu.osu.cs362.Queue<java.io.Serializable>>> iterator_iterator_queue_serializable8 = queue_iterator_queue_serializable0.iterator();
        java.util.Iterator<edu.osu.cs362.Queue<java.io.Serializable>> iterator_queue_serializable9 = queue_iterator_queue_serializable0.peek();
        java.util.Iterator<edu.osu.cs362.Queue<java.io.Serializable>> iterator_queue_serializable10 = queue_iterator_queue_serializable0.peek();
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertNotNull(iterator_iterator_queue_serializable2);
        org.junit.Assert.assertNotNull(spliterator_queue_serializable4);
        org.junit.Assert.assertNotNull(iterator_queue_serializable5);
        org.junit.Assert.assertNotNull(iterator_iterator_queue_serializable8);
        org.junit.Assert.assertNotNull(iterator_queue_serializable9);
        org.junit.Assert.assertNotNull(iterator_queue_serializable10);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        edu.osu.cs362.Queue<java.util.Spliterator<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>> queue_spliterator_iterable_queue_iterable_iterator_serializable0 = new edu.osu.cs362.Queue<java.util.Spliterator<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>();
        try {
            java.util.Spliterator<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>> spliterator_iterable_queue_iterable_iterator_serializable1 = queue_spliterator_iterable_queue_iterable_iterator_serializable0.peek();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException");
        } catch (java.util.NoSuchElementException e) {
        }
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        edu.osu.cs362.Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new edu.osu.cs362.Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.enqueue((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str3 = queue_comparable_str0.toString();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> spliterator_comparable_str4 = queue_comparable_str0.spliterator();
        queue_comparable_str0.enqueue((java.lang.Comparable<java.lang.String>) "hi! ");
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> spliterator_comparable_str7 = queue_comparable_str0.spliterator();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi! " + "'", str3.equals("hi! "));
        org.junit.Assert.assertNotNull(spliterator_comparable_str4);
        org.junit.Assert.assertNotNull(spliterator_comparable_str7);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        edu.osu.cs362.Queue<java.lang.Iterable<java.lang.Iterable<java.lang.Iterable<java.lang.Object>>>> queue_iterable_iterable_iterable_obj0 = new edu.osu.cs362.Queue<java.lang.Iterable<java.lang.Iterable<java.lang.Iterable<java.lang.Object>>>>();
        java.util.Iterator<java.lang.Iterable<java.lang.Iterable<java.lang.Iterable<java.lang.Object>>>> iterator_iterable_iterable_iterable_obj1 = queue_iterable_iterable_iterable_obj0.iterator();
        edu.osu.cs362.Queue<java.lang.Iterable<java.lang.Iterable<java.lang.Object>>> queue_iterable_iterable_obj2 = new edu.osu.cs362.Queue<java.lang.Iterable<java.lang.Iterable<java.lang.Object>>>();
        queue_iterable_iterable_iterable_obj0.enqueue((java.lang.Iterable<java.lang.Iterable<java.lang.Iterable<java.lang.Object>>>) queue_iterable_iterable_obj2);
        int i4 = queue_iterable_iterable_iterable_obj0.size();
        int i5 = queue_iterable_iterable_iterable_obj0.size();
        int i6 = queue_iterable_iterable_iterable_obj0.size();
        boolean b7 = queue_iterable_iterable_iterable_obj0.isEmpty();
        org.junit.Assert.assertNotNull(iterator_iterable_iterable_iterable_obj1);
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertTrue(i5 == 1);
        org.junit.Assert.assertTrue(i6 == 1);
        org.junit.Assert.assertTrue(b7 == false);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        edu.osu.cs362.Queue<java.util.Iterator<java.io.Serializable>> queue_iterator_serializable0 = new edu.osu.cs362.Queue<java.util.Iterator<java.io.Serializable>>();
        boolean b1 = queue_iterator_serializable0.isEmpty();
        edu.osu.cs362.Queue<java.io.Serializable> queue_serializable2 = new edu.osu.cs362.Queue<java.io.Serializable>();
        queue_serializable2.enqueue((java.io.Serializable) 1L);
        java.util.Iterator<java.io.Serializable> iterator_serializable5 = queue_serializable2.iterator();
        queue_iterator_serializable0.enqueue(iterator_serializable5);
        java.util.Spliterator<java.util.Iterator<java.io.Serializable>> spliterator_iterator_serializable7 = queue_iterator_serializable0.spliterator();
        edu.osu.cs362.Queue<java.util.Iterator<java.io.Serializable>> queue_iterator_serializable8 = new edu.osu.cs362.Queue<java.util.Iterator<java.io.Serializable>>();
        boolean b9 = queue_iterator_serializable8.isEmpty();
        edu.osu.cs362.Queue<java.io.Serializable> queue_serializable10 = new edu.osu.cs362.Queue<java.io.Serializable>();
        queue_serializable10.enqueue((java.io.Serializable) 1L);
        java.io.Serializable serializable13 = queue_serializable10.peek();
        java.util.Iterator<java.io.Serializable> iterator_serializable14 = queue_serializable10.iterator();
        java.util.Iterator<java.io.Serializable> iterator_serializable15 = queue_serializable10.iterator();
        queue_iterator_serializable8.enqueue(iterator_serializable15);
        edu.osu.cs362.Queue<java.io.Serializable> queue_serializable17 = new edu.osu.cs362.Queue<java.io.Serializable>();
        queue_serializable17.enqueue((java.io.Serializable) 1L);
        java.io.Serializable serializable20 = queue_serializable17.peek();
        java.io.Serializable serializable21 = queue_serializable17.peek();
        queue_serializable17.enqueue((java.io.Serializable) (short) -1);
        java.io.Serializable serializable24 = queue_serializable17.peek();
        java.util.Iterator<java.io.Serializable> iterator_serializable25 = queue_serializable17.iterator();
        queue_iterator_serializable8.enqueue(iterator_serializable25);
        int i27 = queue_iterator_serializable8.size();
        int i28 = queue_iterator_serializable8.size();
        edu.osu.cs362.Queue<java.util.Iterator<java.io.Serializable>> queue_iterator_serializable29 = new edu.osu.cs362.Queue<java.util.Iterator<java.io.Serializable>>();
        boolean b30 = queue_iterator_serializable29.isEmpty();
        edu.osu.cs362.Queue<java.io.Serializable> queue_serializable31 = new edu.osu.cs362.Queue<java.io.Serializable>();
        queue_serializable31.enqueue((java.io.Serializable) 1L);
        java.util.Iterator<java.io.Serializable> iterator_serializable34 = queue_serializable31.iterator();
        queue_iterator_serializable29.enqueue(iterator_serializable34);
        int i36 = queue_iterator_serializable29.size();
        java.util.Iterator<java.io.Serializable> iterator_serializable37 = queue_iterator_serializable29.peek();
        queue_iterator_serializable8.enqueue(iterator_serializable37);
        queue_iterator_serializable0.enqueue(iterator_serializable37);
        org.junit.Assert.assertTrue(b1 == true);
        org.junit.Assert.assertNotNull(iterator_serializable5);
        org.junit.Assert.assertNotNull(spliterator_iterator_serializable7);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertTrue("'" + serializable13 + "' != '" + 1L + "'", serializable13.equals(1L));
        org.junit.Assert.assertNotNull(iterator_serializable14);
        org.junit.Assert.assertNotNull(iterator_serializable15);
        org.junit.Assert.assertTrue("'" + serializable20 + "' != '" + 1L + "'", serializable20.equals(1L));
        org.junit.Assert.assertTrue("'" + serializable21 + "' != '" + 1L + "'", serializable21.equals(1L));
        org.junit.Assert.assertTrue("'" + serializable24 + "' != '" + 1L + "'", serializable24.equals(1L));
        org.junit.Assert.assertNotNull(iterator_serializable25);
        org.junit.Assert.assertTrue(i27 == 2);
        org.junit.Assert.assertTrue(i28 == 2);
        org.junit.Assert.assertTrue(b30 == true);
        org.junit.Assert.assertNotNull(iterator_serializable34);
        org.junit.Assert.assertTrue(i36 == 1);
        org.junit.Assert.assertNotNull(iterator_serializable37);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        edu.osu.cs362.Queue<java.util.Spliterator<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>> queue_spliterator_iterable_queue_iterable_iterator_serializable0 = new edu.osu.cs362.Queue<java.util.Spliterator<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>();
        edu.osu.cs362.Queue<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>> queue_iterable_queue_iterable_iterator_serializable1 = new edu.osu.cs362.Queue<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>();
        java.util.Spliterator<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>> spliterator_iterable_queue_iterable_iterator_serializable2 = queue_iterable_queue_iterable_iterator_serializable1.spliterator();
        queue_spliterator_iterable_queue_iterable_iterator_serializable0.enqueue(spliterator_iterable_queue_iterable_iterator_serializable2);
        java.util.Spliterator<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>> spliterator_iterable_queue_iterable_iterator_serializable4 = null;
        queue_spliterator_iterable_queue_iterable_iterator_serializable0.enqueue(spliterator_iterable_queue_iterable_iterator_serializable4);
        org.junit.Assert.assertNotNull(spliterator_iterable_queue_iterable_iterator_serializable2);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<edu.osu.cs362.Queue<java.io.Serializable>>>> queue_iterable_iterator_queue_serializable0 = new edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<edu.osu.cs362.Queue<java.io.Serializable>>>>();
        java.lang.String str1 = queue_iterable_iterator_queue_serializable0.toString();
        try {
            java.lang.Iterable<java.util.Iterator<edu.osu.cs362.Queue<java.io.Serializable>>> iterable_iterator_queue_serializable2 = queue_iterable_iterator_queue_serializable0.peek();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException");
        } catch (java.util.NoSuchElementException e) {
        }
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        edu.osu.cs362.Queue<java.lang.Iterable<java.lang.Iterable<java.lang.Iterable<java.lang.Object>>>> queue_iterable_iterable_iterable_obj0 = new edu.osu.cs362.Queue<java.lang.Iterable<java.lang.Iterable<java.lang.Iterable<java.lang.Object>>>>();
        java.util.Iterator<java.lang.Iterable<java.lang.Iterable<java.lang.Iterable<java.lang.Object>>>> iterator_iterable_iterable_iterable_obj1 = queue_iterable_iterable_iterable_obj0.iterator();
        edu.osu.cs362.Queue<java.lang.Iterable<java.lang.Iterable<java.lang.Object>>> queue_iterable_iterable_obj2 = new edu.osu.cs362.Queue<java.lang.Iterable<java.lang.Iterable<java.lang.Object>>>();
        queue_iterable_iterable_iterable_obj0.enqueue((java.lang.Iterable<java.lang.Iterable<java.lang.Iterable<java.lang.Object>>>) queue_iterable_iterable_obj2);
        int i4 = queue_iterable_iterable_obj2.size();
        boolean b5 = queue_iterable_iterable_obj2.isEmpty();
        boolean b6 = queue_iterable_iterable_obj2.isEmpty();
        java.util.Iterator<java.lang.Iterable<java.lang.Iterable<java.lang.Object>>> iterator_iterable_iterable_obj7 = queue_iterable_iterable_obj2.iterator();
        org.junit.Assert.assertNotNull(iterator_iterable_iterable_iterable_obj1);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertNotNull(iterator_iterable_iterable_obj7);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        edu.osu.cs362.Queue<java.lang.Iterable<java.lang.Iterable<java.lang.Iterable<java.lang.Object>>>> queue_iterable_iterable_iterable_obj0 = new edu.osu.cs362.Queue<java.lang.Iterable<java.lang.Iterable<java.lang.Iterable<java.lang.Object>>>>();
        java.util.Iterator<java.lang.Iterable<java.lang.Iterable<java.lang.Iterable<java.lang.Object>>>> iterator_iterable_iterable_iterable_obj1 = queue_iterable_iterable_iterable_obj0.iterator();
        edu.osu.cs362.Queue<java.lang.Iterable<java.lang.Iterable<java.lang.Object>>> queue_iterable_iterable_obj2 = new edu.osu.cs362.Queue<java.lang.Iterable<java.lang.Iterable<java.lang.Object>>>();
        queue_iterable_iterable_iterable_obj0.enqueue((java.lang.Iterable<java.lang.Iterable<java.lang.Iterable<java.lang.Object>>>) queue_iterable_iterable_obj2);
        int i4 = queue_iterable_iterable_obj2.size();
        boolean b5 = queue_iterable_iterable_obj2.isEmpty();
        java.util.Iterator<java.lang.Iterable<java.lang.Iterable<java.lang.Object>>> iterator_iterable_iterable_obj6 = queue_iterable_iterable_obj2.iterator();
        int i7 = queue_iterable_iterable_obj2.size();
        java.lang.String str8 = queue_iterable_iterable_obj2.toString();
        org.junit.Assert.assertNotNull(iterator_iterable_iterable_iterable_obj1);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertNotNull(iterator_iterable_iterable_obj6);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        edu.osu.cs362.Queue<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>> queue_iterable_queue_iterable_queue_iterable_iterator_serializable0 = new edu.osu.cs362.Queue<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>>();
        boolean b1 = queue_iterable_queue_iterable_queue_iterable_iterator_serializable0.isEmpty();
        try {
            java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>> iterable_queue_iterable_queue_iterable_iterator_serializable2 = queue_iterable_queue_iterable_queue_iterable_iterator_serializable0.dequeue();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException");
        } catch (java.util.NoSuchElementException e) {
        }
        org.junit.Assert.assertTrue(b1 == true);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        edu.osu.cs362.Queue<java.util.Iterator<java.lang.Object>> queue_iterator_obj0 = new edu.osu.cs362.Queue<java.util.Iterator<java.lang.Object>>();
        try {
            java.util.Iterator<java.lang.Object> iterator_obj1 = queue_iterator_obj0.dequeue();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException");
        } catch (java.util.NoSuchElementException e) {
        }
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        edu.osu.cs362.Queue<java.util.Iterator<edu.osu.cs362.Queue<java.io.Serializable>>> queue_iterator_queue_serializable0 = new edu.osu.cs362.Queue<java.util.Iterator<edu.osu.cs362.Queue<java.io.Serializable>>>();
        int i1 = queue_iterator_queue_serializable0.size();
        java.util.Iterator<java.util.Iterator<edu.osu.cs362.Queue<java.io.Serializable>>> iterator_iterator_queue_serializable2 = queue_iterator_queue_serializable0.iterator();
        edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.io.Serializable>> queue_queue_serializable3 = new edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.io.Serializable>>();
        java.util.Spliterator<edu.osu.cs362.Queue<java.io.Serializable>> spliterator_queue_serializable4 = queue_queue_serializable3.spliterator();
        java.util.Iterator<edu.osu.cs362.Queue<java.io.Serializable>> iterator_queue_serializable5 = queue_queue_serializable3.iterator();
        queue_iterator_queue_serializable0.enqueue(iterator_queue_serializable5);
        java.util.Spliterator<java.util.Iterator<edu.osu.cs362.Queue<java.io.Serializable>>> spliterator_iterator_queue_serializable7 = queue_iterator_queue_serializable0.spliterator();
        java.util.Iterator<edu.osu.cs362.Queue<java.io.Serializable>> iterator_queue_serializable8 = queue_iterator_queue_serializable0.dequeue();
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertNotNull(iterator_iterator_queue_serializable2);
        org.junit.Assert.assertNotNull(spliterator_queue_serializable4);
        org.junit.Assert.assertNotNull(iterator_queue_serializable5);
        org.junit.Assert.assertNotNull(spliterator_iterator_queue_serializable7);
        org.junit.Assert.assertNotNull(iterator_queue_serializable8);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>> queue_iterable_iterator_iterable_queue_iterable_iterator_serializable0 = new edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>>();
        int i1 = queue_iterable_iterator_iterable_queue_iterable_iterator_serializable0.size();
        int i2 = queue_iterable_iterator_iterable_queue_iterable_iterator_serializable0.size();
        try {
            java.lang.Iterable<java.util.Iterator<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>> iterable_iterator_iterable_queue_iterable_iterator_serializable3 = queue_iterable_iterator_iterable_queue_iterable_iterator_serializable0.dequeue();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException");
        } catch (java.util.NoSuchElementException e) {
        }
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        edu.osu.cs362.Queue<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>> queue_iterable_queue_iterable_iterator_serializable0 = new edu.osu.cs362.Queue<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>();
        java.util.Spliterator<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>> spliterator_iterable_queue_iterable_iterator_serializable1 = queue_iterable_queue_iterable_iterator_serializable0.spliterator();
        java.util.Spliterator<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>> spliterator_iterable_queue_iterable_iterator_serializable2 = queue_iterable_queue_iterable_iterator_serializable0.spliterator();
        java.lang.String str3 = queue_iterable_queue_iterable_iterator_serializable0.toString();
        java.lang.String str4 = queue_iterable_queue_iterable_iterator_serializable0.toString();
        org.junit.Assert.assertNotNull(spliterator_iterable_queue_iterable_iterator_serializable1);
        org.junit.Assert.assertNotNull(spliterator_iterable_queue_iterable_iterator_serializable2);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        edu.osu.cs362.Queue<java.util.Spliterator<java.util.Iterator<edu.osu.cs362.Queue<java.io.Serializable>>>> queue_spliterator_iterator_queue_serializable0 = new edu.osu.cs362.Queue<java.util.Spliterator<java.util.Iterator<edu.osu.cs362.Queue<java.io.Serializable>>>>();
        java.util.Spliterator<java.util.Spliterator<java.util.Iterator<edu.osu.cs362.Queue<java.io.Serializable>>>> spliterator_spliterator_iterator_queue_serializable1 = queue_spliterator_iterator_queue_serializable0.spliterator();
        try {
            java.util.Spliterator<java.util.Iterator<edu.osu.cs362.Queue<java.io.Serializable>>> spliterator_iterator_queue_serializable2 = queue_spliterator_iterator_queue_serializable0.peek();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException");
        } catch (java.util.NoSuchElementException e) {
        }
        org.junit.Assert.assertNotNull(spliterator_spliterator_iterator_queue_serializable1);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        edu.osu.cs362.Queue<java.lang.Iterable<java.io.Serializable>> queue_iterable_serializable0 = new edu.osu.cs362.Queue<java.lang.Iterable<java.io.Serializable>>();
        java.util.Spliterator<java.lang.Iterable<java.io.Serializable>> spliterator_iterable_serializable1 = queue_iterable_serializable0.spliterator();
        java.util.Spliterator<java.lang.Iterable<java.io.Serializable>> spliterator_iterable_serializable2 = queue_iterable_serializable0.spliterator();
        try {
            java.lang.Iterable<java.io.Serializable> iterable_serializable3 = queue_iterable_serializable0.dequeue();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException");
        } catch (java.util.NoSuchElementException e) {
        }
        org.junit.Assert.assertNotNull(spliterator_iterable_serializable1);
        org.junit.Assert.assertNotNull(spliterator_iterable_serializable2);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>> queue_iterable_iterator_iterable_queue_iterable_iterator_serializable0 = new edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>>();
        java.util.Spliterator<java.lang.Iterable<java.util.Iterator<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>> spliterator_iterable_iterator_iterable_queue_iterable_iterator_serializable1 = queue_iterable_iterator_iterable_queue_iterable_iterator_serializable0.spliterator();
        boolean b2 = queue_iterable_iterator_iterable_queue_iterable_iterator_serializable0.isEmpty();
        java.util.Iterator<java.lang.Iterable<java.util.Iterator<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>> iterator_iterable_iterator_iterable_queue_iterable_iterator_serializable3 = queue_iterable_iterator_iterable_queue_iterable_iterator_serializable0.iterator();
        org.junit.Assert.assertNotNull(spliterator_iterable_iterator_iterable_queue_iterable_iterator_serializable1);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNotNull(iterator_iterable_iterator_iterable_queue_iterable_iterator_serializable3);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        edu.osu.cs362.Queue<edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.lang.Comparable<java.lang.String>>>> queue_queue_queue_comparable_str0 = new edu.osu.cs362.Queue<edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.lang.Comparable<java.lang.String>>>>();
        boolean b1 = queue_queue_queue_comparable_str0.isEmpty();
        java.util.Iterator<edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.lang.Comparable<java.lang.String>>>> iterator_queue_queue_comparable_str2 = queue_queue_queue_comparable_str0.iterator();
        try {
            edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.lang.Comparable<java.lang.String>>> queue_queue_comparable_str3 = queue_queue_queue_comparable_str0.peek();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException");
        } catch (java.util.NoSuchElementException e) {
        }
        org.junit.Assert.assertTrue(b1 == true);
        org.junit.Assert.assertNotNull(iterator_queue_queue_comparable_str2);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        edu.osu.cs362.Queue<edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.lang.Comparable<java.lang.String>>>> queue_queue_queue_comparable_str0 = new edu.osu.cs362.Queue<edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.lang.Comparable<java.lang.String>>>>();
        boolean b1 = queue_queue_queue_comparable_str0.isEmpty();
        try {
            edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.lang.Comparable<java.lang.String>>> queue_queue_comparable_str2 = queue_queue_queue_comparable_str0.peek();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException");
        } catch (java.util.NoSuchElementException e) {
        }
        org.junit.Assert.assertTrue(b1 == true);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.io.Serializable>> queue_queue_serializable0 = new edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.io.Serializable>>();
        java.util.Spliterator<edu.osu.cs362.Queue<java.io.Serializable>> spliterator_queue_serializable1 = queue_queue_serializable0.spliterator();
        java.util.Iterator<edu.osu.cs362.Queue<java.io.Serializable>> iterator_queue_serializable2 = queue_queue_serializable0.iterator();
        java.lang.String str3 = queue_queue_serializable0.toString();
        edu.osu.cs362.Queue<java.io.Serializable> queue_serializable4 = new edu.osu.cs362.Queue<java.io.Serializable>();
        queue_serializable4.enqueue((java.io.Serializable) 1L);
        java.io.Serializable serializable7 = queue_serializable4.peek();
        java.util.Iterator<java.io.Serializable> iterator_serializable8 = queue_serializable4.iterator();
        java.io.Serializable serializable9 = queue_serializable4.peek();
        java.io.Serializable serializable10 = queue_serializable4.peek();
        queue_queue_serializable0.enqueue(queue_serializable4);
        queue_serializable4.enqueue((java.io.Serializable) (byte) 100);
        java.io.Serializable serializable14 = queue_serializable4.dequeue();
        org.junit.Assert.assertNotNull(spliterator_queue_serializable1);
        org.junit.Assert.assertNotNull(iterator_queue_serializable2);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + serializable7 + "' != '" + 1L + "'", serializable7.equals(1L));
        org.junit.Assert.assertNotNull(iterator_serializable8);
        org.junit.Assert.assertTrue("'" + serializable9 + "' != '" + 1L + "'", serializable9.equals(1L));
        org.junit.Assert.assertTrue("'" + serializable10 + "' != '" + 1L + "'", serializable10.equals(1L));
        org.junit.Assert.assertTrue("'" + serializable14 + "' != '" + 1L + "'", serializable14.equals(1L));
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        edu.osu.cs362.Queue<java.util.Iterator<java.lang.Iterable<java.util.Iterator<edu.osu.cs362.Queue<java.io.Serializable>>>>> queue_iterator_iterable_iterator_queue_serializable0 = new edu.osu.cs362.Queue<java.util.Iterator<java.lang.Iterable<java.util.Iterator<edu.osu.cs362.Queue<java.io.Serializable>>>>>();
        try {
            java.util.Iterator<java.lang.Iterable<java.util.Iterator<edu.osu.cs362.Queue<java.io.Serializable>>>> iterator_iterable_iterator_queue_serializable1 = queue_iterator_iterable_iterator_queue_serializable0.peek();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException");
        } catch (java.util.NoSuchElementException e) {
        }
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        edu.osu.cs362.Queue<java.util.Iterator<edu.osu.cs362.Queue<java.io.Serializable>>> queue_iterator_queue_serializable0 = new edu.osu.cs362.Queue<java.util.Iterator<edu.osu.cs362.Queue<java.io.Serializable>>>();
        int i1 = queue_iterator_queue_serializable0.size();
        java.util.Iterator<java.util.Iterator<edu.osu.cs362.Queue<java.io.Serializable>>> iterator_iterator_queue_serializable2 = queue_iterator_queue_serializable0.iterator();
        edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.io.Serializable>> queue_queue_serializable3 = new edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.io.Serializable>>();
        java.util.Spliterator<edu.osu.cs362.Queue<java.io.Serializable>> spliterator_queue_serializable4 = queue_queue_serializable3.spliterator();
        java.util.Iterator<edu.osu.cs362.Queue<java.io.Serializable>> iterator_queue_serializable5 = queue_queue_serializable3.iterator();
        queue_iterator_queue_serializable0.enqueue(iterator_queue_serializable5);
        java.lang.String str7 = queue_iterator_queue_serializable0.toString();
        java.util.Iterator<java.util.Iterator<edu.osu.cs362.Queue<java.io.Serializable>>> iterator_iterator_queue_serializable8 = queue_iterator_queue_serializable0.iterator();
        java.util.Iterator<edu.osu.cs362.Queue<java.io.Serializable>> iterator_queue_serializable9 = queue_iterator_queue_serializable0.peek();
        int i10 = queue_iterator_queue_serializable0.size();
        java.util.Iterator<edu.osu.cs362.Queue<java.io.Serializable>> iterator_queue_serializable11 = queue_iterator_queue_serializable0.peek();
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertNotNull(iterator_iterator_queue_serializable2);
        org.junit.Assert.assertNotNull(spliterator_queue_serializable4);
        org.junit.Assert.assertNotNull(iterator_queue_serializable5);
        org.junit.Assert.assertNotNull(iterator_iterator_queue_serializable8);
        org.junit.Assert.assertNotNull(iterator_queue_serializable9);
        org.junit.Assert.assertTrue(i10 == 1);
        org.junit.Assert.assertNotNull(iterator_queue_serializable11);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.io.Serializable>> queue_queue_serializable0 = new edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.io.Serializable>>();
        java.util.Spliterator<edu.osu.cs362.Queue<java.io.Serializable>> spliterator_queue_serializable1 = queue_queue_serializable0.spliterator();
        java.util.Iterator<edu.osu.cs362.Queue<java.io.Serializable>> iterator_queue_serializable2 = queue_queue_serializable0.iterator();
        java.lang.String str3 = queue_queue_serializable0.toString();
        edu.osu.cs362.Queue<java.io.Serializable> queue_serializable4 = new edu.osu.cs362.Queue<java.io.Serializable>();
        queue_serializable4.enqueue((java.io.Serializable) 1L);
        java.io.Serializable serializable7 = queue_serializable4.peek();
        java.util.Iterator<java.io.Serializable> iterator_serializable8 = queue_serializable4.iterator();
        java.io.Serializable serializable9 = queue_serializable4.peek();
        java.io.Serializable serializable10 = queue_serializable4.peek();
        queue_queue_serializable0.enqueue(queue_serializable4);
        java.io.Serializable serializable12 = queue_serializable4.peek();
        org.junit.Assert.assertNotNull(spliterator_queue_serializable1);
        org.junit.Assert.assertNotNull(iterator_queue_serializable2);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + serializable7 + "' != '" + 1L + "'", serializable7.equals(1L));
        org.junit.Assert.assertNotNull(iterator_serializable8);
        org.junit.Assert.assertTrue("'" + serializable9 + "' != '" + 1L + "'", serializable9.equals(1L));
        org.junit.Assert.assertTrue("'" + serializable10 + "' != '" + 1L + "'", serializable10.equals(1L));
        org.junit.Assert.assertTrue("'" + serializable12 + "' != '" + 1L + "'", serializable12.equals(1L));
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        edu.osu.cs362.Queue<edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.lang.Comparable<java.lang.String>>>> queue_queue_queue_comparable_str0 = new edu.osu.cs362.Queue<edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.lang.Comparable<java.lang.String>>>>();
        boolean b1 = queue_queue_queue_comparable_str0.isEmpty();
        java.util.Iterator<edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.lang.Comparable<java.lang.String>>>> iterator_queue_queue_comparable_str2 = queue_queue_queue_comparable_str0.iterator();
        java.util.Spliterator<edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.lang.Comparable<java.lang.String>>>> spliterator_queue_queue_comparable_str3 = queue_queue_queue_comparable_str0.spliterator();
        java.util.Spliterator<edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.lang.Comparable<java.lang.String>>>> spliterator_queue_queue_comparable_str4 = queue_queue_queue_comparable_str0.spliterator();
        try {
            edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.lang.Comparable<java.lang.String>>> queue_queue_comparable_str5 = queue_queue_queue_comparable_str0.dequeue();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException");
        } catch (java.util.NoSuchElementException e) {
        }
        org.junit.Assert.assertTrue(b1 == true);
        org.junit.Assert.assertNotNull(iterator_queue_queue_comparable_str2);
        org.junit.Assert.assertNotNull(spliterator_queue_queue_comparable_str3);
        org.junit.Assert.assertNotNull(spliterator_queue_queue_comparable_str4);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        edu.osu.cs362.Queue<java.lang.Iterable<java.lang.Iterable<java.lang.Iterable<java.lang.Object>>>> queue_iterable_iterable_iterable_obj0 = new edu.osu.cs362.Queue<java.lang.Iterable<java.lang.Iterable<java.lang.Iterable<java.lang.Object>>>>();
        java.util.Iterator<java.lang.Iterable<java.lang.Iterable<java.lang.Iterable<java.lang.Object>>>> iterator_iterable_iterable_iterable_obj1 = queue_iterable_iterable_iterable_obj0.iterator();
        boolean b2 = queue_iterable_iterable_iterable_obj0.isEmpty();
        java.util.Iterator<java.lang.Iterable<java.lang.Iterable<java.lang.Iterable<java.lang.Object>>>> iterator_iterable_iterable_iterable_obj3 = queue_iterable_iterable_iterable_obj0.iterator();
        try {
            java.lang.Iterable<java.lang.Iterable<java.lang.Iterable<java.lang.Object>>> iterable_iterable_iterable_obj4 = queue_iterable_iterable_iterable_obj0.dequeue();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException");
        } catch (java.util.NoSuchElementException e) {
        }
        org.junit.Assert.assertNotNull(iterator_iterable_iterable_iterable_obj1);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNotNull(iterator_iterable_iterable_iterable_obj3);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        edu.osu.cs362.Queue<java.util.Iterator<edu.osu.cs362.Queue<java.io.Serializable>>> queue_iterator_queue_serializable0 = new edu.osu.cs362.Queue<java.util.Iterator<edu.osu.cs362.Queue<java.io.Serializable>>>();
        int i1 = queue_iterator_queue_serializable0.size();
        java.util.Iterator<java.util.Iterator<edu.osu.cs362.Queue<java.io.Serializable>>> iterator_iterator_queue_serializable2 = queue_iterator_queue_serializable0.iterator();
        edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.io.Serializable>> queue_queue_serializable3 = new edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.io.Serializable>>();
        java.util.Spliterator<edu.osu.cs362.Queue<java.io.Serializable>> spliterator_queue_serializable4 = queue_queue_serializable3.spliterator();
        java.util.Iterator<edu.osu.cs362.Queue<java.io.Serializable>> iterator_queue_serializable5 = queue_queue_serializable3.iterator();
        queue_iterator_queue_serializable0.enqueue(iterator_queue_serializable5);
        java.lang.String str7 = queue_iterator_queue_serializable0.toString();
        boolean b8 = queue_iterator_queue_serializable0.isEmpty();
        java.util.Iterator<edu.osu.cs362.Queue<java.io.Serializable>> iterator_queue_serializable9 = queue_iterator_queue_serializable0.dequeue();
        boolean b10 = queue_iterator_queue_serializable0.isEmpty();
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertNotNull(iterator_iterator_queue_serializable2);
        org.junit.Assert.assertNotNull(spliterator_queue_serializable4);
        org.junit.Assert.assertNotNull(iterator_queue_serializable5);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(iterator_queue_serializable9);
        org.junit.Assert.assertTrue(b10 == true);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        edu.osu.cs362.Queue<java.util.Spliterator<java.util.Iterator<edu.osu.cs362.Queue<java.io.Serializable>>>> queue_spliterator_iterator_queue_serializable0 = new edu.osu.cs362.Queue<java.util.Spliterator<java.util.Iterator<edu.osu.cs362.Queue<java.io.Serializable>>>>();
        java.lang.String str1 = queue_spliterator_iterator_queue_serializable0.toString();
        java.util.Spliterator<java.util.Spliterator<java.util.Iterator<edu.osu.cs362.Queue<java.io.Serializable>>>> spliterator_spliterator_iterator_queue_serializable2 = queue_spliterator_iterator_queue_serializable0.spliterator();
        try {
            java.util.Spliterator<java.util.Iterator<edu.osu.cs362.Queue<java.io.Serializable>>> spliterator_iterator_queue_serializable3 = queue_spliterator_iterator_queue_serializable0.dequeue();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException");
        } catch (java.util.NoSuchElementException e) {
        }
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertNotNull(spliterator_spliterator_iterator_queue_serializable2);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<edu.osu.cs362.Queue<java.io.Serializable>>>> queue_iterable_iterator_queue_serializable0 = new edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<edu.osu.cs362.Queue<java.io.Serializable>>>>();
        java.lang.String str1 = queue_iterable_iterator_queue_serializable0.toString();
        java.lang.String str2 = queue_iterable_iterator_queue_serializable0.toString();
        boolean b3 = queue_iterable_iterator_queue_serializable0.isEmpty();
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
        org.junit.Assert.assertTrue(b3 == true);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        edu.osu.cs362.Queue<java.lang.Object> queue_obj0 = new edu.osu.cs362.Queue<java.lang.Object>();
        java.util.Iterator<java.lang.Object> iterator_obj1 = queue_obj0.iterator();
        queue_obj0.enqueue((java.lang.Object) 'a');
        java.util.Iterator<java.lang.Object> iterator_obj4 = queue_obj0.iterator();
        java.lang.String str5 = queue_obj0.toString();
        org.junit.Assert.assertNotNull(iterator_obj1);
        org.junit.Assert.assertNotNull(iterator_obj4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "a " + "'", str5.equals("a "));
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        edu.osu.cs362.Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new edu.osu.cs362.Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.enqueue((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str3 = queue_comparable_str0.toString();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> spliterator_comparable_str4 = queue_comparable_str0.spliterator();
        queue_comparable_str0.enqueue((java.lang.Comparable<java.lang.String>) "hi! ");
        java.lang.Comparable<java.lang.String> comparable_str7 = queue_comparable_str0.dequeue();
        queue_comparable_str0.enqueue((java.lang.Comparable<java.lang.String>) "a ");
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi! " + "'", str3.equals("hi! "));
        org.junit.Assert.assertNotNull(spliterator_comparable_str4);
        org.junit.Assert.assertTrue("'" + comparable_str7 + "' != '" + "hi!" + "'", comparable_str7.equals("hi!"));
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        edu.osu.cs362.Queue<java.util.Iterator<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>> queue_iterator_iterable_queue_iterable_iterator_serializable0 = new edu.osu.cs362.Queue<java.util.Iterator<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>();
        java.util.Iterator<java.util.Iterator<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>> iterator_iterator_iterable_queue_iterable_iterator_serializable1 = queue_iterator_iterable_queue_iterable_iterator_serializable0.iterator();
        java.util.Spliterator<java.util.Iterator<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>> spliterator_iterator_iterable_queue_iterable_iterator_serializable2 = queue_iterator_iterable_queue_iterable_iterator_serializable0.spliterator();
        try {
            java.util.Iterator<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>> iterator_iterable_queue_iterable_iterator_serializable3 = queue_iterator_iterable_queue_iterable_iterator_serializable0.dequeue();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException");
        } catch (java.util.NoSuchElementException e) {
        }
        org.junit.Assert.assertNotNull(iterator_iterator_iterable_queue_iterable_iterator_serializable1);
        org.junit.Assert.assertNotNull(spliterator_iterator_iterable_queue_iterable_iterator_serializable2);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        edu.osu.cs362.Queue<java.util.Iterator<java.lang.Iterable<java.io.Serializable>>> queue_iterator_iterable_serializable0 = new edu.osu.cs362.Queue<java.util.Iterator<java.lang.Iterable<java.io.Serializable>>>();
        try {
            java.util.Iterator<java.lang.Iterable<java.io.Serializable>> iterator_iterable_serializable1 = queue_iterator_iterable_serializable0.dequeue();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException");
        } catch (java.util.NoSuchElementException e) {
        }
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.lang.Object>>> queue_iterable_iterator_obj0 = new edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.lang.Object>>>();
        edu.osu.cs362.Queue<java.util.Iterator<java.lang.Object>> queue_iterator_obj1 = new edu.osu.cs362.Queue<java.util.Iterator<java.lang.Object>>();
        queue_iterable_iterator_obj0.enqueue((java.lang.Iterable<java.util.Iterator<java.lang.Object>>) queue_iterator_obj1);
        java.util.Iterator<java.util.Iterator<java.lang.Object>> iterator_iterator_obj3 = queue_iterator_obj1.iterator();
        java.util.Spliterator<java.util.Iterator<java.lang.Object>> spliterator_iterator_obj4 = queue_iterator_obj1.spliterator();
        boolean b5 = queue_iterator_obj1.isEmpty();
        org.junit.Assert.assertNotNull(iterator_iterator_obj3);
        org.junit.Assert.assertNotNull(spliterator_iterator_obj4);
        org.junit.Assert.assertTrue(b5 == true);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        edu.osu.cs362.Queue<java.util.Spliterator<java.util.Iterator<java.io.Serializable>>> queue_spliterator_iterator_serializable0 = new edu.osu.cs362.Queue<java.util.Spliterator<java.util.Iterator<java.io.Serializable>>>();
        java.lang.String str1 = queue_spliterator_iterator_serializable0.toString();
        java.util.Iterator<java.util.Spliterator<java.util.Iterator<java.io.Serializable>>> iterator_spliterator_iterator_serializable2 = queue_spliterator_iterator_serializable0.iterator();
        try {
            java.util.Spliterator<java.util.Iterator<java.io.Serializable>> spliterator_iterator_serializable3 = queue_spliterator_iterator_serializable0.peek();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException");
        } catch (java.util.NoSuchElementException e) {
        }
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertNotNull(iterator_spliterator_iterator_serializable2);
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        edu.osu.cs362.Queue<java.util.Spliterator<java.util.Iterator<java.io.Serializable>>> queue_spliterator_iterator_serializable0 = new edu.osu.cs362.Queue<java.util.Spliterator<java.util.Iterator<java.io.Serializable>>>();
        java.lang.String str1 = queue_spliterator_iterator_serializable0.toString();
        java.util.Spliterator<java.util.Spliterator<java.util.Iterator<java.io.Serializable>>> spliterator_spliterator_iterator_serializable2 = queue_spliterator_iterator_serializable0.spliterator();
        try {
            java.util.Spliterator<java.util.Iterator<java.io.Serializable>> spliterator_iterator_serializable3 = queue_spliterator_iterator_serializable0.dequeue();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException");
        } catch (java.util.NoSuchElementException e) {
        }
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertNotNull(spliterator_spliterator_iterator_serializable2);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        edu.osu.cs362.Queue<java.lang.Iterable<java.lang.Object>> queue_iterable_obj0 = new edu.osu.cs362.Queue<java.lang.Iterable<java.lang.Object>>();
        java.util.Spliterator<java.lang.Iterable<java.lang.Object>> spliterator_iterable_obj1 = queue_iterable_obj0.spliterator();
        edu.osu.cs362.Queue<java.lang.Object> queue_obj2 = new edu.osu.cs362.Queue<java.lang.Object>();
        int i3 = queue_obj2.size();
        java.util.Spliterator<java.lang.Object> spliterator_obj4 = queue_obj2.spliterator();
        edu.osu.cs362.Queue<java.util.Iterator<java.io.Serializable>> queue_iterator_serializable5 = new edu.osu.cs362.Queue<java.util.Iterator<java.io.Serializable>>();
        boolean b6 = queue_iterator_serializable5.isEmpty();
        edu.osu.cs362.Queue<java.io.Serializable> queue_serializable7 = new edu.osu.cs362.Queue<java.io.Serializable>();
        queue_serializable7.enqueue((java.io.Serializable) 1L);
        java.util.Iterator<java.io.Serializable> iterator_serializable10 = queue_serializable7.iterator();
        queue_iterator_serializable5.enqueue(iterator_serializable10);
        int i12 = queue_iterator_serializable5.size();
        java.util.Iterator<java.io.Serializable> iterator_serializable13 = queue_iterator_serializable5.peek();
        boolean b14 = queue_iterator_serializable5.isEmpty();
        java.util.Iterator<java.io.Serializable> iterator_serializable15 = queue_iterator_serializable5.peek();
        queue_obj2.enqueue((java.lang.Object) queue_iterator_serializable5);
        java.lang.String str17 = queue_obj2.toString();
        queue_iterable_obj0.enqueue((java.lang.Iterable<java.lang.Object>) queue_obj2);
        int i19 = queue_obj2.size();
        int i20 = queue_obj2.size();
        org.junit.Assert.assertNotNull(spliterator_iterable_obj1);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertNotNull(spliterator_obj4);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertNotNull(iterator_serializable10);
        org.junit.Assert.assertTrue(i12 == 1);
        org.junit.Assert.assertNotNull(iterator_serializable13);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNotNull(iterator_serializable15);
        org.junit.Assert.assertTrue(i19 == 1);
        org.junit.Assert.assertTrue(i20 == 1);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
        edu.osu.cs362.Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new edu.osu.cs362.Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.enqueue((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str3 = queue_comparable_str0.toString();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> spliterator_comparable_str4 = queue_comparable_str0.spliterator();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> iterator_comparable_str5 = queue_comparable_str0.iterator();
        int i6 = queue_comparable_str0.size();
        java.lang.Comparable<java.lang.String> comparable_str7 = queue_comparable_str0.peek();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi! " + "'", str3.equals("hi! "));
        org.junit.Assert.assertNotNull(spliterator_comparable_str4);
        org.junit.Assert.assertNotNull(iterator_comparable_str5);
        org.junit.Assert.assertTrue(i6 == 1);
        org.junit.Assert.assertTrue("'" + comparable_str7 + "' != '" + "hi!" + "'", comparable_str7.equals("hi!"));
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
        edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.lang.Object>>> queue_iterable_iterator_obj0 = new edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.lang.Object>>>();
        edu.osu.cs362.Queue<java.util.Iterator<java.lang.Object>> queue_iterator_obj1 = new edu.osu.cs362.Queue<java.util.Iterator<java.lang.Object>>();
        queue_iterable_iterator_obj0.enqueue((java.lang.Iterable<java.util.Iterator<java.lang.Object>>) queue_iterator_obj1);
        java.lang.String str3 = queue_iterator_obj1.toString();
        edu.osu.cs362.Queue<java.lang.Object> queue_obj4 = new edu.osu.cs362.Queue<java.lang.Object>();
        int i5 = queue_obj4.size();
        java.util.Spliterator<java.lang.Object> spliterator_obj6 = queue_obj4.spliterator();
        edu.osu.cs362.Queue<java.util.Iterator<java.io.Serializable>> queue_iterator_serializable7 = new edu.osu.cs362.Queue<java.util.Iterator<java.io.Serializable>>();
        boolean b8 = queue_iterator_serializable7.isEmpty();
        edu.osu.cs362.Queue<java.io.Serializable> queue_serializable9 = new edu.osu.cs362.Queue<java.io.Serializable>();
        queue_serializable9.enqueue((java.io.Serializable) 1L);
        java.util.Iterator<java.io.Serializable> iterator_serializable12 = queue_serializable9.iterator();
        queue_iterator_serializable7.enqueue(iterator_serializable12);
        int i14 = queue_iterator_serializable7.size();
        java.util.Iterator<java.io.Serializable> iterator_serializable15 = queue_iterator_serializable7.peek();
        boolean b16 = queue_iterator_serializable7.isEmpty();
        java.util.Iterator<java.io.Serializable> iterator_serializable17 = queue_iterator_serializable7.peek();
        queue_obj4.enqueue((java.lang.Object) queue_iterator_serializable7);
        java.lang.String str19 = queue_obj4.toString();
        java.util.Iterator<java.lang.Object> iterator_obj20 = queue_obj4.iterator();
        queue_iterator_obj1.enqueue(iterator_obj20);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertNotNull(spliterator_obj6);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertNotNull(iterator_serializable12);
        org.junit.Assert.assertTrue(i14 == 1);
        org.junit.Assert.assertNotNull(iterator_serializable15);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(iterator_serializable17);
        org.junit.Assert.assertNotNull(iterator_obj20);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
        edu.osu.cs362.Queue<java.lang.Iterable<java.lang.Iterable<java.lang.Iterable<java.lang.Object>>>> queue_iterable_iterable_iterable_obj0 = new edu.osu.cs362.Queue<java.lang.Iterable<java.lang.Iterable<java.lang.Iterable<java.lang.Object>>>>();
        java.util.Iterator<java.lang.Iterable<java.lang.Iterable<java.lang.Iterable<java.lang.Object>>>> iterator_iterable_iterable_iterable_obj1 = queue_iterable_iterable_iterable_obj0.iterator();
        edu.osu.cs362.Queue<java.lang.Iterable<java.lang.Iterable<java.lang.Object>>> queue_iterable_iterable_obj2 = new edu.osu.cs362.Queue<java.lang.Iterable<java.lang.Iterable<java.lang.Object>>>();
        queue_iterable_iterable_iterable_obj0.enqueue((java.lang.Iterable<java.lang.Iterable<java.lang.Iterable<java.lang.Object>>>) queue_iterable_iterable_obj2);
        java.util.Spliterator<java.lang.Iterable<java.lang.Iterable<java.lang.Object>>> spliterator_iterable_iterable_obj4 = queue_iterable_iterable_obj2.spliterator();
        int i5 = queue_iterable_iterable_obj2.size();
        java.util.Spliterator<java.lang.Iterable<java.lang.Iterable<java.lang.Object>>> spliterator_iterable_iterable_obj6 = queue_iterable_iterable_obj2.spliterator();
        org.junit.Assert.assertNotNull(iterator_iterable_iterable_iterable_obj1);
        org.junit.Assert.assertNotNull(spliterator_iterable_iterable_obj4);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertNotNull(spliterator_iterable_iterable_obj6);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
        edu.osu.cs362.Queue<java.util.Spliterator<java.util.Iterator<edu.osu.cs362.Queue<java.io.Serializable>>>> queue_spliterator_iterator_queue_serializable0 = new edu.osu.cs362.Queue<java.util.Spliterator<java.util.Iterator<edu.osu.cs362.Queue<java.io.Serializable>>>>();
        java.util.Spliterator<java.util.Spliterator<java.util.Iterator<edu.osu.cs362.Queue<java.io.Serializable>>>> spliterator_spliterator_iterator_queue_serializable1 = queue_spliterator_iterator_queue_serializable0.spliterator();
        try {
            java.util.Spliterator<java.util.Iterator<edu.osu.cs362.Queue<java.io.Serializable>>> spliterator_iterator_queue_serializable2 = queue_spliterator_iterator_queue_serializable0.dequeue();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException");
        } catch (java.util.NoSuchElementException e) {
        }
        org.junit.Assert.assertNotNull(spliterator_spliterator_iterator_queue_serializable1);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test185");
        edu.osu.cs362.Queue<java.lang.Iterable<java.lang.Iterable<java.lang.Iterable<java.lang.Object>>>> queue_iterable_iterable_iterable_obj0 = new edu.osu.cs362.Queue<java.lang.Iterable<java.lang.Iterable<java.lang.Iterable<java.lang.Object>>>>();
        java.util.Iterator<java.lang.Iterable<java.lang.Iterable<java.lang.Iterable<java.lang.Object>>>> iterator_iterable_iterable_iterable_obj1 = queue_iterable_iterable_iterable_obj0.iterator();
        boolean b2 = queue_iterable_iterable_iterable_obj0.isEmpty();
        java.util.Iterator<java.lang.Iterable<java.lang.Iterable<java.lang.Iterable<java.lang.Object>>>> iterator_iterable_iterable_iterable_obj3 = queue_iterable_iterable_iterable_obj0.iterator();
        edu.osu.cs362.Queue<java.lang.Iterable<java.lang.Iterable<java.lang.Iterable<java.lang.Object>>>> queue_iterable_iterable_iterable_obj4 = new edu.osu.cs362.Queue<java.lang.Iterable<java.lang.Iterable<java.lang.Iterable<java.lang.Object>>>>();
        java.util.Iterator<java.lang.Iterable<java.lang.Iterable<java.lang.Iterable<java.lang.Object>>>> iterator_iterable_iterable_iterable_obj5 = queue_iterable_iterable_iterable_obj4.iterator();
        edu.osu.cs362.Queue<java.lang.Iterable<java.lang.Iterable<java.lang.Object>>> queue_iterable_iterable_obj6 = new edu.osu.cs362.Queue<java.lang.Iterable<java.lang.Iterable<java.lang.Object>>>();
        queue_iterable_iterable_iterable_obj4.enqueue((java.lang.Iterable<java.lang.Iterable<java.lang.Iterable<java.lang.Object>>>) queue_iterable_iterable_obj6);
        int i8 = queue_iterable_iterable_obj6.size();
        boolean b9 = queue_iterable_iterable_obj6.isEmpty();
        java.util.Iterator<java.lang.Iterable<java.lang.Iterable<java.lang.Object>>> iterator_iterable_iterable_obj10 = queue_iterable_iterable_obj6.iterator();
        int i11 = queue_iterable_iterable_obj6.size();
        queue_iterable_iterable_iterable_obj0.enqueue((java.lang.Iterable<java.lang.Iterable<java.lang.Iterable<java.lang.Object>>>) queue_iterable_iterable_obj6);
        org.junit.Assert.assertNotNull(iterator_iterable_iterable_iterable_obj1);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNotNull(iterator_iterable_iterable_iterable_obj3);
        org.junit.Assert.assertNotNull(iterator_iterable_iterable_iterable_obj5);
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertNotNull(iterator_iterable_iterable_obj10);
        org.junit.Assert.assertTrue(i11 == 0);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
        edu.osu.cs362.Queue<java.lang.Iterable<java.lang.Iterable<java.lang.Iterable<java.lang.Object>>>> queue_iterable_iterable_iterable_obj0 = new edu.osu.cs362.Queue<java.lang.Iterable<java.lang.Iterable<java.lang.Iterable<java.lang.Object>>>>();
        java.util.Iterator<java.lang.Iterable<java.lang.Iterable<java.lang.Iterable<java.lang.Object>>>> iterator_iterable_iterable_iterable_obj1 = queue_iterable_iterable_iterable_obj0.iterator();
        boolean b2 = queue_iterable_iterable_iterable_obj0.isEmpty();
        java.util.Spliterator<java.lang.Iterable<java.lang.Iterable<java.lang.Iterable<java.lang.Object>>>> spliterator_iterable_iterable_iterable_obj3 = queue_iterable_iterable_iterable_obj0.spliterator();
        org.junit.Assert.assertNotNull(iterator_iterable_iterable_iterable_obj1);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNotNull(spliterator_iterable_iterable_iterable_obj3);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test187");
        edu.osu.cs362.Queue<java.lang.Iterable<java.lang.Iterable<java.lang.Object>>> queue_iterable_iterable_obj0 = new edu.osu.cs362.Queue<java.lang.Iterable<java.lang.Iterable<java.lang.Object>>>();
        java.util.Iterator<java.lang.Iterable<java.lang.Iterable<java.lang.Object>>> iterator_iterable_iterable_obj1 = queue_iterable_iterable_obj0.iterator();
        org.junit.Assert.assertNotNull(iterator_iterable_iterable_obj1);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test188");
        edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>> queue_iterable_iterator_serializable0 = new edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>();
        int i1 = queue_iterable_iterator_serializable0.size();
        java.util.Spliterator<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>> spliterator_iterable_iterator_serializable2 = queue_iterable_iterator_serializable0.spliterator();
        boolean b3 = queue_iterable_iterator_serializable0.isEmpty();
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertNotNull(spliterator_iterable_iterator_serializable2);
        org.junit.Assert.assertTrue(b3 == true);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test189");
        edu.osu.cs362.Queue<java.util.Spliterator<java.lang.Iterable<java.util.Iterator<java.lang.Object>>>> queue_spliterator_iterable_iterator_obj0 = new edu.osu.cs362.Queue<java.util.Spliterator<java.lang.Iterable<java.util.Iterator<java.lang.Object>>>>();
        try {
            java.util.Spliterator<java.lang.Iterable<java.util.Iterator<java.lang.Object>>> spliterator_iterable_iterator_obj1 = queue_spliterator_iterable_iterator_obj0.peek();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException");
        } catch (java.util.NoSuchElementException e) {
        }
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test190");
        edu.osu.cs362.Queue<java.lang.Iterable<java.io.Serializable>> queue_iterable_serializable0 = new edu.osu.cs362.Queue<java.lang.Iterable<java.io.Serializable>>();
        java.util.Spliterator<java.lang.Iterable<java.io.Serializable>> spliterator_iterable_serializable1 = queue_iterable_serializable0.spliterator();
        int i2 = queue_iterable_serializable0.size();
        java.lang.String str3 = queue_iterable_serializable0.toString();
        org.junit.Assert.assertNotNull(spliterator_iterable_serializable1);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test191");
        edu.osu.cs362.Queue<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>> queue_iterable_queue_iterable_queue_iterable_iterator_serializable0 = new edu.osu.cs362.Queue<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>>();
        boolean b1 = queue_iterable_queue_iterable_queue_iterable_iterator_serializable0.isEmpty();
        boolean b2 = queue_iterable_queue_iterable_queue_iterable_iterator_serializable0.isEmpty();
        java.lang.String str3 = queue_iterable_queue_iterable_queue_iterable_iterator_serializable0.toString();
        int i4 = queue_iterable_queue_iterable_queue_iterable_iterator_serializable0.size();
        try {
            java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>> iterable_queue_iterable_queue_iterable_iterator_serializable5 = queue_iterable_queue_iterable_queue_iterable_iterator_serializable0.dequeue();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException");
        } catch (java.util.NoSuchElementException e) {
        }
        org.junit.Assert.assertTrue(b1 == true);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue(i4 == 0);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test192");
        edu.osu.cs362.Queue<java.util.Spliterator<java.util.Iterator<java.io.Serializable>>> queue_spliterator_iterator_serializable0 = new edu.osu.cs362.Queue<java.util.Spliterator<java.util.Iterator<java.io.Serializable>>>();
        try {
            java.util.Spliterator<java.util.Iterator<java.io.Serializable>> spliterator_iterator_serializable1 = queue_spliterator_iterator_serializable0.dequeue();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException");
        } catch (java.util.NoSuchElementException e) {
        }
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test193");
        edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>> queue_queue_iterable_queue_iterable_iterator_serializable0 = new edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>();
        java.util.Iterator<edu.osu.cs362.Queue<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>> iterator_queue_iterable_queue_iterable_iterator_serializable1 = queue_queue_iterable_queue_iterable_iterator_serializable0.iterator();
        java.lang.String str2 = queue_queue_iterable_queue_iterable_iterator_serializable0.toString();
        try {
            edu.osu.cs362.Queue<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>> queue_iterable_queue_iterable_iterator_serializable3 = queue_queue_iterable_queue_iterable_iterator_serializable0.dequeue();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException");
        } catch (java.util.NoSuchElementException e) {
        }
        org.junit.Assert.assertNotNull(iterator_queue_iterable_queue_iterable_iterator_serializable1);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test194");
        edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>> queue_iterable_iterator_iterable_queue_iterable_iterator_serializable0 = new edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>>();
        java.util.Iterator<java.lang.Iterable<java.util.Iterator<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>> iterator_iterable_iterator_iterable_queue_iterable_iterator_serializable1 = queue_iterable_iterator_iterable_queue_iterable_iterator_serializable0.iterator();
        try {
            java.lang.Iterable<java.util.Iterator<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>> iterable_iterator_iterable_queue_iterable_iterator_serializable2 = queue_iterable_iterator_iterable_queue_iterable_iterator_serializable0.peek();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException");
        } catch (java.util.NoSuchElementException e) {
        }
        org.junit.Assert.assertNotNull(iterator_iterable_iterator_iterable_queue_iterable_iterator_serializable1);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test195");
        edu.osu.cs362.Queue<java.util.Iterator<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>> queue_iterator_iterable_queue_iterable_iterator_serializable0 = new edu.osu.cs362.Queue<java.util.Iterator<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>();
        java.util.Iterator<java.util.Iterator<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>> iterator_iterator_iterable_queue_iterable_iterator_serializable1 = queue_iterator_iterable_queue_iterable_iterator_serializable0.iterator();
        try {
            java.util.Iterator<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>> iterator_iterable_queue_iterable_iterator_serializable2 = queue_iterator_iterable_queue_iterable_iterator_serializable0.dequeue();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException");
        } catch (java.util.NoSuchElementException e) {
        }
        org.junit.Assert.assertNotNull(iterator_iterator_iterable_queue_iterable_iterator_serializable1);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test196");
        edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>> queue_queue_iterable_iterator_serializable0 = new edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>();
        try {
            edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>> queue_iterable_iterator_serializable1 = queue_queue_iterable_iterator_serializable0.dequeue();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException");
        } catch (java.util.NoSuchElementException e) {
        }
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test197");
        edu.osu.cs362.Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new edu.osu.cs362.Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.enqueue((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str3 = queue_comparable_str0.dequeue();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> iterator_comparable_str4 = queue_comparable_str0.iterator();
        org.junit.Assert.assertTrue("'" + comparable_str3 + "' != '" + "hi!" + "'", comparable_str3.equals("hi!"));
        org.junit.Assert.assertNotNull(iterator_comparable_str4);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test198");
        edu.osu.cs362.Queue<java.util.Iterator<edu.osu.cs362.Queue<java.io.Serializable>>> queue_iterator_queue_serializable0 = new edu.osu.cs362.Queue<java.util.Iterator<edu.osu.cs362.Queue<java.io.Serializable>>>();
        int i1 = queue_iterator_queue_serializable0.size();
        java.util.Iterator<java.util.Iterator<edu.osu.cs362.Queue<java.io.Serializable>>> iterator_iterator_queue_serializable2 = queue_iterator_queue_serializable0.iterator();
        edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.io.Serializable>> queue_queue_serializable3 = new edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.io.Serializable>>();
        java.util.Spliterator<edu.osu.cs362.Queue<java.io.Serializable>> spliterator_queue_serializable4 = queue_queue_serializable3.spliterator();
        java.util.Iterator<edu.osu.cs362.Queue<java.io.Serializable>> iterator_queue_serializable5 = queue_queue_serializable3.iterator();
        queue_iterator_queue_serializable0.enqueue(iterator_queue_serializable5);
        java.lang.String str7 = queue_iterator_queue_serializable0.toString();
        boolean b8 = queue_iterator_queue_serializable0.isEmpty();
        java.lang.String str9 = queue_iterator_queue_serializable0.toString();
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertNotNull(iterator_iterator_queue_serializable2);
        org.junit.Assert.assertNotNull(spliterator_queue_serializable4);
        org.junit.Assert.assertNotNull(iterator_queue_serializable5);
        org.junit.Assert.assertTrue(b8 == false);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test199");
        edu.osu.cs362.Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new edu.osu.cs362.Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.enqueue((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str3 = queue_comparable_str0.dequeue();
        try {
            java.lang.Comparable<java.lang.String> comparable_str4 = queue_comparable_str0.dequeue();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException");
        } catch (java.util.NoSuchElementException e) {
        }
        org.junit.Assert.assertTrue("'" + comparable_str3 + "' != '" + "hi!" + "'", comparable_str3.equals("hi!"));
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test200");
        edu.osu.cs362.Queue<java.util.Iterator<edu.osu.cs362.Queue<java.io.Serializable>>> queue_iterator_queue_serializable0 = new edu.osu.cs362.Queue<java.util.Iterator<edu.osu.cs362.Queue<java.io.Serializable>>>();
        java.lang.String str1 = queue_iterator_queue_serializable0.toString();
        try {
            java.util.Iterator<edu.osu.cs362.Queue<java.io.Serializable>> iterator_queue_serializable2 = queue_iterator_queue_serializable0.dequeue();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException");
        } catch (java.util.NoSuchElementException e) {
        }
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test201");
        edu.osu.cs362.Queue<java.util.Spliterator<java.lang.Iterable<java.util.Iterator<java.lang.Object>>>> queue_spliterator_iterable_iterator_obj0 = new edu.osu.cs362.Queue<java.util.Spliterator<java.lang.Iterable<java.util.Iterator<java.lang.Object>>>>();
        int i1 = queue_spliterator_iterable_iterator_obj0.size();
        try {
            java.util.Spliterator<java.lang.Iterable<java.util.Iterator<java.lang.Object>>> spliterator_iterable_iterator_obj2 = queue_spliterator_iterable_iterator_obj0.dequeue();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException");
        } catch (java.util.NoSuchElementException e) {
        }
        org.junit.Assert.assertTrue(i1 == 0);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test202");
        edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>> queue_iterable_iterator_iterable_queue_iterable_iterator_serializable0 = new edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>>();
        int i1 = queue_iterable_iterator_iterable_queue_iterable_iterator_serializable0.size();
        int i2 = queue_iterable_iterator_iterable_queue_iterable_iterator_serializable0.size();
        int i3 = queue_iterable_iterator_iterable_queue_iterable_iterator_serializable0.size();
        try {
            java.lang.Iterable<java.util.Iterator<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>> iterable_iterator_iterable_queue_iterable_iterator_serializable4 = queue_iterable_iterator_iterable_queue_iterable_iterator_serializable0.dequeue();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException");
        } catch (java.util.NoSuchElementException e) {
        }
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(i3 == 0);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test203");
        edu.osu.cs362.Queue<java.lang.Iterable<java.io.Serializable>> queue_iterable_serializable0 = new edu.osu.cs362.Queue<java.lang.Iterable<java.io.Serializable>>();
        int i1 = queue_iterable_serializable0.size();
        try {
            java.lang.Iterable<java.io.Serializable> iterable_serializable2 = queue_iterable_serializable0.dequeue();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException");
        } catch (java.util.NoSuchElementException e) {
        }
        org.junit.Assert.assertTrue(i1 == 0);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test204");
        edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>> queue_iterable_iterator_iterable_queue_iterable_iterator_serializable0 = new edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>>();
        int i1 = queue_iterable_iterator_iterable_queue_iterable_iterator_serializable0.size();
        int i2 = queue_iterable_iterator_iterable_queue_iterable_iterator_serializable0.size();
        edu.osu.cs362.Queue<java.util.Iterator<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>> queue_iterator_iterable_queue_iterable_iterator_serializable3 = new edu.osu.cs362.Queue<java.util.Iterator<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>();
        queue_iterable_iterator_iterable_queue_iterable_iterator_serializable0.enqueue((java.lang.Iterable<java.util.Iterator<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>) queue_iterator_iterable_queue_iterable_iterator_serializable3);
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test205");
        edu.osu.cs362.Queue<java.util.Spliterator<java.util.Iterator<java.io.Serializable>>> queue_spliterator_iterator_serializable0 = new edu.osu.cs362.Queue<java.util.Spliterator<java.util.Iterator<java.io.Serializable>>>();
        java.lang.String str1 = queue_spliterator_iterator_serializable0.toString();
        java.lang.String str2 = queue_spliterator_iterator_serializable0.toString();
        try {
            java.util.Spliterator<java.util.Iterator<java.io.Serializable>> spliterator_iterator_serializable3 = queue_spliterator_iterator_serializable0.peek();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException");
        } catch (java.util.NoSuchElementException e) {
        }
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test206");
        edu.osu.cs362.Queue<java.util.Iterator<java.lang.Object>> queue_iterator_obj0 = new edu.osu.cs362.Queue<java.util.Iterator<java.lang.Object>>();
        try {
            java.util.Iterator<java.lang.Object> iterator_obj1 = queue_iterator_obj0.peek();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException");
        } catch (java.util.NoSuchElementException e) {
        }
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test207");
        edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>> queue_queue_iterable_iterator_serializable0 = new edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>();
        java.lang.String str1 = queue_queue_iterable_iterator_serializable0.toString();
        try {
            edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>> queue_iterable_iterator_serializable2 = queue_queue_iterable_iterator_serializable0.peek();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException");
        } catch (java.util.NoSuchElementException e) {
        }
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test208");
        edu.osu.cs362.Queue<edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.lang.Comparable<java.lang.String>>>> queue_queue_queue_comparable_str0 = new edu.osu.cs362.Queue<edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.lang.Comparable<java.lang.String>>>>();
        boolean b1 = queue_queue_queue_comparable_str0.isEmpty();
        java.util.Iterator<edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.lang.Comparable<java.lang.String>>>> iterator_queue_queue_comparable_str2 = queue_queue_queue_comparable_str0.iterator();
        int i3 = queue_queue_queue_comparable_str0.size();
        java.util.Spliterator<edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.lang.Comparable<java.lang.String>>>> spliterator_queue_queue_comparable_str4 = queue_queue_queue_comparable_str0.spliterator();
        try {
            edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.lang.Comparable<java.lang.String>>> queue_queue_comparable_str5 = queue_queue_queue_comparable_str0.dequeue();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException");
        } catch (java.util.NoSuchElementException e) {
        }
        org.junit.Assert.assertTrue(b1 == true);
        org.junit.Assert.assertNotNull(iterator_queue_queue_comparable_str2);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertNotNull(spliterator_queue_queue_comparable_str4);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test209");
        edu.osu.cs362.Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new edu.osu.cs362.Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.enqueue((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str3 = queue_comparable_str0.toString();
        int i4 = queue_comparable_str0.size();
        boolean b5 = queue_comparable_str0.isEmpty();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi! " + "'", str3.equals("hi! "));
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertTrue(b5 == false);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test210");
        edu.osu.cs362.Queue<java.util.Iterator<java.io.Serializable>> queue_iterator_serializable0 = new edu.osu.cs362.Queue<java.util.Iterator<java.io.Serializable>>();
        boolean b1 = queue_iterator_serializable0.isEmpty();
        boolean b2 = queue_iterator_serializable0.isEmpty();
        boolean b3 = queue_iterator_serializable0.isEmpty();
        int i4 = queue_iterator_serializable0.size();
        boolean b5 = queue_iterator_serializable0.isEmpty();
        org.junit.Assert.assertTrue(b1 == true);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(b5 == true);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test211");
        edu.osu.cs362.Queue<java.lang.Iterable<java.lang.Iterable<java.lang.Iterable<java.lang.Object>>>> queue_iterable_iterable_iterable_obj0 = new edu.osu.cs362.Queue<java.lang.Iterable<java.lang.Iterable<java.lang.Iterable<java.lang.Object>>>>();
        java.util.Spliterator<java.lang.Iterable<java.lang.Iterable<java.lang.Iterable<java.lang.Object>>>> spliterator_iterable_iterable_iterable_obj1 = queue_iterable_iterable_iterable_obj0.spliterator();
        java.util.Iterator<java.lang.Iterable<java.lang.Iterable<java.lang.Iterable<java.lang.Object>>>> iterator_iterable_iterable_iterable_obj2 = queue_iterable_iterable_iterable_obj0.iterator();
        java.util.Iterator<java.lang.Iterable<java.lang.Iterable<java.lang.Iterable<java.lang.Object>>>> iterator_iterable_iterable_iterable_obj3 = queue_iterable_iterable_iterable_obj0.iterator();
        java.lang.String str4 = queue_iterable_iterable_iterable_obj0.toString();
        java.lang.String str5 = queue_iterable_iterable_iterable_obj0.toString();
        org.junit.Assert.assertNotNull(spliterator_iterable_iterable_iterable_obj1);
        org.junit.Assert.assertNotNull(iterator_iterable_iterable_iterable_obj2);
        org.junit.Assert.assertNotNull(iterator_iterable_iterable_iterable_obj3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test212");
        edu.osu.cs362.Queue<java.lang.Iterable<java.lang.Iterable<java.lang.Iterable<java.lang.Object>>>> queue_iterable_iterable_iterable_obj0 = new edu.osu.cs362.Queue<java.lang.Iterable<java.lang.Iterable<java.lang.Iterable<java.lang.Object>>>>();
        java.util.Iterator<java.lang.Iterable<java.lang.Iterable<java.lang.Iterable<java.lang.Object>>>> iterator_iterable_iterable_iterable_obj1 = queue_iterable_iterable_iterable_obj0.iterator();
        edu.osu.cs362.Queue<java.lang.Iterable<java.lang.Iterable<java.lang.Object>>> queue_iterable_iterable_obj2 = new edu.osu.cs362.Queue<java.lang.Iterable<java.lang.Iterable<java.lang.Object>>>();
        queue_iterable_iterable_iterable_obj0.enqueue((java.lang.Iterable<java.lang.Iterable<java.lang.Iterable<java.lang.Object>>>) queue_iterable_iterable_obj2);
        int i4 = queue_iterable_iterable_obj2.size();
        boolean b5 = queue_iterable_iterable_obj2.isEmpty();
        java.util.Iterator<java.lang.Iterable<java.lang.Iterable<java.lang.Object>>> iterator_iterable_iterable_obj6 = queue_iterable_iterable_obj2.iterator();
        int i7 = queue_iterable_iterable_obj2.size();
        java.util.Spliterator<java.lang.Iterable<java.lang.Iterable<java.lang.Object>>> spliterator_iterable_iterable_obj8 = queue_iterable_iterable_obj2.spliterator();
        java.lang.String str9 = queue_iterable_iterable_obj2.toString();
        org.junit.Assert.assertNotNull(iterator_iterable_iterable_iterable_obj1);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertNotNull(iterator_iterable_iterable_obj6);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertNotNull(spliterator_iterable_iterable_obj8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test213");
        edu.osu.cs362.Queue<java.io.Serializable> queue_serializable0 = new edu.osu.cs362.Queue<java.io.Serializable>();
        queue_serializable0.enqueue((java.io.Serializable) 1L);
        java.io.Serializable serializable3 = queue_serializable0.peek();
        java.io.Serializable serializable4 = queue_serializable0.peek();
        queue_serializable0.enqueue((java.io.Serializable) (short) -1);
        java.io.Serializable serializable7 = queue_serializable0.peek();
        java.util.Iterator<java.io.Serializable> iterator_serializable8 = queue_serializable0.iterator();
        java.io.Serializable serializable9 = queue_serializable0.dequeue();
        org.junit.Assert.assertTrue("'" + serializable3 + "' != '" + 1L + "'", serializable3.equals(1L));
        org.junit.Assert.assertTrue("'" + serializable4 + "' != '" + 1L + "'", serializable4.equals(1L));
        org.junit.Assert.assertTrue("'" + serializable7 + "' != '" + 1L + "'", serializable7.equals(1L));
        org.junit.Assert.assertNotNull(iterator_serializable8);
        org.junit.Assert.assertTrue("'" + serializable9 + "' != '" + 1L + "'", serializable9.equals(1L));
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test214");
        edu.osu.cs362.Queue<java.util.Spliterator<java.lang.Iterable<java.util.Iterator<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>>> queue_spliterator_iterable_iterator_iterable_queue_iterable_iterator_serializable0 = new edu.osu.cs362.Queue<java.util.Spliterator<java.lang.Iterable<java.util.Iterator<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>>>();
        try {
            java.util.Spliterator<java.lang.Iterable<java.util.Iterator<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>> spliterator_iterable_iterator_iterable_queue_iterable_iterator_serializable1 = queue_spliterator_iterable_iterator_iterable_queue_iterable_iterator_serializable0.peek();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException");
        } catch (java.util.NoSuchElementException e) {
        }
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test215");
        edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>> queue_queue_iterable_queue_iterable_iterator_serializable0 = new edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>();
        boolean b1 = queue_queue_iterable_queue_iterable_iterator_serializable0.isEmpty();
        java.lang.String str2 = queue_queue_iterable_queue_iterable_iterator_serializable0.toString();
        int i3 = queue_queue_iterable_queue_iterable_iterator_serializable0.size();
        try {
            edu.osu.cs362.Queue<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>> queue_iterable_queue_iterable_iterator_serializable4 = queue_queue_iterable_queue_iterable_iterator_serializable0.dequeue();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException");
        } catch (java.util.NoSuchElementException e) {
        }
        org.junit.Assert.assertTrue(b1 == true);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
        org.junit.Assert.assertTrue(i3 == 0);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test216");
        edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>> queue_queue_iterable_iterator_serializable0 = new edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>();
        java.lang.String str1 = queue_queue_iterable_iterator_serializable0.toString();
        int i2 = queue_queue_iterable_iterator_serializable0.size();
        boolean b3 = queue_queue_iterable_iterator_serializable0.isEmpty();
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(b3 == true);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test217");
        edu.osu.cs362.Queue<java.lang.Iterable<java.io.Serializable>> queue_iterable_serializable0 = new edu.osu.cs362.Queue<java.lang.Iterable<java.io.Serializable>>();
        int i1 = queue_iterable_serializable0.size();
        try {
            java.lang.Iterable<java.io.Serializable> iterable_serializable2 = queue_iterable_serializable0.peek();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException");
        } catch (java.util.NoSuchElementException e) {
        }
        org.junit.Assert.assertTrue(i1 == 0);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test218");
        edu.osu.cs362.Queue<java.util.Iterator<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>> queue_iterator_iterable_queue_iterable_iterator_serializable0 = new edu.osu.cs362.Queue<java.util.Iterator<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>();
        java.util.Iterator<java.util.Iterator<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>> iterator_iterator_iterable_queue_iterable_iterator_serializable1 = queue_iterator_iterable_queue_iterable_iterator_serializable0.iterator();
        java.lang.String str2 = queue_iterator_iterable_queue_iterable_iterator_serializable0.toString();
        try {
            java.util.Iterator<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>> iterator_iterable_queue_iterable_iterator_serializable3 = queue_iterator_iterable_queue_iterable_iterator_serializable0.peek();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException");
        } catch (java.util.NoSuchElementException e) {
        }
        org.junit.Assert.assertNotNull(iterator_iterator_iterable_queue_iterable_iterator_serializable1);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test219");
        edu.osu.cs362.Queue<java.lang.Iterable<java.lang.Iterable<java.lang.Iterable<java.lang.Object>>>> queue_iterable_iterable_iterable_obj0 = new edu.osu.cs362.Queue<java.lang.Iterable<java.lang.Iterable<java.lang.Iterable<java.lang.Object>>>>();
        java.util.Iterator<java.lang.Iterable<java.lang.Iterable<java.lang.Iterable<java.lang.Object>>>> iterator_iterable_iterable_iterable_obj1 = queue_iterable_iterable_iterable_obj0.iterator();
        edu.osu.cs362.Queue<java.lang.Iterable<java.lang.Iterable<java.lang.Object>>> queue_iterable_iterable_obj2 = new edu.osu.cs362.Queue<java.lang.Iterable<java.lang.Iterable<java.lang.Object>>>();
        queue_iterable_iterable_iterable_obj0.enqueue((java.lang.Iterable<java.lang.Iterable<java.lang.Iterable<java.lang.Object>>>) queue_iterable_iterable_obj2);
        int i4 = queue_iterable_iterable_iterable_obj0.size();
        int i5 = queue_iterable_iterable_iterable_obj0.size();
        java.lang.Iterable<java.lang.Iterable<java.lang.Iterable<java.lang.Object>>> iterable_iterable_iterable_obj6 = queue_iterable_iterable_iterable_obj0.peek();
        boolean b7 = queue_iterable_iterable_iterable_obj0.isEmpty();
        org.junit.Assert.assertNotNull(iterator_iterable_iterable_iterable_obj1);
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertTrue(i5 == 1);
        org.junit.Assert.assertNotNull(iterable_iterable_iterable_obj6);
        org.junit.Assert.assertTrue(b7 == false);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test220");
        edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>> queue_iterable_iterator_serializable0 = new edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>();
        boolean b1 = queue_iterable_iterator_serializable0.isEmpty();
        java.lang.String str2 = queue_iterable_iterator_serializable0.toString();
        boolean b3 = queue_iterable_iterator_serializable0.isEmpty();
        try {
            java.lang.Iterable<java.util.Iterator<java.io.Serializable>> iterable_iterator_serializable4 = queue_iterable_iterator_serializable0.peek();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException");
        } catch (java.util.NoSuchElementException e) {
        }
        org.junit.Assert.assertTrue(b1 == true);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
        org.junit.Assert.assertTrue(b3 == true);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test221");
        edu.osu.cs362.Queue<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>> queue_iterable_queue_iterable_queue_iterable_iterator_serializable0 = new edu.osu.cs362.Queue<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>>();
        boolean b1 = queue_iterable_queue_iterable_queue_iterable_iterator_serializable0.isEmpty();
        boolean b2 = queue_iterable_queue_iterable_queue_iterable_iterator_serializable0.isEmpty();
        java.util.Iterator<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>> iterator_iterable_queue_iterable_queue_iterable_iterator_serializable3 = queue_iterable_queue_iterable_queue_iterable_iterator_serializable0.iterator();
        int i4 = queue_iterable_queue_iterable_queue_iterable_iterator_serializable0.size();
        org.junit.Assert.assertTrue(b1 == true);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNotNull(iterator_iterable_queue_iterable_queue_iterable_iterator_serializable3);
        org.junit.Assert.assertTrue(i4 == 0);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test222");
        edu.osu.cs362.Queue<java.io.Serializable> queue_serializable0 = new edu.osu.cs362.Queue<java.io.Serializable>();
        queue_serializable0.enqueue((java.io.Serializable) 1L);
        java.util.Iterator<java.io.Serializable> iterator_serializable3 = queue_serializable0.iterator();
        java.lang.String str4 = queue_serializable0.toString();
        java.util.Spliterator<java.io.Serializable> spliterator_serializable5 = queue_serializable0.spliterator();
        java.util.Iterator<java.io.Serializable> iterator_serializable6 = queue_serializable0.iterator();
        int i7 = queue_serializable0.size();
        int i8 = queue_serializable0.size();
        int i9 = queue_serializable0.size();
        org.junit.Assert.assertNotNull(iterator_serializable3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "1 " + "'", str4.equals("1 "));
        org.junit.Assert.assertNotNull(spliterator_serializable5);
        org.junit.Assert.assertNotNull(iterator_serializable6);
        org.junit.Assert.assertTrue(i7 == 1);
        org.junit.Assert.assertTrue(i8 == 1);
        org.junit.Assert.assertTrue(i9 == 1);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test223");
        edu.osu.cs362.Queue<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>> queue_iterable_queue_iterable_iterator_serializable0 = new edu.osu.cs362.Queue<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>();
        try {
            java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>> iterable_queue_iterable_iterator_serializable1 = queue_iterable_queue_iterable_iterator_serializable0.peek();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException");
        } catch (java.util.NoSuchElementException e) {
        }
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test224");
        edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>> queue_iterable_iterator_iterable_queue_iterable_iterator_serializable0 = new edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>>();
        java.util.Spliterator<java.lang.Iterable<java.util.Iterator<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>> spliterator_iterable_iterator_iterable_queue_iterable_iterator_serializable1 = queue_iterable_iterator_iterable_queue_iterable_iterator_serializable0.spliterator();
        java.lang.String str2 = queue_iterable_iterator_iterable_queue_iterable_iterator_serializable0.toString();
        try {
            java.lang.Iterable<java.util.Iterator<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>> iterable_iterator_iterable_queue_iterable_iterator_serializable3 = queue_iterable_iterator_iterable_queue_iterable_iterator_serializable0.peek();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException");
        } catch (java.util.NoSuchElementException e) {
        }
        org.junit.Assert.assertNotNull(spliterator_iterable_iterator_iterable_queue_iterable_iterator_serializable1);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test225");
        edu.osu.cs362.Queue<java.util.Iterator<java.io.Serializable>> queue_iterator_serializable0 = new edu.osu.cs362.Queue<java.util.Iterator<java.io.Serializable>>();
        java.lang.String str1 = queue_iterator_serializable0.toString();
        int i2 = queue_iterator_serializable0.size();
        try {
            java.util.Iterator<java.io.Serializable> iterator_serializable3 = queue_iterator_serializable0.peek();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException");
        } catch (java.util.NoSuchElementException e) {
        }
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertTrue(i2 == 0);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test226");
        edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.io.Serializable>> queue_queue_serializable0 = new edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.io.Serializable>>();
        java.util.Spliterator<edu.osu.cs362.Queue<java.io.Serializable>> spliterator_queue_serializable1 = queue_queue_serializable0.spliterator();
        java.util.Iterator<edu.osu.cs362.Queue<java.io.Serializable>> iterator_queue_serializable2 = queue_queue_serializable0.iterator();
        java.lang.String str3 = queue_queue_serializable0.toString();
        java.lang.String str4 = queue_queue_serializable0.toString();
        java.lang.String str5 = queue_queue_serializable0.toString();
        java.lang.String str6 = queue_queue_serializable0.toString();
        org.junit.Assert.assertNotNull(spliterator_queue_serializable1);
        org.junit.Assert.assertNotNull(iterator_queue_serializable2);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test227");
        edu.osu.cs362.Queue<java.util.Iterator<edu.osu.cs362.Queue<java.io.Serializable>>> queue_iterator_queue_serializable0 = new edu.osu.cs362.Queue<java.util.Iterator<edu.osu.cs362.Queue<java.io.Serializable>>>();
        int i1 = queue_iterator_queue_serializable0.size();
        java.util.Iterator<java.util.Iterator<edu.osu.cs362.Queue<java.io.Serializable>>> iterator_iterator_queue_serializable2 = queue_iterator_queue_serializable0.iterator();
        boolean b3 = queue_iterator_queue_serializable0.isEmpty();
        int i4 = queue_iterator_queue_serializable0.size();
        java.util.Iterator<java.util.Iterator<edu.osu.cs362.Queue<java.io.Serializable>>> iterator_iterator_queue_serializable5 = queue_iterator_queue_serializable0.iterator();
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertNotNull(iterator_iterator_queue_serializable2);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertNotNull(iterator_iterator_queue_serializable5);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test228");
        edu.osu.cs362.Queue<java.io.Serializable> queue_serializable0 = new edu.osu.cs362.Queue<java.io.Serializable>();
        queue_serializable0.enqueue((java.io.Serializable) 1L);
        java.io.Serializable serializable3 = queue_serializable0.peek();
        java.util.Spliterator<java.io.Serializable> spliterator_serializable4 = queue_serializable0.spliterator();
        java.io.Serializable serializable5 = queue_serializable0.dequeue();
        org.junit.Assert.assertTrue("'" + serializable3 + "' != '" + 1L + "'", serializable3.equals(1L));
        org.junit.Assert.assertNotNull(spliterator_serializable4);
        org.junit.Assert.assertTrue("'" + serializable5 + "' != '" + 1L + "'", serializable5.equals(1L));
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test229");
        edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.io.Serializable>> queue_queue_serializable0 = new edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.io.Serializable>>();
        java.util.Spliterator<edu.osu.cs362.Queue<java.io.Serializable>> spliterator_queue_serializable1 = queue_queue_serializable0.spliterator();
        java.util.Iterator<edu.osu.cs362.Queue<java.io.Serializable>> iterator_queue_serializable2 = queue_queue_serializable0.iterator();
        java.lang.String str3 = queue_queue_serializable0.toString();
        java.lang.String str4 = queue_queue_serializable0.toString();
        java.lang.String str5 = queue_queue_serializable0.toString();
        java.util.Iterator<edu.osu.cs362.Queue<java.io.Serializable>> iterator_queue_serializable6 = queue_queue_serializable0.iterator();
        org.junit.Assert.assertNotNull(spliterator_queue_serializable1);
        org.junit.Assert.assertNotNull(iterator_queue_serializable2);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertNotNull(iterator_queue_serializable6);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test230");
        edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.io.Serializable>> queue_queue_serializable0 = new edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.io.Serializable>>();
        java.util.Spliterator<edu.osu.cs362.Queue<java.io.Serializable>> spliterator_queue_serializable1 = queue_queue_serializable0.spliterator();
        boolean b2 = queue_queue_serializable0.isEmpty();
        edu.osu.cs362.Queue<java.io.Serializable> queue_serializable3 = new edu.osu.cs362.Queue<java.io.Serializable>();
        queue_serializable3.enqueue((java.io.Serializable) 1L);
        java.io.Serializable serializable6 = queue_serializable3.peek();
        java.io.Serializable serializable7 = queue_serializable3.peek();
        queue_queue_serializable0.enqueue(queue_serializable3);
        java.util.Iterator<edu.osu.cs362.Queue<java.io.Serializable>> iterator_queue_serializable9 = queue_queue_serializable0.iterator();
        edu.osu.cs362.Queue<java.io.Serializable> queue_serializable10 = new edu.osu.cs362.Queue<java.io.Serializable>();
        queue_serializable10.enqueue((java.io.Serializable) 1L);
        java.util.Iterator<java.io.Serializable> iterator_serializable13 = queue_serializable10.iterator();
        java.io.Serializable serializable14 = queue_serializable10.peek();
        java.io.Serializable serializable15 = queue_serializable10.peek();
        java.util.Spliterator<java.io.Serializable> spliterator_serializable16 = queue_serializable10.spliterator();
        queue_queue_serializable0.enqueue(queue_serializable10);
        edu.osu.cs362.Queue<java.io.Serializable> queue_serializable18 = queue_queue_serializable0.peek();
        org.junit.Assert.assertNotNull(spliterator_queue_serializable1);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue("'" + serializable6 + "' != '" + 1L + "'", serializable6.equals(1L));
        org.junit.Assert.assertTrue("'" + serializable7 + "' != '" + 1L + "'", serializable7.equals(1L));
        org.junit.Assert.assertNotNull(iterator_queue_serializable9);
        org.junit.Assert.assertNotNull(iterator_serializable13);
        org.junit.Assert.assertTrue("'" + serializable14 + "' != '" + 1L + "'", serializable14.equals(1L));
        org.junit.Assert.assertTrue("'" + serializable15 + "' != '" + 1L + "'", serializable15.equals(1L));
        org.junit.Assert.assertNotNull(spliterator_serializable16);
        org.junit.Assert.assertNotNull(queue_serializable18);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test231");
        edu.osu.cs362.Queue<java.io.Serializable> queue_serializable0 = new edu.osu.cs362.Queue<java.io.Serializable>();
        queue_serializable0.enqueue((java.io.Serializable) 1L);
        java.io.Serializable serializable3 = queue_serializable0.peek();
        java.util.Iterator<java.io.Serializable> iterator_serializable4 = queue_serializable0.iterator();
        java.lang.String str5 = queue_serializable0.toString();
        org.junit.Assert.assertTrue("'" + serializable3 + "' != '" + 1L + "'", serializable3.equals(1L));
        org.junit.Assert.assertNotNull(iterator_serializable4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "1 " + "'", str5.equals("1 "));
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test232");
        edu.osu.cs362.Queue<java.util.Iterator<java.io.Serializable>> queue_iterator_serializable0 = new edu.osu.cs362.Queue<java.util.Iterator<java.io.Serializable>>();
        boolean b1 = queue_iterator_serializable0.isEmpty();
        edu.osu.cs362.Queue<java.io.Serializable> queue_serializable2 = new edu.osu.cs362.Queue<java.io.Serializable>();
        queue_serializable2.enqueue((java.io.Serializable) 1L);
        java.util.Iterator<java.io.Serializable> iterator_serializable5 = queue_serializable2.iterator();
        queue_iterator_serializable0.enqueue(iterator_serializable5);
        int i7 = queue_iterator_serializable0.size();
        java.util.Iterator<java.io.Serializable> iterator_serializable8 = queue_iterator_serializable0.peek();
        boolean b9 = queue_iterator_serializable0.isEmpty();
        java.lang.String str10 = queue_iterator_serializable0.toString();
        org.junit.Assert.assertTrue(b1 == true);
        org.junit.Assert.assertNotNull(iterator_serializable5);
        org.junit.Assert.assertTrue(i7 == 1);
        org.junit.Assert.assertNotNull(iterator_serializable8);
        org.junit.Assert.assertTrue(b9 == false);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test233");
        edu.osu.cs362.Queue<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>> queue_iterable_queue_iterable_queue_iterable_iterator_serializable0 = new edu.osu.cs362.Queue<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>>();
        boolean b1 = queue_iterable_queue_iterable_queue_iterable_iterator_serializable0.isEmpty();
        java.util.Spliterator<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>> spliterator_iterable_queue_iterable_queue_iterable_iterator_serializable2 = queue_iterable_queue_iterable_queue_iterable_iterator_serializable0.spliterator();
        try {
            java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>> iterable_queue_iterable_queue_iterable_iterator_serializable3 = queue_iterable_queue_iterable_queue_iterable_iterator_serializable0.dequeue();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException");
        } catch (java.util.NoSuchElementException e) {
        }
        org.junit.Assert.assertTrue(b1 == true);
        org.junit.Assert.assertNotNull(spliterator_iterable_queue_iterable_queue_iterable_iterator_serializable2);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test234");
        edu.osu.cs362.Queue<java.lang.Iterable<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>> queue_iterable_iterable_iterator_serializable0 = new edu.osu.cs362.Queue<java.lang.Iterable<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>();
        java.util.Iterator<java.lang.Iterable<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>> iterator_iterable_iterable_iterator_serializable1 = queue_iterable_iterable_iterator_serializable0.iterator();
        java.util.Spliterator<java.lang.Iterable<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>> spliterator_iterable_iterable_iterator_serializable2 = queue_iterable_iterable_iterator_serializable0.spliterator();
        java.util.Iterator<java.lang.Iterable<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>> iterator_iterable_iterable_iterator_serializable3 = queue_iterable_iterable_iterator_serializable0.iterator();
        org.junit.Assert.assertNotNull(iterator_iterable_iterable_iterator_serializable1);
        org.junit.Assert.assertNotNull(spliterator_iterable_iterable_iterator_serializable2);
        org.junit.Assert.assertNotNull(iterator_iterable_iterable_iterator_serializable3);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test235");
        edu.osu.cs362.Queue<java.lang.Object> queue_obj0 = new edu.osu.cs362.Queue<java.lang.Object>();
        java.util.Iterator<java.lang.Object> iterator_obj1 = queue_obj0.iterator();
        queue_obj0.enqueue((java.lang.Object) 'a');
        java.lang.String str4 = queue_obj0.toString();
        java.lang.Object obj5 = queue_obj0.peek();
        org.junit.Assert.assertNotNull(iterator_obj1);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "a " + "'", str4.equals("a "));
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 'a' + "'", obj5.equals('a'));
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test236");
        edu.osu.cs362.Queue<edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.lang.Comparable<java.lang.String>>>> queue_queue_queue_comparable_str0 = new edu.osu.cs362.Queue<edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.lang.Comparable<java.lang.String>>>>();
        edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.lang.Comparable<java.lang.String>>> queue_queue_comparable_str1 = new edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.lang.Comparable<java.lang.String>>>();
        edu.osu.cs362.Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str2 = new edu.osu.cs362.Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str2.enqueue((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str5 = queue_comparable_str2.dequeue();
        queue_queue_comparable_str1.enqueue(queue_comparable_str2);
        queue_queue_queue_comparable_str0.enqueue(queue_queue_comparable_str1);
        int i8 = queue_queue_comparable_str1.size();
        java.lang.String str9 = queue_queue_comparable_str1.toString();
        org.junit.Assert.assertTrue("'" + comparable_str5 + "' != '" + "hi!" + "'", comparable_str5.equals("hi!"));
        org.junit.Assert.assertTrue(i8 == 1);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + " " + "'", str9.equals(" "));
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test237");
        edu.osu.cs362.Queue<java.util.Spliterator<java.io.Serializable>> queue_spliterator_serializable0 = new edu.osu.cs362.Queue<java.util.Spliterator<java.io.Serializable>>();
        try {
            java.util.Spliterator<java.io.Serializable> spliterator_serializable1 = queue_spliterator_serializable0.peek();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException");
        } catch (java.util.NoSuchElementException e) {
        }
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test238");
        edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.io.Serializable>> queue_queue_serializable0 = new edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.io.Serializable>>();
        int i1 = queue_queue_serializable0.size();
        boolean b2 = queue_queue_serializable0.isEmpty();
        int i3 = queue_queue_serializable0.size();
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 0);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test239");
        edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.io.Serializable>> queue_queue_serializable0 = new edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.io.Serializable>>();
        java.util.Spliterator<edu.osu.cs362.Queue<java.io.Serializable>> spliterator_queue_serializable1 = queue_queue_serializable0.spliterator();
        java.lang.String str2 = queue_queue_serializable0.toString();
        edu.osu.cs362.Queue<java.io.Serializable> queue_serializable3 = new edu.osu.cs362.Queue<java.io.Serializable>();
        queue_serializable3.enqueue((java.io.Serializable) 1L);
        java.io.Serializable serializable6 = queue_serializable3.peek();
        java.util.Iterator<java.io.Serializable> iterator_serializable7 = queue_serializable3.iterator();
        java.io.Serializable serializable8 = queue_serializable3.peek();
        queue_queue_serializable0.enqueue(queue_serializable3);
        java.util.Iterator<edu.osu.cs362.Queue<java.io.Serializable>> iterator_queue_serializable10 = queue_queue_serializable0.iterator();
        java.lang.String str11 = queue_queue_serializable0.toString();
        java.lang.String str12 = queue_queue_serializable0.toString();
        edu.osu.cs362.Queue<java.io.Serializable> queue_serializable13 = new edu.osu.cs362.Queue<java.io.Serializable>();
        queue_serializable13.enqueue((java.io.Serializable) 1L);
        java.io.Serializable serializable16 = queue_serializable13.peek();
        java.util.Iterator<java.io.Serializable> iterator_serializable17 = queue_serializable13.iterator();
        java.util.Iterator<java.io.Serializable> iterator_serializable18 = queue_serializable13.iterator();
        java.util.Spliterator<java.io.Serializable> spliterator_serializable19 = queue_serializable13.spliterator();
        queue_queue_serializable0.enqueue(queue_serializable13);
        edu.osu.cs362.Queue<java.io.Serializable> queue_serializable21 = new edu.osu.cs362.Queue<java.io.Serializable>();
        queue_serializable21.enqueue((java.io.Serializable) 1L);
        java.util.Iterator<java.io.Serializable> iterator_serializable24 = queue_serializable21.iterator();
        java.lang.String str25 = queue_serializable21.toString();
        java.util.Spliterator<java.io.Serializable> spliterator_serializable26 = queue_serializable21.spliterator();
        java.util.Iterator<java.io.Serializable> iterator_serializable27 = queue_serializable21.iterator();
        int i28 = queue_serializable21.size();
        queue_queue_serializable0.enqueue(queue_serializable21);
        org.junit.Assert.assertNotNull(spliterator_queue_serializable1);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
        org.junit.Assert.assertTrue("'" + serializable6 + "' != '" + 1L + "'", serializable6.equals(1L));
        org.junit.Assert.assertNotNull(iterator_serializable7);
        org.junit.Assert.assertTrue("'" + serializable8 + "' != '" + 1L + "'", serializable8.equals(1L));
        org.junit.Assert.assertNotNull(iterator_queue_serializable10);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "1  " + "'", str11.equals("1  "));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "1  " + "'", str12.equals("1  "));
        org.junit.Assert.assertTrue("'" + serializable16 + "' != '" + 1L + "'", serializable16.equals(1L));
        org.junit.Assert.assertNotNull(iterator_serializable17);
        org.junit.Assert.assertNotNull(iterator_serializable18);
        org.junit.Assert.assertNotNull(spliterator_serializable19);
        org.junit.Assert.assertNotNull(iterator_serializable24);
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "1 " + "'", str25.equals("1 "));
        org.junit.Assert.assertNotNull(spliterator_serializable26);
        org.junit.Assert.assertNotNull(iterator_serializable27);
        org.junit.Assert.assertTrue(i28 == 1);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test240");
        edu.osu.cs362.Queue<java.lang.Iterable<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>> queue_iterable_iterable_iterator_serializable0 = new edu.osu.cs362.Queue<java.lang.Iterable<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>();
        boolean b1 = queue_iterable_iterable_iterator_serializable0.isEmpty();
        java.util.Spliterator<java.lang.Iterable<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>> spliterator_iterable_iterable_iterator_serializable2 = queue_iterable_iterable_iterator_serializable0.spliterator();
        boolean b3 = queue_iterable_iterable_iterator_serializable0.isEmpty();
        try {
            java.lang.Iterable<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>> iterable_iterable_iterator_serializable4 = queue_iterable_iterable_iterator_serializable0.peek();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException");
        } catch (java.util.NoSuchElementException e) {
        }
        org.junit.Assert.assertTrue(b1 == true);
        org.junit.Assert.assertNotNull(spliterator_iterable_iterable_iterator_serializable2);
        org.junit.Assert.assertTrue(b3 == true);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test241");
        edu.osu.cs362.Queue<java.lang.Object> queue_obj0 = new edu.osu.cs362.Queue<java.lang.Object>();
        edu.osu.cs362.Queue<java.lang.Object> queue_obj1 = new edu.osu.cs362.Queue<java.lang.Object>();
        int i2 = queue_obj1.size();
        edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>> queue_iterable_iterator_serializable3 = new edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>();
        java.util.Iterator<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>> iterator_iterable_iterator_serializable4 = queue_iterable_iterator_serializable3.iterator();
        java.util.Spliterator<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>> spliterator_iterable_iterator_serializable5 = queue_iterable_iterator_serializable3.spliterator();
        java.lang.String str6 = queue_iterable_iterator_serializable3.toString();
        int i7 = queue_iterable_iterator_serializable3.size();
        queue_obj1.enqueue((java.lang.Object) queue_iterable_iterator_serializable3);
        java.lang.String str9 = queue_iterable_iterator_serializable3.toString();
        queue_obj0.enqueue((java.lang.Object) str9);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNotNull(iterator_iterable_iterator_serializable4);
        org.junit.Assert.assertNotNull(spliterator_iterable_iterator_serializable5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test242");
        edu.osu.cs362.Queue<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>> queue_iterable_queue_iterable_queue_iterable_iterator_serializable0 = new edu.osu.cs362.Queue<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>>();
        boolean b1 = queue_iterable_queue_iterable_queue_iterable_iterator_serializable0.isEmpty();
        boolean b2 = queue_iterable_queue_iterable_queue_iterable_iterator_serializable0.isEmpty();
        int i3 = queue_iterable_queue_iterable_queue_iterable_iterator_serializable0.size();
        org.junit.Assert.assertTrue(b1 == true);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 0);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test243");
        edu.osu.cs362.Queue<java.util.Iterator<java.lang.Iterable<java.io.Serializable>>> queue_iterator_iterable_serializable0 = new edu.osu.cs362.Queue<java.util.Iterator<java.lang.Iterable<java.io.Serializable>>>();
        java.util.Spliterator<java.util.Iterator<java.lang.Iterable<java.io.Serializable>>> spliterator_iterator_iterable_serializable1 = queue_iterator_iterable_serializable0.spliterator();
        try {
            java.util.Iterator<java.lang.Iterable<java.io.Serializable>> iterator_iterable_serializable2 = queue_iterator_iterable_serializable0.dequeue();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException");
        } catch (java.util.NoSuchElementException e) {
        }
        org.junit.Assert.assertNotNull(spliterator_iterator_iterable_serializable1);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test244");
        edu.osu.cs362.Queue<java.lang.Iterable<java.lang.Iterable<java.util.Iterator<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>>> queue_iterable_iterable_iterator_iterable_queue_iterable_iterator_serializable0 = new edu.osu.cs362.Queue<java.lang.Iterable<java.lang.Iterable<java.util.Iterator<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>>>();
        boolean b1 = queue_iterable_iterable_iterator_iterable_queue_iterable_iterator_serializable0.isEmpty();
        java.util.Iterator<java.lang.Iterable<java.lang.Iterable<java.util.Iterator<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>>> iterator_iterable_iterable_iterator_iterable_queue_iterable_iterator_serializable2 = queue_iterable_iterable_iterator_iterable_queue_iterable_iterator_serializable0.iterator();
        org.junit.Assert.assertTrue(b1 == true);
        org.junit.Assert.assertNotNull(iterator_iterable_iterable_iterator_iterable_queue_iterable_iterator_serializable2);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test245");
        edu.osu.cs362.Queue<edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>> queue_queue_queue_iterable_queue_iterable_iterator_serializable0 = new edu.osu.cs362.Queue<edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>>();
        java.util.Spliterator<edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>> spliterator_queue_queue_iterable_queue_iterable_iterator_serializable1 = queue_queue_queue_iterable_queue_iterable_iterator_serializable0.spliterator();
        try {
            edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>> queue_queue_iterable_queue_iterable_iterator_serializable2 = queue_queue_queue_iterable_queue_iterable_iterator_serializable0.dequeue();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException");
        } catch (java.util.NoSuchElementException e) {
        }
        org.junit.Assert.assertNotNull(spliterator_queue_queue_iterable_queue_iterable_iterator_serializable1);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test246");
        edu.osu.cs362.Queue<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>> queue_iterable_queue_iterable_iterator_serializable0 = new edu.osu.cs362.Queue<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>();
        java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>> iterable_queue_iterable_iterator_serializable1 = null;
        queue_iterable_queue_iterable_iterator_serializable0.enqueue(iterable_queue_iterable_iterator_serializable1);
        java.util.Iterator<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>> iterator_iterable_queue_iterable_iterator_serializable3 = queue_iterable_queue_iterable_iterator_serializable0.iterator();
        int i4 = queue_iterable_queue_iterable_iterator_serializable0.size();
        edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>> queue_queue_iterable_iterator_serializable5 = new edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>();
        boolean b6 = queue_queue_iterable_iterator_serializable5.isEmpty();
        boolean b7 = queue_queue_iterable_iterator_serializable5.isEmpty();
        boolean b8 = queue_queue_iterable_iterator_serializable5.isEmpty();
        int i9 = queue_queue_iterable_iterator_serializable5.size();
        int i10 = queue_queue_iterable_iterator_serializable5.size();
        queue_iterable_queue_iterable_iterator_serializable0.enqueue((java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>) queue_queue_iterable_iterator_serializable5);
        try {
            edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>> queue_iterable_iterator_serializable12 = queue_queue_iterable_iterator_serializable5.peek();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException");
        } catch (java.util.NoSuchElementException e) {
        }
        org.junit.Assert.assertNotNull(iterator_iterable_queue_iterable_iterator_serializable3);
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertTrue(i10 == 0);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test247");
        edu.osu.cs362.Queue<java.util.Iterator<java.io.Serializable>> queue_iterator_serializable0 = new edu.osu.cs362.Queue<java.util.Iterator<java.io.Serializable>>();
        boolean b1 = queue_iterator_serializable0.isEmpty();
        edu.osu.cs362.Queue<java.io.Serializable> queue_serializable2 = new edu.osu.cs362.Queue<java.io.Serializable>();
        queue_serializable2.enqueue((java.io.Serializable) 1L);
        java.util.Iterator<java.io.Serializable> iterator_serializable5 = queue_serializable2.iterator();
        queue_iterator_serializable0.enqueue(iterator_serializable5);
        int i7 = queue_iterator_serializable0.size();
        java.util.Iterator<java.io.Serializable> iterator_serializable8 = queue_iterator_serializable0.peek();
        boolean b9 = queue_iterator_serializable0.isEmpty();
        java.util.Iterator<java.io.Serializable> iterator_serializable10 = queue_iterator_serializable0.peek();
        java.util.Spliterator<java.util.Iterator<java.io.Serializable>> spliterator_iterator_serializable11 = queue_iterator_serializable0.spliterator();
        int i12 = queue_iterator_serializable0.size();
        boolean b13 = queue_iterator_serializable0.isEmpty();
        org.junit.Assert.assertTrue(b1 == true);
        org.junit.Assert.assertNotNull(iterator_serializable5);
        org.junit.Assert.assertTrue(i7 == 1);
        org.junit.Assert.assertNotNull(iterator_serializable8);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(iterator_serializable10);
        org.junit.Assert.assertNotNull(spliterator_iterator_serializable11);
        org.junit.Assert.assertTrue(i12 == 1);
        org.junit.Assert.assertTrue(b13 == false);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test248");
        edu.osu.cs362.Queue<java.util.Spliterator<java.util.Iterator<edu.osu.cs362.Queue<java.io.Serializable>>>> queue_spliterator_iterator_queue_serializable0 = new edu.osu.cs362.Queue<java.util.Spliterator<java.util.Iterator<edu.osu.cs362.Queue<java.io.Serializable>>>>();
        java.lang.String str1 = queue_spliterator_iterator_queue_serializable0.toString();
        java.util.Spliterator<java.util.Spliterator<java.util.Iterator<edu.osu.cs362.Queue<java.io.Serializable>>>> spliterator_spliterator_iterator_queue_serializable2 = queue_spliterator_iterator_queue_serializable0.spliterator();
        int i3 = queue_spliterator_iterator_queue_serializable0.size();
        edu.osu.cs362.Queue<java.util.Iterator<edu.osu.cs362.Queue<java.io.Serializable>>> queue_iterator_queue_serializable4 = new edu.osu.cs362.Queue<java.util.Iterator<edu.osu.cs362.Queue<java.io.Serializable>>>();
        int i5 = queue_iterator_queue_serializable4.size();
        java.util.Iterator<java.util.Iterator<edu.osu.cs362.Queue<java.io.Serializable>>> iterator_iterator_queue_serializable6 = queue_iterator_queue_serializable4.iterator();
        edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.io.Serializable>> queue_queue_serializable7 = new edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.io.Serializable>>();
        java.util.Spliterator<edu.osu.cs362.Queue<java.io.Serializable>> spliterator_queue_serializable8 = queue_queue_serializable7.spliterator();
        java.util.Iterator<edu.osu.cs362.Queue<java.io.Serializable>> iterator_queue_serializable9 = queue_queue_serializable7.iterator();
        queue_iterator_queue_serializable4.enqueue(iterator_queue_serializable9);
        java.util.Spliterator<java.util.Iterator<edu.osu.cs362.Queue<java.io.Serializable>>> spliterator_iterator_queue_serializable11 = queue_iterator_queue_serializable4.spliterator();
        queue_spliterator_iterator_queue_serializable0.enqueue(spliterator_iterator_queue_serializable11);
        boolean b13 = queue_spliterator_iterator_queue_serializable0.isEmpty();
        java.lang.String str14 = queue_spliterator_iterator_queue_serializable0.toString();
        java.lang.String str15 = queue_spliterator_iterator_queue_serializable0.toString();
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertNotNull(spliterator_spliterator_iterator_queue_serializable2);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertNotNull(iterator_iterator_queue_serializable6);
        org.junit.Assert.assertNotNull(spliterator_queue_serializable8);
        org.junit.Assert.assertNotNull(iterator_queue_serializable9);
        org.junit.Assert.assertNotNull(spliterator_iterator_queue_serializable11);
        org.junit.Assert.assertTrue(b13 == false);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test249");
        edu.osu.cs362.Queue<edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.lang.Comparable<java.lang.String>>>> queue_queue_queue_comparable_str0 = new edu.osu.cs362.Queue<edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.lang.Comparable<java.lang.String>>>>();
        edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.lang.Comparable<java.lang.String>>> queue_queue_comparable_str1 = new edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.lang.Comparable<java.lang.String>>>();
        edu.osu.cs362.Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str2 = new edu.osu.cs362.Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str2.enqueue((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str5 = queue_comparable_str2.dequeue();
        queue_queue_comparable_str1.enqueue(queue_comparable_str2);
        queue_queue_queue_comparable_str0.enqueue(queue_queue_comparable_str1);
        java.lang.String str8 = queue_queue_comparable_str1.toString();
        edu.osu.cs362.Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str9 = queue_queue_comparable_str1.peek();
        try {
            java.lang.Comparable<java.lang.String> comparable_str10 = queue_comparable_str9.dequeue();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException");
        } catch (java.util.NoSuchElementException e) {
        }
        org.junit.Assert.assertTrue("'" + comparable_str5 + "' != '" + "hi!" + "'", comparable_str5.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + " " + "'", str8.equals(" "));
        org.junit.Assert.assertNotNull(queue_comparable_str9);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test250");
        edu.osu.cs362.Queue<java.util.Iterator<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>> queue_iterator_iterable_iterator_serializable0 = new edu.osu.cs362.Queue<java.util.Iterator<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>();
        boolean b1 = queue_iterator_iterable_iterator_serializable0.isEmpty();
        java.lang.String str2 = queue_iterator_iterable_iterator_serializable0.toString();
        boolean b3 = queue_iterator_iterable_iterator_serializable0.isEmpty();
        org.junit.Assert.assertTrue(b1 == true);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
        org.junit.Assert.assertTrue(b3 == true);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test251");
        edu.osu.cs362.Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new edu.osu.cs362.Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.enqueue((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str3 = queue_comparable_str0.toString();
        int i4 = queue_comparable_str0.size();
        int i5 = queue_comparable_str0.size();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> iterator_comparable_str6 = queue_comparable_str0.iterator();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi! " + "'", str3.equals("hi! "));
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertTrue(i5 == 1);
        org.junit.Assert.assertNotNull(iterator_comparable_str6);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test252");
        edu.osu.cs362.Queue<java.util.Iterator<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>> queue_iterator_iterable_queue_iterable_iterator_serializable0 = new edu.osu.cs362.Queue<java.util.Iterator<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>();
        java.util.Iterator<java.util.Iterator<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>> iterator_iterator_iterable_queue_iterable_iterator_serializable1 = queue_iterator_iterable_queue_iterable_iterator_serializable0.iterator();
        try {
            java.util.Iterator<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>> iterator_iterable_queue_iterable_iterator_serializable2 = queue_iterator_iterable_queue_iterable_iterator_serializable0.peek();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException");
        } catch (java.util.NoSuchElementException e) {
        }
        org.junit.Assert.assertNotNull(iterator_iterator_iterable_queue_iterable_iterator_serializable1);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test253");
        edu.osu.cs362.Queue<java.io.Serializable> queue_serializable0 = new edu.osu.cs362.Queue<java.io.Serializable>();
        queue_serializable0.enqueue((java.io.Serializable) 1L);
        java.io.Serializable serializable3 = queue_serializable0.peek();
        java.io.Serializable serializable4 = queue_serializable0.peek();
        queue_serializable0.enqueue((java.io.Serializable) (short) -1);
        java.io.Serializable serializable7 = queue_serializable0.peek();
        java.util.Iterator<java.io.Serializable> iterator_serializable8 = queue_serializable0.iterator();
        java.util.Iterator<java.io.Serializable> iterator_serializable9 = queue_serializable0.iterator();
        int i10 = queue_serializable0.size();
        org.junit.Assert.assertTrue("'" + serializable3 + "' != '" + 1L + "'", serializable3.equals(1L));
        org.junit.Assert.assertTrue("'" + serializable4 + "' != '" + 1L + "'", serializable4.equals(1L));
        org.junit.Assert.assertTrue("'" + serializable7 + "' != '" + 1L + "'", serializable7.equals(1L));
        org.junit.Assert.assertNotNull(iterator_serializable8);
        org.junit.Assert.assertNotNull(iterator_serializable9);
        org.junit.Assert.assertTrue(i10 == 2);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test254");
        edu.osu.cs362.Queue<java.util.Iterator<java.lang.Iterable<java.util.Iterator<edu.osu.cs362.Queue<java.io.Serializable>>>>> queue_iterator_iterable_iterator_queue_serializable0 = new edu.osu.cs362.Queue<java.util.Iterator<java.lang.Iterable<java.util.Iterator<edu.osu.cs362.Queue<java.io.Serializable>>>>>();
        boolean b1 = queue_iterator_iterable_iterator_queue_serializable0.isEmpty();
        java.util.Iterator<java.util.Iterator<java.lang.Iterable<java.util.Iterator<edu.osu.cs362.Queue<java.io.Serializable>>>>> iterator_iterator_iterable_iterator_queue_serializable2 = queue_iterator_iterable_iterator_queue_serializable0.iterator();
        try {
            java.util.Iterator<java.lang.Iterable<java.util.Iterator<edu.osu.cs362.Queue<java.io.Serializable>>>> iterator_iterable_iterator_queue_serializable3 = queue_iterator_iterable_iterator_queue_serializable0.dequeue();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException");
        } catch (java.util.NoSuchElementException e) {
        }
        org.junit.Assert.assertTrue(b1 == true);
        org.junit.Assert.assertNotNull(iterator_iterator_iterable_iterator_queue_serializable2);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test255");
        edu.osu.cs362.Queue<java.lang.Iterable<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>> queue_iterable_iterable_iterator_serializable0 = new edu.osu.cs362.Queue<java.lang.Iterable<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>();
        boolean b1 = queue_iterable_iterable_iterator_serializable0.isEmpty();
        try {
            java.lang.Iterable<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>> iterable_iterable_iterator_serializable2 = queue_iterable_iterable_iterator_serializable0.dequeue();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException");
        } catch (java.util.NoSuchElementException e) {
        }
        org.junit.Assert.assertTrue(b1 == true);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test256");
        edu.osu.cs362.Queue<java.util.Iterator<edu.osu.cs362.Queue<java.io.Serializable>>> queue_iterator_queue_serializable0 = new edu.osu.cs362.Queue<java.util.Iterator<edu.osu.cs362.Queue<java.io.Serializable>>>();
        int i1 = queue_iterator_queue_serializable0.size();
        try {
            java.util.Iterator<edu.osu.cs362.Queue<java.io.Serializable>> iterator_queue_serializable2 = queue_iterator_queue_serializable0.dequeue();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException");
        } catch (java.util.NoSuchElementException e) {
        }
        org.junit.Assert.assertTrue(i1 == 0);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test257");
        edu.osu.cs362.Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new edu.osu.cs362.Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.enqueue((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str3 = queue_comparable_str0.toString();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> iterator_comparable_str4 = queue_comparable_str0.iterator();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> spliterator_comparable_str5 = queue_comparable_str0.spliterator();
        boolean b6 = queue_comparable_str0.isEmpty();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi! " + "'", str3.equals("hi! "));
        org.junit.Assert.assertNotNull(iterator_comparable_str4);
        org.junit.Assert.assertNotNull(spliterator_comparable_str5);
        org.junit.Assert.assertTrue(b6 == false);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test258");
        edu.osu.cs362.Queue<java.util.Iterator<edu.osu.cs362.Queue<java.io.Serializable>>> queue_iterator_queue_serializable0 = new edu.osu.cs362.Queue<java.util.Iterator<edu.osu.cs362.Queue<java.io.Serializable>>>();
        int i1 = queue_iterator_queue_serializable0.size();
        java.util.Iterator<java.util.Iterator<edu.osu.cs362.Queue<java.io.Serializable>>> iterator_iterator_queue_serializable2 = queue_iterator_queue_serializable0.iterator();
        edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.io.Serializable>> queue_queue_serializable3 = new edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.io.Serializable>>();
        java.util.Spliterator<edu.osu.cs362.Queue<java.io.Serializable>> spliterator_queue_serializable4 = queue_queue_serializable3.spliterator();
        java.util.Iterator<edu.osu.cs362.Queue<java.io.Serializable>> iterator_queue_serializable5 = queue_queue_serializable3.iterator();
        queue_iterator_queue_serializable0.enqueue(iterator_queue_serializable5);
        java.lang.String str7 = queue_iterator_queue_serializable0.toString();
        java.util.Iterator<java.util.Iterator<edu.osu.cs362.Queue<java.io.Serializable>>> iterator_iterator_queue_serializable8 = queue_iterator_queue_serializable0.iterator();
        java.util.Iterator<edu.osu.cs362.Queue<java.io.Serializable>> iterator_queue_serializable9 = queue_iterator_queue_serializable0.peek();
        java.util.Iterator<edu.osu.cs362.Queue<java.io.Serializable>> iterator_queue_serializable10 = queue_iterator_queue_serializable0.dequeue();
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertNotNull(iterator_iterator_queue_serializable2);
        org.junit.Assert.assertNotNull(spliterator_queue_serializable4);
        org.junit.Assert.assertNotNull(iterator_queue_serializable5);
        org.junit.Assert.assertNotNull(iterator_iterator_queue_serializable8);
        org.junit.Assert.assertNotNull(iterator_queue_serializable9);
        org.junit.Assert.assertNotNull(iterator_queue_serializable10);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test259");
        edu.osu.cs362.Queue<java.util.Spliterator<java.util.Iterator<java.io.Serializable>>> queue_spliterator_iterator_serializable0 = new edu.osu.cs362.Queue<java.util.Spliterator<java.util.Iterator<java.io.Serializable>>>();
        java.lang.String str1 = queue_spliterator_iterator_serializable0.toString();
        java.util.Spliterator<java.util.Spliterator<java.util.Iterator<java.io.Serializable>>> spliterator_spliterator_iterator_serializable2 = queue_spliterator_iterator_serializable0.spliterator();
        java.util.Iterator<java.util.Spliterator<java.util.Iterator<java.io.Serializable>>> iterator_spliterator_iterator_serializable3 = queue_spliterator_iterator_serializable0.iterator();
        try {
            java.util.Spliterator<java.util.Iterator<java.io.Serializable>> spliterator_iterator_serializable4 = queue_spliterator_iterator_serializable0.dequeue();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException");
        } catch (java.util.NoSuchElementException e) {
        }
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertNotNull(spliterator_spliterator_iterator_serializable2);
        org.junit.Assert.assertNotNull(iterator_spliterator_iterator_serializable3);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test260");
        edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>> queue_queue_iterable_iterator_serializable0 = new edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>();
        boolean b1 = queue_queue_iterable_iterator_serializable0.isEmpty();
        java.util.Spliterator<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>> spliterator_queue_iterable_iterator_serializable2 = queue_queue_iterable_iterator_serializable0.spliterator();
        try {
            edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>> queue_iterable_iterator_serializable3 = queue_queue_iterable_iterator_serializable0.peek();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException");
        } catch (java.util.NoSuchElementException e) {
        }
        org.junit.Assert.assertTrue(b1 == true);
        org.junit.Assert.assertNotNull(spliterator_queue_iterable_iterator_serializable2);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test261");
        edu.osu.cs362.Queue<java.lang.Iterable<java.lang.Iterable<java.lang.Iterable<java.lang.Object>>>> queue_iterable_iterable_iterable_obj0 = new edu.osu.cs362.Queue<java.lang.Iterable<java.lang.Iterable<java.lang.Iterable<java.lang.Object>>>>();
        java.util.Iterator<java.lang.Iterable<java.lang.Iterable<java.lang.Iterable<java.lang.Object>>>> iterator_iterable_iterable_iterable_obj1 = queue_iterable_iterable_iterable_obj0.iterator();
        edu.osu.cs362.Queue<java.lang.Iterable<java.lang.Iterable<java.lang.Object>>> queue_iterable_iterable_obj2 = new edu.osu.cs362.Queue<java.lang.Iterable<java.lang.Iterable<java.lang.Object>>>();
        queue_iterable_iterable_iterable_obj0.enqueue((java.lang.Iterable<java.lang.Iterable<java.lang.Iterable<java.lang.Object>>>) queue_iterable_iterable_obj2);
        int i4 = queue_iterable_iterable_obj2.size();
        boolean b5 = queue_iterable_iterable_obj2.isEmpty();
        java.util.Iterator<java.lang.Iterable<java.lang.Iterable<java.lang.Object>>> iterator_iterable_iterable_obj6 = queue_iterable_iterable_obj2.iterator();
        boolean b7 = queue_iterable_iterable_obj2.isEmpty();
        org.junit.Assert.assertNotNull(iterator_iterable_iterable_iterable_obj1);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertNotNull(iterator_iterable_iterable_obj6);
        org.junit.Assert.assertTrue(b7 == true);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test262");
        edu.osu.cs362.Queue<java.lang.Iterable<java.lang.Iterable<java.lang.Object>>> queue_iterable_iterable_obj0 = new edu.osu.cs362.Queue<java.lang.Iterable<java.lang.Iterable<java.lang.Object>>>();
        boolean b1 = queue_iterable_iterable_obj0.isEmpty();
        java.util.Spliterator<java.lang.Iterable<java.lang.Iterable<java.lang.Object>>> spliterator_iterable_iterable_obj2 = queue_iterable_iterable_obj0.spliterator();
        org.junit.Assert.assertTrue(b1 == true);
        org.junit.Assert.assertNotNull(spliterator_iterable_iterable_obj2);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test263");
        edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>> queue_queue_iterable_iterator_serializable0 = new edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>();
        java.lang.String str1 = queue_queue_iterable_iterator_serializable0.toString();
        int i2 = queue_queue_iterable_iterator_serializable0.size();
        edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>> queue_iterable_iterator_serializable3 = new edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>();
        java.util.Iterator<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>> iterator_iterable_iterator_serializable4 = queue_iterable_iterator_serializable3.iterator();
        java.util.Spliterator<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>> spliterator_iterable_iterator_serializable5 = queue_iterable_iterator_serializable3.spliterator();
        java.util.Spliterator<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>> spliterator_iterable_iterator_serializable6 = queue_iterable_iterator_serializable3.spliterator();
        queue_queue_iterable_iterator_serializable0.enqueue(queue_iterable_iterator_serializable3);
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNotNull(iterator_iterable_iterator_serializable4);
        org.junit.Assert.assertNotNull(spliterator_iterable_iterator_serializable5);
        org.junit.Assert.assertNotNull(spliterator_iterable_iterator_serializable6);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test264");
        edu.osu.cs362.Queue<java.util.Spliterator<java.util.Iterator<java.io.Serializable>>> queue_spliterator_iterator_serializable0 = new edu.osu.cs362.Queue<java.util.Spliterator<java.util.Iterator<java.io.Serializable>>>();
        java.lang.String str1 = queue_spliterator_iterator_serializable0.toString();
        java.util.Spliterator<java.util.Spliterator<java.util.Iterator<java.io.Serializable>>> spliterator_spliterator_iterator_serializable2 = queue_spliterator_iterator_serializable0.spliterator();
        java.util.Iterator<java.util.Spliterator<java.util.Iterator<java.io.Serializable>>> iterator_spliterator_iterator_serializable3 = queue_spliterator_iterator_serializable0.iterator();
        try {
            java.util.Spliterator<java.util.Iterator<java.io.Serializable>> spliterator_iterator_serializable4 = queue_spliterator_iterator_serializable0.peek();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException");
        } catch (java.util.NoSuchElementException e) {
        }
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertNotNull(spliterator_spliterator_iterator_serializable2);
        org.junit.Assert.assertNotNull(iterator_spliterator_iterator_serializable3);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test265");
        edu.osu.cs362.Queue<java.util.Iterator<edu.osu.cs362.Queue<java.io.Serializable>>> queue_iterator_queue_serializable0 = new edu.osu.cs362.Queue<java.util.Iterator<edu.osu.cs362.Queue<java.io.Serializable>>>();
        java.util.Spliterator<java.util.Iterator<edu.osu.cs362.Queue<java.io.Serializable>>> spliterator_iterator_queue_serializable1 = queue_iterator_queue_serializable0.spliterator();
        boolean b2 = queue_iterator_queue_serializable0.isEmpty();
        org.junit.Assert.assertNotNull(spliterator_iterator_queue_serializable1);
        org.junit.Assert.assertTrue(b2 == true);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test266");
        edu.osu.cs362.Queue<java.util.Iterator<java.io.Serializable>> queue_iterator_serializable0 = new edu.osu.cs362.Queue<java.util.Iterator<java.io.Serializable>>();
        boolean b1 = queue_iterator_serializable0.isEmpty();
        edu.osu.cs362.Queue<java.io.Serializable> queue_serializable2 = new edu.osu.cs362.Queue<java.io.Serializable>();
        queue_serializable2.enqueue((java.io.Serializable) 1L);
        java.util.Iterator<java.io.Serializable> iterator_serializable5 = queue_serializable2.iterator();
        queue_iterator_serializable0.enqueue(iterator_serializable5);
        int i7 = queue_iterator_serializable0.size();
        java.util.Iterator<java.io.Serializable> iterator_serializable8 = queue_iterator_serializable0.peek();
        edu.osu.cs362.Queue<java.util.Iterator<java.io.Serializable>> queue_iterator_serializable9 = new edu.osu.cs362.Queue<java.util.Iterator<java.io.Serializable>>();
        boolean b10 = queue_iterator_serializable9.isEmpty();
        edu.osu.cs362.Queue<java.io.Serializable> queue_serializable11 = new edu.osu.cs362.Queue<java.io.Serializable>();
        queue_serializable11.enqueue((java.io.Serializable) 1L);
        java.io.Serializable serializable14 = queue_serializable11.peek();
        java.util.Iterator<java.io.Serializable> iterator_serializable15 = queue_serializable11.iterator();
        java.util.Iterator<java.io.Serializable> iterator_serializable16 = queue_serializable11.iterator();
        queue_iterator_serializable9.enqueue(iterator_serializable16);
        java.util.Iterator<java.io.Serializable> iterator_serializable18 = queue_iterator_serializable9.peek();
        edu.osu.cs362.Queue<java.io.Serializable> queue_serializable19 = new edu.osu.cs362.Queue<java.io.Serializable>();
        queue_serializable19.enqueue((java.io.Serializable) 1L);
        java.util.Iterator<java.io.Serializable> iterator_serializable22 = queue_serializable19.iterator();
        java.lang.String str23 = queue_serializable19.toString();
        java.util.Spliterator<java.io.Serializable> spliterator_serializable24 = queue_serializable19.spliterator();
        java.util.Iterator<java.io.Serializable> iterator_serializable25 = queue_serializable19.iterator();
        queue_iterator_serializable9.enqueue(iterator_serializable25);
        queue_iterator_serializable0.enqueue(iterator_serializable25);
        org.junit.Assert.assertTrue(b1 == true);
        org.junit.Assert.assertNotNull(iterator_serializable5);
        org.junit.Assert.assertTrue(i7 == 1);
        org.junit.Assert.assertNotNull(iterator_serializable8);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue("'" + serializable14 + "' != '" + 1L + "'", serializable14.equals(1L));
        org.junit.Assert.assertNotNull(iterator_serializable15);
        org.junit.Assert.assertNotNull(iterator_serializable16);
        org.junit.Assert.assertNotNull(iterator_serializable18);
        org.junit.Assert.assertNotNull(iterator_serializable22);
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "1 " + "'", str23.equals("1 "));
        org.junit.Assert.assertNotNull(spliterator_serializable24);
        org.junit.Assert.assertNotNull(iterator_serializable25);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test267");
        edu.osu.cs362.Queue<edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.lang.Comparable<java.lang.String>>>> queue_queue_queue_comparable_str0 = new edu.osu.cs362.Queue<edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.lang.Comparable<java.lang.String>>>>();
        boolean b1 = queue_queue_queue_comparable_str0.isEmpty();
        java.util.Iterator<edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.lang.Comparable<java.lang.String>>>> iterator_queue_queue_comparable_str2 = queue_queue_queue_comparable_str0.iterator();
        java.util.Spliterator<edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.lang.Comparable<java.lang.String>>>> spliterator_queue_queue_comparable_str3 = queue_queue_queue_comparable_str0.spliterator();
        java.util.Spliterator<edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.lang.Comparable<java.lang.String>>>> spliterator_queue_queue_comparable_str4 = queue_queue_queue_comparable_str0.spliterator();
        edu.osu.cs362.Queue<edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.lang.Comparable<java.lang.String>>>> queue_queue_queue_comparable_str5 = new edu.osu.cs362.Queue<edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.lang.Comparable<java.lang.String>>>>();
        edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.lang.Comparable<java.lang.String>>> queue_queue_comparable_str6 = new edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.lang.Comparable<java.lang.String>>>();
        edu.osu.cs362.Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str7 = new edu.osu.cs362.Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str7.enqueue((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str10 = queue_comparable_str7.dequeue();
        queue_queue_comparable_str6.enqueue(queue_comparable_str7);
        queue_queue_queue_comparable_str5.enqueue(queue_queue_comparable_str6);
        edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.lang.Comparable<java.lang.String>>> queue_queue_comparable_str13 = queue_queue_queue_comparable_str5.peek();
        edu.osu.cs362.Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str14 = queue_queue_comparable_str13.dequeue();
        queue_queue_queue_comparable_str0.enqueue(queue_queue_comparable_str13);
        org.junit.Assert.assertTrue(b1 == true);
        org.junit.Assert.assertNotNull(iterator_queue_queue_comparable_str2);
        org.junit.Assert.assertNotNull(spliterator_queue_queue_comparable_str3);
        org.junit.Assert.assertNotNull(spliterator_queue_queue_comparable_str4);
        org.junit.Assert.assertTrue("'" + comparable_str10 + "' != '" + "hi!" + "'", comparable_str10.equals("hi!"));
        org.junit.Assert.assertNotNull(queue_queue_comparable_str13);
        org.junit.Assert.assertNotNull(queue_comparable_str14);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test268");
        edu.osu.cs362.Queue<java.util.Spliterator<java.io.Serializable>> queue_spliterator_serializable0 = new edu.osu.cs362.Queue<java.util.Spliterator<java.io.Serializable>>();
        java.util.Iterator<java.util.Spliterator<java.io.Serializable>> iterator_spliterator_serializable1 = queue_spliterator_serializable0.iterator();
        try {
            java.util.Spliterator<java.io.Serializable> spliterator_serializable2 = queue_spliterator_serializable0.dequeue();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException");
        } catch (java.util.NoSuchElementException e) {
        }
        org.junit.Assert.assertNotNull(iterator_spliterator_serializable1);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test269");
        edu.osu.cs362.Queue<java.lang.Iterable<java.lang.Iterable<java.lang.Iterable<java.lang.Object>>>> queue_iterable_iterable_iterable_obj0 = new edu.osu.cs362.Queue<java.lang.Iterable<java.lang.Iterable<java.lang.Iterable<java.lang.Object>>>>();
        java.util.Iterator<java.lang.Iterable<java.lang.Iterable<java.lang.Iterable<java.lang.Object>>>> iterator_iterable_iterable_iterable_obj1 = queue_iterable_iterable_iterable_obj0.iterator();
        edu.osu.cs362.Queue<java.lang.Iterable<java.lang.Iterable<java.lang.Object>>> queue_iterable_iterable_obj2 = new edu.osu.cs362.Queue<java.lang.Iterable<java.lang.Iterable<java.lang.Object>>>();
        queue_iterable_iterable_iterable_obj0.enqueue((java.lang.Iterable<java.lang.Iterable<java.lang.Iterable<java.lang.Object>>>) queue_iterable_iterable_obj2);
        int i4 = queue_iterable_iterable_obj2.size();
        boolean b5 = queue_iterable_iterable_obj2.isEmpty();
        java.util.Iterator<java.lang.Iterable<java.lang.Iterable<java.lang.Object>>> iterator_iterable_iterable_obj6 = queue_iterable_iterable_obj2.iterator();
        int i7 = queue_iterable_iterable_obj2.size();
        java.util.Spliterator<java.lang.Iterable<java.lang.Iterable<java.lang.Object>>> spliterator_iterable_iterable_obj8 = queue_iterable_iterable_obj2.spliterator();
        int i9 = queue_iterable_iterable_obj2.size();
        try {
            java.lang.Iterable<java.lang.Iterable<java.lang.Object>> iterable_iterable_obj10 = queue_iterable_iterable_obj2.dequeue();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException");
        } catch (java.util.NoSuchElementException e) {
        }
        org.junit.Assert.assertNotNull(iterator_iterable_iterable_iterable_obj1);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertNotNull(iterator_iterable_iterable_obj6);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertNotNull(spliterator_iterable_iterable_obj8);
        org.junit.Assert.assertTrue(i9 == 0);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test270");
        edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.util.Iterator<edu.osu.cs362.Queue<java.io.Serializable>>>> queue_queue_iterator_queue_serializable0 = new edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.util.Iterator<edu.osu.cs362.Queue<java.io.Serializable>>>>();
        try {
            edu.osu.cs362.Queue<java.util.Iterator<edu.osu.cs362.Queue<java.io.Serializable>>> queue_iterator_queue_serializable1 = queue_queue_iterator_queue_serializable0.dequeue();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException");
        } catch (java.util.NoSuchElementException e) {
        }
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test271");
        edu.osu.cs362.Queue<edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.lang.Comparable<java.lang.String>>>> queue_queue_queue_comparable_str0 = new edu.osu.cs362.Queue<edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.lang.Comparable<java.lang.String>>>>();
        boolean b1 = queue_queue_queue_comparable_str0.isEmpty();
        java.util.Iterator<edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.lang.Comparable<java.lang.String>>>> iterator_queue_queue_comparable_str2 = queue_queue_queue_comparable_str0.iterator();
        int i3 = queue_queue_queue_comparable_str0.size();
        boolean b4 = queue_queue_queue_comparable_str0.isEmpty();
        org.junit.Assert.assertTrue(b1 == true);
        org.junit.Assert.assertNotNull(iterator_queue_queue_comparable_str2);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(b4 == true);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test272");
        edu.osu.cs362.Queue<java.lang.Iterable<java.lang.Object>> queue_iterable_obj0 = new edu.osu.cs362.Queue<java.lang.Iterable<java.lang.Object>>();
        edu.osu.cs362.Queue<java.lang.Object> queue_obj1 = new edu.osu.cs362.Queue<java.lang.Object>();
        int i2 = queue_obj1.size();
        java.util.Spliterator<java.lang.Object> spliterator_obj3 = queue_obj1.spliterator();
        edu.osu.cs362.Queue<java.util.Iterator<java.io.Serializable>> queue_iterator_serializable4 = new edu.osu.cs362.Queue<java.util.Iterator<java.io.Serializable>>();
        boolean b5 = queue_iterator_serializable4.isEmpty();
        edu.osu.cs362.Queue<java.io.Serializable> queue_serializable6 = new edu.osu.cs362.Queue<java.io.Serializable>();
        queue_serializable6.enqueue((java.io.Serializable) 1L);
        java.util.Iterator<java.io.Serializable> iterator_serializable9 = queue_serializable6.iterator();
        queue_iterator_serializable4.enqueue(iterator_serializable9);
        int i11 = queue_iterator_serializable4.size();
        java.util.Iterator<java.io.Serializable> iterator_serializable12 = queue_iterator_serializable4.peek();
        boolean b13 = queue_iterator_serializable4.isEmpty();
        java.util.Iterator<java.io.Serializable> iterator_serializable14 = queue_iterator_serializable4.peek();
        queue_obj1.enqueue((java.lang.Object) queue_iterator_serializable4);
        queue_iterable_obj0.enqueue((java.lang.Iterable<java.lang.Object>) queue_obj1);
        java.util.Spliterator<java.lang.Iterable<java.lang.Object>> spliterator_iterable_obj17 = queue_iterable_obj0.spliterator();
        boolean b18 = queue_iterable_obj0.isEmpty();
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNotNull(spliterator_obj3);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertNotNull(iterator_serializable9);
        org.junit.Assert.assertTrue(i11 == 1);
        org.junit.Assert.assertNotNull(iterator_serializable12);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNotNull(iterator_serializable14);
        org.junit.Assert.assertNotNull(spliterator_iterable_obj17);
        org.junit.Assert.assertTrue(b18 == false);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test273");
        edu.osu.cs362.Queue<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>> queue_iterable_queue_iterable_iterator_serializable0 = new edu.osu.cs362.Queue<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>();
        java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>> iterable_queue_iterable_iterator_serializable1 = null;
        queue_iterable_queue_iterable_iterator_serializable0.enqueue(iterable_queue_iterable_iterator_serializable1);
        java.util.Iterator<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>> iterator_iterable_queue_iterable_iterator_serializable3 = queue_iterable_queue_iterable_iterator_serializable0.iterator();
        int i4 = queue_iterable_queue_iterable_iterator_serializable0.size();
        edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>> queue_queue_iterable_iterator_serializable5 = new edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>();
        boolean b6 = queue_queue_iterable_iterator_serializable5.isEmpty();
        boolean b7 = queue_queue_iterable_iterator_serializable5.isEmpty();
        boolean b8 = queue_queue_iterable_iterator_serializable5.isEmpty();
        int i9 = queue_queue_iterable_iterator_serializable5.size();
        int i10 = queue_queue_iterable_iterator_serializable5.size();
        queue_iterable_queue_iterable_iterator_serializable0.enqueue((java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>) queue_queue_iterable_iterator_serializable5);
        boolean b12 = queue_queue_iterable_iterator_serializable5.isEmpty();
        org.junit.Assert.assertNotNull(iterator_iterable_queue_iterable_iterator_serializable3);
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertTrue(i10 == 0);
        org.junit.Assert.assertTrue(b12 == true);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test274");
        edu.osu.cs362.Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new edu.osu.cs362.Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.enqueue((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str3 = queue_comparable_str0.toString();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> spliterator_comparable_str4 = queue_comparable_str0.spliterator();
        queue_comparable_str0.enqueue((java.lang.Comparable<java.lang.String>) "hi! ");
        java.lang.Comparable<java.lang.String> comparable_str7 = queue_comparable_str0.dequeue();
        java.lang.String str8 = queue_comparable_str0.toString();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi! " + "'", str3.equals("hi! "));
        org.junit.Assert.assertNotNull(spliterator_comparable_str4);
        org.junit.Assert.assertTrue("'" + comparable_str7 + "' != '" + "hi!" + "'", comparable_str7.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "hi!  " + "'", str8.equals("hi!  "));
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test275");
        edu.osu.cs362.Queue<java.lang.Iterable<java.lang.Iterable<java.util.Iterator<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>>> queue_iterable_iterable_iterator_iterable_queue_iterable_iterator_serializable0 = new edu.osu.cs362.Queue<java.lang.Iterable<java.lang.Iterable<java.util.Iterator<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>>>();
        boolean b1 = queue_iterable_iterable_iterator_iterable_queue_iterable_iterator_serializable0.isEmpty();
        boolean b2 = queue_iterable_iterable_iterator_iterable_queue_iterable_iterator_serializable0.isEmpty();
        java.lang.String str3 = queue_iterable_iterable_iterator_iterable_queue_iterable_iterator_serializable0.toString();
        java.util.Spliterator<java.lang.Iterable<java.lang.Iterable<java.util.Iterator<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>>> spliterator_iterable_iterable_iterator_iterable_queue_iterable_iterator_serializable4 = queue_iterable_iterable_iterator_iterable_queue_iterable_iterator_serializable0.spliterator();
        try {
            java.lang.Iterable<java.lang.Iterable<java.util.Iterator<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>> iterable_iterable_iterator_iterable_queue_iterable_iterator_serializable5 = queue_iterable_iterable_iterator_iterable_queue_iterable_iterator_serializable0.peek();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException");
        } catch (java.util.NoSuchElementException e) {
        }
        org.junit.Assert.assertTrue(b1 == true);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertNotNull(spliterator_iterable_iterable_iterator_iterable_queue_iterable_iterator_serializable4);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test276");
        edu.osu.cs362.Queue<java.lang.Iterable<java.util.Spliterator<java.util.Iterator<java.io.Serializable>>>> queue_iterable_spliterator_iterator_serializable0 = new edu.osu.cs362.Queue<java.lang.Iterable<java.util.Spliterator<java.util.Iterator<java.io.Serializable>>>>();
        java.util.Iterator<java.lang.Iterable<java.util.Spliterator<java.util.Iterator<java.io.Serializable>>>> iterator_iterable_spliterator_iterator_serializable1 = queue_iterable_spliterator_iterator_serializable0.iterator();
        edu.osu.cs362.Queue<java.util.Spliterator<java.util.Iterator<java.io.Serializable>>> queue_spliterator_iterator_serializable2 = new edu.osu.cs362.Queue<java.util.Spliterator<java.util.Iterator<java.io.Serializable>>>();
        java.lang.String str3 = queue_spliterator_iterator_serializable2.toString();
        java.util.Spliterator<java.util.Spliterator<java.util.Iterator<java.io.Serializable>>> spliterator_spliterator_iterator_serializable4 = queue_spliterator_iterator_serializable2.spliterator();
        queue_iterable_spliterator_iterator_serializable0.enqueue((java.lang.Iterable<java.util.Spliterator<java.util.Iterator<java.io.Serializable>>>) queue_spliterator_iterator_serializable2);
        try {
            java.util.Spliterator<java.util.Iterator<java.io.Serializable>> spliterator_iterator_serializable6 = queue_spliterator_iterator_serializable2.dequeue();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException");
        } catch (java.util.NoSuchElementException e) {
        }
        org.junit.Assert.assertNotNull(iterator_iterable_spliterator_iterator_serializable1);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertNotNull(spliterator_spliterator_iterator_serializable4);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test277");
        edu.osu.cs362.Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new edu.osu.cs362.Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.enqueue((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str3 = queue_comparable_str0.toString();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> iterator_comparable_str4 = queue_comparable_str0.iterator();
        queue_comparable_str0.enqueue((java.lang.Comparable<java.lang.String>) "");
        java.lang.String str7 = queue_comparable_str0.toString();
        boolean b8 = queue_comparable_str0.isEmpty();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi! " + "'", str3.equals("hi! "));
        org.junit.Assert.assertNotNull(iterator_comparable_str4);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi!  " + "'", str7.equals("hi!  "));
        org.junit.Assert.assertTrue(b8 == false);
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test278");
        edu.osu.cs362.Queue<java.util.Spliterator<java.lang.Iterable<java.util.Iterator<java.lang.Object>>>> queue_spliterator_iterable_iterator_obj0 = new edu.osu.cs362.Queue<java.util.Spliterator<java.lang.Iterable<java.util.Iterator<java.lang.Object>>>>();
        int i1 = queue_spliterator_iterable_iterator_obj0.size();
        java.util.Iterator<java.util.Spliterator<java.lang.Iterable<java.util.Iterator<java.lang.Object>>>> iterator_spliterator_iterable_iterator_obj2 = queue_spliterator_iterable_iterator_obj0.iterator();
        java.util.Spliterator<java.util.Spliterator<java.lang.Iterable<java.util.Iterator<java.lang.Object>>>> spliterator_spliterator_iterable_iterator_obj3 = queue_spliterator_iterable_iterator_obj0.spliterator();
        java.util.Spliterator<java.util.Spliterator<java.lang.Iterable<java.util.Iterator<java.lang.Object>>>> spliterator_spliterator_iterable_iterator_obj4 = queue_spliterator_iterable_iterator_obj0.spliterator();
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertNotNull(iterator_spliterator_iterable_iterator_obj2);
        org.junit.Assert.assertNotNull(spliterator_spliterator_iterable_iterator_obj3);
        org.junit.Assert.assertNotNull(spliterator_spliterator_iterable_iterator_obj4);
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test279");
        edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.lang.Object>>> queue_iterable_iterator_obj0 = new edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.lang.Object>>>();
        edu.osu.cs362.Queue<java.util.Iterator<java.lang.Object>> queue_iterator_obj1 = new edu.osu.cs362.Queue<java.util.Iterator<java.lang.Object>>();
        queue_iterable_iterator_obj0.enqueue((java.lang.Iterable<java.util.Iterator<java.lang.Object>>) queue_iterator_obj1);
        edu.osu.cs362.Queue<java.util.Iterator<java.lang.Object>> queue_iterator_obj3 = new edu.osu.cs362.Queue<java.util.Iterator<java.lang.Object>>();
        queue_iterable_iterator_obj0.enqueue((java.lang.Iterable<java.util.Iterator<java.lang.Object>>) queue_iterator_obj3);
        java.util.Spliterator<java.util.Iterator<java.lang.Object>> spliterator_iterator_obj5 = queue_iterator_obj3.spliterator();
        try {
            java.util.Iterator<java.lang.Object> iterator_obj6 = queue_iterator_obj3.dequeue();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException");
        } catch (java.util.NoSuchElementException e) {
        }
        org.junit.Assert.assertNotNull(spliterator_iterator_obj5);
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test280");
        edu.osu.cs362.Queue<java.util.Spliterator<java.lang.Iterable<java.util.Iterator<java.lang.Object>>>> queue_spliterator_iterable_iterator_obj0 = new edu.osu.cs362.Queue<java.util.Spliterator<java.lang.Iterable<java.util.Iterator<java.lang.Object>>>>();
        int i1 = queue_spliterator_iterable_iterator_obj0.size();
        java.util.Iterator<java.util.Spliterator<java.lang.Iterable<java.util.Iterator<java.lang.Object>>>> iterator_spliterator_iterable_iterator_obj2 = queue_spliterator_iterable_iterator_obj0.iterator();
        java.util.Spliterator<java.util.Spliterator<java.lang.Iterable<java.util.Iterator<java.lang.Object>>>> spliterator_spliterator_iterable_iterator_obj3 = queue_spliterator_iterable_iterator_obj0.spliterator();
        java.lang.String str4 = queue_spliterator_iterable_iterator_obj0.toString();
        java.util.Iterator<java.util.Spliterator<java.lang.Iterable<java.util.Iterator<java.lang.Object>>>> iterator_spliterator_iterable_iterator_obj5 = queue_spliterator_iterable_iterator_obj0.iterator();
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertNotNull(iterator_spliterator_iterable_iterator_obj2);
        org.junit.Assert.assertNotNull(spliterator_spliterator_iterable_iterator_obj3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        org.junit.Assert.assertNotNull(iterator_spliterator_iterable_iterator_obj5);
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test281");
        edu.osu.cs362.Queue<java.io.Serializable> queue_serializable0 = new edu.osu.cs362.Queue<java.io.Serializable>();
        queue_serializable0.enqueue((java.io.Serializable) 1L);
        java.io.Serializable serializable3 = queue_serializable0.peek();
        java.util.Iterator<java.io.Serializable> iterator_serializable4 = queue_serializable0.iterator();
        java.util.Iterator<java.io.Serializable> iterator_serializable5 = queue_serializable0.iterator();
        java.util.Spliterator<java.io.Serializable> spliterator_serializable6 = queue_serializable0.spliterator();
        java.io.Serializable serializable7 = queue_serializable0.dequeue();
        int i8 = queue_serializable0.size();
        org.junit.Assert.assertTrue("'" + serializable3 + "' != '" + 1L + "'", serializable3.equals(1L));
        org.junit.Assert.assertNotNull(iterator_serializable4);
        org.junit.Assert.assertNotNull(iterator_serializable5);
        org.junit.Assert.assertNotNull(spliterator_serializable6);
        org.junit.Assert.assertTrue("'" + serializable7 + "' != '" + 1L + "'", serializable7.equals(1L));
        org.junit.Assert.assertTrue(i8 == 0);
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test282");
        edu.osu.cs362.Queue<java.util.Iterator<java.io.Serializable>> queue_iterator_serializable0 = new edu.osu.cs362.Queue<java.util.Iterator<java.io.Serializable>>();
        boolean b1 = queue_iterator_serializable0.isEmpty();
        edu.osu.cs362.Queue<java.io.Serializable> queue_serializable2 = new edu.osu.cs362.Queue<java.io.Serializable>();
        queue_serializable2.enqueue((java.io.Serializable) 1L);
        java.io.Serializable serializable5 = queue_serializable2.peek();
        java.util.Iterator<java.io.Serializable> iterator_serializable6 = queue_serializable2.iterator();
        java.util.Iterator<java.io.Serializable> iterator_serializable7 = queue_serializable2.iterator();
        queue_iterator_serializable0.enqueue(iterator_serializable7);
        edu.osu.cs362.Queue<java.io.Serializable> queue_serializable9 = new edu.osu.cs362.Queue<java.io.Serializable>();
        queue_serializable9.enqueue((java.io.Serializable) 1L);
        java.io.Serializable serializable12 = queue_serializable9.peek();
        java.io.Serializable serializable13 = queue_serializable9.peek();
        queue_serializable9.enqueue((java.io.Serializable) (short) -1);
        java.io.Serializable serializable16 = queue_serializable9.peek();
        java.util.Iterator<java.io.Serializable> iterator_serializable17 = queue_serializable9.iterator();
        queue_iterator_serializable0.enqueue(iterator_serializable17);
        int i19 = queue_iterator_serializable0.size();
        java.util.Iterator<java.util.Iterator<java.io.Serializable>> iterator_iterator_serializable20 = queue_iterator_serializable0.iterator();
        java.util.Iterator<java.io.Serializable> iterator_serializable21 = queue_iterator_serializable0.dequeue();
        org.junit.Assert.assertTrue(b1 == true);
        org.junit.Assert.assertTrue("'" + serializable5 + "' != '" + 1L + "'", serializable5.equals(1L));
        org.junit.Assert.assertNotNull(iterator_serializable6);
        org.junit.Assert.assertNotNull(iterator_serializable7);
        org.junit.Assert.assertTrue("'" + serializable12 + "' != '" + 1L + "'", serializable12.equals(1L));
        org.junit.Assert.assertTrue("'" + serializable13 + "' != '" + 1L + "'", serializable13.equals(1L));
        org.junit.Assert.assertTrue("'" + serializable16 + "' != '" + 1L + "'", serializable16.equals(1L));
        org.junit.Assert.assertNotNull(iterator_serializable17);
        org.junit.Assert.assertTrue(i19 == 2);
        org.junit.Assert.assertNotNull(iterator_iterator_serializable20);
        org.junit.Assert.assertNotNull(iterator_serializable21);
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test283");
        edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>> queue_iterable_iterator_serializable0 = new edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>();
        boolean b1 = queue_iterable_iterator_serializable0.isEmpty();
        java.lang.String str2 = queue_iterable_iterator_serializable0.toString();
        boolean b3 = queue_iterable_iterator_serializable0.isEmpty();
        boolean b4 = queue_iterable_iterator_serializable0.isEmpty();
        java.lang.String str5 = queue_iterable_iterator_serializable0.toString();
        java.lang.String str6 = queue_iterable_iterator_serializable0.toString();
        boolean b7 = queue_iterable_iterator_serializable0.isEmpty();
        org.junit.Assert.assertTrue(b1 == true);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue(b7 == true);
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test284");
        edu.osu.cs362.Queue<java.lang.Iterable<java.lang.Iterable<java.util.Iterator<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>>> queue_iterable_iterable_iterator_iterable_queue_iterable_iterator_serializable0 = new edu.osu.cs362.Queue<java.lang.Iterable<java.lang.Iterable<java.util.Iterator<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>>>();
        boolean b1 = queue_iterable_iterable_iterator_iterable_queue_iterable_iterator_serializable0.isEmpty();
        boolean b2 = queue_iterable_iterable_iterator_iterable_queue_iterable_iterator_serializable0.isEmpty();
        java.util.Spliterator<java.lang.Iterable<java.lang.Iterable<java.util.Iterator<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>>> spliterator_iterable_iterable_iterator_iterable_queue_iterable_iterator_serializable3 = queue_iterable_iterable_iterator_iterable_queue_iterable_iterator_serializable0.spliterator();
        java.lang.String str4 = queue_iterable_iterable_iterator_iterable_queue_iterable_iterator_serializable0.toString();
        org.junit.Assert.assertTrue(b1 == true);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNotNull(spliterator_iterable_iterable_iterator_iterable_queue_iterable_iterator_serializable3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test285");
        edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<edu.osu.cs362.Queue<java.io.Serializable>>>> queue_iterable_iterator_queue_serializable0 = new edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<edu.osu.cs362.Queue<java.io.Serializable>>>>();
        java.util.Iterator<java.lang.Iterable<java.util.Iterator<edu.osu.cs362.Queue<java.io.Serializable>>>> iterator_iterable_iterator_queue_serializable1 = queue_iterable_iterator_queue_serializable0.iterator();
        edu.osu.cs362.Queue<java.util.Iterator<edu.osu.cs362.Queue<java.io.Serializable>>> queue_iterator_queue_serializable2 = new edu.osu.cs362.Queue<java.util.Iterator<edu.osu.cs362.Queue<java.io.Serializable>>>();
        java.lang.String str3 = queue_iterator_queue_serializable2.toString();
        queue_iterable_iterator_queue_serializable0.enqueue((java.lang.Iterable<java.util.Iterator<edu.osu.cs362.Queue<java.io.Serializable>>>) queue_iterator_queue_serializable2);
        java.util.Iterator<java.lang.Iterable<java.util.Iterator<edu.osu.cs362.Queue<java.io.Serializable>>>> iterator_iterable_iterator_queue_serializable5 = queue_iterable_iterator_queue_serializable0.iterator();
        edu.osu.cs362.Queue<java.util.Iterator<edu.osu.cs362.Queue<java.io.Serializable>>> queue_iterator_queue_serializable6 = new edu.osu.cs362.Queue<java.util.Iterator<edu.osu.cs362.Queue<java.io.Serializable>>>();
        int i7 = queue_iterator_queue_serializable6.size();
        java.util.Iterator<java.util.Iterator<edu.osu.cs362.Queue<java.io.Serializable>>> iterator_iterator_queue_serializable8 = queue_iterator_queue_serializable6.iterator();
        edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.io.Serializable>> queue_queue_serializable9 = new edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.io.Serializable>>();
        java.util.Spliterator<edu.osu.cs362.Queue<java.io.Serializable>> spliterator_queue_serializable10 = queue_queue_serializable9.spliterator();
        java.util.Iterator<edu.osu.cs362.Queue<java.io.Serializable>> iterator_queue_serializable11 = queue_queue_serializable9.iterator();
        queue_iterator_queue_serializable6.enqueue(iterator_queue_serializable11);
        java.util.Spliterator<java.util.Iterator<edu.osu.cs362.Queue<java.io.Serializable>>> spliterator_iterator_queue_serializable13 = queue_iterator_queue_serializable6.spliterator();
        queue_iterable_iterator_queue_serializable0.enqueue((java.lang.Iterable<java.util.Iterator<edu.osu.cs362.Queue<java.io.Serializable>>>) queue_iterator_queue_serializable6);
        boolean b15 = queue_iterable_iterator_queue_serializable0.isEmpty();
        java.lang.Iterable<java.util.Iterator<edu.osu.cs362.Queue<java.io.Serializable>>> iterable_iterator_queue_serializable16 = null;
        queue_iterable_iterator_queue_serializable0.enqueue(iterable_iterator_queue_serializable16);
        java.lang.String str18 = queue_iterable_iterator_queue_serializable0.toString();
        org.junit.Assert.assertNotNull(iterator_iterable_iterator_queue_serializable1);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertNotNull(iterator_iterable_iterator_queue_serializable5);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertNotNull(iterator_iterator_queue_serializable8);
        org.junit.Assert.assertNotNull(spliterator_queue_serializable10);
        org.junit.Assert.assertNotNull(iterator_queue_serializable11);
        org.junit.Assert.assertNotNull(spliterator_iterator_queue_serializable13);
        org.junit.Assert.assertTrue(b15 == false);
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test286");
        edu.osu.cs362.Queue<edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>> queue_queue_queue_iterable_queue_iterable_iterator_serializable0 = new edu.osu.cs362.Queue<edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>>();
        java.util.Spliterator<edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>> spliterator_queue_queue_iterable_queue_iterable_iterator_serializable1 = queue_queue_queue_iterable_queue_iterable_iterator_serializable0.spliterator();
        edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>> queue_queue_iterable_queue_iterable_iterator_serializable2 = new edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>();
        java.lang.String str3 = queue_queue_iterable_queue_iterable_iterator_serializable2.toString();
        int i4 = queue_queue_iterable_queue_iterable_iterator_serializable2.size();
        queue_queue_queue_iterable_queue_iterable_iterator_serializable0.enqueue(queue_queue_iterable_queue_iterable_iterator_serializable2);
        int i6 = queue_queue_queue_iterable_queue_iterable_iterator_serializable0.size();
        org.junit.Assert.assertNotNull(spliterator_queue_queue_iterable_queue_iterable_iterator_serializable1);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(i6 == 1);
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test287");
        edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.io.Serializable>> queue_queue_serializable0 = new edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.io.Serializable>>();
        java.util.Spliterator<edu.osu.cs362.Queue<java.io.Serializable>> spliterator_queue_serializable1 = queue_queue_serializable0.spliterator();
        java.lang.String str2 = queue_queue_serializable0.toString();
        edu.osu.cs362.Queue<java.io.Serializable> queue_serializable3 = new edu.osu.cs362.Queue<java.io.Serializable>();
        queue_serializable3.enqueue((java.io.Serializable) 1L);
        java.io.Serializable serializable6 = queue_serializable3.peek();
        java.util.Iterator<java.io.Serializable> iterator_serializable7 = queue_serializable3.iterator();
        java.io.Serializable serializable8 = queue_serializable3.peek();
        queue_queue_serializable0.enqueue(queue_serializable3);
        java.util.Iterator<edu.osu.cs362.Queue<java.io.Serializable>> iterator_queue_serializable10 = queue_queue_serializable0.iterator();
        edu.osu.cs362.Queue<java.io.Serializable> queue_serializable11 = queue_queue_serializable0.peek();
        java.lang.String str12 = queue_queue_serializable0.toString();
        edu.osu.cs362.Queue<java.io.Serializable> queue_serializable13 = queue_queue_serializable0.dequeue();
        org.junit.Assert.assertNotNull(spliterator_queue_serializable1);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
        org.junit.Assert.assertTrue("'" + serializable6 + "' != '" + 1L + "'", serializable6.equals(1L));
        org.junit.Assert.assertNotNull(iterator_serializable7);
        org.junit.Assert.assertTrue("'" + serializable8 + "' != '" + 1L + "'", serializable8.equals(1L));
        org.junit.Assert.assertNotNull(iterator_queue_serializable10);
        org.junit.Assert.assertNotNull(queue_serializable11);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "1  " + "'", str12.equals("1  "));
        org.junit.Assert.assertNotNull(queue_serializable13);
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test288");
        edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<edu.osu.cs362.Queue<java.io.Serializable>>>> queue_iterable_iterator_queue_serializable0 = new edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<edu.osu.cs362.Queue<java.io.Serializable>>>>();
        java.lang.String str1 = queue_iterable_iterator_queue_serializable0.toString();
        java.lang.String str2 = queue_iterable_iterator_queue_serializable0.toString();
        int i3 = queue_iterable_iterator_queue_serializable0.size();
        int i4 = queue_iterable_iterator_queue_serializable0.size();
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 0);
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test289");
        edu.osu.cs362.Queue<java.util.Iterator<java.util.Iterator<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>> queue_iterator_iterator_queue_iterable_iterator_serializable0 = new edu.osu.cs362.Queue<java.util.Iterator<java.util.Iterator<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>();
        try {
            java.util.Iterator<java.util.Iterator<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>> iterator_iterator_queue_iterable_iterator_serializable1 = queue_iterator_iterator_queue_iterable_iterator_serializable0.peek();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException");
        } catch (java.util.NoSuchElementException e) {
        }
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test290");
        edu.osu.cs362.Queue<java.util.Iterator<java.io.Serializable>> queue_iterator_serializable0 = new edu.osu.cs362.Queue<java.util.Iterator<java.io.Serializable>>();
        boolean b1 = queue_iterator_serializable0.isEmpty();
        edu.osu.cs362.Queue<java.io.Serializable> queue_serializable2 = new edu.osu.cs362.Queue<java.io.Serializable>();
        queue_serializable2.enqueue((java.io.Serializable) 1L);
        java.util.Iterator<java.io.Serializable> iterator_serializable5 = queue_serializable2.iterator();
        queue_iterator_serializable0.enqueue(iterator_serializable5);
        int i7 = queue_iterator_serializable0.size();
        java.util.Iterator<java.io.Serializable> iterator_serializable8 = queue_iterator_serializable0.peek();
        boolean b9 = queue_iterator_serializable0.isEmpty();
        java.util.Iterator<java.io.Serializable> iterator_serializable10 = queue_iterator_serializable0.peek();
        java.util.Spliterator<java.util.Iterator<java.io.Serializable>> spliterator_iterator_serializable11 = queue_iterator_serializable0.spliterator();
        int i12 = queue_iterator_serializable0.size();
        java.util.Iterator<java.io.Serializable> iterator_serializable13 = queue_iterator_serializable0.peek();
        org.junit.Assert.assertTrue(b1 == true);
        org.junit.Assert.assertNotNull(iterator_serializable5);
        org.junit.Assert.assertTrue(i7 == 1);
        org.junit.Assert.assertNotNull(iterator_serializable8);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(iterator_serializable10);
        org.junit.Assert.assertNotNull(spliterator_iterator_serializable11);
        org.junit.Assert.assertTrue(i12 == 1);
        org.junit.Assert.assertNotNull(iterator_serializable13);
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test291");
        edu.osu.cs362.Queue<java.util.Spliterator<java.lang.Iterable<java.util.Iterator<java.lang.Object>>>> queue_spliterator_iterable_iterator_obj0 = new edu.osu.cs362.Queue<java.util.Spliterator<java.lang.Iterable<java.util.Iterator<java.lang.Object>>>>();
        int i1 = queue_spliterator_iterable_iterator_obj0.size();
        java.util.Iterator<java.util.Spliterator<java.lang.Iterable<java.util.Iterator<java.lang.Object>>>> iterator_spliterator_iterable_iterator_obj2 = queue_spliterator_iterable_iterator_obj0.iterator();
        java.util.Spliterator<java.util.Spliterator<java.lang.Iterable<java.util.Iterator<java.lang.Object>>>> spliterator_spliterator_iterable_iterator_obj3 = queue_spliterator_iterable_iterator_obj0.spliterator();
        java.lang.String str4 = queue_spliterator_iterable_iterator_obj0.toString();
        int i5 = queue_spliterator_iterable_iterator_obj0.size();
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertNotNull(iterator_spliterator_iterable_iterator_obj2);
        org.junit.Assert.assertNotNull(spliterator_spliterator_iterable_iterator_obj3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        org.junit.Assert.assertTrue(i5 == 0);
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test292");
        edu.osu.cs362.Queue<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>> queue_iterable_queue_iterable_queue_iterable_iterator_serializable0 = new edu.osu.cs362.Queue<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>>();
        java.util.Spliterator<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>> spliterator_iterable_queue_iterable_queue_iterable_iterator_serializable1 = queue_iterable_queue_iterable_queue_iterable_iterator_serializable0.spliterator();
        java.util.Iterator<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>> iterator_iterable_queue_iterable_queue_iterable_iterator_serializable2 = queue_iterable_queue_iterable_queue_iterable_iterator_serializable0.iterator();
        org.junit.Assert.assertNotNull(spliterator_iterable_queue_iterable_queue_iterable_iterator_serializable1);
        org.junit.Assert.assertNotNull(iterator_iterable_queue_iterable_queue_iterable_iterator_serializable2);
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test293");
        edu.osu.cs362.Queue<java.util.Iterator<edu.osu.cs362.Queue<java.io.Serializable>>> queue_iterator_queue_serializable0 = new edu.osu.cs362.Queue<java.util.Iterator<edu.osu.cs362.Queue<java.io.Serializable>>>();
        int i1 = queue_iterator_queue_serializable0.size();
        java.util.Iterator<java.util.Iterator<edu.osu.cs362.Queue<java.io.Serializable>>> iterator_iterator_queue_serializable2 = queue_iterator_queue_serializable0.iterator();
        edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.io.Serializable>> queue_queue_serializable3 = new edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.io.Serializable>>();
        java.util.Spliterator<edu.osu.cs362.Queue<java.io.Serializable>> spliterator_queue_serializable4 = queue_queue_serializable3.spliterator();
        java.util.Iterator<edu.osu.cs362.Queue<java.io.Serializable>> iterator_queue_serializable5 = queue_queue_serializable3.iterator();
        queue_iterator_queue_serializable0.enqueue(iterator_queue_serializable5);
        java.lang.String str7 = queue_iterator_queue_serializable0.toString();
        java.util.Iterator<java.util.Iterator<edu.osu.cs362.Queue<java.io.Serializable>>> iterator_iterator_queue_serializable8 = queue_iterator_queue_serializable0.iterator();
        java.util.Iterator<edu.osu.cs362.Queue<java.io.Serializable>> iterator_queue_serializable9 = queue_iterator_queue_serializable0.peek();
        int i10 = queue_iterator_queue_serializable0.size();
        boolean b11 = queue_iterator_queue_serializable0.isEmpty();
        edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.io.Serializable>> queue_queue_serializable12 = new edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.io.Serializable>>();
        java.util.Spliterator<edu.osu.cs362.Queue<java.io.Serializable>> spliterator_queue_serializable13 = queue_queue_serializable12.spliterator();
        boolean b14 = queue_queue_serializable12.isEmpty();
        edu.osu.cs362.Queue<java.io.Serializable> queue_serializable15 = new edu.osu.cs362.Queue<java.io.Serializable>();
        queue_serializable15.enqueue((java.io.Serializable) 1L);
        java.io.Serializable serializable18 = queue_serializable15.peek();
        java.io.Serializable serializable19 = queue_serializable15.peek();
        queue_queue_serializable12.enqueue(queue_serializable15);
        java.util.Iterator<edu.osu.cs362.Queue<java.io.Serializable>> iterator_queue_serializable21 = queue_queue_serializable12.iterator();
        queue_iterator_queue_serializable0.enqueue(iterator_queue_serializable21);
        boolean b23 = queue_iterator_queue_serializable0.isEmpty();
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertNotNull(iterator_iterator_queue_serializable2);
        org.junit.Assert.assertNotNull(spliterator_queue_serializable4);
        org.junit.Assert.assertNotNull(iterator_queue_serializable5);
        org.junit.Assert.assertNotNull(iterator_iterator_queue_serializable8);
        org.junit.Assert.assertNotNull(iterator_queue_serializable9);
        org.junit.Assert.assertTrue(i10 == 1);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(spliterator_queue_serializable13);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertTrue("'" + serializable18 + "' != '" + 1L + "'", serializable18.equals(1L));
        org.junit.Assert.assertTrue("'" + serializable19 + "' != '" + 1L + "'", serializable19.equals(1L));
        org.junit.Assert.assertNotNull(iterator_queue_serializable21);
        org.junit.Assert.assertTrue(b23 == false);
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test294");
        edu.osu.cs362.Queue<java.util.Spliterator<java.lang.Iterable<java.util.Iterator<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>>> queue_spliterator_iterable_iterator_iterable_queue_iterable_iterator_serializable0 = new edu.osu.cs362.Queue<java.util.Spliterator<java.lang.Iterable<java.util.Iterator<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>>>();
        int i1 = queue_spliterator_iterable_iterator_iterable_queue_iterable_iterator_serializable0.size();
        try {
            java.util.Spliterator<java.lang.Iterable<java.util.Iterator<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>> spliterator_iterable_iterator_iterable_queue_iterable_iterator_serializable2 = queue_spliterator_iterable_iterator_iterable_queue_iterable_iterator_serializable0.peek();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException");
        } catch (java.util.NoSuchElementException e) {
        }
        org.junit.Assert.assertTrue(i1 == 0);
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test295");
        edu.osu.cs362.Queue<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>> queue_iterable_queue_iterable_queue_iterable_iterator_serializable0 = new edu.osu.cs362.Queue<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>>();
        boolean b1 = queue_iterable_queue_iterable_queue_iterable_iterator_serializable0.isEmpty();
        boolean b2 = queue_iterable_queue_iterable_queue_iterable_iterator_serializable0.isEmpty();
        java.lang.String str3 = queue_iterable_queue_iterable_queue_iterable_iterator_serializable0.toString();
        int i4 = queue_iterable_queue_iterable_queue_iterable_iterator_serializable0.size();
        boolean b5 = queue_iterable_queue_iterable_queue_iterable_iterator_serializable0.isEmpty();
        try {
            java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>> iterable_queue_iterable_queue_iterable_iterator_serializable6 = queue_iterable_queue_iterable_queue_iterable_iterator_serializable0.peek();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException");
        } catch (java.util.NoSuchElementException e) {
        }
        org.junit.Assert.assertTrue(b1 == true);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(b5 == true);
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test296");
        edu.osu.cs362.Queue<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>> queue_iterable_queue_iterable_iterator_serializable0 = new edu.osu.cs362.Queue<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>();
        edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>> queue_queue_iterable_iterator_serializable1 = new edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>();
        java.lang.String str2 = queue_queue_iterable_iterator_serializable1.toString();
        int i3 = queue_queue_iterable_iterator_serializable1.size();
        queue_iterable_queue_iterable_iterator_serializable0.enqueue((java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>) queue_queue_iterable_iterator_serializable1);
        int i5 = queue_queue_iterable_iterator_serializable1.size();
        java.util.Iterator<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>> iterator_queue_iterable_iterator_serializable6 = queue_queue_iterable_iterator_serializable1.iterator();
        int i7 = queue_queue_iterable_iterator_serializable1.size();
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertNotNull(iterator_queue_iterable_iterator_serializable6);
        org.junit.Assert.assertTrue(i7 == 0);
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test297");
        edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.io.Serializable>> queue_queue_serializable0 = new edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.io.Serializable>>();
        java.util.Spliterator<edu.osu.cs362.Queue<java.io.Serializable>> spliterator_queue_serializable1 = queue_queue_serializable0.spliterator();
        java.util.Spliterator<edu.osu.cs362.Queue<java.io.Serializable>> spliterator_queue_serializable2 = queue_queue_serializable0.spliterator();
        java.lang.String str3 = queue_queue_serializable0.toString();
        int i4 = queue_queue_serializable0.size();
        try {
            edu.osu.cs362.Queue<java.io.Serializable> queue_serializable5 = queue_queue_serializable0.dequeue();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException");
        } catch (java.util.NoSuchElementException e) {
        }
        org.junit.Assert.assertNotNull(spliterator_queue_serializable1);
        org.junit.Assert.assertNotNull(spliterator_queue_serializable2);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue(i4 == 0);
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test298");
        edu.osu.cs362.Queue<java.util.Iterator<java.lang.Iterable<java.io.Serializable>>> queue_iterator_iterable_serializable0 = new edu.osu.cs362.Queue<java.util.Iterator<java.lang.Iterable<java.io.Serializable>>>();
        int i1 = queue_iterator_iterable_serializable0.size();
        boolean b2 = queue_iterator_iterable_serializable0.isEmpty();
        int i3 = queue_iterator_iterable_serializable0.size();
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 0);
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test299");
        edu.osu.cs362.Queue<edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.lang.Comparable<java.lang.String>>>> queue_queue_queue_comparable_str0 = new edu.osu.cs362.Queue<edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.lang.Comparable<java.lang.String>>>>();
        edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.lang.Comparable<java.lang.String>>> queue_queue_comparable_str1 = new edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.lang.Comparable<java.lang.String>>>();
        edu.osu.cs362.Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str2 = new edu.osu.cs362.Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str2.enqueue((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str5 = queue_comparable_str2.dequeue();
        queue_queue_comparable_str1.enqueue(queue_comparable_str2);
        queue_queue_queue_comparable_str0.enqueue(queue_queue_comparable_str1);
        java.lang.String str8 = queue_queue_comparable_str1.toString();
        boolean b9 = queue_queue_comparable_str1.isEmpty();
        org.junit.Assert.assertTrue("'" + comparable_str5 + "' != '" + "hi!" + "'", comparable_str5.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + " " + "'", str8.equals(" "));
        org.junit.Assert.assertTrue(b9 == false);
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test300");
        edu.osu.cs362.Queue<java.lang.Iterable<java.lang.Iterable<java.lang.Iterable<java.lang.Object>>>> queue_iterable_iterable_iterable_obj0 = new edu.osu.cs362.Queue<java.lang.Iterable<java.lang.Iterable<java.lang.Iterable<java.lang.Object>>>>();
        java.util.Iterator<java.lang.Iterable<java.lang.Iterable<java.lang.Iterable<java.lang.Object>>>> iterator_iterable_iterable_iterable_obj1 = queue_iterable_iterable_iterable_obj0.iterator();
        int i2 = queue_iterable_iterable_iterable_obj0.size();
        int i3 = queue_iterable_iterable_iterable_obj0.size();
        java.util.Spliterator<java.lang.Iterable<java.lang.Iterable<java.lang.Iterable<java.lang.Object>>>> spliterator_iterable_iterable_iterable_obj4 = queue_iterable_iterable_iterable_obj0.spliterator();
        edu.osu.cs362.Queue<java.lang.Iterable<java.lang.Iterable<java.lang.Iterable<java.lang.Object>>>> queue_iterable_iterable_iterable_obj5 = new edu.osu.cs362.Queue<java.lang.Iterable<java.lang.Iterable<java.lang.Iterable<java.lang.Object>>>>();
        java.util.Iterator<java.lang.Iterable<java.lang.Iterable<java.lang.Iterable<java.lang.Object>>>> iterator_iterable_iterable_iterable_obj6 = queue_iterable_iterable_iterable_obj5.iterator();
        edu.osu.cs362.Queue<java.lang.Iterable<java.lang.Iterable<java.lang.Object>>> queue_iterable_iterable_obj7 = new edu.osu.cs362.Queue<java.lang.Iterable<java.lang.Iterable<java.lang.Object>>>();
        queue_iterable_iterable_iterable_obj5.enqueue((java.lang.Iterable<java.lang.Iterable<java.lang.Iterable<java.lang.Object>>>) queue_iterable_iterable_obj7);
        int i9 = queue_iterable_iterable_obj7.size();
        boolean b10 = queue_iterable_iterable_obj7.isEmpty();
        boolean b11 = queue_iterable_iterable_obj7.isEmpty();
        queue_iterable_iterable_iterable_obj0.enqueue((java.lang.Iterable<java.lang.Iterable<java.lang.Iterable<java.lang.Object>>>) queue_iterable_iterable_obj7);
        edu.osu.cs362.Queue<java.lang.Iterable<java.lang.Object>> queue_iterable_obj13 = new edu.osu.cs362.Queue<java.lang.Iterable<java.lang.Object>>();
        edu.osu.cs362.Queue<java.lang.Object> queue_obj14 = new edu.osu.cs362.Queue<java.lang.Object>();
        int i15 = queue_obj14.size();
        java.util.Spliterator<java.lang.Object> spliterator_obj16 = queue_obj14.spliterator();
        edu.osu.cs362.Queue<java.util.Iterator<java.io.Serializable>> queue_iterator_serializable17 = new edu.osu.cs362.Queue<java.util.Iterator<java.io.Serializable>>();
        boolean b18 = queue_iterator_serializable17.isEmpty();
        edu.osu.cs362.Queue<java.io.Serializable> queue_serializable19 = new edu.osu.cs362.Queue<java.io.Serializable>();
        queue_serializable19.enqueue((java.io.Serializable) 1L);
        java.util.Iterator<java.io.Serializable> iterator_serializable22 = queue_serializable19.iterator();
        queue_iterator_serializable17.enqueue(iterator_serializable22);
        int i24 = queue_iterator_serializable17.size();
        java.util.Iterator<java.io.Serializable> iterator_serializable25 = queue_iterator_serializable17.peek();
        boolean b26 = queue_iterator_serializable17.isEmpty();
        java.util.Iterator<java.io.Serializable> iterator_serializable27 = queue_iterator_serializable17.peek();
        queue_obj14.enqueue((java.lang.Object) queue_iterator_serializable17);
        queue_iterable_obj13.enqueue((java.lang.Iterable<java.lang.Object>) queue_obj14);
        queue_iterable_iterable_obj7.enqueue((java.lang.Iterable<java.lang.Iterable<java.lang.Object>>) queue_iterable_obj13);
        int i31 = queue_iterable_obj13.size();
        org.junit.Assert.assertNotNull(iterator_iterable_iterable_iterable_obj1);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertNotNull(spliterator_iterable_iterable_iterable_obj4);
        org.junit.Assert.assertNotNull(iterator_iterable_iterable_iterable_obj6);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue(i15 == 0);
        org.junit.Assert.assertNotNull(spliterator_obj16);
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertNotNull(iterator_serializable22);
        org.junit.Assert.assertTrue(i24 == 1);
        org.junit.Assert.assertNotNull(iterator_serializable25);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertNotNull(iterator_serializable27);
        org.junit.Assert.assertTrue(i31 == 1);
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test301");
        edu.osu.cs362.Queue<java.util.Iterator<java.io.Serializable>> queue_iterator_serializable0 = new edu.osu.cs362.Queue<java.util.Iterator<java.io.Serializable>>();
        boolean b1 = queue_iterator_serializable0.isEmpty();
        java.util.Iterator<java.util.Iterator<java.io.Serializable>> iterator_iterator_serializable2 = queue_iterator_serializable0.iterator();
        org.junit.Assert.assertTrue(b1 == true);
        org.junit.Assert.assertNotNull(iterator_iterator_serializable2);
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test302");
        edu.osu.cs362.Queue<java.lang.Iterable<java.lang.Iterable<java.util.Iterator<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>>> queue_iterable_iterable_iterator_iterable_queue_iterable_iterator_serializable0 = new edu.osu.cs362.Queue<java.lang.Iterable<java.lang.Iterable<java.util.Iterator<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>>>();
        boolean b1 = queue_iterable_iterable_iterator_iterable_queue_iterable_iterator_serializable0.isEmpty();
        boolean b2 = queue_iterable_iterable_iterator_iterable_queue_iterable_iterator_serializable0.isEmpty();
        java.lang.String str3 = queue_iterable_iterable_iterator_iterable_queue_iterable_iterator_serializable0.toString();
        int i4 = queue_iterable_iterable_iterator_iterable_queue_iterable_iterator_serializable0.size();
        org.junit.Assert.assertTrue(b1 == true);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue(i4 == 0);
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test303");
        edu.osu.cs362.Queue<java.util.Iterator<java.io.Serializable>> queue_iterator_serializable0 = new edu.osu.cs362.Queue<java.util.Iterator<java.io.Serializable>>();
        boolean b1 = queue_iterator_serializable0.isEmpty();
        edu.osu.cs362.Queue<java.io.Serializable> queue_serializable2 = new edu.osu.cs362.Queue<java.io.Serializable>();
        queue_serializable2.enqueue((java.io.Serializable) 1L);
        java.util.Iterator<java.io.Serializable> iterator_serializable5 = queue_serializable2.iterator();
        queue_iterator_serializable0.enqueue(iterator_serializable5);
        java.util.Spliterator<java.util.Iterator<java.io.Serializable>> spliterator_iterator_serializable7 = queue_iterator_serializable0.spliterator();
        java.util.Iterator<java.io.Serializable> iterator_serializable8 = null;
        queue_iterator_serializable0.enqueue(iterator_serializable8);
        org.junit.Assert.assertTrue(b1 == true);
        org.junit.Assert.assertNotNull(iterator_serializable5);
        org.junit.Assert.assertNotNull(spliterator_iterator_serializable7);
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test304");
        edu.osu.cs362.Queue<java.util.Iterator<java.io.Serializable>> queue_iterator_serializable0 = new edu.osu.cs362.Queue<java.util.Iterator<java.io.Serializable>>();
        boolean b1 = queue_iterator_serializable0.isEmpty();
        edu.osu.cs362.Queue<java.io.Serializable> queue_serializable2 = new edu.osu.cs362.Queue<java.io.Serializable>();
        queue_serializable2.enqueue((java.io.Serializable) 1L);
        java.io.Serializable serializable5 = queue_serializable2.peek();
        java.util.Iterator<java.io.Serializable> iterator_serializable6 = queue_serializable2.iterator();
        java.util.Iterator<java.io.Serializable> iterator_serializable7 = queue_serializable2.iterator();
        queue_iterator_serializable0.enqueue(iterator_serializable7);
        edu.osu.cs362.Queue<java.io.Serializable> queue_serializable9 = new edu.osu.cs362.Queue<java.io.Serializable>();
        queue_serializable9.enqueue((java.io.Serializable) 1L);
        java.io.Serializable serializable12 = queue_serializable9.peek();
        java.io.Serializable serializable13 = queue_serializable9.peek();
        queue_serializable9.enqueue((java.io.Serializable) (short) -1);
        java.io.Serializable serializable16 = queue_serializable9.peek();
        java.util.Iterator<java.io.Serializable> iterator_serializable17 = queue_serializable9.iterator();
        queue_iterator_serializable0.enqueue(iterator_serializable17);
        int i19 = queue_iterator_serializable0.size();
        int i20 = queue_iterator_serializable0.size();
        edu.osu.cs362.Queue<java.util.Iterator<java.io.Serializable>> queue_iterator_serializable21 = new edu.osu.cs362.Queue<java.util.Iterator<java.io.Serializable>>();
        boolean b22 = queue_iterator_serializable21.isEmpty();
        edu.osu.cs362.Queue<java.io.Serializable> queue_serializable23 = new edu.osu.cs362.Queue<java.io.Serializable>();
        queue_serializable23.enqueue((java.io.Serializable) 1L);
        java.util.Iterator<java.io.Serializable> iterator_serializable26 = queue_serializable23.iterator();
        queue_iterator_serializable21.enqueue(iterator_serializable26);
        int i28 = queue_iterator_serializable21.size();
        java.util.Iterator<java.io.Serializable> iterator_serializable29 = queue_iterator_serializable21.peek();
        queue_iterator_serializable0.enqueue(iterator_serializable29);
        java.util.Spliterator<java.util.Iterator<java.io.Serializable>> spliterator_iterator_serializable31 = queue_iterator_serializable0.spliterator();
        java.util.Iterator<java.util.Iterator<java.io.Serializable>> iterator_iterator_serializable32 = queue_iterator_serializable0.iterator();
        org.junit.Assert.assertTrue(b1 == true);
        org.junit.Assert.assertTrue("'" + serializable5 + "' != '" + 1L + "'", serializable5.equals(1L));
        org.junit.Assert.assertNotNull(iterator_serializable6);
        org.junit.Assert.assertNotNull(iterator_serializable7);
        org.junit.Assert.assertTrue("'" + serializable12 + "' != '" + 1L + "'", serializable12.equals(1L));
        org.junit.Assert.assertTrue("'" + serializable13 + "' != '" + 1L + "'", serializable13.equals(1L));
        org.junit.Assert.assertTrue("'" + serializable16 + "' != '" + 1L + "'", serializable16.equals(1L));
        org.junit.Assert.assertNotNull(iterator_serializable17);
        org.junit.Assert.assertTrue(i19 == 2);
        org.junit.Assert.assertTrue(i20 == 2);
        org.junit.Assert.assertTrue(b22 == true);
        org.junit.Assert.assertNotNull(iterator_serializable26);
        org.junit.Assert.assertTrue(i28 == 1);
        org.junit.Assert.assertNotNull(iterator_serializable29);
        org.junit.Assert.assertNotNull(spliterator_iterator_serializable31);
        org.junit.Assert.assertNotNull(iterator_iterator_serializable32);
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test305");
        edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<edu.osu.cs362.Queue<java.io.Serializable>>>> queue_iterable_iterator_queue_serializable0 = new edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<edu.osu.cs362.Queue<java.io.Serializable>>>>();
        edu.osu.cs362.Queue<java.util.Iterator<edu.osu.cs362.Queue<java.io.Serializable>>> queue_iterator_queue_serializable1 = new edu.osu.cs362.Queue<java.util.Iterator<edu.osu.cs362.Queue<java.io.Serializable>>>();
        int i2 = queue_iterator_queue_serializable1.size();
        java.util.Iterator<java.util.Iterator<edu.osu.cs362.Queue<java.io.Serializable>>> iterator_iterator_queue_serializable3 = queue_iterator_queue_serializable1.iterator();
        edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.io.Serializable>> queue_queue_serializable4 = new edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.io.Serializable>>();
        java.util.Spliterator<edu.osu.cs362.Queue<java.io.Serializable>> spliterator_queue_serializable5 = queue_queue_serializable4.spliterator();
        java.util.Iterator<edu.osu.cs362.Queue<java.io.Serializable>> iterator_queue_serializable6 = queue_queue_serializable4.iterator();
        queue_iterator_queue_serializable1.enqueue(iterator_queue_serializable6);
        java.util.Spliterator<java.util.Iterator<edu.osu.cs362.Queue<java.io.Serializable>>> spliterator_iterator_queue_serializable8 = queue_iterator_queue_serializable1.spliterator();
        queue_iterable_iterator_queue_serializable0.enqueue((java.lang.Iterable<java.util.Iterator<edu.osu.cs362.Queue<java.io.Serializable>>>) queue_iterator_queue_serializable1);
        boolean b10 = queue_iterable_iterator_queue_serializable0.isEmpty();
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNotNull(iterator_iterator_queue_serializable3);
        org.junit.Assert.assertNotNull(spliterator_queue_serializable5);
        org.junit.Assert.assertNotNull(iterator_queue_serializable6);
        org.junit.Assert.assertNotNull(spliterator_iterator_queue_serializable8);
        org.junit.Assert.assertTrue(b10 == false);
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test306");
        edu.osu.cs362.Queue<java.util.Spliterator<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>> queue_spliterator_iterable_queue_iterable_iterator_serializable0 = new edu.osu.cs362.Queue<java.util.Spliterator<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>();
        edu.osu.cs362.Queue<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>> queue_iterable_queue_iterable_iterator_serializable1 = new edu.osu.cs362.Queue<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>();
        java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>> iterable_queue_iterable_iterator_serializable2 = null;
        queue_iterable_queue_iterable_iterator_serializable1.enqueue(iterable_queue_iterable_iterator_serializable2);
        java.util.Iterator<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>> iterator_iterable_queue_iterable_iterator_serializable4 = queue_iterable_queue_iterable_iterator_serializable1.iterator();
        int i5 = queue_iterable_queue_iterable_iterator_serializable1.size();
        java.lang.String str6 = queue_iterable_queue_iterable_iterator_serializable1.toString();
        java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>> iterable_queue_iterable_iterator_serializable7 = queue_iterable_queue_iterable_iterator_serializable1.dequeue();
        java.util.Iterator<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>> iterator_iterable_queue_iterable_iterator_serializable8 = queue_iterable_queue_iterable_iterator_serializable1.iterator();
        java.util.Spliterator<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>> spliterator_iterable_queue_iterable_iterator_serializable9 = queue_iterable_queue_iterable_iterator_serializable1.spliterator();
        queue_spliterator_iterable_queue_iterable_iterator_serializable0.enqueue(spliterator_iterable_queue_iterable_iterator_serializable9);
        java.util.Spliterator<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>> spliterator_iterable_queue_iterable_iterator_serializable11 = queue_spliterator_iterable_queue_iterable_iterator_serializable0.peek();
        org.junit.Assert.assertNotNull(iterator_iterable_queue_iterable_iterator_serializable4);
        org.junit.Assert.assertTrue(i5 == 1);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "null " + "'", str6.equals("null "));
        org.junit.Assert.assertNull(iterable_queue_iterable_iterator_serializable7);
        org.junit.Assert.assertNotNull(iterator_iterable_queue_iterable_iterator_serializable8);
        org.junit.Assert.assertNotNull(spliterator_iterable_queue_iterable_iterator_serializable9);
        org.junit.Assert.assertNotNull(spliterator_iterable_queue_iterable_iterator_serializable11);
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test307");
        edu.osu.cs362.Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new edu.osu.cs362.Queue<java.lang.Comparable<java.lang.String>>();
        java.lang.String str1 = queue_comparable_str0.toString();
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test308");
        edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>> queue_iterable_iterator_serializable0 = new edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>();
        java.util.Iterator<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>> iterator_iterable_iterator_serializable1 = queue_iterable_iterator_serializable0.iterator();
        java.util.Spliterator<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>> spliterator_iterable_iterator_serializable2 = queue_iterable_iterator_serializable0.spliterator();
        java.util.Spliterator<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>> spliterator_iterable_iterator_serializable3 = queue_iterable_iterator_serializable0.spliterator();
        int i4 = queue_iterable_iterator_serializable0.size();
        java.lang.String str5 = queue_iterable_iterator_serializable0.toString();
        java.util.Iterator<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>> iterator_iterable_iterator_serializable6 = queue_iterable_iterator_serializable0.iterator();
        java.lang.String str7 = queue_iterable_iterator_serializable0.toString();
        java.util.Spliterator<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>> spliterator_iterable_iterator_serializable8 = queue_iterable_iterator_serializable0.spliterator();
        java.lang.String str9 = queue_iterable_iterator_serializable0.toString();
        org.junit.Assert.assertNotNull(iterator_iterable_iterator_serializable1);
        org.junit.Assert.assertNotNull(spliterator_iterable_iterator_serializable2);
        org.junit.Assert.assertNotNull(spliterator_iterable_iterator_serializable3);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertNotNull(iterator_iterable_iterator_serializable6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertNotNull(spliterator_iterable_iterator_serializable8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test309");
        edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>> queue_queue_iterable_iterator_serializable0 = new edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>();
        java.lang.String str1 = queue_queue_iterable_iterator_serializable0.toString();
        int i2 = queue_queue_iterable_iterator_serializable0.size();
        try {
            edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>> queue_iterable_iterator_serializable3 = queue_queue_iterable_iterator_serializable0.dequeue();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException");
        } catch (java.util.NoSuchElementException e) {
        }
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertTrue(i2 == 0);
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test310");
        edu.osu.cs362.Queue<java.util.Iterator<edu.osu.cs362.Queue<java.io.Serializable>>> queue_iterator_queue_serializable0 = new edu.osu.cs362.Queue<java.util.Iterator<edu.osu.cs362.Queue<java.io.Serializable>>>();
        int i1 = queue_iterator_queue_serializable0.size();
        java.util.Iterator<java.util.Iterator<edu.osu.cs362.Queue<java.io.Serializable>>> iterator_iterator_queue_serializable2 = queue_iterator_queue_serializable0.iterator();
        edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.io.Serializable>> queue_queue_serializable3 = new edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.io.Serializable>>();
        java.util.Spliterator<edu.osu.cs362.Queue<java.io.Serializable>> spliterator_queue_serializable4 = queue_queue_serializable3.spliterator();
        java.util.Iterator<edu.osu.cs362.Queue<java.io.Serializable>> iterator_queue_serializable5 = queue_queue_serializable3.iterator();
        queue_iterator_queue_serializable0.enqueue(iterator_queue_serializable5);
        java.lang.String str7 = queue_iterator_queue_serializable0.toString();
        boolean b8 = queue_iterator_queue_serializable0.isEmpty();
        boolean b9 = queue_iterator_queue_serializable0.isEmpty();
        int i10 = queue_iterator_queue_serializable0.size();
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertNotNull(iterator_iterator_queue_serializable2);
        org.junit.Assert.assertNotNull(spliterator_queue_serializable4);
        org.junit.Assert.assertNotNull(iterator_queue_serializable5);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue(i10 == 1);
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test311");
        edu.osu.cs362.Queue<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>> queue_iterable_queue_iterable_queue_iterable_iterator_serializable0 = new edu.osu.cs362.Queue<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>>();
        java.util.Spliterator<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>> spliterator_iterable_queue_iterable_queue_iterable_iterator_serializable1 = queue_iterable_queue_iterable_queue_iterable_iterator_serializable0.spliterator();
        try {
            java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>> iterable_queue_iterable_queue_iterable_iterator_serializable2 = queue_iterable_queue_iterable_queue_iterable_iterator_serializable0.peek();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException");
        } catch (java.util.NoSuchElementException e) {
        }
        org.junit.Assert.assertNotNull(spliterator_iterable_queue_iterable_queue_iterable_iterator_serializable1);
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test312");
        edu.osu.cs362.Queue<java.util.Iterator<java.util.Iterator<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>> queue_iterator_iterator_queue_iterable_iterator_serializable0 = new edu.osu.cs362.Queue<java.util.Iterator<java.util.Iterator<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>();
        int i1 = queue_iterator_iterator_queue_iterable_iterator_serializable0.size();
        edu.osu.cs362.Queue<java.util.Iterator<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>> queue_iterator_queue_iterable_iterator_serializable2 = new edu.osu.cs362.Queue<java.util.Iterator<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>();
        java.util.Iterator<java.util.Iterator<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>> iterator_iterator_queue_iterable_iterator_serializable3 = queue_iterator_queue_iterable_iterator_serializable2.iterator();
        queue_iterator_iterator_queue_iterable_iterator_serializable0.enqueue(iterator_iterator_queue_iterable_iterator_serializable3);
        java.util.Spliterator<java.util.Iterator<java.util.Iterator<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>> spliterator_iterator_iterator_queue_iterable_iterator_serializable5 = queue_iterator_iterator_queue_iterable_iterator_serializable0.spliterator();
        java.util.Spliterator<java.util.Iterator<java.util.Iterator<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>> spliterator_iterator_iterator_queue_iterable_iterator_serializable6 = queue_iterator_iterator_queue_iterable_iterator_serializable0.spliterator();
        int i7 = queue_iterator_iterator_queue_iterable_iterator_serializable0.size();
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertNotNull(iterator_iterator_queue_iterable_iterator_serializable3);
        org.junit.Assert.assertNotNull(spliterator_iterator_iterator_queue_iterable_iterator_serializable5);
        org.junit.Assert.assertNotNull(spliterator_iterator_iterator_queue_iterable_iterator_serializable6);
        org.junit.Assert.assertTrue(i7 == 1);
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test313");
        edu.osu.cs362.Queue<java.lang.Iterable<java.io.Serializable>> queue_iterable_serializable0 = new edu.osu.cs362.Queue<java.lang.Iterable<java.io.Serializable>>();
        int i1 = queue_iterable_serializable0.size();
        edu.osu.cs362.Queue<java.io.Serializable> queue_serializable2 = new edu.osu.cs362.Queue<java.io.Serializable>();
        queue_serializable2.enqueue((java.io.Serializable) 1L);
        java.lang.String str5 = queue_serializable2.toString();
        java.io.Serializable serializable6 = queue_serializable2.dequeue();
        java.util.Spliterator<java.io.Serializable> spliterator_serializable7 = queue_serializable2.spliterator();
        queue_iterable_serializable0.enqueue((java.lang.Iterable<java.io.Serializable>) queue_serializable2);
        boolean b9 = queue_iterable_serializable0.isEmpty();
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "1 " + "'", str5.equals("1 "));
        org.junit.Assert.assertTrue("'" + serializable6 + "' != '" + 1L + "'", serializable6.equals(1L));
        org.junit.Assert.assertNotNull(spliterator_serializable7);
        org.junit.Assert.assertTrue(b9 == false);
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test314");
        edu.osu.cs362.Queue<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>> queue_iterable_queue_iterable_iterator_serializable0 = new edu.osu.cs362.Queue<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>();
        edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>> queue_queue_iterable_iterator_serializable1 = new edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>();
        java.lang.String str2 = queue_queue_iterable_iterator_serializable1.toString();
        int i3 = queue_queue_iterable_iterator_serializable1.size();
        queue_iterable_queue_iterable_iterator_serializable0.enqueue((java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>) queue_queue_iterable_iterator_serializable1);
        boolean b5 = queue_iterable_queue_iterable_iterator_serializable0.isEmpty();
        java.lang.String str6 = queue_iterable_queue_iterable_iterator_serializable0.toString();
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + " " + "'", str6.equals(" "));
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test315");
        edu.osu.cs362.Queue<java.util.Iterator<java.lang.Iterable<java.util.Iterator<edu.osu.cs362.Queue<java.io.Serializable>>>>> queue_iterator_iterable_iterator_queue_serializable0 = new edu.osu.cs362.Queue<java.util.Iterator<java.lang.Iterable<java.util.Iterator<edu.osu.cs362.Queue<java.io.Serializable>>>>>();
        java.util.Spliterator<java.util.Iterator<java.lang.Iterable<java.util.Iterator<edu.osu.cs362.Queue<java.io.Serializable>>>>> spliterator_iterator_iterable_iterator_queue_serializable1 = queue_iterator_iterable_iterator_queue_serializable0.spliterator();
        java.lang.String str2 = queue_iterator_iterable_iterator_queue_serializable0.toString();
        java.lang.String str3 = queue_iterator_iterable_iterator_queue_serializable0.toString();
        org.junit.Assert.assertNotNull(spliterator_iterator_iterable_iterator_queue_serializable1);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test316");
        edu.osu.cs362.Queue<java.util.Iterator<java.lang.Iterable<java.util.Iterator<edu.osu.cs362.Queue<java.io.Serializable>>>>> queue_iterator_iterable_iterator_queue_serializable0 = new edu.osu.cs362.Queue<java.util.Iterator<java.lang.Iterable<java.util.Iterator<edu.osu.cs362.Queue<java.io.Serializable>>>>>();
        java.util.Spliterator<java.util.Iterator<java.lang.Iterable<java.util.Iterator<edu.osu.cs362.Queue<java.io.Serializable>>>>> spliterator_iterator_iterable_iterator_queue_serializable1 = queue_iterator_iterable_iterator_queue_serializable0.spliterator();
        java.lang.String str2 = queue_iterator_iterable_iterator_queue_serializable0.toString();
        boolean b3 = queue_iterator_iterable_iterator_queue_serializable0.isEmpty();
        org.junit.Assert.assertNotNull(spliterator_iterator_iterable_iterator_queue_serializable1);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
        org.junit.Assert.assertTrue(b3 == true);
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test317");
        edu.osu.cs362.Queue<java.lang.Iterable<java.lang.Iterable<java.lang.Iterable<java.lang.Object>>>> queue_iterable_iterable_iterable_obj0 = new edu.osu.cs362.Queue<java.lang.Iterable<java.lang.Iterable<java.lang.Iterable<java.lang.Object>>>>();
        java.util.Iterator<java.lang.Iterable<java.lang.Iterable<java.lang.Iterable<java.lang.Object>>>> iterator_iterable_iterable_iterable_obj1 = queue_iterable_iterable_iterable_obj0.iterator();
        int i2 = queue_iterable_iterable_iterable_obj0.size();
        int i3 = queue_iterable_iterable_iterable_obj0.size();
        java.util.Spliterator<java.lang.Iterable<java.lang.Iterable<java.lang.Iterable<java.lang.Object>>>> spliterator_iterable_iterable_iterable_obj4 = queue_iterable_iterable_iterable_obj0.spliterator();
        edu.osu.cs362.Queue<java.lang.Iterable<java.lang.Iterable<java.lang.Iterable<java.lang.Object>>>> queue_iterable_iterable_iterable_obj5 = new edu.osu.cs362.Queue<java.lang.Iterable<java.lang.Iterable<java.lang.Iterable<java.lang.Object>>>>();
        java.util.Iterator<java.lang.Iterable<java.lang.Iterable<java.lang.Iterable<java.lang.Object>>>> iterator_iterable_iterable_iterable_obj6 = queue_iterable_iterable_iterable_obj5.iterator();
        edu.osu.cs362.Queue<java.lang.Iterable<java.lang.Iterable<java.lang.Object>>> queue_iterable_iterable_obj7 = new edu.osu.cs362.Queue<java.lang.Iterable<java.lang.Iterable<java.lang.Object>>>();
        queue_iterable_iterable_iterable_obj5.enqueue((java.lang.Iterable<java.lang.Iterable<java.lang.Iterable<java.lang.Object>>>) queue_iterable_iterable_obj7);
        int i9 = queue_iterable_iterable_obj7.size();
        boolean b10 = queue_iterable_iterable_obj7.isEmpty();
        boolean b11 = queue_iterable_iterable_obj7.isEmpty();
        queue_iterable_iterable_iterable_obj0.enqueue((java.lang.Iterable<java.lang.Iterable<java.lang.Iterable<java.lang.Object>>>) queue_iterable_iterable_obj7);
        try {
            java.lang.Iterable<java.lang.Iterable<java.lang.Object>> iterable_iterable_obj13 = queue_iterable_iterable_obj7.dequeue();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException");
        } catch (java.util.NoSuchElementException e) {
        }
        org.junit.Assert.assertNotNull(iterator_iterable_iterable_iterable_obj1);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertNotNull(spliterator_iterable_iterable_iterable_obj4);
        org.junit.Assert.assertNotNull(iterator_iterable_iterable_iterable_obj6);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue(b11 == true);
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test318");
        edu.osu.cs362.Queue<java.util.Iterator<java.lang.Iterable<java.util.Iterator<edu.osu.cs362.Queue<java.io.Serializable>>>>> queue_iterator_iterable_iterator_queue_serializable0 = new edu.osu.cs362.Queue<java.util.Iterator<java.lang.Iterable<java.util.Iterator<edu.osu.cs362.Queue<java.io.Serializable>>>>>();
        java.util.Spliterator<java.util.Iterator<java.lang.Iterable<java.util.Iterator<edu.osu.cs362.Queue<java.io.Serializable>>>>> spliterator_iterator_iterable_iterator_queue_serializable1 = queue_iterator_iterable_iterator_queue_serializable0.spliterator();
        try {
            java.util.Iterator<java.lang.Iterable<java.util.Iterator<edu.osu.cs362.Queue<java.io.Serializable>>>> iterator_iterable_iterator_queue_serializable2 = queue_iterator_iterable_iterator_queue_serializable0.peek();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException");
        } catch (java.util.NoSuchElementException e) {
        }
        org.junit.Assert.assertNotNull(spliterator_iterator_iterable_iterator_queue_serializable1);
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test319");
        edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<edu.osu.cs362.Queue<java.io.Serializable>>>> queue_iterable_iterator_queue_serializable0 = new edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<edu.osu.cs362.Queue<java.io.Serializable>>>>();
        java.util.Iterator<java.lang.Iterable<java.util.Iterator<edu.osu.cs362.Queue<java.io.Serializable>>>> iterator_iterable_iterator_queue_serializable1 = queue_iterable_iterator_queue_serializable0.iterator();
        edu.osu.cs362.Queue<java.util.Iterator<edu.osu.cs362.Queue<java.io.Serializable>>> queue_iterator_queue_serializable2 = new edu.osu.cs362.Queue<java.util.Iterator<edu.osu.cs362.Queue<java.io.Serializable>>>();
        java.lang.String str3 = queue_iterator_queue_serializable2.toString();
        queue_iterable_iterator_queue_serializable0.enqueue((java.lang.Iterable<java.util.Iterator<edu.osu.cs362.Queue<java.io.Serializable>>>) queue_iterator_queue_serializable2);
        java.util.Iterator<java.lang.Iterable<java.util.Iterator<edu.osu.cs362.Queue<java.io.Serializable>>>> iterator_iterable_iterator_queue_serializable5 = queue_iterable_iterator_queue_serializable0.iterator();
        edu.osu.cs362.Queue<java.util.Iterator<edu.osu.cs362.Queue<java.io.Serializable>>> queue_iterator_queue_serializable6 = new edu.osu.cs362.Queue<java.util.Iterator<edu.osu.cs362.Queue<java.io.Serializable>>>();
        int i7 = queue_iterator_queue_serializable6.size();
        java.util.Iterator<java.util.Iterator<edu.osu.cs362.Queue<java.io.Serializable>>> iterator_iterator_queue_serializable8 = queue_iterator_queue_serializable6.iterator();
        edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.io.Serializable>> queue_queue_serializable9 = new edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.io.Serializable>>();
        java.util.Spliterator<edu.osu.cs362.Queue<java.io.Serializable>> spliterator_queue_serializable10 = queue_queue_serializable9.spliterator();
        java.util.Iterator<edu.osu.cs362.Queue<java.io.Serializable>> iterator_queue_serializable11 = queue_queue_serializable9.iterator();
        queue_iterator_queue_serializable6.enqueue(iterator_queue_serializable11);
        java.util.Spliterator<java.util.Iterator<edu.osu.cs362.Queue<java.io.Serializable>>> spliterator_iterator_queue_serializable13 = queue_iterator_queue_serializable6.spliterator();
        queue_iterable_iterator_queue_serializable0.enqueue((java.lang.Iterable<java.util.Iterator<edu.osu.cs362.Queue<java.io.Serializable>>>) queue_iterator_queue_serializable6);
        boolean b15 = queue_iterable_iterator_queue_serializable0.isEmpty();
        java.util.Iterator<java.lang.Iterable<java.util.Iterator<edu.osu.cs362.Queue<java.io.Serializable>>>> iterator_iterable_iterator_queue_serializable16 = queue_iterable_iterator_queue_serializable0.iterator();
        java.util.Spliterator<java.lang.Iterable<java.util.Iterator<edu.osu.cs362.Queue<java.io.Serializable>>>> spliterator_iterable_iterator_queue_serializable17 = queue_iterable_iterator_queue_serializable0.spliterator();
        org.junit.Assert.assertNotNull(iterator_iterable_iterator_queue_serializable1);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertNotNull(iterator_iterable_iterator_queue_serializable5);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertNotNull(iterator_iterator_queue_serializable8);
        org.junit.Assert.assertNotNull(spliterator_queue_serializable10);
        org.junit.Assert.assertNotNull(iterator_queue_serializable11);
        org.junit.Assert.assertNotNull(spliterator_iterator_queue_serializable13);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNotNull(iterator_iterable_iterator_queue_serializable16);
        org.junit.Assert.assertNotNull(spliterator_iterable_iterator_queue_serializable17);
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test320");
        edu.osu.cs362.Queue<java.util.Iterator<java.util.Iterator<java.lang.Object>>> queue_iterator_iterator_obj0 = new edu.osu.cs362.Queue<java.util.Iterator<java.util.Iterator<java.lang.Object>>>();
        java.util.Iterator<java.util.Iterator<java.util.Iterator<java.lang.Object>>> iterator_iterator_iterator_obj1 = queue_iterator_iterator_obj0.iterator();
        boolean b2 = queue_iterator_iterator_obj0.isEmpty();
        java.lang.String str3 = queue_iterator_iterator_obj0.toString();
        edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.lang.Object>>> queue_iterable_iterator_obj4 = new edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.lang.Object>>>();
        edu.osu.cs362.Queue<java.util.Iterator<java.lang.Object>> queue_iterator_obj5 = new edu.osu.cs362.Queue<java.util.Iterator<java.lang.Object>>();
        queue_iterable_iterator_obj4.enqueue((java.lang.Iterable<java.util.Iterator<java.lang.Object>>) queue_iterator_obj5);
        java.lang.String str7 = queue_iterator_obj5.toString();
        java.util.Iterator<java.util.Iterator<java.lang.Object>> iterator_iterator_obj8 = queue_iterator_obj5.iterator();
        queue_iterator_iterator_obj0.enqueue(iterator_iterator_obj8);
        boolean b10 = queue_iterator_iterator_obj0.isEmpty();
        org.junit.Assert.assertNotNull(iterator_iterator_iterator_obj1);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertNotNull(iterator_iterator_obj8);
        org.junit.Assert.assertTrue(b10 == false);
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test321");
        edu.osu.cs362.Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new edu.osu.cs362.Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.enqueue((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str3 = queue_comparable_str0.peek();
        java.util.Iterator<java.lang.Comparable<java.lang.String>> iterator_comparable_str4 = queue_comparable_str0.iterator();
        int i5 = queue_comparable_str0.size();
        int i6 = queue_comparable_str0.size();
        org.junit.Assert.assertTrue("'" + comparable_str3 + "' != '" + "hi!" + "'", comparable_str3.equals("hi!"));
        org.junit.Assert.assertNotNull(iterator_comparable_str4);
        org.junit.Assert.assertTrue(i5 == 1);
        org.junit.Assert.assertTrue(i6 == 1);
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test322");
        edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.io.Serializable>> queue_queue_serializable0 = new edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.io.Serializable>>();
        java.util.Spliterator<edu.osu.cs362.Queue<java.io.Serializable>> spliterator_queue_serializable1 = queue_queue_serializable0.spliterator();
        java.lang.String str2 = queue_queue_serializable0.toString();
        edu.osu.cs362.Queue<java.io.Serializable> queue_serializable3 = new edu.osu.cs362.Queue<java.io.Serializable>();
        queue_serializable3.enqueue((java.io.Serializable) 1L);
        java.io.Serializable serializable6 = queue_serializable3.peek();
        java.util.Iterator<java.io.Serializable> iterator_serializable7 = queue_serializable3.iterator();
        java.io.Serializable serializable8 = queue_serializable3.peek();
        queue_queue_serializable0.enqueue(queue_serializable3);
        java.util.Iterator<edu.osu.cs362.Queue<java.io.Serializable>> iterator_queue_serializable10 = queue_queue_serializable0.iterator();
        int i11 = queue_queue_serializable0.size();
        org.junit.Assert.assertNotNull(spliterator_queue_serializable1);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
        org.junit.Assert.assertTrue("'" + serializable6 + "' != '" + 1L + "'", serializable6.equals(1L));
        org.junit.Assert.assertNotNull(iterator_serializable7);
        org.junit.Assert.assertTrue("'" + serializable8 + "' != '" + 1L + "'", serializable8.equals(1L));
        org.junit.Assert.assertNotNull(iterator_queue_serializable10);
        org.junit.Assert.assertTrue(i11 == 1);
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test323");
        edu.osu.cs362.Queue<java.util.Spliterator<java.lang.Iterable<java.lang.Iterable<java.util.Iterator<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>>>> queue_spliterator_iterable_iterable_iterator_iterable_queue_iterable_iterator_serializable0 = new edu.osu.cs362.Queue<java.util.Spliterator<java.lang.Iterable<java.lang.Iterable<java.util.Iterator<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>>>>();
        boolean b1 = queue_spliterator_iterable_iterable_iterator_iterable_queue_iterable_iterator_serializable0.isEmpty();
        java.util.Spliterator<java.util.Spliterator<java.lang.Iterable<java.lang.Iterable<java.util.Iterator<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>>>> spliterator_spliterator_iterable_iterable_iterator_iterable_queue_iterable_iterator_serializable2 = queue_spliterator_iterable_iterable_iterator_iterable_queue_iterable_iterator_serializable0.spliterator();
        try {
            java.util.Spliterator<java.lang.Iterable<java.lang.Iterable<java.util.Iterator<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>>> spliterator_iterable_iterable_iterator_iterable_queue_iterable_iterator_serializable3 = queue_spliterator_iterable_iterable_iterator_iterable_queue_iterable_iterator_serializable0.dequeue();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException");
        } catch (java.util.NoSuchElementException e) {
        }
        org.junit.Assert.assertTrue(b1 == true);
        org.junit.Assert.assertNotNull(spliterator_spliterator_iterable_iterable_iterator_iterable_queue_iterable_iterator_serializable2);
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test324");
        edu.osu.cs362.Queue<java.util.Iterator<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>> queue_iterator_iterable_queue_iterable_iterator_serializable0 = new edu.osu.cs362.Queue<java.util.Iterator<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>();
        boolean b1 = queue_iterator_iterable_queue_iterable_iterator_serializable0.isEmpty();
        try {
            java.util.Iterator<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>> iterator_iterable_queue_iterable_iterator_serializable2 = queue_iterator_iterable_queue_iterable_iterator_serializable0.dequeue();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException");
        } catch (java.util.NoSuchElementException e) {
        }
        org.junit.Assert.assertTrue(b1 == true);
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test325");
        edu.osu.cs362.Queue<java.util.Iterator<java.util.Iterator<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>> queue_iterator_iterator_queue_iterable_iterator_serializable0 = new edu.osu.cs362.Queue<java.util.Iterator<java.util.Iterator<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>();
        int i1 = queue_iterator_iterator_queue_iterable_iterator_serializable0.size();
        java.lang.String str2 = queue_iterator_iterator_queue_iterable_iterator_serializable0.toString();
        boolean b3 = queue_iterator_iterator_queue_iterable_iterator_serializable0.isEmpty();
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
        org.junit.Assert.assertTrue(b3 == true);
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test326");
        edu.osu.cs362.Queue<java.lang.Iterable<java.io.Serializable>> queue_iterable_serializable0 = new edu.osu.cs362.Queue<java.lang.Iterable<java.io.Serializable>>();
        java.util.Iterator<java.lang.Iterable<java.io.Serializable>> iterator_iterable_serializable1 = queue_iterable_serializable0.iterator();
        int i2 = queue_iterable_serializable0.size();
        boolean b3 = queue_iterable_serializable0.isEmpty();
        org.junit.Assert.assertNotNull(iterator_iterable_serializable1);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(b3 == true);
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test327");
        edu.osu.cs362.Queue<java.util.Spliterator<java.io.Serializable>> queue_spliterator_serializable0 = new edu.osu.cs362.Queue<java.util.Spliterator<java.io.Serializable>>();
        java.util.Iterator<java.util.Spliterator<java.io.Serializable>> iterator_spliterator_serializable1 = queue_spliterator_serializable0.iterator();
        int i2 = queue_spliterator_serializable0.size();
        edu.osu.cs362.Queue<java.io.Serializable> queue_serializable3 = new edu.osu.cs362.Queue<java.io.Serializable>();
        queue_serializable3.enqueue((java.io.Serializable) 1L);
        java.io.Serializable serializable6 = queue_serializable3.peek();
        java.util.Iterator<java.io.Serializable> iterator_serializable7 = queue_serializable3.iterator();
        java.util.Iterator<java.io.Serializable> iterator_serializable8 = queue_serializable3.iterator();
        java.util.Spliterator<java.io.Serializable> spliterator_serializable9 = queue_serializable3.spliterator();
        java.util.Spliterator<java.io.Serializable> spliterator_serializable10 = queue_serializable3.spliterator();
        queue_spliterator_serializable0.enqueue(spliterator_serializable10);
        org.junit.Assert.assertNotNull(iterator_spliterator_serializable1);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue("'" + serializable6 + "' != '" + 1L + "'", serializable6.equals(1L));
        org.junit.Assert.assertNotNull(iterator_serializable7);
        org.junit.Assert.assertNotNull(iterator_serializable8);
        org.junit.Assert.assertNotNull(spliterator_serializable9);
        org.junit.Assert.assertNotNull(spliterator_serializable10);
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test328");
        edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.lang.Object>>> queue_iterable_iterator_obj0 = new edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.lang.Object>>>();
        edu.osu.cs362.Queue<java.util.Iterator<java.lang.Object>> queue_iterator_obj1 = new edu.osu.cs362.Queue<java.util.Iterator<java.lang.Object>>();
        queue_iterable_iterator_obj0.enqueue((java.lang.Iterable<java.util.Iterator<java.lang.Object>>) queue_iterator_obj1);
        edu.osu.cs362.Queue<java.util.Iterator<java.lang.Object>> queue_iterator_obj3 = new edu.osu.cs362.Queue<java.util.Iterator<java.lang.Object>>();
        queue_iterable_iterator_obj0.enqueue((java.lang.Iterable<java.util.Iterator<java.lang.Object>>) queue_iterator_obj3);
        java.lang.Iterable<java.util.Iterator<java.lang.Object>> iterable_iterator_obj5 = queue_iterable_iterator_obj0.peek();
        int i6 = queue_iterable_iterator_obj0.size();
        java.lang.Iterable<java.util.Iterator<java.lang.Object>> iterable_iterator_obj7 = queue_iterable_iterator_obj0.dequeue();
        org.junit.Assert.assertNotNull(iterable_iterator_obj5);
        org.junit.Assert.assertTrue(i6 == 2);
        org.junit.Assert.assertNotNull(iterable_iterator_obj7);
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test329");
        edu.osu.cs362.Queue<java.io.Serializable> queue_serializable0 = new edu.osu.cs362.Queue<java.io.Serializable>();
        queue_serializable0.enqueue((java.io.Serializable) 1L);
        java.io.Serializable serializable3 = queue_serializable0.peek();
        java.util.Iterator<java.io.Serializable> iterator_serializable4 = queue_serializable0.iterator();
        java.io.Serializable serializable5 = queue_serializable0.peek();
        java.io.Serializable serializable6 = queue_serializable0.peek();
        java.io.Serializable serializable7 = queue_serializable0.peek();
        boolean b8 = queue_serializable0.isEmpty();
        queue_serializable0.enqueue((java.io.Serializable) (short) 0);
        queue_serializable0.enqueue((java.io.Serializable) 0);
        org.junit.Assert.assertTrue("'" + serializable3 + "' != '" + 1L + "'", serializable3.equals(1L));
        org.junit.Assert.assertNotNull(iterator_serializable4);
        org.junit.Assert.assertTrue("'" + serializable5 + "' != '" + 1L + "'", serializable5.equals(1L));
        org.junit.Assert.assertTrue("'" + serializable6 + "' != '" + 1L + "'", serializable6.equals(1L));
        org.junit.Assert.assertTrue("'" + serializable7 + "' != '" + 1L + "'", serializable7.equals(1L));
        org.junit.Assert.assertTrue(b8 == false);
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test330");
        edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.io.Serializable>> queue_queue_serializable0 = new edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.io.Serializable>>();
        java.util.Spliterator<edu.osu.cs362.Queue<java.io.Serializable>> spliterator_queue_serializable1 = queue_queue_serializable0.spliterator();
        java.lang.String str2 = queue_queue_serializable0.toString();
        edu.osu.cs362.Queue<java.io.Serializable> queue_serializable3 = new edu.osu.cs362.Queue<java.io.Serializable>();
        queue_serializable3.enqueue((java.io.Serializable) 1L);
        java.io.Serializable serializable6 = queue_serializable3.peek();
        java.util.Iterator<java.io.Serializable> iterator_serializable7 = queue_serializable3.iterator();
        java.io.Serializable serializable8 = queue_serializable3.peek();
        queue_queue_serializable0.enqueue(queue_serializable3);
        int i10 = queue_serializable3.size();
        org.junit.Assert.assertNotNull(spliterator_queue_serializable1);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
        org.junit.Assert.assertTrue("'" + serializable6 + "' != '" + 1L + "'", serializable6.equals(1L));
        org.junit.Assert.assertNotNull(iterator_serializable7);
        org.junit.Assert.assertTrue("'" + serializable8 + "' != '" + 1L + "'", serializable8.equals(1L));
        org.junit.Assert.assertTrue(i10 == 1);
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test331");
        edu.osu.cs362.Queue<java.lang.Iterable<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>> queue_iterable_iterable_iterator_serializable0 = new edu.osu.cs362.Queue<java.lang.Iterable<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>();
        java.util.Iterator<java.lang.Iterable<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>> iterator_iterable_iterable_iterator_serializable1 = queue_iterable_iterable_iterator_serializable0.iterator();
        java.util.Spliterator<java.lang.Iterable<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>> spliterator_iterable_iterable_iterator_serializable2 = queue_iterable_iterable_iterator_serializable0.spliterator();
        edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>> queue_iterable_iterator_serializable3 = new edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>();
        java.util.Iterator<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>> iterator_iterable_iterator_serializable4 = queue_iterable_iterator_serializable3.iterator();
        java.util.Spliterator<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>> spliterator_iterable_iterator_serializable5 = queue_iterable_iterator_serializable3.spliterator();
        java.util.Spliterator<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>> spliterator_iterable_iterator_serializable6 = queue_iterable_iterator_serializable3.spliterator();
        int i7 = queue_iterable_iterator_serializable3.size();
        java.lang.String str8 = queue_iterable_iterator_serializable3.toString();
        java.util.Iterator<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>> iterator_iterable_iterator_serializable9 = queue_iterable_iterator_serializable3.iterator();
        edu.osu.cs362.Queue<java.util.Iterator<java.io.Serializable>> queue_iterator_serializable10 = new edu.osu.cs362.Queue<java.util.Iterator<java.io.Serializable>>();
        java.lang.String str11 = queue_iterator_serializable10.toString();
        int i12 = queue_iterator_serializable10.size();
        queue_iterable_iterator_serializable3.enqueue((java.lang.Iterable<java.util.Iterator<java.io.Serializable>>) queue_iterator_serializable10);
        boolean b14 = queue_iterable_iterator_serializable3.isEmpty();
        queue_iterable_iterable_iterator_serializable0.enqueue((java.lang.Iterable<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>) queue_iterable_iterator_serializable3);
        boolean b16 = queue_iterable_iterator_serializable3.isEmpty();
        edu.osu.cs362.Queue<java.util.Iterator<java.io.Serializable>> queue_iterator_serializable17 = new edu.osu.cs362.Queue<java.util.Iterator<java.io.Serializable>>();
        boolean b18 = queue_iterator_serializable17.isEmpty();
        edu.osu.cs362.Queue<java.io.Serializable> queue_serializable19 = new edu.osu.cs362.Queue<java.io.Serializable>();
        queue_serializable19.enqueue((java.io.Serializable) 1L);
        java.io.Serializable serializable22 = queue_serializable19.peek();
        java.util.Iterator<java.io.Serializable> iterator_serializable23 = queue_serializable19.iterator();
        java.util.Iterator<java.io.Serializable> iterator_serializable24 = queue_serializable19.iterator();
        queue_iterator_serializable17.enqueue(iterator_serializable24);
        java.util.Iterator<java.io.Serializable> iterator_serializable26 = queue_iterator_serializable17.peek();
        queue_iterable_iterator_serializable3.enqueue((java.lang.Iterable<java.util.Iterator<java.io.Serializable>>) queue_iterator_serializable17);
        java.lang.Iterable<java.util.Iterator<java.io.Serializable>> iterable_iterator_serializable28 = queue_iterable_iterator_serializable3.dequeue();
        org.junit.Assert.assertNotNull(iterator_iterable_iterable_iterator_serializable1);
        org.junit.Assert.assertNotNull(spliterator_iterable_iterable_iterator_serializable2);
        org.junit.Assert.assertNotNull(iterator_iterable_iterator_serializable4);
        org.junit.Assert.assertNotNull(spliterator_iterable_iterator_serializable5);
        org.junit.Assert.assertNotNull(spliterator_iterable_iterator_serializable6);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertNotNull(iterator_iterable_iterator_serializable9);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertTrue("'" + serializable22 + "' != '" + 1L + "'", serializable22.equals(1L));
        org.junit.Assert.assertNotNull(iterator_serializable23);
        org.junit.Assert.assertNotNull(iterator_serializable24);
        org.junit.Assert.assertNotNull(iterator_serializable26);
        org.junit.Assert.assertNotNull(iterable_iterator_serializable28);
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test332");
        edu.osu.cs362.Queue<java.lang.Iterable<edu.osu.cs362.Queue<edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>>>> queue_iterable_queue_queue_queue_iterable_queue_iterable_iterator_serializable0 = new edu.osu.cs362.Queue<java.lang.Iterable<edu.osu.cs362.Queue<edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>>>>();
        edu.osu.cs362.Queue<edu.osu.cs362.Queue<edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>>> queue_queue_queue_queue_iterable_queue_iterable_iterator_serializable1 = new edu.osu.cs362.Queue<edu.osu.cs362.Queue<edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>>>();
        queue_iterable_queue_queue_queue_iterable_queue_iterable_iterator_serializable0.enqueue((java.lang.Iterable<edu.osu.cs362.Queue<edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>>>) queue_queue_queue_queue_iterable_queue_iterable_iterator_serializable1);
        try {
            edu.osu.cs362.Queue<edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>> queue_queue_queue_iterable_queue_iterable_iterator_serializable3 = queue_queue_queue_queue_iterable_queue_iterable_iterator_serializable1.peek();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException");
        } catch (java.util.NoSuchElementException e) {
        }
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test333");
        edu.osu.cs362.Queue<java.util.Iterator<edu.osu.cs362.Queue<java.io.Serializable>>> queue_iterator_queue_serializable0 = new edu.osu.cs362.Queue<java.util.Iterator<edu.osu.cs362.Queue<java.io.Serializable>>>();
        java.util.Spliterator<java.util.Iterator<edu.osu.cs362.Queue<java.io.Serializable>>> spliterator_iterator_queue_serializable1 = queue_iterator_queue_serializable0.spliterator();
        java.util.Spliterator<java.util.Iterator<edu.osu.cs362.Queue<java.io.Serializable>>> spliterator_iterator_queue_serializable2 = queue_iterator_queue_serializable0.spliterator();
        org.junit.Assert.assertNotNull(spliterator_iterator_queue_serializable1);
        org.junit.Assert.assertNotNull(spliterator_iterator_queue_serializable2);
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test334");
        edu.osu.cs362.Queue<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.lang.Object>>>>> queue_iterable_queue_iterable_iterator_obj0 = new edu.osu.cs362.Queue<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.lang.Object>>>>>();
        java.util.Spliterator<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.lang.Object>>>>> spliterator_iterable_queue_iterable_iterator_obj1 = queue_iterable_queue_iterable_iterator_obj0.spliterator();
        try {
            java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.lang.Object>>>> iterable_queue_iterable_iterator_obj2 = queue_iterable_queue_iterable_iterator_obj0.peek();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException");
        } catch (java.util.NoSuchElementException e) {
        }
        org.junit.Assert.assertNotNull(spliterator_iterable_queue_iterable_iterator_obj1);
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test335");
        edu.osu.cs362.Queue<java.util.Iterator<java.util.Iterator<java.lang.Object>>> queue_iterator_iterator_obj0 = new edu.osu.cs362.Queue<java.util.Iterator<java.util.Iterator<java.lang.Object>>>();
        java.util.Iterator<java.util.Iterator<java.util.Iterator<java.lang.Object>>> iterator_iterator_iterator_obj1 = queue_iterator_iterator_obj0.iterator();
        boolean b2 = queue_iterator_iterator_obj0.isEmpty();
        java.lang.String str3 = queue_iterator_iterator_obj0.toString();
        java.lang.String str4 = queue_iterator_iterator_obj0.toString();
        try {
            java.util.Iterator<java.util.Iterator<java.lang.Object>> iterator_iterator_obj5 = queue_iterator_iterator_obj0.peek();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException");
        } catch (java.util.NoSuchElementException e) {
        }
        org.junit.Assert.assertNotNull(iterator_iterator_iterator_obj1);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test336");
        edu.osu.cs362.Queue<edu.osu.cs362.Queue<edu.osu.cs362.Queue<edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>>>> queue_queue_queue_queue_queue_iterable_queue_iterable_iterator_serializable0 = new edu.osu.cs362.Queue<edu.osu.cs362.Queue<edu.osu.cs362.Queue<edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>>>>();
        try {
            edu.osu.cs362.Queue<edu.osu.cs362.Queue<edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>>> queue_queue_queue_queue_iterable_queue_iterable_iterator_serializable1 = queue_queue_queue_queue_queue_iterable_queue_iterable_iterator_serializable0.dequeue();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException");
        } catch (java.util.NoSuchElementException e) {
        }
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test337");
        edu.osu.cs362.Queue<java.util.Iterator<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>> queue_iterator_queue_iterable_iterator_serializable0 = new edu.osu.cs362.Queue<java.util.Iterator<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>();
        try {
            java.util.Iterator<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>> iterator_queue_iterable_iterator_serializable1 = queue_iterator_queue_iterable_iterator_serializable0.peek();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException");
        } catch (java.util.NoSuchElementException e) {
        }
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test338");
        edu.osu.cs362.Queue<java.lang.Iterable<java.lang.Iterable<java.lang.Iterable<java.lang.Object>>>> queue_iterable_iterable_iterable_obj0 = new edu.osu.cs362.Queue<java.lang.Iterable<java.lang.Iterable<java.lang.Iterable<java.lang.Object>>>>();
        java.util.Iterator<java.lang.Iterable<java.lang.Iterable<java.lang.Iterable<java.lang.Object>>>> iterator_iterable_iterable_iterable_obj1 = queue_iterable_iterable_iterable_obj0.iterator();
        int i2 = queue_iterable_iterable_iterable_obj0.size();
        int i3 = queue_iterable_iterable_iterable_obj0.size();
        edu.osu.cs362.Queue<java.lang.Iterable<java.lang.Iterable<java.lang.Object>>> queue_iterable_iterable_obj4 = new edu.osu.cs362.Queue<java.lang.Iterable<java.lang.Iterable<java.lang.Object>>>();
        boolean b5 = queue_iterable_iterable_obj4.isEmpty();
        java.lang.String str6 = queue_iterable_iterable_obj4.toString();
        queue_iterable_iterable_iterable_obj0.enqueue((java.lang.Iterable<java.lang.Iterable<java.lang.Iterable<java.lang.Object>>>) queue_iterable_iterable_obj4);
        edu.osu.cs362.Queue<java.lang.Iterable<java.lang.Object>> queue_iterable_obj8 = new edu.osu.cs362.Queue<java.lang.Iterable<java.lang.Object>>();
        edu.osu.cs362.Queue<java.lang.Object> queue_obj9 = new edu.osu.cs362.Queue<java.lang.Object>();
        int i10 = queue_obj9.size();
        java.util.Spliterator<java.lang.Object> spliterator_obj11 = queue_obj9.spliterator();
        edu.osu.cs362.Queue<java.util.Iterator<java.io.Serializable>> queue_iterator_serializable12 = new edu.osu.cs362.Queue<java.util.Iterator<java.io.Serializable>>();
        boolean b13 = queue_iterator_serializable12.isEmpty();
        edu.osu.cs362.Queue<java.io.Serializable> queue_serializable14 = new edu.osu.cs362.Queue<java.io.Serializable>();
        queue_serializable14.enqueue((java.io.Serializable) 1L);
        java.util.Iterator<java.io.Serializable> iterator_serializable17 = queue_serializable14.iterator();
        queue_iterator_serializable12.enqueue(iterator_serializable17);
        int i19 = queue_iterator_serializable12.size();
        java.util.Iterator<java.io.Serializable> iterator_serializable20 = queue_iterator_serializable12.peek();
        boolean b21 = queue_iterator_serializable12.isEmpty();
        java.util.Iterator<java.io.Serializable> iterator_serializable22 = queue_iterator_serializable12.peek();
        queue_obj9.enqueue((java.lang.Object) queue_iterator_serializable12);
        queue_iterable_obj8.enqueue((java.lang.Iterable<java.lang.Object>) queue_obj9);
        queue_iterable_iterable_obj4.enqueue((java.lang.Iterable<java.lang.Iterable<java.lang.Object>>) queue_iterable_obj8);
        java.util.Iterator<java.lang.Iterable<java.lang.Iterable<java.lang.Object>>> iterator_iterable_iterable_obj26 = queue_iterable_iterable_obj4.iterator();
        org.junit.Assert.assertNotNull(iterator_iterable_iterable_iterable_obj1);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue(i10 == 0);
        org.junit.Assert.assertNotNull(spliterator_obj11);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertNotNull(iterator_serializable17);
        org.junit.Assert.assertTrue(i19 == 1);
        org.junit.Assert.assertNotNull(iterator_serializable20);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertNotNull(iterator_serializable22);
        org.junit.Assert.assertNotNull(iterator_iterable_iterable_obj26);
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test339");
        edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>> queue_iterable_iterator_serializable0 = new edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>();
        boolean b1 = queue_iterable_iterator_serializable0.isEmpty();
        java.lang.String str2 = queue_iterable_iterator_serializable0.toString();
        int i3 = queue_iterable_iterator_serializable0.size();
        org.junit.Assert.assertTrue(b1 == true);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
        org.junit.Assert.assertTrue(i3 == 0);
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test340");
        edu.osu.cs362.Queue<java.lang.Iterable<java.lang.Object>> queue_iterable_obj0 = new edu.osu.cs362.Queue<java.lang.Iterable<java.lang.Object>>();
        java.util.Spliterator<java.lang.Iterable<java.lang.Object>> spliterator_iterable_obj1 = queue_iterable_obj0.spliterator();
        edu.osu.cs362.Queue<java.lang.Object> queue_obj2 = new edu.osu.cs362.Queue<java.lang.Object>();
        int i3 = queue_obj2.size();
        java.util.Spliterator<java.lang.Object> spliterator_obj4 = queue_obj2.spliterator();
        edu.osu.cs362.Queue<java.util.Iterator<java.io.Serializable>> queue_iterator_serializable5 = new edu.osu.cs362.Queue<java.util.Iterator<java.io.Serializable>>();
        boolean b6 = queue_iterator_serializable5.isEmpty();
        edu.osu.cs362.Queue<java.io.Serializable> queue_serializable7 = new edu.osu.cs362.Queue<java.io.Serializable>();
        queue_serializable7.enqueue((java.io.Serializable) 1L);
        java.util.Iterator<java.io.Serializable> iterator_serializable10 = queue_serializable7.iterator();
        queue_iterator_serializable5.enqueue(iterator_serializable10);
        int i12 = queue_iterator_serializable5.size();
        java.util.Iterator<java.io.Serializable> iterator_serializable13 = queue_iterator_serializable5.peek();
        boolean b14 = queue_iterator_serializable5.isEmpty();
        java.util.Iterator<java.io.Serializable> iterator_serializable15 = queue_iterator_serializable5.peek();
        queue_obj2.enqueue((java.lang.Object) queue_iterator_serializable5);
        java.lang.String str17 = queue_obj2.toString();
        queue_iterable_obj0.enqueue((java.lang.Iterable<java.lang.Object>) queue_obj2);
        java.util.Spliterator<java.lang.Object> spliterator_obj19 = queue_obj2.spliterator();
        java.lang.Object obj20 = queue_obj2.peek();
        org.junit.Assert.assertNotNull(spliterator_iterable_obj1);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertNotNull(spliterator_obj4);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertNotNull(iterator_serializable10);
        org.junit.Assert.assertTrue(i12 == 1);
        org.junit.Assert.assertNotNull(iterator_serializable13);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNotNull(iterator_serializable15);
        org.junit.Assert.assertNotNull(spliterator_obj19);
        org.junit.Assert.assertNotNull(obj20);
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test341");
        edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.lang.Object>>> queue_iterable_iterator_obj0 = new edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.lang.Object>>>();
        edu.osu.cs362.Queue<java.util.Iterator<java.lang.Object>> queue_iterator_obj1 = new edu.osu.cs362.Queue<java.util.Iterator<java.lang.Object>>();
        queue_iterable_iterator_obj0.enqueue((java.lang.Iterable<java.util.Iterator<java.lang.Object>>) queue_iterator_obj1);
        edu.osu.cs362.Queue<java.util.Iterator<java.lang.Object>> queue_iterator_obj3 = new edu.osu.cs362.Queue<java.util.Iterator<java.lang.Object>>();
        queue_iterable_iterator_obj0.enqueue((java.lang.Iterable<java.util.Iterator<java.lang.Object>>) queue_iterator_obj3);
        java.lang.Iterable<java.util.Iterator<java.lang.Object>> iterable_iterator_obj5 = queue_iterable_iterator_obj0.peek();
        java.lang.String str6 = queue_iterable_iterator_obj0.toString();
        java.util.Iterator<java.lang.Iterable<java.util.Iterator<java.lang.Object>>> iterator_iterable_iterator_obj7 = queue_iterable_iterator_obj0.iterator();
        java.util.Iterator<java.lang.Iterable<java.util.Iterator<java.lang.Object>>> iterator_iterable_iterator_obj8 = queue_iterable_iterator_obj0.iterator();
        org.junit.Assert.assertNotNull(iterable_iterator_obj5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "  " + "'", str6.equals("  "));
        org.junit.Assert.assertNotNull(iterator_iterable_iterator_obj7);
        org.junit.Assert.assertNotNull(iterator_iterable_iterator_obj8);
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test342");
        edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>> queue_iterable_iterator_iterable_queue_iterable_iterator_serializable0 = new edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>>();
        boolean b1 = queue_iterable_iterator_iterable_queue_iterable_iterator_serializable0.isEmpty();
        org.junit.Assert.assertTrue(b1 == true);
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test343");
        edu.osu.cs362.Queue<edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.lang.Comparable<java.lang.String>>>> queue_queue_queue_comparable_str0 = new edu.osu.cs362.Queue<edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.lang.Comparable<java.lang.String>>>>();
        boolean b1 = queue_queue_queue_comparable_str0.isEmpty();
        java.util.Iterator<edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.lang.Comparable<java.lang.String>>>> iterator_queue_queue_comparable_str2 = queue_queue_queue_comparable_str0.iterator();
        int i3 = queue_queue_queue_comparable_str0.size();
        java.lang.String str4 = queue_queue_queue_comparable_str0.toString();
        try {
            edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.lang.Comparable<java.lang.String>>> queue_queue_comparable_str5 = queue_queue_queue_comparable_str0.peek();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException");
        } catch (java.util.NoSuchElementException e) {
        }
        org.junit.Assert.assertTrue(b1 == true);
        org.junit.Assert.assertNotNull(iterator_queue_queue_comparable_str2);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test344");
        edu.osu.cs362.Queue<java.io.Serializable> queue_serializable0 = new edu.osu.cs362.Queue<java.io.Serializable>();
        queue_serializable0.enqueue((java.io.Serializable) 1L);
        java.io.Serializable serializable3 = queue_serializable0.peek();
        java.util.Iterator<java.io.Serializable> iterator_serializable4 = queue_serializable0.iterator();
        java.util.Iterator<java.io.Serializable> iterator_serializable5 = queue_serializable0.iterator();
        java.io.Serializable serializable6 = queue_serializable0.dequeue();
        java.util.Iterator<java.io.Serializable> iterator_serializable7 = queue_serializable0.iterator();
        org.junit.Assert.assertTrue("'" + serializable3 + "' != '" + 1L + "'", serializable3.equals(1L));
        org.junit.Assert.assertNotNull(iterator_serializable4);
        org.junit.Assert.assertNotNull(iterator_serializable5);
        org.junit.Assert.assertTrue("'" + serializable6 + "' != '" + 1L + "'", serializable6.equals(1L));
        org.junit.Assert.assertNotNull(iterator_serializable7);
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test345");
        edu.osu.cs362.Queue<java.util.Spliterator<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>> queue_spliterator_iterable_queue_iterable_iterator_serializable0 = new edu.osu.cs362.Queue<java.util.Spliterator<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>();
        boolean b1 = queue_spliterator_iterable_queue_iterable_iterator_serializable0.isEmpty();
        boolean b2 = queue_spliterator_iterable_queue_iterable_iterator_serializable0.isEmpty();
        java.util.Iterator<java.util.Spliterator<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>> iterator_spliterator_iterable_queue_iterable_iterator_serializable3 = queue_spliterator_iterable_queue_iterable_iterator_serializable0.iterator();
        org.junit.Assert.assertTrue(b1 == true);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNotNull(iterator_spliterator_iterable_queue_iterable_iterator_serializable3);
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test346");
        edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.io.Serializable>> queue_queue_serializable0 = new edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.io.Serializable>>();
        int i1 = queue_queue_serializable0.size();
        java.util.Iterator<edu.osu.cs362.Queue<java.io.Serializable>> iterator_queue_serializable2 = queue_queue_serializable0.iterator();
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertNotNull(iterator_queue_serializable2);
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test347");
        edu.osu.cs362.Queue<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>> queue_iterable_queue_iterable_iterator_serializable0 = new edu.osu.cs362.Queue<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>();
        edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>> queue_queue_iterable_iterator_serializable1 = new edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>();
        java.lang.String str2 = queue_queue_iterable_iterator_serializable1.toString();
        int i3 = queue_queue_iterable_iterator_serializable1.size();
        queue_iterable_queue_iterable_iterator_serializable0.enqueue((java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>) queue_queue_iterable_iterator_serializable1);
        int i5 = queue_queue_iterable_iterator_serializable1.size();
        int i6 = queue_queue_iterable_iterator_serializable1.size();
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test348");
        edu.osu.cs362.Queue<java.lang.Iterable<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>> queue_iterable_iterable_iterator_serializable0 = new edu.osu.cs362.Queue<java.lang.Iterable<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>();
        java.util.Iterator<java.lang.Iterable<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>> iterator_iterable_iterable_iterator_serializable1 = queue_iterable_iterable_iterator_serializable0.iterator();
        java.util.Spliterator<java.lang.Iterable<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>> spliterator_iterable_iterable_iterator_serializable2 = queue_iterable_iterable_iterator_serializable0.spliterator();
        java.util.Spliterator<java.lang.Iterable<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>> spliterator_iterable_iterable_iterator_serializable3 = queue_iterable_iterable_iterator_serializable0.spliterator();
        int i4 = queue_iterable_iterable_iterator_serializable0.size();
        try {
            java.lang.Iterable<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>> iterable_iterable_iterator_serializable5 = queue_iterable_iterable_iterator_serializable0.dequeue();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException");
        } catch (java.util.NoSuchElementException e) {
        }
        org.junit.Assert.assertNotNull(iterator_iterable_iterable_iterator_serializable1);
        org.junit.Assert.assertNotNull(spliterator_iterable_iterable_iterator_serializable2);
        org.junit.Assert.assertNotNull(spliterator_iterable_iterable_iterator_serializable3);
        org.junit.Assert.assertTrue(i4 == 0);
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test349");
        edu.osu.cs362.Queue<java.util.Spliterator<java.lang.Iterable<java.lang.Iterable<java.util.Iterator<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>>>> queue_spliterator_iterable_iterable_iterator_iterable_queue_iterable_iterator_serializable0 = new edu.osu.cs362.Queue<java.util.Spliterator<java.lang.Iterable<java.lang.Iterable<java.util.Iterator<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>>>>();
        boolean b1 = queue_spliterator_iterable_iterable_iterator_iterable_queue_iterable_iterator_serializable0.isEmpty();
        try {
            java.util.Spliterator<java.lang.Iterable<java.lang.Iterable<java.util.Iterator<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>>> spliterator_iterable_iterable_iterator_iterable_queue_iterable_iterator_serializable2 = queue_spliterator_iterable_iterable_iterator_iterable_queue_iterable_iterator_serializable0.peek();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException");
        } catch (java.util.NoSuchElementException e) {
        }
        org.junit.Assert.assertTrue(b1 == true);
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test350");
        edu.osu.cs362.Queue<java.util.Spliterator<java.util.Spliterator<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>> queue_spliterator_spliterator_iterable_queue_iterable_iterator_serializable0 = new edu.osu.cs362.Queue<java.util.Spliterator<java.util.Spliterator<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>>();
        int i1 = queue_spliterator_spliterator_iterable_queue_iterable_iterator_serializable0.size();
        int i2 = queue_spliterator_spliterator_iterable_queue_iterable_iterator_serializable0.size();
        try {
            java.util.Spliterator<java.util.Spliterator<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>> spliterator_spliterator_iterable_queue_iterable_iterator_serializable3 = queue_spliterator_spliterator_iterable_queue_iterable_iterator_serializable0.dequeue();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException");
        } catch (java.util.NoSuchElementException e) {
        }
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test351");
        edu.osu.cs362.Queue<java.util.Iterator<java.util.Iterator<java.util.Iterator<java.lang.Object>>>> queue_iterator_iterator_iterator_obj0 = new edu.osu.cs362.Queue<java.util.Iterator<java.util.Iterator<java.util.Iterator<java.lang.Object>>>>();
        java.util.Spliterator<java.util.Iterator<java.util.Iterator<java.util.Iterator<java.lang.Object>>>> spliterator_iterator_iterator_iterator_obj1 = queue_iterator_iterator_iterator_obj0.spliterator();
        org.junit.Assert.assertNotNull(spliterator_iterator_iterator_iterator_obj1);
    }

    @Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test352");
        edu.osu.cs362.Queue<java.lang.Object> queue_obj0 = new edu.osu.cs362.Queue<java.lang.Object>();
        int i1 = queue_obj0.size();
        edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>> queue_iterable_iterator_serializable2 = new edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>();
        java.util.Iterator<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>> iterator_iterable_iterator_serializable3 = queue_iterable_iterator_serializable2.iterator();
        java.util.Spliterator<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>> spliterator_iterable_iterator_serializable4 = queue_iterable_iterator_serializable2.spliterator();
        java.lang.String str5 = queue_iterable_iterator_serializable2.toString();
        int i6 = queue_iterable_iterator_serializable2.size();
        queue_obj0.enqueue((java.lang.Object) queue_iterable_iterator_serializable2);
        edu.osu.cs362.Queue<java.util.Spliterator<java.io.Serializable>> queue_spliterator_serializable8 = new edu.osu.cs362.Queue<java.util.Spliterator<java.io.Serializable>>();
        java.util.Iterator<java.util.Spliterator<java.io.Serializable>> iterator_spliterator_serializable9 = queue_spliterator_serializable8.iterator();
        edu.osu.cs362.Queue<java.io.Serializable> queue_serializable10 = new edu.osu.cs362.Queue<java.io.Serializable>();
        queue_serializable10.enqueue((java.io.Serializable) 1L);
        java.io.Serializable serializable13 = queue_serializable10.peek();
        java.util.Iterator<java.io.Serializable> iterator_serializable14 = queue_serializable10.iterator();
        java.util.Iterator<java.io.Serializable> iterator_serializable15 = queue_serializable10.iterator();
        java.util.Spliterator<java.io.Serializable> spliterator_serializable16 = queue_serializable10.spliterator();
        queue_spliterator_serializable8.enqueue(spliterator_serializable16);
        java.util.Iterator<java.util.Spliterator<java.io.Serializable>> iterator_spliterator_serializable18 = queue_spliterator_serializable8.iterator();
        queue_obj0.enqueue((java.lang.Object) iterator_spliterator_serializable18);
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertNotNull(iterator_iterable_iterator_serializable3);
        org.junit.Assert.assertNotNull(spliterator_iterable_iterator_serializable4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertNotNull(iterator_spliterator_serializable9);
        org.junit.Assert.assertTrue("'" + serializable13 + "' != '" + 1L + "'", serializable13.equals(1L));
        org.junit.Assert.assertNotNull(iterator_serializable14);
        org.junit.Assert.assertNotNull(iterator_serializable15);
        org.junit.Assert.assertNotNull(spliterator_serializable16);
        org.junit.Assert.assertNotNull(iterator_spliterator_serializable18);
    }

    @Test
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test353");
        edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>> queue_queue_iterable_iterator_serializable0 = new edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>();
        edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>> queue_iterable_iterator_serializable1 = new edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>();
        java.util.Iterator<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>> iterator_iterable_iterator_serializable2 = queue_iterable_iterator_serializable1.iterator();
        java.util.Spliterator<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>> spliterator_iterable_iterator_serializable3 = queue_iterable_iterator_serializable1.spliterator();
        queue_queue_iterable_iterator_serializable0.enqueue(queue_iterable_iterator_serializable1);
        edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>> queue_iterable_iterator_serializable5 = queue_queue_iterable_iterator_serializable0.dequeue();
        java.lang.String str6 = queue_iterable_iterator_serializable5.toString();
        org.junit.Assert.assertNotNull(iterator_iterable_iterator_serializable2);
        org.junit.Assert.assertNotNull(spliterator_iterable_iterator_serializable3);
        org.junit.Assert.assertNotNull(queue_iterable_iterator_serializable5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test354");
        edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>> queue_iterable_iterator_iterable_queue_iterable_iterator_serializable0 = new edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>>();
        int i1 = queue_iterable_iterator_iterable_queue_iterable_iterator_serializable0.size();
        int i2 = queue_iterable_iterator_iterable_queue_iterable_iterator_serializable0.size();
        java.util.Iterator<java.lang.Iterable<java.util.Iterator<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>> iterator_iterable_iterator_iterable_queue_iterable_iterator_serializable3 = queue_iterable_iterator_iterable_queue_iterable_iterator_serializable0.iterator();
        int i4 = queue_iterable_iterator_iterable_queue_iterable_iterator_serializable0.size();
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNotNull(iterator_iterable_iterator_iterable_queue_iterable_iterator_serializable3);
        org.junit.Assert.assertTrue(i4 == 0);
    }

    @Test
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test355");
        edu.osu.cs362.Queue<java.lang.Iterable<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.lang.Object>>>>>> queue_iterable_iterable_queue_iterable_iterator_obj0 = new edu.osu.cs362.Queue<java.lang.Iterable<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.lang.Object>>>>>>();
        try {
            java.lang.Iterable<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.lang.Object>>>>> iterable_iterable_queue_iterable_iterator_obj1 = queue_iterable_iterable_queue_iterable_iterator_obj0.peek();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException");
        } catch (java.util.NoSuchElementException e) {
        }
    }

    @Test
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test356");
        edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<edu.osu.cs362.Queue<java.io.Serializable>>>> queue_iterable_iterator_queue_serializable0 = new edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<edu.osu.cs362.Queue<java.io.Serializable>>>>();
        java.util.Iterator<java.lang.Iterable<java.util.Iterator<edu.osu.cs362.Queue<java.io.Serializable>>>> iterator_iterable_iterator_queue_serializable1 = queue_iterable_iterator_queue_serializable0.iterator();
        edu.osu.cs362.Queue<java.util.Iterator<edu.osu.cs362.Queue<java.io.Serializable>>> queue_iterator_queue_serializable2 = new edu.osu.cs362.Queue<java.util.Iterator<edu.osu.cs362.Queue<java.io.Serializable>>>();
        java.lang.String str3 = queue_iterator_queue_serializable2.toString();
        queue_iterable_iterator_queue_serializable0.enqueue((java.lang.Iterable<java.util.Iterator<edu.osu.cs362.Queue<java.io.Serializable>>>) queue_iterator_queue_serializable2);
        java.util.Iterator<java.lang.Iterable<java.util.Iterator<edu.osu.cs362.Queue<java.io.Serializable>>>> iterator_iterable_iterator_queue_serializable5 = queue_iterable_iterator_queue_serializable0.iterator();
        edu.osu.cs362.Queue<java.util.Iterator<edu.osu.cs362.Queue<java.io.Serializable>>> queue_iterator_queue_serializable6 = new edu.osu.cs362.Queue<java.util.Iterator<edu.osu.cs362.Queue<java.io.Serializable>>>();
        int i7 = queue_iterator_queue_serializable6.size();
        java.util.Iterator<java.util.Iterator<edu.osu.cs362.Queue<java.io.Serializable>>> iterator_iterator_queue_serializable8 = queue_iterator_queue_serializable6.iterator();
        edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.io.Serializable>> queue_queue_serializable9 = new edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.io.Serializable>>();
        java.util.Spliterator<edu.osu.cs362.Queue<java.io.Serializable>> spliterator_queue_serializable10 = queue_queue_serializable9.spliterator();
        java.util.Iterator<edu.osu.cs362.Queue<java.io.Serializable>> iterator_queue_serializable11 = queue_queue_serializable9.iterator();
        queue_iterator_queue_serializable6.enqueue(iterator_queue_serializable11);
        java.util.Spliterator<java.util.Iterator<edu.osu.cs362.Queue<java.io.Serializable>>> spliterator_iterator_queue_serializable13 = queue_iterator_queue_serializable6.spliterator();
        queue_iterable_iterator_queue_serializable0.enqueue((java.lang.Iterable<java.util.Iterator<edu.osu.cs362.Queue<java.io.Serializable>>>) queue_iterator_queue_serializable6);
        boolean b15 = queue_iterable_iterator_queue_serializable0.isEmpty();
        java.lang.Iterable<java.util.Iterator<edu.osu.cs362.Queue<java.io.Serializable>>> iterable_iterator_queue_serializable16 = null;
        queue_iterable_iterator_queue_serializable0.enqueue(iterable_iterator_queue_serializable16);
        int i18 = queue_iterable_iterator_queue_serializable0.size();
        java.util.Iterator<java.lang.Iterable<java.util.Iterator<edu.osu.cs362.Queue<java.io.Serializable>>>> iterator_iterable_iterator_queue_serializable19 = queue_iterable_iterator_queue_serializable0.iterator();
        org.junit.Assert.assertNotNull(iterator_iterable_iterator_queue_serializable1);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertNotNull(iterator_iterable_iterator_queue_serializable5);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertNotNull(iterator_iterator_queue_serializable8);
        org.junit.Assert.assertNotNull(spliterator_queue_serializable10);
        org.junit.Assert.assertNotNull(iterator_queue_serializable11);
        org.junit.Assert.assertNotNull(spliterator_iterator_queue_serializable13);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue(i18 == 3);
        org.junit.Assert.assertNotNull(iterator_iterable_iterator_queue_serializable19);
    }

    @Test
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test357");
        edu.osu.cs362.Queue<java.util.Spliterator<java.io.Serializable>> queue_spliterator_serializable0 = new edu.osu.cs362.Queue<java.util.Spliterator<java.io.Serializable>>();
        java.util.Iterator<java.util.Spliterator<java.io.Serializable>> iterator_spliterator_serializable1 = queue_spliterator_serializable0.iterator();
        edu.osu.cs362.Queue<java.io.Serializable> queue_serializable2 = new edu.osu.cs362.Queue<java.io.Serializable>();
        queue_serializable2.enqueue((java.io.Serializable) 1L);
        java.io.Serializable serializable5 = queue_serializable2.peek();
        java.util.Iterator<java.io.Serializable> iterator_serializable6 = queue_serializable2.iterator();
        java.util.Iterator<java.io.Serializable> iterator_serializable7 = queue_serializable2.iterator();
        java.util.Spliterator<java.io.Serializable> spliterator_serializable8 = queue_serializable2.spliterator();
        queue_spliterator_serializable0.enqueue(spliterator_serializable8);
        java.util.Iterator<java.util.Spliterator<java.io.Serializable>> iterator_spliterator_serializable10 = queue_spliterator_serializable0.iterator();
        java.util.Spliterator<java.util.Spliterator<java.io.Serializable>> spliterator_spliterator_serializable11 = queue_spliterator_serializable0.spliterator();
        org.junit.Assert.assertNotNull(iterator_spliterator_serializable1);
        org.junit.Assert.assertTrue("'" + serializable5 + "' != '" + 1L + "'", serializable5.equals(1L));
        org.junit.Assert.assertNotNull(iterator_serializable6);
        org.junit.Assert.assertNotNull(iterator_serializable7);
        org.junit.Assert.assertNotNull(spliterator_serializable8);
        org.junit.Assert.assertNotNull(iterator_spliterator_serializable10);
        org.junit.Assert.assertNotNull(spliterator_spliterator_serializable11);
    }

    @Test
    public void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test358");
        edu.osu.cs362.Queue<java.lang.Iterable<java.lang.Object>> queue_iterable_obj0 = new edu.osu.cs362.Queue<java.lang.Iterable<java.lang.Object>>();
        java.lang.String str1 = queue_iterable_obj0.toString();
        edu.osu.cs362.Queue<java.lang.Object> queue_obj2 = new edu.osu.cs362.Queue<java.lang.Object>();
        int i3 = queue_obj2.size();
        edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>> queue_iterable_iterator_serializable4 = new edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>();
        java.util.Iterator<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>> iterator_iterable_iterator_serializable5 = queue_iterable_iterator_serializable4.iterator();
        java.util.Spliterator<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>> spliterator_iterable_iterator_serializable6 = queue_iterable_iterator_serializable4.spliterator();
        java.lang.String str7 = queue_iterable_iterator_serializable4.toString();
        int i8 = queue_iterable_iterator_serializable4.size();
        queue_obj2.enqueue((java.lang.Object) queue_iterable_iterator_serializable4);
        queue_iterable_obj0.enqueue((java.lang.Iterable<java.lang.Object>) queue_obj2);
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertNotNull(iterator_iterable_iterator_serializable5);
        org.junit.Assert.assertNotNull(spliterator_iterable_iterator_serializable6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue(i8 == 0);
    }

    @Test
    public void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test359");
        edu.osu.cs362.Queue<java.lang.Iterable<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.lang.Object>>>>>> queue_iterable_iterable_queue_iterable_iterator_obj0 = new edu.osu.cs362.Queue<java.lang.Iterable<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.lang.Object>>>>>>();
        try {
            java.lang.Iterable<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.lang.Object>>>>> iterable_iterable_queue_iterable_iterator_obj1 = queue_iterable_iterable_queue_iterable_iterator_obj0.dequeue();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException");
        } catch (java.util.NoSuchElementException e) {
        }
    }

    @Test
    public void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test360");
        edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.util.Iterator<edu.osu.cs362.Queue<java.io.Serializable>>>> queue_queue_iterator_queue_serializable0 = new edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.util.Iterator<edu.osu.cs362.Queue<java.io.Serializable>>>>();
        java.util.Spliterator<edu.osu.cs362.Queue<java.util.Iterator<edu.osu.cs362.Queue<java.io.Serializable>>>> spliterator_queue_iterator_queue_serializable1 = queue_queue_iterator_queue_serializable0.spliterator();
        edu.osu.cs362.Queue<java.util.Iterator<edu.osu.cs362.Queue<java.io.Serializable>>> queue_iterator_queue_serializable2 = new edu.osu.cs362.Queue<java.util.Iterator<edu.osu.cs362.Queue<java.io.Serializable>>>();
        int i3 = queue_iterator_queue_serializable2.size();
        java.util.Iterator<java.util.Iterator<edu.osu.cs362.Queue<java.io.Serializable>>> iterator_iterator_queue_serializable4 = queue_iterator_queue_serializable2.iterator();
        edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.io.Serializable>> queue_queue_serializable5 = new edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.io.Serializable>>();
        java.util.Spliterator<edu.osu.cs362.Queue<java.io.Serializable>> spliterator_queue_serializable6 = queue_queue_serializable5.spliterator();
        java.util.Iterator<edu.osu.cs362.Queue<java.io.Serializable>> iterator_queue_serializable7 = queue_queue_serializable5.iterator();
        queue_iterator_queue_serializable2.enqueue(iterator_queue_serializable7);
        java.lang.String str9 = queue_iterator_queue_serializable2.toString();
        boolean b10 = queue_iterator_queue_serializable2.isEmpty();
        queue_queue_iterator_queue_serializable0.enqueue(queue_iterator_queue_serializable2);
        edu.osu.cs362.Queue<java.util.Iterator<edu.osu.cs362.Queue<java.io.Serializable>>> queue_iterator_queue_serializable12 = queue_queue_iterator_queue_serializable0.dequeue();
        boolean b13 = queue_queue_iterator_queue_serializable0.isEmpty();
        org.junit.Assert.assertNotNull(spliterator_queue_iterator_queue_serializable1);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertNotNull(iterator_iterator_queue_serializable4);
        org.junit.Assert.assertNotNull(spliterator_queue_serializable6);
        org.junit.Assert.assertNotNull(iterator_queue_serializable7);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertNotNull(queue_iterator_queue_serializable12);
        org.junit.Assert.assertTrue(b13 == true);
    }

    @Test
    public void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test361");
        edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>> queue_iterable_iterator_serializable0 = new edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>();
        java.util.Iterator<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>> iterator_iterable_iterator_serializable1 = queue_iterable_iterator_serializable0.iterator();
        java.util.Spliterator<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>> spliterator_iterable_iterator_serializable2 = queue_iterable_iterator_serializable0.spliterator();
        java.lang.String str3 = queue_iterable_iterator_serializable0.toString();
        java.lang.String str4 = queue_iterable_iterator_serializable0.toString();
        try {
            java.lang.Iterable<java.util.Iterator<java.io.Serializable>> iterable_iterator_serializable5 = queue_iterable_iterator_serializable0.peek();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException");
        } catch (java.util.NoSuchElementException e) {
        }
        org.junit.Assert.assertNotNull(iterator_iterable_iterator_serializable1);
        org.junit.Assert.assertNotNull(spliterator_iterable_iterator_serializable2);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
    }

    @Test
    public void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test362");
        edu.osu.cs362.Queue<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>> queue_iterable_queue_iterable_iterator_serializable0 = new edu.osu.cs362.Queue<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>();
        edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>> queue_queue_iterable_iterator_serializable1 = new edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>();
        java.lang.String str2 = queue_queue_iterable_iterator_serializable1.toString();
        int i3 = queue_queue_iterable_iterator_serializable1.size();
        queue_iterable_queue_iterable_iterator_serializable0.enqueue((java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>) queue_queue_iterable_iterator_serializable1);
        try {
            edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>> queue_iterable_iterator_serializable5 = queue_queue_iterable_iterator_serializable1.dequeue();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException");
        } catch (java.util.NoSuchElementException e) {
        }
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
        org.junit.Assert.assertTrue(i3 == 0);
    }

    @Test
    public void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test363");
        edu.osu.cs362.Queue<java.util.Spliterator<java.lang.Iterable<java.util.Iterator<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>>> queue_spliterator_iterable_iterator_iterable_queue_iterable_iterator_serializable0 = new edu.osu.cs362.Queue<java.util.Spliterator<java.lang.Iterable<java.util.Iterator<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>>>();
        int i1 = queue_spliterator_iterable_iterator_iterable_queue_iterable_iterator_serializable0.size();
        edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>> queue_iterable_iterator_iterable_queue_iterable_iterator_serializable2 = new edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>>();
        java.util.Spliterator<java.lang.Iterable<java.util.Iterator<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>> spliterator_iterable_iterator_iterable_queue_iterable_iterator_serializable3 = queue_iterable_iterator_iterable_queue_iterable_iterator_serializable2.spliterator();
        queue_spliterator_iterable_iterator_iterable_queue_iterable_iterator_serializable0.enqueue(spliterator_iterable_iterator_iterable_queue_iterable_iterator_serializable3);
        edu.osu.cs362.Queue<java.util.Spliterator<java.lang.Iterable<java.util.Iterator<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>>> queue_spliterator_iterable_iterator_iterable_queue_iterable_iterator_serializable5 = new edu.osu.cs362.Queue<java.util.Spliterator<java.lang.Iterable<java.util.Iterator<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>>>();
        int i6 = queue_spliterator_iterable_iterator_iterable_queue_iterable_iterator_serializable5.size();
        edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>> queue_iterable_iterator_iterable_queue_iterable_iterator_serializable7 = new edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>>();
        java.util.Spliterator<java.lang.Iterable<java.util.Iterator<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>> spliterator_iterable_iterator_iterable_queue_iterable_iterator_serializable8 = queue_iterable_iterator_iterable_queue_iterable_iterator_serializable7.spliterator();
        queue_spliterator_iterable_iterator_iterable_queue_iterable_iterator_serializable5.enqueue(spliterator_iterable_iterator_iterable_queue_iterable_iterator_serializable8);
        java.util.Spliterator<java.lang.Iterable<java.util.Iterator<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>> spliterator_iterable_iterator_iterable_queue_iterable_iterator_serializable10 = queue_spliterator_iterable_iterator_iterable_queue_iterable_iterator_serializable5.peek();
        queue_spliterator_iterable_iterator_iterable_queue_iterable_iterator_serializable0.enqueue(spliterator_iterable_iterator_iterable_queue_iterable_iterator_serializable10);
        boolean b12 = queue_spliterator_iterable_iterator_iterable_queue_iterable_iterator_serializable0.isEmpty();
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertNotNull(spliterator_iterable_iterator_iterable_queue_iterable_iterator_serializable3);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertNotNull(spliterator_iterable_iterator_iterable_queue_iterable_iterator_serializable8);
        org.junit.Assert.assertNotNull(spliterator_iterable_iterator_iterable_queue_iterable_iterator_serializable10);
        org.junit.Assert.assertTrue(b12 == false);
    }

    @Test
    public void test364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test364");
        edu.osu.cs362.Queue<java.util.Spliterator<java.util.Iterator<java.io.Serializable>>> queue_spliterator_iterator_serializable0 = new edu.osu.cs362.Queue<java.util.Spliterator<java.util.Iterator<java.io.Serializable>>>();
        java.lang.String str1 = queue_spliterator_iterator_serializable0.toString();
        java.util.Spliterator<java.util.Spliterator<java.util.Iterator<java.io.Serializable>>> spliterator_spliterator_iterator_serializable2 = queue_spliterator_iterator_serializable0.spliterator();
        boolean b3 = queue_spliterator_iterator_serializable0.isEmpty();
        java.util.Iterator<java.util.Spliterator<java.util.Iterator<java.io.Serializable>>> iterator_spliterator_iterator_serializable4 = queue_spliterator_iterator_serializable0.iterator();
        try {
            java.util.Spliterator<java.util.Iterator<java.io.Serializable>> spliterator_iterator_serializable5 = queue_spliterator_iterator_serializable0.dequeue();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException");
        } catch (java.util.NoSuchElementException e) {
        }
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertNotNull(spliterator_spliterator_iterator_serializable2);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertNotNull(iterator_spliterator_iterator_serializable4);
    }

    @Test
    public void test365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test365");
        edu.osu.cs362.Queue<java.lang.Iterable<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>>> queue_iterable_iterable_queue_iterable_queue_iterable_iterator_serializable0 = new edu.osu.cs362.Queue<java.lang.Iterable<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>>>();
        try {
            java.lang.Iterable<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>> iterable_iterable_queue_iterable_queue_iterable_iterator_serializable1 = queue_iterable_iterable_queue_iterable_queue_iterable_iterator_serializable0.peek();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException");
        } catch (java.util.NoSuchElementException e) {
        }
    }

    @Test
    public void test366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test366");
        edu.osu.cs362.Queue<java.util.Iterator<java.util.Iterator<edu.osu.cs362.Queue<java.io.Serializable>>>> queue_iterator_iterator_queue_serializable0 = new edu.osu.cs362.Queue<java.util.Iterator<java.util.Iterator<edu.osu.cs362.Queue<java.io.Serializable>>>>();
        try {
            java.util.Iterator<java.util.Iterator<edu.osu.cs362.Queue<java.io.Serializable>>> iterator_iterator_queue_serializable1 = queue_iterator_iterator_queue_serializable0.peek();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException");
        } catch (java.util.NoSuchElementException e) {
        }
    }

    @Test
    public void test367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test367");
        edu.osu.cs362.Queue<java.lang.Iterable<java.io.Serializable>> queue_iterable_serializable0 = new edu.osu.cs362.Queue<java.lang.Iterable<java.io.Serializable>>();
        java.lang.String str1 = queue_iterable_serializable0.toString();
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
    }

    @Test
    public void test368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test368");
        edu.osu.cs362.Queue<java.lang.Iterable<java.lang.Object>> queue_iterable_obj0 = new edu.osu.cs362.Queue<java.lang.Iterable<java.lang.Object>>();
        java.util.Spliterator<java.lang.Iterable<java.lang.Object>> spliterator_iterable_obj1 = queue_iterable_obj0.spliterator();
        boolean b2 = queue_iterable_obj0.isEmpty();
        java.lang.Iterable<java.lang.Object> iterable_obj3 = null;
        queue_iterable_obj0.enqueue(iterable_obj3);
        edu.osu.cs362.Queue<java.lang.Object> queue_obj5 = new edu.osu.cs362.Queue<java.lang.Object>();
        int i6 = queue_obj5.size();
        java.util.Spliterator<java.lang.Object> spliterator_obj7 = queue_obj5.spliterator();
        edu.osu.cs362.Queue<java.util.Iterator<java.io.Serializable>> queue_iterator_serializable8 = new edu.osu.cs362.Queue<java.util.Iterator<java.io.Serializable>>();
        boolean b9 = queue_iterator_serializable8.isEmpty();
        edu.osu.cs362.Queue<java.io.Serializable> queue_serializable10 = new edu.osu.cs362.Queue<java.io.Serializable>();
        queue_serializable10.enqueue((java.io.Serializable) 1L);
        java.util.Iterator<java.io.Serializable> iterator_serializable13 = queue_serializable10.iterator();
        queue_iterator_serializable8.enqueue(iterator_serializable13);
        int i15 = queue_iterator_serializable8.size();
        java.util.Iterator<java.io.Serializable> iterator_serializable16 = queue_iterator_serializable8.peek();
        boolean b17 = queue_iterator_serializable8.isEmpty();
        java.util.Iterator<java.io.Serializable> iterator_serializable18 = queue_iterator_serializable8.peek();
        queue_obj5.enqueue((java.lang.Object) queue_iterator_serializable8);
        java.util.Spliterator<java.lang.Object> spliterator_obj20 = queue_obj5.spliterator();
        queue_iterable_obj0.enqueue((java.lang.Iterable<java.lang.Object>) queue_obj5);
        org.junit.Assert.assertNotNull(spliterator_iterable_obj1);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertNotNull(spliterator_obj7);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertNotNull(iterator_serializable13);
        org.junit.Assert.assertTrue(i15 == 1);
        org.junit.Assert.assertNotNull(iterator_serializable16);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNotNull(iterator_serializable18);
        org.junit.Assert.assertNotNull(spliterator_obj20);
    }

    @Test
    public void test369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test369");
        edu.osu.cs362.Queue<java.lang.Iterable<java.lang.Object>> queue_iterable_obj0 = new edu.osu.cs362.Queue<java.lang.Iterable<java.lang.Object>>();
        int i1 = queue_iterable_obj0.size();
        java.util.Spliterator<java.lang.Iterable<java.lang.Object>> spliterator_iterable_obj2 = queue_iterable_obj0.spliterator();
        boolean b3 = queue_iterable_obj0.isEmpty();
        java.lang.String str4 = queue_iterable_obj0.toString();
        boolean b5 = queue_iterable_obj0.isEmpty();
        try {
            java.lang.Iterable<java.lang.Object> iterable_obj6 = queue_iterable_obj0.dequeue();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException");
        } catch (java.util.NoSuchElementException e) {
        }
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertNotNull(spliterator_iterable_obj2);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        org.junit.Assert.assertTrue(b5 == true);
    }

    @Test
    public void test370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test370");
        edu.osu.cs362.Queue<java.util.Iterator<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>> queue_iterator_queue_iterable_iterator_serializable0 = new edu.osu.cs362.Queue<java.util.Iterator<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>();
        java.util.Iterator<java.util.Iterator<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>> iterator_iterator_queue_iterable_iterator_serializable1 = queue_iterator_queue_iterable_iterator_serializable0.iterator();
        java.util.Spliterator<java.util.Iterator<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>> spliterator_iterator_queue_iterable_iterator_serializable2 = queue_iterator_queue_iterable_iterator_serializable0.spliterator();
        try {
            java.util.Iterator<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>> iterator_queue_iterable_iterator_serializable3 = queue_iterator_queue_iterable_iterator_serializable0.dequeue();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException");
        } catch (java.util.NoSuchElementException e) {
        }
        org.junit.Assert.assertNotNull(iterator_iterator_queue_iterable_iterator_serializable1);
        org.junit.Assert.assertNotNull(spliterator_iterator_queue_iterable_iterator_serializable2);
    }

    @Test
    public void test371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test371");
        edu.osu.cs362.Queue<java.lang.Iterable<java.lang.Iterable<java.util.Iterator<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>>> queue_iterable_iterable_iterator_iterable_queue_iterable_iterator_serializable0 = new edu.osu.cs362.Queue<java.lang.Iterable<java.lang.Iterable<java.util.Iterator<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>>>();
        try {
            java.lang.Iterable<java.lang.Iterable<java.util.Iterator<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>> iterable_iterable_iterator_iterable_queue_iterable_iterator_serializable1 = queue_iterable_iterable_iterator_iterable_queue_iterable_iterator_serializable0.peek();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException");
        } catch (java.util.NoSuchElementException e) {
        }
    }

    @Test
    public void test372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test372");
        edu.osu.cs362.Queue<java.lang.Iterable<java.util.Spliterator<java.util.Iterator<java.io.Serializable>>>> queue_iterable_spliterator_iterator_serializable0 = new edu.osu.cs362.Queue<java.lang.Iterable<java.util.Spliterator<java.util.Iterator<java.io.Serializable>>>>();
        try {
            java.lang.Iterable<java.util.Spliterator<java.util.Iterator<java.io.Serializable>>> iterable_spliterator_iterator_serializable1 = queue_iterable_spliterator_iterator_serializable0.peek();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException");
        } catch (java.util.NoSuchElementException e) {
        }
    }

    @Test
    public void test373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test373");
        edu.osu.cs362.Queue<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>> queue_iterable_queue_iterable_iterator_serializable0 = new edu.osu.cs362.Queue<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>();
        java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>> iterable_queue_iterable_iterator_serializable1 = null;
        queue_iterable_queue_iterable_iterator_serializable0.enqueue(iterable_queue_iterable_iterator_serializable1);
        java.util.Iterator<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>> iterator_iterable_queue_iterable_iterator_serializable3 = queue_iterable_queue_iterable_iterator_serializable0.iterator();
        int i4 = queue_iterable_queue_iterable_iterator_serializable0.size();
        edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>> queue_queue_iterable_iterator_serializable5 = new edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>();
        boolean b6 = queue_queue_iterable_iterator_serializable5.isEmpty();
        boolean b7 = queue_queue_iterable_iterator_serializable5.isEmpty();
        boolean b8 = queue_queue_iterable_iterator_serializable5.isEmpty();
        int i9 = queue_queue_iterable_iterator_serializable5.size();
        int i10 = queue_queue_iterable_iterator_serializable5.size();
        queue_iterable_queue_iterable_iterator_serializable0.enqueue((java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>) queue_queue_iterable_iterator_serializable5);
        java.lang.String str12 = queue_queue_iterable_iterator_serializable5.toString();
        org.junit.Assert.assertNotNull(iterator_iterable_queue_iterable_iterator_serializable3);
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertTrue(i10 == 0);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
    }

    @Test
    public void test374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test374");
        edu.osu.cs362.Queue<java.lang.Iterable<java.io.Serializable>> queue_iterable_serializable0 = new edu.osu.cs362.Queue<java.lang.Iterable<java.io.Serializable>>();
        boolean b1 = queue_iterable_serializable0.isEmpty();
        org.junit.Assert.assertTrue(b1 == true);
    }

    @Test
    public void test375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test375");
        edu.osu.cs362.Queue<java.util.Spliterator<java.util.Iterator<java.io.Serializable>>> queue_spliterator_iterator_serializable0 = new edu.osu.cs362.Queue<java.util.Spliterator<java.util.Iterator<java.io.Serializable>>>();
        java.lang.String str1 = queue_spliterator_iterator_serializable0.toString();
        java.util.Spliterator<java.util.Spliterator<java.util.Iterator<java.io.Serializable>>> spliterator_spliterator_iterator_serializable2 = queue_spliterator_iterator_serializable0.spliterator();
        edu.osu.cs362.Queue<java.util.Iterator<java.io.Serializable>> queue_iterator_serializable3 = new edu.osu.cs362.Queue<java.util.Iterator<java.io.Serializable>>();
        boolean b4 = queue_iterator_serializable3.isEmpty();
        edu.osu.cs362.Queue<java.io.Serializable> queue_serializable5 = new edu.osu.cs362.Queue<java.io.Serializable>();
        queue_serializable5.enqueue((java.io.Serializable) 1L);
        java.util.Iterator<java.io.Serializable> iterator_serializable8 = queue_serializable5.iterator();
        queue_iterator_serializable3.enqueue(iterator_serializable8);
        int i10 = queue_iterator_serializable3.size();
        java.util.Iterator<java.io.Serializable> iterator_serializable11 = queue_iterator_serializable3.peek();
        boolean b12 = queue_iterator_serializable3.isEmpty();
        java.util.Iterator<java.io.Serializable> iterator_serializable13 = queue_iterator_serializable3.peek();
        boolean b14 = queue_iterator_serializable3.isEmpty();
        java.util.Spliterator<java.util.Iterator<java.io.Serializable>> spliterator_iterator_serializable15 = queue_iterator_serializable3.spliterator();
        queue_spliterator_iterator_serializable0.enqueue(spliterator_iterator_serializable15);
        java.lang.String str17 = queue_spliterator_iterator_serializable0.toString();
        int i18 = queue_spliterator_iterator_serializable0.size();
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertNotNull(spliterator_spliterator_iterator_serializable2);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertNotNull(iterator_serializable8);
        org.junit.Assert.assertTrue(i10 == 1);
        org.junit.Assert.assertNotNull(iterator_serializable11);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNotNull(iterator_serializable13);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNotNull(spliterator_iterator_serializable15);
        org.junit.Assert.assertTrue(i18 == 1);
    }

    @Test
    public void test376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test376");
        edu.osu.cs362.Queue<java.util.Spliterator<java.io.Serializable>> queue_spliterator_serializable0 = new edu.osu.cs362.Queue<java.util.Spliterator<java.io.Serializable>>();
        java.util.Spliterator<java.util.Spliterator<java.io.Serializable>> spliterator_spliterator_serializable1 = queue_spliterator_serializable0.spliterator();
        java.util.Spliterator<java.util.Spliterator<java.io.Serializable>> spliterator_spliterator_serializable2 = queue_spliterator_serializable0.spliterator();
        try {
            java.util.Spliterator<java.io.Serializable> spliterator_serializable3 = queue_spliterator_serializable0.peek();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException");
        } catch (java.util.NoSuchElementException e) {
        }
        org.junit.Assert.assertNotNull(spliterator_spliterator_serializable1);
        org.junit.Assert.assertNotNull(spliterator_spliterator_serializable2);
    }

    @Test
    public void test377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test377");
        edu.osu.cs362.Queue<java.util.Spliterator<java.util.Iterator<edu.osu.cs362.Queue<java.io.Serializable>>>> queue_spliterator_iterator_queue_serializable0 = new edu.osu.cs362.Queue<java.util.Spliterator<java.util.Iterator<edu.osu.cs362.Queue<java.io.Serializable>>>>();
        java.lang.String str1 = queue_spliterator_iterator_queue_serializable0.toString();
        java.util.Spliterator<java.util.Spliterator<java.util.Iterator<edu.osu.cs362.Queue<java.io.Serializable>>>> spliterator_spliterator_iterator_queue_serializable2 = queue_spliterator_iterator_queue_serializable0.spliterator();
        int i3 = queue_spliterator_iterator_queue_serializable0.size();
        edu.osu.cs362.Queue<java.util.Iterator<edu.osu.cs362.Queue<java.io.Serializable>>> queue_iterator_queue_serializable4 = new edu.osu.cs362.Queue<java.util.Iterator<edu.osu.cs362.Queue<java.io.Serializable>>>();
        int i5 = queue_iterator_queue_serializable4.size();
        java.util.Iterator<java.util.Iterator<edu.osu.cs362.Queue<java.io.Serializable>>> iterator_iterator_queue_serializable6 = queue_iterator_queue_serializable4.iterator();
        edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.io.Serializable>> queue_queue_serializable7 = new edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.io.Serializable>>();
        java.util.Spliterator<edu.osu.cs362.Queue<java.io.Serializable>> spliterator_queue_serializable8 = queue_queue_serializable7.spliterator();
        java.util.Iterator<edu.osu.cs362.Queue<java.io.Serializable>> iterator_queue_serializable9 = queue_queue_serializable7.iterator();
        queue_iterator_queue_serializable4.enqueue(iterator_queue_serializable9);
        java.util.Spliterator<java.util.Iterator<edu.osu.cs362.Queue<java.io.Serializable>>> spliterator_iterator_queue_serializable11 = queue_iterator_queue_serializable4.spliterator();
        queue_spliterator_iterator_queue_serializable0.enqueue(spliterator_iterator_queue_serializable11);
        boolean b13 = queue_spliterator_iterator_queue_serializable0.isEmpty();
        java.lang.String str14 = queue_spliterator_iterator_queue_serializable0.toString();
        java.util.Spliterator<java.util.Spliterator<java.util.Iterator<edu.osu.cs362.Queue<java.io.Serializable>>>> spliterator_spliterator_iterator_queue_serializable15 = queue_spliterator_iterator_queue_serializable0.spliterator();
        java.util.Spliterator<java.util.Iterator<edu.osu.cs362.Queue<java.io.Serializable>>> spliterator_iterator_queue_serializable16 = queue_spliterator_iterator_queue_serializable0.peek();
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertNotNull(spliterator_spliterator_iterator_queue_serializable2);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertNotNull(iterator_iterator_queue_serializable6);
        org.junit.Assert.assertNotNull(spliterator_queue_serializable8);
        org.junit.Assert.assertNotNull(iterator_queue_serializable9);
        org.junit.Assert.assertNotNull(spliterator_iterator_queue_serializable11);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNotNull(spliterator_spliterator_iterator_queue_serializable15);
        org.junit.Assert.assertNotNull(spliterator_iterator_queue_serializable16);
    }

    @Test
    public void test378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test378");
        edu.osu.cs362.Queue<edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>> queue_queue_queue_iterable_queue_iterable_iterator_serializable0 = new edu.osu.cs362.Queue<edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>>();
        java.util.Spliterator<edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>> spliterator_queue_queue_iterable_queue_iterable_iterator_serializable1 = queue_queue_queue_iterable_queue_iterable_iterator_serializable0.spliterator();
        edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>> queue_queue_iterable_queue_iterable_iterator_serializable2 = new edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>();
        java.lang.String str3 = queue_queue_iterable_queue_iterable_iterator_serializable2.toString();
        int i4 = queue_queue_iterable_queue_iterable_iterator_serializable2.size();
        queue_queue_queue_iterable_queue_iterable_iterator_serializable0.enqueue(queue_queue_iterable_queue_iterable_iterator_serializable2);
        edu.osu.cs362.Queue<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>> queue_iterable_queue_iterable_iterator_serializable6 = new edu.osu.cs362.Queue<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>();
        java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>> iterable_queue_iterable_iterator_serializable7 = null;
        queue_iterable_queue_iterable_iterator_serializable6.enqueue(iterable_queue_iterable_iterator_serializable7);
        java.util.Iterator<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>> iterator_iterable_queue_iterable_iterator_serializable9 = queue_iterable_queue_iterable_iterator_serializable6.iterator();
        int i10 = queue_iterable_queue_iterable_iterator_serializable6.size();
        edu.osu.cs362.Queue<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>> queue_iterable_queue_iterable_iterator_serializable11 = new edu.osu.cs362.Queue<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>();
        java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>> iterable_queue_iterable_iterator_serializable12 = null;
        queue_iterable_queue_iterable_iterator_serializable11.enqueue(iterable_queue_iterable_iterator_serializable12);
        java.util.Iterator<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>> iterator_iterable_queue_iterable_iterator_serializable14 = queue_iterable_queue_iterable_iterator_serializable11.iterator();
        int i15 = queue_iterable_queue_iterable_iterator_serializable11.size();
        edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>> queue_queue_iterable_iterator_serializable16 = new edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>();
        boolean b17 = queue_queue_iterable_iterator_serializable16.isEmpty();
        boolean b18 = queue_queue_iterable_iterator_serializable16.isEmpty();
        boolean b19 = queue_queue_iterable_iterator_serializable16.isEmpty();
        int i20 = queue_queue_iterable_iterator_serializable16.size();
        int i21 = queue_queue_iterable_iterator_serializable16.size();
        queue_iterable_queue_iterable_iterator_serializable11.enqueue((java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>) queue_queue_iterable_iterator_serializable16);
        queue_iterable_queue_iterable_iterator_serializable6.enqueue((java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>) queue_queue_iterable_iterator_serializable16);
        queue_queue_iterable_queue_iterable_iterator_serializable2.enqueue(queue_iterable_queue_iterable_iterator_serializable6);
        org.junit.Assert.assertNotNull(spliterator_queue_queue_iterable_queue_iterable_iterator_serializable1);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertNotNull(iterator_iterable_queue_iterable_iterator_serializable9);
        org.junit.Assert.assertTrue(i10 == 1);
        org.junit.Assert.assertNotNull(iterator_iterable_queue_iterable_iterator_serializable14);
        org.junit.Assert.assertTrue(i15 == 1);
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertTrue(i20 == 0);
        org.junit.Assert.assertTrue(i21 == 0);
    }

    @Test
    public void test379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test379");
        edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>> queue_iterable_iterator_iterable_queue_iterable_iterator_serializable0 = new edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>>();
        java.util.Spliterator<java.lang.Iterable<java.util.Iterator<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>> spliterator_iterable_iterator_iterable_queue_iterable_iterator_serializable1 = queue_iterable_iterator_iterable_queue_iterable_iterator_serializable0.spliterator();
        java.util.Spliterator<java.lang.Iterable<java.util.Iterator<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>> spliterator_iterable_iterator_iterable_queue_iterable_iterator_serializable2 = queue_iterable_iterator_iterable_queue_iterable_iterator_serializable0.spliterator();
        try {
            java.lang.Iterable<java.util.Iterator<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>> iterable_iterator_iterable_queue_iterable_iterator_serializable3 = queue_iterable_iterator_iterable_queue_iterable_iterator_serializable0.dequeue();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException");
        } catch (java.util.NoSuchElementException e) {
        }
        org.junit.Assert.assertNotNull(spliterator_iterable_iterator_iterable_queue_iterable_iterator_serializable1);
        org.junit.Assert.assertNotNull(spliterator_iterable_iterator_iterable_queue_iterable_iterator_serializable2);
    }

    @Test
    public void test380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test380");
        edu.osu.cs362.Queue<java.lang.Iterable<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>>> queue_iterable_iterable_queue_iterable_queue_iterable_iterator_serializable0 = new edu.osu.cs362.Queue<java.lang.Iterable<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>>>();
        try {
            java.lang.Iterable<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>> iterable_iterable_queue_iterable_queue_iterable_iterator_serializable1 = queue_iterable_iterable_queue_iterable_queue_iterable_iterator_serializable0.dequeue();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException");
        } catch (java.util.NoSuchElementException e) {
        }
    }

    @Test
    public void test381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test381");
        edu.osu.cs362.Queue<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>> queue_iterable_queue_iterable_iterator_serializable0 = new edu.osu.cs362.Queue<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>();
        java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>> iterable_queue_iterable_iterator_serializable1 = null;
        queue_iterable_queue_iterable_iterator_serializable0.enqueue(iterable_queue_iterable_iterator_serializable1);
        java.util.Iterator<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>> iterator_iterable_queue_iterable_iterator_serializable3 = queue_iterable_queue_iterable_iterator_serializable0.iterator();
        int i4 = queue_iterable_queue_iterable_iterator_serializable0.size();
        java.lang.String str5 = queue_iterable_queue_iterable_iterator_serializable0.toString();
        boolean b6 = queue_iterable_queue_iterable_iterator_serializable0.isEmpty();
        edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>> queue_queue_iterable_iterator_serializable7 = new edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>();
        boolean b8 = queue_queue_iterable_iterator_serializable7.isEmpty();
        edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>> queue_iterable_iterator_serializable9 = new edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>();
        java.util.Iterator<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>> iterator_iterable_iterator_serializable10 = queue_iterable_iterator_serializable9.iterator();
        java.util.Spliterator<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>> spliterator_iterable_iterator_serializable11 = queue_iterable_iterator_serializable9.spliterator();
        java.lang.String str12 = queue_iterable_iterator_serializable9.toString();
        java.lang.String str13 = queue_iterable_iterator_serializable9.toString();
        java.util.Spliterator<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>> spliterator_iterable_iterator_serializable14 = queue_iterable_iterator_serializable9.spliterator();
        queue_queue_iterable_iterator_serializable7.enqueue(queue_iterable_iterator_serializable9);
        queue_iterable_queue_iterable_iterator_serializable0.enqueue((java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>) queue_queue_iterable_iterator_serializable7);
        int i17 = queue_iterable_queue_iterable_iterator_serializable0.size();
        org.junit.Assert.assertNotNull(iterator_iterable_queue_iterable_iterator_serializable3);
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "null " + "'", str5.equals("null "));
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertNotNull(iterator_iterable_iterator_serializable10);
        org.junit.Assert.assertNotNull(spliterator_iterable_iterator_serializable11);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        org.junit.Assert.assertNotNull(spliterator_iterable_iterator_serializable14);
        org.junit.Assert.assertTrue(i17 == 2);
    }

    @Test
    public void test382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test382");
        edu.osu.cs362.Queue<java.util.Iterator<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>> queue_iterator_iterable_iterator_serializable0 = new edu.osu.cs362.Queue<java.util.Iterator<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>();
        boolean b1 = queue_iterator_iterable_iterator_serializable0.isEmpty();
        try {
            java.util.Iterator<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>> iterator_iterable_iterator_serializable2 = queue_iterator_iterable_iterator_serializable0.peek();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException");
        } catch (java.util.NoSuchElementException e) {
        }
        org.junit.Assert.assertTrue(b1 == true);
    }

    @Test
    public void test383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test383");
        edu.osu.cs362.Queue<edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>> queue_queue_queue_iterable_queue_iterable_iterator_serializable0 = new edu.osu.cs362.Queue<edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>>();
        java.util.Spliterator<edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>> spliterator_queue_queue_iterable_queue_iterable_iterator_serializable1 = queue_queue_queue_iterable_queue_iterable_iterator_serializable0.spliterator();
        java.util.Spliterator<edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>> spliterator_queue_queue_iterable_queue_iterable_iterator_serializable2 = queue_queue_queue_iterable_queue_iterable_iterator_serializable0.spliterator();
        try {
            edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>> queue_queue_iterable_queue_iterable_iterator_serializable3 = queue_queue_queue_iterable_queue_iterable_iterator_serializable0.dequeue();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException");
        } catch (java.util.NoSuchElementException e) {
        }
        org.junit.Assert.assertNotNull(spliterator_queue_queue_iterable_queue_iterable_iterator_serializable1);
        org.junit.Assert.assertNotNull(spliterator_queue_queue_iterable_queue_iterable_iterator_serializable2);
    }

    @Test
    public void test384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test384");
        edu.osu.cs362.Queue<java.io.Serializable> queue_serializable0 = new edu.osu.cs362.Queue<java.io.Serializable>();
        queue_serializable0.enqueue((java.io.Serializable) 1L);
        java.io.Serializable serializable3 = queue_serializable0.peek();
        java.util.Iterator<java.io.Serializable> iterator_serializable4 = queue_serializable0.iterator();
        java.util.Iterator<java.io.Serializable> iterator_serializable5 = queue_serializable0.iterator();
        java.util.Spliterator<java.io.Serializable> spliterator_serializable6 = queue_serializable0.spliterator();
        java.io.Serializable serializable7 = queue_serializable0.dequeue();
        try {
            java.io.Serializable serializable8 = queue_serializable0.peek();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException");
        } catch (java.util.NoSuchElementException e) {
        }
        org.junit.Assert.assertTrue("'" + serializable3 + "' != '" + 1L + "'", serializable3.equals(1L));
        org.junit.Assert.assertNotNull(iterator_serializable4);
        org.junit.Assert.assertNotNull(iterator_serializable5);
        org.junit.Assert.assertNotNull(spliterator_serializable6);
        org.junit.Assert.assertTrue("'" + serializable7 + "' != '" + 1L + "'", serializable7.equals(1L));
    }

    @Test
    public void test385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test385");
        edu.osu.cs362.Queue<java.util.Iterator<java.io.Serializable>> queue_iterator_serializable0 = new edu.osu.cs362.Queue<java.util.Iterator<java.io.Serializable>>();
        boolean b1 = queue_iterator_serializable0.isEmpty();
        edu.osu.cs362.Queue<java.io.Serializable> queue_serializable2 = new edu.osu.cs362.Queue<java.io.Serializable>();
        queue_serializable2.enqueue((java.io.Serializable) 1L);
        java.io.Serializable serializable5 = queue_serializable2.peek();
        java.util.Iterator<java.io.Serializable> iterator_serializable6 = queue_serializable2.iterator();
        java.util.Iterator<java.io.Serializable> iterator_serializable7 = queue_serializable2.iterator();
        queue_iterator_serializable0.enqueue(iterator_serializable7);
        java.util.Iterator<java.io.Serializable> iterator_serializable9 = queue_iterator_serializable0.peek();
        java.lang.String str10 = queue_iterator_serializable0.toString();
        org.junit.Assert.assertTrue(b1 == true);
        org.junit.Assert.assertTrue("'" + serializable5 + "' != '" + 1L + "'", serializable5.equals(1L));
        org.junit.Assert.assertNotNull(iterator_serializable6);
        org.junit.Assert.assertNotNull(iterator_serializable7);
        org.junit.Assert.assertNotNull(iterator_serializable9);
    }

    @Test
    public void test386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test386");
        edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.util.Iterator<edu.osu.cs362.Queue<java.io.Serializable>>>> queue_queue_iterator_queue_serializable0 = new edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.util.Iterator<edu.osu.cs362.Queue<java.io.Serializable>>>>();
        java.util.Spliterator<edu.osu.cs362.Queue<java.util.Iterator<edu.osu.cs362.Queue<java.io.Serializable>>>> spliterator_queue_iterator_queue_serializable1 = queue_queue_iterator_queue_serializable0.spliterator();
        edu.osu.cs362.Queue<java.util.Iterator<edu.osu.cs362.Queue<java.io.Serializable>>> queue_iterator_queue_serializable2 = new edu.osu.cs362.Queue<java.util.Iterator<edu.osu.cs362.Queue<java.io.Serializable>>>();
        int i3 = queue_iterator_queue_serializable2.size();
        java.util.Iterator<java.util.Iterator<edu.osu.cs362.Queue<java.io.Serializable>>> iterator_iterator_queue_serializable4 = queue_iterator_queue_serializable2.iterator();
        edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.io.Serializable>> queue_queue_serializable5 = new edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.io.Serializable>>();
        java.util.Spliterator<edu.osu.cs362.Queue<java.io.Serializable>> spliterator_queue_serializable6 = queue_queue_serializable5.spliterator();
        java.util.Iterator<edu.osu.cs362.Queue<java.io.Serializable>> iterator_queue_serializable7 = queue_queue_serializable5.iterator();
        queue_iterator_queue_serializable2.enqueue(iterator_queue_serializable7);
        java.lang.String str9 = queue_iterator_queue_serializable2.toString();
        boolean b10 = queue_iterator_queue_serializable2.isEmpty();
        queue_queue_iterator_queue_serializable0.enqueue(queue_iterator_queue_serializable2);
        edu.osu.cs362.Queue<java.util.Iterator<edu.osu.cs362.Queue<java.io.Serializable>>> queue_iterator_queue_serializable12 = new edu.osu.cs362.Queue<java.util.Iterator<edu.osu.cs362.Queue<java.io.Serializable>>>();
        int i13 = queue_iterator_queue_serializable12.size();
        java.util.Iterator<java.util.Iterator<edu.osu.cs362.Queue<java.io.Serializable>>> iterator_iterator_queue_serializable14 = queue_iterator_queue_serializable12.iterator();
        edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.io.Serializable>> queue_queue_serializable15 = new edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.io.Serializable>>();
        java.util.Spliterator<edu.osu.cs362.Queue<java.io.Serializable>> spliterator_queue_serializable16 = queue_queue_serializable15.spliterator();
        java.util.Iterator<edu.osu.cs362.Queue<java.io.Serializable>> iterator_queue_serializable17 = queue_queue_serializable15.iterator();
        queue_iterator_queue_serializable12.enqueue(iterator_queue_serializable17);
        java.lang.String str19 = queue_iterator_queue_serializable12.toString();
        java.util.Iterator<java.util.Iterator<edu.osu.cs362.Queue<java.io.Serializable>>> iterator_iterator_queue_serializable20 = queue_iterator_queue_serializable12.iterator();
        java.util.Iterator<edu.osu.cs362.Queue<java.io.Serializable>> iterator_queue_serializable21 = queue_iterator_queue_serializable12.peek();
        queue_queue_iterator_queue_serializable0.enqueue(queue_iterator_queue_serializable12);
        org.junit.Assert.assertNotNull(spliterator_queue_iterator_queue_serializable1);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertNotNull(iterator_iterator_queue_serializable4);
        org.junit.Assert.assertNotNull(spliterator_queue_serializable6);
        org.junit.Assert.assertNotNull(iterator_queue_serializable7);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue(i13 == 0);
        org.junit.Assert.assertNotNull(iterator_iterator_queue_serializable14);
        org.junit.Assert.assertNotNull(spliterator_queue_serializable16);
        org.junit.Assert.assertNotNull(iterator_queue_serializable17);
        org.junit.Assert.assertNotNull(iterator_iterator_queue_serializable20);
        org.junit.Assert.assertNotNull(iterator_queue_serializable21);
    }

    @Test
    public void test387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test387");
        edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<edu.osu.cs362.Queue<java.io.Serializable>>>> queue_iterable_iterator_queue_serializable0 = new edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<edu.osu.cs362.Queue<java.io.Serializable>>>>();
        java.util.Iterator<java.lang.Iterable<java.util.Iterator<edu.osu.cs362.Queue<java.io.Serializable>>>> iterator_iterable_iterator_queue_serializable1 = queue_iterable_iterator_queue_serializable0.iterator();
        edu.osu.cs362.Queue<java.util.Iterator<edu.osu.cs362.Queue<java.io.Serializable>>> queue_iterator_queue_serializable2 = new edu.osu.cs362.Queue<java.util.Iterator<edu.osu.cs362.Queue<java.io.Serializable>>>();
        java.lang.String str3 = queue_iterator_queue_serializable2.toString();
        queue_iterable_iterator_queue_serializable0.enqueue((java.lang.Iterable<java.util.Iterator<edu.osu.cs362.Queue<java.io.Serializable>>>) queue_iterator_queue_serializable2);
        java.util.Iterator<java.lang.Iterable<java.util.Iterator<edu.osu.cs362.Queue<java.io.Serializable>>>> iterator_iterable_iterator_queue_serializable5 = queue_iterable_iterator_queue_serializable0.iterator();
        edu.osu.cs362.Queue<java.util.Iterator<edu.osu.cs362.Queue<java.io.Serializable>>> queue_iterator_queue_serializable6 = new edu.osu.cs362.Queue<java.util.Iterator<edu.osu.cs362.Queue<java.io.Serializable>>>();
        int i7 = queue_iterator_queue_serializable6.size();
        java.util.Iterator<java.util.Iterator<edu.osu.cs362.Queue<java.io.Serializable>>> iterator_iterator_queue_serializable8 = queue_iterator_queue_serializable6.iterator();
        edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.io.Serializable>> queue_queue_serializable9 = new edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.io.Serializable>>();
        java.util.Spliterator<edu.osu.cs362.Queue<java.io.Serializable>> spliterator_queue_serializable10 = queue_queue_serializable9.spliterator();
        java.util.Iterator<edu.osu.cs362.Queue<java.io.Serializable>> iterator_queue_serializable11 = queue_queue_serializable9.iterator();
        queue_iterator_queue_serializable6.enqueue(iterator_queue_serializable11);
        java.util.Spliterator<java.util.Iterator<edu.osu.cs362.Queue<java.io.Serializable>>> spliterator_iterator_queue_serializable13 = queue_iterator_queue_serializable6.spliterator();
        queue_iterable_iterator_queue_serializable0.enqueue((java.lang.Iterable<java.util.Iterator<edu.osu.cs362.Queue<java.io.Serializable>>>) queue_iterator_queue_serializable6);
        boolean b15 = queue_iterable_iterator_queue_serializable0.isEmpty();
        java.util.Iterator<java.lang.Iterable<java.util.Iterator<edu.osu.cs362.Queue<java.io.Serializable>>>> iterator_iterable_iterator_queue_serializable16 = queue_iterable_iterator_queue_serializable0.iterator();
        java.lang.Iterable<java.util.Iterator<edu.osu.cs362.Queue<java.io.Serializable>>> iterable_iterator_queue_serializable17 = queue_iterable_iterator_queue_serializable0.dequeue();
        org.junit.Assert.assertNotNull(iterator_iterable_iterator_queue_serializable1);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertNotNull(iterator_iterable_iterator_queue_serializable5);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertNotNull(iterator_iterator_queue_serializable8);
        org.junit.Assert.assertNotNull(spliterator_queue_serializable10);
        org.junit.Assert.assertNotNull(iterator_queue_serializable11);
        org.junit.Assert.assertNotNull(spliterator_iterator_queue_serializable13);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNotNull(iterator_iterable_iterator_queue_serializable16);
        org.junit.Assert.assertNotNull(iterable_iterator_queue_serializable17);
    }

    @Test
    public void test388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test388");
        edu.osu.cs362.Queue<edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.lang.Comparable<java.lang.String>>>> queue_queue_queue_comparable_str0 = new edu.osu.cs362.Queue<edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.lang.Comparable<java.lang.String>>>>();
        boolean b1 = queue_queue_queue_comparable_str0.isEmpty();
        java.util.Iterator<edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.lang.Comparable<java.lang.String>>>> iterator_queue_queue_comparable_str2 = queue_queue_queue_comparable_str0.iterator();
        edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.lang.Comparable<java.lang.String>>> queue_queue_comparable_str3 = new edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.lang.Comparable<java.lang.String>>>();
        java.util.Spliterator<edu.osu.cs362.Queue<java.lang.Comparable<java.lang.String>>> spliterator_queue_comparable_str4 = queue_queue_comparable_str3.spliterator();
        java.util.Iterator<edu.osu.cs362.Queue<java.lang.Comparable<java.lang.String>>> iterator_queue_comparable_str5 = queue_queue_comparable_str3.iterator();
        queue_queue_queue_comparable_str0.enqueue(queue_queue_comparable_str3);
        java.lang.String str7 = queue_queue_comparable_str3.toString();
        org.junit.Assert.assertTrue(b1 == true);
        org.junit.Assert.assertNotNull(iterator_queue_queue_comparable_str2);
        org.junit.Assert.assertNotNull(spliterator_queue_comparable_str4);
        org.junit.Assert.assertNotNull(iterator_queue_comparable_str5);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
    }

    @Test
    public void test389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test389");
        edu.osu.cs362.Queue<java.util.Spliterator<java.io.Serializable>> queue_spliterator_serializable0 = new edu.osu.cs362.Queue<java.util.Spliterator<java.io.Serializable>>();
        java.util.Iterator<java.util.Spliterator<java.io.Serializable>> iterator_spliterator_serializable1 = queue_spliterator_serializable0.iterator();
        edu.osu.cs362.Queue<java.io.Serializable> queue_serializable2 = new edu.osu.cs362.Queue<java.io.Serializable>();
        queue_serializable2.enqueue((java.io.Serializable) 1L);
        java.io.Serializable serializable5 = queue_serializable2.peek();
        java.util.Iterator<java.io.Serializable> iterator_serializable6 = queue_serializable2.iterator();
        java.util.Iterator<java.io.Serializable> iterator_serializable7 = queue_serializable2.iterator();
        java.util.Spliterator<java.io.Serializable> spliterator_serializable8 = queue_serializable2.spliterator();
        queue_spliterator_serializable0.enqueue(spliterator_serializable8);
        java.lang.String str10 = queue_spliterator_serializable0.toString();
        java.util.Spliterator<java.util.Spliterator<java.io.Serializable>> spliterator_spliterator_serializable11 = queue_spliterator_serializable0.spliterator();
        org.junit.Assert.assertNotNull(iterator_spliterator_serializable1);
        org.junit.Assert.assertTrue("'" + serializable5 + "' != '" + 1L + "'", serializable5.equals(1L));
        org.junit.Assert.assertNotNull(iterator_serializable6);
        org.junit.Assert.assertNotNull(iterator_serializable7);
        org.junit.Assert.assertNotNull(spliterator_serializable8);
        org.junit.Assert.assertNotNull(spliterator_spliterator_serializable11);
    }

    @Test
    public void test390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test390");
        edu.osu.cs362.Queue<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>> queue_iterable_queue_iterable_iterator_serializable0 = new edu.osu.cs362.Queue<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>();
        java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>> iterable_queue_iterable_iterator_serializable1 = null;
        queue_iterable_queue_iterable_iterator_serializable0.enqueue(iterable_queue_iterable_iterator_serializable1);
        java.util.Iterator<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>> iterator_iterable_queue_iterable_iterator_serializable3 = queue_iterable_queue_iterable_iterator_serializable0.iterator();
        int i4 = queue_iterable_queue_iterable_iterator_serializable0.size();
        java.lang.String str5 = queue_iterable_queue_iterable_iterator_serializable0.toString();
        boolean b6 = queue_iterable_queue_iterable_iterator_serializable0.isEmpty();
        java.util.Iterator<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>> iterator_iterable_queue_iterable_iterator_serializable7 = queue_iterable_queue_iterable_iterator_serializable0.iterator();
        java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>> iterable_queue_iterable_iterator_serializable8 = queue_iterable_queue_iterable_iterator_serializable0.dequeue();
        org.junit.Assert.assertNotNull(iterator_iterable_queue_iterable_iterator_serializable3);
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "null " + "'", str5.equals("null "));
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNotNull(iterator_iterable_queue_iterable_iterator_serializable7);
        org.junit.Assert.assertNull(iterable_queue_iterable_iterator_serializable8);
    }

    @Test
    public void test391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test391");
        edu.osu.cs362.Queue<java.util.Iterator<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>> queue_iterator_iterable_queue_iterable_iterator_serializable0 = new edu.osu.cs362.Queue<java.util.Iterator<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>();
        java.util.Iterator<java.util.Iterator<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>> iterator_iterator_iterable_queue_iterable_iterator_serializable1 = queue_iterator_iterable_queue_iterable_iterator_serializable0.iterator();
        java.util.Spliterator<java.util.Iterator<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>> spliterator_iterator_iterable_queue_iterable_iterator_serializable2 = queue_iterator_iterable_queue_iterable_iterator_serializable0.spliterator();
        int i3 = queue_iterator_iterable_queue_iterable_iterator_serializable0.size();
        int i4 = queue_iterator_iterable_queue_iterable_iterator_serializable0.size();
        boolean b5 = queue_iterator_iterable_queue_iterable_iterator_serializable0.isEmpty();
        org.junit.Assert.assertNotNull(iterator_iterator_iterable_queue_iterable_iterator_serializable1);
        org.junit.Assert.assertNotNull(spliterator_iterator_iterable_queue_iterable_iterator_serializable2);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(b5 == true);
    }

    @Test
    public void test392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test392");
        edu.osu.cs362.Queue<java.lang.Iterable<java.lang.Iterable<java.lang.Iterable<java.lang.Object>>>> queue_iterable_iterable_iterable_obj0 = new edu.osu.cs362.Queue<java.lang.Iterable<java.lang.Iterable<java.lang.Iterable<java.lang.Object>>>>();
        java.util.Iterator<java.lang.Iterable<java.lang.Iterable<java.lang.Iterable<java.lang.Object>>>> iterator_iterable_iterable_iterable_obj1 = queue_iterable_iterable_iterable_obj0.iterator();
        edu.osu.cs362.Queue<java.lang.Iterable<java.lang.Iterable<java.lang.Object>>> queue_iterable_iterable_obj2 = new edu.osu.cs362.Queue<java.lang.Iterable<java.lang.Iterable<java.lang.Object>>>();
        queue_iterable_iterable_iterable_obj0.enqueue((java.lang.Iterable<java.lang.Iterable<java.lang.Iterable<java.lang.Object>>>) queue_iterable_iterable_obj2);
        java.util.Iterator<java.lang.Iterable<java.lang.Iterable<java.lang.Iterable<java.lang.Object>>>> iterator_iterable_iterable_iterable_obj4 = queue_iterable_iterable_iterable_obj0.iterator();
        int i5 = queue_iterable_iterable_iterable_obj0.size();
        java.lang.Iterable<java.lang.Iterable<java.lang.Iterable<java.lang.Object>>> iterable_iterable_iterable_obj6 = null;
        queue_iterable_iterable_iterable_obj0.enqueue(iterable_iterable_iterable_obj6);
        org.junit.Assert.assertNotNull(iterator_iterable_iterable_iterable_obj1);
        org.junit.Assert.assertNotNull(iterator_iterable_iterable_iterable_obj4);
        org.junit.Assert.assertTrue(i5 == 1);
    }

    @Test
    public void test393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test393");
        edu.osu.cs362.Queue<java.lang.Iterable<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>>> queue_iterable_iterable_queue_iterable_queue_iterable_iterator_serializable0 = new edu.osu.cs362.Queue<java.lang.Iterable<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>>>();
        java.lang.String str1 = queue_iterable_iterable_queue_iterable_queue_iterable_iterator_serializable0.toString();
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
    }

    @Test
    public void test394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test394");
        edu.osu.cs362.Queue<java.util.Iterator<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>> queue_iterator_iterable_queue_iterable_iterator_serializable0 = new edu.osu.cs362.Queue<java.util.Iterator<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>();
        java.util.Iterator<java.util.Iterator<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>> iterator_iterator_iterable_queue_iterable_iterator_serializable1 = queue_iterator_iterable_queue_iterable_iterator_serializable0.iterator();
        java.util.Spliterator<java.util.Iterator<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>> spliterator_iterator_iterable_queue_iterable_iterator_serializable2 = queue_iterator_iterable_queue_iterable_iterator_serializable0.spliterator();
        boolean b3 = queue_iterator_iterable_queue_iterable_iterator_serializable0.isEmpty();
        org.junit.Assert.assertNotNull(iterator_iterator_iterable_queue_iterable_iterator_serializable1);
        org.junit.Assert.assertNotNull(spliterator_iterator_iterable_queue_iterable_iterator_serializable2);
        org.junit.Assert.assertTrue(b3 == true);
    }

    @Test
    public void test395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test395");
        edu.osu.cs362.Queue<java.util.Iterator<java.util.Iterator<edu.osu.cs362.Queue<java.io.Serializable>>>> queue_iterator_iterator_queue_serializable0 = new edu.osu.cs362.Queue<java.util.Iterator<java.util.Iterator<edu.osu.cs362.Queue<java.io.Serializable>>>>();
        int i1 = queue_iterator_iterator_queue_serializable0.size();
        java.lang.String str2 = queue_iterator_iterator_queue_serializable0.toString();
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
    }

    @Test
    public void test396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test396");
        edu.osu.cs362.Queue<java.util.Iterator<java.lang.Iterable<java.util.Iterator<edu.osu.cs362.Queue<java.io.Serializable>>>>> queue_iterator_iterable_iterator_queue_serializable0 = new edu.osu.cs362.Queue<java.util.Iterator<java.lang.Iterable<java.util.Iterator<edu.osu.cs362.Queue<java.io.Serializable>>>>>();
        java.util.Spliterator<java.util.Iterator<java.lang.Iterable<java.util.Iterator<edu.osu.cs362.Queue<java.io.Serializable>>>>> spliterator_iterator_iterable_iterator_queue_serializable1 = queue_iterator_iterable_iterator_queue_serializable0.spliterator();
        java.lang.String str2 = queue_iterator_iterable_iterator_queue_serializable0.toString();
        try {
            java.util.Iterator<java.lang.Iterable<java.util.Iterator<edu.osu.cs362.Queue<java.io.Serializable>>>> iterator_iterable_iterator_queue_serializable3 = queue_iterator_iterable_iterator_queue_serializable0.dequeue();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException");
        } catch (java.util.NoSuchElementException e) {
        }
        org.junit.Assert.assertNotNull(spliterator_iterator_iterable_iterator_queue_serializable1);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
    }

    @Test
    public void test397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test397");
        edu.osu.cs362.Queue<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>> queue_iterable_queue_iterable_iterator_serializable0 = new edu.osu.cs362.Queue<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>();
        java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>> iterable_queue_iterable_iterator_serializable1 = null;
        queue_iterable_queue_iterable_iterator_serializable0.enqueue(iterable_queue_iterable_iterator_serializable1);
        java.util.Iterator<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>> iterator_iterable_queue_iterable_iterator_serializable3 = queue_iterable_queue_iterable_iterator_serializable0.iterator();
        int i4 = queue_iterable_queue_iterable_iterator_serializable0.size();
        edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>> queue_queue_iterable_iterator_serializable5 = new edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>();
        boolean b6 = queue_queue_iterable_iterator_serializable5.isEmpty();
        boolean b7 = queue_queue_iterable_iterator_serializable5.isEmpty();
        boolean b8 = queue_queue_iterable_iterator_serializable5.isEmpty();
        int i9 = queue_queue_iterable_iterator_serializable5.size();
        int i10 = queue_queue_iterable_iterator_serializable5.size();
        queue_iterable_queue_iterable_iterator_serializable0.enqueue((java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>) queue_queue_iterable_iterator_serializable5);
        java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>> iterable_queue_iterable_iterator_serializable12 = queue_iterable_queue_iterable_iterator_serializable0.dequeue();
        edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>> queue_queue_iterable_iterator_serializable13 = new edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>();
        boolean b14 = queue_queue_iterable_iterator_serializable13.isEmpty();
        boolean b15 = queue_queue_iterable_iterator_serializable13.isEmpty();
        boolean b16 = queue_queue_iterable_iterator_serializable13.isEmpty();
        int i17 = queue_queue_iterable_iterator_serializable13.size();
        int i18 = queue_queue_iterable_iterator_serializable13.size();
        queue_iterable_queue_iterable_iterator_serializable0.enqueue((java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>) queue_queue_iterable_iterator_serializable13);
        java.util.Spliterator<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>> spliterator_queue_iterable_iterator_serializable20 = queue_queue_iterable_iterator_serializable13.spliterator();
        org.junit.Assert.assertNotNull(iterator_iterable_queue_iterable_iterator_serializable3);
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertTrue(i10 == 0);
        org.junit.Assert.assertNull(iterable_queue_iterable_iterator_serializable12);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertTrue(i17 == 0);
        org.junit.Assert.assertTrue(i18 == 0);
        org.junit.Assert.assertNotNull(spliterator_queue_iterable_iterator_serializable20);
    }

    @Test
    public void test398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test398");
        edu.osu.cs362.Queue<java.lang.Iterable<java.lang.Iterable<java.lang.Iterable<java.lang.Object>>>> queue_iterable_iterable_iterable_obj0 = new edu.osu.cs362.Queue<java.lang.Iterable<java.lang.Iterable<java.lang.Iterable<java.lang.Object>>>>();
        java.util.Spliterator<java.lang.Iterable<java.lang.Iterable<java.lang.Iterable<java.lang.Object>>>> spliterator_iterable_iterable_iterable_obj1 = queue_iterable_iterable_iterable_obj0.spliterator();
        java.util.Iterator<java.lang.Iterable<java.lang.Iterable<java.lang.Iterable<java.lang.Object>>>> iterator_iterable_iterable_iterable_obj2 = queue_iterable_iterable_iterable_obj0.iterator();
        java.util.Iterator<java.lang.Iterable<java.lang.Iterable<java.lang.Iterable<java.lang.Object>>>> iterator_iterable_iterable_iterable_obj3 = queue_iterable_iterable_iterable_obj0.iterator();
        java.lang.String str4 = queue_iterable_iterable_iterable_obj0.toString();
        try {
            java.lang.Iterable<java.lang.Iterable<java.lang.Iterable<java.lang.Object>>> iterable_iterable_iterable_obj5 = queue_iterable_iterable_iterable_obj0.dequeue();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException");
        } catch (java.util.NoSuchElementException e) {
        }
        org.junit.Assert.assertNotNull(spliterator_iterable_iterable_iterable_obj1);
        org.junit.Assert.assertNotNull(iterator_iterable_iterable_iterable_obj2);
        org.junit.Assert.assertNotNull(iterator_iterable_iterable_iterable_obj3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
    }

    @Test
    public void test399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test399");
        edu.osu.cs362.Queue<java.util.Iterator<java.lang.Object>> queue_iterator_obj0 = new edu.osu.cs362.Queue<java.util.Iterator<java.lang.Object>>();
        int i1 = queue_iterator_obj0.size();
        int i2 = queue_iterator_obj0.size();
        java.util.Iterator<java.util.Iterator<java.lang.Object>> iterator_iterator_obj3 = queue_iterator_obj0.iterator();
        java.lang.String str4 = queue_iterator_obj0.toString();
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNotNull(iterator_iterator_obj3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
    }

    @Test
    public void test400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test400");
        edu.osu.cs362.Queue<java.util.Iterator<java.util.Iterator<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>> queue_iterator_iterator_queue_iterable_iterator_serializable0 = new edu.osu.cs362.Queue<java.util.Iterator<java.util.Iterator<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>();
        int i1 = queue_iterator_iterator_queue_iterable_iterator_serializable0.size();
        edu.osu.cs362.Queue<java.util.Iterator<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>> queue_iterator_queue_iterable_iterator_serializable2 = new edu.osu.cs362.Queue<java.util.Iterator<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>();
        java.util.Iterator<java.util.Iterator<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>> iterator_iterator_queue_iterable_iterator_serializable3 = queue_iterator_queue_iterable_iterator_serializable2.iterator();
        queue_iterator_iterator_queue_iterable_iterator_serializable0.enqueue(iterator_iterator_queue_iterable_iterator_serializable3);
        java.util.Spliterator<java.util.Iterator<java.util.Iterator<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>> spliterator_iterator_iterator_queue_iterable_iterator_serializable5 = queue_iterator_iterator_queue_iterable_iterator_serializable0.spliterator();
        java.util.Spliterator<java.util.Iterator<java.util.Iterator<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>> spliterator_iterator_iterator_queue_iterable_iterator_serializable6 = queue_iterator_iterator_queue_iterable_iterator_serializable0.spliterator();
        java.util.Iterator<java.util.Iterator<java.util.Iterator<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>> iterator_iterator_iterator_queue_iterable_iterator_serializable7 = queue_iterator_iterator_queue_iterable_iterator_serializable0.iterator();
        edu.osu.cs362.Queue<java.util.Iterator<java.util.Iterator<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>> queue_iterator_iterator_queue_iterable_iterator_serializable8 = new edu.osu.cs362.Queue<java.util.Iterator<java.util.Iterator<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>();
        int i9 = queue_iterator_iterator_queue_iterable_iterator_serializable8.size();
        edu.osu.cs362.Queue<java.util.Iterator<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>> queue_iterator_queue_iterable_iterator_serializable10 = new edu.osu.cs362.Queue<java.util.Iterator<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>();
        java.util.Iterator<java.util.Iterator<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>> iterator_iterator_queue_iterable_iterator_serializable11 = queue_iterator_queue_iterable_iterator_serializable10.iterator();
        queue_iterator_iterator_queue_iterable_iterator_serializable8.enqueue(iterator_iterator_queue_iterable_iterator_serializable11);
        queue_iterator_iterator_queue_iterable_iterator_serializable0.enqueue(iterator_iterator_queue_iterable_iterator_serializable11);
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertNotNull(iterator_iterator_queue_iterable_iterator_serializable3);
        org.junit.Assert.assertNotNull(spliterator_iterator_iterator_queue_iterable_iterator_serializable5);
        org.junit.Assert.assertNotNull(spliterator_iterator_iterator_queue_iterable_iterator_serializable6);
        org.junit.Assert.assertNotNull(iterator_iterator_iterator_queue_iterable_iterator_serializable7);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertNotNull(iterator_iterator_queue_iterable_iterator_serializable11);
    }

    @Test
    public void test401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test401");
        edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>> queue_queue_iterable_iterator_serializable0 = new edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>();
        boolean b1 = queue_queue_iterable_iterator_serializable0.isEmpty();
        boolean b2 = queue_queue_iterable_iterator_serializable0.isEmpty();
        java.lang.String str3 = queue_queue_iterable_iterator_serializable0.toString();
        edu.osu.cs362.Queue<java.lang.Iterable<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>> queue_iterable_iterable_iterator_serializable4 = new edu.osu.cs362.Queue<java.lang.Iterable<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>();
        java.util.Iterator<java.lang.Iterable<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>> iterator_iterable_iterable_iterator_serializable5 = queue_iterable_iterable_iterator_serializable4.iterator();
        java.util.Spliterator<java.lang.Iterable<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>> spliterator_iterable_iterable_iterator_serializable6 = queue_iterable_iterable_iterator_serializable4.spliterator();
        edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>> queue_iterable_iterator_serializable7 = new edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>();
        java.util.Iterator<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>> iterator_iterable_iterator_serializable8 = queue_iterable_iterator_serializable7.iterator();
        java.util.Spliterator<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>> spliterator_iterable_iterator_serializable9 = queue_iterable_iterator_serializable7.spliterator();
        java.util.Spliterator<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>> spliterator_iterable_iterator_serializable10 = queue_iterable_iterator_serializable7.spliterator();
        int i11 = queue_iterable_iterator_serializable7.size();
        java.lang.String str12 = queue_iterable_iterator_serializable7.toString();
        java.util.Iterator<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>> iterator_iterable_iterator_serializable13 = queue_iterable_iterator_serializable7.iterator();
        edu.osu.cs362.Queue<java.util.Iterator<java.io.Serializable>> queue_iterator_serializable14 = new edu.osu.cs362.Queue<java.util.Iterator<java.io.Serializable>>();
        java.lang.String str15 = queue_iterator_serializable14.toString();
        int i16 = queue_iterator_serializable14.size();
        queue_iterable_iterator_serializable7.enqueue((java.lang.Iterable<java.util.Iterator<java.io.Serializable>>) queue_iterator_serializable14);
        boolean b18 = queue_iterable_iterator_serializable7.isEmpty();
        queue_iterable_iterable_iterator_serializable4.enqueue((java.lang.Iterable<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>) queue_iterable_iterator_serializable7);
        queue_queue_iterable_iterator_serializable0.enqueue(queue_iterable_iterator_serializable7);
        java.util.Iterator<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>> iterator_queue_iterable_iterator_serializable21 = queue_queue_iterable_iterator_serializable0.iterator();
        org.junit.Assert.assertTrue(b1 == true);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertNotNull(iterator_iterable_iterable_iterator_serializable5);
        org.junit.Assert.assertNotNull(spliterator_iterable_iterable_iterator_serializable6);
        org.junit.Assert.assertNotNull(iterator_iterable_iterator_serializable8);
        org.junit.Assert.assertNotNull(spliterator_iterable_iterator_serializable9);
        org.junit.Assert.assertNotNull(spliterator_iterable_iterator_serializable10);
        org.junit.Assert.assertTrue(i11 == 0);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        org.junit.Assert.assertNotNull(iterator_iterable_iterator_serializable13);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "" + "'", str15.equals(""));
        org.junit.Assert.assertTrue(i16 == 0);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNotNull(iterator_queue_iterable_iterator_serializable21);
    }

    @Test
    public void test402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test402");
        edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.util.Iterator<edu.osu.cs362.Queue<java.io.Serializable>>>> queue_queue_iterator_queue_serializable0 = new edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.util.Iterator<edu.osu.cs362.Queue<java.io.Serializable>>>>();
        java.util.Spliterator<edu.osu.cs362.Queue<java.util.Iterator<edu.osu.cs362.Queue<java.io.Serializable>>>> spliterator_queue_iterator_queue_serializable1 = queue_queue_iterator_queue_serializable0.spliterator();
        try {
            edu.osu.cs362.Queue<java.util.Iterator<edu.osu.cs362.Queue<java.io.Serializable>>> queue_iterator_queue_serializable2 = queue_queue_iterator_queue_serializable0.peek();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException");
        } catch (java.util.NoSuchElementException e) {
        }
        org.junit.Assert.assertNotNull(spliterator_queue_iterator_queue_serializable1);
    }

    @Test
    public void test403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test403");
        edu.osu.cs362.Queue<java.io.Serializable> queue_serializable0 = new edu.osu.cs362.Queue<java.io.Serializable>();
        queue_serializable0.enqueue((java.io.Serializable) 1L);
        java.io.Serializable serializable3 = queue_serializable0.peek();
        java.io.Serializable serializable4 = queue_serializable0.peek();
        java.lang.String str5 = queue_serializable0.toString();
        java.util.Spliterator<java.io.Serializable> spliterator_serializable6 = queue_serializable0.spliterator();
        boolean b7 = queue_serializable0.isEmpty();
        org.junit.Assert.assertTrue("'" + serializable3 + "' != '" + 1L + "'", serializable3.equals(1L));
        org.junit.Assert.assertTrue("'" + serializable4 + "' != '" + 1L + "'", serializable4.equals(1L));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "1 " + "'", str5.equals("1 "));
        org.junit.Assert.assertNotNull(spliterator_serializable6);
        org.junit.Assert.assertTrue(b7 == false);
    }

    @Test
    public void test404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test404");
        edu.osu.cs362.Queue<java.util.Spliterator<java.util.Spliterator<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>> queue_spliterator_spliterator_iterable_queue_iterable_iterator_serializable0 = new edu.osu.cs362.Queue<java.util.Spliterator<java.util.Spliterator<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>>();
        edu.osu.cs362.Queue<java.util.Spliterator<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>> queue_spliterator_iterable_queue_iterable_iterator_serializable1 = new edu.osu.cs362.Queue<java.util.Spliterator<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>();
        boolean b2 = queue_spliterator_iterable_queue_iterable_iterator_serializable1.isEmpty();
        boolean b3 = queue_spliterator_iterable_queue_iterable_iterator_serializable1.isEmpty();
        java.util.Spliterator<java.util.Spliterator<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>> spliterator_spliterator_iterable_queue_iterable_iterator_serializable4 = queue_spliterator_iterable_queue_iterable_iterator_serializable1.spliterator();
        queue_spliterator_spliterator_iterable_queue_iterable_iterator_serializable0.enqueue(spliterator_spliterator_iterable_queue_iterable_iterator_serializable4);
        java.util.Spliterator<java.util.Spliterator<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>> spliterator_spliterator_iterable_queue_iterable_iterator_serializable6 = queue_spliterator_spliterator_iterable_queue_iterable_iterator_serializable0.peek();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertNotNull(spliterator_spliterator_iterable_queue_iterable_iterator_serializable4);
        org.junit.Assert.assertNotNull(spliterator_spliterator_iterable_queue_iterable_iterator_serializable6);
    }

    @Test
    public void test405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test405");
        edu.osu.cs362.Queue<java.util.Iterator<java.util.Iterator<edu.osu.cs362.Queue<java.io.Serializable>>>> queue_iterator_iterator_queue_serializable0 = new edu.osu.cs362.Queue<java.util.Iterator<java.util.Iterator<edu.osu.cs362.Queue<java.io.Serializable>>>>();
        java.util.Iterator<java.util.Iterator<java.util.Iterator<edu.osu.cs362.Queue<java.io.Serializable>>>> iterator_iterator_iterator_queue_serializable1 = queue_iterator_iterator_queue_serializable0.iterator();
        try {
            java.util.Iterator<java.util.Iterator<edu.osu.cs362.Queue<java.io.Serializable>>> iterator_iterator_queue_serializable2 = queue_iterator_iterator_queue_serializable0.peek();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException");
        } catch (java.util.NoSuchElementException e) {
        }
        org.junit.Assert.assertNotNull(iterator_iterator_iterator_queue_serializable1);
    }

    @Test
    public void test406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test406");
        edu.osu.cs362.Queue<java.lang.Iterable<java.util.Spliterator<java.util.Iterator<java.io.Serializable>>>> queue_iterable_spliterator_iterator_serializable0 = new edu.osu.cs362.Queue<java.lang.Iterable<java.util.Spliterator<java.util.Iterator<java.io.Serializable>>>>();
        java.util.Iterator<java.lang.Iterable<java.util.Spliterator<java.util.Iterator<java.io.Serializable>>>> iterator_iterable_spliterator_iterator_serializable1 = queue_iterable_spliterator_iterator_serializable0.iterator();
        try {
            java.lang.Iterable<java.util.Spliterator<java.util.Iterator<java.io.Serializable>>> iterable_spliterator_iterator_serializable2 = queue_iterable_spliterator_iterator_serializable0.peek();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException");
        } catch (java.util.NoSuchElementException e) {
        }
        org.junit.Assert.assertNotNull(iterator_iterable_spliterator_iterator_serializable1);
    }

    @Test
    public void test407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test407");
        edu.osu.cs362.Queue<java.util.Iterator<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>> queue_iterator_iterable_queue_iterable_iterator_serializable0 = new edu.osu.cs362.Queue<java.util.Iterator<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>();
        java.util.Iterator<java.util.Iterator<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>> iterator_iterator_iterable_queue_iterable_iterator_serializable1 = queue_iterator_iterable_queue_iterable_iterator_serializable0.iterator();
        java.lang.String str2 = queue_iterator_iterable_queue_iterable_iterator_serializable0.toString();
        edu.osu.cs362.Queue<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>> queue_iterable_queue_iterable_iterator_serializable3 = new edu.osu.cs362.Queue<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>();
        java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>> iterable_queue_iterable_iterator_serializable4 = null;
        queue_iterable_queue_iterable_iterator_serializable3.enqueue(iterable_queue_iterable_iterator_serializable4);
        java.util.Iterator<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>> iterator_iterable_queue_iterable_iterator_serializable6 = queue_iterable_queue_iterable_iterator_serializable3.iterator();
        int i7 = queue_iterable_queue_iterable_iterator_serializable3.size();
        java.lang.String str8 = queue_iterable_queue_iterable_iterator_serializable3.toString();
        boolean b9 = queue_iterable_queue_iterable_iterator_serializable3.isEmpty();
        java.util.Iterator<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>> iterator_iterable_queue_iterable_iterator_serializable10 = queue_iterable_queue_iterable_iterator_serializable3.iterator();
        java.util.Iterator<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>> iterator_iterable_queue_iterable_iterator_serializable11 = queue_iterable_queue_iterable_iterator_serializable3.iterator();
        queue_iterator_iterable_queue_iterable_iterator_serializable0.enqueue(iterator_iterable_queue_iterable_iterator_serializable11);
        org.junit.Assert.assertNotNull(iterator_iterator_iterable_queue_iterable_iterator_serializable1);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
        org.junit.Assert.assertNotNull(iterator_iterable_queue_iterable_iterator_serializable6);
        org.junit.Assert.assertTrue(i7 == 1);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "null " + "'", str8.equals("null "));
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(iterator_iterable_queue_iterable_iterator_serializable10);
        org.junit.Assert.assertNotNull(iterator_iterable_queue_iterable_iterator_serializable11);
    }

    @Test
    public void test408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test408");
        edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.lang.Object>>> queue_iterable_iterator_obj0 = new edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.lang.Object>>>();
        edu.osu.cs362.Queue<java.util.Iterator<java.lang.Object>> queue_iterator_obj1 = new edu.osu.cs362.Queue<java.util.Iterator<java.lang.Object>>();
        queue_iterable_iterator_obj0.enqueue((java.lang.Iterable<java.util.Iterator<java.lang.Object>>) queue_iterator_obj1);
        edu.osu.cs362.Queue<java.util.Iterator<java.lang.Object>> queue_iterator_obj3 = new edu.osu.cs362.Queue<java.util.Iterator<java.lang.Object>>();
        queue_iterable_iterator_obj0.enqueue((java.lang.Iterable<java.util.Iterator<java.lang.Object>>) queue_iterator_obj3);
        java.lang.Iterable<java.util.Iterator<java.lang.Object>> iterable_iterator_obj5 = queue_iterable_iterator_obj0.peek();
        java.lang.Iterable<java.util.Iterator<java.lang.Object>> iterable_iterator_obj6 = queue_iterable_iterator_obj0.dequeue();
        java.lang.Iterable<java.util.Iterator<java.lang.Object>> iterable_iterator_obj7 = queue_iterable_iterator_obj0.peek();
        org.junit.Assert.assertNotNull(iterable_iterator_obj5);
        org.junit.Assert.assertNotNull(iterable_iterator_obj6);
        org.junit.Assert.assertNotNull(iterable_iterator_obj7);
    }

    @Test
    public void test409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test409");
        edu.osu.cs362.Queue<java.util.Spliterator<java.util.Iterator<java.util.Iterator<java.lang.Object>>>> queue_spliterator_iterator_iterator_obj0 = new edu.osu.cs362.Queue<java.util.Spliterator<java.util.Iterator<java.util.Iterator<java.lang.Object>>>>();
        try {
            java.util.Spliterator<java.util.Iterator<java.util.Iterator<java.lang.Object>>> spliterator_iterator_iterator_obj1 = queue_spliterator_iterator_iterator_obj0.dequeue();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException");
        } catch (java.util.NoSuchElementException e) {
        }
    }

    @Test
    public void test410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test410");
        edu.osu.cs362.Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new edu.osu.cs362.Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.enqueue((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str3 = queue_comparable_str0.toString();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> spliterator_comparable_str4 = queue_comparable_str0.spliterator();
        java.lang.Comparable<java.lang.String> comparable_str5 = queue_comparable_str0.peek();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi! " + "'", str3.equals("hi! "));
        org.junit.Assert.assertNotNull(spliterator_comparable_str4);
        org.junit.Assert.assertTrue("'" + comparable_str5 + "' != '" + "hi!" + "'", comparable_str5.equals("hi!"));
    }

    @Test
    public void test411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test411");
        edu.osu.cs362.Queue<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>> queue_iterable_queue_iterable_iterator_serializable0 = new edu.osu.cs362.Queue<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>();
        java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>> iterable_queue_iterable_iterator_serializable1 = null;
        queue_iterable_queue_iterable_iterator_serializable0.enqueue(iterable_queue_iterable_iterator_serializable1);
        java.util.Iterator<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>> iterator_iterable_queue_iterable_iterator_serializable3 = queue_iterable_queue_iterable_iterator_serializable0.iterator();
        int i4 = queue_iterable_queue_iterable_iterator_serializable0.size();
        java.lang.String str5 = queue_iterable_queue_iterable_iterator_serializable0.toString();
        java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>> iterable_queue_iterable_iterator_serializable6 = queue_iterable_queue_iterable_iterator_serializable0.dequeue();
        java.util.Iterator<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>> iterator_iterable_queue_iterable_iterator_serializable7 = queue_iterable_queue_iterable_iterator_serializable0.iterator();
        java.lang.String str8 = queue_iterable_queue_iterable_iterator_serializable0.toString();
        edu.osu.cs362.Queue<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>> queue_iterable_queue_iterable_iterator_serializable9 = new edu.osu.cs362.Queue<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>();
        edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>> queue_queue_iterable_iterator_serializable10 = new edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>();
        java.lang.String str11 = queue_queue_iterable_iterator_serializable10.toString();
        int i12 = queue_queue_iterable_iterator_serializable10.size();
        queue_iterable_queue_iterable_iterator_serializable9.enqueue((java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>) queue_queue_iterable_iterator_serializable10);
        java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>> iterable_queue_iterable_iterator_serializable14 = queue_iterable_queue_iterable_iterator_serializable9.peek();
        queue_iterable_queue_iterable_iterator_serializable0.enqueue(iterable_queue_iterable_iterator_serializable14);
        org.junit.Assert.assertNotNull(iterator_iterable_queue_iterable_iterator_serializable3);
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "null " + "'", str5.equals("null "));
        org.junit.Assert.assertNull(iterable_queue_iterable_iterator_serializable6);
        org.junit.Assert.assertNotNull(iterator_iterable_queue_iterable_iterator_serializable7);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "" + "'", str11.equals(""));
        org.junit.Assert.assertTrue(i12 == 0);
        org.junit.Assert.assertNotNull(iterable_queue_iterable_iterator_serializable14);
    }

    @Test
    public void test412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test412");
        edu.osu.cs362.Queue<java.lang.Iterable<java.util.Spliterator<java.util.Iterator<java.io.Serializable>>>> queue_iterable_spliterator_iterator_serializable0 = new edu.osu.cs362.Queue<java.lang.Iterable<java.util.Spliterator<java.util.Iterator<java.io.Serializable>>>>();
        int i1 = queue_iterable_spliterator_iterator_serializable0.size();
        java.util.Spliterator<java.lang.Iterable<java.util.Spliterator<java.util.Iterator<java.io.Serializable>>>> spliterator_iterable_spliterator_iterator_serializable2 = queue_iterable_spliterator_iterator_serializable0.spliterator();
        try {
            java.lang.Iterable<java.util.Spliterator<java.util.Iterator<java.io.Serializable>>> iterable_spliterator_iterator_serializable3 = queue_iterable_spliterator_iterator_serializable0.dequeue();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException");
        } catch (java.util.NoSuchElementException e) {
        }
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertNotNull(spliterator_iterable_spliterator_iterator_serializable2);
    }

    @Test
    public void test413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test413");
        edu.osu.cs362.Queue<java.util.Iterator<java.util.Iterator<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>> queue_iterator_iterator_queue_iterable_iterator_serializable0 = new edu.osu.cs362.Queue<java.util.Iterator<java.util.Iterator<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>();
        java.lang.String str1 = queue_iterator_iterator_queue_iterable_iterator_serializable0.toString();
        try {
            java.util.Iterator<java.util.Iterator<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>> iterator_iterator_queue_iterable_iterator_serializable2 = queue_iterator_iterator_queue_iterable_iterator_serializable0.peek();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException");
        } catch (java.util.NoSuchElementException e) {
        }
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
    }

    @Test
    public void test414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test414");
        edu.osu.cs362.Queue<java.util.Iterator<java.util.Iterator<edu.osu.cs362.Queue<java.io.Serializable>>>> queue_iterator_iterator_queue_serializable0 = new edu.osu.cs362.Queue<java.util.Iterator<java.util.Iterator<edu.osu.cs362.Queue<java.io.Serializable>>>>();
        int i1 = queue_iterator_iterator_queue_serializable0.size();
        try {
            java.util.Iterator<java.util.Iterator<edu.osu.cs362.Queue<java.io.Serializable>>> iterator_iterator_queue_serializable2 = queue_iterator_iterator_queue_serializable0.peek();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException");
        } catch (java.util.NoSuchElementException e) {
        }
        org.junit.Assert.assertTrue(i1 == 0);
    }

    @Test
    public void test415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test415");
        edu.osu.cs362.Queue<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.lang.Object>>>>> queue_iterable_queue_iterable_iterator_obj0 = new edu.osu.cs362.Queue<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.lang.Object>>>>>();
        java.util.Spliterator<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.lang.Object>>>>> spliterator_iterable_queue_iterable_iterator_obj1 = queue_iterable_queue_iterable_iterator_obj0.spliterator();
        java.util.Spliterator<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.lang.Object>>>>> spliterator_iterable_queue_iterable_iterator_obj2 = queue_iterable_queue_iterable_iterator_obj0.spliterator();
        org.junit.Assert.assertNotNull(spliterator_iterable_queue_iterable_iterator_obj1);
        org.junit.Assert.assertNotNull(spliterator_iterable_queue_iterable_iterator_obj2);
    }

    @Test
    public void test416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test416");
        edu.osu.cs362.Queue<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>> queue_iterable_queue_iterable_queue_iterable_iterator_serializable0 = new edu.osu.cs362.Queue<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>>();
        boolean b1 = queue_iterable_queue_iterable_queue_iterable_iterator_serializable0.isEmpty();
        edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>> queue_queue_iterable_queue_iterable_iterator_serializable2 = new edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>();
        java.lang.String str3 = queue_queue_iterable_queue_iterable_iterator_serializable2.toString();
        int i4 = queue_queue_iterable_queue_iterable_iterator_serializable2.size();
        boolean b5 = queue_queue_iterable_queue_iterable_iterator_serializable2.isEmpty();
        queue_iterable_queue_iterable_queue_iterable_iterator_serializable0.enqueue((java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>) queue_queue_iterable_queue_iterable_iterator_serializable2);
        org.junit.Assert.assertTrue(b1 == true);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(b5 == true);
    }

    @Test
    public void test417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test417");
        edu.osu.cs362.Queue<java.lang.Iterable<java.lang.Iterable<java.util.Iterator<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>>> queue_iterable_iterable_iterator_iterable_queue_iterable_iterator_serializable0 = new edu.osu.cs362.Queue<java.lang.Iterable<java.lang.Iterable<java.util.Iterator<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>>>();
        try {
            java.lang.Iterable<java.lang.Iterable<java.util.Iterator<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>> iterable_iterable_iterator_iterable_queue_iterable_iterator_serializable1 = queue_iterable_iterable_iterator_iterable_queue_iterable_iterator_serializable0.dequeue();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException");
        } catch (java.util.NoSuchElementException e) {
        }
    }

    @Test
    public void test418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test418");
        edu.osu.cs362.Queue<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>> queue_iterable_queue_iterable_iterator_serializable0 = new edu.osu.cs362.Queue<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>();
        java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>> iterable_queue_iterable_iterator_serializable1 = null;
        queue_iterable_queue_iterable_iterator_serializable0.enqueue(iterable_queue_iterable_iterator_serializable1);
        java.util.Iterator<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>> iterator_iterable_queue_iterable_iterator_serializable3 = queue_iterable_queue_iterable_iterator_serializable0.iterator();
        int i4 = queue_iterable_queue_iterable_iterator_serializable0.size();
        edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>> queue_queue_iterable_iterator_serializable5 = new edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>();
        boolean b6 = queue_queue_iterable_iterator_serializable5.isEmpty();
        boolean b7 = queue_queue_iterable_iterator_serializable5.isEmpty();
        boolean b8 = queue_queue_iterable_iterator_serializable5.isEmpty();
        int i9 = queue_queue_iterable_iterator_serializable5.size();
        int i10 = queue_queue_iterable_iterator_serializable5.size();
        queue_iterable_queue_iterable_iterator_serializable0.enqueue((java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>) queue_queue_iterable_iterator_serializable5);
        java.util.Iterator<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>> iterator_iterable_queue_iterable_iterator_serializable12 = queue_iterable_queue_iterable_iterator_serializable0.iterator();
        java.util.Iterator<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>> iterator_iterable_queue_iterable_iterator_serializable13 = queue_iterable_queue_iterable_iterator_serializable0.iterator();
        boolean b14 = queue_iterable_queue_iterable_iterator_serializable0.isEmpty();
        org.junit.Assert.assertNotNull(iterator_iterable_queue_iterable_iterator_serializable3);
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertTrue(i10 == 0);
        org.junit.Assert.assertNotNull(iterator_iterable_queue_iterable_iterator_serializable12);
        org.junit.Assert.assertNotNull(iterator_iterable_queue_iterable_iterator_serializable13);
        org.junit.Assert.assertTrue(b14 == false);
    }

    @Test
    public void test419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test419");
        edu.osu.cs362.Queue<java.lang.Iterable<java.io.Serializable>> queue_iterable_serializable0 = new edu.osu.cs362.Queue<java.lang.Iterable<java.io.Serializable>>();
        int i1 = queue_iterable_serializable0.size();
        edu.osu.cs362.Queue<java.io.Serializable> queue_serializable2 = new edu.osu.cs362.Queue<java.io.Serializable>();
        queue_serializable2.enqueue((java.io.Serializable) 1L);
        java.lang.String str5 = queue_serializable2.toString();
        java.io.Serializable serializable6 = queue_serializable2.dequeue();
        java.util.Spliterator<java.io.Serializable> spliterator_serializable7 = queue_serializable2.spliterator();
        queue_iterable_serializable0.enqueue((java.lang.Iterable<java.io.Serializable>) queue_serializable2);
        java.util.Iterator<java.lang.Iterable<java.io.Serializable>> iterator_iterable_serializable9 = queue_iterable_serializable0.iterator();
        edu.osu.cs362.Queue<java.io.Serializable> queue_serializable10 = new edu.osu.cs362.Queue<java.io.Serializable>();
        queue_serializable10.enqueue((java.io.Serializable) 1L);
        queue_iterable_serializable0.enqueue((java.lang.Iterable<java.io.Serializable>) queue_serializable10);
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "1 " + "'", str5.equals("1 "));
        org.junit.Assert.assertTrue("'" + serializable6 + "' != '" + 1L + "'", serializable6.equals(1L));
        org.junit.Assert.assertNotNull(spliterator_serializable7);
        org.junit.Assert.assertNotNull(iterator_iterable_serializable9);
    }

    @Test
    public void test420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test420");
        edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.util.Spliterator<java.io.Serializable>>> queue_queue_spliterator_serializable0 = new edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.util.Spliterator<java.io.Serializable>>>();
        try {
            edu.osu.cs362.Queue<java.util.Spliterator<java.io.Serializable>> queue_spliterator_serializable1 = queue_queue_spliterator_serializable0.peek();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException");
        } catch (java.util.NoSuchElementException e) {
        }
    }

    @Test
    public void test421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test421");
        edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>> queue_queue_iterable_iterator_serializable0 = new edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>();
        try {
            edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>> queue_iterable_iterator_serializable1 = queue_queue_iterable_iterator_serializable0.peek();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException");
        } catch (java.util.NoSuchElementException e) {
        }
    }

    @Test
    public void test422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test422");
        edu.osu.cs362.Queue<java.util.Spliterator<java.io.Serializable>> queue_spliterator_serializable0 = new edu.osu.cs362.Queue<java.util.Spliterator<java.io.Serializable>>();
        java.util.Spliterator<java.util.Spliterator<java.io.Serializable>> spliterator_spliterator_serializable1 = queue_spliterator_serializable0.spliterator();
        boolean b2 = queue_spliterator_serializable0.isEmpty();
        org.junit.Assert.assertNotNull(spliterator_spliterator_serializable1);
        org.junit.Assert.assertTrue(b2 == true);
    }

    @Test
    public void test423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test423");
        edu.osu.cs362.Queue<java.util.Iterator<java.util.Iterator<java.util.Iterator<java.lang.Object>>>> queue_iterator_iterator_iterator_obj0 = new edu.osu.cs362.Queue<java.util.Iterator<java.util.Iterator<java.util.Iterator<java.lang.Object>>>>();
        java.lang.String str1 = queue_iterator_iterator_iterator_obj0.toString();
        java.util.Iterator<java.util.Iterator<java.util.Iterator<java.util.Iterator<java.lang.Object>>>> iterator_iterator_iterator_iterator_obj2 = queue_iterator_iterator_iterator_obj0.iterator();
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertNotNull(iterator_iterator_iterator_iterator_obj2);
    }

    @Test
    public void test424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test424");
        edu.osu.cs362.Queue<java.lang.Iterable<edu.osu.cs362.Queue<edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>>>> queue_iterable_queue_queue_queue_iterable_queue_iterable_iterator_serializable0 = new edu.osu.cs362.Queue<java.lang.Iterable<edu.osu.cs362.Queue<edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>>>>();
        boolean b1 = queue_iterable_queue_queue_queue_iterable_queue_iterable_iterator_serializable0.isEmpty();
        try {
            java.lang.Iterable<edu.osu.cs362.Queue<edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>>> iterable_queue_queue_queue_iterable_queue_iterable_iterator_serializable2 = queue_iterable_queue_queue_queue_iterable_queue_iterable_iterator_serializable0.dequeue();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException");
        } catch (java.util.NoSuchElementException e) {
        }
        org.junit.Assert.assertTrue(b1 == true);
    }

    @Test
    public void test425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test425");
        edu.osu.cs362.Queue<java.lang.Iterable<java.lang.Object>> queue_iterable_obj0 = new edu.osu.cs362.Queue<java.lang.Iterable<java.lang.Object>>();
        int i1 = queue_iterable_obj0.size();
        java.util.Spliterator<java.lang.Iterable<java.lang.Object>> spliterator_iterable_obj2 = queue_iterable_obj0.spliterator();
        boolean b3 = queue_iterable_obj0.isEmpty();
        java.lang.String str4 = queue_iterable_obj0.toString();
        edu.osu.cs362.Queue<java.lang.Object> queue_obj5 = new edu.osu.cs362.Queue<java.lang.Object>();
        int i6 = queue_obj5.size();
        java.util.Spliterator<java.lang.Object> spliterator_obj7 = queue_obj5.spliterator();
        edu.osu.cs362.Queue<java.util.Iterator<java.io.Serializable>> queue_iterator_serializable8 = new edu.osu.cs362.Queue<java.util.Iterator<java.io.Serializable>>();
        boolean b9 = queue_iterator_serializable8.isEmpty();
        edu.osu.cs362.Queue<java.io.Serializable> queue_serializable10 = new edu.osu.cs362.Queue<java.io.Serializable>();
        queue_serializable10.enqueue((java.io.Serializable) 1L);
        java.util.Iterator<java.io.Serializable> iterator_serializable13 = queue_serializable10.iterator();
        queue_iterator_serializable8.enqueue(iterator_serializable13);
        int i15 = queue_iterator_serializable8.size();
        java.util.Iterator<java.io.Serializable> iterator_serializable16 = queue_iterator_serializable8.peek();
        boolean b17 = queue_iterator_serializable8.isEmpty();
        java.util.Iterator<java.io.Serializable> iterator_serializable18 = queue_iterator_serializable8.peek();
        queue_obj5.enqueue((java.lang.Object) queue_iterator_serializable8);
        java.lang.String str20 = queue_obj5.toString();
        queue_iterable_obj0.enqueue((java.lang.Iterable<java.lang.Object>) queue_obj5);
        java.lang.String str22 = queue_obj5.toString();
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertNotNull(spliterator_iterable_obj2);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertNotNull(spliterator_obj7);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertNotNull(iterator_serializable13);
        org.junit.Assert.assertTrue(i15 == 1);
        org.junit.Assert.assertNotNull(iterator_serializable16);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNotNull(iterator_serializable18);
    }

    @Test
    public void test426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test426");
        edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.lang.Comparable<java.lang.String>>> queue_queue_comparable_str0 = new edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.lang.Comparable<java.lang.String>>>();
        java.util.Spliterator<edu.osu.cs362.Queue<java.lang.Comparable<java.lang.String>>> spliterator_queue_comparable_str1 = queue_queue_comparable_str0.spliterator();
        try {
            edu.osu.cs362.Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str2 = queue_queue_comparable_str0.dequeue();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException");
        } catch (java.util.NoSuchElementException e) {
        }
        org.junit.Assert.assertNotNull(spliterator_queue_comparable_str1);
    }

    @Test
    public void test427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test427");
        edu.osu.cs362.Queue<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>> queue_iterable_queue_iterable_queue_iterable_iterator_serializable0 = new edu.osu.cs362.Queue<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>>();
        java.util.Spliterator<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>> spliterator_iterable_queue_iterable_queue_iterable_iterator_serializable1 = queue_iterable_queue_iterable_queue_iterable_iterator_serializable0.spliterator();
        int i2 = queue_iterable_queue_iterable_queue_iterable_iterator_serializable0.size();
        try {
            java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>> iterable_queue_iterable_queue_iterable_iterator_serializable3 = queue_iterable_queue_iterable_queue_iterable_iterator_serializable0.dequeue();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException");
        } catch (java.util.NoSuchElementException e) {
        }
        org.junit.Assert.assertNotNull(spliterator_iterable_queue_iterable_queue_iterable_iterator_serializable1);
        org.junit.Assert.assertTrue(i2 == 0);
    }

    @Test
    public void test428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test428");
        edu.osu.cs362.Queue<java.lang.Iterable<java.lang.Iterable<java.lang.Iterable<java.lang.Object>>>> queue_iterable_iterable_iterable_obj0 = new edu.osu.cs362.Queue<java.lang.Iterable<java.lang.Iterable<java.lang.Iterable<java.lang.Object>>>>();
        java.util.Iterator<java.lang.Iterable<java.lang.Iterable<java.lang.Iterable<java.lang.Object>>>> iterator_iterable_iterable_iterable_obj1 = queue_iterable_iterable_iterable_obj0.iterator();
        edu.osu.cs362.Queue<java.lang.Iterable<java.lang.Iterable<java.lang.Object>>> queue_iterable_iterable_obj2 = new edu.osu.cs362.Queue<java.lang.Iterable<java.lang.Iterable<java.lang.Object>>>();
        queue_iterable_iterable_iterable_obj0.enqueue((java.lang.Iterable<java.lang.Iterable<java.lang.Iterable<java.lang.Object>>>) queue_iterable_iterable_obj2);
        int i4 = queue_iterable_iterable_obj2.size();
        boolean b5 = queue_iterable_iterable_obj2.isEmpty();
        boolean b6 = queue_iterable_iterable_obj2.isEmpty();
        boolean b7 = queue_iterable_iterable_obj2.isEmpty();
        org.junit.Assert.assertNotNull(iterator_iterable_iterable_iterable_obj1);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(b7 == true);
    }

    @Test
    public void test429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test429");
        edu.osu.cs362.Queue<java.util.Spliterator<java.lang.Iterable<java.util.Iterator<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>>> queue_spliterator_iterable_iterator_iterable_queue_iterable_iterator_serializable0 = new edu.osu.cs362.Queue<java.util.Spliterator<java.lang.Iterable<java.util.Iterator<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>>>();
        int i1 = queue_spliterator_iterable_iterator_iterable_queue_iterable_iterator_serializable0.size();
        boolean b2 = queue_spliterator_iterable_iterator_iterable_queue_iterable_iterator_serializable0.isEmpty();
        java.util.Spliterator<java.util.Spliterator<java.lang.Iterable<java.util.Iterator<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>>> spliterator_spliterator_iterable_iterator_iterable_queue_iterable_iterator_serializable3 = queue_spliterator_iterable_iterator_iterable_queue_iterable_iterator_serializable0.spliterator();
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNotNull(spliterator_spliterator_iterable_iterator_iterable_queue_iterable_iterator_serializable3);
    }

    @Test
    public void test430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test430");
        edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<edu.osu.cs362.Queue<java.io.Serializable>>>> queue_iterable_iterator_queue_serializable0 = new edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<edu.osu.cs362.Queue<java.io.Serializable>>>>();
        java.lang.String str1 = queue_iterable_iterator_queue_serializable0.toString();
        java.lang.String str2 = queue_iterable_iterator_queue_serializable0.toString();
        int i3 = queue_iterable_iterator_queue_serializable0.size();
        edu.osu.cs362.Queue<java.util.Iterator<edu.osu.cs362.Queue<java.io.Serializable>>> queue_iterator_queue_serializable4 = new edu.osu.cs362.Queue<java.util.Iterator<edu.osu.cs362.Queue<java.io.Serializable>>>();
        int i5 = queue_iterator_queue_serializable4.size();
        java.util.Iterator<java.util.Iterator<edu.osu.cs362.Queue<java.io.Serializable>>> iterator_iterator_queue_serializable6 = queue_iterator_queue_serializable4.iterator();
        boolean b7 = queue_iterator_queue_serializable4.isEmpty();
        boolean b8 = queue_iterator_queue_serializable4.isEmpty();
        java.util.Iterator<java.util.Iterator<edu.osu.cs362.Queue<java.io.Serializable>>> iterator_iterator_queue_serializable9 = queue_iterator_queue_serializable4.iterator();
        queue_iterable_iterator_queue_serializable0.enqueue((java.lang.Iterable<java.util.Iterator<edu.osu.cs362.Queue<java.io.Serializable>>>) queue_iterator_queue_serializable4);
        java.util.Spliterator<java.lang.Iterable<java.util.Iterator<edu.osu.cs362.Queue<java.io.Serializable>>>> spliterator_iterable_iterator_queue_serializable11 = queue_iterable_iterator_queue_serializable0.spliterator();
        int i12 = queue_iterable_iterator_queue_serializable0.size();
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertNotNull(iterator_iterator_queue_serializable6);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertNotNull(iterator_iterator_queue_serializable9);
        org.junit.Assert.assertNotNull(spliterator_iterable_iterator_queue_serializable11);
        org.junit.Assert.assertTrue(i12 == 1);
    }

    @Test
    public void test431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test431");
        edu.osu.cs362.Queue<java.util.Iterator<java.lang.Object>> queue_iterator_obj0 = new edu.osu.cs362.Queue<java.util.Iterator<java.lang.Object>>();
        int i1 = queue_iterator_obj0.size();
        java.util.Spliterator<java.util.Iterator<java.lang.Object>> spliterator_iterator_obj2 = queue_iterator_obj0.spliterator();
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertNotNull(spliterator_iterator_obj2);
    }

    @Test
    public void test432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test432");
        edu.osu.cs362.Queue<java.util.Iterator<java.util.Iterator<java.lang.Object>>> queue_iterator_iterator_obj0 = new edu.osu.cs362.Queue<java.util.Iterator<java.util.Iterator<java.lang.Object>>>();
        java.util.Iterator<java.util.Iterator<java.util.Iterator<java.lang.Object>>> iterator_iterator_iterator_obj1 = queue_iterator_iterator_obj0.iterator();
        boolean b2 = queue_iterator_iterator_obj0.isEmpty();
        java.lang.String str3 = queue_iterator_iterator_obj0.toString();
        edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.lang.Object>>> queue_iterable_iterator_obj4 = new edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.lang.Object>>>();
        edu.osu.cs362.Queue<java.util.Iterator<java.lang.Object>> queue_iterator_obj5 = new edu.osu.cs362.Queue<java.util.Iterator<java.lang.Object>>();
        queue_iterable_iterator_obj4.enqueue((java.lang.Iterable<java.util.Iterator<java.lang.Object>>) queue_iterator_obj5);
        java.lang.String str7 = queue_iterator_obj5.toString();
        java.util.Iterator<java.util.Iterator<java.lang.Object>> iterator_iterator_obj8 = queue_iterator_obj5.iterator();
        queue_iterator_iterator_obj0.enqueue(iterator_iterator_obj8);
        java.util.Iterator<java.util.Iterator<java.lang.Object>> iterator_iterator_obj10 = queue_iterator_iterator_obj0.peek();
        java.util.Iterator<java.util.Iterator<java.util.Iterator<java.lang.Object>>> iterator_iterator_iterator_obj11 = queue_iterator_iterator_obj0.iterator();
        org.junit.Assert.assertNotNull(iterator_iterator_iterator_obj1);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertNotNull(iterator_iterator_obj8);
        org.junit.Assert.assertNotNull(iterator_iterator_obj10);
        org.junit.Assert.assertNotNull(iterator_iterator_iterator_obj11);
    }

    @Test
    public void test433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test433");
        edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.util.Spliterator<java.lang.Iterable<java.lang.Iterable<java.util.Iterator<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>>>>> queue_queue_spliterator_iterable_iterable_iterator_iterable_queue_iterable_iterator_serializable0 = new edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.util.Spliterator<java.lang.Iterable<java.lang.Iterable<java.util.Iterator<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>>>>>();
        try {
            edu.osu.cs362.Queue<java.util.Spliterator<java.lang.Iterable<java.lang.Iterable<java.util.Iterator<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>>>> queue_spliterator_iterable_iterable_iterator_iterable_queue_iterable_iterator_serializable1 = queue_queue_spliterator_iterable_iterable_iterator_iterable_queue_iterable_iterator_serializable0.peek();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException");
        } catch (java.util.NoSuchElementException e) {
        }
    }

    @Test
    public void test434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test434");
        edu.osu.cs362.Queue<java.util.Iterator<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>> queue_iterator_queue_iterable_iterator_serializable0 = new edu.osu.cs362.Queue<java.util.Iterator<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>();
        try {
            java.util.Iterator<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>> iterator_queue_iterable_iterator_serializable1 = queue_iterator_queue_iterable_iterator_serializable0.dequeue();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException");
        } catch (java.util.NoSuchElementException e) {
        }
    }

    @Test
    public void test435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test435");
        edu.osu.cs362.Queue<java.io.Serializable> queue_serializable0 = new edu.osu.cs362.Queue<java.io.Serializable>();
        queue_serializable0.enqueue((java.io.Serializable) 1L);
        java.io.Serializable serializable3 = queue_serializable0.peek();
        java.io.Serializable serializable4 = queue_serializable0.peek();
        java.lang.String str5 = queue_serializable0.toString();
        java.util.Spliterator<java.io.Serializable> spliterator_serializable6 = queue_serializable0.spliterator();
        java.util.Spliterator<java.io.Serializable> spliterator_serializable7 = queue_serializable0.spliterator();
        org.junit.Assert.assertTrue("'" + serializable3 + "' != '" + 1L + "'", serializable3.equals(1L));
        org.junit.Assert.assertTrue("'" + serializable4 + "' != '" + 1L + "'", serializable4.equals(1L));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "1 " + "'", str5.equals("1 "));
        org.junit.Assert.assertNotNull(spliterator_serializable6);
        org.junit.Assert.assertNotNull(spliterator_serializable7);
    }

    @Test
    public void test436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test436");
        edu.osu.cs362.Queue<java.util.Iterator<edu.osu.cs362.Queue<java.io.Serializable>>> queue_iterator_queue_serializable0 = new edu.osu.cs362.Queue<java.util.Iterator<edu.osu.cs362.Queue<java.io.Serializable>>>();
        edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.io.Serializable>> queue_queue_serializable1 = new edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.io.Serializable>>();
        java.util.Iterator<edu.osu.cs362.Queue<java.io.Serializable>> iterator_queue_serializable2 = queue_queue_serializable1.iterator();
        queue_iterator_queue_serializable0.enqueue(iterator_queue_serializable2);
        edu.osu.cs362.Queue<java.util.Iterator<edu.osu.cs362.Queue<java.io.Serializable>>> queue_iterator_queue_serializable4 = new edu.osu.cs362.Queue<java.util.Iterator<edu.osu.cs362.Queue<java.io.Serializable>>>();
        int i5 = queue_iterator_queue_serializable4.size();
        edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.io.Serializable>> queue_queue_serializable6 = new edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.io.Serializable>>();
        java.util.Spliterator<edu.osu.cs362.Queue<java.io.Serializable>> spliterator_queue_serializable7 = queue_queue_serializable6.spliterator();
        java.util.Iterator<edu.osu.cs362.Queue<java.io.Serializable>> iterator_queue_serializable8 = queue_queue_serializable6.iterator();
        java.lang.String str9 = queue_queue_serializable6.toString();
        java.lang.String str10 = queue_queue_serializable6.toString();
        boolean b11 = queue_queue_serializable6.isEmpty();
        java.util.Iterator<edu.osu.cs362.Queue<java.io.Serializable>> iterator_queue_serializable12 = queue_queue_serializable6.iterator();
        queue_iterator_queue_serializable4.enqueue(iterator_queue_serializable12);
        queue_iterator_queue_serializable0.enqueue(iterator_queue_serializable12);
        org.junit.Assert.assertNotNull(iterator_queue_serializable2);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertNotNull(spliterator_queue_serializable7);
        org.junit.Assert.assertNotNull(iterator_queue_serializable8);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertNotNull(iterator_queue_serializable12);
    }

    @Test
    public void test437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test437");
        edu.osu.cs362.Queue<java.lang.Iterable<java.lang.Iterable<java.lang.Iterable<java.lang.Object>>>> queue_iterable_iterable_iterable_obj0 = new edu.osu.cs362.Queue<java.lang.Iterable<java.lang.Iterable<java.lang.Iterable<java.lang.Object>>>>();
        java.util.Iterator<java.lang.Iterable<java.lang.Iterable<java.lang.Iterable<java.lang.Object>>>> iterator_iterable_iterable_iterable_obj1 = queue_iterable_iterable_iterable_obj0.iterator();
        edu.osu.cs362.Queue<java.lang.Iterable<java.lang.Iterable<java.lang.Object>>> queue_iterable_iterable_obj2 = new edu.osu.cs362.Queue<java.lang.Iterable<java.lang.Iterable<java.lang.Object>>>();
        queue_iterable_iterable_iterable_obj0.enqueue((java.lang.Iterable<java.lang.Iterable<java.lang.Iterable<java.lang.Object>>>) queue_iterable_iterable_obj2);
        int i4 = queue_iterable_iterable_obj2.size();
        try {
            java.lang.Iterable<java.lang.Iterable<java.lang.Object>> iterable_iterable_obj5 = queue_iterable_iterable_obj2.dequeue();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException");
        } catch (java.util.NoSuchElementException e) {
        }
        org.junit.Assert.assertNotNull(iterator_iterable_iterable_iterable_obj1);
        org.junit.Assert.assertTrue(i4 == 0);
    }

    @Test
    public void test438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test438");
        edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.util.Spliterator<java.lang.Iterable<java.util.Iterator<java.lang.Object>>>>> queue_queue_spliterator_iterable_iterator_obj0 = new edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.util.Spliterator<java.lang.Iterable<java.util.Iterator<java.lang.Object>>>>>();
        try {
            edu.osu.cs362.Queue<java.util.Spliterator<java.lang.Iterable<java.util.Iterator<java.lang.Object>>>> queue_spliterator_iterable_iterator_obj1 = queue_queue_spliterator_iterable_iterator_obj0.dequeue();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException");
        } catch (java.util.NoSuchElementException e) {
        }
    }

    @Test
    public void test439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test439");
        edu.osu.cs362.Queue<java.util.Spliterator<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>> queue_spliterator_iterable_queue_iterable_iterator_serializable0 = new edu.osu.cs362.Queue<java.util.Spliterator<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>();
        edu.osu.cs362.Queue<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>> queue_iterable_queue_iterable_iterator_serializable1 = new edu.osu.cs362.Queue<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>();
        java.util.Spliterator<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>> spliterator_iterable_queue_iterable_iterator_serializable2 = queue_iterable_queue_iterable_iterator_serializable1.spliterator();
        queue_spliterator_iterable_queue_iterable_iterator_serializable0.enqueue(spliterator_iterable_queue_iterable_iterator_serializable2);
        java.util.Spliterator<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>> spliterator_iterable_queue_iterable_iterator_serializable4 = queue_spliterator_iterable_queue_iterable_iterator_serializable0.peek();
        java.util.Iterator<java.util.Spliterator<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>> iterator_spliterator_iterable_queue_iterable_iterator_serializable5 = queue_spliterator_iterable_queue_iterable_iterator_serializable0.iterator();
        org.junit.Assert.assertNotNull(spliterator_iterable_queue_iterable_iterator_serializable2);
        org.junit.Assert.assertNotNull(spliterator_iterable_queue_iterable_iterator_serializable4);
        org.junit.Assert.assertNotNull(iterator_spliterator_iterable_queue_iterable_iterator_serializable5);
    }

    @Test
    public void test440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test440");
        edu.osu.cs362.Queue<java.util.Iterator<edu.osu.cs362.Queue<java.io.Serializable>>> queue_iterator_queue_serializable0 = new edu.osu.cs362.Queue<java.util.Iterator<edu.osu.cs362.Queue<java.io.Serializable>>>();
        int i1 = queue_iterator_queue_serializable0.size();
        boolean b2 = queue_iterator_queue_serializable0.isEmpty();
        java.util.Iterator<java.util.Iterator<edu.osu.cs362.Queue<java.io.Serializable>>> iterator_iterator_queue_serializable3 = queue_iterator_queue_serializable0.iterator();
        java.util.Iterator<java.util.Iterator<edu.osu.cs362.Queue<java.io.Serializable>>> iterator_iterator_queue_serializable4 = queue_iterator_queue_serializable0.iterator();
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNotNull(iterator_iterator_queue_serializable3);
        org.junit.Assert.assertNotNull(iterator_iterator_queue_serializable4);
    }

    @Test
    public void test441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test441");
        edu.osu.cs362.Queue<java.util.Iterator<java.util.Iterator<java.lang.Iterable<java.io.Serializable>>>> queue_iterator_iterator_iterable_serializable0 = new edu.osu.cs362.Queue<java.util.Iterator<java.util.Iterator<java.lang.Iterable<java.io.Serializable>>>>();
        try {
            java.util.Iterator<java.util.Iterator<java.lang.Iterable<java.io.Serializable>>> iterator_iterator_iterable_serializable1 = queue_iterator_iterator_iterable_serializable0.dequeue();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException");
        } catch (java.util.NoSuchElementException e) {
        }
    }

    @Test
    public void test442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test442");
        edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>> queue_queue_iterable_iterator_serializable0 = new edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>();
        boolean b1 = queue_queue_iterable_iterator_serializable0.isEmpty();
        boolean b2 = queue_queue_iterable_iterator_serializable0.isEmpty();
        boolean b3 = queue_queue_iterable_iterator_serializable0.isEmpty();
        int i4 = queue_queue_iterable_iterator_serializable0.size();
        int i5 = queue_queue_iterable_iterator_serializable0.size();
        boolean b6 = queue_queue_iterable_iterator_serializable0.isEmpty();
        org.junit.Assert.assertTrue(b1 == true);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue(b6 == true);
    }

    @Test
    public void test443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test443");
        edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.lang.Object>>> queue_iterable_iterator_obj0 = new edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.lang.Object>>>();
        edu.osu.cs362.Queue<java.util.Iterator<java.lang.Object>> queue_iterator_obj1 = new edu.osu.cs362.Queue<java.util.Iterator<java.lang.Object>>();
        queue_iterable_iterator_obj0.enqueue((java.lang.Iterable<java.util.Iterator<java.lang.Object>>) queue_iterator_obj1);
        edu.osu.cs362.Queue<java.util.Iterator<java.lang.Object>> queue_iterator_obj3 = new edu.osu.cs362.Queue<java.util.Iterator<java.lang.Object>>();
        queue_iterable_iterator_obj0.enqueue((java.lang.Iterable<java.util.Iterator<java.lang.Object>>) queue_iterator_obj3);
        java.util.Spliterator<java.util.Iterator<java.lang.Object>> spliterator_iterator_obj5 = queue_iterator_obj3.spliterator();
        java.util.Iterator<java.util.Iterator<java.lang.Object>> iterator_iterator_obj6 = queue_iterator_obj3.iterator();
        org.junit.Assert.assertNotNull(spliterator_iterator_obj5);
        org.junit.Assert.assertNotNull(iterator_iterator_obj6);
    }

    @Test
    public void test444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test444");
        edu.osu.cs362.Queue<java.util.Spliterator<java.lang.Iterable<java.lang.Iterable<java.util.Iterator<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>>>> queue_spliterator_iterable_iterable_iterator_iterable_queue_iterable_iterator_serializable0 = new edu.osu.cs362.Queue<java.util.Spliterator<java.lang.Iterable<java.lang.Iterable<java.util.Iterator<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>>>>();
        boolean b1 = queue_spliterator_iterable_iterable_iterator_iterable_queue_iterable_iterator_serializable0.isEmpty();
        java.util.Spliterator<java.util.Spliterator<java.lang.Iterable<java.lang.Iterable<java.util.Iterator<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>>>> spliterator_spliterator_iterable_iterable_iterator_iterable_queue_iterable_iterator_serializable2 = queue_spliterator_iterable_iterable_iterator_iterable_queue_iterable_iterator_serializable0.spliterator();
        int i3 = queue_spliterator_iterable_iterable_iterator_iterable_queue_iterable_iterator_serializable0.size();
        int i4 = queue_spliterator_iterable_iterable_iterator_iterable_queue_iterable_iterator_serializable0.size();
        try {
            java.util.Spliterator<java.lang.Iterable<java.lang.Iterable<java.util.Iterator<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>>> spliterator_iterable_iterable_iterator_iterable_queue_iterable_iterator_serializable5 = queue_spliterator_iterable_iterable_iterator_iterable_queue_iterable_iterator_serializable0.peek();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException");
        } catch (java.util.NoSuchElementException e) {
        }
        org.junit.Assert.assertTrue(b1 == true);
        org.junit.Assert.assertNotNull(spliterator_spliterator_iterable_iterable_iterator_iterable_queue_iterable_iterator_serializable2);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i4 == 0);
    }

    @Test
    public void test445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test445");
        edu.osu.cs362.Queue<edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>> queue_queue_queue_iterable_iterator_serializable0 = new edu.osu.cs362.Queue<edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>();
        try {
            edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>> queue_queue_iterable_iterator_serializable1 = queue_queue_queue_iterable_iterator_serializable0.dequeue();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException");
        } catch (java.util.NoSuchElementException e) {
        }
    }

    @Test
    public void test446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test446");
        edu.osu.cs362.Queue<edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.lang.Comparable<java.lang.String>>>> queue_queue_queue_comparable_str0 = new edu.osu.cs362.Queue<edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.lang.Comparable<java.lang.String>>>>();
        boolean b1 = queue_queue_queue_comparable_str0.isEmpty();
        java.util.Iterator<edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.lang.Comparable<java.lang.String>>>> iterator_queue_queue_comparable_str2 = queue_queue_queue_comparable_str0.iterator();
        int i3 = queue_queue_queue_comparable_str0.size();
        try {
            edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.lang.Comparable<java.lang.String>>> queue_queue_comparable_str4 = queue_queue_queue_comparable_str0.peek();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException");
        } catch (java.util.NoSuchElementException e) {
        }
        org.junit.Assert.assertTrue(b1 == true);
        org.junit.Assert.assertNotNull(iterator_queue_queue_comparable_str2);
        org.junit.Assert.assertTrue(i3 == 0);
    }

    @Test
    public void test447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test447");
        edu.osu.cs362.Queue<java.util.Spliterator<java.util.Iterator<java.io.Serializable>>> queue_spliterator_iterator_serializable0 = new edu.osu.cs362.Queue<java.util.Spliterator<java.util.Iterator<java.io.Serializable>>>();
        int i1 = queue_spliterator_iterator_serializable0.size();
        boolean b2 = queue_spliterator_iterator_serializable0.isEmpty();
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(b2 == true);
    }

    @Test
    public void test448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test448");
        edu.osu.cs362.Queue<java.util.Spliterator<java.util.Iterator<java.util.Iterator<java.lang.Object>>>> queue_spliterator_iterator_iterator_obj0 = new edu.osu.cs362.Queue<java.util.Spliterator<java.util.Iterator<java.util.Iterator<java.lang.Object>>>>();
        try {
            java.util.Spliterator<java.util.Iterator<java.util.Iterator<java.lang.Object>>> spliterator_iterator_iterator_obj1 = queue_spliterator_iterator_iterator_obj0.peek();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException");
        } catch (java.util.NoSuchElementException e) {
        }
    }

    @Test
    public void test449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test449");
        edu.osu.cs362.Queue<java.lang.Iterable<java.lang.Object>> queue_iterable_obj0 = new edu.osu.cs362.Queue<java.lang.Iterable<java.lang.Object>>();
        int i1 = queue_iterable_obj0.size();
        java.util.Spliterator<java.lang.Iterable<java.lang.Object>> spliterator_iterable_obj2 = queue_iterable_obj0.spliterator();
        boolean b3 = queue_iterable_obj0.isEmpty();
        int i4 = queue_iterable_obj0.size();
        try {
            java.lang.Iterable<java.lang.Object> iterable_obj5 = queue_iterable_obj0.dequeue();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException");
        } catch (java.util.NoSuchElementException e) {
        }
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertNotNull(spliterator_iterable_obj2);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(i4 == 0);
    }

    @Test
    public void test450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test450");
        edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<edu.osu.cs362.Queue<java.io.Serializable>>>> queue_iterable_iterator_queue_serializable0 = new edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<edu.osu.cs362.Queue<java.io.Serializable>>>>();
        java.lang.String str1 = queue_iterable_iterator_queue_serializable0.toString();
        java.lang.String str2 = queue_iterable_iterator_queue_serializable0.toString();
        int i3 = queue_iterable_iterator_queue_serializable0.size();
        edu.osu.cs362.Queue<java.util.Iterator<edu.osu.cs362.Queue<java.io.Serializable>>> queue_iterator_queue_serializable4 = new edu.osu.cs362.Queue<java.util.Iterator<edu.osu.cs362.Queue<java.io.Serializable>>>();
        int i5 = queue_iterator_queue_serializable4.size();
        java.util.Iterator<java.util.Iterator<edu.osu.cs362.Queue<java.io.Serializable>>> iterator_iterator_queue_serializable6 = queue_iterator_queue_serializable4.iterator();
        boolean b7 = queue_iterator_queue_serializable4.isEmpty();
        boolean b8 = queue_iterator_queue_serializable4.isEmpty();
        java.util.Iterator<java.util.Iterator<edu.osu.cs362.Queue<java.io.Serializable>>> iterator_iterator_queue_serializable9 = queue_iterator_queue_serializable4.iterator();
        queue_iterable_iterator_queue_serializable0.enqueue((java.lang.Iterable<java.util.Iterator<edu.osu.cs362.Queue<java.io.Serializable>>>) queue_iterator_queue_serializable4);
        java.util.Spliterator<java.lang.Iterable<java.util.Iterator<edu.osu.cs362.Queue<java.io.Serializable>>>> spliterator_iterable_iterator_queue_serializable11 = queue_iterable_iterator_queue_serializable0.spliterator();
        java.lang.Iterable<java.util.Iterator<edu.osu.cs362.Queue<java.io.Serializable>>> iterable_iterator_queue_serializable12 = queue_iterable_iterator_queue_serializable0.dequeue();
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertNotNull(iterator_iterator_queue_serializable6);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertNotNull(iterator_iterator_queue_serializable9);
        org.junit.Assert.assertNotNull(spliterator_iterable_iterator_queue_serializable11);
        org.junit.Assert.assertNotNull(iterable_iterator_queue_serializable12);
    }

    @Test
    public void test451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test451");
        edu.osu.cs362.Queue<java.util.Spliterator<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>>> queue_spliterator_iterable_queue_iterable_queue_iterable_iterator_serializable0 = new edu.osu.cs362.Queue<java.util.Spliterator<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>>>();
        try {
            java.util.Spliterator<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>> spliterator_iterable_queue_iterable_queue_iterable_iterator_serializable1 = queue_spliterator_iterable_queue_iterable_queue_iterable_iterator_serializable0.dequeue();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException");
        } catch (java.util.NoSuchElementException e) {
        }
    }

    @Test
    public void test452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test452");
        edu.osu.cs362.Queue<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>> queue_iterable_queue_iterable_iterator_serializable0 = new edu.osu.cs362.Queue<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>();
        java.util.Spliterator<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>> spliterator_iterable_queue_iterable_iterator_serializable1 = queue_iterable_queue_iterable_iterator_serializable0.spliterator();
        java.util.Spliterator<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>> spliterator_iterable_queue_iterable_iterator_serializable2 = queue_iterable_queue_iterable_iterator_serializable0.spliterator();
        java.lang.String str3 = queue_iterable_queue_iterable_iterator_serializable0.toString();
        try {
            java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>> iterable_queue_iterable_iterator_serializable4 = queue_iterable_queue_iterable_iterator_serializable0.peek();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException");
        } catch (java.util.NoSuchElementException e) {
        }
        org.junit.Assert.assertNotNull(spliterator_iterable_queue_iterable_iterator_serializable1);
        org.junit.Assert.assertNotNull(spliterator_iterable_queue_iterable_iterator_serializable2);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
    }

    @Test
    public void test453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test453");
        edu.osu.cs362.Queue<java.util.Spliterator<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>> queue_spliterator_iterable_queue_iterable_iterator_serializable0 = new edu.osu.cs362.Queue<java.util.Spliterator<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>();
        edu.osu.cs362.Queue<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>> queue_iterable_queue_iterable_iterator_serializable1 = new edu.osu.cs362.Queue<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>();
        java.util.Spliterator<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>> spliterator_iterable_queue_iterable_iterator_serializable2 = queue_iterable_queue_iterable_iterator_serializable1.spliterator();
        queue_spliterator_iterable_queue_iterable_iterator_serializable0.enqueue(spliterator_iterable_queue_iterable_iterator_serializable2);
        java.lang.String str4 = queue_spliterator_iterable_queue_iterable_iterator_serializable0.toString();
        java.util.Iterator<java.util.Spliterator<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>> iterator_spliterator_iterable_queue_iterable_iterator_serializable5 = queue_spliterator_iterable_queue_iterable_iterator_serializable0.iterator();
        boolean b6 = queue_spliterator_iterable_queue_iterable_iterator_serializable0.isEmpty();
        java.util.Iterator<java.util.Spliterator<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>> iterator_spliterator_iterable_queue_iterable_iterator_serializable7 = queue_spliterator_iterable_queue_iterable_iterator_serializable0.iterator();
        org.junit.Assert.assertNotNull(spliterator_iterable_queue_iterable_iterator_serializable2);
        org.junit.Assert.assertNotNull(iterator_spliterator_iterable_queue_iterable_iterator_serializable5);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNotNull(iterator_spliterator_iterable_queue_iterable_iterator_serializable7);
    }

    @Test
    public void test454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test454");
        edu.osu.cs362.Queue<java.util.Spliterator<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>> queue_spliterator_iterable_queue_iterable_iterator_serializable0 = new edu.osu.cs362.Queue<java.util.Spliterator<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>();
        boolean b1 = queue_spliterator_iterable_queue_iterable_iterator_serializable0.isEmpty();
        boolean b2 = queue_spliterator_iterable_queue_iterable_iterator_serializable0.isEmpty();
        java.util.Spliterator<java.util.Spliterator<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>> spliterator_spliterator_iterable_queue_iterable_iterator_serializable3 = queue_spliterator_iterable_queue_iterable_iterator_serializable0.spliterator();
        try {
            java.util.Spliterator<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>> spliterator_iterable_queue_iterable_iterator_serializable4 = queue_spliterator_iterable_queue_iterable_iterator_serializable0.dequeue();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException");
        } catch (java.util.NoSuchElementException e) {
        }
        org.junit.Assert.assertTrue(b1 == true);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNotNull(spliterator_spliterator_iterable_queue_iterable_iterator_serializable3);
    }

    @Test
    public void test455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test455");
        edu.osu.cs362.Queue<java.util.Spliterator<java.util.Iterator<java.io.Serializable>>> queue_spliterator_iterator_serializable0 = new edu.osu.cs362.Queue<java.util.Spliterator<java.util.Iterator<java.io.Serializable>>>();
        java.lang.String str1 = queue_spliterator_iterator_serializable0.toString();
        java.util.Spliterator<java.util.Spliterator<java.util.Iterator<java.io.Serializable>>> spliterator_spliterator_iterator_serializable2 = queue_spliterator_iterator_serializable0.spliterator();
        edu.osu.cs362.Queue<java.util.Iterator<java.io.Serializable>> queue_iterator_serializable3 = new edu.osu.cs362.Queue<java.util.Iterator<java.io.Serializable>>();
        boolean b4 = queue_iterator_serializable3.isEmpty();
        edu.osu.cs362.Queue<java.io.Serializable> queue_serializable5 = new edu.osu.cs362.Queue<java.io.Serializable>();
        queue_serializable5.enqueue((java.io.Serializable) 1L);
        java.util.Iterator<java.io.Serializable> iterator_serializable8 = queue_serializable5.iterator();
        queue_iterator_serializable3.enqueue(iterator_serializable8);
        int i10 = queue_iterator_serializable3.size();
        java.util.Iterator<java.io.Serializable> iterator_serializable11 = queue_iterator_serializable3.peek();
        boolean b12 = queue_iterator_serializable3.isEmpty();
        java.util.Iterator<java.io.Serializable> iterator_serializable13 = queue_iterator_serializable3.peek();
        boolean b14 = queue_iterator_serializable3.isEmpty();
        java.util.Spliterator<java.util.Iterator<java.io.Serializable>> spliterator_iterator_serializable15 = queue_iterator_serializable3.spliterator();
        queue_spliterator_iterator_serializable0.enqueue(spliterator_iterator_serializable15);
        java.util.Iterator<java.util.Spliterator<java.util.Iterator<java.io.Serializable>>> iterator_spliterator_iterator_serializable17 = queue_spliterator_iterator_serializable0.iterator();
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertNotNull(spliterator_spliterator_iterator_serializable2);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertNotNull(iterator_serializable8);
        org.junit.Assert.assertTrue(i10 == 1);
        org.junit.Assert.assertNotNull(iterator_serializable11);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNotNull(iterator_serializable13);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNotNull(spliterator_iterator_serializable15);
        org.junit.Assert.assertNotNull(iterator_spliterator_iterator_serializable17);
    }

    @Test
    public void test456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test456");
        edu.osu.cs362.Queue<java.util.Iterator<edu.osu.cs362.Queue<java.io.Serializable>>> queue_iterator_queue_serializable0 = new edu.osu.cs362.Queue<java.util.Iterator<edu.osu.cs362.Queue<java.io.Serializable>>>();
        int i1 = queue_iterator_queue_serializable0.size();
        java.util.Iterator<java.util.Iterator<edu.osu.cs362.Queue<java.io.Serializable>>> iterator_iterator_queue_serializable2 = queue_iterator_queue_serializable0.iterator();
        boolean b3 = queue_iterator_queue_serializable0.isEmpty();
        boolean b4 = queue_iterator_queue_serializable0.isEmpty();
        java.util.Iterator<java.util.Iterator<edu.osu.cs362.Queue<java.io.Serializable>>> iterator_iterator_queue_serializable5 = queue_iterator_queue_serializable0.iterator();
        java.util.Iterator<java.util.Iterator<edu.osu.cs362.Queue<java.io.Serializable>>> iterator_iterator_queue_serializable6 = queue_iterator_queue_serializable0.iterator();
        java.lang.String str7 = queue_iterator_queue_serializable0.toString();
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertNotNull(iterator_iterator_queue_serializable2);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertNotNull(iterator_iterator_queue_serializable5);
        org.junit.Assert.assertNotNull(iterator_iterator_queue_serializable6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
    }

    @Test
    public void test457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test457");
        edu.osu.cs362.Queue<edu.osu.cs362.Queue<edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>>> queue_queue_queue_queue_iterable_queue_iterable_iterator_serializable0 = new edu.osu.cs362.Queue<edu.osu.cs362.Queue<edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>>>();
        edu.osu.cs362.Queue<edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>> queue_queue_queue_iterable_queue_iterable_iterator_serializable1 = new edu.osu.cs362.Queue<edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>>();
        java.util.Spliterator<edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>> spliterator_queue_queue_iterable_queue_iterable_iterator_serializable2 = queue_queue_queue_iterable_queue_iterable_iterator_serializable1.spliterator();
        java.util.Spliterator<edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>> spliterator_queue_queue_iterable_queue_iterable_iterator_serializable3 = queue_queue_queue_iterable_queue_iterable_iterator_serializable1.spliterator();
        queue_queue_queue_queue_iterable_queue_iterable_iterator_serializable0.enqueue(queue_queue_queue_iterable_queue_iterable_iterator_serializable1);
        try {
            edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>> queue_queue_iterable_queue_iterable_iterator_serializable5 = queue_queue_queue_iterable_queue_iterable_iterator_serializable1.peek();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException");
        } catch (java.util.NoSuchElementException e) {
        }
        org.junit.Assert.assertNotNull(spliterator_queue_queue_iterable_queue_iterable_iterator_serializable2);
        org.junit.Assert.assertNotNull(spliterator_queue_queue_iterable_queue_iterable_iterator_serializable3);
    }

    @Test
    public void test458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test458");
        edu.osu.cs362.Queue<java.util.Spliterator<java.lang.Iterable<java.lang.Iterable<java.util.Iterator<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>>>> queue_spliterator_iterable_iterable_iterator_iterable_queue_iterable_iterator_serializable0 = new edu.osu.cs362.Queue<java.util.Spliterator<java.lang.Iterable<java.lang.Iterable<java.util.Iterator<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>>>>();
        boolean b1 = queue_spliterator_iterable_iterable_iterator_iterable_queue_iterable_iterator_serializable0.isEmpty();
        java.util.Spliterator<java.util.Spliterator<java.lang.Iterable<java.lang.Iterable<java.util.Iterator<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>>>> spliterator_spliterator_iterable_iterable_iterator_iterable_queue_iterable_iterator_serializable2 = queue_spliterator_iterable_iterable_iterator_iterable_queue_iterable_iterator_serializable0.spliterator();
        boolean b3 = queue_spliterator_iterable_iterable_iterator_iterable_queue_iterable_iterator_serializable0.isEmpty();
        try {
            java.util.Spliterator<java.lang.Iterable<java.lang.Iterable<java.util.Iterator<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>>> spliterator_iterable_iterable_iterator_iterable_queue_iterable_iterator_serializable4 = queue_spliterator_iterable_iterable_iterator_iterable_queue_iterable_iterator_serializable0.dequeue();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException");
        } catch (java.util.NoSuchElementException e) {
        }
        org.junit.Assert.assertTrue(b1 == true);
        org.junit.Assert.assertNotNull(spliterator_spliterator_iterable_iterable_iterator_iterable_queue_iterable_iterator_serializable2);
        org.junit.Assert.assertTrue(b3 == true);
    }

    @Test
    public void test459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test459");
        edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<edu.osu.cs362.Queue<java.io.Serializable>>>> queue_iterable_iterator_queue_serializable0 = new edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<edu.osu.cs362.Queue<java.io.Serializable>>>>();
        java.lang.String str1 = queue_iterable_iterator_queue_serializable0.toString();
        java.lang.String str2 = queue_iterable_iterator_queue_serializable0.toString();
        int i3 = queue_iterable_iterator_queue_serializable0.size();
        java.util.Spliterator<java.lang.Iterable<java.util.Iterator<edu.osu.cs362.Queue<java.io.Serializable>>>> spliterator_iterable_iterator_queue_serializable4 = queue_iterable_iterator_queue_serializable0.spliterator();
        try {
            java.lang.Iterable<java.util.Iterator<edu.osu.cs362.Queue<java.io.Serializable>>> iterable_iterator_queue_serializable5 = queue_iterable_iterator_queue_serializable0.dequeue();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException");
        } catch (java.util.NoSuchElementException e) {
        }
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertNotNull(spliterator_iterable_iterator_queue_serializable4);
    }

    @Test
    public void test460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test460");
        edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.util.Spliterator<java.lang.Iterable<java.util.Iterator<java.lang.Object>>>>> queue_queue_spliterator_iterable_iterator_obj0 = new edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.util.Spliterator<java.lang.Iterable<java.util.Iterator<java.lang.Object>>>>>();
        try {
            edu.osu.cs362.Queue<java.util.Spliterator<java.lang.Iterable<java.util.Iterator<java.lang.Object>>>> queue_spliterator_iterable_iterator_obj1 = queue_queue_spliterator_iterable_iterator_obj0.peek();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException");
        } catch (java.util.NoSuchElementException e) {
        }
    }

    @Test
    public void test461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test461");
        edu.osu.cs362.Queue<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>> queue_iterable_queue_iterable_iterator_serializable0 = new edu.osu.cs362.Queue<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>();
        int i1 = queue_iterable_queue_iterable_iterator_serializable0.size();
        org.junit.Assert.assertTrue(i1 == 0);
    }

    @Test
    public void test462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test462");
        edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.util.Iterator<edu.osu.cs362.Queue<java.io.Serializable>>>> queue_queue_iterator_queue_serializable0 = new edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.util.Iterator<edu.osu.cs362.Queue<java.io.Serializable>>>>();
        java.util.Spliterator<edu.osu.cs362.Queue<java.util.Iterator<edu.osu.cs362.Queue<java.io.Serializable>>>> spliterator_queue_iterator_queue_serializable1 = queue_queue_iterator_queue_serializable0.spliterator();
        edu.osu.cs362.Queue<java.util.Iterator<edu.osu.cs362.Queue<java.io.Serializable>>> queue_iterator_queue_serializable2 = new edu.osu.cs362.Queue<java.util.Iterator<edu.osu.cs362.Queue<java.io.Serializable>>>();
        int i3 = queue_iterator_queue_serializable2.size();
        java.util.Iterator<java.util.Iterator<edu.osu.cs362.Queue<java.io.Serializable>>> iterator_iterator_queue_serializable4 = queue_iterator_queue_serializable2.iterator();
        edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.io.Serializable>> queue_queue_serializable5 = new edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.io.Serializable>>();
        java.util.Spliterator<edu.osu.cs362.Queue<java.io.Serializable>> spliterator_queue_serializable6 = queue_queue_serializable5.spliterator();
        java.util.Iterator<edu.osu.cs362.Queue<java.io.Serializable>> iterator_queue_serializable7 = queue_queue_serializable5.iterator();
        queue_iterator_queue_serializable2.enqueue(iterator_queue_serializable7);
        java.lang.String str9 = queue_iterator_queue_serializable2.toString();
        boolean b10 = queue_iterator_queue_serializable2.isEmpty();
        queue_queue_iterator_queue_serializable0.enqueue(queue_iterator_queue_serializable2);
        edu.osu.cs362.Queue<java.util.Iterator<edu.osu.cs362.Queue<java.io.Serializable>>> queue_iterator_queue_serializable12 = queue_queue_iterator_queue_serializable0.dequeue();
        try {
            edu.osu.cs362.Queue<java.util.Iterator<edu.osu.cs362.Queue<java.io.Serializable>>> queue_iterator_queue_serializable13 = queue_queue_iterator_queue_serializable0.peek();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException");
        } catch (java.util.NoSuchElementException e) {
        }
        org.junit.Assert.assertNotNull(spliterator_queue_iterator_queue_serializable1);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertNotNull(iterator_iterator_queue_serializable4);
        org.junit.Assert.assertNotNull(spliterator_queue_serializable6);
        org.junit.Assert.assertNotNull(iterator_queue_serializable7);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertNotNull(queue_iterator_queue_serializable12);
    }

    @Test
    public void test463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test463");
        edu.osu.cs362.Queue<edu.osu.cs362.Queue<edu.osu.cs362.Queue<edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>>>> queue_queue_queue_queue_queue_iterable_queue_iterable_iterator_serializable0 = new edu.osu.cs362.Queue<edu.osu.cs362.Queue<edu.osu.cs362.Queue<edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>>>>();
        java.lang.String str1 = queue_queue_queue_queue_queue_iterable_queue_iterable_iterator_serializable0.toString();
        edu.osu.cs362.Queue<java.lang.Iterable<edu.osu.cs362.Queue<edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>>>> queue_iterable_queue_queue_queue_iterable_queue_iterable_iterator_serializable2 = new edu.osu.cs362.Queue<java.lang.Iterable<edu.osu.cs362.Queue<edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>>>>();
        edu.osu.cs362.Queue<edu.osu.cs362.Queue<edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>>> queue_queue_queue_queue_iterable_queue_iterable_iterator_serializable3 = new edu.osu.cs362.Queue<edu.osu.cs362.Queue<edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>>>();
        queue_iterable_queue_queue_queue_iterable_queue_iterable_iterator_serializable2.enqueue((java.lang.Iterable<edu.osu.cs362.Queue<edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>>>) queue_queue_queue_queue_iterable_queue_iterable_iterator_serializable3);
        edu.osu.cs362.Queue<edu.osu.cs362.Queue<edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>>> queue_queue_queue_queue_iterable_queue_iterable_iterator_serializable5 = new edu.osu.cs362.Queue<edu.osu.cs362.Queue<edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>>>();
        edu.osu.cs362.Queue<edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>> queue_queue_queue_iterable_queue_iterable_iterator_serializable6 = new edu.osu.cs362.Queue<edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>>();
        java.util.Spliterator<edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>> spliterator_queue_queue_iterable_queue_iterable_iterator_serializable7 = queue_queue_queue_iterable_queue_iterable_iterator_serializable6.spliterator();
        java.util.Spliterator<edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>> spliterator_queue_queue_iterable_queue_iterable_iterator_serializable8 = queue_queue_queue_iterable_queue_iterable_iterator_serializable6.spliterator();
        queue_queue_queue_queue_iterable_queue_iterable_iterator_serializable5.enqueue(queue_queue_queue_iterable_queue_iterable_iterator_serializable6);
        queue_queue_queue_queue_iterable_queue_iterable_iterator_serializable3.enqueue(queue_queue_queue_iterable_queue_iterable_iterator_serializable6);
        queue_queue_queue_queue_queue_iterable_queue_iterable_iterator_serializable0.enqueue(queue_queue_queue_queue_iterable_queue_iterable_iterator_serializable3);
        java.lang.String str12 = queue_queue_queue_queue_queue_iterable_queue_iterable_iterator_serializable0.toString();
        boolean b13 = queue_queue_queue_queue_queue_iterable_queue_iterable_iterator_serializable0.isEmpty();
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertNotNull(spliterator_queue_queue_iterable_queue_iterable_iterator_serializable7);
        org.junit.Assert.assertNotNull(spliterator_queue_queue_iterable_queue_iterable_iterator_serializable8);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "  " + "'", str12.equals("  "));
        org.junit.Assert.assertTrue(b13 == false);
    }

    @Test
    public void test464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test464");
        edu.osu.cs362.Queue<java.io.Serializable> queue_serializable0 = new edu.osu.cs362.Queue<java.io.Serializable>();
        queue_serializable0.enqueue((java.io.Serializable) 1L);
        java.io.Serializable serializable3 = queue_serializable0.peek();
        java.util.Iterator<java.io.Serializable> iterator_serializable4 = queue_serializable0.iterator();
        java.util.Iterator<java.io.Serializable> iterator_serializable5 = queue_serializable0.iterator();
        boolean b6 = queue_serializable0.isEmpty();
        java.util.Spliterator<java.io.Serializable> spliterator_serializable7 = queue_serializable0.spliterator();
        org.junit.Assert.assertTrue("'" + serializable3 + "' != '" + 1L + "'", serializable3.equals(1L));
        org.junit.Assert.assertNotNull(iterator_serializable4);
        org.junit.Assert.assertNotNull(iterator_serializable5);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNotNull(spliterator_serializable7);
    }

    @Test
    public void test465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test465");
        edu.osu.cs362.Queue<java.util.Spliterator<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>>> queue_spliterator_iterable_queue_iterable_queue_iterable_iterator_serializable0 = new edu.osu.cs362.Queue<java.util.Spliterator<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>>>();
        java.util.Spliterator<java.util.Spliterator<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>>> spliterator_spliterator_iterable_queue_iterable_queue_iterable_iterator_serializable1 = queue_spliterator_iterable_queue_iterable_queue_iterable_iterator_serializable0.spliterator();
        try {
            java.util.Spliterator<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>> spliterator_iterable_queue_iterable_queue_iterable_iterator_serializable2 = queue_spliterator_iterable_queue_iterable_queue_iterable_iterator_serializable0.peek();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException");
        } catch (java.util.NoSuchElementException e) {
        }
        org.junit.Assert.assertNotNull(spliterator_spliterator_iterable_queue_iterable_queue_iterable_iterator_serializable1);
    }

    @Test
    public void test466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test466");
        edu.osu.cs362.Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new edu.osu.cs362.Queue<java.lang.Comparable<java.lang.String>>();
        boolean b1 = queue_comparable_str0.isEmpty();
        java.util.Spliterator<java.lang.Comparable<java.lang.String>> spliterator_comparable_str2 = queue_comparable_str0.spliterator();
        org.junit.Assert.assertTrue(b1 == true);
        org.junit.Assert.assertNotNull(spliterator_comparable_str2);
    }

    @Test
    public void test467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test467");
        edu.osu.cs362.Queue<java.util.Spliterator<java.lang.Iterable<java.util.Iterator<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>>> queue_spliterator_iterable_iterator_iterable_queue_iterable_iterator_serializable0 = new edu.osu.cs362.Queue<java.util.Spliterator<java.lang.Iterable<java.util.Iterator<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>>>();
        int i1 = queue_spliterator_iterable_iterator_iterable_queue_iterable_iterator_serializable0.size();
        edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>> queue_iterable_iterator_iterable_queue_iterable_iterator_serializable2 = new edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>>();
        java.util.Spliterator<java.lang.Iterable<java.util.Iterator<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>> spliterator_iterable_iterator_iterable_queue_iterable_iterator_serializable3 = queue_iterable_iterator_iterable_queue_iterable_iterator_serializable2.spliterator();
        queue_spliterator_iterable_iterator_iterable_queue_iterable_iterator_serializable0.enqueue(spliterator_iterable_iterator_iterable_queue_iterable_iterator_serializable3);
        java.util.Spliterator<java.lang.Iterable<java.util.Iterator<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>> spliterator_iterable_iterator_iterable_queue_iterable_iterator_serializable5 = queue_spliterator_iterable_iterator_iterable_queue_iterable_iterator_serializable0.peek();
        java.util.Spliterator<java.lang.Iterable<java.util.Iterator<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>> spliterator_iterable_iterator_iterable_queue_iterable_iterator_serializable6 = queue_spliterator_iterable_iterator_iterable_queue_iterable_iterator_serializable0.dequeue();
        java.util.Iterator<java.util.Spliterator<java.lang.Iterable<java.util.Iterator<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>>> iterator_spliterator_iterable_iterator_iterable_queue_iterable_iterator_serializable7 = queue_spliterator_iterable_iterator_iterable_queue_iterable_iterator_serializable0.iterator();
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertNotNull(spliterator_iterable_iterator_iterable_queue_iterable_iterator_serializable3);
        org.junit.Assert.assertNotNull(spliterator_iterable_iterator_iterable_queue_iterable_iterator_serializable5);
        org.junit.Assert.assertNotNull(spliterator_iterable_iterator_iterable_queue_iterable_iterator_serializable6);
        org.junit.Assert.assertNotNull(iterator_spliterator_iterable_iterator_iterable_queue_iterable_iterator_serializable7);
    }

    @Test
    public void test468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test468");
        edu.osu.cs362.Queue<java.util.Iterator<java.util.Iterator<java.lang.Object>>> queue_iterator_iterator_obj0 = new edu.osu.cs362.Queue<java.util.Iterator<java.util.Iterator<java.lang.Object>>>();
        java.util.Iterator<java.util.Iterator<java.util.Iterator<java.lang.Object>>> iterator_iterator_iterator_obj1 = queue_iterator_iterator_obj0.iterator();
        boolean b2 = queue_iterator_iterator_obj0.isEmpty();
        java.lang.String str3 = queue_iterator_iterator_obj0.toString();
        edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.lang.Object>>> queue_iterable_iterator_obj4 = new edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.lang.Object>>>();
        edu.osu.cs362.Queue<java.util.Iterator<java.lang.Object>> queue_iterator_obj5 = new edu.osu.cs362.Queue<java.util.Iterator<java.lang.Object>>();
        queue_iterable_iterator_obj4.enqueue((java.lang.Iterable<java.util.Iterator<java.lang.Object>>) queue_iterator_obj5);
        java.lang.String str7 = queue_iterator_obj5.toString();
        java.util.Iterator<java.util.Iterator<java.lang.Object>> iterator_iterator_obj8 = queue_iterator_obj5.iterator();
        queue_iterator_iterator_obj0.enqueue(iterator_iterator_obj8);
        edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.lang.Object>>> queue_iterable_iterator_obj10 = new edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.lang.Object>>>();
        edu.osu.cs362.Queue<java.util.Iterator<java.lang.Object>> queue_iterator_obj11 = new edu.osu.cs362.Queue<java.util.Iterator<java.lang.Object>>();
        queue_iterable_iterator_obj10.enqueue((java.lang.Iterable<java.util.Iterator<java.lang.Object>>) queue_iterator_obj11);
        java.util.Iterator<java.util.Iterator<java.lang.Object>> iterator_iterator_obj13 = queue_iterator_obj11.iterator();
        queue_iterator_iterator_obj0.enqueue(iterator_iterator_obj13);
        int i15 = queue_iterator_iterator_obj0.size();
        org.junit.Assert.assertNotNull(iterator_iterator_iterator_obj1);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertNotNull(iterator_iterator_obj8);
        org.junit.Assert.assertNotNull(iterator_iterator_obj13);
        org.junit.Assert.assertTrue(i15 == 2);
    }

    @Test
    public void test469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test469");
        edu.osu.cs362.Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new edu.osu.cs362.Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.enqueue((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str3 = queue_comparable_str0.toString();
        int i4 = queue_comparable_str0.size();
        int i5 = queue_comparable_str0.size();
        int i6 = queue_comparable_str0.size();
        java.lang.String str7 = queue_comparable_str0.toString();
        boolean b8 = queue_comparable_str0.isEmpty();
        java.lang.Comparable<java.lang.String> comparable_str9 = queue_comparable_str0.peek();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi! " + "'", str3.equals("hi! "));
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertTrue(i5 == 1);
        org.junit.Assert.assertTrue(i6 == 1);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "hi! " + "'", str7.equals("hi! "));
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue("'" + comparable_str9 + "' != '" + "hi!" + "'", comparable_str9.equals("hi!"));
    }

    @Test
    public void test470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test470");
        edu.osu.cs362.Queue<java.util.Spliterator<java.lang.Iterable<java.util.Iterator<java.lang.Object>>>> queue_spliterator_iterable_iterator_obj0 = new edu.osu.cs362.Queue<java.util.Spliterator<java.lang.Iterable<java.util.Iterator<java.lang.Object>>>>();
        int i1 = queue_spliterator_iterable_iterator_obj0.size();
        java.util.Iterator<java.util.Spliterator<java.lang.Iterable<java.util.Iterator<java.lang.Object>>>> iterator_spliterator_iterable_iterator_obj2 = queue_spliterator_iterable_iterator_obj0.iterator();
        java.util.Iterator<java.util.Spliterator<java.lang.Iterable<java.util.Iterator<java.lang.Object>>>> iterator_spliterator_iterable_iterator_obj3 = queue_spliterator_iterable_iterator_obj0.iterator();
        try {
            java.util.Spliterator<java.lang.Iterable<java.util.Iterator<java.lang.Object>>> spliterator_iterable_iterator_obj4 = queue_spliterator_iterable_iterator_obj0.peek();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException");
        } catch (java.util.NoSuchElementException e) {
        }
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertNotNull(iterator_spliterator_iterable_iterator_obj2);
        org.junit.Assert.assertNotNull(iterator_spliterator_iterable_iterator_obj3);
    }

    @Test
    public void test471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test471");
        edu.osu.cs362.Queue<java.lang.Iterable<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>> queue_iterable_iterable_iterator_serializable0 = new edu.osu.cs362.Queue<java.lang.Iterable<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>();
        boolean b1 = queue_iterable_iterable_iterator_serializable0.isEmpty();
        java.util.Spliterator<java.lang.Iterable<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>> spliterator_iterable_iterable_iterator_serializable2 = queue_iterable_iterable_iterator_serializable0.spliterator();
        boolean b3 = queue_iterable_iterable_iterator_serializable0.isEmpty();
        java.lang.String str4 = queue_iterable_iterable_iterator_serializable0.toString();
        try {
            java.lang.Iterable<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>> iterable_iterable_iterator_serializable5 = queue_iterable_iterable_iterator_serializable0.dequeue();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException");
        } catch (java.util.NoSuchElementException e) {
        }
        org.junit.Assert.assertTrue(b1 == true);
        org.junit.Assert.assertNotNull(spliterator_iterable_iterable_iterator_serializable2);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
    }

    @Test
    public void test472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test472");
        edu.osu.cs362.Queue<java.util.Iterator<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>> queue_iterator_iterable_iterator_serializable0 = new edu.osu.cs362.Queue<java.util.Iterator<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>();
        try {
            java.util.Iterator<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>> iterator_iterable_iterator_serializable1 = queue_iterator_iterable_iterator_serializable0.dequeue();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException");
        } catch (java.util.NoSuchElementException e) {
        }
    }

    @Test
    public void test473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test473");
        edu.osu.cs362.Queue<java.util.Iterator<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>> queue_iterator_iterable_iterator_serializable0 = new edu.osu.cs362.Queue<java.util.Iterator<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>();
        boolean b1 = queue_iterator_iterable_iterator_serializable0.isEmpty();
        java.lang.String str2 = queue_iterator_iterable_iterator_serializable0.toString();
        java.util.Iterator<java.util.Iterator<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>> iterator_iterator_iterable_iterator_serializable3 = queue_iterator_iterable_iterator_serializable0.iterator();
        try {
            java.util.Iterator<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>> iterator_iterable_iterator_serializable4 = queue_iterator_iterable_iterator_serializable0.dequeue();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException");
        } catch (java.util.NoSuchElementException e) {
        }
        org.junit.Assert.assertTrue(b1 == true);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
        org.junit.Assert.assertNotNull(iterator_iterator_iterable_iterator_serializable3);
    }

    @Test
    public void test474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test474");
        edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.util.Spliterator<java.io.Serializable>>> queue_queue_spliterator_serializable0 = new edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.util.Spliterator<java.io.Serializable>>>();
        java.util.Iterator<edu.osu.cs362.Queue<java.util.Spliterator<java.io.Serializable>>> iterator_queue_spliterator_serializable1 = queue_queue_spliterator_serializable0.iterator();
        edu.osu.cs362.Queue<java.util.Spliterator<java.io.Serializable>> queue_spliterator_serializable2 = new edu.osu.cs362.Queue<java.util.Spliterator<java.io.Serializable>>();
        java.util.Iterator<java.util.Spliterator<java.io.Serializable>> iterator_spliterator_serializable3 = queue_spliterator_serializable2.iterator();
        java.util.Spliterator<java.util.Spliterator<java.io.Serializable>> spliterator_spliterator_serializable4 = queue_spliterator_serializable2.spliterator();
        queue_queue_spliterator_serializable0.enqueue(queue_spliterator_serializable2);
        java.util.Iterator<edu.osu.cs362.Queue<java.util.Spliterator<java.io.Serializable>>> iterator_queue_spliterator_serializable6 = queue_queue_spliterator_serializable0.iterator();
        org.junit.Assert.assertNotNull(iterator_queue_spliterator_serializable1);
        org.junit.Assert.assertNotNull(iterator_spliterator_serializable3);
        org.junit.Assert.assertNotNull(spliterator_spliterator_serializable4);
        org.junit.Assert.assertNotNull(iterator_queue_spliterator_serializable6);
    }

    @Test
    public void test475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test475");
        edu.osu.cs362.Queue<java.util.Spliterator<java.io.Serializable>> queue_spliterator_serializable0 = new edu.osu.cs362.Queue<java.util.Spliterator<java.io.Serializable>>();
        java.util.Spliterator<java.util.Spliterator<java.io.Serializable>> spliterator_spliterator_serializable1 = queue_spliterator_serializable0.spliterator();
        try {
            java.util.Spliterator<java.io.Serializable> spliterator_serializable2 = queue_spliterator_serializable0.peek();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException");
        } catch (java.util.NoSuchElementException e) {
        }
        org.junit.Assert.assertNotNull(spliterator_spliterator_serializable1);
    }

    @Test
    public void test476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test476");
        edu.osu.cs362.Queue<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>> queue_iterable_queue_iterable_iterator_serializable0 = new edu.osu.cs362.Queue<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>();
        java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>> iterable_queue_iterable_iterator_serializable1 = null;
        queue_iterable_queue_iterable_iterator_serializable0.enqueue(iterable_queue_iterable_iterator_serializable1);
        java.util.Iterator<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>> iterator_iterable_queue_iterable_iterator_serializable3 = queue_iterable_queue_iterable_iterator_serializable0.iterator();
        int i4 = queue_iterable_queue_iterable_iterator_serializable0.size();
        java.lang.String str5 = queue_iterable_queue_iterable_iterator_serializable0.toString();
        java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>> iterable_queue_iterable_iterator_serializable6 = queue_iterable_queue_iterable_iterator_serializable0.dequeue();
        java.util.Iterator<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>> iterator_iterable_queue_iterable_iterator_serializable7 = queue_iterable_queue_iterable_iterator_serializable0.iterator();
        java.lang.String str8 = queue_iterable_queue_iterable_iterator_serializable0.toString();
        try {
            java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>> iterable_queue_iterable_iterator_serializable9 = queue_iterable_queue_iterable_iterator_serializable0.peek();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException");
        } catch (java.util.NoSuchElementException e) {
        }
        org.junit.Assert.assertNotNull(iterator_iterable_queue_iterable_iterator_serializable3);
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "null " + "'", str5.equals("null "));
        org.junit.Assert.assertNull(iterable_queue_iterable_iterator_serializable6);
        org.junit.Assert.assertNotNull(iterator_iterable_queue_iterable_iterator_serializable7);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void test477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test477");
        edu.osu.cs362.Queue<java.util.Iterator<java.lang.Object>> queue_iterator_obj0 = new edu.osu.cs362.Queue<java.util.Iterator<java.lang.Object>>();
        int i1 = queue_iterator_obj0.size();
        int i2 = queue_iterator_obj0.size();
        java.util.Iterator<java.util.Iterator<java.lang.Object>> iterator_iterator_obj3 = queue_iterator_obj0.iterator();
        int i4 = queue_iterator_obj0.size();
        boolean b5 = queue_iterator_obj0.isEmpty();
        java.util.Spliterator<java.util.Iterator<java.lang.Object>> spliterator_iterator_obj6 = queue_iterator_obj0.spliterator();
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNotNull(iterator_iterator_obj3);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertNotNull(spliterator_iterator_obj6);
    }

    @Test
    public void test478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test478");
        edu.osu.cs362.Queue<java.lang.Iterable<java.util.Spliterator<java.util.Iterator<java.io.Serializable>>>> queue_iterable_spliterator_iterator_serializable0 = new edu.osu.cs362.Queue<java.lang.Iterable<java.util.Spliterator<java.util.Iterator<java.io.Serializable>>>>();
        java.util.Iterator<java.lang.Iterable<java.util.Spliterator<java.util.Iterator<java.io.Serializable>>>> iterator_iterable_spliterator_iterator_serializable1 = queue_iterable_spliterator_iterator_serializable0.iterator();
        edu.osu.cs362.Queue<java.util.Spliterator<java.util.Iterator<java.io.Serializable>>> queue_spliterator_iterator_serializable2 = new edu.osu.cs362.Queue<java.util.Spliterator<java.util.Iterator<java.io.Serializable>>>();
        java.lang.String str3 = queue_spliterator_iterator_serializable2.toString();
        java.util.Spliterator<java.util.Spliterator<java.util.Iterator<java.io.Serializable>>> spliterator_spliterator_iterator_serializable4 = queue_spliterator_iterator_serializable2.spliterator();
        queue_iterable_spliterator_iterator_serializable0.enqueue((java.lang.Iterable<java.util.Spliterator<java.util.Iterator<java.io.Serializable>>>) queue_spliterator_iterator_serializable2);
        try {
            java.util.Spliterator<java.util.Iterator<java.io.Serializable>> spliterator_iterator_serializable6 = queue_spliterator_iterator_serializable2.peek();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException");
        } catch (java.util.NoSuchElementException e) {
        }
        org.junit.Assert.assertNotNull(iterator_iterable_spliterator_iterator_serializable1);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertNotNull(spliterator_spliterator_iterator_serializable4);
    }

    @Test
    public void test479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test479");
        edu.osu.cs362.Queue<java.util.Iterator<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>>> queue_iterator_iterable_queue_iterable_queue_iterable_iterator_serializable0 = new edu.osu.cs362.Queue<java.util.Iterator<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>>>();
        try {
            java.util.Iterator<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>> iterator_iterable_queue_iterable_queue_iterable_iterator_serializable1 = queue_iterator_iterable_queue_iterable_queue_iterable_iterator_serializable0.peek();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException");
        } catch (java.util.NoSuchElementException e) {
        }
    }

    @Test
    public void test480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test480");
        edu.osu.cs362.Queue<java.util.Spliterator<java.lang.Iterable<java.util.Iterator<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>>> queue_spliterator_iterable_iterator_iterable_queue_iterable_iterator_serializable0 = new edu.osu.cs362.Queue<java.util.Spliterator<java.lang.Iterable<java.util.Iterator<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>>>();
        int i1 = queue_spliterator_iterable_iterator_iterable_queue_iterable_iterator_serializable0.size();
        int i2 = queue_spliterator_iterable_iterator_iterable_queue_iterable_iterator_serializable0.size();
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
    }

    @Test
    public void test481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test481");
        edu.osu.cs362.Queue<edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.lang.Comparable<java.lang.String>>>> queue_queue_queue_comparable_str0 = new edu.osu.cs362.Queue<edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.lang.Comparable<java.lang.String>>>>();
        edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.lang.Comparable<java.lang.String>>> queue_queue_comparable_str1 = new edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.lang.Comparable<java.lang.String>>>();
        edu.osu.cs362.Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str2 = new edu.osu.cs362.Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str2.enqueue((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str5 = queue_comparable_str2.dequeue();
        queue_queue_comparable_str1.enqueue(queue_comparable_str2);
        queue_queue_queue_comparable_str0.enqueue(queue_queue_comparable_str1);
        edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.lang.Comparable<java.lang.String>>> queue_queue_comparable_str8 = queue_queue_queue_comparable_str0.peek();
        edu.osu.cs362.Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str9 = queue_queue_comparable_str8.dequeue();
        java.util.Iterator<edu.osu.cs362.Queue<java.lang.Comparable<java.lang.String>>> iterator_queue_comparable_str10 = queue_queue_comparable_str8.iterator();
        org.junit.Assert.assertTrue("'" + comparable_str5 + "' != '" + "hi!" + "'", comparable_str5.equals("hi!"));
        org.junit.Assert.assertNotNull(queue_queue_comparable_str8);
        org.junit.Assert.assertNotNull(queue_comparable_str9);
        org.junit.Assert.assertNotNull(iterator_queue_comparable_str10);
    }

    @Test
    public void test482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test482");
        edu.osu.cs362.Queue<java.util.Spliterator<java.lang.Iterable<java.util.Iterator<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>>> queue_spliterator_iterable_iterator_iterable_queue_iterable_iterator_serializable0 = new edu.osu.cs362.Queue<java.util.Spliterator<java.lang.Iterable<java.util.Iterator<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>>>();
        int i1 = queue_spliterator_iterable_iterator_iterable_queue_iterable_iterator_serializable0.size();
        boolean b2 = queue_spliterator_iterable_iterator_iterable_queue_iterable_iterator_serializable0.isEmpty();
        boolean b3 = queue_spliterator_iterable_iterator_iterable_queue_iterable_iterator_serializable0.isEmpty();
        int i4 = queue_spliterator_iterable_iterator_iterable_queue_iterable_iterator_serializable0.size();
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(i4 == 0);
    }

    @Test
    public void test483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test483");
        edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>> queue_iterable_iterator_iterable_iterator_serializable0 = new edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>();
        try {
            java.lang.Iterable<java.util.Iterator<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>> iterable_iterator_iterable_iterator_serializable1 = queue_iterable_iterator_iterable_iterator_serializable0.peek();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException");
        } catch (java.util.NoSuchElementException e) {
        }
    }

    @Test
    public void test484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test484");
        edu.osu.cs362.Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str0 = new edu.osu.cs362.Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str0.enqueue((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.String str3 = queue_comparable_str0.toString();
        int i4 = queue_comparable_str0.size();
        java.lang.String str5 = queue_comparable_str0.toString();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi! " + "'", str3.equals("hi! "));
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "hi! " + "'", str5.equals("hi! "));
    }

    @Test
    public void test485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test485");
        edu.osu.cs362.Queue<java.lang.Iterable<java.lang.Object>> queue_iterable_obj0 = new edu.osu.cs362.Queue<java.lang.Iterable<java.lang.Object>>();
        edu.osu.cs362.Queue<java.lang.Object> queue_obj1 = new edu.osu.cs362.Queue<java.lang.Object>();
        int i2 = queue_obj1.size();
        java.util.Spliterator<java.lang.Object> spliterator_obj3 = queue_obj1.spliterator();
        edu.osu.cs362.Queue<java.util.Iterator<java.io.Serializable>> queue_iterator_serializable4 = new edu.osu.cs362.Queue<java.util.Iterator<java.io.Serializable>>();
        boolean b5 = queue_iterator_serializable4.isEmpty();
        edu.osu.cs362.Queue<java.io.Serializable> queue_serializable6 = new edu.osu.cs362.Queue<java.io.Serializable>();
        queue_serializable6.enqueue((java.io.Serializable) 1L);
        java.util.Iterator<java.io.Serializable> iterator_serializable9 = queue_serializable6.iterator();
        queue_iterator_serializable4.enqueue(iterator_serializable9);
        int i11 = queue_iterator_serializable4.size();
        java.util.Iterator<java.io.Serializable> iterator_serializable12 = queue_iterator_serializable4.peek();
        boolean b13 = queue_iterator_serializable4.isEmpty();
        java.util.Iterator<java.io.Serializable> iterator_serializable14 = queue_iterator_serializable4.peek();
        queue_obj1.enqueue((java.lang.Object) queue_iterator_serializable4);
        queue_iterable_obj0.enqueue((java.lang.Iterable<java.lang.Object>) queue_obj1);
        edu.osu.cs362.Queue<java.lang.Object> queue_obj17 = new edu.osu.cs362.Queue<java.lang.Object>();
        int i18 = queue_obj17.size();
        java.util.Spliterator<java.lang.Object> spliterator_obj19 = queue_obj17.spliterator();
        edu.osu.cs362.Queue<java.util.Iterator<java.io.Serializable>> queue_iterator_serializable20 = new edu.osu.cs362.Queue<java.util.Iterator<java.io.Serializable>>();
        boolean b21 = queue_iterator_serializable20.isEmpty();
        edu.osu.cs362.Queue<java.io.Serializable> queue_serializable22 = new edu.osu.cs362.Queue<java.io.Serializable>();
        queue_serializable22.enqueue((java.io.Serializable) 1L);
        java.util.Iterator<java.io.Serializable> iterator_serializable25 = queue_serializable22.iterator();
        queue_iterator_serializable20.enqueue(iterator_serializable25);
        int i27 = queue_iterator_serializable20.size();
        java.util.Iterator<java.io.Serializable> iterator_serializable28 = queue_iterator_serializable20.peek();
        boolean b29 = queue_iterator_serializable20.isEmpty();
        java.util.Iterator<java.io.Serializable> iterator_serializable30 = queue_iterator_serializable20.peek();
        queue_obj17.enqueue((java.lang.Object) queue_iterator_serializable20);
        java.lang.String str32 = queue_obj17.toString();
        queue_iterable_obj0.enqueue((java.lang.Iterable<java.lang.Object>) queue_obj17);
        java.lang.String str34 = queue_iterable_obj0.toString();
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNotNull(spliterator_obj3);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertNotNull(iterator_serializable9);
        org.junit.Assert.assertTrue(i11 == 1);
        org.junit.Assert.assertNotNull(iterator_serializable12);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNotNull(iterator_serializable14);
        org.junit.Assert.assertTrue(i18 == 0);
        org.junit.Assert.assertNotNull(spliterator_obj19);
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertNotNull(iterator_serializable25);
        org.junit.Assert.assertTrue(i27 == 1);
        org.junit.Assert.assertNotNull(iterator_serializable28);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertNotNull(iterator_serializable30);
    }

    @Test
    public void test486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test486");
        edu.osu.cs362.Queue<java.util.Spliterator<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>> queue_spliterator_iterable_queue_iterable_iterator_serializable0 = new edu.osu.cs362.Queue<java.util.Spliterator<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>();
        edu.osu.cs362.Queue<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>> queue_iterable_queue_iterable_iterator_serializable1 = new edu.osu.cs362.Queue<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>();
        java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>> iterable_queue_iterable_iterator_serializable2 = null;
        queue_iterable_queue_iterable_iterator_serializable1.enqueue(iterable_queue_iterable_iterator_serializable2);
        java.util.Iterator<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>> iterator_iterable_queue_iterable_iterator_serializable4 = queue_iterable_queue_iterable_iterator_serializable1.iterator();
        int i5 = queue_iterable_queue_iterable_iterator_serializable1.size();
        java.lang.String str6 = queue_iterable_queue_iterable_iterator_serializable1.toString();
        java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>> iterable_queue_iterable_iterator_serializable7 = queue_iterable_queue_iterable_iterator_serializable1.dequeue();
        java.util.Iterator<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>> iterator_iterable_queue_iterable_iterator_serializable8 = queue_iterable_queue_iterable_iterator_serializable1.iterator();
        java.util.Spliterator<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>> spliterator_iterable_queue_iterable_iterator_serializable9 = queue_iterable_queue_iterable_iterator_serializable1.spliterator();
        queue_spliterator_iterable_queue_iterable_iterator_serializable0.enqueue(spliterator_iterable_queue_iterable_iterator_serializable9);
        java.util.Iterator<java.util.Spliterator<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>> iterator_spliterator_iterable_queue_iterable_iterator_serializable11 = queue_spliterator_iterable_queue_iterable_iterator_serializable0.iterator();
        org.junit.Assert.assertNotNull(iterator_iterable_queue_iterable_iterator_serializable4);
        org.junit.Assert.assertTrue(i5 == 1);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "null " + "'", str6.equals("null "));
        org.junit.Assert.assertNull(iterable_queue_iterable_iterator_serializable7);
        org.junit.Assert.assertNotNull(iterator_iterable_queue_iterable_iterator_serializable8);
        org.junit.Assert.assertNotNull(spliterator_iterable_queue_iterable_iterator_serializable9);
        org.junit.Assert.assertNotNull(iterator_spliterator_iterable_queue_iterable_iterator_serializable11);
    }

    @Test
    public void test487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test487");
        edu.osu.cs362.Queue<java.lang.Iterable<edu.osu.cs362.Queue<edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>>>> queue_iterable_queue_queue_queue_iterable_queue_iterable_iterator_serializable0 = new edu.osu.cs362.Queue<java.lang.Iterable<edu.osu.cs362.Queue<edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>>>>();
        edu.osu.cs362.Queue<edu.osu.cs362.Queue<edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>>> queue_queue_queue_queue_iterable_queue_iterable_iterator_serializable1 = new edu.osu.cs362.Queue<edu.osu.cs362.Queue<edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>>>();
        queue_iterable_queue_queue_queue_iterable_queue_iterable_iterator_serializable0.enqueue((java.lang.Iterable<edu.osu.cs362.Queue<edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>>>) queue_queue_queue_queue_iterable_queue_iterable_iterator_serializable1);
        java.lang.String str3 = queue_iterable_queue_queue_queue_iterable_queue_iterable_iterator_serializable0.toString();
        edu.osu.cs362.Queue<edu.osu.cs362.Queue<edu.osu.cs362.Queue<edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>>>> queue_queue_queue_queue_queue_iterable_queue_iterable_iterator_serializable4 = new edu.osu.cs362.Queue<edu.osu.cs362.Queue<edu.osu.cs362.Queue<edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>>>>();
        java.lang.String str5 = queue_queue_queue_queue_queue_iterable_queue_iterable_iterator_serializable4.toString();
        edu.osu.cs362.Queue<edu.osu.cs362.Queue<edu.osu.cs362.Queue<edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>>>> queue_queue_queue_queue_queue_iterable_queue_iterable_iterator_serializable6 = new edu.osu.cs362.Queue<edu.osu.cs362.Queue<edu.osu.cs362.Queue<edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>>>>();
        java.lang.String str7 = queue_queue_queue_queue_queue_iterable_queue_iterable_iterator_serializable6.toString();
        edu.osu.cs362.Queue<java.lang.Iterable<edu.osu.cs362.Queue<edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>>>> queue_iterable_queue_queue_queue_iterable_queue_iterable_iterator_serializable8 = new edu.osu.cs362.Queue<java.lang.Iterable<edu.osu.cs362.Queue<edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>>>>();
        edu.osu.cs362.Queue<edu.osu.cs362.Queue<edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>>> queue_queue_queue_queue_iterable_queue_iterable_iterator_serializable9 = new edu.osu.cs362.Queue<edu.osu.cs362.Queue<edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>>>();
        queue_iterable_queue_queue_queue_iterable_queue_iterable_iterator_serializable8.enqueue((java.lang.Iterable<edu.osu.cs362.Queue<edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>>>) queue_queue_queue_queue_iterable_queue_iterable_iterator_serializable9);
        edu.osu.cs362.Queue<edu.osu.cs362.Queue<edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>>> queue_queue_queue_queue_iterable_queue_iterable_iterator_serializable11 = new edu.osu.cs362.Queue<edu.osu.cs362.Queue<edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>>>();
        edu.osu.cs362.Queue<edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>> queue_queue_queue_iterable_queue_iterable_iterator_serializable12 = new edu.osu.cs362.Queue<edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>>();
        java.util.Spliterator<edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>> spliterator_queue_queue_iterable_queue_iterable_iterator_serializable13 = queue_queue_queue_iterable_queue_iterable_iterator_serializable12.spliterator();
        java.util.Spliterator<edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>> spliterator_queue_queue_iterable_queue_iterable_iterator_serializable14 = queue_queue_queue_iterable_queue_iterable_iterator_serializable12.spliterator();
        queue_queue_queue_queue_iterable_queue_iterable_iterator_serializable11.enqueue(queue_queue_queue_iterable_queue_iterable_iterator_serializable12);
        queue_queue_queue_queue_iterable_queue_iterable_iterator_serializable9.enqueue(queue_queue_queue_iterable_queue_iterable_iterator_serializable12);
        queue_queue_queue_queue_queue_iterable_queue_iterable_iterator_serializable6.enqueue(queue_queue_queue_queue_iterable_queue_iterable_iterator_serializable9);
        queue_queue_queue_queue_queue_iterable_queue_iterable_iterator_serializable4.enqueue(queue_queue_queue_queue_iterable_queue_iterable_iterator_serializable9);
        queue_iterable_queue_queue_queue_iterable_queue_iterable_iterator_serializable0.enqueue((java.lang.Iterable<edu.osu.cs362.Queue<edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>>>) queue_queue_queue_queue_iterable_queue_iterable_iterator_serializable9);
        java.lang.String str20 = queue_iterable_queue_queue_queue_iterable_queue_iterable_iterator_serializable0.toString();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + " " + "'", str3.equals(" "));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertNotNull(spliterator_queue_queue_iterable_queue_iterable_iterator_serializable13);
        org.junit.Assert.assertNotNull(spliterator_queue_queue_iterable_queue_iterable_iterator_serializable14);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "   " + "'", str20.equals("   "));
    }

    @Test
    public void test488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test488");
        edu.osu.cs362.Queue<java.util.Iterator<edu.osu.cs362.Queue<java.io.Serializable>>> queue_iterator_queue_serializable0 = new edu.osu.cs362.Queue<java.util.Iterator<edu.osu.cs362.Queue<java.io.Serializable>>>();
        java.lang.String str1 = queue_iterator_queue_serializable0.toString();
        try {
            java.util.Iterator<edu.osu.cs362.Queue<java.io.Serializable>> iterator_queue_serializable2 = queue_iterator_queue_serializable0.peek();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException");
        } catch (java.util.NoSuchElementException e) {
        }
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
    }

    @Test
    public void test489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test489");
        edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.lang.Object>>>> queue_queue_iterable_iterator_obj0 = new edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.lang.Object>>>>();
        java.lang.String str1 = queue_queue_iterable_iterator_obj0.toString();
        int i2 = queue_queue_iterable_iterator_obj0.size();
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertTrue(i2 == 0);
    }

    @Test
    public void test490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test490");
        edu.osu.cs362.Queue<java.lang.Object> queue_obj0 = new edu.osu.cs362.Queue<java.lang.Object>();
        int i1 = queue_obj0.size();
        java.util.Spliterator<java.lang.Object> spliterator_obj2 = queue_obj0.spliterator();
        edu.osu.cs362.Queue<java.util.Iterator<java.io.Serializable>> queue_iterator_serializable3 = new edu.osu.cs362.Queue<java.util.Iterator<java.io.Serializable>>();
        boolean b4 = queue_iterator_serializable3.isEmpty();
        edu.osu.cs362.Queue<java.io.Serializable> queue_serializable5 = new edu.osu.cs362.Queue<java.io.Serializable>();
        queue_serializable5.enqueue((java.io.Serializable) 1L);
        java.util.Iterator<java.io.Serializable> iterator_serializable8 = queue_serializable5.iterator();
        queue_iterator_serializable3.enqueue(iterator_serializable8);
        int i10 = queue_iterator_serializable3.size();
        java.util.Iterator<java.io.Serializable> iterator_serializable11 = queue_iterator_serializable3.peek();
        boolean b12 = queue_iterator_serializable3.isEmpty();
        java.util.Iterator<java.io.Serializable> iterator_serializable13 = queue_iterator_serializable3.peek();
        queue_obj0.enqueue((java.lang.Object) queue_iterator_serializable3);
        java.lang.Object obj15 = queue_obj0.dequeue();
        java.lang.String str16 = queue_obj0.toString();
        java.util.Spliterator<java.lang.Object> spliterator_obj17 = queue_obj0.spliterator();
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertNotNull(spliterator_obj2);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertNotNull(iterator_serializable8);
        org.junit.Assert.assertTrue(i10 == 1);
        org.junit.Assert.assertNotNull(iterator_serializable11);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNotNull(iterator_serializable13);
        org.junit.Assert.assertNotNull(obj15);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
        org.junit.Assert.assertNotNull(spliterator_obj17);
    }

    @Test
    public void test491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test491");
        edu.osu.cs362.Queue<java.util.Spliterator<edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>>> queue_spliterator_queue_queue_iterable_queue_iterable_iterator_serializable0 = new edu.osu.cs362.Queue<java.util.Spliterator<edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>>>();
        try {
            java.util.Spliterator<edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>> spliterator_queue_queue_iterable_queue_iterable_iterator_serializable1 = queue_spliterator_queue_queue_iterable_queue_iterable_iterator_serializable0.dequeue();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException");
        } catch (java.util.NoSuchElementException e) {
        }
    }

    @Test
    public void test492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test492");
        edu.osu.cs362.Queue<java.util.Spliterator<edu.osu.cs362.Queue<java.io.Serializable>>> queue_spliterator_queue_serializable0 = new edu.osu.cs362.Queue<java.util.Spliterator<edu.osu.cs362.Queue<java.io.Serializable>>>();
        java.util.Iterator<java.util.Spliterator<edu.osu.cs362.Queue<java.io.Serializable>>> iterator_spliterator_queue_serializable1 = queue_spliterator_queue_serializable0.iterator();
        java.util.Iterator<java.util.Spliterator<edu.osu.cs362.Queue<java.io.Serializable>>> iterator_spliterator_queue_serializable2 = queue_spliterator_queue_serializable0.iterator();
        org.junit.Assert.assertNotNull(iterator_spliterator_queue_serializable1);
        org.junit.Assert.assertNotNull(iterator_spliterator_queue_serializable2);
    }

    @Test
    public void test493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test493");
        edu.osu.cs362.Queue<java.util.Iterator<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>> queue_iterator_iterable_queue_iterable_iterator_serializable0 = new edu.osu.cs362.Queue<java.util.Iterator<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>();
        java.util.Iterator<java.util.Iterator<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>> iterator_iterator_iterable_queue_iterable_iterator_serializable1 = queue_iterator_iterable_queue_iterable_iterator_serializable0.iterator();
        java.util.Spliterator<java.util.Iterator<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>> spliterator_iterator_iterable_queue_iterable_iterator_serializable2 = queue_iterator_iterable_queue_iterable_iterator_serializable0.spliterator();
        java.lang.String str3 = queue_iterator_iterable_queue_iterable_iterator_serializable0.toString();
        org.junit.Assert.assertNotNull(iterator_iterator_iterable_queue_iterable_iterator_serializable1);
        org.junit.Assert.assertNotNull(spliterator_iterator_iterable_queue_iterable_iterator_serializable2);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
    }

    @Test
    public void test494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test494");
        edu.osu.cs362.Queue<java.util.Iterator<java.lang.Iterable<java.util.Iterator<edu.osu.cs362.Queue<java.io.Serializable>>>>> queue_iterator_iterable_iterator_queue_serializable0 = new edu.osu.cs362.Queue<java.util.Iterator<java.lang.Iterable<java.util.Iterator<edu.osu.cs362.Queue<java.io.Serializable>>>>>();
        boolean b1 = queue_iterator_iterable_iterator_queue_serializable0.isEmpty();
        java.util.Iterator<java.util.Iterator<java.lang.Iterable<java.util.Iterator<edu.osu.cs362.Queue<java.io.Serializable>>>>> iterator_iterator_iterable_iterator_queue_serializable2 = queue_iterator_iterable_iterator_queue_serializable0.iterator();
        java.util.Iterator<java.util.Iterator<java.lang.Iterable<java.util.Iterator<edu.osu.cs362.Queue<java.io.Serializable>>>>> iterator_iterator_iterable_iterator_queue_serializable3 = queue_iterator_iterable_iterator_queue_serializable0.iterator();
        try {
            java.util.Iterator<java.lang.Iterable<java.util.Iterator<edu.osu.cs362.Queue<java.io.Serializable>>>> iterator_iterable_iterator_queue_serializable4 = queue_iterator_iterable_iterator_queue_serializable0.dequeue();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException");
        } catch (java.util.NoSuchElementException e) {
        }
        org.junit.Assert.assertTrue(b1 == true);
        org.junit.Assert.assertNotNull(iterator_iterator_iterable_iterator_queue_serializable2);
        org.junit.Assert.assertNotNull(iterator_iterator_iterable_iterator_queue_serializable3);
    }

    @Test
    public void test495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test495");
        edu.osu.cs362.Queue<java.util.Iterator<java.lang.Iterable<java.io.Serializable>>> queue_iterator_iterable_serializable0 = new edu.osu.cs362.Queue<java.util.Iterator<java.lang.Iterable<java.io.Serializable>>>();
        int i1 = queue_iterator_iterable_serializable0.size();
        boolean b2 = queue_iterator_iterable_serializable0.isEmpty();
        java.util.Iterator<java.util.Iterator<java.lang.Iterable<java.io.Serializable>>> iterator_iterator_iterable_serializable3 = queue_iterator_iterable_serializable0.iterator();
        boolean b4 = queue_iterator_iterable_serializable0.isEmpty();
        try {
            java.util.Iterator<java.lang.Iterable<java.io.Serializable>> iterator_iterable_serializable5 = queue_iterator_iterable_serializable0.dequeue();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException");
        } catch (java.util.NoSuchElementException e) {
        }
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNotNull(iterator_iterator_iterable_serializable3);
        org.junit.Assert.assertTrue(b4 == true);
    }

    @Test
    public void test496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test496");
        edu.osu.cs362.Queue<java.lang.Iterable<edu.osu.cs362.Queue<edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>>>> queue_iterable_queue_queue_queue_iterable_queue_iterable_iterator_serializable0 = new edu.osu.cs362.Queue<java.lang.Iterable<edu.osu.cs362.Queue<edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>>>>();
        try {
            java.lang.Iterable<edu.osu.cs362.Queue<edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>>> iterable_queue_queue_queue_iterable_queue_iterable_iterator_serializable1 = queue_iterable_queue_queue_queue_iterable_queue_iterable_iterator_serializable0.peek();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException");
        } catch (java.util.NoSuchElementException e) {
        }
    }

    @Test
    public void test497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test497");
        edu.osu.cs362.Queue<java.util.Spliterator<java.util.Iterator<java.util.Iterator<java.lang.Object>>>> queue_spliterator_iterator_iterator_obj0 = new edu.osu.cs362.Queue<java.util.Spliterator<java.util.Iterator<java.util.Iterator<java.lang.Object>>>>();
        java.util.Spliterator<java.util.Spliterator<java.util.Iterator<java.util.Iterator<java.lang.Object>>>> spliterator_spliterator_iterator_iterator_obj1 = queue_spliterator_iterator_iterator_obj0.spliterator();
        org.junit.Assert.assertNotNull(spliterator_spliterator_iterator_iterator_obj1);
    }

    @Test
    public void test498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test498");
        edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.lang.Object>>> queue_iterable_iterator_obj0 = new edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.lang.Object>>>();
        edu.osu.cs362.Queue<java.util.Iterator<java.lang.Object>> queue_iterator_obj1 = new edu.osu.cs362.Queue<java.util.Iterator<java.lang.Object>>();
        queue_iterable_iterator_obj0.enqueue((java.lang.Iterable<java.util.Iterator<java.lang.Object>>) queue_iterator_obj1);
        edu.osu.cs362.Queue<java.util.Iterator<java.lang.Object>> queue_iterator_obj3 = new edu.osu.cs362.Queue<java.util.Iterator<java.lang.Object>>();
        queue_iterable_iterator_obj0.enqueue((java.lang.Iterable<java.util.Iterator<java.lang.Object>>) queue_iterator_obj3);
        java.lang.Iterable<java.util.Iterator<java.lang.Object>> iterable_iterator_obj5 = queue_iterable_iterator_obj0.peek();
        java.lang.Iterable<java.util.Iterator<java.lang.Object>> iterable_iterator_obj6 = queue_iterable_iterator_obj0.dequeue();
        java.util.Spliterator<java.util.Iterator<java.lang.Object>> spliterator_iterator_obj7 = iterable_iterator_obj6.spliterator();
        org.junit.Assert.assertNotNull(iterable_iterator_obj5);
        org.junit.Assert.assertNotNull(iterable_iterator_obj6);
        org.junit.Assert.assertNotNull(spliterator_iterator_obj7);
    }

    @Test
    public void test499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test499");
        edu.osu.cs362.Queue<java.lang.Iterable<java.lang.Object>> queue_iterable_obj0 = new edu.osu.cs362.Queue<java.lang.Iterable<java.lang.Object>>();
        java.lang.String str1 = queue_iterable_obj0.toString();
        edu.osu.cs362.Queue<java.lang.Object> queue_obj2 = new edu.osu.cs362.Queue<java.lang.Object>();
        int i3 = queue_obj2.size();
        java.util.Spliterator<java.lang.Object> spliterator_obj4 = queue_obj2.spliterator();
        boolean b5 = queue_obj2.isEmpty();
        java.util.Spliterator<java.lang.Object> spliterator_obj6 = queue_obj2.spliterator();
        queue_iterable_obj0.enqueue((java.lang.Iterable<java.lang.Object>) queue_obj2);
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertNotNull(spliterator_obj4);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertNotNull(spliterator_obj6);
    }

    @Test
    public void test500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test500");
        edu.osu.cs362.Queue<java.util.Iterator<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>> queue_iterator_iterable_queue_iterable_iterator_serializable0 = new edu.osu.cs362.Queue<java.util.Iterator<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>();
        java.util.Iterator<java.util.Iterator<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>> iterator_iterator_iterable_queue_iterable_iterator_serializable1 = queue_iterator_iterable_queue_iterable_iterator_serializable0.iterator();
        java.util.Spliterator<java.util.Iterator<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>> spliterator_iterator_iterable_queue_iterable_iterator_serializable2 = queue_iterator_iterable_queue_iterable_iterator_serializable0.spliterator();
        int i3 = queue_iterator_iterable_queue_iterable_iterator_serializable0.size();
        try {
            java.util.Iterator<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>> iterator_iterable_queue_iterable_iterator_serializable4 = queue_iterator_iterable_queue_iterable_iterator_serializable0.peek();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException");
        } catch (java.util.NoSuchElementException e) {
        }
        org.junit.Assert.assertNotNull(iterator_iterator_iterable_queue_iterable_iterator_serializable1);
        org.junit.Assert.assertNotNull(spliterator_iterator_iterable_queue_iterable_iterator_serializable2);
        org.junit.Assert.assertTrue(i3 == 0);
    }
}
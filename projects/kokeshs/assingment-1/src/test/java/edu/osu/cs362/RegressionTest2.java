import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest2 {

    public static boolean debug = false;

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test01");
        edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.util.Spliterator<java.lang.Iterable<java.util.Iterator<java.lang.Object>>>>> queue_queue_spliterator_iterable_iterator_obj0 = new edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.util.Spliterator<java.lang.Iterable<java.util.Iterator<java.lang.Object>>>>>();
        java.util.Iterator<edu.osu.cs362.Queue<java.util.Spliterator<java.lang.Iterable<java.util.Iterator<java.lang.Object>>>>> iterator_queue_spliterator_iterable_iterator_obj1 = queue_queue_spliterator_iterable_iterator_obj0.iterator();
        boolean b2 = queue_queue_spliterator_iterable_iterator_obj0.isEmpty();
        int i3 = queue_queue_spliterator_iterable_iterator_obj0.size();
        java.util.Iterator<edu.osu.cs362.Queue<java.util.Spliterator<java.lang.Iterable<java.util.Iterator<java.lang.Object>>>>> iterator_queue_spliterator_iterable_iterator_obj4 = queue_queue_spliterator_iterable_iterator_obj0.iterator();
        org.junit.Assert.assertNotNull(iterator_queue_spliterator_iterable_iterator_obj1);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertNotNull(iterator_queue_spliterator_iterable_iterator_obj4);
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test02");
        edu.osu.cs362.Queue<java.util.Iterator<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>>> queue_iterator_iterable_queue_iterable_queue_iterable_iterator_serializable0 = new edu.osu.cs362.Queue<java.util.Iterator<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>>>();
        int i1 = queue_iterator_iterable_queue_iterable_queue_iterable_iterator_serializable0.size();
        java.util.Iterator<java.util.Iterator<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>>> iterator_iterator_iterable_queue_iterable_queue_iterable_iterator_serializable2 = queue_iterator_iterable_queue_iterable_queue_iterable_iterator_serializable0.iterator();
        try {
            java.util.Iterator<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>> iterator_iterable_queue_iterable_queue_iterable_iterator_serializable3 = queue_iterator_iterable_queue_iterable_queue_iterable_iterator_serializable0.dequeue();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException");
        } catch (java.util.NoSuchElementException e) {
        }
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertNotNull(iterator_iterator_iterable_queue_iterable_queue_iterable_iterator_serializable2);
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test03");
        edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>> queue_queue_iterable_iterator_serializable0 = new edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>();
        boolean b1 = queue_queue_iterable_iterator_serializable0.isEmpty();
        boolean b2 = queue_queue_iterable_iterator_serializable0.isEmpty();
        edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>> queue_iterable_iterator_serializable3 = new edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>();
        java.util.Iterator<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>> iterator_iterable_iterator_serializable4 = queue_iterable_iterator_serializable3.iterator();
        java.util.Spliterator<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>> spliterator_iterable_iterator_serializable5 = queue_iterable_iterator_serializable3.spliterator();
        java.lang.String str6 = queue_iterable_iterator_serializable3.toString();
        queue_queue_iterable_iterator_serializable0.enqueue(queue_iterable_iterator_serializable3);
        java.util.Iterator<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>> iterator_queue_iterable_iterator_serializable8 = queue_queue_iterable_iterator_serializable0.iterator();
        boolean b9 = queue_queue_iterable_iterator_serializable0.isEmpty();
        org.junit.Assert.assertTrue(b1 == true);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNotNull(iterator_iterable_iterator_serializable4);
        org.junit.Assert.assertNotNull(spliterator_iterable_iterator_serializable5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertNotNull(iterator_queue_iterable_iterator_serializable8);
        org.junit.Assert.assertTrue(b9 == false);
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test04");
        edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<edu.osu.cs362.Queue<java.io.Serializable>>>>> queue_queue_iterable_iterator_queue_serializable0 = new edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<edu.osu.cs362.Queue<java.io.Serializable>>>>>();
        java.util.Iterator<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<edu.osu.cs362.Queue<java.io.Serializable>>>>> iterator_queue_iterable_iterator_queue_serializable1 = queue_queue_iterable_iterator_queue_serializable0.iterator();
        org.junit.Assert.assertNotNull(iterator_queue_iterable_iterator_queue_serializable1);
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test05");
        edu.osu.cs362.Queue<java.util.Iterator<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>> queue_iterator_iterable_iterator_serializable0 = new edu.osu.cs362.Queue<java.util.Iterator<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>();
        boolean b1 = queue_iterator_iterable_iterator_serializable0.isEmpty();
        boolean b2 = queue_iterator_iterable_iterator_serializable0.isEmpty();
        edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>> queue_iterable_iterator_serializable3 = new edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>();
        java.util.Iterator<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>> iterator_iterable_iterator_serializable4 = queue_iterable_iterator_serializable3.iterator();
        java.util.Spliterator<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>> spliterator_iterable_iterator_serializable5 = queue_iterable_iterator_serializable3.spliterator();
        java.util.Spliterator<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>> spliterator_iterable_iterator_serializable6 = queue_iterable_iterator_serializable3.spliterator();
        int i7 = queue_iterable_iterator_serializable3.size();
        java.lang.String str8 = queue_iterable_iterator_serializable3.toString();
        java.util.Iterator<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>> iterator_iterable_iterator_serializable9 = queue_iterable_iterator_serializable3.iterator();
        java.util.Iterator<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>> iterator_iterable_iterator_serializable10 = queue_iterable_iterator_serializable3.iterator();
        queue_iterator_iterable_iterator_serializable0.enqueue(iterator_iterable_iterator_serializable10);
        java.lang.String str12 = queue_iterator_iterable_iterator_serializable0.toString();
        org.junit.Assert.assertTrue(b1 == true);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNotNull(iterator_iterable_iterator_serializable4);
        org.junit.Assert.assertNotNull(spliterator_iterable_iterator_serializable5);
        org.junit.Assert.assertNotNull(spliterator_iterable_iterator_serializable6);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertNotNull(iterator_iterable_iterator_serializable9);
        org.junit.Assert.assertNotNull(iterator_iterable_iterator_serializable10);
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test06");
        edu.osu.cs362.Queue<java.util.Iterator<java.util.Iterator<java.util.Iterator<java.lang.Object>>>> queue_iterator_iterator_iterator_obj0 = new edu.osu.cs362.Queue<java.util.Iterator<java.util.Iterator<java.util.Iterator<java.lang.Object>>>>();
        boolean b1 = queue_iterator_iterator_iterator_obj0.isEmpty();
        java.lang.String str2 = queue_iterator_iterator_iterator_obj0.toString();
        try {
            java.util.Iterator<java.util.Iterator<java.util.Iterator<java.lang.Object>>> iterator_iterator_iterator_obj3 = queue_iterator_iterator_iterator_obj0.peek();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException");
        } catch (java.util.NoSuchElementException e) {
        }
        org.junit.Assert.assertTrue(b1 == true);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test07");
        edu.osu.cs362.Queue<java.util.Iterator<java.util.Iterator<java.lang.Object>>> queue_iterator_iterator_obj0 = new edu.osu.cs362.Queue<java.util.Iterator<java.util.Iterator<java.lang.Object>>>();
        java.util.Iterator<java.util.Iterator<java.util.Iterator<java.lang.Object>>> iterator_iterator_iterator_obj1 = queue_iterator_iterator_obj0.iterator();
        boolean b2 = queue_iterator_iterator_obj0.isEmpty();
        java.lang.String str3 = queue_iterator_iterator_obj0.toString();
        java.lang.String str4 = queue_iterator_iterator_obj0.toString();
        edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.lang.Object>>> queue_iterable_iterator_obj5 = new edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.lang.Object>>>();
        edu.osu.cs362.Queue<java.util.Iterator<java.lang.Object>> queue_iterator_obj6 = new edu.osu.cs362.Queue<java.util.Iterator<java.lang.Object>>();
        queue_iterable_iterator_obj5.enqueue((java.lang.Iterable<java.util.Iterator<java.lang.Object>>) queue_iterator_obj6);
        java.util.Iterator<java.util.Iterator<java.lang.Object>> iterator_iterator_obj8 = queue_iterator_obj6.iterator();
        java.util.Spliterator<java.util.Iterator<java.lang.Object>> spliterator_iterator_obj9 = queue_iterator_obj6.spliterator();
        java.util.Iterator<java.util.Iterator<java.lang.Object>> iterator_iterator_obj10 = queue_iterator_obj6.iterator();
        queue_iterator_iterator_obj0.enqueue(iterator_iterator_obj10);
        int i12 = queue_iterator_iterator_obj0.size();
        org.junit.Assert.assertNotNull(iterator_iterator_iterator_obj1);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        org.junit.Assert.assertNotNull(iterator_iterator_obj8);
        org.junit.Assert.assertNotNull(spliterator_iterator_obj9);
        org.junit.Assert.assertNotNull(iterator_iterator_obj10);
        org.junit.Assert.assertTrue(i12 == 1);
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test08");
        edu.osu.cs362.Queue<java.util.Spliterator<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.lang.Object>>>>> queue_spliterator_queue_iterable_iterator_obj0 = new edu.osu.cs362.Queue<java.util.Spliterator<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.lang.Object>>>>>();
        boolean b1 = queue_spliterator_queue_iterable_iterator_obj0.isEmpty();
        org.junit.Assert.assertTrue(b1 == true);
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test09");
        edu.osu.cs362.Queue<java.util.Iterator<edu.osu.cs362.Queue<java.util.Iterator<java.util.Iterator<java.lang.Iterable<java.io.Serializable>>>>>> queue_iterator_queue_iterator_iterator_iterable_serializable0 = new edu.osu.cs362.Queue<java.util.Iterator<edu.osu.cs362.Queue<java.util.Iterator<java.util.Iterator<java.lang.Iterable<java.io.Serializable>>>>>>();
        try {
            java.util.Iterator<edu.osu.cs362.Queue<java.util.Iterator<java.util.Iterator<java.lang.Iterable<java.io.Serializable>>>>> iterator_queue_iterator_iterator_iterable_serializable1 = queue_iterator_queue_iterator_iterator_iterable_serializable0.dequeue();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException");
        } catch (java.util.NoSuchElementException e) {
        }
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test10");
        edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.util.Iterator<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>> queue_queue_iterator_iterable_iterator_serializable0 = new edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.util.Iterator<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>();
        java.util.Iterator<edu.osu.cs362.Queue<java.util.Iterator<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>> iterator_queue_iterator_iterable_iterator_serializable1 = queue_queue_iterator_iterable_iterator_serializable0.iterator();
        try {
            edu.osu.cs362.Queue<java.util.Iterator<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>> queue_iterator_iterable_iterator_serializable2 = queue_queue_iterator_iterable_iterator_serializable0.dequeue();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException");
        } catch (java.util.NoSuchElementException e) {
        }
        org.junit.Assert.assertNotNull(iterator_queue_iterator_iterable_iterator_serializable1);
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test11");
        edu.osu.cs362.Queue<edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>> queue_queue_queue_iterable_iterator_serializable0 = new edu.osu.cs362.Queue<edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>();
        edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>> queue_queue_iterable_iterator_serializable1 = new edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>();
        boolean b2 = queue_queue_iterable_iterator_serializable1.isEmpty();
        boolean b3 = queue_queue_iterable_iterator_serializable1.isEmpty();
        edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>> queue_iterable_iterator_serializable4 = new edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>();
        java.util.Iterator<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>> iterator_iterable_iterator_serializable5 = queue_iterable_iterator_serializable4.iterator();
        java.util.Spliterator<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>> spliterator_iterable_iterator_serializable6 = queue_iterable_iterator_serializable4.spliterator();
        java.lang.String str7 = queue_iterable_iterator_serializable4.toString();
        queue_queue_iterable_iterator_serializable1.enqueue(queue_iterable_iterator_serializable4);
        queue_queue_queue_iterable_iterator_serializable0.enqueue(queue_queue_iterable_iterator_serializable1);
        boolean b10 = queue_queue_queue_iterable_iterator_serializable0.isEmpty();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertNotNull(iterator_iterable_iterator_serializable5);
        org.junit.Assert.assertNotNull(spliterator_iterable_iterator_serializable6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue(b10 == false);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test12");
        edu.osu.cs362.Queue<java.util.Spliterator<java.util.Iterator<java.util.Iterator<java.lang.Object>>>> queue_spliterator_iterator_iterator_obj0 = new edu.osu.cs362.Queue<java.util.Spliterator<java.util.Iterator<java.util.Iterator<java.lang.Object>>>>();
        edu.osu.cs362.Queue<java.util.Iterator<java.util.Iterator<java.lang.Object>>> queue_iterator_iterator_obj1 = new edu.osu.cs362.Queue<java.util.Iterator<java.util.Iterator<java.lang.Object>>>();
        edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.lang.Object>>> queue_iterable_iterator_obj2 = new edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.lang.Object>>>();
        edu.osu.cs362.Queue<java.util.Iterator<java.lang.Object>> queue_iterator_obj3 = new edu.osu.cs362.Queue<java.util.Iterator<java.lang.Object>>();
        queue_iterable_iterator_obj2.enqueue((java.lang.Iterable<java.util.Iterator<java.lang.Object>>) queue_iterator_obj3);
        java.lang.String str5 = queue_iterator_obj3.toString();
        java.util.Iterator<java.util.Iterator<java.lang.Object>> iterator_iterator_obj6 = queue_iterator_obj3.iterator();
        queue_iterator_iterator_obj1.enqueue(iterator_iterator_obj6);
        java.util.Iterator<java.util.Iterator<java.lang.Object>> iterator_iterator_obj8 = queue_iterator_iterator_obj1.dequeue();
        java.util.Spliterator<java.util.Iterator<java.util.Iterator<java.lang.Object>>> spliterator_iterator_iterator_obj9 = queue_iterator_iterator_obj1.spliterator();
        queue_spliterator_iterator_iterator_obj0.enqueue(spliterator_iterator_iterator_obj9);
        java.util.Iterator<java.util.Spliterator<java.util.Iterator<java.util.Iterator<java.lang.Object>>>> iterator_spliterator_iterator_iterator_obj11 = queue_spliterator_iterator_iterator_obj0.iterator();
        java.util.Spliterator<java.util.Spliterator<java.util.Iterator<java.util.Iterator<java.lang.Object>>>> spliterator_spliterator_iterator_iterator_obj12 = queue_spliterator_iterator_iterator_obj0.spliterator();
        int i13 = queue_spliterator_iterator_iterator_obj0.size();
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertNotNull(iterator_iterator_obj6);
        org.junit.Assert.assertNotNull(iterator_iterator_obj8);
        org.junit.Assert.assertNotNull(spliterator_iterator_iterator_obj9);
        org.junit.Assert.assertNotNull(iterator_spliterator_iterator_iterator_obj11);
        org.junit.Assert.assertNotNull(spliterator_spliterator_iterator_iterator_obj12);
        org.junit.Assert.assertTrue(i13 == 1);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test13");
        edu.osu.cs362.Queue<java.util.Iterator<java.util.Iterator<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>> queue_iterator_iterator_queue_iterable_iterator_serializable0 = new edu.osu.cs362.Queue<java.util.Iterator<java.util.Iterator<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>();
        int i1 = queue_iterator_iterator_queue_iterable_iterator_serializable0.size();
        edu.osu.cs362.Queue<java.util.Iterator<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>> queue_iterator_queue_iterable_iterator_serializable2 = new edu.osu.cs362.Queue<java.util.Iterator<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>();
        java.util.Iterator<java.util.Iterator<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>> iterator_iterator_queue_iterable_iterator_serializable3 = queue_iterator_queue_iterable_iterator_serializable2.iterator();
        queue_iterator_iterator_queue_iterable_iterator_serializable0.enqueue(iterator_iterator_queue_iterable_iterator_serializable3);
        java.util.Spliterator<java.util.Iterator<java.util.Iterator<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>> spliterator_iterator_iterator_queue_iterable_iterator_serializable5 = queue_iterator_iterator_queue_iterable_iterator_serializable0.spliterator();
        java.util.Spliterator<java.util.Iterator<java.util.Iterator<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>> spliterator_iterator_iterator_queue_iterable_iterator_serializable6 = queue_iterator_iterator_queue_iterable_iterator_serializable0.spliterator();
        java.util.Iterator<java.util.Iterator<java.util.Iterator<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>> iterator_iterator_iterator_queue_iterable_iterator_serializable7 = queue_iterator_iterator_queue_iterable_iterator_serializable0.iterator();
        java.util.Spliterator<java.util.Iterator<java.util.Iterator<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>> spliterator_iterator_iterator_queue_iterable_iterator_serializable8 = queue_iterator_iterator_queue_iterable_iterator_serializable0.spliterator();
        int i9 = queue_iterator_iterator_queue_iterable_iterator_serializable0.size();
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertNotNull(iterator_iterator_queue_iterable_iterator_serializable3);
        org.junit.Assert.assertNotNull(spliterator_iterator_iterator_queue_iterable_iterator_serializable5);
        org.junit.Assert.assertNotNull(spliterator_iterator_iterator_queue_iterable_iterator_serializable6);
        org.junit.Assert.assertNotNull(iterator_iterator_iterator_queue_iterable_iterator_serializable7);
        org.junit.Assert.assertNotNull(spliterator_iterator_iterator_queue_iterable_iterator_serializable8);
        org.junit.Assert.assertTrue(i9 == 1);
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test14");
        edu.osu.cs362.Queue<java.util.Iterator<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>>> queue_iterator_iterable_queue_iterable_queue_iterable_iterator_serializable0 = new edu.osu.cs362.Queue<java.util.Iterator<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>>>();
        edu.osu.cs362.Queue<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>> queue_iterable_queue_iterable_queue_iterable_iterator_serializable1 = new edu.osu.cs362.Queue<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>>();
        boolean b2 = queue_iterable_queue_iterable_queue_iterable_iterator_serializable1.isEmpty();
        boolean b3 = queue_iterable_queue_iterable_queue_iterable_iterator_serializable1.isEmpty();
        java.lang.String str4 = queue_iterable_queue_iterable_queue_iterable_iterator_serializable1.toString();
        int i5 = queue_iterable_queue_iterable_queue_iterable_iterator_serializable1.size();
        boolean b6 = queue_iterable_queue_iterable_queue_iterable_iterator_serializable1.isEmpty();
        java.util.Iterator<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>> iterator_iterable_queue_iterable_queue_iterable_iterator_serializable7 = queue_iterable_queue_iterable_queue_iterable_iterator_serializable1.iterator();
        queue_iterator_iterable_queue_iterable_queue_iterable_iterator_serializable0.enqueue(iterator_iterable_queue_iterable_queue_iterable_iterator_serializable7);
        java.util.Iterator<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>> iterator_iterable_queue_iterable_queue_iterable_iterator_serializable9 = queue_iterator_iterable_queue_iterable_queue_iterable_iterator_serializable0.dequeue();
        java.util.Iterator<java.util.Iterator<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>>> iterator_iterator_iterable_queue_iterable_queue_iterable_iterator_serializable10 = queue_iterator_iterable_queue_iterable_queue_iterable_iterator_serializable0.iterator();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertNotNull(iterator_iterable_queue_iterable_queue_iterable_iterator_serializable7);
        org.junit.Assert.assertNotNull(iterator_iterable_queue_iterable_queue_iterable_iterator_serializable9);
        org.junit.Assert.assertNotNull(iterator_iterator_iterable_queue_iterable_queue_iterable_iterator_serializable10);
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test15");
        edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.util.Spliterator<java.lang.Iterable<java.lang.Iterable<java.util.Iterator<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>>>>> queue_queue_spliterator_iterable_iterable_iterator_iterable_queue_iterable_iterator_serializable0 = new edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.util.Spliterator<java.lang.Iterable<java.lang.Iterable<java.util.Iterator<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>>>>>();
        edu.osu.cs362.Queue<java.util.Spliterator<java.lang.Iterable<java.lang.Iterable<java.util.Iterator<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>>>> queue_spliterator_iterable_iterable_iterator_iterable_queue_iterable_iterator_serializable1 = new edu.osu.cs362.Queue<java.util.Spliterator<java.lang.Iterable<java.lang.Iterable<java.util.Iterator<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>>>>();
        boolean b2 = queue_spliterator_iterable_iterable_iterator_iterable_queue_iterable_iterator_serializable1.isEmpty();
        java.util.Spliterator<java.util.Spliterator<java.lang.Iterable<java.lang.Iterable<java.util.Iterator<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>>>> spliterator_spliterator_iterable_iterable_iterator_iterable_queue_iterable_iterator_serializable3 = queue_spliterator_iterable_iterable_iterator_iterable_queue_iterable_iterator_serializable1.spliterator();
        java.util.Spliterator<java.util.Spliterator<java.lang.Iterable<java.lang.Iterable<java.util.Iterator<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>>>> spliterator_spliterator_iterable_iterable_iterator_iterable_queue_iterable_iterator_serializable4 = queue_spliterator_iterable_iterable_iterator_iterable_queue_iterable_iterator_serializable1.spliterator();
        queue_queue_spliterator_iterable_iterable_iterator_iterable_queue_iterable_iterator_serializable0.enqueue(queue_spliterator_iterable_iterable_iterator_iterable_queue_iterable_iterator_serializable1);
        java.util.Iterator<edu.osu.cs362.Queue<java.util.Spliterator<java.lang.Iterable<java.lang.Iterable<java.util.Iterator<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>>>>> iterator_queue_spliterator_iterable_iterable_iterator_iterable_queue_iterable_iterator_serializable6 = queue_queue_spliterator_iterable_iterable_iterator_iterable_queue_iterable_iterator_serializable0.iterator();
        java.util.Spliterator<edu.osu.cs362.Queue<java.util.Spliterator<java.lang.Iterable<java.lang.Iterable<java.util.Iterator<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>>>>> spliterator_queue_spliterator_iterable_iterable_iterator_iterable_queue_iterable_iterator_serializable7 = queue_queue_spliterator_iterable_iterable_iterator_iterable_queue_iterable_iterator_serializable0.spliterator();
        java.lang.String str8 = queue_queue_spliterator_iterable_iterable_iterator_iterable_queue_iterable_iterator_serializable0.toString();
        java.util.Spliterator<edu.osu.cs362.Queue<java.util.Spliterator<java.lang.Iterable<java.lang.Iterable<java.util.Iterator<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>>>>> spliterator_queue_spliterator_iterable_iterable_iterator_iterable_queue_iterable_iterator_serializable9 = queue_queue_spliterator_iterable_iterable_iterator_iterable_queue_iterable_iterator_serializable0.spliterator();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNotNull(spliterator_spliterator_iterable_iterable_iterator_iterable_queue_iterable_iterator_serializable3);
        org.junit.Assert.assertNotNull(spliterator_spliterator_iterable_iterable_iterator_iterable_queue_iterable_iterator_serializable4);
        org.junit.Assert.assertNotNull(iterator_queue_spliterator_iterable_iterable_iterator_iterable_queue_iterable_iterator_serializable6);
        org.junit.Assert.assertNotNull(spliterator_queue_spliterator_iterable_iterable_iterator_iterable_queue_iterable_iterator_serializable7);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + " " + "'", str8.equals(" "));
        org.junit.Assert.assertNotNull(spliterator_queue_spliterator_iterable_iterable_iterator_iterable_queue_iterable_iterator_serializable9);
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test16");
        edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>> queue_iterable_iterator_iterable_queue_iterable_iterator_serializable0 = new edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>>();
        java.util.Spliterator<java.lang.Iterable<java.util.Iterator<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>> spliterator_iterable_iterator_iterable_queue_iterable_iterator_serializable1 = queue_iterable_iterator_iterable_queue_iterable_iterator_serializable0.spliterator();
        boolean b2 = queue_iterable_iterator_iterable_queue_iterable_iterator_serializable0.isEmpty();
        java.util.Spliterator<java.lang.Iterable<java.util.Iterator<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>> spliterator_iterable_iterator_iterable_queue_iterable_iterator_serializable3 = queue_iterable_iterator_iterable_queue_iterable_iterator_serializable0.spliterator();
        java.util.Iterator<java.lang.Iterable<java.util.Iterator<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>> iterator_iterable_iterator_iterable_queue_iterable_iterator_serializable4 = queue_iterable_iterator_iterable_queue_iterable_iterator_serializable0.iterator();
        org.junit.Assert.assertNotNull(spliterator_iterable_iterator_iterable_queue_iterable_iterator_serializable1);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNotNull(spliterator_iterable_iterator_iterable_queue_iterable_iterator_serializable3);
        org.junit.Assert.assertNotNull(iterator_iterable_iterator_iterable_queue_iterable_iterator_serializable4);
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test17");
        edu.osu.cs362.Queue<java.util.Spliterator<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>> queue_spliterator_iterable_queue_iterable_iterator_serializable0 = new edu.osu.cs362.Queue<java.util.Spliterator<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>();
        edu.osu.cs362.Queue<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>> queue_iterable_queue_iterable_iterator_serializable1 = new edu.osu.cs362.Queue<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>();
        java.util.Spliterator<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>> spliterator_iterable_queue_iterable_iterator_serializable2 = queue_iterable_queue_iterable_iterator_serializable1.spliterator();
        queue_spliterator_iterable_queue_iterable_iterator_serializable0.enqueue(spliterator_iterable_queue_iterable_iterator_serializable2);
        java.util.Spliterator<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>> spliterator_iterable_queue_iterable_iterator_serializable4 = queue_spliterator_iterable_queue_iterable_iterator_serializable0.peek();
        int i5 = queue_spliterator_iterable_queue_iterable_iterator_serializable0.size();
        boolean b6 = queue_spliterator_iterable_queue_iterable_iterator_serializable0.isEmpty();
        org.junit.Assert.assertNotNull(spliterator_iterable_queue_iterable_iterator_serializable2);
        org.junit.Assert.assertNotNull(spliterator_iterable_queue_iterable_iterator_serializable4);
        org.junit.Assert.assertTrue(i5 == 1);
        org.junit.Assert.assertTrue(b6 == false);
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test18");
        edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.util.Iterator<edu.osu.cs362.Queue<java.io.Serializable>>>> queue_queue_iterator_queue_serializable0 = new edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.util.Iterator<edu.osu.cs362.Queue<java.io.Serializable>>>>();
        int i1 = queue_queue_iterator_queue_serializable0.size();
        boolean b2 = queue_queue_iterator_queue_serializable0.isEmpty();
        java.util.Iterator<edu.osu.cs362.Queue<java.util.Iterator<edu.osu.cs362.Queue<java.io.Serializable>>>> iterator_queue_iterator_queue_serializable3 = queue_queue_iterator_queue_serializable0.iterator();
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNotNull(iterator_queue_iterator_queue_serializable3);
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test19");
        edu.osu.cs362.Queue<java.lang.Iterable<edu.osu.cs362.Queue<edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>>>> queue_iterable_queue_queue_queue_iterable_queue_iterable_iterator_serializable0 = new edu.osu.cs362.Queue<java.lang.Iterable<edu.osu.cs362.Queue<edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>>>>();
        edu.osu.cs362.Queue<edu.osu.cs362.Queue<edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>>> queue_queue_queue_queue_iterable_queue_iterable_iterator_serializable1 = new edu.osu.cs362.Queue<edu.osu.cs362.Queue<edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>>>();
        queue_iterable_queue_queue_queue_iterable_queue_iterable_iterator_serializable0.enqueue((java.lang.Iterable<edu.osu.cs362.Queue<edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>>>) queue_queue_queue_queue_iterable_queue_iterable_iterator_serializable1);
        edu.osu.cs362.Queue<edu.osu.cs362.Queue<edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>>> queue_queue_queue_queue_iterable_queue_iterable_iterator_serializable3 = new edu.osu.cs362.Queue<edu.osu.cs362.Queue<edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>>>();
        edu.osu.cs362.Queue<edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>> queue_queue_queue_iterable_queue_iterable_iterator_serializable4 = new edu.osu.cs362.Queue<edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>>();
        java.util.Spliterator<edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>> spliterator_queue_queue_iterable_queue_iterable_iterator_serializable5 = queue_queue_queue_iterable_queue_iterable_iterator_serializable4.spliterator();
        java.util.Spliterator<edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>> spliterator_queue_queue_iterable_queue_iterable_iterator_serializable6 = queue_queue_queue_iterable_queue_iterable_iterator_serializable4.spliterator();
        queue_queue_queue_queue_iterable_queue_iterable_iterator_serializable3.enqueue(queue_queue_queue_iterable_queue_iterable_iterator_serializable4);
        queue_queue_queue_queue_iterable_queue_iterable_iterator_serializable1.enqueue(queue_queue_queue_iterable_queue_iterable_iterator_serializable4);
        edu.osu.cs362.Queue<edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>> queue_queue_queue_iterable_queue_iterable_iterator_serializable9 = queue_queue_queue_queue_iterable_queue_iterable_iterator_serializable1.peek();
        java.util.Iterator<edu.osu.cs362.Queue<edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>>> iterator_queue_queue_queue_iterable_queue_iterable_iterator_serializable10 = queue_queue_queue_queue_iterable_queue_iterable_iterator_serializable1.iterator();
        org.junit.Assert.assertNotNull(spliterator_queue_queue_iterable_queue_iterable_iterator_serializable5);
        org.junit.Assert.assertNotNull(spliterator_queue_queue_iterable_queue_iterable_iterator_serializable6);
        org.junit.Assert.assertNotNull(queue_queue_queue_iterable_queue_iterable_iterator_serializable9);
        org.junit.Assert.assertNotNull(iterator_queue_queue_queue_iterable_queue_iterable_iterator_serializable10);
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test20");
        edu.osu.cs362.Queue<java.lang.Iterable<java.lang.Object>> queue_iterable_obj0 = new edu.osu.cs362.Queue<java.lang.Iterable<java.lang.Object>>();
        java.lang.String str1 = queue_iterable_obj0.toString();
        try {
            java.lang.Iterable<java.lang.Object> iterable_obj2 = queue_iterable_obj0.dequeue();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException");
        } catch (java.util.NoSuchElementException e) {
        }
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test21");
        edu.osu.cs362.Queue<edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.lang.Comparable<java.lang.String>>>> queue_queue_queue_comparable_str0 = new edu.osu.cs362.Queue<edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.lang.Comparable<java.lang.String>>>>();
        boolean b1 = queue_queue_queue_comparable_str0.isEmpty();
        java.util.Iterator<edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.lang.Comparable<java.lang.String>>>> iterator_queue_queue_comparable_str2 = queue_queue_queue_comparable_str0.iterator();
        int i3 = queue_queue_queue_comparable_str0.size();
        java.lang.String str4 = queue_queue_queue_comparable_str0.toString();
        boolean b5 = queue_queue_queue_comparable_str0.isEmpty();
        org.junit.Assert.assertTrue(b1 == true);
        org.junit.Assert.assertNotNull(iterator_queue_queue_comparable_str2);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        org.junit.Assert.assertTrue(b5 == true);
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test22");
        edu.osu.cs362.Queue<edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.util.Spliterator<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>>>>> queue_queue_queue_spliterator_iterable_queue_iterable_queue_iterable_iterator_serializable0 = new edu.osu.cs362.Queue<edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.util.Spliterator<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>>>>>();
        java.util.Spliterator<edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.util.Spliterator<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>>>>> spliterator_queue_queue_spliterator_iterable_queue_iterable_queue_iterable_iterator_serializable1 = queue_queue_queue_spliterator_iterable_queue_iterable_queue_iterable_iterator_serializable0.spliterator();
        org.junit.Assert.assertNotNull(spliterator_queue_queue_spliterator_iterable_queue_iterable_queue_iterable_iterator_serializable1);
    }

    @Test
    public void test23() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test23");
        edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>> queue_iterable_iterator_serializable0 = new edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>();
        java.util.Iterator<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>> iterator_iterable_iterator_serializable1 = queue_iterable_iterator_serializable0.iterator();
        java.util.Spliterator<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>> spliterator_iterable_iterator_serializable2 = queue_iterable_iterator_serializable0.spliterator();
        java.util.Spliterator<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>> spliterator_iterable_iterator_serializable3 = queue_iterable_iterator_serializable0.spliterator();
        int i4 = queue_iterable_iterator_serializable0.size();
        java.lang.String str5 = queue_iterable_iterator_serializable0.toString();
        java.util.Iterator<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>> iterator_iterable_iterator_serializable6 = queue_iterable_iterator_serializable0.iterator();
        edu.osu.cs362.Queue<java.util.Iterator<java.io.Serializable>> queue_iterator_serializable7 = new edu.osu.cs362.Queue<java.util.Iterator<java.io.Serializable>>();
        java.lang.String str8 = queue_iterator_serializable7.toString();
        int i9 = queue_iterator_serializable7.size();
        queue_iterable_iterator_serializable0.enqueue((java.lang.Iterable<java.util.Iterator<java.io.Serializable>>) queue_iterator_serializable7);
        java.util.Spliterator<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>> spliterator_iterable_iterator_serializable11 = queue_iterable_iterator_serializable0.spliterator();
        java.lang.Iterable<java.util.Iterator<java.io.Serializable>> iterable_iterator_serializable12 = queue_iterable_iterator_serializable0.dequeue();
        org.junit.Assert.assertNotNull(iterator_iterable_iterator_serializable1);
        org.junit.Assert.assertNotNull(spliterator_iterable_iterator_serializable2);
        org.junit.Assert.assertNotNull(spliterator_iterable_iterator_serializable3);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertNotNull(iterator_iterable_iterator_serializable6);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertNotNull(spliterator_iterable_iterator_serializable11);
        org.junit.Assert.assertNotNull(iterable_iterator_serializable12);
    }

    @Test
    public void test24() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test24");
        edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.lang.Object>>> queue_iterable_iterator_obj0 = new edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.lang.Object>>>();
        edu.osu.cs362.Queue<java.util.Iterator<java.lang.Object>> queue_iterator_obj1 = new edu.osu.cs362.Queue<java.util.Iterator<java.lang.Object>>();
        queue_iterable_iterator_obj0.enqueue((java.lang.Iterable<java.util.Iterator<java.lang.Object>>) queue_iterator_obj1);
        java.util.Iterator<java.util.Iterator<java.lang.Object>> iterator_iterator_obj3 = queue_iterator_obj1.iterator();
        edu.osu.cs362.Queue<java.util.Iterator<java.lang.Object>> queue_iterator_obj4 = new edu.osu.cs362.Queue<java.util.Iterator<java.lang.Object>>();
        edu.osu.cs362.Queue<java.lang.Object> queue_obj5 = new edu.osu.cs362.Queue<java.lang.Object>();
        java.util.Iterator<java.lang.Object> iterator_obj6 = queue_obj5.iterator();
        java.util.Iterator<java.lang.Object> iterator_obj7 = queue_obj5.iterator();
        queue_iterator_obj4.enqueue(iterator_obj7);
        queue_iterator_obj1.enqueue(iterator_obj7);
        java.util.Iterator<java.lang.Object> iterator_obj10 = queue_iterator_obj1.peek();
        org.junit.Assert.assertNotNull(iterator_iterator_obj3);
        org.junit.Assert.assertNotNull(iterator_obj6);
        org.junit.Assert.assertNotNull(iterator_obj7);
        org.junit.Assert.assertNotNull(iterator_obj10);
    }

    @Test
    public void test25() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test25");
        edu.osu.cs362.Queue<java.util.Spliterator<java.lang.Iterable<java.lang.Iterable<java.util.Iterator<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>>>> queue_spliterator_iterable_iterable_iterator_iterable_queue_iterable_iterator_serializable0 = new edu.osu.cs362.Queue<java.util.Spliterator<java.lang.Iterable<java.lang.Iterable<java.util.Iterator<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>>>>();
        boolean b1 = queue_spliterator_iterable_iterable_iterator_iterable_queue_iterable_iterator_serializable0.isEmpty();
        java.lang.String str2 = queue_spliterator_iterable_iterable_iterator_iterable_queue_iterable_iterator_serializable0.toString();
        java.util.Iterator<java.util.Spliterator<java.lang.Iterable<java.lang.Iterable<java.util.Iterator<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>>>> iterator_spliterator_iterable_iterable_iterator_iterable_queue_iterable_iterator_serializable3 = queue_spliterator_iterable_iterable_iterator_iterable_queue_iterable_iterator_serializable0.iterator();
        org.junit.Assert.assertTrue(b1 == true);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
        org.junit.Assert.assertNotNull(iterator_spliterator_iterable_iterable_iterator_iterable_queue_iterable_iterator_serializable3);
    }

    @Test
    public void test26() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test26");
        edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.lang.Iterable<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.lang.Object>>>>>>> queue_queue_iterable_iterable_queue_iterable_iterator_obj0 = new edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.lang.Iterable<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.lang.Object>>>>>>>();
        edu.osu.cs362.Queue<java.lang.Iterable<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.lang.Object>>>>>> queue_iterable_iterable_queue_iterable_iterator_obj1 = new edu.osu.cs362.Queue<java.lang.Iterable<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.lang.Object>>>>>>();
        boolean b2 = queue_iterable_iterable_queue_iterable_iterator_obj1.isEmpty();
        java.util.Spliterator<java.lang.Iterable<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.lang.Object>>>>>> spliterator_iterable_iterable_queue_iterable_iterator_obj3 = queue_iterable_iterable_queue_iterable_iterator_obj1.spliterator();
        queue_queue_iterable_iterable_queue_iterable_iterator_obj0.enqueue(queue_iterable_iterable_queue_iterable_iterator_obj1);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNotNull(spliterator_iterable_iterable_queue_iterable_iterator_obj3);
    }

    @Test
    public void test27() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test27");
        edu.osu.cs362.Queue<java.lang.Iterable<java.io.Serializable>> queue_iterable_serializable0 = new edu.osu.cs362.Queue<java.lang.Iterable<java.io.Serializable>>();
        int i1 = queue_iterable_serializable0.size();
        edu.osu.cs362.Queue<java.io.Serializable> queue_serializable2 = new edu.osu.cs362.Queue<java.io.Serializable>();
        queue_serializable2.enqueue((java.io.Serializable) 1L);
        java.lang.String str5 = queue_serializable2.toString();
        java.io.Serializable serializable6 = queue_serializable2.dequeue();
        java.util.Spliterator<java.io.Serializable> spliterator_serializable7 = queue_serializable2.spliterator();
        queue_iterable_serializable0.enqueue((java.lang.Iterable<java.io.Serializable>) queue_serializable2);
        java.util.Iterator<java.lang.Iterable<java.io.Serializable>> iterator_iterable_serializable9 = queue_iterable_serializable0.iterator();
        java.util.Iterator<java.lang.Iterable<java.io.Serializable>> iterator_iterable_serializable10 = queue_iterable_serializable0.iterator();
        java.util.Spliterator<java.lang.Iterable<java.io.Serializable>> spliterator_iterable_serializable11 = queue_iterable_serializable0.spliterator();
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "1 " + "'", str5.equals("1 "));
        org.junit.Assert.assertTrue("'" + serializable6 + "' != '" + 1L + "'", serializable6.equals(1L));
        org.junit.Assert.assertNotNull(spliterator_serializable7);
        org.junit.Assert.assertNotNull(iterator_iterable_serializable9);
        org.junit.Assert.assertNotNull(iterator_iterable_serializable10);
        org.junit.Assert.assertNotNull(spliterator_iterable_serializable11);
    }

    @Test
    public void test28() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test28");
        edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>> queue_iterable_iterator_iterable_iterator_serializable0 = new edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>();
        java.util.Iterator<java.lang.Iterable<java.util.Iterator<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>> iterator_iterable_iterator_iterable_iterator_serializable1 = queue_iterable_iterator_iterable_iterator_serializable0.iterator();
        java.util.Spliterator<java.lang.Iterable<java.util.Iterator<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>> spliterator_iterable_iterator_iterable_iterator_serializable2 = queue_iterable_iterator_iterable_iterator_serializable0.spliterator();
        java.util.Spliterator<java.lang.Iterable<java.util.Iterator<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>> spliterator_iterable_iterator_iterable_iterator_serializable3 = queue_iterable_iterator_iterable_iterator_serializable0.spliterator();
        org.junit.Assert.assertNotNull(iterator_iterable_iterator_iterable_iterator_serializable1);
        org.junit.Assert.assertNotNull(spliterator_iterable_iterator_iterable_iterator_serializable2);
        org.junit.Assert.assertNotNull(spliterator_iterable_iterator_iterable_iterator_serializable3);
    }

    @Test
    public void test29() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test29");
        edu.osu.cs362.Queue<java.util.Spliterator<java.lang.Iterable<java.lang.Iterable<java.util.Iterator<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>>>> queue_spliterator_iterable_iterable_iterator_iterable_queue_iterable_iterator_serializable0 = new edu.osu.cs362.Queue<java.util.Spliterator<java.lang.Iterable<java.lang.Iterable<java.util.Iterator<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>>>>();
        java.lang.String str1 = queue_spliterator_iterable_iterable_iterator_iterable_queue_iterable_iterator_serializable0.toString();
        java.util.Iterator<java.util.Spliterator<java.lang.Iterable<java.lang.Iterable<java.util.Iterator<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>>>> iterator_spliterator_iterable_iterable_iterator_iterable_queue_iterable_iterator_serializable2 = queue_spliterator_iterable_iterable_iterator_iterable_queue_iterable_iterator_serializable0.iterator();
        try {
            java.util.Spliterator<java.lang.Iterable<java.lang.Iterable<java.util.Iterator<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>>> spliterator_iterable_iterable_iterator_iterable_queue_iterable_iterator_serializable3 = queue_spliterator_iterable_iterable_iterator_iterable_queue_iterable_iterator_serializable0.dequeue();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException");
        } catch (java.util.NoSuchElementException e) {
        }
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertNotNull(iterator_spliterator_iterable_iterable_iterator_iterable_queue_iterable_iterator_serializable2);
    }

    @Test
    public void test30() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test30");
        edu.osu.cs362.Queue<java.util.Spliterator<java.util.Spliterator<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>> queue_spliterator_spliterator_iterable_queue_iterable_iterator_serializable0 = new edu.osu.cs362.Queue<java.util.Spliterator<java.util.Spliterator<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>>();
        int i1 = queue_spliterator_spliterator_iterable_queue_iterable_iterator_serializable0.size();
        java.lang.String str2 = queue_spliterator_spliterator_iterable_queue_iterable_iterator_serializable0.toString();
        edu.osu.cs362.Queue<java.util.Spliterator<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>> queue_spliterator_iterable_queue_iterable_iterator_serializable3 = new edu.osu.cs362.Queue<java.util.Spliterator<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>();
        boolean b4 = queue_spliterator_iterable_queue_iterable_iterator_serializable3.isEmpty();
        boolean b5 = queue_spliterator_iterable_queue_iterable_iterator_serializable3.isEmpty();
        java.util.Spliterator<java.util.Spliterator<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>> spliterator_spliterator_iterable_queue_iterable_iterator_serializable6 = queue_spliterator_iterable_queue_iterable_iterator_serializable3.spliterator();
        queue_spliterator_spliterator_iterable_queue_iterable_iterator_serializable0.enqueue(spliterator_spliterator_iterable_queue_iterable_iterator_serializable6);
        edu.osu.cs362.Queue<java.util.Spliterator<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>> queue_spliterator_iterable_queue_iterable_iterator_serializable8 = new edu.osu.cs362.Queue<java.util.Spliterator<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>();
        boolean b9 = queue_spliterator_iterable_queue_iterable_iterator_serializable8.isEmpty();
        boolean b10 = queue_spliterator_iterable_queue_iterable_iterator_serializable8.isEmpty();
        java.util.Spliterator<java.util.Spliterator<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>> spliterator_spliterator_iterable_queue_iterable_iterator_serializable11 = queue_spliterator_iterable_queue_iterable_iterator_serializable8.spliterator();
        queue_spliterator_spliterator_iterable_queue_iterable_iterator_serializable0.enqueue(spliterator_spliterator_iterable_queue_iterable_iterator_serializable11);
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertNotNull(spliterator_spliterator_iterable_queue_iterable_iterator_serializable6);
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertNotNull(spliterator_spliterator_iterable_queue_iterable_iterator_serializable11);
    }

    @Test
    public void test31() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test31");
        edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>> queue_iterable_iterator_serializable0 = new edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>();
        java.util.Iterator<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>> iterator_iterable_iterator_serializable1 = queue_iterable_iterator_serializable0.iterator();
        java.util.Spliterator<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>> spliterator_iterable_iterator_serializable2 = queue_iterable_iterator_serializable0.spliterator();
        int i3 = queue_iterable_iterator_serializable0.size();
        org.junit.Assert.assertNotNull(iterator_iterable_iterator_serializable1);
        org.junit.Assert.assertNotNull(spliterator_iterable_iterator_serializable2);
        org.junit.Assert.assertTrue(i3 == 0);
    }

    @Test
    public void test32() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test32");
        edu.osu.cs362.Queue<java.lang.Iterable<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.lang.Object>>>>>> queue_iterable_iterable_queue_iterable_iterator_obj0 = new edu.osu.cs362.Queue<java.lang.Iterable<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.lang.Object>>>>>>();
        java.lang.String str1 = queue_iterable_iterable_queue_iterable_iterator_obj0.toString();
        java.util.Spliterator<java.lang.Iterable<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.lang.Object>>>>>> spliterator_iterable_iterable_queue_iterable_iterator_obj2 = queue_iterable_iterable_queue_iterable_iterator_obj0.spliterator();
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertNotNull(spliterator_iterable_iterable_queue_iterable_iterator_obj2);
    }

    @Test
    public void test33() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test33");
        edu.osu.cs362.Queue<java.lang.Iterable<java.lang.Iterable<java.lang.Iterable<java.lang.Object>>>> queue_iterable_iterable_iterable_obj0 = new edu.osu.cs362.Queue<java.lang.Iterable<java.lang.Iterable<java.lang.Iterable<java.lang.Object>>>>();
        java.util.Iterator<java.lang.Iterable<java.lang.Iterable<java.lang.Iterable<java.lang.Object>>>> iterator_iterable_iterable_iterable_obj1 = queue_iterable_iterable_iterable_obj0.iterator();
        edu.osu.cs362.Queue<java.lang.Iterable<java.lang.Iterable<java.lang.Object>>> queue_iterable_iterable_obj2 = new edu.osu.cs362.Queue<java.lang.Iterable<java.lang.Iterable<java.lang.Object>>>();
        queue_iterable_iterable_iterable_obj0.enqueue((java.lang.Iterable<java.lang.Iterable<java.lang.Iterable<java.lang.Object>>>) queue_iterable_iterable_obj2);
        int i4 = queue_iterable_iterable_iterable_obj0.size();
        int i5 = queue_iterable_iterable_iterable_obj0.size();
        java.util.Iterator<java.lang.Iterable<java.lang.Iterable<java.lang.Iterable<java.lang.Object>>>> iterator_iterable_iterable_iterable_obj6 = queue_iterable_iterable_iterable_obj0.iterator();
        int i7 = queue_iterable_iterable_iterable_obj0.size();
        int i8 = queue_iterable_iterable_iterable_obj0.size();
        org.junit.Assert.assertNotNull(iterator_iterable_iterable_iterable_obj1);
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertTrue(i5 == 1);
        org.junit.Assert.assertNotNull(iterator_iterable_iterable_iterable_obj6);
        org.junit.Assert.assertTrue(i7 == 1);
        org.junit.Assert.assertTrue(i8 == 1);
    }

    @Test
    public void test34() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test34");
        edu.osu.cs362.Queue<java.lang.Iterable<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>> queue_iterable_iterable_iterator_serializable0 = new edu.osu.cs362.Queue<java.lang.Iterable<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>();
        java.util.Iterator<java.lang.Iterable<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>> iterator_iterable_iterable_iterator_serializable1 = queue_iterable_iterable_iterator_serializable0.iterator();
        java.util.Spliterator<java.lang.Iterable<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>> spliterator_iterable_iterable_iterator_serializable2 = queue_iterable_iterable_iterator_serializable0.spliterator();
        java.util.Spliterator<java.lang.Iterable<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>> spliterator_iterable_iterable_iterator_serializable3 = queue_iterable_iterable_iterator_serializable0.spliterator();
        edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>> queue_queue_iterable_iterator_serializable4 = new edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>();
        boolean b5 = queue_queue_iterable_iterator_serializable4.isEmpty();
        boolean b6 = queue_queue_iterable_iterator_serializable4.isEmpty();
        java.lang.String str7 = queue_queue_iterable_iterator_serializable4.toString();
        edu.osu.cs362.Queue<java.lang.Iterable<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>> queue_iterable_iterable_iterator_serializable8 = new edu.osu.cs362.Queue<java.lang.Iterable<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>();
        java.util.Iterator<java.lang.Iterable<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>> iterator_iterable_iterable_iterator_serializable9 = queue_iterable_iterable_iterator_serializable8.iterator();
        java.util.Spliterator<java.lang.Iterable<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>> spliterator_iterable_iterable_iterator_serializable10 = queue_iterable_iterable_iterator_serializable8.spliterator();
        edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>> queue_iterable_iterator_serializable11 = new edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>();
        java.util.Iterator<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>> iterator_iterable_iterator_serializable12 = queue_iterable_iterator_serializable11.iterator();
        java.util.Spliterator<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>> spliterator_iterable_iterator_serializable13 = queue_iterable_iterator_serializable11.spliterator();
        java.util.Spliterator<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>> spliterator_iterable_iterator_serializable14 = queue_iterable_iterator_serializable11.spliterator();
        int i15 = queue_iterable_iterator_serializable11.size();
        java.lang.String str16 = queue_iterable_iterator_serializable11.toString();
        java.util.Iterator<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>> iterator_iterable_iterator_serializable17 = queue_iterable_iterator_serializable11.iterator();
        edu.osu.cs362.Queue<java.util.Iterator<java.io.Serializable>> queue_iterator_serializable18 = new edu.osu.cs362.Queue<java.util.Iterator<java.io.Serializable>>();
        java.lang.String str19 = queue_iterator_serializable18.toString();
        int i20 = queue_iterator_serializable18.size();
        queue_iterable_iterator_serializable11.enqueue((java.lang.Iterable<java.util.Iterator<java.io.Serializable>>) queue_iterator_serializable18);
        boolean b22 = queue_iterable_iterator_serializable11.isEmpty();
        queue_iterable_iterable_iterator_serializable8.enqueue((java.lang.Iterable<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>) queue_iterable_iterator_serializable11);
        queue_queue_iterable_iterator_serializable4.enqueue(queue_iterable_iterator_serializable11);
        queue_iterable_iterable_iterator_serializable0.enqueue((java.lang.Iterable<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>) queue_iterable_iterator_serializable11);
        org.junit.Assert.assertNotNull(iterator_iterable_iterable_iterator_serializable1);
        org.junit.Assert.assertNotNull(spliterator_iterable_iterable_iterator_serializable2);
        org.junit.Assert.assertNotNull(spliterator_iterable_iterable_iterator_serializable3);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertNotNull(iterator_iterable_iterable_iterator_serializable9);
        org.junit.Assert.assertNotNull(spliterator_iterable_iterable_iterator_serializable10);
        org.junit.Assert.assertNotNull(iterator_iterable_iterator_serializable12);
        org.junit.Assert.assertNotNull(spliterator_iterable_iterator_serializable13);
        org.junit.Assert.assertNotNull(spliterator_iterable_iterator_serializable14);
        org.junit.Assert.assertTrue(i15 == 0);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
        org.junit.Assert.assertNotNull(iterator_iterable_iterator_serializable17);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "" + "'", str19.equals(""));
        org.junit.Assert.assertTrue(i20 == 0);
        org.junit.Assert.assertTrue(b22 == false);
    }

    @Test
    public void test35() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test35");
        edu.osu.cs362.Queue<java.util.Iterator<java.lang.Iterable<edu.osu.cs362.Queue<edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>>>>> queue_iterator_iterable_queue_queue_queue_iterable_queue_iterable_iterator_serializable0 = new edu.osu.cs362.Queue<java.util.Iterator<java.lang.Iterable<edu.osu.cs362.Queue<edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>>>>>();
        boolean b1 = queue_iterator_iterable_queue_queue_queue_iterable_queue_iterable_iterator_serializable0.isEmpty();
        try {
            java.util.Iterator<java.lang.Iterable<edu.osu.cs362.Queue<edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>>>> iterator_iterable_queue_queue_queue_iterable_queue_iterable_iterator_serializable2 = queue_iterator_iterable_queue_queue_queue_iterable_queue_iterable_iterator_serializable0.peek();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException");
        } catch (java.util.NoSuchElementException e) {
        }
        org.junit.Assert.assertTrue(b1 == true);
    }

    @Test
    public void test36() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test36");
        edu.osu.cs362.Queue<java.util.Spliterator<java.util.Iterator<java.io.Serializable>>> queue_spliterator_iterator_serializable0 = new edu.osu.cs362.Queue<java.util.Spliterator<java.util.Iterator<java.io.Serializable>>>();
        java.lang.String str1 = queue_spliterator_iterator_serializable0.toString();
        java.util.Spliterator<java.util.Spliterator<java.util.Iterator<java.io.Serializable>>> spliterator_spliterator_iterator_serializable2 = queue_spliterator_iterator_serializable0.spliterator();
        boolean b3 = queue_spliterator_iterator_serializable0.isEmpty();
        java.util.Spliterator<java.util.Spliterator<java.util.Iterator<java.io.Serializable>>> spliterator_spliterator_iterator_serializable4 = queue_spliterator_iterator_serializable0.spliterator();
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertNotNull(spliterator_spliterator_iterator_serializable2);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertNotNull(spliterator_spliterator_iterator_serializable4);
    }

    @Test
    public void test37() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test37");
        edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.lang.Object>>> queue_iterable_iterator_obj0 = new edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.lang.Object>>>();
        edu.osu.cs362.Queue<java.util.Iterator<java.lang.Object>> queue_iterator_obj1 = new edu.osu.cs362.Queue<java.util.Iterator<java.lang.Object>>();
        queue_iterable_iterator_obj0.enqueue((java.lang.Iterable<java.util.Iterator<java.lang.Object>>) queue_iterator_obj1);
        edu.osu.cs362.Queue<java.util.Iterator<java.lang.Object>> queue_iterator_obj3 = new edu.osu.cs362.Queue<java.util.Iterator<java.lang.Object>>();
        queue_iterable_iterator_obj0.enqueue((java.lang.Iterable<java.util.Iterator<java.lang.Object>>) queue_iterator_obj3);
        edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.lang.Object>>> queue_iterable_iterator_obj5 = new edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.lang.Object>>>();
        edu.osu.cs362.Queue<java.util.Iterator<java.lang.Object>> queue_iterator_obj6 = new edu.osu.cs362.Queue<java.util.Iterator<java.lang.Object>>();
        queue_iterable_iterator_obj5.enqueue((java.lang.Iterable<java.util.Iterator<java.lang.Object>>) queue_iterator_obj6);
        edu.osu.cs362.Queue<java.util.Iterator<java.lang.Object>> queue_iterator_obj8 = new edu.osu.cs362.Queue<java.util.Iterator<java.lang.Object>>();
        queue_iterable_iterator_obj5.enqueue((java.lang.Iterable<java.util.Iterator<java.lang.Object>>) queue_iterator_obj8);
        java.lang.Iterable<java.util.Iterator<java.lang.Object>> iterable_iterator_obj10 = queue_iterable_iterator_obj5.peek();
        int i11 = queue_iterable_iterator_obj5.size();
        java.lang.Iterable<java.util.Iterator<java.lang.Object>> iterable_iterator_obj12 = queue_iterable_iterator_obj5.peek();
        queue_iterable_iterator_obj0.enqueue(iterable_iterator_obj12);
        org.junit.Assert.assertNotNull(iterable_iterator_obj10);
        org.junit.Assert.assertTrue(i11 == 2);
        org.junit.Assert.assertNotNull(iterable_iterator_obj12);
    }

    @Test
    public void test38() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test38");
        edu.osu.cs362.Queue<java.util.Iterator<java.util.Iterator<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>> queue_iterator_iterator_queue_iterable_iterator_serializable0 = new edu.osu.cs362.Queue<java.util.Iterator<java.util.Iterator<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>();
        java.util.Spliterator<java.util.Iterator<java.util.Iterator<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>> spliterator_iterator_iterator_queue_iterable_iterator_serializable1 = queue_iterator_iterator_queue_iterable_iterator_serializable0.spliterator();
        int i2 = queue_iterator_iterator_queue_iterable_iterator_serializable0.size();
        org.junit.Assert.assertNotNull(spliterator_iterator_iterator_queue_iterable_iterator_serializable1);
        org.junit.Assert.assertTrue(i2 == 0);
    }

    @Test
    public void test39() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test39");
        edu.osu.cs362.Queue<java.util.Spliterator<java.util.Spliterator<java.util.Iterator<java.io.Serializable>>>> queue_spliterator_spliterator_iterator_serializable0 = new edu.osu.cs362.Queue<java.util.Spliterator<java.util.Spliterator<java.util.Iterator<java.io.Serializable>>>>();
        java.lang.String str1 = queue_spliterator_spliterator_iterator_serializable0.toString();
        try {
            java.util.Spliterator<java.util.Spliterator<java.util.Iterator<java.io.Serializable>>> spliterator_spliterator_iterator_serializable2 = queue_spliterator_spliterator_iterator_serializable0.dequeue();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException");
        } catch (java.util.NoSuchElementException e) {
        }
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
    }

    @Test
    public void test40() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test40");
        edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>> queue_queue_iterable_iterator_serializable0 = new edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>();
        boolean b1 = queue_queue_iterable_iterator_serializable0.isEmpty();
        boolean b2 = queue_queue_iterable_iterator_serializable0.isEmpty();
        boolean b3 = queue_queue_iterable_iterator_serializable0.isEmpty();
        int i4 = queue_queue_iterable_iterator_serializable0.size();
        int i5 = queue_queue_iterable_iterator_serializable0.size();
        int i6 = queue_queue_iterable_iterator_serializable0.size();
        org.junit.Assert.assertTrue(b1 == true);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(i4 == 0);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
    }

    @Test
    public void test41() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test41");
        edu.osu.cs362.Queue<edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.lang.Comparable<java.lang.String>>>> queue_queue_queue_comparable_str0 = new edu.osu.cs362.Queue<edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.lang.Comparable<java.lang.String>>>>();
        edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.lang.Comparable<java.lang.String>>> queue_queue_comparable_str1 = new edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.lang.Comparable<java.lang.String>>>();
        edu.osu.cs362.Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str2 = new edu.osu.cs362.Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str2.enqueue((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str5 = queue_comparable_str2.dequeue();
        queue_queue_comparable_str1.enqueue(queue_comparable_str2);
        queue_queue_queue_comparable_str0.enqueue(queue_queue_comparable_str1);
        java.lang.String str8 = queue_queue_comparable_str1.toString();
        edu.osu.cs362.Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str9 = queue_queue_comparable_str1.peek();
        java.util.Spliterator<edu.osu.cs362.Queue<java.lang.Comparable<java.lang.String>>> spliterator_queue_comparable_str10 = queue_queue_comparable_str1.spliterator();
        java.util.Spliterator<edu.osu.cs362.Queue<java.lang.Comparable<java.lang.String>>> spliterator_queue_comparable_str11 = queue_queue_comparable_str1.spliterator();
        org.junit.Assert.assertTrue("'" + comparable_str5 + "' != '" + "hi!" + "'", comparable_str5.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + " " + "'", str8.equals(" "));
        org.junit.Assert.assertNotNull(queue_comparable_str9);
        org.junit.Assert.assertNotNull(spliterator_queue_comparable_str10);
        org.junit.Assert.assertNotNull(spliterator_queue_comparable_str11);
    }

    @Test
    public void test42() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test42");
        edu.osu.cs362.Queue<java.util.Spliterator<java.util.Iterator<java.lang.Iterable<java.util.Iterator<edu.osu.cs362.Queue<java.io.Serializable>>>>>> queue_spliterator_iterator_iterable_iterator_queue_serializable0 = new edu.osu.cs362.Queue<java.util.Spliterator<java.util.Iterator<java.lang.Iterable<java.util.Iterator<edu.osu.cs362.Queue<java.io.Serializable>>>>>>();
        boolean b1 = queue_spliterator_iterator_iterable_iterator_queue_serializable0.isEmpty();
        int i2 = queue_spliterator_iterator_iterable_iterator_queue_serializable0.size();
        edu.osu.cs362.Queue<java.util.Iterator<java.lang.Iterable<java.util.Iterator<edu.osu.cs362.Queue<java.io.Serializable>>>>> queue_iterator_iterable_iterator_queue_serializable3 = new edu.osu.cs362.Queue<java.util.Iterator<java.lang.Iterable<java.util.Iterator<edu.osu.cs362.Queue<java.io.Serializable>>>>>();
        edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<edu.osu.cs362.Queue<java.io.Serializable>>>> queue_iterable_iterator_queue_serializable4 = new edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<edu.osu.cs362.Queue<java.io.Serializable>>>>();
        java.util.Iterator<java.lang.Iterable<java.util.Iterator<edu.osu.cs362.Queue<java.io.Serializable>>>> iterator_iterable_iterator_queue_serializable5 = queue_iterable_iterator_queue_serializable4.iterator();
        queue_iterator_iterable_iterator_queue_serializable3.enqueue(iterator_iterable_iterator_queue_serializable5);
        java.util.Iterator<java.util.Iterator<java.lang.Iterable<java.util.Iterator<edu.osu.cs362.Queue<java.io.Serializable>>>>> iterator_iterator_iterable_iterator_queue_serializable7 = queue_iterator_iterable_iterator_queue_serializable3.iterator();
        java.util.Spliterator<java.util.Iterator<java.lang.Iterable<java.util.Iterator<edu.osu.cs362.Queue<java.io.Serializable>>>>> spliterator_iterator_iterable_iterator_queue_serializable8 = queue_iterator_iterable_iterator_queue_serializable3.spliterator();
        queue_spliterator_iterator_iterable_iterator_queue_serializable0.enqueue(spliterator_iterator_iterable_iterator_queue_serializable8);
        org.junit.Assert.assertTrue(b1 == true);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNotNull(iterator_iterable_iterator_queue_serializable5);
        org.junit.Assert.assertNotNull(iterator_iterator_iterable_iterator_queue_serializable7);
        org.junit.Assert.assertNotNull(spliterator_iterator_iterable_iterator_queue_serializable8);
    }

    @Test
    public void test43() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test43");
        edu.osu.cs362.Queue<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.lang.Object>>>>> queue_iterable_queue_iterable_iterator_obj0 = new edu.osu.cs362.Queue<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.lang.Object>>>>>();
        boolean b1 = queue_iterable_queue_iterable_iterator_obj0.isEmpty();
        java.util.Spliterator<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.lang.Object>>>>> spliterator_iterable_queue_iterable_iterator_obj2 = queue_iterable_queue_iterable_iterator_obj0.spliterator();
        try {
            java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.lang.Object>>>> iterable_queue_iterable_iterator_obj3 = queue_iterable_queue_iterable_iterator_obj0.dequeue();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException");
        } catch (java.util.NoSuchElementException e) {
        }
        org.junit.Assert.assertTrue(b1 == true);
        org.junit.Assert.assertNotNull(spliterator_iterable_queue_iterable_iterator_obj2);
    }

    @Test
    public void test44() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test44");
        edu.osu.cs362.Queue<edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.lang.Comparable<java.lang.String>>>> queue_queue_queue_comparable_str0 = new edu.osu.cs362.Queue<edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.lang.Comparable<java.lang.String>>>>();
        edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.lang.Comparable<java.lang.String>>> queue_queue_comparable_str1 = new edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.lang.Comparable<java.lang.String>>>();
        edu.osu.cs362.Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str2 = new edu.osu.cs362.Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str2.enqueue((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str5 = queue_comparable_str2.dequeue();
        queue_queue_comparable_str1.enqueue(queue_comparable_str2);
        queue_queue_queue_comparable_str0.enqueue(queue_queue_comparable_str1);
        java.util.Spliterator<edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.lang.Comparable<java.lang.String>>>> spliterator_queue_queue_comparable_str8 = queue_queue_queue_comparable_str0.spliterator();
        edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.lang.Comparable<java.lang.String>>> queue_queue_comparable_str9 = queue_queue_queue_comparable_str0.peek();
        org.junit.Assert.assertTrue("'" + comparable_str5 + "' != '" + "hi!" + "'", comparable_str5.equals("hi!"));
        org.junit.Assert.assertNotNull(spliterator_queue_queue_comparable_str8);
        org.junit.Assert.assertNotNull(queue_queue_comparable_str9);
    }

    @Test
    public void test45() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test45");
        edu.osu.cs362.Queue<java.util.Iterator<edu.osu.cs362.Queue<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>> queue_iterator_queue_iterable_queue_iterable_iterator_serializable0 = new edu.osu.cs362.Queue<java.util.Iterator<edu.osu.cs362.Queue<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>>();
        java.util.Spliterator<java.util.Iterator<edu.osu.cs362.Queue<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>> spliterator_iterator_queue_iterable_queue_iterable_iterator_serializable1 = queue_iterator_queue_iterable_queue_iterable_iterator_serializable0.spliterator();
        boolean b2 = queue_iterator_queue_iterable_queue_iterable_iterator_serializable0.isEmpty();
        java.lang.String str3 = queue_iterator_queue_iterable_queue_iterable_iterator_serializable0.toString();
        org.junit.Assert.assertNotNull(spliterator_iterator_queue_iterable_queue_iterable_iterator_serializable1);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
    }

    @Test
    public void test46() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test46");
        edu.osu.cs362.Queue<java.util.Iterator<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>>> queue_iterator_iterable_queue_iterable_queue_iterable_iterator_serializable0 = new edu.osu.cs362.Queue<java.util.Iterator<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>>>();
        edu.osu.cs362.Queue<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>> queue_iterable_queue_iterable_queue_iterable_iterator_serializable1 = new edu.osu.cs362.Queue<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>>();
        boolean b2 = queue_iterable_queue_iterable_queue_iterable_iterator_serializable1.isEmpty();
        boolean b3 = queue_iterable_queue_iterable_queue_iterable_iterator_serializable1.isEmpty();
        java.lang.String str4 = queue_iterable_queue_iterable_queue_iterable_iterator_serializable1.toString();
        int i5 = queue_iterable_queue_iterable_queue_iterable_iterator_serializable1.size();
        boolean b6 = queue_iterable_queue_iterable_queue_iterable_iterator_serializable1.isEmpty();
        java.util.Iterator<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>> iterator_iterable_queue_iterable_queue_iterable_iterator_serializable7 = queue_iterable_queue_iterable_queue_iterable_iterator_serializable1.iterator();
        queue_iterator_iterable_queue_iterable_queue_iterable_iterator_serializable0.enqueue(iterator_iterable_queue_iterable_queue_iterable_iterator_serializable7);
        java.lang.String str9 = queue_iterator_iterable_queue_iterable_queue_iterable_iterator_serializable0.toString();
        java.util.Iterator<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>> iterator_iterable_queue_iterable_queue_iterable_iterator_serializable10 = queue_iterator_iterable_queue_iterable_queue_iterable_iterator_serializable0.peek();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertNotNull(iterator_iterable_queue_iterable_queue_iterable_iterator_serializable7);
        org.junit.Assert.assertNotNull(iterator_iterable_queue_iterable_queue_iterable_iterator_serializable10);
    }

    @Test
    public void test47() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test47");
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
        java.lang.String str31 = queue_iterable_obj13.toString();
        java.lang.Iterable<java.lang.Object> iterable_obj32 = queue_iterable_obj13.peek();
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
        org.junit.Assert.assertNotNull(iterable_obj32);
    }

    @Test
    public void test48() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test48");
        edu.osu.cs362.Queue<java.lang.Iterable<java.lang.Iterable<java.lang.Iterable<java.lang.Object>>>> queue_iterable_iterable_iterable_obj0 = new edu.osu.cs362.Queue<java.lang.Iterable<java.lang.Iterable<java.lang.Iterable<java.lang.Object>>>>();
        java.util.Iterator<java.lang.Iterable<java.lang.Iterable<java.lang.Iterable<java.lang.Object>>>> iterator_iterable_iterable_iterable_obj1 = queue_iterable_iterable_iterable_obj0.iterator();
        int i2 = queue_iterable_iterable_iterable_obj0.size();
        int i3 = queue_iterable_iterable_iterable_obj0.size();
        edu.osu.cs362.Queue<java.lang.Iterable<java.lang.Iterable<java.lang.Object>>> queue_iterable_iterable_obj4 = new edu.osu.cs362.Queue<java.lang.Iterable<java.lang.Iterable<java.lang.Object>>>();
        boolean b5 = queue_iterable_iterable_obj4.isEmpty();
        java.lang.String str6 = queue_iterable_iterable_obj4.toString();
        queue_iterable_iterable_iterable_obj0.enqueue((java.lang.Iterable<java.lang.Iterable<java.lang.Iterable<java.lang.Object>>>) queue_iterable_iterable_obj4);
        java.util.Iterator<java.lang.Iterable<java.lang.Iterable<java.lang.Iterable<java.lang.Object>>>> iterator_iterable_iterable_iterable_obj8 = queue_iterable_iterable_iterable_obj0.iterator();
        org.junit.Assert.assertNotNull(iterator_iterable_iterable_iterable_obj1);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertNotNull(iterator_iterable_iterable_iterable_obj8);
    }

    @Test
    public void test49() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test49");
        edu.osu.cs362.Queue<java.lang.Iterable<java.lang.Iterable<java.lang.Iterable<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.lang.Object>>>>>>>> queue_iterable_iterable_iterable_iterable_queue_iterable_iterator_obj0 = new edu.osu.cs362.Queue<java.lang.Iterable<java.lang.Iterable<java.lang.Iterable<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.lang.Object>>>>>>>>();
        boolean b1 = queue_iterable_iterable_iterable_iterable_queue_iterable_iterator_obj0.isEmpty();
        org.junit.Assert.assertTrue(b1 == true);
    }

    @Test
    public void test50() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test50");
        edu.osu.cs362.Queue<java.util.Iterator<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>>> queue_iterator_iterable_queue_iterable_queue_iterable_iterator_serializable0 = new edu.osu.cs362.Queue<java.util.Iterator<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>>>();
        edu.osu.cs362.Queue<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>> queue_iterable_queue_iterable_queue_iterable_iterator_serializable1 = new edu.osu.cs362.Queue<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>>();
        boolean b2 = queue_iterable_queue_iterable_queue_iterable_iterator_serializable1.isEmpty();
        boolean b3 = queue_iterable_queue_iterable_queue_iterable_iterator_serializable1.isEmpty();
        java.lang.String str4 = queue_iterable_queue_iterable_queue_iterable_iterator_serializable1.toString();
        int i5 = queue_iterable_queue_iterable_queue_iterable_iterator_serializable1.size();
        boolean b6 = queue_iterable_queue_iterable_queue_iterable_iterator_serializable1.isEmpty();
        java.util.Iterator<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>> iterator_iterable_queue_iterable_queue_iterable_iterator_serializable7 = queue_iterable_queue_iterable_queue_iterable_iterator_serializable1.iterator();
        queue_iterator_iterable_queue_iterable_queue_iterable_iterator_serializable0.enqueue(iterator_iterable_queue_iterable_queue_iterable_iterator_serializable7);
        java.lang.String str9 = queue_iterator_iterable_queue_iterable_queue_iterable_iterator_serializable0.toString();
        java.util.Iterator<java.util.Iterator<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>>> iterator_iterator_iterable_queue_iterable_queue_iterable_iterator_serializable10 = queue_iterator_iterable_queue_iterable_queue_iterable_iterator_serializable0.iterator();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertNotNull(iterator_iterable_queue_iterable_queue_iterable_iterator_serializable7);
        org.junit.Assert.assertNotNull(iterator_iterator_iterable_queue_iterable_queue_iterable_iterator_serializable10);
    }

    @Test
    public void test51() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test51");
        edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<edu.osu.cs362.Queue<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>>> queue_iterable_iterator_queue_iterable_queue_iterable_iterator_serializable0 = new edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<edu.osu.cs362.Queue<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>>>();
        java.util.Spliterator<java.lang.Iterable<java.util.Iterator<edu.osu.cs362.Queue<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>>> spliterator_iterable_iterator_queue_iterable_queue_iterable_iterator_serializable1 = queue_iterable_iterator_queue_iterable_queue_iterable_iterator_serializable0.spliterator();
        org.junit.Assert.assertNotNull(spliterator_iterable_iterator_queue_iterable_queue_iterable_iterator_serializable1);
    }

    @Test
    public void test52() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test52");
        edu.osu.cs362.Queue<java.lang.Iterable<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.lang.Object>>>>>> queue_iterable_iterable_queue_iterable_iterator_obj0 = new edu.osu.cs362.Queue<java.lang.Iterable<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.lang.Object>>>>>>();
        boolean b1 = queue_iterable_iterable_queue_iterable_iterator_obj0.isEmpty();
        java.util.Spliterator<java.lang.Iterable<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.lang.Object>>>>>> spliterator_iterable_iterable_queue_iterable_iterator_obj2 = queue_iterable_iterable_queue_iterable_iterator_obj0.spliterator();
        try {
            java.lang.Iterable<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.lang.Object>>>>> iterable_iterable_queue_iterable_iterator_obj3 = queue_iterable_iterable_queue_iterable_iterator_obj0.peek();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException");
        } catch (java.util.NoSuchElementException e) {
        }
        org.junit.Assert.assertTrue(b1 == true);
        org.junit.Assert.assertNotNull(spliterator_iterable_iterable_queue_iterable_iterator_obj2);
    }

    @Test
    public void test53() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test53");
        edu.osu.cs362.Queue<java.util.Iterator<java.util.Spliterator<java.lang.Iterable<java.lang.Iterable<java.util.Iterator<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>>>>> queue_iterator_spliterator_iterable_iterable_iterator_iterable_queue_iterable_iterator_serializable0 = new edu.osu.cs362.Queue<java.util.Iterator<java.util.Spliterator<java.lang.Iterable<java.lang.Iterable<java.util.Iterator<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>>>>>();
        java.util.Spliterator<java.util.Iterator<java.util.Spliterator<java.lang.Iterable<java.lang.Iterable<java.util.Iterator<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>>>>> spliterator_iterator_spliterator_iterable_iterable_iterator_iterable_queue_iterable_iterator_serializable1 = queue_iterator_spliterator_iterable_iterable_iterator_iterable_queue_iterable_iterator_serializable0.spliterator();
        java.util.Iterator<java.util.Iterator<java.util.Spliterator<java.lang.Iterable<java.lang.Iterable<java.util.Iterator<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>>>>> iterator_iterator_spliterator_iterable_iterable_iterator_iterable_queue_iterable_iterator_serializable2 = queue_iterator_spliterator_iterable_iterable_iterator_iterable_queue_iterable_iterator_serializable0.iterator();
        int i3 = queue_iterator_spliterator_iterable_iterable_iterator_iterable_queue_iterable_iterator_serializable0.size();
        java.lang.String str4 = queue_iterator_spliterator_iterable_iterable_iterator_iterable_queue_iterable_iterator_serializable0.toString();
        org.junit.Assert.assertNotNull(spliterator_iterator_spliterator_iterable_iterable_iterator_iterable_queue_iterable_iterator_serializable1);
        org.junit.Assert.assertNotNull(iterator_iterator_spliterator_iterable_iterable_iterator_iterable_queue_iterable_iterator_serializable2);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
    }

    @Test
    public void test54() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test54");
        edu.osu.cs362.Queue<edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.lang.Comparable<java.lang.String>>>> queue_queue_queue_comparable_str0 = new edu.osu.cs362.Queue<edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.lang.Comparable<java.lang.String>>>>();
        edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.lang.Comparable<java.lang.String>>> queue_queue_comparable_str1 = new edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.lang.Comparable<java.lang.String>>>();
        edu.osu.cs362.Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str2 = new edu.osu.cs362.Queue<java.lang.Comparable<java.lang.String>>();
        queue_comparable_str2.enqueue((java.lang.Comparable<java.lang.String>) "hi!");
        java.lang.Comparable<java.lang.String> comparable_str5 = queue_comparable_str2.dequeue();
        queue_queue_comparable_str1.enqueue(queue_comparable_str2);
        queue_queue_queue_comparable_str0.enqueue(queue_queue_comparable_str1);
        java.lang.String str8 = queue_queue_comparable_str1.toString();
        edu.osu.cs362.Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str9 = queue_queue_comparable_str1.peek();
        edu.osu.cs362.Queue<java.lang.Comparable<java.lang.String>> queue_comparable_str10 = queue_queue_comparable_str1.peek();
        org.junit.Assert.assertTrue("'" + comparable_str5 + "' != '" + "hi!" + "'", comparable_str5.equals("hi!"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + " " + "'", str8.equals(" "));
        org.junit.Assert.assertNotNull(queue_comparable_str9);
        org.junit.Assert.assertNotNull(queue_comparable_str10);
    }

    @Test
    public void test55() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test55");
        edu.osu.cs362.Queue<java.util.Iterator<java.util.Iterator<java.util.Iterator<java.lang.Object>>>> queue_iterator_iterator_iterator_obj0 = new edu.osu.cs362.Queue<java.util.Iterator<java.util.Iterator<java.util.Iterator<java.lang.Object>>>>();
        boolean b1 = queue_iterator_iterator_iterator_obj0.isEmpty();
        java.lang.String str2 = queue_iterator_iterator_iterator_obj0.toString();
        java.util.Iterator<java.util.Iterator<java.util.Iterator<java.util.Iterator<java.lang.Object>>>> iterator_iterator_iterator_iterator_obj3 = queue_iterator_iterator_iterator_obj0.iterator();
        java.lang.String str4 = queue_iterator_iterator_iterator_obj0.toString();
        try {
            java.util.Iterator<java.util.Iterator<java.util.Iterator<java.lang.Object>>> iterator_iterator_iterator_obj5 = queue_iterator_iterator_iterator_obj0.dequeue();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException");
        } catch (java.util.NoSuchElementException e) {
        }
        org.junit.Assert.assertTrue(b1 == true);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
        org.junit.Assert.assertNotNull(iterator_iterator_iterator_iterator_obj3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
    }

    @Test
    public void test56() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test56");
        edu.osu.cs362.Queue<java.util.Iterator<edu.osu.cs362.Queue<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>> queue_iterator_queue_iterable_queue_iterable_iterator_serializable0 = new edu.osu.cs362.Queue<java.util.Iterator<edu.osu.cs362.Queue<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>>();
        java.util.Iterator<java.util.Iterator<edu.osu.cs362.Queue<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>> iterator_iterator_queue_iterable_queue_iterable_iterator_serializable1 = queue_iterator_queue_iterable_queue_iterable_iterator_serializable0.iterator();
        org.junit.Assert.assertNotNull(iterator_iterator_queue_iterable_queue_iterable_iterator_serializable1);
    }

    @Test
    public void test57() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test57");
        edu.osu.cs362.Queue<java.util.Iterator<java.util.Spliterator<java.io.Serializable>>> queue_iterator_spliterator_serializable0 = new edu.osu.cs362.Queue<java.util.Iterator<java.util.Spliterator<java.io.Serializable>>>();
        java.util.Spliterator<java.util.Iterator<java.util.Spliterator<java.io.Serializable>>> spliterator_iterator_spliterator_serializable1 = queue_iterator_spliterator_serializable0.spliterator();
        boolean b2 = queue_iterator_spliterator_serializable0.isEmpty();
        org.junit.Assert.assertNotNull(spliterator_iterator_spliterator_serializable1);
        org.junit.Assert.assertTrue(b2 == true);
    }

    @Test
    public void test58() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test58");
        edu.osu.cs362.Queue<edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>> queue_queue_queue_iterable_iterator_serializable0 = new edu.osu.cs362.Queue<edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>();
        edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>> queue_queue_iterable_iterator_serializable1 = new edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>();
        boolean b2 = queue_queue_iterable_iterator_serializable1.isEmpty();
        boolean b3 = queue_queue_iterable_iterator_serializable1.isEmpty();
        edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>> queue_iterable_iterator_serializable4 = new edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>();
        java.util.Iterator<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>> iterator_iterable_iterator_serializable5 = queue_iterable_iterator_serializable4.iterator();
        java.util.Spliterator<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>> spliterator_iterable_iterator_serializable6 = queue_iterable_iterator_serializable4.spliterator();
        java.lang.String str7 = queue_iterable_iterator_serializable4.toString();
        queue_queue_iterable_iterator_serializable1.enqueue(queue_iterable_iterator_serializable4);
        queue_queue_queue_iterable_iterator_serializable0.enqueue(queue_queue_iterable_iterator_serializable1);
        edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>> queue_queue_iterable_iterator_serializable10 = new edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>();
        boolean b11 = queue_queue_iterable_iterator_serializable10.isEmpty();
        boolean b12 = queue_queue_iterable_iterator_serializable10.isEmpty();
        java.lang.String str13 = queue_queue_iterable_iterator_serializable10.toString();
        queue_queue_queue_iterable_iterator_serializable0.enqueue(queue_queue_iterable_iterator_serializable10);
        java.util.Iterator<edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>> iterator_queue_queue_iterable_iterator_serializable15 = queue_queue_queue_iterable_iterator_serializable0.iterator();
        edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>> queue_queue_iterable_iterator_serializable16 = queue_queue_queue_iterable_iterator_serializable0.dequeue();
        edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>> queue_queue_iterable_iterator_serializable17 = queue_queue_queue_iterable_iterator_serializable0.dequeue();
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertNotNull(iterator_iterable_iterator_serializable5);
        org.junit.Assert.assertNotNull(spliterator_iterable_iterator_serializable6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "" + "'", str13.equals(""));
        org.junit.Assert.assertNotNull(iterator_queue_queue_iterable_iterator_serializable15);
        org.junit.Assert.assertNotNull(queue_queue_iterable_iterator_serializable16);
        org.junit.Assert.assertNotNull(queue_queue_iterable_iterator_serializable17);
    }

    @Test
    public void test59() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test59");
        edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.util.Iterator<java.util.Iterator<java.lang.Iterable<java.io.Serializable>>>>> queue_queue_iterator_iterator_iterable_serializable0 = new edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.util.Iterator<java.util.Iterator<java.lang.Iterable<java.io.Serializable>>>>>();
        java.util.Iterator<edu.osu.cs362.Queue<java.util.Iterator<java.util.Iterator<java.lang.Iterable<java.io.Serializable>>>>> iterator_queue_iterator_iterator_iterable_serializable1 = queue_queue_iterator_iterator_iterable_serializable0.iterator();
        try {
            edu.osu.cs362.Queue<java.util.Iterator<java.util.Iterator<java.lang.Iterable<java.io.Serializable>>>> queue_iterator_iterator_iterable_serializable2 = queue_queue_iterator_iterator_iterable_serializable0.peek();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException");
        } catch (java.util.NoSuchElementException e) {
        }
        org.junit.Assert.assertNotNull(iterator_queue_iterator_iterator_iterable_serializable1);
    }

    @Test
    public void test60() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test60");
        edu.osu.cs362.Queue<java.lang.Iterable<java.lang.Object>> queue_iterable_obj0 = new edu.osu.cs362.Queue<java.lang.Iterable<java.lang.Object>>();
        java.util.Spliterator<java.lang.Iterable<java.lang.Object>> spliterator_iterable_obj1 = queue_iterable_obj0.spliterator();
        boolean b2 = queue_iterable_obj0.isEmpty();
        java.lang.Iterable<java.lang.Object> iterable_obj3 = null;
        queue_iterable_obj0.enqueue(iterable_obj3);
        int i5 = queue_iterable_obj0.size();
        edu.osu.cs362.Queue<java.lang.Object> queue_obj6 = new edu.osu.cs362.Queue<java.lang.Object>();
        int i7 = queue_obj6.size();
        java.util.Spliterator<java.lang.Object> spliterator_obj8 = queue_obj6.spliterator();
        edu.osu.cs362.Queue<java.util.Iterator<java.io.Serializable>> queue_iterator_serializable9 = new edu.osu.cs362.Queue<java.util.Iterator<java.io.Serializable>>();
        boolean b10 = queue_iterator_serializable9.isEmpty();
        edu.osu.cs362.Queue<java.io.Serializable> queue_serializable11 = new edu.osu.cs362.Queue<java.io.Serializable>();
        queue_serializable11.enqueue((java.io.Serializable) 1L);
        java.util.Iterator<java.io.Serializable> iterator_serializable14 = queue_serializable11.iterator();
        queue_iterator_serializable9.enqueue(iterator_serializable14);
        int i16 = queue_iterator_serializable9.size();
        java.util.Iterator<java.io.Serializable> iterator_serializable17 = queue_iterator_serializable9.peek();
        boolean b18 = queue_iterator_serializable9.isEmpty();
        java.util.Iterator<java.io.Serializable> iterator_serializable19 = queue_iterator_serializable9.peek();
        queue_obj6.enqueue((java.lang.Object) queue_iterator_serializable9);
        java.util.Spliterator<java.lang.Object> spliterator_obj21 = queue_obj6.spliterator();
        queue_iterable_obj0.enqueue((java.lang.Iterable<java.lang.Object>) queue_obj6);
        org.junit.Assert.assertNotNull(spliterator_iterable_obj1);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i5 == 1);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertNotNull(spliterator_obj8);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertNotNull(iterator_serializable14);
        org.junit.Assert.assertTrue(i16 == 1);
        org.junit.Assert.assertNotNull(iterator_serializable17);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNotNull(iterator_serializable19);
        org.junit.Assert.assertNotNull(spliterator_obj21);
    }

    @Test
    public void test61() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test61");
        edu.osu.cs362.Queue<java.util.Iterator<java.lang.Iterable<java.io.Serializable>>> queue_iterator_iterable_serializable0 = new edu.osu.cs362.Queue<java.util.Iterator<java.lang.Iterable<java.io.Serializable>>>();
        java.util.Spliterator<java.util.Iterator<java.lang.Iterable<java.io.Serializable>>> spliterator_iterator_iterable_serializable1 = queue_iterator_iterable_serializable0.spliterator();
        java.util.Spliterator<java.util.Iterator<java.lang.Iterable<java.io.Serializable>>> spliterator_iterator_iterable_serializable2 = queue_iterator_iterable_serializable0.spliterator();
        java.util.Iterator<java.util.Iterator<java.lang.Iterable<java.io.Serializable>>> iterator_iterator_iterable_serializable3 = queue_iterator_iterable_serializable0.iterator();
        boolean b4 = queue_iterator_iterable_serializable0.isEmpty();
        java.util.Iterator<java.util.Iterator<java.lang.Iterable<java.io.Serializable>>> iterator_iterator_iterable_serializable5 = queue_iterator_iterable_serializable0.iterator();
        edu.osu.cs362.Queue<java.lang.Iterable<java.io.Serializable>> queue_iterable_serializable6 = new edu.osu.cs362.Queue<java.lang.Iterable<java.io.Serializable>>();
        java.util.Spliterator<java.lang.Iterable<java.io.Serializable>> spliterator_iterable_serializable7 = queue_iterable_serializable6.spliterator();
        java.util.Iterator<java.lang.Iterable<java.io.Serializable>> iterator_iterable_serializable8 = queue_iterable_serializable6.iterator();
        queue_iterator_iterable_serializable0.enqueue(iterator_iterable_serializable8);
        int i10 = queue_iterator_iterable_serializable0.size();
        java.lang.String str11 = queue_iterator_iterable_serializable0.toString();
        org.junit.Assert.assertNotNull(spliterator_iterator_iterable_serializable1);
        org.junit.Assert.assertNotNull(spliterator_iterator_iterable_serializable2);
        org.junit.Assert.assertNotNull(iterator_iterator_iterable_serializable3);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertNotNull(iterator_iterator_iterable_serializable5);
        org.junit.Assert.assertNotNull(spliterator_iterable_serializable7);
        org.junit.Assert.assertNotNull(iterator_iterable_serializable8);
        org.junit.Assert.assertTrue(i10 == 1);
    }

    @Test
    public void test62() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test62");
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
        int i12 = queue_iterable_queue_iterable_iterator_serializable0.size();
        boolean b13 = queue_iterable_queue_iterable_iterator_serializable0.isEmpty();
        org.junit.Assert.assertNotNull(iterator_iterable_queue_iterable_iterator_serializable3);
        org.junit.Assert.assertTrue(i4 == 1);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertTrue(i10 == 0);
        org.junit.Assert.assertTrue(i12 == 2);
        org.junit.Assert.assertTrue(b13 == false);
    }

    @Test
    public void test63() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test63");
        edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.lang.Iterable<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.lang.Object>>>>>>> queue_queue_iterable_iterable_queue_iterable_iterator_obj0 = new edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.lang.Iterable<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.lang.Object>>>>>>>();
        boolean b1 = queue_queue_iterable_iterable_queue_iterable_iterator_obj0.isEmpty();
        org.junit.Assert.assertTrue(b1 == true);
    }

    @Test
    public void test64() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test64");
        edu.osu.cs362.Queue<java.lang.Iterable<java.io.Serializable>> queue_iterable_serializable0 = new edu.osu.cs362.Queue<java.lang.Iterable<java.io.Serializable>>();
        int i1 = queue_iterable_serializable0.size();
        edu.osu.cs362.Queue<java.io.Serializable> queue_serializable2 = new edu.osu.cs362.Queue<java.io.Serializable>();
        queue_serializable2.enqueue((java.io.Serializable) 1L);
        java.lang.String str5 = queue_serializable2.toString();
        java.io.Serializable serializable6 = queue_serializable2.dequeue();
        java.util.Spliterator<java.io.Serializable> spliterator_serializable7 = queue_serializable2.spliterator();
        queue_iterable_serializable0.enqueue((java.lang.Iterable<java.io.Serializable>) queue_serializable2);
        java.util.Spliterator<java.lang.Iterable<java.io.Serializable>> spliterator_iterable_serializable9 = queue_iterable_serializable0.spliterator();
        java.util.Spliterator<java.lang.Iterable<java.io.Serializable>> spliterator_iterable_serializable10 = queue_iterable_serializable0.spliterator();
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "1 " + "'", str5.equals("1 "));
        org.junit.Assert.assertTrue("'" + serializable6 + "' != '" + 1L + "'", serializable6.equals(1L));
        org.junit.Assert.assertNotNull(spliterator_serializable7);
        org.junit.Assert.assertNotNull(spliterator_iterable_serializable9);
        org.junit.Assert.assertNotNull(spliterator_iterable_serializable10);
    }

    @Test
    public void test65() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test65");
        edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.util.Iterator<edu.osu.cs362.Queue<java.io.Serializable>>>>> queue_iterable_iterator_iterator_queue_serializable0 = new edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.util.Iterator<edu.osu.cs362.Queue<java.io.Serializable>>>>>();
        java.util.Spliterator<java.lang.Iterable<java.util.Iterator<java.util.Iterator<edu.osu.cs362.Queue<java.io.Serializable>>>>> spliterator_iterable_iterator_iterator_queue_serializable1 = queue_iterable_iterator_iterator_queue_serializable0.spliterator();
        java.util.Spliterator<java.lang.Iterable<java.util.Iterator<java.util.Iterator<edu.osu.cs362.Queue<java.io.Serializable>>>>> spliterator_iterable_iterator_iterator_queue_serializable2 = queue_iterable_iterator_iterator_queue_serializable0.spliterator();
        java.util.Spliterator<java.lang.Iterable<java.util.Iterator<java.util.Iterator<edu.osu.cs362.Queue<java.io.Serializable>>>>> spliterator_iterable_iterator_iterator_queue_serializable3 = queue_iterable_iterator_iterator_queue_serializable0.spliterator();
        org.junit.Assert.assertNotNull(spliterator_iterable_iterator_iterator_queue_serializable1);
        org.junit.Assert.assertNotNull(spliterator_iterable_iterator_iterator_queue_serializable2);
        org.junit.Assert.assertNotNull(spliterator_iterable_iterator_iterator_queue_serializable3);
    }

    @Test
    public void test66() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test66");
        edu.osu.cs362.Queue<edu.osu.cs362.Queue<edu.osu.cs362.Queue<edu.osu.cs362.Queue<edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>>>>> queue_queue_queue_queue_queue_queue_iterable_queue_iterable_iterator_serializable0 = new edu.osu.cs362.Queue<edu.osu.cs362.Queue<edu.osu.cs362.Queue<edu.osu.cs362.Queue<edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>>>>>();
        java.lang.String str1 = queue_queue_queue_queue_queue_queue_iterable_queue_iterable_iterator_serializable0.toString();
        int i2 = queue_queue_queue_queue_queue_queue_iterable_queue_iterable_iterator_serializable0.size();
        edu.osu.cs362.Queue<edu.osu.cs362.Queue<edu.osu.cs362.Queue<edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>>>> queue_queue_queue_queue_queue_iterable_queue_iterable_iterator_serializable3 = new edu.osu.cs362.Queue<edu.osu.cs362.Queue<edu.osu.cs362.Queue<edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>>>>();
        java.lang.String str4 = queue_queue_queue_queue_queue_iterable_queue_iterable_iterator_serializable3.toString();
        queue_queue_queue_queue_queue_queue_iterable_queue_iterable_iterator_serializable0.enqueue(queue_queue_queue_queue_queue_iterable_queue_iterable_iterator_serializable3);
        edu.osu.cs362.Queue<java.lang.Iterable<edu.osu.cs362.Queue<edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>>>> queue_iterable_queue_queue_queue_iterable_queue_iterable_iterator_serializable6 = new edu.osu.cs362.Queue<java.lang.Iterable<edu.osu.cs362.Queue<edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>>>>();
        edu.osu.cs362.Queue<edu.osu.cs362.Queue<edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>>> queue_queue_queue_queue_iterable_queue_iterable_iterator_serializable7 = new edu.osu.cs362.Queue<edu.osu.cs362.Queue<edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>>>();
        queue_iterable_queue_queue_queue_iterable_queue_iterable_iterator_serializable6.enqueue((java.lang.Iterable<edu.osu.cs362.Queue<edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>>>) queue_queue_queue_queue_iterable_queue_iterable_iterator_serializable7);
        java.lang.String str9 = queue_iterable_queue_queue_queue_iterable_queue_iterable_iterator_serializable6.toString();
        java.lang.Iterable<edu.osu.cs362.Queue<edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>>> iterable_queue_queue_queue_iterable_queue_iterable_iterator_serializable10 = queue_iterable_queue_queue_queue_iterable_queue_iterable_iterator_serializable6.dequeue();
        java.util.Iterator<java.lang.Iterable<edu.osu.cs362.Queue<edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>>>> iterator_iterable_queue_queue_queue_iterable_queue_iterable_iterator_serializable11 = queue_iterable_queue_queue_queue_iterable_queue_iterable_iterator_serializable6.iterator();
        edu.osu.cs362.Queue<java.lang.Iterable<edu.osu.cs362.Queue<edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>>>> queue_iterable_queue_queue_queue_iterable_queue_iterable_iterator_serializable12 = new edu.osu.cs362.Queue<java.lang.Iterable<edu.osu.cs362.Queue<edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>>>>();
        edu.osu.cs362.Queue<edu.osu.cs362.Queue<edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>>> queue_queue_queue_queue_iterable_queue_iterable_iterator_serializable13 = new edu.osu.cs362.Queue<edu.osu.cs362.Queue<edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>>>();
        queue_iterable_queue_queue_queue_iterable_queue_iterable_iterator_serializable12.enqueue((java.lang.Iterable<edu.osu.cs362.Queue<edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>>>) queue_queue_queue_queue_iterable_queue_iterable_iterator_serializable13);
        edu.osu.cs362.Queue<edu.osu.cs362.Queue<edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>>> queue_queue_queue_queue_iterable_queue_iterable_iterator_serializable15 = new edu.osu.cs362.Queue<edu.osu.cs362.Queue<edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>>>();
        edu.osu.cs362.Queue<edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>> queue_queue_queue_iterable_queue_iterable_iterator_serializable16 = new edu.osu.cs362.Queue<edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>>();
        java.util.Spliterator<edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>> spliterator_queue_queue_iterable_queue_iterable_iterator_serializable17 = queue_queue_queue_iterable_queue_iterable_iterator_serializable16.spliterator();
        java.util.Spliterator<edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>> spliterator_queue_queue_iterable_queue_iterable_iterator_serializable18 = queue_queue_queue_iterable_queue_iterable_iterator_serializable16.spliterator();
        queue_queue_queue_queue_iterable_queue_iterable_iterator_serializable15.enqueue(queue_queue_queue_iterable_queue_iterable_iterator_serializable16);
        queue_queue_queue_queue_iterable_queue_iterable_iterator_serializable13.enqueue(queue_queue_queue_iterable_queue_iterable_iterator_serializable16);
        edu.osu.cs362.Queue<edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>> queue_queue_queue_iterable_queue_iterable_iterator_serializable21 = queue_queue_queue_queue_iterable_queue_iterable_iterator_serializable13.dequeue();
        queue_iterable_queue_queue_queue_iterable_queue_iterable_iterator_serializable6.enqueue((java.lang.Iterable<edu.osu.cs362.Queue<edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>>>) queue_queue_queue_queue_iterable_queue_iterable_iterator_serializable13);
        queue_queue_queue_queue_queue_iterable_queue_iterable_iterator_serializable3.enqueue(queue_queue_queue_queue_iterable_queue_iterable_iterator_serializable13);
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + " " + "'", str9.equals(" "));
        org.junit.Assert.assertNotNull(iterable_queue_queue_queue_iterable_queue_iterable_iterator_serializable10);
        org.junit.Assert.assertNotNull(iterator_iterable_queue_queue_queue_iterable_queue_iterable_iterator_serializable11);
        org.junit.Assert.assertNotNull(spliterator_queue_queue_iterable_queue_iterable_iterator_serializable17);
        org.junit.Assert.assertNotNull(spliterator_queue_queue_iterable_queue_iterable_iterator_serializable18);
        org.junit.Assert.assertNotNull(queue_queue_queue_iterable_queue_iterable_iterator_serializable21);
    }

    @Test
    public void test67() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test67");
        edu.osu.cs362.Queue<java.util.Spliterator<java.lang.Iterable<java.util.Iterator<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>>> queue_spliterator_iterable_iterator_iterable_queue_iterable_iterator_serializable0 = new edu.osu.cs362.Queue<java.util.Spliterator<java.lang.Iterable<java.util.Iterator<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>>>();
        int i1 = queue_spliterator_iterable_iterator_iterable_queue_iterable_iterator_serializable0.size();
        edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>> queue_iterable_iterator_iterable_queue_iterable_iterator_serializable2 = new edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>>();
        java.util.Spliterator<java.lang.Iterable<java.util.Iterator<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>> spliterator_iterable_iterator_iterable_queue_iterable_iterator_serializable3 = queue_iterable_iterator_iterable_queue_iterable_iterator_serializable2.spliterator();
        queue_spliterator_iterable_iterator_iterable_queue_iterable_iterator_serializable0.enqueue(spliterator_iterable_iterator_iterable_queue_iterable_iterator_serializable3);
        java.util.Iterator<java.util.Spliterator<java.lang.Iterable<java.util.Iterator<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>>> iterator_spliterator_iterable_iterator_iterable_queue_iterable_iterator_serializable5 = queue_spliterator_iterable_iterator_iterable_queue_iterable_iterator_serializable0.iterator();
        edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>> queue_iterable_iterator_iterable_queue_iterable_iterator_serializable6 = new edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>>();
        java.util.Spliterator<java.lang.Iterable<java.util.Iterator<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>> spliterator_iterable_iterator_iterable_queue_iterable_iterator_serializable7 = queue_iterable_iterator_iterable_queue_iterable_iterator_serializable6.spliterator();
        boolean b8 = queue_iterable_iterator_iterable_queue_iterable_iterator_serializable6.isEmpty();
        java.util.Spliterator<java.lang.Iterable<java.util.Iterator<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>> spliterator_iterable_iterator_iterable_queue_iterable_iterator_serializable9 = queue_iterable_iterator_iterable_queue_iterable_iterator_serializable6.spliterator();
        queue_spliterator_iterable_iterator_iterable_queue_iterable_iterator_serializable0.enqueue(spliterator_iterable_iterator_iterable_queue_iterable_iterator_serializable9);
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertNotNull(spliterator_iterable_iterator_iterable_queue_iterable_iterator_serializable3);
        org.junit.Assert.assertNotNull(iterator_spliterator_iterable_iterator_iterable_queue_iterable_iterator_serializable5);
        org.junit.Assert.assertNotNull(spliterator_iterable_iterator_iterable_queue_iterable_iterator_serializable7);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertNotNull(spliterator_iterable_iterator_iterable_queue_iterable_iterator_serializable9);
    }

    @Test
    public void test68() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test68");
        edu.osu.cs362.Queue<java.util.Iterator<java.lang.Iterable<java.lang.Iterable<java.util.Iterator<java.lang.Object>>>>> queue_iterator_iterable_iterable_iterator_obj0 = new edu.osu.cs362.Queue<java.util.Iterator<java.lang.Iterable<java.lang.Iterable<java.util.Iterator<java.lang.Object>>>>>();
    }

    @Test
    public void test69() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test69");
        edu.osu.cs362.Queue<java.lang.Iterable<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>>> queue_iterable_iterable_queue_iterable_queue_iterable_iterator_serializable0 = new edu.osu.cs362.Queue<java.lang.Iterable<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>>>();
        boolean b1 = queue_iterable_iterable_queue_iterable_queue_iterable_iterator_serializable0.isEmpty();
        int i2 = queue_iterable_iterable_queue_iterable_queue_iterable_iterator_serializable0.size();
        org.junit.Assert.assertTrue(b1 == true);
        org.junit.Assert.assertTrue(i2 == 0);
    }

    @Test
    public void test70() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test70");
        edu.osu.cs362.Queue<java.util.Spliterator<java.util.Spliterator<java.io.Serializable>>> queue_spliterator_spliterator_serializable0 = new edu.osu.cs362.Queue<java.util.Spliterator<java.util.Spliterator<java.io.Serializable>>>();
        try {
            java.util.Spliterator<java.util.Spliterator<java.io.Serializable>> spliterator_spliterator_serializable1 = queue_spliterator_spliterator_serializable0.peek();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException");
        } catch (java.util.NoSuchElementException e) {
        }
    }

    @Test
    public void test71() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test71");
        edu.osu.cs362.Queue<edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.util.Iterator<edu.osu.cs362.Queue<java.io.Serializable>>>>> queue_queue_queue_iterator_queue_serializable0 = new edu.osu.cs362.Queue<edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.util.Iterator<edu.osu.cs362.Queue<java.io.Serializable>>>>>();
        edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.util.Iterator<edu.osu.cs362.Queue<java.io.Serializable>>>> queue_queue_iterator_queue_serializable1 = new edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.util.Iterator<edu.osu.cs362.Queue<java.io.Serializable>>>>();
        java.util.Spliterator<edu.osu.cs362.Queue<java.util.Iterator<edu.osu.cs362.Queue<java.io.Serializable>>>> spliterator_queue_iterator_queue_serializable2 = queue_queue_iterator_queue_serializable1.spliterator();
        java.util.Spliterator<edu.osu.cs362.Queue<java.util.Iterator<edu.osu.cs362.Queue<java.io.Serializable>>>> spliterator_queue_iterator_queue_serializable3 = queue_queue_iterator_queue_serializable1.spliterator();
        java.util.Iterator<edu.osu.cs362.Queue<java.util.Iterator<edu.osu.cs362.Queue<java.io.Serializable>>>> iterator_queue_iterator_queue_serializable4 = queue_queue_iterator_queue_serializable1.iterator();
        java.util.Iterator<edu.osu.cs362.Queue<java.util.Iterator<edu.osu.cs362.Queue<java.io.Serializable>>>> iterator_queue_iterator_queue_serializable5 = queue_queue_iterator_queue_serializable1.iterator();
        queue_queue_queue_iterator_queue_serializable0.enqueue(queue_queue_iterator_queue_serializable1);
        try {
            edu.osu.cs362.Queue<java.util.Iterator<edu.osu.cs362.Queue<java.io.Serializable>>> queue_iterator_queue_serializable7 = queue_queue_iterator_queue_serializable1.dequeue();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException");
        } catch (java.util.NoSuchElementException e) {
        }
        org.junit.Assert.assertNotNull(spliterator_queue_iterator_queue_serializable2);
        org.junit.Assert.assertNotNull(spliterator_queue_iterator_queue_serializable3);
        org.junit.Assert.assertNotNull(iterator_queue_iterator_queue_serializable4);
        org.junit.Assert.assertNotNull(iterator_queue_iterator_queue_serializable5);
    }

    @Test
    public void test72() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test72");
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
        edu.osu.cs362.Queue<edu.osu.cs362.Queue<edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>>> queue_queue_queue_queue_iterable_queue_iterable_iterator_serializable12 = queue_queue_queue_queue_queue_iterable_queue_iterable_iterator_serializable0.dequeue();
        java.util.Spliterator<edu.osu.cs362.Queue<edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>>> spliterator_queue_queue_queue_iterable_queue_iterable_iterator_serializable13 = queue_queue_queue_queue_iterable_queue_iterable_iterator_serializable12.spliterator();
        int i14 = queue_queue_queue_queue_iterable_queue_iterable_iterator_serializable12.size();
        edu.osu.cs362.Queue<edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>> queue_queue_queue_iterable_queue_iterable_iterator_serializable15 = queue_queue_queue_queue_iterable_queue_iterable_iterator_serializable12.peek();
        java.util.Iterator<edu.osu.cs362.Queue<edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>>> iterator_queue_queue_queue_iterable_queue_iterable_iterator_serializable16 = queue_queue_queue_queue_iterable_queue_iterable_iterator_serializable12.iterator();
        edu.osu.cs362.Queue<edu.osu.cs362.Queue<edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>>> queue_queue_queue_queue_iterable_queue_iterable_iterator_serializable17 = new edu.osu.cs362.Queue<edu.osu.cs362.Queue<edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>>>();
        edu.osu.cs362.Queue<edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>> queue_queue_queue_iterable_queue_iterable_iterator_serializable18 = new edu.osu.cs362.Queue<edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>>();
        java.util.Spliterator<edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>> spliterator_queue_queue_iterable_queue_iterable_iterator_serializable19 = queue_queue_queue_iterable_queue_iterable_iterator_serializable18.spliterator();
        java.util.Spliterator<edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>> spliterator_queue_queue_iterable_queue_iterable_iterator_serializable20 = queue_queue_queue_iterable_queue_iterable_iterator_serializable18.spliterator();
        queue_queue_queue_queue_iterable_queue_iterable_iterator_serializable17.enqueue(queue_queue_queue_iterable_queue_iterable_iterator_serializable18);
        edu.osu.cs362.Queue<edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>> queue_queue_queue_iterable_queue_iterable_iterator_serializable22 = queue_queue_queue_queue_iterable_queue_iterable_iterator_serializable17.dequeue();
        queue_queue_queue_queue_iterable_queue_iterable_iterator_serializable12.enqueue(queue_queue_queue_iterable_queue_iterable_iterator_serializable22);
        edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>> queue_queue_iterable_queue_iterable_iterator_serializable24 = new edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>();
        java.lang.String str25 = queue_queue_iterable_queue_iterable_iterator_serializable24.toString();
        queue_queue_queue_iterable_queue_iterable_iterator_serializable22.enqueue(queue_queue_iterable_queue_iterable_iterator_serializable24);
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertNotNull(spliterator_queue_queue_iterable_queue_iterable_iterator_serializable7);
        org.junit.Assert.assertNotNull(spliterator_queue_queue_iterable_queue_iterable_iterator_serializable8);
        org.junit.Assert.assertNotNull(queue_queue_queue_queue_iterable_queue_iterable_iterator_serializable12);
        org.junit.Assert.assertNotNull(spliterator_queue_queue_queue_iterable_queue_iterable_iterator_serializable13);
        org.junit.Assert.assertTrue(i14 == 1);
        org.junit.Assert.assertNotNull(queue_queue_queue_iterable_queue_iterable_iterator_serializable15);
        org.junit.Assert.assertNotNull(iterator_queue_queue_queue_iterable_queue_iterable_iterator_serializable16);
        org.junit.Assert.assertNotNull(spliterator_queue_queue_iterable_queue_iterable_iterator_serializable19);
        org.junit.Assert.assertNotNull(spliterator_queue_queue_iterable_queue_iterable_iterator_serializable20);
        org.junit.Assert.assertNotNull(queue_queue_queue_iterable_queue_iterable_iterator_serializable22);
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "" + "'", str25.equals(""));
    }

    @Test
    public void test73() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test73");
        edu.osu.cs362.Queue<java.util.Iterator<java.util.Iterator<java.lang.Object>>> queue_iterator_iterator_obj0 = new edu.osu.cs362.Queue<java.util.Iterator<java.util.Iterator<java.lang.Object>>>();
        edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.lang.Object>>> queue_iterable_iterator_obj1 = new edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.lang.Object>>>();
        edu.osu.cs362.Queue<java.util.Iterator<java.lang.Object>> queue_iterator_obj2 = new edu.osu.cs362.Queue<java.util.Iterator<java.lang.Object>>();
        queue_iterable_iterator_obj1.enqueue((java.lang.Iterable<java.util.Iterator<java.lang.Object>>) queue_iterator_obj2);
        java.lang.String str4 = queue_iterator_obj2.toString();
        java.util.Iterator<java.util.Iterator<java.lang.Object>> iterator_iterator_obj5 = queue_iterator_obj2.iterator();
        queue_iterator_iterator_obj0.enqueue(iterator_iterator_obj5);
        java.lang.String str7 = queue_iterator_iterator_obj0.toString();
        java.util.Spliterator<java.util.Iterator<java.util.Iterator<java.lang.Object>>> spliterator_iterator_iterator_obj8 = queue_iterator_iterator_obj0.spliterator();
        edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.lang.Object>>> queue_iterable_iterator_obj9 = new edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.lang.Object>>>();
        edu.osu.cs362.Queue<java.util.Iterator<java.lang.Object>> queue_iterator_obj10 = new edu.osu.cs362.Queue<java.util.Iterator<java.lang.Object>>();
        queue_iterable_iterator_obj9.enqueue((java.lang.Iterable<java.util.Iterator<java.lang.Object>>) queue_iterator_obj10);
        java.lang.String str12 = queue_iterator_obj10.toString();
        java.util.Iterator<java.util.Iterator<java.lang.Object>> iterator_iterator_obj13 = queue_iterator_obj10.iterator();
        queue_iterator_iterator_obj0.enqueue(iterator_iterator_obj13);
        int i15 = queue_iterator_iterator_obj0.size();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        org.junit.Assert.assertNotNull(iterator_iterator_obj5);
        org.junit.Assert.assertNotNull(spliterator_iterator_iterator_obj8);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
        org.junit.Assert.assertNotNull(iterator_iterator_obj13);
        org.junit.Assert.assertTrue(i15 == 2);
    }

    @Test
    public void test74() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test74");
        edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.util.Spliterator<java.lang.Iterable<java.lang.Iterable<java.util.Iterator<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>>>>> queue_queue_spliterator_iterable_iterable_iterator_iterable_queue_iterable_iterator_serializable0 = new edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.util.Spliterator<java.lang.Iterable<java.lang.Iterable<java.util.Iterator<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>>>>>();
        edu.osu.cs362.Queue<java.util.Spliterator<java.lang.Iterable<java.lang.Iterable<java.util.Iterator<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>>>> queue_spliterator_iterable_iterable_iterator_iterable_queue_iterable_iterator_serializable1 = new edu.osu.cs362.Queue<java.util.Spliterator<java.lang.Iterable<java.lang.Iterable<java.util.Iterator<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>>>>();
        boolean b2 = queue_spliterator_iterable_iterable_iterator_iterable_queue_iterable_iterator_serializable1.isEmpty();
        java.util.Spliterator<java.util.Spliterator<java.lang.Iterable<java.lang.Iterable<java.util.Iterator<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>>>> spliterator_spliterator_iterable_iterable_iterator_iterable_queue_iterable_iterator_serializable3 = queue_spliterator_iterable_iterable_iterator_iterable_queue_iterable_iterator_serializable1.spliterator();
        java.util.Spliterator<java.util.Spliterator<java.lang.Iterable<java.lang.Iterable<java.util.Iterator<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>>>> spliterator_spliterator_iterable_iterable_iterator_iterable_queue_iterable_iterator_serializable4 = queue_spliterator_iterable_iterable_iterator_iterable_queue_iterable_iterator_serializable1.spliterator();
        queue_queue_spliterator_iterable_iterable_iterator_iterable_queue_iterable_iterator_serializable0.enqueue(queue_spliterator_iterable_iterable_iterator_iterable_queue_iterable_iterator_serializable1);
        edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.util.Spliterator<java.lang.Iterable<java.lang.Iterable<java.util.Iterator<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>>>>> queue_queue_spliterator_iterable_iterable_iterator_iterable_queue_iterable_iterator_serializable6 = new edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.util.Spliterator<java.lang.Iterable<java.lang.Iterable<java.util.Iterator<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>>>>>();
        edu.osu.cs362.Queue<java.util.Spliterator<java.lang.Iterable<java.lang.Iterable<java.util.Iterator<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>>>> queue_spliterator_iterable_iterable_iterator_iterable_queue_iterable_iterator_serializable7 = new edu.osu.cs362.Queue<java.util.Spliterator<java.lang.Iterable<java.lang.Iterable<java.util.Iterator<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>>>>();
        boolean b8 = queue_spliterator_iterable_iterable_iterator_iterable_queue_iterable_iterator_serializable7.isEmpty();
        java.util.Spliterator<java.util.Spliterator<java.lang.Iterable<java.lang.Iterable<java.util.Iterator<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>>>> spliterator_spliterator_iterable_iterable_iterator_iterable_queue_iterable_iterator_serializable9 = queue_spliterator_iterable_iterable_iterator_iterable_queue_iterable_iterator_serializable7.spliterator();
        java.util.Spliterator<java.util.Spliterator<java.lang.Iterable<java.lang.Iterable<java.util.Iterator<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>>>> spliterator_spliterator_iterable_iterable_iterator_iterable_queue_iterable_iterator_serializable10 = queue_spliterator_iterable_iterable_iterator_iterable_queue_iterable_iterator_serializable7.spliterator();
        queue_queue_spliterator_iterable_iterable_iterator_iterable_queue_iterable_iterator_serializable6.enqueue(queue_spliterator_iterable_iterable_iterator_iterable_queue_iterable_iterator_serializable7);
        queue_queue_spliterator_iterable_iterable_iterator_iterable_queue_iterable_iterator_serializable0.enqueue(queue_spliterator_iterable_iterable_iterator_iterable_queue_iterable_iterator_serializable7);
        try {
            java.util.Spliterator<java.lang.Iterable<java.lang.Iterable<java.util.Iterator<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>>> spliterator_iterable_iterable_iterator_iterable_queue_iterable_iterator_serializable13 = queue_spliterator_iterable_iterable_iterator_iterable_queue_iterable_iterator_serializable7.dequeue();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException");
        } catch (java.util.NoSuchElementException e) {
        }
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNotNull(spliterator_spliterator_iterable_iterable_iterator_iterable_queue_iterable_iterator_serializable3);
        org.junit.Assert.assertNotNull(spliterator_spliterator_iterable_iterable_iterator_iterable_queue_iterable_iterator_serializable4);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertNotNull(spliterator_spliterator_iterable_iterable_iterator_iterable_queue_iterable_iterator_serializable9);
        org.junit.Assert.assertNotNull(spliterator_spliterator_iterable_iterable_iterator_iterable_queue_iterable_iterator_serializable10);
    }

    @Test
    public void test75() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test75");
        edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.lang.Object>>> queue_iterable_iterator_obj0 = new edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.lang.Object>>>();
        edu.osu.cs362.Queue<java.util.Iterator<java.lang.Object>> queue_iterator_obj1 = new edu.osu.cs362.Queue<java.util.Iterator<java.lang.Object>>();
        queue_iterable_iterator_obj0.enqueue((java.lang.Iterable<java.util.Iterator<java.lang.Object>>) queue_iterator_obj1);
        java.util.Iterator<java.lang.Iterable<java.util.Iterator<java.lang.Object>>> iterator_iterable_iterator_obj3 = queue_iterable_iterator_obj0.iterator();
        java.lang.Iterable<java.util.Iterator<java.lang.Object>> iterable_iterator_obj4 = queue_iterable_iterator_obj0.dequeue();
        java.util.Iterator<java.lang.Iterable<java.util.Iterator<java.lang.Object>>> iterator_iterable_iterator_obj5 = queue_iterable_iterator_obj0.iterator();
        edu.osu.cs362.Queue<java.util.Iterator<java.lang.Object>> queue_iterator_obj6 = new edu.osu.cs362.Queue<java.util.Iterator<java.lang.Object>>();
        edu.osu.cs362.Queue<java.lang.Object> queue_obj7 = new edu.osu.cs362.Queue<java.lang.Object>();
        java.util.Iterator<java.lang.Object> iterator_obj8 = queue_obj7.iterator();
        java.util.Iterator<java.lang.Object> iterator_obj9 = queue_obj7.iterator();
        queue_iterator_obj6.enqueue(iterator_obj9);
        queue_iterable_iterator_obj0.enqueue((java.lang.Iterable<java.util.Iterator<java.lang.Object>>) queue_iterator_obj6);
        java.lang.Iterable<java.util.Iterator<java.lang.Object>> iterable_iterator_obj12 = null;
        queue_iterable_iterator_obj0.enqueue(iterable_iterator_obj12);
        java.util.Spliterator<java.lang.Iterable<java.util.Iterator<java.lang.Object>>> spliterator_iterable_iterator_obj14 = queue_iterable_iterator_obj0.spliterator();
        org.junit.Assert.assertNotNull(iterator_iterable_iterator_obj3);
        org.junit.Assert.assertNotNull(iterable_iterator_obj4);
        org.junit.Assert.assertNotNull(iterator_iterable_iterator_obj5);
        org.junit.Assert.assertNotNull(iterator_obj8);
        org.junit.Assert.assertNotNull(iterator_obj9);
        org.junit.Assert.assertNotNull(spliterator_iterable_iterator_obj14);
    }

    @Test
    public void test76() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test76");
        edu.osu.cs362.Queue<java.lang.Iterable<java.lang.Iterable<java.lang.Iterable<java.lang.Object>>>> queue_iterable_iterable_iterable_obj0 = new edu.osu.cs362.Queue<java.lang.Iterable<java.lang.Iterable<java.lang.Iterable<java.lang.Object>>>>();
        java.util.Iterator<java.lang.Iterable<java.lang.Iterable<java.lang.Iterable<java.lang.Object>>>> iterator_iterable_iterable_iterable_obj1 = queue_iterable_iterable_iterable_obj0.iterator();
        java.util.Iterator<java.lang.Iterable<java.lang.Iterable<java.lang.Iterable<java.lang.Object>>>> iterator_iterable_iterable_iterable_obj2 = queue_iterable_iterable_iterable_obj0.iterator();
        boolean b3 = queue_iterable_iterable_iterable_obj0.isEmpty();
        org.junit.Assert.assertNotNull(iterator_iterable_iterable_iterable_obj1);
        org.junit.Assert.assertNotNull(iterator_iterable_iterable_iterable_obj2);
        org.junit.Assert.assertTrue(b3 == true);
    }

    @Test
    public void test77() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test77");
        edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.util.Spliterator<java.lang.Iterable<java.util.Iterator<java.lang.Object>>>>> queue_queue_spliterator_iterable_iterator_obj0 = new edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.util.Spliterator<java.lang.Iterable<java.util.Iterator<java.lang.Object>>>>>();
        java.util.Iterator<edu.osu.cs362.Queue<java.util.Spliterator<java.lang.Iterable<java.util.Iterator<java.lang.Object>>>>> iterator_queue_spliterator_iterable_iterator_obj1 = queue_queue_spliterator_iterable_iterator_obj0.iterator();
        boolean b2 = queue_queue_spliterator_iterable_iterator_obj0.isEmpty();
        int i3 = queue_queue_spliterator_iterable_iterator_obj0.size();
        java.util.Spliterator<edu.osu.cs362.Queue<java.util.Spliterator<java.lang.Iterable<java.util.Iterator<java.lang.Object>>>>> spliterator_queue_spliterator_iterable_iterator_obj4 = queue_queue_spliterator_iterable_iterator_obj0.spliterator();
        org.junit.Assert.assertNotNull(iterator_queue_spliterator_iterable_iterator_obj1);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertNotNull(spliterator_queue_spliterator_iterable_iterator_obj4);
    }

    @Test
    public void test78() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test78");
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
        java.lang.Object obj10 = queue_obj2.peek();
        queue_iterable_obj0.enqueue((java.lang.Iterable<java.lang.Object>) queue_obj2);
        org.junit.Assert.assertNotNull(spliterator_iterable_obj1);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertNotNull(iterator_iterable_iterator_serializable5);
        org.junit.Assert.assertNotNull(spliterator_iterable_iterator_serializable6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertTrue(i8 == 0);
        org.junit.Assert.assertNotNull(obj10);
    }

    @Test
    public void test79() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test79");
        edu.osu.cs362.Queue<java.util.Spliterator<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>>> queue_spliterator_iterable_queue_iterable_queue_iterable_iterator_serializable0 = new edu.osu.cs362.Queue<java.util.Spliterator<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>>>();
        java.lang.String str1 = queue_spliterator_iterable_queue_iterable_queue_iterable_iterator_serializable0.toString();
        try {
            java.util.Spliterator<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>> spliterator_iterable_queue_iterable_queue_iterable_iterator_serializable2 = queue_spliterator_iterable_queue_iterable_queue_iterable_iterator_serializable0.dequeue();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException");
        } catch (java.util.NoSuchElementException e) {
        }
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
    }

    @Test
    public void test80() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test80");
        edu.osu.cs362.Queue<java.lang.Iterable<edu.osu.cs362.Queue<edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>>>> queue_iterable_queue_queue_queue_iterable_queue_iterable_iterator_serializable0 = new edu.osu.cs362.Queue<java.lang.Iterable<edu.osu.cs362.Queue<edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>>>>();
        edu.osu.cs362.Queue<edu.osu.cs362.Queue<edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>>> queue_queue_queue_queue_iterable_queue_iterable_iterator_serializable1 = new edu.osu.cs362.Queue<edu.osu.cs362.Queue<edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>>>();
        queue_iterable_queue_queue_queue_iterable_queue_iterable_iterator_serializable0.enqueue((java.lang.Iterable<edu.osu.cs362.Queue<edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>>>) queue_queue_queue_queue_iterable_queue_iterable_iterator_serializable1);
        java.lang.String str3 = queue_iterable_queue_queue_queue_iterable_queue_iterable_iterator_serializable0.toString();
        java.lang.Iterable<edu.osu.cs362.Queue<edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>>> iterable_queue_queue_queue_iterable_queue_iterable_iterator_serializable4 = queue_iterable_queue_queue_queue_iterable_queue_iterable_iterator_serializable0.dequeue();
        java.util.Iterator<java.lang.Iterable<edu.osu.cs362.Queue<edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>>>> iterator_iterable_queue_queue_queue_iterable_queue_iterable_iterator_serializable5 = queue_iterable_queue_queue_queue_iterable_queue_iterable_iterator_serializable0.iterator();
        java.util.Iterator<java.lang.Iterable<edu.osu.cs362.Queue<edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>>>> iterator_iterable_queue_queue_queue_iterable_queue_iterable_iterator_serializable6 = queue_iterable_queue_queue_queue_iterable_queue_iterable_iterator_serializable0.iterator();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + " " + "'", str3.equals(" "));
        org.junit.Assert.assertNotNull(iterable_queue_queue_queue_iterable_queue_iterable_iterator_serializable4);
        org.junit.Assert.assertNotNull(iterator_iterable_queue_queue_queue_iterable_queue_iterable_iterator_serializable5);
        org.junit.Assert.assertNotNull(iterator_iterable_queue_queue_queue_iterable_queue_iterable_iterator_serializable6);
    }

    @Test
    public void test81() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test81");
        edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.util.Iterator<java.util.Iterator<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>> queue_queue_iterator_iterator_queue_iterable_iterator_serializable0 = new edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.util.Iterator<java.util.Iterator<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>>();
        edu.osu.cs362.Queue<java.util.Iterator<java.util.Iterator<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>> queue_iterator_iterator_queue_iterable_iterator_serializable1 = new edu.osu.cs362.Queue<java.util.Iterator<java.util.Iterator<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>();
        int i2 = queue_iterator_iterator_queue_iterable_iterator_serializable1.size();
        edu.osu.cs362.Queue<java.util.Iterator<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>> queue_iterator_queue_iterable_iterator_serializable3 = new edu.osu.cs362.Queue<java.util.Iterator<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>();
        java.util.Iterator<java.util.Iterator<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>> iterator_iterator_queue_iterable_iterator_serializable4 = queue_iterator_queue_iterable_iterator_serializable3.iterator();
        queue_iterator_iterator_queue_iterable_iterator_serializable1.enqueue(iterator_iterator_queue_iterable_iterator_serializable4);
        java.util.Spliterator<java.util.Iterator<java.util.Iterator<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>> spliterator_iterator_iterator_queue_iterable_iterator_serializable6 = queue_iterator_iterator_queue_iterable_iterator_serializable1.spliterator();
        queue_queue_iterator_iterator_queue_iterable_iterator_serializable0.enqueue(queue_iterator_iterator_queue_iterable_iterator_serializable1);
        boolean b8 = queue_queue_iterator_iterator_queue_iterable_iterator_serializable0.isEmpty();
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNotNull(iterator_iterator_queue_iterable_iterator_serializable4);
        org.junit.Assert.assertNotNull(spliterator_iterator_iterator_queue_iterable_iterator_serializable6);
        org.junit.Assert.assertTrue(b8 == false);
    }

    @Test
    public void test82() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test82");
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
        edu.osu.cs362.Queue<edu.osu.cs362.Queue<edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>>> queue_queue_queue_queue_iterable_queue_iterable_iterator_serializable13 = queue_queue_queue_queue_queue_iterable_queue_iterable_iterator_serializable0.dequeue();
        boolean b14 = queue_queue_queue_queue_queue_iterable_queue_iterable_iterator_serializable0.isEmpty();
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertNotNull(spliterator_queue_queue_iterable_queue_iterable_iterator_serializable7);
        org.junit.Assert.assertNotNull(spliterator_queue_queue_iterable_queue_iterable_iterator_serializable8);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "  " + "'", str12.equals("  "));
        org.junit.Assert.assertNotNull(queue_queue_queue_queue_iterable_queue_iterable_iterator_serializable13);
        org.junit.Assert.assertTrue(b14 == true);
    }

    @Test
    public void test83() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test83");
        edu.osu.cs362.Queue<java.util.Spliterator<java.util.Spliterator<java.lang.Iterable<java.lang.Iterable<java.util.Iterator<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>>>>> queue_spliterator_spliterator_iterable_iterable_iterator_iterable_queue_iterable_iterator_serializable0 = new edu.osu.cs362.Queue<java.util.Spliterator<java.util.Spliterator<java.lang.Iterable<java.lang.Iterable<java.util.Iterator<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>>>>>();
        try {
            java.util.Spliterator<java.util.Spliterator<java.lang.Iterable<java.lang.Iterable<java.util.Iterator<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>>>> spliterator_spliterator_iterable_iterable_iterator_iterable_queue_iterable_iterator_serializable1 = queue_spliterator_spliterator_iterable_iterable_iterator_iterable_queue_iterable_iterator_serializable0.dequeue();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException");
        } catch (java.util.NoSuchElementException e) {
        }
    }

    @Test
    public void test84() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test84");
        edu.osu.cs362.Queue<java.lang.Iterable<edu.osu.cs362.Queue<java.util.Iterator<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>> queue_iterable_queue_iterator_iterable_iterator_serializable0 = new edu.osu.cs362.Queue<java.lang.Iterable<edu.osu.cs362.Queue<java.util.Iterator<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>();
        java.lang.String str1 = queue_iterable_queue_iterator_iterable_iterator_serializable0.toString();
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
    }

    @Test
    public void test85() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test85");
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
        boolean b20 = queue_iterable_queue_queue_queue_iterable_queue_iterable_iterator_serializable0.isEmpty();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + " " + "'", str3.equals(" "));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "" + "'", str7.equals(""));
        org.junit.Assert.assertNotNull(spliterator_queue_queue_iterable_queue_iterable_iterator_serializable13);
        org.junit.Assert.assertNotNull(spliterator_queue_queue_iterable_queue_iterable_iterator_serializable14);
        org.junit.Assert.assertTrue(b20 == false);
    }

    @Test
    public void test86() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test86");
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
        java.util.Spliterator<java.util.Spliterator<java.util.Iterator<edu.osu.cs362.Queue<java.io.Serializable>>>> spliterator_spliterator_iterator_queue_serializable16 = queue_spliterator_iterator_queue_serializable0.spliterator();
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
        org.junit.Assert.assertNotNull(spliterator_spliterator_iterator_queue_serializable16);
    }

    @Test
    public void test87() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test87");
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
        edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.lang.Object>>>> queue_queue_iterable_iterator_obj34 = new edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.lang.Object>>>>();
        edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.lang.Object>>> queue_iterable_iterator_obj35 = new edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.lang.Object>>>();
        edu.osu.cs362.Queue<java.util.Iterator<java.lang.Object>> queue_iterator_obj36 = new edu.osu.cs362.Queue<java.util.Iterator<java.lang.Object>>();
        queue_iterable_iterator_obj35.enqueue((java.lang.Iterable<java.util.Iterator<java.lang.Object>>) queue_iterator_obj36);
        edu.osu.cs362.Queue<java.util.Iterator<java.lang.Object>> queue_iterator_obj38 = new edu.osu.cs362.Queue<java.util.Iterator<java.lang.Object>>();
        queue_iterable_iterator_obj35.enqueue((java.lang.Iterable<java.util.Iterator<java.lang.Object>>) queue_iterator_obj38);
        java.util.Spliterator<java.lang.Iterable<java.util.Iterator<java.lang.Object>>> spliterator_iterable_iterator_obj40 = queue_iterable_iterator_obj35.spliterator();
        queue_queue_iterable_iterator_obj34.enqueue(queue_iterable_iterator_obj35);
        queue_obj17.enqueue((java.lang.Object) queue_queue_iterable_iterator_obj34);
        edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.lang.Object>>> queue_iterable_iterator_obj43 = queue_queue_iterable_iterator_obj34.peek();
        edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.lang.Object>>> queue_iterable_iterator_obj44 = new edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.lang.Object>>>();
        edu.osu.cs362.Queue<java.util.Iterator<java.lang.Object>> queue_iterator_obj45 = new edu.osu.cs362.Queue<java.util.Iterator<java.lang.Object>>();
        queue_iterable_iterator_obj44.enqueue((java.lang.Iterable<java.util.Iterator<java.lang.Object>>) queue_iterator_obj45);
        edu.osu.cs362.Queue<java.util.Iterator<java.lang.Object>> queue_iterator_obj47 = new edu.osu.cs362.Queue<java.util.Iterator<java.lang.Object>>();
        queue_iterable_iterator_obj44.enqueue((java.lang.Iterable<java.util.Iterator<java.lang.Object>>) queue_iterator_obj47);
        java.util.Spliterator<java.lang.Iterable<java.util.Iterator<java.lang.Object>>> spliterator_iterable_iterator_obj49 = queue_iterable_iterator_obj44.spliterator();
        java.util.Iterator<java.lang.Iterable<java.util.Iterator<java.lang.Object>>> iterator_iterable_iterator_obj50 = queue_iterable_iterator_obj44.iterator();
        java.util.Spliterator<java.lang.Iterable<java.util.Iterator<java.lang.Object>>> spliterator_iterable_iterator_obj51 = queue_iterable_iterator_obj44.spliterator();
        queue_queue_iterable_iterator_obj34.enqueue(queue_iterable_iterator_obj44);
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
        org.junit.Assert.assertNotNull(spliterator_iterable_iterator_obj40);
        org.junit.Assert.assertNotNull(queue_iterable_iterator_obj43);
        org.junit.Assert.assertNotNull(spliterator_iterable_iterator_obj49);
        org.junit.Assert.assertNotNull(iterator_iterable_iterator_obj50);
        org.junit.Assert.assertNotNull(spliterator_iterable_iterator_obj51);
    }

    @Test
    public void test88() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test88");
        edu.osu.cs362.Queue<java.util.Iterator<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>>> queue_iterator_iterable_queue_iterable_queue_iterable_iterator_serializable0 = new edu.osu.cs362.Queue<java.util.Iterator<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>>>();
        int i1 = queue_iterator_iterable_queue_iterable_queue_iterable_iterator_serializable0.size();
        int i2 = queue_iterator_iterable_queue_iterable_queue_iterable_iterator_serializable0.size();
        try {
            java.util.Iterator<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>> iterator_iterable_queue_iterable_queue_iterable_iterator_serializable3 = queue_iterator_iterable_queue_iterable_queue_iterable_iterator_serializable0.peek();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException");
        } catch (java.util.NoSuchElementException e) {
        }
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
    }

    @Test
    public void test89() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test89");
        edu.osu.cs362.Queue<java.util.Spliterator<java.util.Iterator<java.lang.Iterable<java.util.Iterator<edu.osu.cs362.Queue<java.io.Serializable>>>>>> queue_spliterator_iterator_iterable_iterator_queue_serializable0 = new edu.osu.cs362.Queue<java.util.Spliterator<java.util.Iterator<java.lang.Iterable<java.util.Iterator<edu.osu.cs362.Queue<java.io.Serializable>>>>>>();
        java.lang.String str1 = queue_spliterator_iterator_iterable_iterator_queue_serializable0.toString();
        try {
            java.util.Spliterator<java.util.Iterator<java.lang.Iterable<java.util.Iterator<edu.osu.cs362.Queue<java.io.Serializable>>>>> spliterator_iterator_iterable_iterator_queue_serializable2 = queue_spliterator_iterator_iterable_iterator_queue_serializable0.peek();
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException");
        } catch (java.util.NoSuchElementException e) {
        }
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
    }

    @Test
    public void test90() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test90");
        edu.osu.cs362.Queue<java.lang.Iterable<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>>> queue_iterable_iterable_queue_iterable_queue_iterable_iterator_serializable0 = new edu.osu.cs362.Queue<java.lang.Iterable<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>>>();
        java.util.Iterator<java.lang.Iterable<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>>> iterator_iterable_iterable_queue_iterable_queue_iterable_iterator_serializable1 = queue_iterable_iterable_queue_iterable_queue_iterable_iterator_serializable0.iterator();
        org.junit.Assert.assertNotNull(iterator_iterable_iterable_queue_iterable_queue_iterable_iterator_serializable1);
    }

    @Test
    public void test91() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test91");
        edu.osu.cs362.Queue<java.io.Serializable> queue_serializable0 = new edu.osu.cs362.Queue<java.io.Serializable>();
        queue_serializable0.enqueue((java.io.Serializable) 1L);
        java.util.Iterator<java.io.Serializable> iterator_serializable3 = queue_serializable0.iterator();
        java.lang.String str4 = queue_serializable0.toString();
        boolean b5 = queue_serializable0.isEmpty();
        java.io.Serializable serializable6 = null;
        queue_serializable0.enqueue(serializable6);
        org.junit.Assert.assertNotNull(iterator_serializable3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "1 " + "'", str4.equals("1 "));
        org.junit.Assert.assertTrue(b5 == false);
    }

    @Test
    public void test92() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test92");
        edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.util.Iterator<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>> queue_queue_iterator_iterable_iterator_serializable0 = new edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.util.Iterator<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>();
        java.util.Iterator<edu.osu.cs362.Queue<java.util.Iterator<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>> iterator_queue_iterator_iterable_iterator_serializable1 = queue_queue_iterator_iterable_iterator_serializable0.iterator();
        java.util.Spliterator<edu.osu.cs362.Queue<java.util.Iterator<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>> spliterator_queue_iterator_iterable_iterator_serializable2 = queue_queue_iterator_iterable_iterator_serializable0.spliterator();
        org.junit.Assert.assertNotNull(iterator_queue_iterator_iterable_iterator_serializable1);
        org.junit.Assert.assertNotNull(spliterator_queue_iterator_iterable_iterator_serializable2);
    }

    @Test
    public void test93() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test93");
        edu.osu.cs362.Queue<java.util.Spliterator<edu.osu.cs362.Queue<java.lang.Comparable<java.lang.String>>>> queue_spliterator_queue_comparable_str0 = new edu.osu.cs362.Queue<java.util.Spliterator<edu.osu.cs362.Queue<java.lang.Comparable<java.lang.String>>>>();
    }

    @Test
    public void test94() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test94");
        edu.osu.cs362.Queue<java.util.Spliterator<edu.osu.cs362.Queue<java.io.Serializable>>> queue_spliterator_queue_serializable0 = new edu.osu.cs362.Queue<java.util.Spliterator<edu.osu.cs362.Queue<java.io.Serializable>>>();
        edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.io.Serializable>> queue_queue_serializable1 = new edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.io.Serializable>>();
        java.util.Spliterator<edu.osu.cs362.Queue<java.io.Serializable>> spliterator_queue_serializable2 = queue_queue_serializable1.spliterator();
        java.util.Iterator<edu.osu.cs362.Queue<java.io.Serializable>> iterator_queue_serializable3 = queue_queue_serializable1.iterator();
        java.lang.String str4 = queue_queue_serializable1.toString();
        java.lang.String str5 = queue_queue_serializable1.toString();
        java.lang.String str6 = queue_queue_serializable1.toString();
        java.util.Spliterator<edu.osu.cs362.Queue<java.io.Serializable>> spliterator_queue_serializable7 = queue_queue_serializable1.spliterator();
        queue_spliterator_queue_serializable0.enqueue(spliterator_queue_serializable7);
        java.util.Spliterator<edu.osu.cs362.Queue<java.io.Serializable>> spliterator_queue_serializable9 = queue_spliterator_queue_serializable0.dequeue();
        java.util.Spliterator<java.util.Spliterator<edu.osu.cs362.Queue<java.io.Serializable>>> spliterator_spliterator_queue_serializable10 = queue_spliterator_queue_serializable0.spliterator();
        org.junit.Assert.assertNotNull(spliterator_queue_serializable2);
        org.junit.Assert.assertNotNull(iterator_queue_serializable3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertNotNull(spliterator_queue_serializable7);
        org.junit.Assert.assertNotNull(spliterator_queue_serializable9);
        org.junit.Assert.assertNotNull(spliterator_spliterator_queue_serializable10);
    }

    @Test
    public void test95() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test95");
        edu.osu.cs362.Queue<java.lang.Iterable<java.lang.Iterable<java.util.Iterator<java.lang.Object>>>> queue_iterable_iterable_iterator_obj0 = new edu.osu.cs362.Queue<java.lang.Iterable<java.lang.Iterable<java.util.Iterator<java.lang.Object>>>>();
        java.util.Iterator<java.lang.Iterable<java.lang.Iterable<java.util.Iterator<java.lang.Object>>>> iterator_iterable_iterable_iterator_obj1 = queue_iterable_iterable_iterator_obj0.iterator();
        edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.lang.Object>>> queue_iterable_iterator_obj2 = new edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.lang.Object>>>();
        edu.osu.cs362.Queue<java.util.Iterator<java.lang.Object>> queue_iterator_obj3 = new edu.osu.cs362.Queue<java.util.Iterator<java.lang.Object>>();
        queue_iterable_iterator_obj2.enqueue((java.lang.Iterable<java.util.Iterator<java.lang.Object>>) queue_iterator_obj3);
        java.util.Iterator<java.lang.Iterable<java.util.Iterator<java.lang.Object>>> iterator_iterable_iterator_obj5 = queue_iterable_iterator_obj2.iterator();
        java.lang.Iterable<java.util.Iterator<java.lang.Object>> iterable_iterator_obj6 = queue_iterable_iterator_obj2.dequeue();
        java.util.Iterator<java.lang.Iterable<java.util.Iterator<java.lang.Object>>> iterator_iterable_iterator_obj7 = queue_iterable_iterator_obj2.iterator();
        edu.osu.cs362.Queue<java.util.Iterator<java.lang.Object>> queue_iterator_obj8 = new edu.osu.cs362.Queue<java.util.Iterator<java.lang.Object>>();
        edu.osu.cs362.Queue<java.lang.Object> queue_obj9 = new edu.osu.cs362.Queue<java.lang.Object>();
        java.util.Iterator<java.lang.Object> iterator_obj10 = queue_obj9.iterator();
        java.util.Iterator<java.lang.Object> iterator_obj11 = queue_obj9.iterator();
        queue_iterator_obj8.enqueue(iterator_obj11);
        queue_iterable_iterator_obj2.enqueue((java.lang.Iterable<java.util.Iterator<java.lang.Object>>) queue_iterator_obj8);
        java.lang.Iterable<java.util.Iterator<java.lang.Object>> iterable_iterator_obj14 = null;
        queue_iterable_iterator_obj2.enqueue(iterable_iterator_obj14);
        queue_iterable_iterable_iterator_obj0.enqueue((java.lang.Iterable<java.lang.Iterable<java.util.Iterator<java.lang.Object>>>) queue_iterable_iterator_obj2);
        org.junit.Assert.assertNotNull(iterator_iterable_iterable_iterator_obj1);
        org.junit.Assert.assertNotNull(iterator_iterable_iterator_obj5);
        org.junit.Assert.assertNotNull(iterable_iterator_obj6);
        org.junit.Assert.assertNotNull(iterator_iterable_iterator_obj7);
        org.junit.Assert.assertNotNull(iterator_obj10);
        org.junit.Assert.assertNotNull(iterator_obj11);
    }

    @Test
    public void test96() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test96");
        edu.osu.cs362.Queue<java.util.Iterator<edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.util.Spliterator<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>>>>>> queue_iterator_queue_queue_spliterator_iterable_queue_iterable_queue_iterable_iterator_serializable0 = new edu.osu.cs362.Queue<java.util.Iterator<edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.util.Spliterator<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>>>>>>();
        int i1 = queue_iterator_queue_queue_spliterator_iterable_queue_iterable_queue_iterable_iterator_serializable0.size();
        org.junit.Assert.assertTrue(i1 == 0);
    }

    @Test
    public void test97() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test97");
        edu.osu.cs362.Queue<java.lang.Iterable<java.lang.Iterable<java.lang.Iterable<java.util.Iterator<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>>>> queue_iterable_iterable_iterable_iterator_iterable_queue_iterable_iterator_serializable0 = new edu.osu.cs362.Queue<java.lang.Iterable<java.lang.Iterable<java.lang.Iterable<java.util.Iterator<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>>>>();
        edu.osu.cs362.Queue<java.lang.Iterable<java.lang.Iterable<java.util.Iterator<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>>> queue_iterable_iterable_iterator_iterable_queue_iterable_iterator_serializable1 = new edu.osu.cs362.Queue<java.lang.Iterable<java.lang.Iterable<java.util.Iterator<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>>>();
        boolean b2 = queue_iterable_iterable_iterator_iterable_queue_iterable_iterator_serializable1.isEmpty();
        boolean b3 = queue_iterable_iterable_iterator_iterable_queue_iterable_iterator_serializable1.isEmpty();
        java.lang.String str4 = queue_iterable_iterable_iterator_iterable_queue_iterable_iterator_serializable1.toString();
        java.util.Spliterator<java.lang.Iterable<java.lang.Iterable<java.util.Iterator<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>>> spliterator_iterable_iterable_iterator_iterable_queue_iterable_iterator_serializable5 = queue_iterable_iterable_iterator_iterable_queue_iterable_iterator_serializable1.spliterator();
        queue_iterable_iterable_iterable_iterator_iterable_queue_iterable_iterator_serializable0.enqueue((java.lang.Iterable<java.lang.Iterable<java.lang.Iterable<java.util.Iterator<java.lang.Iterable<edu.osu.cs362.Queue<java.lang.Iterable<java.util.Iterator<java.io.Serializable>>>>>>>>) queue_iterable_iterable_iterator_iterable_queue_iterable_iterator_serializable1);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        org.junit.Assert.assertNotNull(spliterator_iterable_iterable_iterator_iterable_queue_iterable_iterator_serializable5);
    }

    @Test
    public void test98() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test98");
        edu.osu.cs362.Queue<java.util.Spliterator<edu.osu.cs362.Queue<java.io.Serializable>>> queue_spliterator_queue_serializable0 = new edu.osu.cs362.Queue<java.util.Spliterator<edu.osu.cs362.Queue<java.io.Serializable>>>();
        edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.io.Serializable>> queue_queue_serializable1 = new edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.io.Serializable>>();
        java.util.Spliterator<edu.osu.cs362.Queue<java.io.Serializable>> spliterator_queue_serializable2 = queue_queue_serializable1.spliterator();
        java.util.Iterator<edu.osu.cs362.Queue<java.io.Serializable>> iterator_queue_serializable3 = queue_queue_serializable1.iterator();
        java.lang.String str4 = queue_queue_serializable1.toString();
        java.lang.String str5 = queue_queue_serializable1.toString();
        java.lang.String str6 = queue_queue_serializable1.toString();
        java.util.Spliterator<edu.osu.cs362.Queue<java.io.Serializable>> spliterator_queue_serializable7 = queue_queue_serializable1.spliterator();
        queue_spliterator_queue_serializable0.enqueue(spliterator_queue_serializable7);
        java.util.Spliterator<edu.osu.cs362.Queue<java.io.Serializable>> spliterator_queue_serializable9 = queue_spliterator_queue_serializable0.dequeue();
        boolean b10 = queue_spliterator_queue_serializable0.isEmpty();
        java.util.Iterator<java.util.Spliterator<edu.osu.cs362.Queue<java.io.Serializable>>> iterator_spliterator_queue_serializable11 = queue_spliterator_queue_serializable0.iterator();
        java.util.Spliterator<java.util.Spliterator<edu.osu.cs362.Queue<java.io.Serializable>>> spliterator_spliterator_queue_serializable12 = queue_spliterator_queue_serializable0.spliterator();
        edu.osu.cs362.Queue<java.util.Spliterator<edu.osu.cs362.Queue<java.io.Serializable>>> queue_spliterator_queue_serializable13 = new edu.osu.cs362.Queue<java.util.Spliterator<edu.osu.cs362.Queue<java.io.Serializable>>>();
        edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.io.Serializable>> queue_queue_serializable14 = new edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.io.Serializable>>();
        java.util.Spliterator<edu.osu.cs362.Queue<java.io.Serializable>> spliterator_queue_serializable15 = queue_queue_serializable14.spliterator();
        java.util.Iterator<edu.osu.cs362.Queue<java.io.Serializable>> iterator_queue_serializable16 = queue_queue_serializable14.iterator();
        java.lang.String str17 = queue_queue_serializable14.toString();
        java.lang.String str18 = queue_queue_serializable14.toString();
        java.lang.String str19 = queue_queue_serializable14.toString();
        java.util.Spliterator<edu.osu.cs362.Queue<java.io.Serializable>> spliterator_queue_serializable20 = queue_queue_serializable14.spliterator();
        queue_spliterator_queue_serializable13.enqueue(spliterator_queue_serializable20);
        edu.osu.cs362.Queue<java.lang.Object> queue_obj22 = new edu.osu.cs362.Queue<java.lang.Object>();
        java.util.Spliterator<java.lang.Object> spliterator_obj23 = queue_obj22.spliterator();
        edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.io.Serializable>> queue_queue_serializable24 = new edu.osu.cs362.Queue<edu.osu.cs362.Queue<java.io.Serializable>>();
        java.util.Spliterator<edu.osu.cs362.Queue<java.io.Serializable>> spliterator_queue_serializable25 = queue_queue_serializable24.spliterator();
        java.lang.String str26 = queue_queue_serializable24.toString();
        edu.osu.cs362.Queue<java.io.Serializable> queue_serializable27 = new edu.osu.cs362.Queue<java.io.Serializable>();
        queue_serializable27.enqueue((java.io.Serializable) 1L);
        java.io.Serializable serializable30 = queue_serializable27.peek();
        java.util.Iterator<java.io.Serializable> iterator_serializable31 = queue_serializable27.iterator();
        java.io.Serializable serializable32 = queue_serializable27.peek();
        queue_queue_serializable24.enqueue(queue_serializable27);
        java.util.Iterator<edu.osu.cs362.Queue<java.io.Serializable>> iterator_queue_serializable34 = queue_queue_serializable24.iterator();
        java.lang.String str35 = queue_queue_serializable24.toString();
        java.util.Iterator<edu.osu.cs362.Queue<java.io.Serializable>> iterator_queue_serializable36 = queue_queue_serializable24.iterator();
        queue_obj22.enqueue((java.lang.Object) queue_queue_serializable24);
        java.util.Spliterator<edu.osu.cs362.Queue<java.io.Serializable>> spliterator_queue_serializable38 = queue_queue_serializable24.spliterator();
        queue_spliterator_queue_serializable13.enqueue(spliterator_queue_serializable38);
        java.util.Spliterator<edu.osu.cs362.Queue<java.io.Serializable>> spliterator_queue_serializable40 = queue_spliterator_queue_serializable13.peek();
        queue_spliterator_queue_serializable0.enqueue(spliterator_queue_serializable40);
        org.junit.Assert.assertNotNull(spliterator_queue_serializable2);
        org.junit.Assert.assertNotNull(iterator_queue_serializable3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertNotNull(spliterator_queue_serializable7);
        org.junit.Assert.assertNotNull(spliterator_queue_serializable9);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertNotNull(iterator_spliterator_queue_serializable11);
        org.junit.Assert.assertNotNull(spliterator_spliterator_queue_serializable12);
        org.junit.Assert.assertNotNull(spliterator_queue_serializable15);
        org.junit.Assert.assertNotNull(iterator_queue_serializable16);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "" + "'", str17.equals(""));
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "" + "'", str18.equals(""));
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "" + "'", str19.equals(""));
        org.junit.Assert.assertNotNull(spliterator_queue_serializable20);
        org.junit.Assert.assertNotNull(spliterator_obj23);
        org.junit.Assert.assertNotNull(spliterator_queue_serializable25);
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "" + "'", str26.equals(""));
        org.junit.Assert.assertTrue("'" + serializable30 + "' != '" + 1L + "'", serializable30.equals(1L));
        org.junit.Assert.assertNotNull(iterator_serializable31);
        org.junit.Assert.assertTrue("'" + serializable32 + "' != '" + 1L + "'", serializable32.equals(1L));
        org.junit.Assert.assertNotNull(iterator_queue_serializable34);
        org.junit.Assert.assertTrue("'" + str35 + "' != '" + "1  " + "'", str35.equals("1  "));
        org.junit.Assert.assertNotNull(iterator_queue_serializable36);
        org.junit.Assert.assertNotNull(spliterator_queue_serializable38);
        org.junit.Assert.assertNotNull(spliterator_queue_serializable40);
    }
}
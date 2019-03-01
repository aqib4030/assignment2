import java.sql.SQLOutput;
import java.util.*;

public class main {

    static  void vectors()
    {
        Vector vector  = new Vector ();
        vector.add(10);
        vector.add("a");
        System.out.println(vector.get(0));
        System.out.println(vector.get(1));
        System.out.println("capacity of the vector is : " + vector.capacity());
        vector.add(10);
        vector.add("a");
        vector.add(10);
        vector.add("a");
        vector.add(10);
        vector.add("a");
        vector.add(10);
        vector.add("a");
        vector.add(10);
        vector.add("a");
        vector.add(10);
        vector.add("a");
        vector.add(10);
        vector.add("a");
        vector.add(10);
        vector.add("a");
        System.out.println("after adding some other values greater than the index of 10 , capacity of the vector is : " + vector.capacity());
        vector.remove(0);

        System.out.println("size of the vector is : " + vector.size());
        vector.removeElement("a");
        System.out.println("size of the vector after removing object  is : " + vector.size());



    }
    static  void ArrayListVsVector()
    {
        ArrayList<Integer> ArrList = new ArrayList<Integer>();
        ArrList.add(10);
        ArrList.add(127312);
        ArrList.add(12);
        ArrList.add(1212);
        ArrList.add(7312);

        for ( Integer  x : ArrList)
        {
            System.out.println(x);
        }

        int Test = ArrList.get(2);
        ArrList.remove(2);
        System.out.println("Removed Value is " + Test + "\n");
        for ( Integer  x : ArrList)
        {
            System.out.println(x);
        }
        ArrList.removeAll(ArrList);
        System.out.println("Size of the araay list now is : " + ArrList.size());


        System.out.println("Now testing vectors \n");

        vectors();
    }

    static void treeset ()
    {
        TreeSet<Integer> tree = new TreeSet<Integer>();
        System.out.println("size of the treeset is : " + tree.size());
        tree.add(1);
        tree.add(1);
        tree.add(1);
        tree.add(1);
        tree.add(1);
        tree.add(1);
        tree.add(1);
        tree.add(1);
        tree.add(1);
        tree.add(1);
        tree.add(1);
        System.out.println("size of the treeset is : " + tree.size());
        tree.add(2);

        tree.add(4);
        tree.add(3);

        for ( Integer x : tree)
        {
            System.out.println(x);
        }




    }

    static void HashsetVSsortedset()
    {
        HashSet <Integer> hash = new HashSet<Integer>();
        System.out.println( "size of the hashset is " + hash.size());
        hash.add(1);
        hash.add(3);
        hash.add(2);
        hash.add(4);
        hash.add(6);
        hash.add(7);
        hash.add(8);
        hash.add(1);
        hash.add(8);
        hash.add(1234);
        hash.add(256);
        hash.add(1);
        System.out.println( "size of the hashset is " + hash.size());

        for (Integer x : hash)
        {
            System.out.println(x);
        }

        System.out.println("in the portion of softed set");
        SortedSet <Integer> sortedset  = new SortedSet<Integer>() {
            @Override
            public Comparator<? super Integer> comparator() {
                return null;
            }

            @Override
            public SortedSet<Integer> subSet(Integer fromElement, Integer toElement) {
                return null;
            }

            @Override
            public SortedSet<Integer> headSet(Integer toElement) {
                return null;
            }

            @Override
            public SortedSet<Integer> tailSet(Integer fromElement) {
                return null;
            }

            @Override
            public Integer first() {
                return null;
            }

            @Override
            public Integer last() {
                return null;
            }

            @Override
            public int size() {
                return 0;
            }

            @Override
            public boolean isEmpty() {
                return false;
            }

            @Override
            public boolean contains(Object o) {
                return false;
            }

            @Override
            public Iterator<Integer> iterator() {
                return null;
            }

            @Override
            public Object[] toArray() {
                return new Object[0];
            }

            @Override
            public <T> T[] toArray(T[] a) {
                return null;
            }

            @Override
            public boolean add(Integer integer) {
                return false;
            }

            @Override
            public boolean remove(Object o) {
                return false;
            }

            @Override
            public boolean containsAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean addAll(Collection<? extends Integer> c) {
                return false;
            }

            @Override
            public boolean retainAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean removeAll(Collection<?> c) {
                return false;
            }

            @Override
            public void clear() {

            }
        };


        System.out.println("now testing treeset ");

        treeset();








    }

    static void ArrayVsList()
    {

        System.out.println("now in array and list section");
        int arr[] = new int[20];
        arr[0] = 1;
        arr[1] = 2;
        for ( int i = 0 ; i < 2 ; i++)
        {
            System.out.println("array element of " + i + " is " + arr[i]);
        }


        List list = new LinkedList ();
        ((LinkedList) list).addFirst(1);
        list.add(2);
        ((LinkedList) list).addFirst(3);
        System.out.println("size of the linked list is " + list.size() + "\n the elements of the list are : ");

        for ( int i = 0 ; i < list.size() ; i++)
        {
            System.out.println(list.get(i));
        }
    }

    static void NavigableSetNavigableMap()
    {
        NavigableSet <Integer> Ns = new TreeSet<Integer>();

        System.out.println("Size of navigable set is : " + Ns.size());
        Ns.add(1);
        Ns.add(1);
        Ns.add(1);
        Ns.add(1);
        Ns.add(1);
        System.out.println("after multiple same addition the size of the NAVIGABLE SET is " + Ns.size());
        Ns.add(3);
        Ns.add(5);
        Ns.add(3);

        System.out.println("after multiple Different addition the size of the NAVIGABLE SET is " + Ns.size() + "and elements are");
        for (Integer x : Ns)
        {
            System.out.println(x);
        }
        System.out.println("Lasr element is : " + Ns.last());
        System.out.println("First element is : " + Ns.first());





        NavigableMap <String , Integer> NM = new TreeMap<String, Integer>( );
        System.out.println("AT FIRST Size of navigable Map is : " + NM.size());
        NM.put("Aqib" , 4030);
        NM.put("Aqib" , 4186);



        System.out.println("after multiple same addition of key but different value the size of the NAVIGABLE MAP is " + NM.size());
        NM.put("Hsmmad" , 4030);
        NM.put("Hammad" , 4030);
        System.out.println("after multiple same addition the size of the NAVIGABLE Map is " + NM.size() + " and elements are");
        System.out.println(NM);

        System.out.println("last entry in map is : " + NM.lastEntry());
        System.out.println("First entry in map is : " + NM.firstEntry());
        System.out.println("First Key is :  "+ NM.firstKey()) ;
        System.out.println( "Last key is :  "+  NM.lastKey());

    }

    public static void main(String[] args)
    {
        ArrayListVsVector();

        System.out.println("now into sets");
        HashsetVSsortedset();

        ArrayVsList();

        System.out.println("now checking simple set the was just covered in the previous functions ");


        System.out.println("now navigable map and navigable set");
        NavigableSetNavigableMap();
    }
}

package Day02;

import java.util.*;

public class CollectionPractice {

    public static void main(String[] args) {

        List<String> list1 = new Stack<>();

        list1.addAll(Arrays.asList("A","B","C","D","E"));

        System.out.println(list1);

        //LIFO==> E
        ((Stack)list1).pop(); //pop();-> is inside the Stack class to reach it we need to do down casting(remember polymorphism)

        System.out.println(list1);

        //LIFO==> D
        ((Stack<String>) list1).pop();

        System.out.println(list1);

        System.out.println("----------------------------");
        Set<Integer> set1 =new HashSet<>();
        set1.addAll(Arrays.asList(10,10,1,1,2,3,4,5,6,7,8,9,16, null, null));

        Set<Integer> set2 =new LinkedHashSet<>();
        set2.addAll(Arrays.asList(10,10,1,1,2,3,4,5,6,7,8,9,16, null, null));

        Set<Integer> set3 = new TreeSet<>();
        set3.addAll(Arrays.asList(10,10,1,1,2,3,4,5,6,7,8,9,16)); //if you put null key word here you well see it does not accept

        System.out.println("set1 = " + set1);
        System.out.println("set2 = " + set2);
        System.out.println("set3 = " + set3);

        System.out.println("-------------------------------");

        Queue<Integer> queue = new PriorityQueue<>();
        queue.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,10));

        System.out.println(queue);

        queue.poll(); //FIFO ==> 1

        System.out.println(queue);

        queue.poll(); //FIFO ==> 2

        System.out.println(queue);

        System.out.println("-----------------------------------------");


        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,1,2,3,4,5,6,7,1,2,3,4,5));

        //lest remove all the elements that are less than 4
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i)<4){
                list.remove(i);
            }
        }
        System.out.println("list = " + list); //[2, 4, 2, 4, 5, 6, 7, 2, 4, 5] still we still have element unexpected
        //because remove() method removes value NOT object during the iteration. We solve this problem with methods in Iterable collection

        System.out.println("-------------------------");

        //iterator only way to remove object from collection
        List<Integer> list2 = new ArrayList<>(Arrays.asList(1,2,3,4,1,2,3,4,5,6,7,1,2,3,4,5));

        Iterator<Integer> iterator = list2.iterator(); //iterator contains of iteration of all object

        while (iterator.hasNext()){ //checks if there is still object in iterator

            if(iterator.next()<4){
                iterator.remove();
            }
        }
        System.out.println("list2 = " + list2);  //[4, 4, 5, 6, 7, 4, 5] problem is solved

        System.out.println("-------------------------");

        //lest remove all the elements that are less than 4 SHORT WAY
        List<Integer> list3 = new ArrayList<>(Arrays.asList(1,2,3,4,1,2,3,4,5,6,7,1,2,3,4,5));
        list3.removeIf(p -> p < 4);

        System.out.println("list3 = " + list3);

    }
}

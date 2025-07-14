import java.util.*;
class ArrayLists {
    public static void main(String args[]){
        //arraylist have no finiteness
        ArrayList<Integer> list = new ArrayList<Integer>();//this is how arraylist made class of data type is written between <>

        //adding element using .add() method
        list.add(1);
        list.add(2);
        list.add(3);

        System.out.println(list);

        //getting element using index

        System.out.println(list.get(2));

        //adding at specific index using add(where to add ,element want to add)
        list.add(1,4);
        System.out.println(list);

        //to replace the element using set(where to add ,element want to add)
        list.set(0, 5);
        System.out.println(list);

        //delete element using remove(index of removing element)
        list.remove(2);
        System.out.println(list);

        //size of list

        System.out.println(list.size());

        //sorting of list using sort() which is from collection class
        Collections.sort(list);
        System.out.println(list);


    }

    
}

import java.util.LinkedList;

public class LinkedlistTest {
    public static void main(String[] args) {
        // create a new linked list
        LinkedList<String> linkedList = new LinkedList<String>();

        // add elements to the linked list
        linkedList.add("apple");
        linkedList.add("banana");
        linkedList.add("cherry");

        // print out the linked list
        System.out.println(linkedList);

        // add an element at a specific index
        linkedList.add(1, "grape");

        // print out the linked list again
        System.out.println(linkedList);

        // remove the first element
        linkedList.remove();

        // print out the linked list one more time
        System.out.println(linkedList);
    }
}
import java.util.ArrayList;
public class ArraylistTest {
        public static void main(String[] args) {
            // create a new array list
            ArrayList<String> arrayList = new ArrayList<String>();

            // add elements to the array list
            arrayList.add("apple");
            arrayList.add("banana");
            arrayList.add("cherry");

            // print out the array list
            System.out.println(arrayList);

            // add an element at a specific index
            arrayList.add(1, "grap");

            // print out the array list again
            System.out.println(arrayList);

            // remove the last element
            arrayList.remove(arrayList.size() - 1);

            // print out the array list one more time
            System.out.println(arrayList);
        }
}

public class Main {
    public static void main(String[] args) {
        BST<Integer, String> bst = new BST<>();

        //Test put method
        bst.put(5, "Apple");
        bst.put(2, "Banana");
        bst.put(8, "Orange");
        bst.put(1, "Pizza");
        bst.put(4, "Burger");
        bst.put(6, "Fries");
        bst.put(9, "Cola");

        //Test get method
        System.out.println(bst.get(2));
        System.out.println(bst.get(6));
        System.out.println(bst.get(9));
        System.out.println(bst.get(3));

        //Test delete method
        bst.delete(2);
        bst.delete(6);

        //Test iterator method
        Iterable<BST.KeyValue<Integer, String>> iterator = bst.iterator();
        for (BST.KeyValue<Integer, String> elem : iterator) {
            System.out.println(elem.getKey() + " - " + elem.getValue());
        }

        //Test size method
        System.out.println("Size: " + bst.size());
    }
}
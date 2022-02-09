public class MyListTest {
    public static void main(String[] args) {
        MyList<Integer> myList1 = new MyList<>();
        myList1.add(1);
        myList1.add(2);
        myList1.add(3);

        myList1.add(1, 9);

        myList1.remove(0);
        myList1.toArray();

        if (myList1.contains(9)) {
            System.out.println("has");
        } else {
            System.out.println("doesnt");
        }

        System.out.println(myList1.indexOf(2));

        System.out.println(myList1.get(1));
    }
}

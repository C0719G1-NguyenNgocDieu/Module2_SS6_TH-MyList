public class TestMyList {
    public static void main(String[] args) {
        MyList<Integer> myList = new MyList<>();
        myList.add(1);
        myList.add(2);
        myList.add(3);
        myList.add(4);
        myList.add(5);

        System.out.println(myList.get(4));
        System.out.println(myList.get(1));
        System.out.println(myList.get(2));
        System.out.println("-----");
        System.out.println(myList.get(-1));
    }
}

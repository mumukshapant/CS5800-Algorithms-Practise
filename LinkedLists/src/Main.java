public class Main {
    public static void main(String[] args) {


        Node obj = new Node(); // LIST 1
        obj.insert(10);
        obj.insert(20);
        obj.insert(30);
        obj.insert(40);

        Node obj2 = new Node(); // LIST 2
        obj2.insert(9);
        obj2.insert(22);
        obj2.insert(29);

        obj.printing(); //list1
        obj2.printing(); //list 2

       // ListNode mergedList = obj.mergeTwoLists(obj.head, obj2.head);

        obj.reversingList();
    }
}
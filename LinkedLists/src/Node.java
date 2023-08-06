import java.util.List;

public class Node
{
    ListNode head;
    public ListNode insert(int data)
    {

        ListNode curr = head;
        ListNode newnode= new ListNode(data);

        newnode.next=null;
        newnode.data = data;

        if (head == null)
            head = newnode;

        else
        {
            while (curr.next != null)
            {
                curr=curr.next;
            }
            curr.next=newnode;
        }

        return newnode;
    }

    public void printing()
    {
        ListNode curr= head;

        while(curr!=null)
        {
            System.out.print(curr.data+" --> ");
            curr=curr.next;
        }
        System.out.println(" ");
    }


    public void delete(int x)
    {
        ListNode curr=head.next;
        ListNode prev=head;

        //deletion from beginning
        if(prev.data==x && head == prev)
            head=head.next;


        while(curr!=null)
        {
            if (curr.data==x)
            {
                prev.next=curr.next;
                curr=curr.next;

            }
            prev=curr;
            curr=curr.next;
        }
    }


    public ListNode removeNthFromEnd( int n)
    {
       ListNode curr= head;
       int len=0 ;

       //calculate Length of the list. Say len=4. Then we do len-n
       while(curr!=null)
       {
           len=len+1;
           curr=curr.next;
       }
       curr=head;

        if(len==n)
        {
            head=head.next;
        }
        else {
            for (int i = 0; i < len - n - 1; i++)
                curr = curr.next;

            curr.next = curr.next.next;
        }



       System.out.println(len);
        return head;
    }

    public void reverseList()
    {
    ListNode dummy = null ;

    while(head!=null)
    {
        ListNode hNext = head.next ;
        head.next = dummy;
        dummy = head;
        head=hNext;
    }


    }
// h    newH     temp
// 1 ->  2  ->    3   ->

    public ListNode mergeTwoLists(ListNode list1, ListNode list2)
    {
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;

        while(list1!=null && list2!=null)
        {
            if(list1.data <= list2.data)
            {
                curr.next=list1;
                list1=list1.next;
            }

            else
            {
                curr.next = list2 ;
                list2=list2.next;
            }

            curr= curr.next;

        }

        if(list1!=null)
            curr.next= list1;

        else if (list2!=null)
            curr.next = list2;



        while(dummy.next!=null)
        {System.out.print(dummy.next.data+" --- ");

            dummy=dummy.next; }

        return dummy.next;
    }


//    public boolean isPalindrome(ListNode head)
//    {
//        ListNode tail = new ListNode(0 );
//        ListNode curr = head;
//
//        while(tail!=null)
//            {
//                tail = tail.next;
//            }
//while ( curr!=null && tail!=head && curr!=tail)
//{
//    if(curr.data == tail.data)
//        return
//}
//
//    }


    public void reversingList()
    {
        ListNode dummy = null ;

        while (head!=null)
        {
            ListNode newHead = head.next;

            head.next= dummy;
            dummy=head;
            head= newHead;

        }

        System.out.println("Reversed List");
        while (dummy!=null)
        {

            System.out.print(dummy.data+" -> ");
            dummy= dummy.next;

            int n = Integer.MAX_V
        }

    }




    }

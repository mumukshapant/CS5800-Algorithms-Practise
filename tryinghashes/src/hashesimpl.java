import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class hashesimpl {


    public hashesimpl(int size)
    {
        this.size = size;
        this.buckets = new Node[size];
    }


    private static class Node
    {
        String key;
        int value;
        Node next;

        Node(String key, int value)
        {
            this.key = key;
            this.value = value;
            this.next = null;
        }
    }

    private int size;
    private Node[] buckets;

    private int hashFunction(String key)
    {
        int bi = 0;

        for (int i = 0; i < key.length(); i++)
        { // bi = (int)(key.charAt(i)) % size ; // poor hash function
             bi = ( (bi*31)+ (int)(key.charAt(i)) )% size; // better hash functions, collisions are distributed evenly
        }
        return bi;
    }


//INSERT
    public void put(String key, int value)
    {
        int bi = hashFunction(key);
        Node node = buckets[bi];

        while (node != null)
        {
            if (node.key.equals(key))  // checks if key in hashmap exists.
        {   node.value += value;
            return;
        }
            node = node.next;
        }
        Node newnode = new Node(key, value); // if key not exists, insert the key & value pair
        newnode.next = buckets[bi];
        buckets[bi] = newnode;

    }

    // PRINT -- FINDS KEY  & return it value
    public int findKey(String key)
    {
        int bi = hashFunction(key);
        Node node = buckets[bi];

        while (node != null) {
            if (node.key.equals(key)) {
                return node.value;
            }
            node = node.next;
        }
        return -1;
    }

  // list all the keys
    public ArrayList<String> listAll()
    {
        ArrayList<String> keyset = new ArrayList<>();
        for (Node node : buckets) {
            while (node != null)
            {
                keyset.add(node.key);  // keyset arryalist will contain the list of keys present
                node = node.next;
            }  }
        return keyset;
    }



    // remove -- first find the bucket index using hashfunction.

    public void remove(String key)
    {
        int bi = hashFunction(key);
        Node node = buckets[bi];
        Node prev = null;

        while (node != null)
        {
            if (node.key.equals(key))
            {
                if (prev == null)
                {
                    buckets[bi] = node.next;
                } else {
                    prev.next = node.next;
                }
                return;
            }
            prev = node;
            node = node.next;

        }
    }







    //increase
    public int increase (String key)
    {
        int bi = hashFunction(key);
       Node node =  buckets[bi];
        while (node!=null )
        {
            if(node.key.equals(key))
            {
                node.value++ ;
                return node.value;
            }
            node = node.next;
        }
         return -1;

    }


//collisions
    public int numberofcollisions(int index)
    {
        int count =0;

        Node node = buckets[index];
        while(node!=null)
        {
            count++;
            node = node.next;
        }
        return count;
    }






}

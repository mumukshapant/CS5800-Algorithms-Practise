import java.util.LinkedList;
import java.util.Stack;

public class Graph
{

int V ; //vertex
LinkedList<Integer>[] adj;

    public Graph(int V) //constructor
    {
        this.V= V;
         adj= new LinkedList[V];


        for (int i=0;i<V; i++) // creating Linked List for every Vertex. IF V=4, 0-> LL , 1->LL , 2->LL , 3->LL
        {
            adj[i]=new LinkedList<Integer>(); // adj.length == V
        }
    }




    public  void insertEdge (int u, int v)
    {
       // adj.add
        adj[u].add(v);

    }

    public void printG()
    {
        for(int i =0;i<V;i++)
        {
            System.out.print(i+" -> " );

            int size = 0;

            while(size!=adj[i].size())
            {
                System.out.print(adj[i].get(size)+" ");
                size++;
            }

            System.out.println();
        }
    }

    public void dfs()
    {

    }




}


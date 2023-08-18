import java.util.Stack;

public class Main {
    public static void main(String[] args)
    {



        Graph obj=new Graph(4);// no of vertices

        obj.insertEdge(0,4);
        obj.insertEdge(0,2);
        obj.insertEdge(0,3);
        obj.insertEdge(1,4);

      //  System.out.println(obj.adj.length);
        obj.printG();





    }
}
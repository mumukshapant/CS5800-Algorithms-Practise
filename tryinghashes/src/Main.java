import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main  {

    public static void main (String args[])
    {    int max_hash  = 1000;
        hashesimpl obj = new hashesimpl(max_hash);
//        obj.put("Mumu", 1);
//        obj.put("Yani", 22);
//        obj.put("khal", 1);
//        obj.put("gsu",36);
//        obj.put("Mumukhjajsfhdajkfhadkshfsda", 22);
//        //obj.remove("Mumu");
//
//
//        System.out.println( obj.findKey("Mumu"));
//        System.out.println(  obj.listAll());
//       // System.out.println(  obj.increase("khal") ); //2
//
//        System.out.println(  obj.hashFunction("Mumu") ); //27
//        System.out.println(  obj.hashFunction("gsu") ); //27
//        System.out.println(  obj.hashFunction("Yani") ); //15
//        System.out.println(obj.numberofcollisions(27));

        String path ="/Users/mumukshapant/Desktop/alice_in_wonderland.txt";

        String contents = "";

// file read write code from net & others
        try {
            File file = new File(path);
            BufferedReader reader = new BufferedReader(new FileReader(file));
            String line;
            StringBuilder sb = new StringBuilder();
            while ((line = reader.readLine()) != null) {
                sb.append(line);
            }
            contents = sb.toString(); // write the content of the file to "contents"
            reader.close();
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }

        System.out.println(contents);



        String[] processed_contents = contents.toLowerCase().split("\\W+");
        for (int i = 0; i< processed_contents.length; i++)
        {
            obj.put(processed_contents[i],1);
        }



        // printing all collisions to output file

        String output_path ="/Users/mumukshapant/Desktop/out copy.txt";


        try {
            FileWriter writer = new FileWriter(output_path);

            ArrayList<String> keys = obj.listAll();   // list of keys

            for (String key : keys)
            {
                int frequency = obj.findKey(key);
                writer.write(key+" = "+frequency+"\n "); // keys & their frequency
            }
            writer.close();

        }
        catch (IOException e)
        {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }



//no of colisions

for (int i=0 ; i<max_hash; i++ )
{
    System.out.println(obj.numberofcollisions(i));
}












    }





/*
// Key and their values
        String[] keys = obj.listAll().toArray(new String[0]);

        for (int i =0;i<keys.length;i++)
        {
            System.out.println("for key "+keys[i]+" value is "+obj.findKey(keys[i]));
        }





      /*
//deleting a key
        obj.remove("alice") ;
        System.out.println(obj.findKey("alice"));


        //inserting a key
        obj.remove("mumuksha");

        System.out.println(obj.findKey("mumuksha") ) ;
*/







    }



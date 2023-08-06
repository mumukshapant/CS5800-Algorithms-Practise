import java.util.Scanner;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class HashMapCode {

        // Define the maximum hash size
        private static final int MAXHASH = 1000;

        // Node class for the linked list
        private static class Node {
                String key;
                int value;
                Node next;

                Node(String key, int value) {
                        this.key = key;
                        this.value = value;
                }
        }

        // Hash function for strings
        private static int hash(String key) {
                int hash = 0;
                for (int i = 0; i < key.length(); i++) {
                        hash = (hash * 31 + key.charAt(i)) % MAXHASH;
                }
                return hash;
        }

        // Insert a new key-value pair into the hash table
        private static void insert(Node[] table, String key, int value) {
                int index = hash(key);
                Node node = table[index];
                while (node != null) {
                        if (node.key.equals(key)) {
                                node.value = value;
                                return;
                        }
                        node = node.next;
                }
                node = new Node(key, value);
                node.next = table[index];
                table[index] = node;
        }

        // Delete a key-value pair from the hash table
        private static void delete(Node[] table, String key) {
                int index = hash(key);
                Node node = table[index];
                Node prev = null;
                while (node != null) {
                        if (node.key.equals(key)) {
                                if (prev == null) {
                                        table[index] = node.next;
                                } else {
                                        prev.next = node.next;
                                }
                                return;
                        }
                        prev = node;
                        node = node.next;
                }
        }

        // Increase the value associated with a key in the hash table
        private static void increase(Node[] table, String key) {
                int index = hash(key);
                Node node = table[index];
                while (node != null) {
                        if (node.key.equals(key)) {
                                node.value++;
                                return;
                        }
                        node = node.next;
                }
        }

        // Find the value associated with a key in the hash table
        private static int find(Node[] table, String key) {
                int index = hash(key);
                Node node = table[index];
                while (node != null) {
                        if (node.key.equals(key)) {
                                return node.value;
                        }
                        node = node.next;
                }
                return 0;
        }

        // List all keys in the hash table
        private static void listAllKeys(Node[] table, FileWriter writer) throws IOException {
                for (int i = 0; i < MAXHASH; i++) {
                        Node node = table[i];
                        while (node != null) {
                                writer.write(node.key + " " + node.value + "\n");
                                node = node.next;
                        }
                }
        }

        public static void main(String[] args) {

                // Read input file
                Scanner scanner = new Scanner(new File("/Users/mumukshapant/Desktop/aliceFile.txt\""));
                // Create hash table
                Node[] table = new Node[MAXHASH];
                // Process input file
                while (scanner.hasNext()) {
                        String word = scanner.next().toLowerCase().replaceAll("[^a-z]", "");
                        if (!word.isEmpty()) {
                                int count = find(table, word);
                                if (count == 0) {
                                        insert(table, word, 1);
                                } else {
                                        increase(table, word);
                                }


                        }
                }
        }
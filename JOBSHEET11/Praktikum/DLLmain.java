package JOBSHEET11.Praktikum;
import java.util.Scanner;

public class DLLmain {
    public static void main(String[] args) throws Exception{
        DoubleLinkedList dll = new DoubleLinkedList();
        // dll.print();
        // System.out.println("Size : " +dll.size());
        // System.out.println("=======================");
        // dll.addFirst(3);
        // dll.addLast(4);
        // dll.addFirst(7);
        // dll.print();
        // System.out.println("Size : "+dll.size());
        // System.out.println("======================");
        // dll.add(40, 1);
        // dll.print();
        // System.out.println("Size : "+dll.size());
        // System.out.println("======================");
        // dll.clear();
        // dll.print();
        // System.out.println("Size : "+dll.size());

        // dll.addLast(50);
        // dll.addLast(40);
        // dll.addLast(10);
        // dll.addLast(20);
        // dll.print();
        // System.out.println("Size : "+dll.size());
        // System.out.println("=======================");
        // dll.removeFirst();
        // dll.print();
        // System.out.println("Size : "+dll.size());
        // System.out.println("=======================");
        // dll.reremoveLast();
        // dll.print();
        // System.out.println("Size : "+dll.size());
        // System.out.println("=======================");
        // dll.remove(1);
        // dll.print();
        // System.out.println("Size : "+dll.size());

        dll.print();
        System.out.println("Size : "+dll.size());
        System.out.println("=======================");
        dll.addFirst(3);
        dll.addLast(4);
        dll.addFirst(7);
        dll.print();
        System.out.println("Size : "+ dll.size());
        System.out.println("=======================");
        dll.add(40, 1);
        dll.print();
        System.out.println("Size : "+dll.size());
        System.out.println("=======================");
        System.out.println("Data awal pada Linked List adalah : "+dll.getFirst());
        System.out.println("data akhir pada Linked List adalah : "+dll.getLast());
        System.out.println("data indeks ke-1 pada Linked List adalah : "+dll.get(1));
    }    
}

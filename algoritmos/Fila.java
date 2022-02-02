package algoritmos;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.PriorityQueue;
import java.util.Queue;

public class Fila {
    public static void main(String[] args) {
        Queue<String> amigos = new PriorityQueue<>();

        amigos.add("alice");
        amigos.add("bob");
        amigos.add("claire");

        System.out.println(amigos);

        Deque<String> abigos = new ArrayDeque<>();

        abigos.add("alice");
        abigos.addFirst("bob");
        abigos.addLast("claire");

        System.out.println(abigos);
    }


}


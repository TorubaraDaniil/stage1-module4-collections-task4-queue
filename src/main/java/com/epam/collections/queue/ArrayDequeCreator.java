package com.epam.collections.queue;

import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.Queue;

public class ArrayDequeCreator extends PriorityQueue<String> {
    public ArrayDeque<Integer> createArrayDeque(Queue<Integer> firstQueue, Queue<Integer> secondQueue) {
        ArrayDeque<Integer> finalQueue = new ArrayDeque<>();
        finalQueue.add(firstQueue.poll());
        finalQueue.add(firstQueue.poll());
        finalQueue.add(secondQueue.poll());
        finalQueue.add(secondQueue.poll());

        while (!firstQueue.isEmpty() && !secondQueue.isEmpty()){
            firstQueue.add(finalQueue.pollLast());
            finalQueue.add(firstQueue.poll());
            finalQueue.add(firstQueue.poll());
            secondQueue.add(finalQueue.pollLast());
            finalQueue.add(secondQueue.poll());
            finalQueue.add(secondQueue.poll());
        }
        return finalQueue;
    }
}


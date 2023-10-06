package com.epam.collections.queue;

import java.util.*;

public class PriorityQueueCreator {
    public PriorityQueue<String> createPriorityQueue(List<String> firstList, List<String> secondList) {
        PriorityQueue<String> resultQueue = new PriorityQueue<>(Collections.reverseOrder());
        resultQueue.addAll(firstList);
        resultQueue.addAll(secondList);
        return resultQueue;
    }
}
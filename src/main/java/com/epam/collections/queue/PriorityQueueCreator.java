package com.epam.collections.queue;

import java.util.*;

public class PriorityQueueCreator {
    public PriorityQueue<String> createPriorityQueue(List<String> firstList, List<String> secondList) {
        List<String>resultList=new ArrayList<>(firstList);
        resultList.addAll(secondList);
        resultList.sort(Comparator.comparing(String::toLowerCase));
        PriorityQueue<String> resultQueue=new PriorityQueue<>(Collections.reverseOrder());
        resultQueue.addAll(resultList);
        return resultQueue;
    }
}

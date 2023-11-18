package com.epam.collections.queue;

import java.util.ArrayDeque;
import java.util.Objects;
import java.util.PriorityQueue;
import java.util.Queue;

public class ArrayDequeCreator extends PriorityQueue<String> {
    public ArrayDeque<Integer> createArrayDeque(Queue<Integer> firstQueue, Queue<Integer> secondQueue) {
        ArrayDeque<Integer>resultDequeue=new ArrayDeque<>();
        resultDequeue.add(Objects.requireNonNull(firstQueue.remove()));
        resultDequeue.add(Objects.requireNonNull(firstQueue.remove()));
        resultDequeue.add(Objects.requireNonNull(secondQueue.remove()));
        resultDequeue.add(Objects.requireNonNull(secondQueue.remove()));
        while(firstQueue.size()>0&&secondQueue.size()>0){
            firstQueue.add(resultDequeue.poll());
            resultDequeue.add(Objects.requireNonNull(firstQueue.remove()));
            resultDequeue.add(Objects.requireNonNull(firstQueue.remove()));
            secondQueue.add(resultDequeue.poll());
            resultDequeue.add(Objects.requireNonNull(secondQueue.remove()));
            resultDequeue.add(Objects.requireNonNull(secondQueue.remove()));
        }
        System.out.println(resultDequeue);
        return resultDequeue;
    }
}

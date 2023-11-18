package com.epam.collections.queue;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class DishOrderDeterminer {
    public List<Integer> determineDishOrder(int numberOfDishes, int everyDishNumberToEat) {
        Queue<Integer> queue=new PriorityQueue<>();
       if(numberOfDishes>0) {
           for (int i = 0; i < numberOfDishes - 1; i++) {
               if (i != everyDishNumberToEat) {
                   queue.add(i);
               }
           }
           queue.add(everyDishNumberToEat);
       }
        return new ArrayList<>(queue);
    }
}

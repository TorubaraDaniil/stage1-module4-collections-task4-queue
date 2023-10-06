package com.epam.collections.queue;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

public class DishOrderDeterminer {
    public List<Integer> determineDishOrder(int numberOfDishes, int everyDishNumberToEat) {
        ArrayDeque<Integer> finalDeque = new ArrayDeque<>();
        List<Integer> finalList = new ArrayList<>();
        for (int i = 1; i <= numberOfDishes; i++){
            finalDeque.add(i);
        }
        int i = 1;
        while (!finalDeque.isEmpty()){
            if (i == everyDishNumberToEat){
                finalList.add(finalDeque.pollFirst());
                i=1;
            }else {
                Integer integer = finalDeque.pollFirst();
                finalDeque.addLast(integer);
                i++;
            }
        }
        return finalList;
    }
}

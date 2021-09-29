package com.agelmahdi.divideconqueralgorithms;

class HouseRobber {
    /*
    * 1. Given N number of houses along the street with some amount of money
    * 2. Adjacent houses cannot be stolen
    * 3. Find the maximum amount that can be stolen
    *
    *                                           maxValue(0)
    *
    *                           maxValue(2)                    maxValue(1)
    *
    *                  maxValue(4)     maxValue(3)     maxValue(3)    maxValue(2)
    * */

    private int maxValueFromHouses(int []houses, int current){
        if(current >= houses.length){
            return 0;
        }

        int currentHouse  = houses[current] + maxValueFromHouses(houses, current+2);
        int skipCurrentHouse = maxValueFromHouses(houses, current+1);
        return Math.max(currentHouse,skipCurrentHouse);

    }

    public int maxValue(int []houses){
        return maxValueFromHouses(houses,0);
    }
}

package com.agelmahdi.dynamicprogramming;

class HouseRobber {

    private int maxValueFromHouses(int []houses, int current, int []memo){
        if(current >= houses.length){
            return 0;
        }

        if (memo[current] == 0){
            int currentHouse  = houses[current] + maxValueFromHouses(houses, current+2,memo);
            int skipCurrentHouse = maxValueFromHouses(houses, current+1,memo);
            memo[current] = Math.max(currentHouse,skipCurrentHouse);
        }

        return memo[current];

    }

    public int maxValueMemo(int []houses){
        int []memo = new int[houses.length];
        return maxValueFromHouses(houses,0,memo);
    }
}

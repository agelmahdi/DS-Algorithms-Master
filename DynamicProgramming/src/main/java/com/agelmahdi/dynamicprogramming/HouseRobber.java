package com.agelmahdi.dynamicprogramming;

class HouseRobber {

    private int maxValueFromHouses(int[] houses, int current, int[] memo) {
        if (current >= houses.length) {
            return 0;
        }

        if (memo[current] == 0) {
            int currentHouse = houses[current] + maxValueFromHouses(houses, current + 2, memo);
            int skipCurrentHouse = maxValueFromHouses(houses, current + 1, memo);
            memo[current] = Math.max(currentHouse, skipCurrentHouse);
        }

        return memo[current];

    }

    public int maxValueMemo(int[] houses) {
        int[] memo = new int[houses.length];
        return maxValueFromHouses(houses, 0, memo);
    }

    public int maxValueTabular(int[] houses) {
        int[] tabular = new int[houses.length + 2];

        for (int i = houses.length - 1; i > -1; i--) {
            int currentHouse = houses[i] + tabular[i + 2];
            int skipCurrentHouse = tabular[i + 1];
            tabular[i] = Math.max(currentHouse, skipCurrentHouse);
        }

        return tabular[0];
    }
}

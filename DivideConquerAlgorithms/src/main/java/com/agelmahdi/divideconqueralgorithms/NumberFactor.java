package com.agelmahdi.divideconqueralgorithms;

class NumberFactor {
    // Given N, find the number of ways to express N as a sum of 1,2,and 4
    // e.g. N = 5 then ways to express 5 is: {1,4}, {4,1}, {1,3,1}, {3,1,1}, {1,1,3}, {1,1,1,1,1}

    public int factor(int n) {
        if (n == 0 || n == 1 || n == 2) {
            return 1;
        }
        if (n == 3) {
            return 2;
        }

        int sub1 = factor(n - 1);
        int sub2 = factor(n - 3);
        int sub3 = factor(n - 4);

        return sub1 + sub2 + sub3;

    }


}

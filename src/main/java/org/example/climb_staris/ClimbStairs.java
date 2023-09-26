package org.example.climb_staris;

public class ClimbStairs {

    public static void main(String[] args){
        int n = 35 ;
        System.out.println(climbStairs(n));
    }

    public static int climbStairs(int n) {
        int steps = 0 ;
        if(n == 0) return steps = 0;
        else if (n == 1) steps = 1;
        else if (n == 2) steps = 2;
        else {
            for(int i = 3 ; i <=n ; i++){
                steps = climbStairs(i - 1) + climbStairs(i - 2);
            }
        }
        return steps;
    }
}


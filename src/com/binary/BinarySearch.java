package com.binary;

import org.junit.Test;

public class BinarySearch {

    private double[] array;

    public BinarySearch(double[] array)
    {
        this.array = array;
    }

    public int find(double  x)
    {
        int i = -1;
        if (this.array == null) return i;
        if (this.array.length == 1 && this.array[0] == x) return 0;

        int low = 0, high = this.array.length, mid;
        while (low < high)
        {
            mid = (low + high) >>> 1;
            if (x == this.array[mid])
            {
                i = mid;
                break;
            }
            else
            {
                if (x < this.array[mid]) high = mid;
                else low = mid + 1;
            }
        }
        return i;
    }


    public static void main(String[] args) {

//        BinarySearch search = new BinarySearch(null);
//        System.out.println("TEST1:");
//        System.out.println("Result for find(5): " + search.find(5) + "; should be -1");
//        System.out.println("-------\n");
//
//        search = new BinarySearch(new double[]{0});
//        System.out.println("TEST2:");
//        System.out.println("Result for find(0): " + search.find(0) + "; should be 0");
//        System.out.println("Result for find(5): " + search.find(5) + "; should be -1");
//        System.out.println("Result for find(8): " + search.find(8) + "; should be -1");
//        System.out.println("-------\n");
//
//        search = new BinarySearch(new double[]{5});
//        System.out.println("TEST3:");
//        System.out.println("Result for find(5): " + search.find(5) + "; should be 0");
//        System.out.println("Result for find(8): " + search.find(8) + "; should be -1");
//        System.out.println("-------\n");
//
//        search = new BinarySearch(new double[]{5,8,20,35});
//        System.out.println("TEST4:");
//        System.out.println("Result for find(3): " + search.find(3) + "; should be -1");
//        System.out.println("Result for find(5): " + search.find(5) + "; should be 0");
//        System.out.println("Result for find(8): " + search.find(8) + "; should be 1");
//        System.out.println("Result for find(12): " + search.find(12) + "; should be -1");
//        System.out.println("Result for find(18): " + search.find(18) + "; should be -1");
//        System.out.println("Result for find(20): " + search.find(20) + "; should be 2");
//        System.out.println("Result for find(25): " + search.find(25) + "; should be -1");
//        System.out.println("Result for find(35): " + search.find(35) + "; should be 3");
//        System.out.println("Result for find(38): " + search.find(38) + "; should be -1");
//        System.out.println("-------\n");
    }

}

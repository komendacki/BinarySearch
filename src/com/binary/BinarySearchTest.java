package com.binary;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.*;

/**
 * Created by Admin on 06.03.2016.
 */
public class BinarySearchTest {
    BinarySearch search1 = new BinarySearch(null);
    BinarySearch search2 = new BinarySearch(new double[0]);
    BinarySearch search3 = new BinarySearch(new double[]{5});
    BinarySearch search4 = new BinarySearch(new double[]{5,8,20,35});

    @Test
    public void Test1()
    {
        assert search1.find(5) == -1;
    }

    @Test
    public void Test2()
    {
        assert search2.find(5) == -1;
    }

    @Test
    public void Test3()
    {
        assert search3.find(5) == 0;
        assert search3.find(8) == -1;
    }

    @Test
    public void Test4()
    {
        assert search4.find(3) == -1;
        assert search4.find(5) == 0;
        assert search4.find(8) == 1;
        assert search4.find(12) == -1;
        assert search4.find(18) == -1;
        assert search4.find(20) == 2;
        assert search4.find(25) == -1;
        assert search4.find(35) == 3;
        assert search4.find(38) == -1;
    }


}
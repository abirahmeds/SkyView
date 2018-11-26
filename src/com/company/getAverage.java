package com.company;

public class SkyView {
    public class getAverage(int startRow, int endRow, int startCol, int endCol) {
        int count = 0;
        int sum = 0;

        for (int r = startRow; r <= endRow; r++)
        {
            for (int c = startCol; c <= endCol; c++){
                sum += view[r][c];
                count ++;
            }
        }
        int average = sum/count;
        return average;
    }
}

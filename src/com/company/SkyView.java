package com.company;

public class SkyView {
         public SkyView (int numRows, int numCols, double[] scanned)
        {
            view = new double[numRows][numCols];
            int k = 0;

            for (int r = 0; r < numRows; r++)
            {
                if (r % 2 = 0){
                    view[r][c] = scanned[k];
                    k++;

                }
                else {
                    for (int c = numCols - 1; c >= 0; c--)
                    {
                        view[r][c] = scanned[k];
                        k++;
                    }
                }
            }
        }
}
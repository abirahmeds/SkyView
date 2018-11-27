package com.company;

public class SkyView {
    private double[][] view;
    public SkyView(int numRows, int numCols, double[] scanned) {
        view = new double[numRows][numCols];
        int scannedNum = 0;
        for (int x = 0; x < numRows; x++) {
            if (x % 2 == 0) {
                for (int y = 0; y < numCols; y++) {
                    view[x][y] = scanned[scannedNum];
                    scannedNum++;
                }
            } else {
                int pos = 0;
                for (int z = scannedNum - 1 + numCols; z >= numCols * x; z--) {
                    view[x][pos] = scanned[z];
                    pos++;
                    scannedNum++;
                }
            }
        }
    }


    public double getAverage(int startRow, int endRow, int startCol, int endCol) {
        double sum = 0;
        int items = 0;
        for (int x = startRow; x <= endRow; x++) {
            for (int y = startCol; y <= endCol; y++) {
                sum += view[x][y];
                items++;
            }
        }
        return sum / items;
    }

    public String toString() {
        String str = "";
        for (double[] rowArr : view) {
            for (double d : rowArr) {
                str += " " + d;
            }
            str += "\n";
        }
        return str;
    }
}

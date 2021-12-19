package pl.put.poznan.sortingmadness.logic;

public class Timer {
    public static long startTimer() {
        long start = System.currentTimeMillis();
        return start;
    }

    public static long stopTimer() {
        long end = System.currentTimeMillis();
        return end;
    }

    public static long getTime(long start, long end) {
        long time = end - start;
        return time;
    }

}

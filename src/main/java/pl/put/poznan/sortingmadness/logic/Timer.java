package pl.put.poznan.sortingmadness.logic;

public class Timer {
    private long start;
    private long end;

    public void startTimer() {
        this.start = System.currentTimeMillis();
    }

    public void stopTimer() {
        this.end = System.currentTimeMillis();
    }

    public long getTime() {
        long time = this.end - this.start;
        return time;
    }

}

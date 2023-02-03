package helper;


public class CountHelper {
    public int step;
    public CountHelper() {
        step = 1;
    }
    public int getStep() {
        return step++;
    }
}

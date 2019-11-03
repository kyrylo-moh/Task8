package model;

public class ModelNumber {

    private int lengthNumber;
    private int startValue;
    private int endValue;

    public ModelNumber(int lengthNumber) {
        this.lengthNumber = lengthNumber;
    }

    public ModelNumber(int startValue, int endValue) {
        this.startValue = startValue;
        this.endValue = endValue;
    }

    public int getLengthNumber() {
        return lengthNumber;
    }

    public void setLengthNumber(int lengthNumber) {
        this.lengthNumber = lengthNumber;
    }

    public int getStartValue() {
        return startValue;
    }

    public void setStartValue(int startValue) {
        this.startValue = startValue;
    }

    public int getEndValue() {
        return endValue;
    }

    public void setEndValue(int endValue) {
        this.endValue = endValue;
    }
}

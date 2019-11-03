package service;

import model.ModelNumber;

import java.util.ArrayList;
import java.util.List;

public class Service {

    private List<Integer> numbersList = new ArrayList<Integer>();

    public List<Integer> listLength(ModelNumber modelNumber) {
        int firstValue = 0;
        int secondValue = 1;
        int nextValue;
        numbersList.add(firstValue);
        for (int i = secondValue + 1; i <= modelNumber.getLengthNumber(); i++) {
            //swap
            nextValue = firstValue + secondValue;
            firstValue = secondValue;
            secondValue = nextValue;
            numbersList.add(nextValue);
        }
        return numbersList;
    }

    public int fibonacciNumber(int number) {
        double nextValue = (Math.pow(((1 + Math.sqrt(5)) / 2), number) - Math.pow(((1 - Math.sqrt(5)) / 2), number)) / Math.sqrt(5);
        return (int)nextValue;
    }

    public List<Integer> fibonacciDiapason(ModelNumber modelNumber) {
        int firstValue = fibonacciNumber(modelNumber.getStartValue());
        int secondValue = fibonacciNumber(modelNumber.getStartValue() + 1);
        numbersList.add(firstValue);
        numbersList.add(secondValue);
        int nextValue;
        for (int i = modelNumber.getStartValue() + 2; i <= modelNumber.getEndValue() - 1; i++) {
            //swap
            nextValue = firstValue + secondValue;
            firstValue = secondValue;
            secondValue = nextValue;
            numbersList.add(nextValue);
        }
        return numbersList; 
    }

    public void printList() {
        for (Integer i:
             numbersList) {
            System.out.print(i + ", ");
        }
    }

    public void clearList() {
        numbersList.clear();
    }
}

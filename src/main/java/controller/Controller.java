package controller;

import model.ModelNumber;
import service.Service;
import util.*;

public class Controller {

    private Input input = new Input();
    private Service service = new Service();
    private Output output = new Output();
    private ModelNumber modelNumber;

    public void printAndClear() {
        service.printList();
        service.clearList();
    }

    public void runTask1() {
        output.printSetCount();
        modelNumber = new ModelNumber(input.getLength());
        service.listLength(modelNumber);
        printAndClear();
    }

    public void runTask2() {
        output.printSetStartAndEnd();
        modelNumber = new ModelNumber(input.getInt(), input.getInt());
        service.fibonacciDiapason(modelNumber);
        printAndClear();
    }

    public void choice() {
        output.printInformation();
        int taskNum = input.getInt();
        switch (taskNum) {
            case 1:
                runTask1();
                break;
            case 2:
                runTask2();
                break;
            default:
                output.printInformation();
                runTask1();
        }
    }

    public void runController() {
        String answer;
        do {
            choice();
            output.printQuestion();
            answer = input.getAnswer();
        } while (answer.equalsIgnoreCase("y") ||
                answer.equalsIgnoreCase("yes"));
    }



}

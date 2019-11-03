package util;

public class Output {

    public void printDefault() {
        System.out.println("Please enter value (integer): ");
    }

    public void printNumBiggerZero() {
        System.out.println("Number must be bigger than 0");
    }

    public void printQuestion() {
        System.out.println("\nDo you want continue? [Yes/No]");
    }

    public void printInformation() {
        System.out.println("You must enter number of tasks 1 or 2, in default you do task#1");
    }

    public void printSetCount() {
        System.out.println("TASK#1\tPlease enter count of numbers");
    }

    public void printSetStartAndEnd() {
        System.out.println("TASK#2\tPlease enter start and count number [start ... count]");
    }

}

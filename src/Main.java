import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        int[] dataPoints = new int[100];
        int sum = 0;
        double average;
        int minVal = 100;
        int maxVal = 0;

        Scanner sca = new Scanner(System.in);

        String prompt = "Enter an integer within the range";

        int userNum = SafeInput.getRangedInt(sca, prompt, 1, 100);

        int uNumCount = 0;

        Random rand = new Random();
        int indexVal = rand.nextInt(100) + 1;

        for(int i = 0; i < dataPoints.length; i++) {
            dataPoints[i] = indexVal;
            indexVal = rand.nextInt(100) + 1;
            System.out.println(dataPoints[i]);
        }

        for(int i = 0; i < dataPoints.length; i++) {
            dataPoints[i] = indexVal;
            indexVal = rand.nextInt(100) + 1;
            System.out.print(dataPoints[i] + " | ");
        }

        for(int i = 0; i < dataPoints.length; i++) {
            dataPoints[i] = indexVal;
            indexVal = rand.nextInt(100) + 1;
            sum += indexVal;
        }

        average = (double) sum / dataPoints.length;


        System.out.println("The sum of dataPoints is " + sum);
        System.out.println("The average of dataPoints is " + average);
        System.out.println("Average of dataPoints is: " + getAverage(dataPoints));


        for(int i = 0; i < dataPoints.length; i++) {
            dataPoints[i] = indexVal;
            indexVal = rand.nextInt(100) + 1;
            System.out.print(dataPoints[i] + " ");
        }

        for(int i = 0; i < dataPoints.length; i++) {
            if(dataPoints[i] < minVal) {
                minVal = dataPoints[i];
            }
        }

        for(int i = 0; i < dataPoints.length; i++) {
            if(dataPoints[i] > maxVal) {
                maxVal = dataPoints[i];
            }
        }

        System.out.println();
        System.out.println("The minimum value in dataPoints is " + minVal + ".");
        System.out.println("The maximum value in dataPoints is " + maxVal + ".");

        for(int i = 0; i < dataPoints.length; i++) {
            dataPoints[i] = indexVal;
            indexVal = rand.nextInt(100) + 1;
            System.out.print(dataPoints[i] + " | ");
        }

        for(int i = 0; i < dataPoints.length; i++) {
            if(dataPoints[i] == userNum) {
                uNumCount++;
            }
        }

        System.out.println();
        System.out.println("Your number appeared " + uNumCount + " times in this array");


        for(int i = 0; i < dataPoints.length; i++) {
            dataPoints[i] = indexVal;
            indexVal = rand.nextInt(100) + 1;
        }

        int index = 0;

        for(int i = 0; i < dataPoints.length; i++) {

            System.out.print(dataPoints[i] + " | ");

            if(dataPoints[i] == userNum) {
                uNumCount++;
            }

            if(uNumCount == 1) {
                index = i;
                break;
            }
        }

        System.out.println();
        System.out.println("The value " + userNum + " was found at dataPoints index " + index);

    }

    public static double getAverage(int[] values) {
        double average;
        int sum = 0;

        for (int value : values) {
            sum += value;
        }

        average = (double) sum / values.length;

        return average;
    }
}


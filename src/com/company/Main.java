package com.company;
import java.io.IOException;
import java.util.*;
import java.io.File;
public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sf = new Scanner(new File("scores.txt"));
        String array[] = new String[1000];

        int maxIndx = 0;

        /*while (sf.hasNextLine()) {
            int i = 1;

            String s = sf.nextLine();
            String dumbarray[] = s.split("\\t");

            if (dumbarray.length == 22) {

                while (i % 22 != 0) {

                    array[i - 1] = dumbarray[i - 1];
                    i++;

                }

            }

        }
        System.out.print(array[21]);
        String newArray[] = new String[10000];*/
        sf.nextLine();
        while (sf.hasNextLine())
        {

            array[maxIndx] = sf.nextLine();
            maxIndx++;
        }
        sf.close();
        System.out.println(array[3]);

        String columns [] = new String[array.length];



        System.out.println(columns[3]);



        String schoolName [] = new String[columns.length];
        double averageArray [] = new double[columns.length];

        int goUp = 0;
        for (int i = 0; i < array.length; i++, goUp++) {
            double num1, num2, num3;
//PROBLEM----scanner system is reading the blank lines in the file try and fix it
            columns = array[i].split("\t");

            if(columns.length == 22 || columns.equals("")) {

                System.out.println(columns[18]);

                num1 = Double.parseDouble(columns[18]);
                num2 = Double.parseDouble(columns[19]);
                num3 = Double.parseDouble(columns[20]);


                double average = (num1 + num2 + num3) / 3;

                averageArray[goUp] = average;
                schoolName[goUp] = columns[1];

                System.out.println(schoolName[goUp] + ": " + averageArray[goUp]);


            }

            else {
                int nothingHappens;
            }
        }

        double highestAverage = 0;
        double secondAverage = 0;
        double thirdAverage = 0;

        int k = 0;

        for (int i = 1; i < averageArray.length; i++, k++) {
            if (averageArray[k] > averageArray[i]) {
                thirdAverage = secondAverage;
                secondAverage = highestAverage;
                highestAverage = averageArray[i];

            }

            else if (averageArray[k] == averageArray[i]){

            }

            else {
                int dumb = 0;
            }

        }
        System.out.println(highestAverage + secondAverage + thirdAverage);
        //READ ME ------- COMPARE THE INDICES IN THE AVERAGE ARRAY TO FIND THE AVERAGE AND PUT THE TEAM NAME THERE
    }

}
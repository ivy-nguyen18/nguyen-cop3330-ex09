/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Ivy Nguyen
 */

package ex09.base;

public class CalculateGallons {

    static final int GALLONS = 350;
    private float squarefeet;

    public CalculateGallons(float length, float width){
        this.squarefeet = length * width;
    }

    public void gallonsForCeiling(){
        float totalGallons = squarefeet / GALLONS;
        int gallonsNeeded = (int) Math.ceil(totalGallons);

        System.out.printf("You will need to purchase %d gallons of paint to cover %d square feet", gallonsNeeded, (int)squarefeet);
    }

}

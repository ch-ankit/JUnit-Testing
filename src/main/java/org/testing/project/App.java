package org.testing.project;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }
    public int add(int a, int b) {
        return a + b;
    }
    public int sub(int a, int b) {
        return a - b;
    }   
    //accept only five digit numbers
    public boolean isFiveDigit(int num) {
        if(num < 10000 || num > 99999) {
            return false;
        }
        return true;
    }
    //calculate grade of a student
    public String getGrade(int marks) {
        if(marks < 0 || marks > 100) {
            return "Invalid marks";
        }
        if(marks >= 80) {
            return "A";
        }
        if(marks >= 60) {
            return "B";
        }
        if(marks >= 40) {
            return "C";
        }
        return "D";
    }
    //calculate area of a circle
    public double getAreaOfCircle(int radius) {
        return Math.PI * radius * radius;
    }
    //calculate area of a rectangle
    public int getAreaOfRectangle(int length, int breadth) {
        return length * breadth;
    }
}


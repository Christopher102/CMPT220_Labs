package lab06;

import javax.swing.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Grader {
    private File file;
    private ArrayList<Integer> grades;

    public static void main(String[] args) {
         String path = "C:\\Users\\cf201\\IdeaProjects\\CMPT220_Labs\\src\\lab06\\grades1";
        Grader Chris = new Grader();
        Chris.Grader(path);
        Chris.getGrades();
        System.out.println(Chris.getGrades());
        Chris.calculateAverage();

    }

    public void Grader(String path){
        try {
            setFile(path);
        } catch (Exception FileNotFoundException){
            System.out.println("File does not exist. Please try again");
        }

    }
    public void Grader(File newfile){
        try {
            file = newfile;
        } catch (Exception FileNotFoundException){
            System.out.println("Error! Fine Not found!");
        }
    }

    public double calculateAverage(){
        System.out.println("Calculating Average!");
        int average = 0;
        for(int grade : grades){
            grade += average;
        }
        average = average/grades.size();
        System.out.println(average);
        return average;
    }

    public File getFile() {
        System.out.println("Getting file!");
        return file;
    }

    public File setFile(String path) {
        System.out.println("Setting file!");
        try {
            file = new File(path);
            System.out.println("Set file success!");
        }
        catch (Exception FileNotFoundException) {
            System.out.println("File does not exist!");
        }
        return file;

    }

    public ArrayList<Integer> getGrades(){
        System.out.println("Getting Grades!");
        try {
            setGrades();
        }catch(Exception FileNotFoundException){
            System.out.println("Error getting grades. File does not exist!");

        }
        return grades;

    }

    private void setGrades() throws FileNotFoundException{
        try (Scanner filereader = new Scanner(file)) {
            while (filereader.hasNextLine()){
                grades.add(filereader.nextInt());

            }
        }
        }




    }






package com.company;

import java.util.Scanner;

public class Institute {
    public static void main(String[] args) {
        System.out.println("Exam Report");
        System.out.println("Subject code 202");
        System.out.println("Exam Science Mid");
        System.out.println("Exam Paper Summary");
        ExamPaper.printQuestions(40, 2);
        Scanner sc= new Scanner(System.in);
        System.out.print("No of correct questions: ");
        String noOfCorrectQuestions = sc.nextLine();
        SciencePaper sciencePaper = new SciencePaper("Science Mid", 202);
        sciencePaper.calculateMarks(Integer.parseInt(noOfCorrectQuestions));
        System.out.println("Total Marks is " +sciencePaper.getTotalMarks());
    }
}

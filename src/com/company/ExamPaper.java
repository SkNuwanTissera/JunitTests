package com.company;

public abstract class ExamPaper {
    String examName;
    int subCode;
    static int marksForCorrect = 2;

    private class Question {
        int noOfStructuredQuestions;
        int noOfMCQQuestions;
    }

    public ExamPaper(String examName, int subCode) {
        this.examName = examName;
        this.subCode = subCode;
    }

    public abstract void calculateMarks(int correct);

    public static void printQuestions(int cc, int cy) {
        System.out.println("No of MCQ " + String.valueOf(cc));
        System.out.println("No of Structured " + String.valueOf(cy));
    }
}

package com.company;

public class SciencePaper extends ExamPaper {

    private float totalMarks;

    public SciencePaper(String examName, int subCode) {
        super(examName, subCode);
    }

    @Override
    public void calculateMarks(int correct) {
        totalMarks =  correct * marksForCorrect;
    }

    public float getTotalMarks() {
        return totalMarks;
    }
}

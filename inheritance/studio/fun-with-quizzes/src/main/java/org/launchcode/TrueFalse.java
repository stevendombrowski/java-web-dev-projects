package org.launchcode;

public class TrueFalse extends Question{
    public TrueFalse(String prompt, String answer) {
        super(prompt, answer);
    }

    @Override
    public void checkAnswer(String answerInput) {
        if (answerInput.equals(getAnswer())){
            System.out.println("Correct");
        } else {
            System.out.println("Incorrect");
        }
    }
}



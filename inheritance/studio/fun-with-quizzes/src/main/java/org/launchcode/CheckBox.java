package org.launchcode;

public class CheckBox extends Question{
    private String[] choices;
    public CheckBox(String prompt, String answer, String []choices) {
        super(prompt, answer);
        this.choices = choices;
    }

    public String[] getChoices() {
        return choices;
    }

    public void setChoices(String[] choices) {
        this.choices = choices;
    }

    @Override
    public void checkAnswer(String answerInput) {
        super.checkAnswer(answerInput);
    }
}

package onfreetube.question;

public abstract class AbstractQuestion {
    private String question;

    public AbstractQuestion(String question){
        this.question = question;
    }

    public String getQuestion(){
        return question;
    }

    public abstract boolean checkAnswer(String answer);
}

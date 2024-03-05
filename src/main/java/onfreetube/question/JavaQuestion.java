package onfreetube.question;

public class JavaQuestion extends AbstractQuestion {

    public JavaQuestion( ) {
        super("Сколько в языке программирования Java есть примитивов?");
    }

    @Override
    public boolean checkAnswer(String answer) {
        return answer.equals("8");
    }
}

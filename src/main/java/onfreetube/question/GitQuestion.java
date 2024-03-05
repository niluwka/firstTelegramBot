package onfreetube.question;

public class GitQuestion extends AbstractQuestion{
    public GitQuestion(){
        super("С помощью какой команды в системе контроля версий Git можно просмотреть авторов различных срок в одном файле?");
    }

    @Override
    public boolean checkAnswer(String answer) {
        return answer.toLowerCase().contains("blame");
    }
}

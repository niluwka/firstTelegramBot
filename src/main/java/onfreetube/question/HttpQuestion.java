package onfreetube.question;

public class HttpQuestion extends AbstractQuestion{
    private String[] methods = {"get", "post", "put", "patch", "delete"};
    public HttpQuestion(){
        super("Какие методы HTTP-запросов вы знаете?");
    }

    @Override
    public boolean checkAnswer(String answer) {
        answer = answer.toLowerCase();

        for (String method: methods
             ) {
           if (!answer.contains(method)){
               return false;
           }
        }
        return true;
    }
}

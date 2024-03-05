package onfreetube.question;

public class SQLQuestion extends AbstractQuestion{
   public SQLQuestion(){
      super("Сколько в реляционных (SQL) базах данных существует типов связей между таблицами?");
   }

   @Override
   public boolean checkAnswer(String answer) {
      return answer.equals("3");
   }
}

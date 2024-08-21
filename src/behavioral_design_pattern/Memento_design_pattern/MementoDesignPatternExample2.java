package behavioral_design_pattern.Memento_design_pattern;

import java.util.ArrayList;
import java.util.List;

public class MementoDesignPatternExample2 {
    static List<FeedbackMemento> stateList= new ArrayList<>();
    public static void main(String[] args) {
        FeedbackForm form= new FeedbackForm("Karthik","karthik.abc@gmail.com","Food is good");
        FeedBackCaretaker careTaker=new  FeedBackCaretaker();
        stateList.add(careTaker.saveState(form));

        form.setName("Nitesh");
        form.setEmailId("Nitesh@gmail.com");
        form.setComment("form is filled");
        stateList.add( careTaker.saveState(form));

        form.setName("Rahul");
        form.setEmailId("Rahul@gmail.com");
        form.setComment("Rahul is good");
        stateList.add(careTaker.saveState(form));

        //careTaker.restoreState(form);

        for (int i = stateList.size()-1; i >=0; i--) {
            System.out.println(stateList.get(i).getName()+" "+stateList.get(i).getEmailId()+" "+stateList.get(i).getComment());
        }
    }
}

package Design_Patterns_LLD.behavioral_design_pattern.Memento_design_pattern;

public class MementoDesignPatternExample {
    public static void main(String[] args) {
        //creating the new form
        FeedbackForm feedbackForm = new FeedbackForm("JavaMaster", "master@master", "I am a java developer :)");
        FeedBackCaretaker caretaker = new FeedBackCaretaker();
        caretaker.saveState(feedbackForm); // saving to memento

        // modifying the form
        feedbackForm.setName("Arjun");
        feedbackForm.setEmailId("Arjun@ac.com");
        feedbackForm.setComment("I am a Python developer");

        // getting the previous data
        caretaker.restoreState(feedbackForm);

        feedbackForm.setName("Dheeraj");
        feedbackForm.setEmailId("Dheeraj@ac.com");
        feedbackForm.setComment("I am a .Net developer");
        caretaker.saveState(feedbackForm); // now saving this new to the memento


        feedbackForm.setName("Raja");
        feedbackForm.setEmailId("Raja@ac.com");
        feedbackForm.setComment("I am a JavaScript developer");

        caretaker.restoreState(feedbackForm);

        System.out.println(feedbackForm.getComment());
    }
}

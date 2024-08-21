package behavioral_design_pattern.Memento_design_pattern;

public class FeedbackForm {
    private String name;
    private String emailId;
    private String comment;

    FeedbackForm(String name, String emailId, String comment) {
        this.name = name;
        this.emailId = emailId;
        this.comment = comment;
    }

    public FeedbackMemento save(FeedbackForm feedbackForm) {
        FeedbackMemento memento = new FeedbackMemento(feedbackForm.getName(), feedbackForm.getEmailId(), feedbackForm.getComment());
        return memento;
    }

    public void restore(FeedbackMemento form) {
        //restoring the changes from the memento
        this.name=form.getName();
        this.emailId=form.getEmailId();
        this.comment=form.getComment();
        System.out.println("Name is "+name+" email id is "+emailId+" comments is "+comment);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}

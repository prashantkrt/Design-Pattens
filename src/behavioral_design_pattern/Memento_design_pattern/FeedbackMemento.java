package behavioral_design_pattern.Memento_design_pattern;

public class FeedbackMemento {

    private String name;
    private String emailId;
    private String comment;

    public FeedbackMemento(String name, String emailId, String comment) {
        this.name = name;
        this.emailId = emailId;
        this.comment = comment;
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

package behavioral_design_pattern.Memento_design_pattern;

// History of an object
public class FeedBackCaretaker {

    FeedbackMemento memento;

    public FeedbackMemento saveState(FeedbackForm form) {
        memento = form.save(form);
        return memento;
    }

    public void restoreState(FeedbackForm form) {
        form.restore(memento);
    }

}

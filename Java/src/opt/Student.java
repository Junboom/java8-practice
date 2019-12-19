package opt;

import java.util.List;

public class Student {
    private String name;
    private List<Subject> subjects;

    public List getSubjects() {
        return subjects;
    }
    public void setSubjects(Subject subject) {
        subjects.add(subject);
    }
}

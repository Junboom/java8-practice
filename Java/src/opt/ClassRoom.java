package opt;

import java.util.Arrays;
import java.util.List;

public class ClassRoom {
    private List<Student> students;

    public void setStudentList(List<Student> students) {
        students.addAll(students);
    }

    public List getStudentList() {
        return students;
    }
}

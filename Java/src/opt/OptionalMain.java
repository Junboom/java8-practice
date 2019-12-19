package opt;

import java.util.Arrays;

public class OptionalMain {

    public static void main(String[] args) {
        OptionalMain main = new OptionalMain();

        ClassRoom classRoom = new ClassRoom();

        Student student1 = new Student();
        Student student2 = new Student();
        Student student3 = new Student();

        Subject math = new Subject("홍길동1", 1);
        Subject korean = new Subject("홍길동2", 2);
        Subject eng = new Subject("홍길동3", 5);

        student1.setSubjects(math);
        student2.setSubjects(korean);
        student3.setSubjects(eng);
        classRoom.setStudentList(Arrays.asList(student1, student2, student3));

        int totalStudyHour = main.getTotalStudyHour(classRoom);

        System.out.println(totalStudyHour);
    }

    public int getTotalStudyHour(ClassRoom classRoom) {
        return classRoom.getStudentList().stream()
                .map(Student::getSubjects)
                .map(Subject::getHour)
                .reduce(Integer::sum)
                .orElse(0);
    }

}

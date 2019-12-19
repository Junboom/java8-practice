package opt;

public class Subject {
    private String teacherName;
    private int hour;
    public int getHour() {
        return hour;
    }
    public Subject(String teacherName, int hour) {
        this.teacherName = teacherName;
        this.hour = hour;
    }
}

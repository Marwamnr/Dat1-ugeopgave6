import java.util.ArrayList;

public class Teacher extends Person {
    private ArrayList<String> canTeach;
    private ArrayList<String> currentCourses;

    public Teacher(String name, ArrayList<String> canTeach, ArrayList<String> currentCourses) {
        super(name);
        this.canTeach = canTeach;
        this.currentCourses = currentCourses;
    }

    @Override
    public boolean addCourse(String course) {
        if(canTeach.contains(course)) {
            return true;
        } else {
            return false;
        }
    }
}


import java.util.ArrayList;

public class Student extends Person {
    //3.3
    private ArrayList<String> passedCourses;
    private ArrayList<String> currentCourses;
    public Student(String name, ArrayList<String> passedCourses, ArrayList<String> currentCourses){
        super(name); //3.2
        this.passedCourses = passedCourses;
        this.currentCourses = currentCourses;
    }

    //3.4
    @Override
    public boolean addCourse(String course) {
        if (passedCourses.contains(course)) {
            return false;
        } else {
            currentCourses.add(course);
            return true;
        }
    }
}

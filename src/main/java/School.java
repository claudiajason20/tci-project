import java.util.ArrayList;
import java.util.Date;

public class School {
    String name;
    Date openDate;
    ArrayList<course> courses = new ArrayList<>();

    public School(String name, Date openDate) {
        this.name = name;
        this.openDate = openDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getOpenDate() {
        return openDate;
    }

    public void setOpenDate(Date openDate) {
        this.openDate = openDate;
    }

    public ArrayList<course> getCourses() {
        return courses;
    }

    public void addCourses(course newCourse) {
        courses.add(newCourse);
    }

    public boolean checkStartDate(Date schoolStart, Date courseStart) throws CourseDateException{
        if (courseStart.after(schoolStart)) {
            return true;
        } else
            throw new CourseDateException("Course didn't start after School!");

    }
}

import java.util.ArrayList;

class TopStudentGrades extends StudentGrades {
    private final int howMany;

    public TopStudentGrades(String name, int howMany) {
        super(name);
        this.howMany = howMany;
    }

    @Override
    public void addGrade(Integer grade) {
        grades.add(grade);
        Collection.sort(grades);
        if(grades.size() > howMany)
            grades.remove();
    }
}

public class StudentGrades<T> {
    private final String name;
    private final ArrayList<T> grades;

    public StudentGrades(String name) {
        this.name = name;
        grades = new ArrayList<T>();
    }

    public String getName() {
        return name;
    }

    public T[] grades() {
        return grades.toArray();
    }

    @Override
    public String toString() {
        return String.format("Student: %s has grades:\n%s\n", name, grades.toString());
    }

    @Override
    public boolean equals(Object o) {
        if(o instanceof StudentGrades) {
            StudentGrades sg = (StudentGrades) o;
            return this.name.equals(sg.name) &&
                this.grades.equals(sg.grades);
        }
        return false;
    }

    public void addGrade(T grade) {
        grades.add(grade);
    }

    public static void main(String[] args) {
        StudentGrades<Integer> colesGrades = new StudentGrades<>("Cole");

        StudentGrades<Double> colesGrades = new StudentGrades<Double>("Cole");

        StudentGrades<GradeObject> colesGrades = new StudentGrades<>("Cole");
    }
}

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Students julius = new Students("julius");
        Students harrison = new Students("harrison");

        julius.addGrades(8);
        harrison.addGrades(10);

        List<Students> students = new ArrayList<>();
        students.add(julius);
        students.add(harrison);

        Students highestGradeStudent = null;
        double highestGrade = Double.MIN_VALUE;

        for (Students student : students) {
            double averageGrade = student.getAverageGrade();

            if (averageGrade > highestGrade) {
                highestGrade = averageGrade;
                highestGradeStudent = student;
            }
        }

        System.out.println("Julius' grade is: " +julius.getAverageGrade());
        System.out.println("Harrison's grade is: " +harrison.getAverageGrade());


        System.out.println("Student with the highest grade: " + highestGradeStudent.getName());


    }
}


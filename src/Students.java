import java.util.ArrayList;
import java.util.List;

public class Students {
    String name;
    List<Integer> grades = new ArrayList<>();

    public Students(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void addGrades(int grade) {
        grades.add(grade);
    }
    public float getAverageGrade(){
        if (grades.isEmpty()){
            System.err.println("The grade's field is empty");
            return 0;
        }else{
            int sum = 0;
            for(Integer grade: grades){
                sum += grade;
            }
            return (float) sum / grades.size();
        }
    }
}

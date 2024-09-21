import java.util.*;

class Result {

    public static List<Integer> gradingStudents(List<Integer> grades) {
        List<Integer> roundedGrades = new ArrayList<>();
        
        for (int grade : grades) {
            if (grade < 38) {
                roundedGrades.add(grade);
            } else {
                int nextMultipleOfFive = ((grade / 5) + 1) * 5;
                if (nextMultipleOfFive - grade < 3) {
                    roundedGrades.add(nextMultipleOfFive);
                } else {
                    roundedGrades.add(grade);
                }
            }
        }
        
        return roundedGrades;
    }
}

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Integer> grades = new ArrayList<>();
        
        for (int i = 0; i < n; i++) {
            grades.add(scanner.nextInt());
        }

        List<Integer> result = Result.gradingStudents(grades);
        for (int grade : result) {
            System.out.println(grade);
        }
        
        scanner.close();
    }
}

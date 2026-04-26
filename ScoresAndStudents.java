import java.util.ArrayList;
import java.util.Arrays;

public class ScoresAndStudents {
    public static void main(String[] args) {
        int[] scores = {70, 85, 90, 60, 75, 95, 80};
        System.out.println("_ Original Array _");
        for (int score : scores) {
            System.out.print(score + " ");
        }
        System.out.println();
        System.out.println("Array length: " + scores.length);
        scores[4] = 85;
        System.out.println("\n_ Array After Update _");
        for (int score : scores) {
            System.out.print(score + " ");
        }
        System.out.println();
        System.out.println("Array length after update: " + scores.length);
        Arrays.sort(scores);
        System.out.println("\n_ Sorted Array _");
        for (int score : scores) {
            System.out.print(score + " ");
        }
        System.out.println();
        int index = Arrays.binarySearch(scores, 85);
        System.out.println("Index of 85 after binary search: " + index);
        ArrayList<String> students = new ArrayList<>();
        students.add("Ahmed");
        students.add("Sara");
        students.add("Omar");
        students.add("Laila");
        students.add("Mona");
        System.out.println("\n_Students List (Before Changes) _");
        for (String name : students) {
            System.out.println(name);
        }
        students.set(2, "Youssef");
        students.remove("Laila");
        System.out.println("\n_ Students List (After Removal) _");
        for (String name : students) {
            System.out.println(name);
        }
        boolean exists = students.contains("Ibrahim");
        System.out.println("\nDoes Ibrahim exist? " + exists);

        if (!exists) {
            students.add(2, "Ibrahim");
            System.out.println("Ibrahim was added at index 2.");
        }
        int omarIndex = students.indexOf("Omar");
        System.out.println("Index of Omar: " + omarIndex);

        ArrayList<String> newStudents = new ArrayList<>();
        newStudents.add("Nour");
        newStudents.add("Kareem");
        newStudents.add("Dina");
        students.addAll(newStudents);
        System.out.println("\nTotal number of students: " + students.size());
        System.out.println("\n_ Full Students List _");
        for (String name : students) {
            System.out.println(name);
        }
        students.clear();
        System.out.println("\n _After clear() _");
        System.out.println("List is empty: " + students.isEmpty());
        System.out.println("Students list: " + students);
    }
}

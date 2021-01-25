package Student;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class HashMap_Set {
    public static void main(String[] args) {
        Map<Integer,Students> hashMap = new HashMap();
        Set<Students> hashSet = new HashSet();
        Students student1 = new Students("Nam",20, "HN");
        Students student2 = new Students("Hung",21, "HN");
        Students student3 = new Students("Ha",22, "HN");
        hashMap.put(1,student1);
        hashMap.put(2,student2);
        hashMap.put(3,student3);
        hashMap.put(4,student1);
        for(Map.Entry<Integer, Students> student : hashMap.entrySet()){
            System.out.println(student.toString());
        }
        hashSet.add(student1);
        hashSet.add(student2);
        hashSet.add(student3);
        hashSet.add(student1);
        for (Students students:hashSet) {
            System.out.println(students.toString());
        }
    }
}

package Rough;
import java.util.*;
import java.util.stream.Collectors;


public class rough {
    public static void main(String[] args) {
        // Define two lists
        List<String> item1 = List.of("apple", "banana", "orange");
        List<String> item2 = List.of("pomegranate", "banana", "kiwi");

        // Find common elements
        List<String> result = item1.stream()
                .filter(s -> item2.contains(s))  // Filter elements in item1 that are in item2
                .collect(Collectors.toList()); // Collect them into a list


        System.out.println(result);



        String rj="123";
        System.out.println(rj=="123");
        System.out.println(rj.equalsIgnoreCase("123"));

        //use of list, map and class objects for student class
        List<Student> students = new ArrayList<>();

        students.add(new Student("John", 20));
        students.add(new Student("Jane", 22));
        students.add(new Student("Doe", 21));
        students.add(new Student("Rishabh", 23));
        students.add(new Student("Rishabh", 23));
        students.add(new Student("Rishabh", 23));
        students.add(new Student("Rishabh", 23));
        students.add(new Student("Rishabh", 23));
        students.add(new Student("Rishabh", 23));
        students.add(new Student("Rishabh", 23));
        students.add(new Student("Rishabh", 23));

        // Sort by name using lambda expression
        students.sort((s1, s2) -> s1.getName().compareTo(s2.getName()));
        System.out.println("Sorted by name: " + students);
        // Sort by age using lambda expression
        students.sort((s1, s2) -> Integer.compare(s1.getAge(), s2.getAge()));
        System.out.println("Sorted by age: " + students);
        // Sort by name length using lambda expression
        students.sort((s1, s2) -> s2.getName().length() - s1.getName().length());
        System.out.println("Sorted by name length: " + students);
        // Sort by name length using lambda expression
        students.sort((s1, s2) -> s1.getName().length() - s2.getName().length());
        System.out.println("Sorted by name length: " + students);
        // Sort by name length using lambda expression
        students.sort((s1, s2) -> s1.getName().length() - s2.getName().length());
        System.out.println("Sorted by name length: " + students);
        // Sort by name length using lambda expression
        students.sort((s1, s2) -> s1.getName().length() - s2.getName().length());
        System.out.println("Sorted by name length: " + students);
        // Sort by name length using lambda expression
        students.sort((s1, s2) -> s1.getName().length() - s2.getName().length());
        System.out.println("Sorted by name length: " + students);
        // Sort by name length using lambda expression
        students.sort((s1, s2) -> s1.getName().length() - s2.getName().length());
        System.out.println("Sorted by name length: " + students);
        // Sort by name length using lambda expression
        students.sort((s1, s2) -> s1.getName().length() - s2.getName().length());
        System.out.println("Sorted by name length: " + students);
        // Sort by name length using lambda expression
        students.sort((s1, s2) -> s1.getName().length() - s2.getName().length());
        System.out.println("Sorted by name length: " + students);
        // Sort by name length using lambda expression
        //use of hashmap , like map of objects of strings or lis tof map of objects
        Map<String, List<Student>> studentMap = new HashMap<>();
        for (Student student : students) {
            String name = student.getName();
            if (!studentMap.containsKey(name)) {
                studentMap.put(name, new ArrayList<>());
            }
            studentMap.get(name).add(student);
        }
        System.out.println("Student Map: " + studentMap);
        //use of hashmap , like map of objects of strings or lis tof map of objects
        Map<String, List<Student>> studentMap2 = new HashMap<>();
        for (Student student : students) {
            String name = student.getName();
            if (!studentMap2.containsKey(name)) {
                studentMap2.put(name, new ArrayList<>());
            }
            studentMap2.get(name).add(student);
        }
        System.out.println("Student Map2: " + studentMap2);
        //use of hashmap , like map of objects of strings or lis tof map of objects
        Map<String, List<Student>> studentMap3 = new HashMap<>();
        for (Student student : students) {
            String name = student.getName();
            if (!studentMap3.containsKey(name)) {
                studentMap3.put(name, new ArrayList<>());
            }
            studentMap3.get(name).add(student);
        }
        System.out.println("Student Map3: " + studentMap3);
        //use of hashmap , like map of objects of strings or lis tof map of objects
        Map<String, List<Student>> studentMap4 = new HashMap<>();
        for (Student student : students) {
            String name = student.getName();
            if (!studentMap4.containsKey(name)) {
                studentMap4.put(name, new ArrayList<>());
            }
            studentMap4.get(name).add(student);
        }
        System.out.println("Student Map4: " + studentMap4);
        //use of hashmap , like map of objects of strings or lis tof map of objects
        Map<String, List<Student>> studentMap5 = new HashMap<>();
        for (Student student : students) {
            String name = student.getName();
            if (!studentMap5.containsKey(name)) {
                studentMap5.put(name, new ArrayList<>());
            }
            studentMap5.get(name).add(student);
        }
        System.out.println("Student Map5: " + studentMap5);
        //use of hashmap , like map of objects of strings or lis tof map of objects
        Map<String, List<Student>> studentMap6 = new HashMap<>();
        for (Student student : students) {
            String name = student.getName();
            if (!studentMap6.containsKey(name)) {
                studentMap6.put(name, new ArrayList<>());
            }
            studentMap6.get(name).add(student);
        }


        //in above all code, u didn tnotiece tht student class is not even there
        //bro wait are u there
        //student class is not there make taht first


    }}




//public class UserDao{
//    private final JdbcTemplate jdbcTemplate;

//    public UserDa
//}




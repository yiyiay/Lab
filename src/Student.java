public class Student {
    private String name;
    private String id;
    private String email;

    public Student(String name, String id, String email) {
        this.name = name;
        this.id = id;
        this.email = email;
    }

    public String getName() {
        return this.name;
    }

    public String getId() {
        return this.id;
    }

    public String getEmail() {
        return this.email;
    }

   public ArrayList<Student> findAll(ArrayList<Student> students, String name) throws Exception {
      ArrayList<Student> result = new ArrayList<Student>();
      for (Student student: students)
          if (student.getName().equals(name)) {
              result.add(student);
          }

      if (result.isEmpty()) {
          throw new Exception("There is no student with the given name!");
      }
      return result;
   }
}

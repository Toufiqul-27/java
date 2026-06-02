//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    List<Student> studentList = new ArrayList<>();
    studentList.add(new Student(1,"jhon Deo",34,2.4));
    studentList.add(new Student(2,"jhon Deo",23,2.6));
    studentList.add(new Student(3,"Ifti Chowdhury",16,3.52));
    studentList.add(new Student(4,"Ovi Chowdhury",23,2.6));

    List <Student> filterList = studentList.stream().filter(s -> s.getAge() >= 18).toList();
    long count = filterList.stream().filter(st -> st.getAge() >= 18 && st.getName().endsWith("Chowdhury")).count();
   OptionalDouble opGpa = studentList.stream().mapToDouble(s->s.getGpa()).average();
   if(opGpa.isPresent()){
       double gpa = opGpa.getAsDouble();
   }

   double gpaAverage = studentList.stream().filter(student -> student.getAge() > 20 && student.getGpa() > 2).mapToInt(s-> s.getAge()).average().orElse(0);


   IO.println();
}

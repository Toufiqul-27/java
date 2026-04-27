//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
   Rectangle r1 = new Rectangle ();
  r1.setLength(7);
  r1.setWidth(5);


   Employee e1 = new Employee();
   e1.setId(350);
   e1.setName("Toufiqul Islam");
   e1.setSalary(1000000);

    Cricle cr = new Cricle();
    cr.setRadius(7.5);


    Car c1 = new Car();
  c1.setBrand("toyota");
  c1.setModel("Axuoi");
  c1.setYear(2000);

    Student s1 = new Student();
  s1.setName("Toufiqul Islam");
  s1.setBatch(64);
  s1.setProgram("BSc in CSE");
  s1.setRollNumber(350);

  IO.println("Car brand is " + c1.getBrand() + " student name is " + s1.getName());

}

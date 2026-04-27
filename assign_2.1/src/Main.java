//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Scanner t = new Scanner(System.in);
    System.out.println("Enter your name : ");
    String name = t.nextLine();
    System.out.println("Enter your age : ");
    int age = t.nextInt();
    System.out.println("Enter your height : ");
    double height = t.nextDouble();
    System.out.println("Hello, "+name+"! you are " + age +" years old and your height is "+height+" feet." );

}

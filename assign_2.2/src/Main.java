//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Scanner in = new Scanner(System.in);
    System.out.println("Enter your name: ");
    String name = in.nextLine();
    System.out.println("Enter your birth year: ");
    int year =in.nextInt();
    System.out.println("hello, "+ name +" Your birth year is " + year +" and you are " + (2026-year) +" years old.");
}


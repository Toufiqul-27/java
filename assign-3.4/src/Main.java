//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Scanner in =new Scanner(System.in);
    IO.println(" enter  temperature in Fahrenheit : ");
    double Fahrenheit = in.nextDouble();
    IO.println(" temperature in Celsius is : " + (Fahrenheit - 32) * 5 / 9);
}


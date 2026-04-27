//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Scanner in = new Scanner(System.in);

    IO.println(" Enter 1st value : ");
    int num1 = in.nextInt();

    IO.println(" Enter 2nd value : ");
    int num2 = in.nextInt();

    IO.println(" Enter 3rd value : ");
    int num3 = in.nextInt();

    if( num1 > num2 && num1 > num3){
        IO.println("Largest value is : " + num1);
    }
    else if (num2 > num1 && num2 > num3){
        IO.println("Largest value is : " + num2);
    }
    else{
        IO.println("Largest value is : " + num3);
    }


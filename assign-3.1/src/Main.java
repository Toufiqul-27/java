//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
        Scanner in = new Scanner(System.in);
        IO.println("inter 1st value: ");
        int a = in.nextInt();
        IO.println("inter 2nd value: ");
        int b = in.nextInt();

        IO.println("Sum of two value is " + (a+b));
        if(a>b){
                IO.println("diffrence between them " + (a-b));
        }else{
                IO.println("diffrence between them " + ( b - a) ) ;
        }
        IO.println("product of two value is " + (a*b));

        if(b == 0){
                IO.println("Infinite !");
        }else{
                IO.println("quotient of two value is " + (a/b));
        }
}

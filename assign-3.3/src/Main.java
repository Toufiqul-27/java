//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    int sum=0;
    for(int i=1; i <= 100 ;i++ ){
        if (i % 2 == 0) {
            sum += i;
        }
    }
    IO.println("sum of all even numbers from 1 to 100 is = " + sum );

}

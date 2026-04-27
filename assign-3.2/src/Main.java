//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Scanner in =new Scanner(System.in);
    IO.println(" Enter your string : ");
    String st = in.nextLine();
    int v=0;
    int c =0;

    for (char ch : st.toCharArray()){
       if( ch == 'a' || ch == 'e' ||ch == 'i' ||ch == 'o' ||ch == 'u' ) {
           v++;
       }
       else{
           c++;
       }
    }
    IO.println(" Number of vowels = " + v);
    IO.println(" Number of  consonants = " + c);
}

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
 int id = 104;
 String name = "rifat";
 String password = "104tau";
 String program = "CSE";
 int batch = 64;
 double cgpa = 3.98;
 String courseCode = "CSE104.1" ;

    String line = id + "," + name + "," + password + "," + program + "," + batch + "," + cgpa + "\n";
    String courseLine = id + "," + courseCode + "\n";

   // write(line , "student.txt" );
   // write(courseLine,"Course.txt");
    search("104");



}
void write(String line , String filename){

    try{
        RandomAccessFile rw =new RandomAccessFile(filename,"rw");
        rw.seek(rw.length());
        rw.writeBytes(line);


    }catch (FileNotFoundException ex){
        IO.println("file not found ");
        ex.printStackTrace();
    }catch (IOException ex){
        IO.println(" fail to write ");
        ex.printStackTrace();
    }
}
void search(String courseId){
    try {
        RandomAccessFile r = new RandomAccessFile("Course.txt", "r");
        String courseLine;

        while((courseLine = r.readLine()) !=null){
            String [] arr = courseLine.split(",");
            if(arr[0].equals(courseId)){
                IO.println("course found: " + arr [1]);
            }
        }
    }catch (FileNotFoundException ex){
        IO.println("read error");
    } catch (IOException ex) {
       IO.println("fail");
    }

}


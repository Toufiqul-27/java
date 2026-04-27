//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() throws FileNotFoundException {
//    String userName = "ifti";
//    String password = "abc123";
//
//    String line = userName + "," + password + "\n";
    Scanner sc = new Scanner(System.in);
//
//write(line,"user.txt");
    if(!login()){
        IO.println(" wrong password ! ");
        return;
    }

  while (true){
      IO.println(" 1.add student \n 2.search & view student \n 3.assign course \n 4. view course\n 5. exit"  );
      int opt = sc.nextInt();
      sc.nextLine();

      switch (opt){
          case 1 : addStudent();break;
          case 2 : searchAndView();break;
          case 3 : assignCourse();break;
          case 4 : viewCourse();break;
          case 5 : return;
      }
  }

}


void write(String line , String filename){
    try{
        RandomAccessFile rw = new RandomAccessFile(filename,"rw");
        rw.seek(rw.length());
        rw.writeBytes(line);

    } catch (FileNotFoundException e) {
        IO.println("file not found");
    } catch (IOException e) {
        IO.println("fail to write");
    }
}


boolean login(){
    while (true){
        Scanner sc = new Scanner(System.in);
        IO.println(" user name : ");
        String u = sc.nextLine();
        IO.println(" password: ");
        String p = sc.nextLine();

        try{
            RandomAccessFile log = new RandomAccessFile("user.txt","r");
            String line;
            while((line = log.readLine()) != null){
                String[] arr = line.split(",");
                if(arr[0].equals(u) && arr[1].equals(p)){
                    return true;
                }
            }
        } catch (FileNotFoundException e) {
            IO.println("file not found");
        } catch (IOException e) {
            IO.println("fail to read");
        }
        IO.println("try again !");
    }
}
void addStudent(){
    Scanner sc = new Scanner(System.in);
    IO.println("ID: "); String id = sc.nextLine();
    IO.println("Name: "); String name = sc.nextLine();
    IO.println("program: "); String program = sc.nextLine();
    IO.println("Batch: "); int batch = sc.nextInt();
    IO.println("Cgpa: "); double cgpa = sc.nextDouble();

    String line = id +","+ name +","+ program +","+ batch +","+ cgpa+"\n";
    write(line,"Student.txt");
}
void searchAndView() throws FileNotFoundException {
    Scanner sc = new Scanner(System.in);
    IO.println("enter Id : ");
    String id = sc.nextLine();
    try{
        RandomAccessFile r =new RandomAccessFile("Student.txt" ,"r");
        String line;
        while((line = r.readLine()) != null){
            String[] a = line.split(",");
            if(a[0].equals(id)){
                IO.println("found : - " + a[1] +" " + a[2]+ " " + a[3] + " " + a[4]);
            }
        }
    }catch (IOException ex){
        IO.println();
    }
}
void assignCourse(){
    Scanner sc = new Scanner(System.in);
    IO.println("ID : ");
    String id = sc.nextLine();
    IO.println("course: ");
    String course = sc.nextLine();

    write(id+","+course+"\n" ,"course.txt");
}

void viewCourse(){
    Scanner sc = new Scanner(System.in);
    IO.println("enter id : ");
    String id = sc.nextLine();

    try{
        RandomAccessFile r = new RandomAccessFile("course.txt","r");
        String line;
        while((line = r.readLine()) != null){
            String[] a = line.split(",");
            if(a[0].equals(id)){go
                IO.println("course : " + a[1]);
            }

        }
    } catch (FileNotFoundException e) {
        throw new RuntimeException(e);
    } catch (IOException e) {
        throw new RuntimeException(e);
    }
}
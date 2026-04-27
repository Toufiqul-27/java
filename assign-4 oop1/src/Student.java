public class Student {
    private String name;
    private int rollNumber;
    private String program;
   private int batch;

    public Student(){

    }
    public Student(String name,int rollNumber,String program,int batch){
        this.name=name;
        this.rollNumber = rollNumber;
        this.program=program;
        this.batch=batch;

    }
    public Student (String name, String program){
        this.name=name;
        this.program=program;

    }
    public Student(String name , int batch, String program){
        this.name=name;
        this.batch=batch;
        this.program=program;
    }
    public void setName(String name){
        this.name= name;

    }
    public void setRollNumber(int rollNumber){
        this.rollNumber= rollNumber;
    }
    public void setProgram(String program){
        this.program=program;
    }
    public void setBatch(int batch){
        this.batch =batch;
    }
    public String getName(){
        return name;
    }
    public int getRollNumber(){
        return rollNumber;
    }
    public String getProgram(){
        return program;
    }
    public int getBatch(){
        return batch;
    }
}

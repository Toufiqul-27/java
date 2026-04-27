public class Employee {
    private String name;
    private int id;
    private int salary;

    public Employee(){

    }

    public Employee( String name , int id){
        this.name = name;
        this.id =id;
    }
    public Employee(int id, int salary){
        this.id= id;
        this.salary=salary;
    }

    public Employee(int salary , String name){
        this.salary= salary;
        this.name=name;
    }
    public void setName(String name){
        this.name =name;
    }
    public void setId(int id){
        this.id = id;
    }
    public void setSalary( int salary){
        this.salary=salary;
    }
    public String getName(){
        return name;
    }
    public int getId() {
        return id;
    }
    public int getSalary(){
    return salary;
    }
}


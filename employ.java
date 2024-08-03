import java.util.*;

class q4Employee {
    public static void main(String args[]){
    try (Scanner sc = new Scanner(System.in)) {
    }
    }

}
class Employee{
    int emp_id ;
    String emp_name ;
    float basic_salary ;
    Employee(int id , String name , float sal)
    {
        emp_id = id ;
        emp_name = name ;
        basic_salary = sal;

    }
    void display()
    {
        float da = basic_salary*15/100;
        float hra = basic_salary*10/100;
        float total = (da+hra);
        System.out.println("Employee id "+ emp_id);
        System.out.println("Employe name "+ emp_name);
        System.out.println("emplye salary "+ total);

    }
}

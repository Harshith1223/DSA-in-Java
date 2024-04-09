public class constructor {
    String emp_name;
    int emp_id;
    int emp_salary;
    constructor(String a,int b,int c){
        emp_name=a;
        emp_id=b;
        emp_salary=c;
    }

    public static void main(String[] args) {
        constructor c=new constructor("Harsh",001,30000);
        System.out.println(c.emp_salary);
    }
}

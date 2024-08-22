package design_pattern.factory_design_pattern;

public class factory_1 {
    public static void main(String[] args) {
        Employee employee1 = EmployeeFactory.getEmployee("ANDRIOD DEVELOPER");
        int salary1 = employee1.getSalary();
        System.out.println(salary1);

        Employee employee2 = EmployeeFactory.getEmployee("WEB DEVELOPER");
        int salary2 = employee2.getSalary();
        System.out.println(salary2);
    }
}

/*
 when ther is superclass and multiple subclass and we want to get object of subclass based on input and requirement
 */


interface Employee{
    int getSalary();
}

class AndriodDeveloper implements Employee{
    public int getSalary(){
        System.out.println("getting andriod developer salary");
        return 50000;
    }
}

class WebDeveloper implements Employee{
    
    public int getSalary(){
        System.out.println("getting web developer salary");
        return 40000;
    }
}


class EmployeeFactory{
    public static Employee getEmployee(String empType){
        if(empType.trim().equalsIgnoreCase("ANDRIOD DEVELOPER")){
            return new AndriodDeveloper();
        }else if(empType.trim().equalsIgnoreCase("WEB DEVELOPER")){
            return new WebDeveloper();
        }else{
            return null;
        }
    }
}
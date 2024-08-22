package design_pattern.abstract_design_pattern;

//also clalled factory method design pattern

public class abstract_1 {
    public static void main(String[] args) {
        Employee e1 = EmployeeFactory.getEmployee(new AndriodDeveloperFactory());
        e1.name();

        Employee e2 = EmployeeFactory.getEmployee(new WebDeveloperFactory());
        e2.name();
    }
}

interface Employee{
    int salary();
    String name();
}


class AndriodDeveloper implements Employee{
    public int salary(){
        return 50000;
    }

    public String name(){
        System.out.println("I am andriod developer");
        return "Andriod";
    }
}

class WebDeveloper implements Employee{
    public int salary(){
        return 40000;
    }

    public String name(){
        System.out.println("I am Web developer");
        return "Web";
    }
}


class EmployeeFactory{
    public static Employee getEmployee(EmployeeAbstractFactory factory){
        return factory.createEmployee();
    }
}

abstract class EmployeeAbstractFactory{
    public abstract Employee createEmployee();
}

class AndriodDeveloperFactory extends EmployeeAbstractFactory{
    @Override
    public Employee createEmployee(){
        return new AndriodDeveloper();
    }
}

class WebDeveloperFactory extends EmployeeAbstractFactory{
    @Override
    public Employee createEmployee(){
        return new WebDeveloper();
    }
}
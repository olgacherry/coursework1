public class Main {
    private static final int EMPLOYEE_NUMBER = 10;

    public static void main(String[] args) {
        final Employee[] employees = new Employee[EMPLOYEE_NUMBER];
        employees[0] = new Employee("Николай Орлов", 54, 123000);
        employees[1] = new Employee("Никита Петров", 55, 144000);
        employees[2] = new Employee("Сергей Сидоров", 68, 91000);
        employees[3] = new Employee("Андрей Иванов", 32, 102000);
        employees[4] = new Employee("Антон Соколов", 45, 103000);
        employees[5] = new Employee("Алексей Голованов", 67, 93000);
        employees[6] = new Employee("Григорий Семенов", 12, 89000);
        employees[7] = new Employee("Олег Николаев", 78, 111000);
        employees[8] = new Employee("Александр Летов", 43, 113000);
        employees[9] = new Employee("Виталий Самойлов", 42, 100000);
        printEmployees(employees);
        printFullNamesEmployees(employees);

        System.out.println("Сумма затрат на зарплаты в месяц равна "+ getSalarySum(employees));
        System.out.println("Сотрудник с минимальной зарплатой - это "+getMinSalary(employees));
        System.out.println("Сотрудник с максимальной зарплатой - это "+getMaxSalary(employees));
        System.out.println("Средняя зарплата у сотрудников равна "+getAverageSalary(employees));

    }


    private static void printEmployees(Employee[] employees) {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
        }
    private static void printFullNamesEmployees(Employee[]employees){
        for (Employee employee:employees){
            System.out.println(employee.getFullName());

        }
    }
    private static int getSalarySum(Employee[]employees){
        int salarySum = 0;
        for(Employee employee:employees){
            salarySum +=employee.getSalary();
        }
        return salarySum;
    }
    private static Employee getMinSalary(Employee[]employees){
        Employee result = employees[0];
        for (Employee employee:employees){
            if(employee.getSalary()<result.getSalary()){
                result=employee;
            }
        }
        return result;
    }
    private static Employee getMaxSalary(Employee[]employees){
        Employee result  = employees[0];
        for(Employee employee:employees){
            if(employee.getSalary()>result.getSalary()){
                result=employee;
            }
        }
        return result;

    }
    private static double getAverageSalary(Employee[]employees){
        int salarySum = getSalarySum(employees);
      return (double)salarySum/employees.length;

    }


    }



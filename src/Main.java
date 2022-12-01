public class Main {
    public static Employee[] fuck = new Employee[10];

    public static void allEmployeeNames() {
        for (Employee employee : fuck) {
            if (employee == null)
                break;
            System.out.println(employee.getName());
        }
    }

    public static void middleSalary() {
        int middleSalaryResult = 0;
        int salaryCost = 0;

        for (Employee employee : fuck) {
            if (employee == null)
                break;
            salaryCost += employee.getSalary();
            middleSalaryResult = salaryCost / employee.getId();
        }
            System.out.println("Средняя зарплата сотрудников составляет: " + middleSalaryResult + " рублей.");
    }

    public static void maxSalaryEmployee() {
        int maxSalary = Integer.MIN_VALUE;
        String maxSalaryResult = null;
        for (Employee employee : fuck) {
            if (employee == null)
                break;
            else if (employee.getSalary() > maxSalary) {
                maxSalary = employee.getSalary();
                maxSalaryResult = "Сотрудник с максимальной зарплатой: " + employee.toString();
            }
        }
        System.out.println(maxSalaryResult);
    }

    public static void salaryTotalCost() {
        int salaryCost = 0;

        for (Employee employee : fuck) {
            if (employee == null)
                break;
            salaryCost += employee.getSalary();
        }
        System.out.println("Общие затраты на зарплаты составляют: " + salaryCost + " рублей.");
    }

    public static void minSalaryEmployee() {
        int minSalary = Integer.MAX_VALUE;
        String minSalaryResult = null;
        for (Employee employee : fuck) {
            if (employee == null)
                break;
         else if (employee.getSalary() < minSalary) {
                minSalary = employee.getSalary();
                minSalaryResult = "Сотрудник с минимальной зарплатой: " + employee.toString();
            }
        }
        System.out.println(minSalaryResult);
    }
    public static void allEmployeesInformation() {
        for (Employee employee : fuck) {
            if (employee == null)
                break;
            System.out.println(employee);
        }
    }
    public static void main(String[] args) {
        System.out.println("Course work 1 \n");

        fuck[0] = new Employee("Кащеева Екатерина", 4, 45000);
        fuck[1] = new Employee("Бурыкина Татьяна", 3, 39000);
        fuck[2] = new Employee("Друганцев Алексей", 1, 50000);

        allEmployeesInformation();
        System.out.println("");

        salaryTotalCost();
        System.out.println("");

        minSalaryEmployee();
        System.out.println("");

        maxSalaryEmployee();
        System.out.println("");

        middleSalary();
        System.out.println("");

        allEmployeeNames();
        System.out.println("");
    }
}
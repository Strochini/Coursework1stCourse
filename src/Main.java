public class Main {
    public static Employee[] fuck = new Employee[10];

    public static void salaryTest0Num(int num) {
        for (Employee employee : fuck) {
            if (employee == null)
                break;
            else if (num <= employee.getSalary()) {
                System.out.println(employee.getId() + " " + employee.getName() + " " + employee.getSalary());
            }
        }
    }

    public static void salaryTestNum(int num) {
        for (Employee employee : fuck) {
            if (employee == null)
                break;
            else if (num > employee.getSalary()) {
                System.out.println(employee.getId() + " " + employee.getName() + " " + employee.getSalary());
            }
        }
    }

    public static void depAllEmployeesInformation(int department) {
        for (Employee employee : fuck) {
            if (employee == null)
                break;
            else if (employee.getDepartment() == department) {
                System.out.println(employee.getId() + " " + employee.getName() + " " + employee.getSalary());
            }
        }
    }

    public static void departmentSalaryIndexation(int department) {
        for (Employee employee : fuck) {
            if (employee == null)
                break;
            else if (employee.getDepartment() == department) {
                employee.setSalary(employee.getSalary() + (employee.getSalary() / 100 * 8));
            }
        }
    }

    public static void departmentMidSalary(int department) {
        int midSalaryResult = 0;
        int midSalary = 0;
        int i = 0;
        int employeeCounter = 0;
        for (i = 0; i < fuck.length; i++) {
            if (fuck[i] == null)
                break;
            else if (fuck[i].getDepartment() == department) {
                midSalary += fuck[i].getSalary();
                employeeCounter = employeeCounter + 1;
            }
        }
        midSalaryResult = midSalary / employeeCounter;
        System.out.println("Средняя зарплата сотрудников отдела номер " + department + " составляет: " + midSalaryResult + " рублей.");
    }

    public static void departmentSalaryTotalCost(int department) {
        int departmentSalaryCost = 0;

        for (Employee employee : fuck) {
            if (employee == null)
                break;
            else if (employee.getDepartment() == department) {
                departmentSalaryCost += employee.getSalary();
            }
        }
        System.out.println("Общие затраты на зарплаты в отделе номер " + department + " составляют: " + departmentSalaryCost + " рублей.");
    }

    public static void departmentMaxSalary(int department) {
        int departmentMaxSalary = Integer.MIN_VALUE;
        String departmentMaxSalaryResult = null;
        for (Employee employee : fuck) {
            if (employee == null)
                break;
            else if (employee.getDepartment() == department && employee.getSalary() > departmentMaxSalary) {
                departmentMaxSalary = employee.getSalary();
                departmentMaxSalaryResult = "В отделе номер " + department + " сотрудник с максимальной зарплатой: " + employee;
            }
        }
        System.out.println(departmentMaxSalaryResult);
    }

    public static void departmentMinSalary(int department) {
        int departmentMinSalary = Integer.MAX_VALUE;
        String departmentMinSalaryResult = null;
        for (Employee employee : fuck) {
            if (employee == null)
                break;
            else if (employee.getDepartment() == department && employee.getSalary() < departmentMinSalary) {
                departmentMinSalary = employee.getSalary();
                departmentMinSalaryResult = "В отделе номер " + department + " сотрудник с минимальной зарплатой: " + employee;
            }
        }
        System.out.println(departmentMinSalaryResult);
    }

    public static void salaryIndexation() {
        for (Employee employee : fuck) {
            if (employee == null)
                break;
            employee.setSalary(employee.getSalary() + (employee.getSalary() / 100 * 7));
        }
    }

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
        int m = 0;

        for (m = 0; m < fuck.length; m++) {
            if (fuck[m] == null)
                break;
            salaryCost += fuck[m].getSalary();
        }
        middleSalaryResult = salaryCost / m;
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
                maxSalaryResult = "Сотрудник с максимальной зарплатой: " + employee;
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
                minSalaryResult = "Сотрудник с минимальной зарплатой: " + employee;
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

        fuck[0] = new Employee("Кащеева Екатерина", 4, 45_000);
        fuck[1] = new Employee("Бурыкина Татьяна", 3, 39_000);
        fuck[2] = new Employee("Друганцев Алексей", 1, 50_000);
        fuck[3] = new Employee("Иванийчук Виталий", 4, 90_000);
        fuck[4] = new Employee("Кащеев сергей", 3, 130_000);
        fuck[5] = new Employee("Иванов Иван", 1, 38_000);
        fuck[6] = new Employee("Ткаченко Илья", 4, 23_000);
        fuck[7] = new Employee("Малышева Яна", 3, 85_000);
        fuck[8] = new Employee("Кудрявцев Даниил", 1, 60_000);

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

        salaryIndexation();

        allEmployeesInformation();
        System.out.println("");

        departmentMinSalary(3);
        System.out.println("");

        departmentMaxSalary(4);
        System.out.println("");

        departmentSalaryTotalCost(1);
        System.out.println("");

        departmentMidSalary(4);
        System.out.println("");

        departmentSalaryIndexation(3);

        allEmployeesInformation();
        System.out.println("");

        depAllEmployeesInformation(3);
        System.out.println("");

        salaryTestNum(54_000);
        System.out.println("");

        salaryTest0Num(46700);
    }
}
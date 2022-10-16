public class Employee {

    private String name;
    private int salary;
    private int workHours;
    private int hireYear;
    //Sınıfımıza özel niteliklerimizi oluşturdum
    public Employee(String name,int salary,int workHours,int hireYear){
        this.name=name;
        this.salary=salary;
        this.workHours=workHours;
        this.hireYear=hireYear;
    }
    //Constructor oluşturdum

    //*****METHODS*****
    public double tax(){
        double tax=0;
        if(salary>1000){
            tax=(double)salary*3/100;
        }
        return tax;
    }
    public int bonus(){
        int bonus=0;
        if(workHours>40){
            bonus = (workHours-40)*3;
        }
        return bonus;
    }


    public double raiseSalary(){
        double raise_salary=0;
        int this_year=2021;
        if(this_year-hireYear<10){
            raise_salary=(double)salary*5/100;
        }
        else if (this_year-hireYear>9 && this_year-hireYear<20 ){
            raise_salary=(double)salary*10/100;
        }
        else if(this_year-hireYear>19){
            raise_salary=(double)salary*15/100;
        }
        return raise_salary;
    }

    public String toString(){
        double total_salary;
        double total_salary_bonusandtax;
        total_salary=salary+bonus();
        total_salary_bonusandtax=total_salary-tax();
        System.out.println("Name :" +name);
        System.out.println("Salary :"+salary);
        System.out.println("WorkHours :"+workHours);
        System.out.println("HireYears :"+hireYear);
        System.out.println("Tax :"+tax());
        System.out.println("Bonus :"+bonus());
        System.out.println("Raise Salary :"+raiseSalary());
        System.out.println("Total salary :"+total_salary );
        System.out.println("Salary with tax and bonus"+total_salary_bonusandtax);

        return null;
    }







    //*****GETTER AND SETTERS*****

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getWorkHours() {
        return workHours;
    }

    public void setWorkHours(int workHours) {
        this.workHours = workHours;
    }

    public int getHireYear() {
        return hireYear;
    }

    public void setHireYear(int hireYear) {
        this.hireYear = hireYear;
    }

}

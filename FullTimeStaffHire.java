public class FullTimeStaffHire extends StaffHire
{
    private double salary ;
    private int weeklyFractionalHours;

    public FullTimeStaffHire(double salary, int weeklyFractionalHours, int vacancyNumber, String designationType, String jobType, String staffName, String joiningDate, String qualification, String appointedBy, boolean joined)
    {
        super(vacancyNumber, designationType, jobType, staffName, joiningDate, qualification, appointedBy, joined);
        this.salary = salary;
        this.weeklyFractionalHours = weeklyFractionalHours;
    }
    
    public void setSalary(double salary)
    {
        if (getjoined())
        {
            this.salary = salary;
        }
        else
        {
            System.out.println("No staff appointed to set the salary");
        }
    }

    public double getSalary()
    {
        return salary;
    }

    public int getWeeklyFractionalHours()
    {
        return weeklyFractionalHours;
    }

    public void setWeeklyFractionalHours(int weeklyFractionalHours)
    {
        this.weeklyFractionalHours = weeklyFractionalHours;
    }

    public void display()
    {
        super.display();
        System.out.println("Salary: " + salary);
        System.out.println("Weekly Hours: " + weeklyFractionalHours);
    }
}



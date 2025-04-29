public class PartTimeStaffHire extends StaffHire
{
    private int workingHour;
    private double wagesPerHour;
    private String shifts;
    private boolean terminated;

    public PartTimeStaffHire(int vacancyNumber, String designationType, String jobType, String staffName, String joiningDate, String qualification, String appointedBy, boolean joined, int workingHour, double wagesPerHour, String shifts)
    {
        super(vacancyNumber, designationType, jobType, staffName, joiningDate, qualification, appointedBy, joined);
        this.workingHour = workingHour;
        this.wagesPerHour = wagesPerHour;
        this.shifts = shifts;
        terminated = false;
    }
    
    public void setWorkingShifts(String shifts)
    {
        if (getjoined())
        {
            this.shifts = shifts;
        }
        
        else
        {
            System.out.println("No staff has been assigned to give working shifts");
        }    
    }
    
    public int getWorkingHours()
    {
        return workingHour;
    }
    
    public double getWagesPerHour()
    {
        return wagesPerHour;
    }
    
    public String getShifts()
    {
        return shifts;
    }
    
    public boolean getTerminatedStatus()
    {
        return terminated;
    }
    
    public void staffTermination()
    {
        if (terminated)
        {
            System.out.println("The staff has already been terminated");
            setJoined(false);
        }
        else
        {
            setstaffName("");
            setjoiningDate("");
            setqualification("");
            setappointedBy("");
        }
    }
    
    public void display()
    {
        super.display();
        System.out.println("Wages Per Hour: " + wagesPerHour);
        System.out.println("Working Hour: " + workingHour);
        System.out.println("Shifts: " + shifts);
        System.out.println("Terminated Status: " + terminated);
        System.out.println(" ");
        System.out.println("Income per day: " + wagesPerHour * workingHour);
    }
}
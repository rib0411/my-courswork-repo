public class StaffHire
{
    private int vacancyNumber;
    private String designationType;
    private String jobType;
    private String staffName;
    private String joiningDate; 
    private String qualification; 
    private String appointedBy; 
    private boolean joined; 
    
     
    public StaffHire(int vacancyNumber, String designationType, String jobType, String staffName, String joiningDate, String qualifiication, String appointedBy, boolean joined)
    {
        this.vacancyNumber = vacancyNumber;
        this.designationType = designationType; 
        this.jobType = jobType; 
        this.staffName = staffName; 
        this.joiningDate = joiningDate; 
        this.qualification = qualification; 
        this.appointedBy = appointedBy;
        this.joined = joined;
        
    }
    
    public int getVacancyNumber()
    {
       return vacancyNumber;
    }
    
    public void setVacancyNumber(int vacancyNumber)
    {
        this.vacancyNumber = vacancyNumber;
    }
    
    public String getDesignationType()
    {
        return designationType;
    }
    
    public void setDesignationType(String designationType)
    {
        this.designationType = designationType;
    }
    
    public String getjobType()
    {
        return jobType;
    }
    
    public void setjobType(String jobType)
    {
        this.jobType = jobType;
    }
    
    public String getstaffName()
    {
        return staffName;
    }
    
    public void setstaffName(String staffName)
    {
        this.staffName = staffName;
    }
    
    public String getjoiningDate()
    {
        return joiningDate;
    }
    
    public void setjoiningDate(String joiningName)
    {
        this.joiningDate = joiningDate; 
    }
    
    public String getqualification()
    {
        return qualification;
    }
    
    public void setqualification(String qualification)
    {
        this.qualification = qualification;
    }
    
    public String getappointedBy()
    {
        return appointedBy;
    }
    
    public void setappointedBy(String appointedBy)
    {
        this.appointedBy = appointedBy;
    }
    
    public boolean getjoined() 
    {
        return joined;
    }
    
    public void setJoined(boolean joined)
    {
        this.joined = joined;
    }
    
    public void display() {
        System.out.println("Vacancy Number: " + vacancyNumber);
        System.out.println("Designation: " + designationType);
        System.out.println("Job Type: " + jobType);
        System.out.println("Staff Name: " + staffName);
        System.out.println("Joining Date: " + joiningDate);
        System.out.println("Qualification: " + qualification);
        System.out.println("Appointed By: " + appointedBy);
        System.out.println("joined: "+joined);
    }
}
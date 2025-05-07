import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class RecruitmentSystemGUI {
    private JFrame frame;
    private JTextField vacancyNumberField, designationField, jobTypeField, staffNameField, joiningDateField, qualificationField, appointedByField;
    private JTextField salaryField, weeklyHoursField, workingHoursField, wagesField, shiftsField;
    private JCheckBox joinedCheckBox;
    private JButton addStaffButton, terminateButton, displayButton, hireFullTimeButton, hirePartTimeButton;
    private JButton setSalaryButton, setShiftButton;  
    private JTextArea displayArea;

    private StaffHire staff;
    private FullTimeStaffHire fullTimeStaff;
    private PartTimeStaffHire partTimeStaff;

    public RecruitmentSystemGUI() {
        frame = new JFrame("Recruitment System");
        frame.setSize(600, 800);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(25, 2));  

        panel.add(new JLabel("Vacancy Number:"));
        vacancyNumberField = new JTextField();
        panel.add(vacancyNumberField);

        panel.add(new JLabel("Designation Type:"));
        designationField = new JTextField();
        panel.add(designationField);

        panel.add(new JLabel("Job Type:"));
        jobTypeField = new JTextField();
        panel.add(jobTypeField);

        panel.add(new JLabel("Staff Name:"));
        staffNameField = new JTextField();
        panel.add(staffNameField);

        panel.add(new JLabel("Joining Date:"));
        joiningDateField = new JTextField();
        panel.add(joiningDateField);

        panel.add(new JLabel("Qualification:"));
        qualificationField = new JTextField();
        panel.add(qualificationField);

        panel.add(new JLabel("Appointed By:"));
        appointedByField = new JTextField();
        panel.add(appointedByField);

        panel.add(new JLabel("Joined:"));
        joinedCheckBox = new JCheckBox();
        panel.add(joinedCheckBox);

        panel.add(new JLabel("Salary (Full-Time):"));
        salaryField = new JTextField();
        panel.add(salaryField);

        panel.add(new JLabel("Weekly Hours (Full-Time):"));
        weeklyHoursField = new JTextField();
        panel.add(weeklyHoursField);

        panel.add(new JLabel("Working Hours (Part-Time):"));
        workingHoursField = new JTextField();
        panel.add(workingHoursField);

        panel.add(new JLabel("Wages per Hour (Part-Time):"));
        wagesField = new JTextField();
        panel.add(wagesField);

        panel.add(new JLabel("Shifts (Part-Time):"));
        shiftsField = new JTextField();
        panel.add(shiftsField);

        
        addStaffButton = new JButton("Add Staff");
        panel.add(addStaffButton);

        hireFullTimeButton = new JButton("Hire Full-Time Staff");
        panel.add(hireFullTimeButton);

        hirePartTimeButton = new JButton("Hire Part-Time Staff");
        panel.add(hirePartTimeButton);

        terminateButton = new JButton("Terminate Staff");
        panel.add(terminateButton);

        displayButton = new JButton("Display Staff Info");
        panel.add(displayButton);

        
        setSalaryButton = new JButton("Set Salary (Full-Time)");
        panel.add(setSalaryButton);

        setShiftButton = new JButton("Set Shift (Part-Time)");
        panel.add(setShiftButton);

        displayArea = new JTextArea(900000000, 1);
        displayArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(displayArea);
        panel.add(new JLabel("Staff Info Display:"));
        panel.add(scrollPane);

        frame.add(panel);
        frame.setVisible(true);

        
        addStaffButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    int vacancyNumber = Integer.parseInt(vacancyNumberField.getText());
                    String designationType = designationField.getText();
                    String jobType = jobTypeField.getText();
                    String staffName = staffNameField.getText();
                    String joiningDate = joiningDateField.getText();
                    String qualification = qualificationField.getText();
                    String appointedBy = appointedByField.getText();
                    boolean joined = joinedCheckBox.isSelected();

                    staff = new StaffHire(vacancyNumber, designationType, jobType, staffName, joiningDate, qualification, appointedBy, joined);
                    displayArea.setText("Staff Added: " + staffName);
                } catch (NumberFormatException ex) {
                    displayArea.setText("Invalid input. Please enter correct numeric values.");
                }
            }
        });

        hireFullTimeButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (staff == null) {
                    displayArea.setText("Please add a staff first.");
                    return;
                }
                try {
                    int vacancyNumber = Integer.parseInt(vacancyNumberField.getText());
                    String designationType = designationField.getText();
                    String jobType = jobTypeField.getText();
                    String staffName = staffNameField.getText();
                    String joiningDate = joiningDateField.getText();
                    String qualification = qualificationField.getText();
                    String appointedBy = appointedByField.getText();
                    boolean joined = joinedCheckBox.isSelected();

                    double salary = Double.parseDouble(salaryField.getText());
                    int weeklyHours = Integer.parseInt(weeklyHoursField.getText());

                    fullTimeStaff = new FullTimeStaffHire(salary, weeklyHours, vacancyNumber, designationType, jobType, staffName, joiningDate, qualification, appointedBy, joined);
                    displayArea.setText("Full-Time Staff Hired: " + staffName);
                } catch (NumberFormatException ex) {
                    displayArea.setText("Invalid input for salary or weekly hours.");
                }
            }
        });

        hirePartTimeButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (staff == null) {
                    displayArea.setText("Please add a staff first.");
                    return;
                }
                try {
                    int vacancyNumber = Integer.parseInt(vacancyNumberField.getText());
                    String designationType = designationField.getText();
                    String jobType = jobTypeField.getText();
                    String staffName = staffNameField.getText();
                    String joiningDate = joiningDateField.getText();
                    String qualification = qualificationField.getText();
                    String appointedBy = appointedByField.getText();
                    boolean joined = joinedCheckBox.isSelected();

                    int workingHours = Integer.parseInt(workingHoursField.getText());
                    double wages = Double.parseDouble(wagesField.getText());
                    String shifts = shiftsField.getText();

                    partTimeStaff = new PartTimeStaffHire(vacancyNumber, designationType, jobType, staffName, joiningDate, qualification, appointedBy, joined, workingHours, wages, shifts);
                    displayArea.setText("Part-Time Staff Hired: " + staffName);
                } catch (NumberFormatException ex) {
                    displayArea.setText("Invalid input for wages or working hours.");
                }
            }
        });

        terminateButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (fullTimeStaff != null) {
                    fullTimeStaff = null;
                    displayArea.setText("Full-Time Staff Terminated.");
                } else if (partTimeStaff != null) {
                    partTimeStaff.staffTermination();
                    partTimeStaff = null;
                    displayArea.setText("Part-Time Staff Terminated.");
                } else {
                    displayArea.setText("No staff found to terminate.");
                }
            }
        });

        displayButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (fullTimeStaff != null) {
                    String info = "Vacancy Number: " + fullTimeStaff.getVacancyNumber() + "\n" +
                            "Designation: " + fullTimeStaff.getDesignationType() + "\n" +
                            "Job Type: " + fullTimeStaff.getjobType() + "\n" +
                            "Staff Name: " + fullTimeStaff.getstaffName() + "\n" +
                            "Joining Date: " + fullTimeStaff.getjoiningDate() + "\n" +
                            "Qualification: " + fullTimeStaff.getqualification() + "\n" +
                            "Appointed By: " + fullTimeStaff.getappointedBy() + "\n" +
                            "Joined: " + fullTimeStaff.getjoined() + "\n" +
                            "Salary: " + fullTimeStaff.getSalary() + "\n" +
                            "Weekly Fractional Hours: " + fullTimeStaff.getWeeklyFractionalHours();
                    displayArea.setText(info);

                } else if (partTimeStaff != null) {
                    String info = "Vacancy Number: " + partTimeStaff.getVacancyNumber() + "\n" +
                            "Designation: " + partTimeStaff.getDesignationType() + "\n" +
                            "Job Type: " + partTimeStaff.getjobType() + "\n" +
                            "Staff Name: " + partTimeStaff.getstaffName() + "\n" +
                            "Joining Date: " + partTimeStaff.getjoiningDate() + "\n" +
                            "Qualification: " + partTimeStaff.getqualification() + "\n" +
                            "Appointed By: " + partTimeStaff.getappointedBy() + "\n" +
                            "Joined: " + partTimeStaff.getjoined() + "\n" +
                            "Wages Per Hour: " + partTimeStaff.getWagesPerHour() + "\n" +
                            "Working Hours: " + partTimeStaff.getWorkingHours() + "\n" +
                            "Shifts: " + partTimeStaff.getShifts() + "\n" +
                            "Terminated Status: " + partTimeStaff.getTerminatedStatus() + "\n" +
                            "Income Per Day: " + (partTimeStaff.getWagesPerHour() * partTimeStaff.getWorkingHours());
                    displayArea.setText(info);

                } else {
                    displayArea.setText("No staff information available.");
                }
            }
        });

        

        setSalaryButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (fullTimeStaff == null) {
                    displayArea.setText("No Full-Time Staff to set salary.");
                    return;
                }
                try {
                    double newSalary = Double.parseDouble(salaryField.getText());
                    fullTimeStaff.setSalary(newSalary);
                    displayArea.setText("Salary updated to: " + newSalary);
                } catch (NumberFormatException ex) {
                    displayArea.setText("Invalid salary input.");
                }
            }
        });

        setShiftButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (partTimeStaff == null) {
                    displayArea.setText("No Part-Time Staff to set shift.");
                    return;
                }
                String newShift = shiftsField.getText();
                partTimeStaff.setWorkingShifts(newShift);
                displayArea.setText("Shift updated to: " + newShift);
            }
        });
    }

    public static void main(String[] args) {
        new RecruitmentSystemGUI();
    }
}

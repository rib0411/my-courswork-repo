import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JFrame;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;

public class RecruitmentSystem extends JFrame implements ActionListener {
    private ArrayList<StaffHire> staffList = new ArrayList<>();

    private JTextField vacancyField, designationField, jobTypeField, staffNameField, salaryField;
    // Ad

    private JButton addFullTimeBtn, displayBtn, terminateBtn, clearBtn;

    public RecruitmentSystem() {
        setTitle("Recruitment System");
        setLayout(new GridLayout(10, 2));

        
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == addFullTimeBtn) {
            // Validate input, create FullTimeStaffHire, add to ArrayList
        }
        // Handle other buttons...
    }

    public static void main(String[] args) {
        RecruitmentSystem gui = new RecruitmentSystem();
        gui.setSize(800, 600);
        gui.setVisible(true);
        gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
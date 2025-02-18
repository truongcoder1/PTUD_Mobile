import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class GUI_QLSV extends JFrame {
    private JTextField txtA, txtB, txtC, txtD, txtF;
    private JLabel lblClass , lblA, lblB, lblC, lblD, lblF;
    private JComboBox<String> cbxClass;
    private JButton btnOK;
    private JTable tb;
    private JScrollPane sp;
    private DefaultTableModel dtm;

    public GUI_QLSV() {
        InnitGUI();
    }
    public void InnitGUI() {
        setTitle("Quan Ly Sinh Vien");
        setSize(1000, 600);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);

        //lable
        lblClass = new JLabel("CLASS : ");
        lblClass.setBounds(20, 20, 50, 30);
        lblA = new JLabel("A : ");
        lblA.setBounds(20, 450, 50, 30);
        lblB = new JLabel("B : ");
        lblB.setBounds(120, 450, 50, 30);
        lblC = new JLabel("C : ");
        lblC.setBounds(220, 450, 50, 30);
        lblD = new JLabel("D : ");
        lblD.setBounds(320, 450, 50, 30);
        lblF = new JLabel("F : ");
        lblF.setBounds(420, 450, 50, 30);

        //textfield
        txtA = new JTextField();
        txtA.setBounds(50, 450, 50, 30);
        txtA.setEditable(false);
        txtB = new JTextField();
        txtB.setBounds(150, 450, 50, 30);
        txtB.setEditable(false);
        txtC = new JTextField();
        txtC.setBounds(250, 450, 50, 30);
        txtC.setEditable(false);
        txtD = new JTextField();
        txtD.setBounds(350, 450, 50, 30);
        txtD.setEditable(false);
        txtF = new JTextField();
        txtF.setBounds(450, 450, 50, 30);
        txtF.setEditable(false);


        //combobox
        cbxClass = new JComboBox<String>(new String[]{"CNTT", "HTTT", "KTPM", "TTNT"});
        cbxClass.setBounds(80, 20, 120, 30);
        cbxClass.setBackground(Color.LIGHT_GRAY);

        //button
        btnOK = new JButton("OK");
        btnOK.setBounds(220, 20, 60, 30);
        btnOK.setBackground(Color.CYAN);
        btnOK.addActionListener(new ActionListener() {
            //khi click vao button OK thi se lay danh sach sinh vien theo lop
            @Override
            public void actionPerformed(ActionEvent e) {
                int countA = 0, countB = 0, countC = 0, countD = 0, countF = 0;
                XLSV xl = new XLSV();
                Sinhvien sv = new Sinhvien();
                sv.setClass(cbxClass.getSelectedItem().toString());
                List<Sinhvien> listSV = xl.getSVbyClass(sv);
                dtm.setRowCount(0);
                for (Sinhvien sv1 : listSV) {
                    dtm.addRow(new Object[]{sv1.getFirstName(), sv1.getLastName(), sv1.getBirthDay(), sv1.getAddress(), sv1.getClas(), sv1.getOOP(), sv1.getPM(), sv1.getML(), sv1.getDB(), sv1.getMobile(),sv1.avgChar()});
                }
                for(Sinhvien sv2: listSV){
                    float avg = sv2.avg();
                    if (avg >= 8.5) countA++;
                    else if (avg >= 7.0) countB++;
                    else if (avg >= 5.5) countC++;
                    else if (avg >= 4.0) countD++;
                    else countF++;
                }
                txtA.setText(String.valueOf(countA));
                txtB.setText(String.valueOf(countB));
                txtC.setText(String.valueOf(countC));
                txtD.setText(String.valueOf(countD));
                txtF.setText(String.valueOf(countF));
            }
        });

        //table
        dtm = new DefaultTableModel();
        dtm.setColumnIdentifiers(new Object[]{"FirstName", "LastName", "BirthDay", "Address", "Class", "OOP", "PM", "ML", "DB", "Mobile","TBinh"});
        tb = new JTable(dtm);
        sp = new JScrollPane(tb);
        sp.setBounds(20, 70, 900, 350);

        add(lblClass);
        add(cbxClass);
        add(btnOK);
        add(sp);
        add(lblA);
        add(txtA);
        add(lblB);
        add(txtB);
        add(lblC);
        add(txtC);
        add(lblD);
        add(txtD);
        add(lblF);
        add(txtF);
        setVisible(true);
    }

}

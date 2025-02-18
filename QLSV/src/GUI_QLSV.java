import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class GUI_QLSV extends JFrame {
    private JLabel lblClass;
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
                XLSV xl = new XLSV();
                Sinhvien sv = new Sinhvien();
                sv.setClass(cbxClass.getSelectedItem().toString());
                List<Sinhvien> listSV = xl.getSVbyClass(sv);
                dtm.setRowCount(0);
                for (Sinhvien sv1 : listSV) {
                    dtm.addRow(new Object[]{sv1.getFirstName(), sv1.getLastName(), sv1.getBirthDay(), sv1.getAddress(), sv1.getClas(), sv1.getOOP(), sv1.getPM(), sv1.getML(), sv1.getDB(), sv1.getMobile()});
                }
            }
        });

        //table
        dtm = new DefaultTableModel();
        dtm.setColumnIdentifiers(new Object[]{"FirstName", "LastName", "BirthDay", "Address", "Class", "OOP", "PM", "ML", "DB", "Mobile"});
        tb = new JTable(dtm);
        sp = new JScrollPane(tb);
        sp.setBounds(20, 70, 900, 400);

        add(lblClass);
        add(cbxClass);
        add(btnOK);
        add(sp);
        setVisible(true);
    }

}

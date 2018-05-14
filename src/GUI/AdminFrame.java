package GUI;
import Code.*;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Date;

public class AdminFrame {
    private JPanel MainAdminFramePanel;
    private JPanel leftPanelMain;
    private JButton carBrandsButton;
    private JButton vehiclesButton;
    private JButton employeeButton;
    private JPanel CardMainCenterPanelHolder;
    private JPanel CarBrandsMainPanel;
    private JPanel CarBrandsMainHeader;
    private JButton addCarBrandsBtn;
    private JButton updateCarBrandsBtn;
    private JButton listAllCarBrandsBtn;
    private JPanel CardCarBrandsContainer;
    private JPanel PanelCarBrandsAdd;
    private JTextField CarBrandAddTxtFieldID;
    private JTextField CarBrandAddTxtFieldName;
    private JTextField CarBrandAddTxtFieldDesc;
    private JButton CarBrandAddSubmitBtn;
    private JPanel PanelCarBrandsUpdate;
    private JPanel PanelCarBrandDelete;
    private JPanel PanelCarBrandSearch;
    private JPanel PanelCarBrandList;
    private JPanel EmployeeMainPanel;
    private JPanel EmployeeMainHeader;
    private JButton deleteEmployeeBtn;
    private JButton addEmployeeBtn;
    private JButton updateEmployeeBtn;
    private JButton searchEmployeeBtn;
    private JButton listEmployeesBtn;
    private JPanel CardEmployeeContainer;
    private JPanel PanelEmployeeAdd;
    private JPanel PanelEmployeeUpdate;
    private JPanel PanelEmployeeList;
    private JPanel PanelEmployeeSearch;
    private JPanel PanelEmployeeDelete;
    private JPanel VehicleMainPanel;
    private JPanel vehicleMainHeader;
    private JButton deleteVehicleButton;
    private JButton addVehicleBtn;
    private JButton updateVehicleBtn;
    private JButton searchVehicleBtn;
    private JButton ListAllVehicleBtn;
    private JPanel CardVehiclesContainer;
    private JPanel PanelVehicleUpdate;
    private JPanel PanelVehicleDelete;
    private JPanel PanelVehicleAdd;
    private JPanel PanelVehicleSearch;
    private JPanel PanelVehicleList;
    private JButton CarBrandModifyRetreiveBtn;
    private JTable CarBrandListAll;
    private JButton refreshButton;
    private JButton VehicleAddSubmitBtn;
    private JTextField VehicleModifyOldCarNumber;
    private JButton VehicleModifyRetrieveBtn;
    private JTextField VehicleSearchCarNumber;
    private JButton VehicleSearchSubmitBtn;
    private JTable VehicleListAll;
    private JTextField EmployeeAddTxtFieldName;
    private JTextField EmployeeAddTxtFieldUsername;
    private JTextField EmployeeAddTxtFieldPhone;
    private JPasswordField EmployeeAddPwdField;
    private JComboBox EmployeeAddQualification;
    private JTextArea EmployeeAddAddress;
    private JRadioButton EmployeeAddGenderMale;
    private JRadioButton EmployeeAddGenderFemale;
    private JComboBox EmployeeAddBirthDateDay;
    private JComboBox EmployeeAddBirthDateMonth;
    private JComboBox EmployeeAddBirthDateYear;
    private JButton EmployeeAddSubmitAdd;
    private JTextField EmployeeModifyName;
    private JComboBox EmployeeModifyJoinDateDay;
    private JComboBox EmployeeModifyJoinDateMonth;
    private JComboBox EmployeeModifyJoinDateYear;
    private JRadioButton EmployeeModifyGenderMale;
    private JRadioButton EmployeeModifyGenderFemale;
    private JPasswordField EmployeeModifyPassword;
    private JComboBox EmployeeModifyQualification;
    private JTextField EmployeeModifyPhone;
    private JTextArea EmployeeModifyAddress;
    private JButton EmployeeModifyDeleteBtn;
    private JTextField EmployeeModifyOldUsername;
    private JButton EmployeeModifyRetrieveBtn;
    private JTable EmployeeListAll;
    private JTextField EmployeeSearchOldUsername;
    private JButton EmployeeSearchSubmitBtn;
    private JPanel Footer;
    private JTextField CarBrandModifyOldName;
    private JTextField CarBrandModifyNewName;
    private JLabel CarBrandModifyNewDes;
    private JButton CarBrandModifyUpdateBtn;
    private JButton CarBrandModifyDeleteBtn;
    private JTextField CarBrandModifyNewDesc;
    private JComboBox EmployeeAddJoinDateDay;
    private JComboBox EmployeeAddJoinDateMonth;
    private JComboBox EmployeeAddJoinDateYear;
    private JTextField EmployeeModifyUsername;
    private JComboBox EmployeeModifyBirthDateDay;
    private JComboBox EmployeeModifyBirthDateMonth;
    private JComboBox EmployeeModifyBirthDateYear;
    private JButton EmployeeModifyUpdateBtn;
    private JTextField VehicleAddCarModel;
    private JTextField VehicleAddCarNumber;
    private JComboBox VehicleAddMakeYear;
    private JTextField VehicleAddSitCapacity;
    private JTextField VehicleAddEngineCapacity;
    private JComboBox VehicleAddCarType;
    private JComboBox VehicleAddCarVariant;
    private JTextField VehicleAddRentValue;
    private JTextField VehicleModifyCarModel;
    private JComboBox VehicleModifyCompanyBrand;
    private JTextField VehicleModifyCarNumber;
    private JComboBox VehicleModifyMakeYear;
    private JComboBox VehicleModifyCarUsage;
    private JTextField VehicleModifySitCapacity;
    private JTextField VehicleModifyEngineCapacity;
    private JComboBox VehicleModifyCarType;
    private JComboBox VehicleModifyCarVariant;
    private JTextField VehicleModifyRentValue;
    private JButton VehicleModifyUpdateBtn;
    private JButton VehicleModifyDeleteBtn;
    private JTextField VehicleModifyIsRented;
    private JButton EmployeeListRetrieve;
    private JButton VehicleListSubmitBtn;
    private JComboBox VehicleListCompanyBrand;
    private JComboBox VehicleListCarUsage;
    private JRadioButton VehicleListStatusRented;
    private JRadioButton VehicleListStatusNotRented;
    private JComboBox VehicleAddCompanyBrand;
    private JComboBox VehicleAddCarUsage;
    private JButton logOutButton;
    private JButton driversButton;
    private JPanel DriverMainPanel;
    private JTextField DriverSearchDriver;
    private JTable ShowDriversList;
    private JLabel SearchDriver;
    private JButton searchDriversButton;
    private JComboBox CarVariant;
    DefaultTableModel DriverListingModel;
    DefaultTableModel CarBrandListingModel;
    DefaultTableModel EmployeeListingModel;
    DefaultTableModel VehicleListingModel;
    private ButtonGroup EmployeeAddGenderGp;

    private String CarBrandListingCols[] = {"Name", "Desc"};


    private Color NormalHeaderBtnBg = new Color(-16758415);
    private Color NormalHeaderBtnTxt = new Color(-328966);
    private Color VisitedHeaderBtnBg = new Color(-1118482);
    private Color VisitedHeaderBtnTxt = new Color(-16758415);

    private Color NormalPanelBtnBg = new Color(-11316397);
    private Color NormalPanelBtnTxt = new Color(-328966);
    private Color VisitedPanelBtnBg = new Color(137, 137, 137);
    private Color VisitedPanelBtnTxt = new Color(-328966);

    public AdminFrame() {

        $$$setupUI$$$();
        EmployeeMainPanel.setVisible(false);
        CarBrandsMainPanel.setVisible(false);
        VehicleMainPanel.setVisible(false);
        DriverMainPanel.setVisible(false);

        CardCarBrandsContainer.setVisible(false);
        CardEmployeeContainer.setVisible(false);
        CardVehiclesContainer.setVisible(false);

        carBrandsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                EmployeeMainPanel.setVisible(false);
                CarBrandsMainPanel.setVisible(true);
                VehicleMainPanel.setVisible(false);
                SwitchColorsTab("panel", carBrandsButton, employeeButton, vehiclesButton, driversButton);
                addCarBrandsBtn.doClick();
                DriverMainPanel.setVisible(false);
            }
        });

        employeeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                EmployeeMainPanel.setVisible(true);
                CarBrandsMainPanel.setVisible(false);
                VehicleMainPanel.setVisible(false);
                DriverMainPanel.setVisible(false);
                SwitchColorsTab("panel", employeeButton, carBrandsButton, vehiclesButton, driversButton);
                addEmployeeBtn.doClick();
            }
        });
        employeeButton.doClick();
        vehiclesButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                EmployeeMainPanel.setVisible(false);
                CarBrandsMainPanel.setVisible(false);
                VehicleMainPanel.setVisible(true);
                DriverMainPanel.setVisible(false);
                SwitchColorsTab("panel", vehiclesButton ,carBrandsButton, employeeButton, driversButton);
                addVehicleBtn.doClick();
            }
        });
        driversButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                EmployeeMainPanel.setVisible(false);
                VehicleMainPanel.setVisible(false);
                CarBrandsMainPanel.setVisible(false);
                DriverMainPanel.setVisible(true);
                SwitchColorsTab("panel", driversButton ,carBrandsButton, employeeButton, vehiclesButton);
            }
        });
        /**Top panel**/
        /**Car Brand**/
        addCarBrandsBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CardEmployeeContainer.setVisible(false);
                CardVehiclesContainer.setVisible(false);
                CardCarBrandsContainer.setVisible(true);
                PanelCarBrandsUpdate.setVisible(false);
                PanelCarBrandsAdd.setVisible(true);
                PanelCarBrandList.setVisible(false);
                SwitchColorsTab("header", addCarBrandsBtn, updateCarBrandsBtn, listAllCarBrandsBtn);
            }
        });
        updateCarBrandsBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CardEmployeeContainer.setVisible(false);
                CardVehiclesContainer.setVisible(false);
                CardCarBrandsContainer.setVisible(true);
                PanelCarBrandsUpdate.setVisible(true);
                PanelCarBrandsAdd.setVisible(false);
                PanelCarBrandList.setVisible(false  );
                SwitchColorsTab("header", updateCarBrandsBtn, addCarBrandsBtn, listAllCarBrandsBtn);

            }
        });
        listAllCarBrandsBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CardEmployeeContainer.setVisible(false);
                CardVehiclesContainer.setVisible(false);
                CardCarBrandsContainer.setVisible(true);
                PanelCarBrandsUpdate.setVisible(false);
                PanelCarBrandsAdd.setVisible(false);
                PanelCarBrandList.setVisible(true);
                SwitchColorsTab("header", listAllCarBrandsBtn, addCarBrandsBtn, updateCarBrandsBtn);
            }
        });
        /**Employee **/

        addEmployeeBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CardCarBrandsContainer.setVisible(false);
                CardVehiclesContainer.setVisible(false);
                CardEmployeeContainer.setVisible(true);
                PanelEmployeeUpdate.setVisible(false);
                PanelEmployeeAdd.setVisible(true);
                PanelEmployeeList.setVisible(false);
                PanelEmployeeSearch.setVisible(false);
                SwitchColorsTab("header", addEmployeeBtn, updateEmployeeBtn, listEmployeesBtn, searchEmployeeBtn);

            }
        });
        addEmployeeBtn.doClick();
        updateEmployeeBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CardCarBrandsContainer.setVisible(false);
                CardVehiclesContainer.setVisible(false);
                CardEmployeeContainer.setVisible(true);
                PanelEmployeeUpdate.setVisible(true);
                PanelEmployeeAdd.setVisible(false);
                PanelEmployeeList.setVisible(false);
                PanelEmployeeSearch.setVisible(false);
                SwitchColorsTab("header", updateEmployeeBtn,addEmployeeBtn , listEmployeesBtn, searchEmployeeBtn);
            }
        });
        listEmployeesBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CardCarBrandsContainer.setVisible(false);
                CardVehiclesContainer.setVisible(false);
                CardEmployeeContainer.setVisible(true);
                PanelEmployeeUpdate.setVisible(false);
                PanelEmployeeAdd.setVisible(false);
                PanelEmployeeList.setVisible(true);
                PanelEmployeeSearch.setVisible(false);
                SwitchColorsTab("header", listEmployeesBtn,addEmployeeBtn , updateEmployeeBtn, searchEmployeeBtn);
            }
        });
        searchEmployeeBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CardCarBrandsContainer.setVisible(false);
                CardVehiclesContainer.setVisible(false);
                CardEmployeeContainer.setVisible(true);
                PanelEmployeeUpdate.setVisible(false);
                PanelEmployeeAdd.setVisible(false);
                PanelEmployeeList.setVisible(false);
                PanelEmployeeSearch.setVisible(true);
                SwitchColorsTab("header", searchEmployeeBtn,addEmployeeBtn , updateEmployeeBtn, listEmployeesBtn);
            }
        });

        /*** Vehicle**/
        addVehicleBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CardCarBrandsContainer.setVisible(false);
                CardEmployeeContainer.setVisible(false);
                CardVehiclesContainer.setVisible(true);
                PanelVehicleUpdate.setVisible(false);
                PanelVehicleAdd.setVisible(true);
                PanelVehicleList.setVisible(false);
                PanelVehicleSearch.setVisible(false);
                SwitchColorsTab("header", addVehicleBtn, updateVehicleBtn, searchVehicleBtn, ListAllVehicleBtn);
            }
        });
        updateVehicleBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CardCarBrandsContainer.setVisible(false);
                CardEmployeeContainer.setVisible(false);
                CardVehiclesContainer.setVisible(true);
                PanelVehicleUpdate.setVisible(true);
                PanelVehicleAdd.setVisible(false);
                PanelVehicleList.setVisible(false);
                PanelVehicleSearch.setVisible(false);
                SwitchColorsTab("header", updateVehicleBtn, addVehicleBtn, searchVehicleBtn, ListAllVehicleBtn);
            }
        });
        searchVehicleBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CardCarBrandsContainer.setVisible(false);
                CardEmployeeContainer.setVisible(false);
                CardVehiclesContainer.setVisible(true);
                PanelVehicleUpdate.setVisible(false);
                PanelVehicleAdd.setVisible(false);
                PanelVehicleList.setVisible(false);
                PanelVehicleSearch.setVisible(true);
                SwitchColorsTab("header", searchVehicleBtn, addVehicleBtn, updateVehicleBtn, ListAllVehicleBtn);

            }
        });
        ListAllVehicleBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CardCarBrandsContainer.setVisible(false);
                CardEmployeeContainer.setVisible(false);
                CardVehiclesContainer.setVisible(true);
                PanelVehicleUpdate.setVisible(false);
                PanelVehicleAdd.setVisible(false);
                PanelVehicleList.setVisible(true);
                PanelVehicleSearch.setVisible(false);
                SwitchColorsTab("header", ListAllVehicleBtn, addVehicleBtn, updateVehicleBtn, searchVehicleBtn);

            }
        });

        /**Car Brand Btns**/
        CarBrandAddSubmitBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(!CarBrandAddTxtFieldDesc.getText().equals("")&& !CarBrandAddTxtFieldDesc.getText().equals("")) {
                    String CarBrandName = CarBrandAddTxtFieldName.getText();
                    String CarBrandDesc = CarBrandAddTxtFieldDesc.getText();
                    if (new CarBrand(CarBrandName, CarBrandDesc).AddCarBrand()) {
                        JOptionPane.showMessageDialog(null, String.format("CarBrand %s added successfully!", CarBrandName), "New Car Brand Added!", JOptionPane.INFORMATION_MESSAGE);
                        //update existing car brands
                        ArrayList<CarBrand> CarBrandsValues = new CarBrand().getCarBrands();
                        VehicleAddCompanyBrand.removeAllItems();
                        VehicleModifyCompanyBrand.removeAllItems();
                        VehicleListCompanyBrand.removeAllItems();
                        for (CarBrand x : CarBrandsValues) {
                            VehicleAddCompanyBrand.addItem(x.getName());
                            VehicleModifyCompanyBrand.addItem(x.getName());
                            VehicleListCompanyBrand.addItem(x.getName());
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Couldn\'t add Car Brand", "Error Adding New Car Brand", JOptionPane.ERROR_MESSAGE);
                    }
                }
                else{
                    JOptionPane.showMessageDialog(null, "Couldn\'t Add Vehicle", "Error Adding Vehicle", JOptionPane.ERROR_MESSAGE);

                }
            }
        });
        CarBrandModifyRetreiveBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (CarBrandModifyRetreiveBtn.getText().equalsIgnoreCase("retrieve")) {
                    String CarBrandOldName = CarBrandModifyOldName.getText().toString();
                    CarBrand c = new CarBrand().getCarBrand(CarBrandOldName);
                    if (c != null) {
                        CarBrandModifyNewName.setText(c.getName());
                        CarBrandModifyNewDesc.setText(c.getDesc());
                        CarBrandModifyOldName.setEditable(false);
                        CarBrandModifyOldName.setEnabled(false);
                        CarBrandModifyUpdateBtn.setEnabled(true);
                        CarBrandModifyDeleteBtn.setEnabled(true);
                        CarBrandModifyRetreiveBtn.setText("Reset");
                    } else {
                        JOptionPane.showMessageDialog(null, "Couldn\'t find Car Brand", "Error Finding Car Brand", JOptionPane.ERROR_MESSAGE);
                    }
                } else {
                    CarBrandModifyOldName.setText("");
                    CarBrandModifyOldName.setEnabled(true);
                    CarBrandModifyOldName.setEditable(true);
                    CarBrandModifyNewName.setText("");
                    CarBrandModifyNewDesc.setText("");
                    CarBrandModifyRetreiveBtn.setText("Retrieve");
                    CarBrandModifyDeleteBtn.setEnabled(false);
                    CarBrandModifyUpdateBtn.setEnabled(false);
                }
            }
        });


        CarBrandModifyDeleteBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(!CarBrandModifyOldName.getText().equals("")) {
                    String CarBrandOldName = CarBrandModifyOldName.getText();
                    if (new CarBrand().DeleteCarBrand(CarBrandOldName)) {
                        JOptionPane.showMessageDialog(null, String.format("CarBrand %s Deleted successfully!", CarBrandOldName), "Car Brand Deleted!", JOptionPane.INFORMATION_MESSAGE);
                        //update existing car brands;
                        ArrayList<CarBrand> CarBrandsValues = new CarBrand().getCarBrands();
                        VehicleAddCompanyBrand.removeAllItems();
                        VehicleModifyCompanyBrand.removeAllItems();
                        VehicleListCompanyBrand.removeAllItems();
                        for (CarBrand x : CarBrandsValues) {
                            VehicleAddCompanyBrand.addItem(x.getName());
                            VehicleModifyCompanyBrand.addItem(x.getName());
                            VehicleListCompanyBrand.addItem(x.getName());
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Couldn\'t Delete Car Brand", "Error Deleting Car Brand", JOptionPane.ERROR_MESSAGE);
                    }
                }
                else{
                    JOptionPane.showMessageDialog(null, "Plaese Fill All The Field", "Error Deleting Car Brand", JOptionPane.ERROR_MESSAGE);

                }
            }
        });

        refreshButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //E2fel w efta7
                ArrayList<CarBrand> CarBrandListingData = (ArrayList<CarBrand>) new CarBrand().getCarBrands();
                //CarBrandListingModel = new DefaultTableModel(CarBrandListingCols, 0);
                CarBrandListingModel.setRowCount(0);
                Object[] Data = new Object[2];
                for(int i=0;i<CarBrandListingData.size();i++){

                    Data[0] = CarBrandListingData.get(i).getName();
                    Data[1] = CarBrandListingData.get(i).getDesc();
                    CarBrandListingModel.addRow(Data);
                }
                CarBrandListAll = new JTable(CarBrandListingModel);
            }
        });
        /**Employee Panels**/
        EmployeeAddSubmitAdd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(!EmployeeAddTxtFieldName.getText().equals("")&& !EmployeeAddTxtFieldUsername.getText().equals("")&& !EmployeeAddPwdField.getText().equals("")
                        && !EmployeeAddTxtFieldPhone.getText().equals("") && !EmployeeAddAddress.getText().equals("")) {
                    String Name = EmployeeAddTxtFieldName.getText();
                    String UserName = EmployeeAddTxtFieldUsername.getText();
                    String Password = EmployeeAddPwdField.getText();
                    String Qualification = EmployeeAddQualification.getSelectedItem().toString();
                    String Phone = EmployeeAddTxtFieldPhone.getText();
                    String Address = EmployeeAddAddress.getText().toString();
                    char Gender = ((EmployeeAddGenderMale.isSelected() ? 'M' : EmployeeAddGenderFemale.isSelected() ? 'F' : null));

                    int JoinDateDay = Integer.parseInt((String) EmployeeAddJoinDateDay.getSelectedItem().toString());
                    int JoinDateMonth = Integer.parseInt((String) EmployeeAddJoinDateMonth.getSelectedItem().toString());
                    int JoinDateYear = Integer.parseInt((String) EmployeeAddJoinDateYear.getSelectedItem().toString());

                    int BirthDateDay = Integer.parseInt((String) EmployeeAddBirthDateDay.getSelectedItem().toString());
                    int BirthDateMonth = Integer.parseInt((String) EmployeeAddBirthDateMonth.getSelectedItem().toString());
                    int BirthDateYear = Integer.parseInt((String) EmployeeAddBirthDateYear.getSelectedItem().toString());

                    Date Birthdate = new Date(BirthDateYear + 1900, BirthDateMonth, BirthDateDay);
                    Date JoinDate = new Date(JoinDateYear + 1900, JoinDateMonth, JoinDateDay);

                    Admin a = new Admin();
                    System.out.println(Gender);
                    if (a.addNewEmployee(Name, UserName, Password, Gender, Qualification, Address, JoinDate, Phone, Birthdate)) {
                        JOptionPane.showMessageDialog(null, String.format("Employee %s added successfully!", Name), "New Employee Added!", JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        JOptionPane.showMessageDialog(null, "Couldn\'t add Employee", "Error Adding New Employee", JOptionPane.ERROR_MESSAGE);
                    }
                }
                else{
                    JOptionPane.showMessageDialog(null, "Please Fill The Field", "Error Adding New Employee", JOptionPane.ERROR_MESSAGE);

                }
            }
        });
        EmployeeModifyRetrieveBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (EmployeeModifyRetrieveBtn.getText().toLowerCase().equals("retreive")) {
                    String EmployeeOldUsername = EmployeeModifyOldUsername.getText();
                    Employee employee = new Employee().getEmployee(EmployeeOldUsername);
                    if (employee != null) {
                        EmployeeModifyUsername.setText(employee.getUsername());
                        EmployeeModifyName.setText(employee.getName());
                        EmployeeModifyPassword.setText(employee.getPassword());
                        EmployeeModifyQualification.getModel().setSelectedItem(employee.getQualification());
                        EmployeeModifyJoinDateDay.getModel().setSelectedItem("" + employee.getJoinDate().getDate());
                        System.out.println("" + employee.getJoinDate().getDate());
                        EmployeeModifyJoinDateMonth.getModel().setSelectedItem("" + employee.getJoinDate().getMonth());
                        System.out.println("" + employee.getJoinDate().getMonth());
                        EmployeeModifyJoinDateYear.getModel().setSelectedItem("" + employee.getJoinDate().getYear());
                        System.out.println("" + employee.getJoinDate().getYear());
                        EmployeeModifyPhone.setText(employee.getPhoneNo());
                        EmployeeModifyAddress.setText(employee.getAddress());
                        if (employee.getGender() == 'M') {
                            EmployeeModifyGenderMale.setSelected(true);
                        } else if (employee.getGender() == 'F') {
                            EmployeeModifyGenderFemale.setSelected(true);
                        }
                        EmployeeModifyBirthDateDay.getModel().setSelectedItem("" + employee.getBirthDate().getDate());
                        EmployeeModifyBirthDateMonth.getModel().setSelectedItem("" + employee.getBirthDate().getMonth());
                        EmployeeModifyBirthDateYear.getModel().setSelectedItem("" + employee.getBirthDate().getYear());


                        EmployeeModifyOldUsername.setEditable(false);
                        EmployeeModifyOldUsername.setEnabled(false);
                        EmployeeModifyUpdateBtn.setEnabled(true);
                        EmployeeModifyDeleteBtn.setEnabled(true);
                        EmployeeModifyRetrieveBtn.setText("Reset");
                    } else {
                        JOptionPane.showMessageDialog(null, "Couldn\'t find Employee", "Error Finding Emplyoee", JOptionPane.ERROR_MESSAGE);
                    }
                } else {
                    EmployeeModifyRetrieveBtn.setText("Retreive");
                    EmployeeModifyRetrieveBtn.setEnabled(true);
                    EmployeeModifyOldUsername.setEditable(true);
                    EmployeeModifyOldUsername.setEnabled(true);
                    EmployeeModifyName.setText("");
                    EmployeeModifyUsername.setText("");
                    EmployeeModifyPassword.setText("");
                    EmployeeModifyQualification.setSelectedIndex(0);
                    EmployeeModifyJoinDateDay.setSelectedIndex(0);
                    EmployeeModifyJoinDateMonth.setSelectedIndex(0);
                    EmployeeModifyJoinDateYear.setSelectedIndex(0);
                    EmployeeModifyPhone.setText("");
                    EmployeeModifyAddress.setText("");
                    EmployeeModifyGenderMale.setSelected(true);
                    EmployeeModifyGenderFemale.setSelected(false);
                    EmployeeModifyBirthDateDay.setSelectedIndex(0);
                    EmployeeModifyBirthDateMonth.setSelectedIndex(0);
                    EmployeeModifyJoinDateYear.setSelectedIndex(0);
                    EmployeeModifyOldUsername.setText("");
                    EmployeeModifyUpdateBtn.setEnabled(false);
                    EmployeeModifyDeleteBtn.setEnabled(false);
                }
            }
        });
        EmployeeModifyUpdateBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(!EmployeeModifyName.getText().equals("")&& !EmployeeModifyOldUsername.getText().equals("")&& !EmployeeModifyUsername.getText().equals("")
                        && !EmployeeModifyPassword.equals("")&& !EmployeeModifyAddress.getText().equals("") ) {

                    String Name = EmployeeModifyName.getText();
                    String OldUserName = EmployeeModifyOldUsername.getText();
                    String UserName = EmployeeModifyUsername.getText();
                    String Password = EmployeeModifyPassword.getText();
                    String Qualification = (String) EmployeeModifyQualification.getSelectedItem().toString();
                    int JoinDateDay = Integer.parseInt((String) EmployeeModifyJoinDateDay.getSelectedItem().toString());
                    int JoinDateMonth = Integer.parseInt((String) EmployeeModifyJoinDateMonth.getSelectedItem().toString());
                    int JoinDateYear = Integer.parseInt((String) EmployeeModifyJoinDateYear.getSelectedItem().toString());
                    String Phone = EmployeeModifyPhone.getText();
                    String Address = EmployeeModifyAddress.getText().toString();
                    char Gender = (EmployeeModifyGenderMale.isSelected() ? 'M' : EmployeeModifyGenderFemale.isSelected() ? 'F' : null);
                    int BirthDateDay = Integer.parseInt((String) EmployeeModifyBirthDateDay.getSelectedItem().toString());
                    int BirthDateMonth = Integer.parseInt((String) EmployeeModifyBirthDateMonth.getSelectedItem().toString());
                    int BirthDateYear = Integer.parseInt((String) EmployeeModifyBirthDateYear.getSelectedItem().toString());
                    Date Birthdate = new Date(BirthDateYear, BirthDateMonth, BirthDateDay);
                    Date JoinDate = new Date(JoinDateYear, JoinDateMonth, JoinDateDay);

                    Employee employee = new Employee(Name, UserName, Password, Gender, Qualification, Address, JoinDate, Phone, Birthdate);

                    Admin a = new Admin();

                    if (a.updateEmployee(OldUserName, employee)) {
                        JOptionPane.showMessageDialog(null, String.format("Employee %s Updated successfully!", Name), "Employee Updated!", JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        JOptionPane.showMessageDialog(null, "Couldn\'t update Employee", "Error Updating Employee", JOptionPane.ERROR_MESSAGE);
                    }
                }else{
                    JOptionPane.showMessageDialog(null, "Please Fill the Field", "Error Updating Employee", JOptionPane.ERROR_MESSAGE);

                }
            }
        });
        EmployeeModifyDeleteBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Admin a = new Admin();

                if (a.deleteEmployee(EmployeeModifyOldUsername.getText())) {
                    JOptionPane.showMessageDialog(null, String.format("Employee %s Deleted successfully!", EmployeeModifyOldUsername.getText()), "Employee Deleted!", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(null, "Couldn\'t delete Employee", "Error Deleting Employee", JOptionPane.ERROR_MESSAGE);
                }

            }
        });
        EmployeeSearchSubmitBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!EmployeeSearchOldUsername.getText().equals("")){
                    String Username = EmployeeSearchOldUsername.getText();
                    Admin a = new Admin();
                    if (a.getEmployee(Username) != null) {
                        EmployeeModifyOldUsername.setText(EmployeeSearchOldUsername.getText());
                        EmployeeModifyRetrieveBtn.setText("Retreive");
                        EmployeeModifyRetrieveBtn.doClick();
                        updateEmployeeBtn.doClick();
                    } else {
                        JOptionPane.showMessageDialog(null, "Couldn\'t find Employee", "Error Finding Emplyoee", JOptionPane.ERROR_MESSAGE);
                    }
                }
                else{
                    JOptionPane.showMessageDialog(null, "Please enter Employee ID", "Error Finding Emplyoee", JOptionPane.ERROR_MESSAGE);

                }

            }
        });
        VehicleAddSubmitBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(!VehicleAddCarModel.getText().equals("")&& !VehicleAddCarNumber.getText().equals("")&& !VehicleAddRentValue.getText().equals("")&&
                        !VehicleAddSitCapacity.getText().equals("") && !VehicleAddEngineCapacity.getText().equals("")) {
                    String CarModel = VehicleAddCarModel.getText();
                    String CompanyBrand = VehicleAddCompanyBrand.getSelectedItem().toString();
                    int CarNumber = Integer.parseInt(VehicleAddCarNumber.getText());
                    int MakeYear = Integer.parseInt("" + VehicleAddMakeYear.getSelectedItem().toString());
                    String CarUsage = VehicleAddCarUsage.getSelectedItem().toString();
                    int SittingCapacity = Integer.parseInt("" + VehicleAddSitCapacity.getText().toString());
                    int EngineCapacity = Integer.parseInt("" + VehicleAddEngineCapacity.getText().toString());
                    String CarType = VehicleAddCarType.getSelectedItem().toString();
                    String CarVariant = VehicleAddCarVariant.getSelectedItem().toString();
                    double RentValue = Double.parseDouble(VehicleAddRentValue.getText());
                    Admin a = new Admin();
                    if (a.addVehicle(CarNumber, CarModel, a.getCarBrand(CompanyBrand), MakeYear, CarUsage, SittingCapacity, EngineCapacity, CarType, CarVariant, RentValue, false)) {
                        //MakeYear, CarUsage, SittingCapacity, EngineCapacity, CarType, CarVariant, RentValue
                        System.out.println(a.getVehicle(CarNumber));
                        JOptionPane.showMessageDialog(null, String.format("Vehicle %s %s Added successfully!", CompanyBrand, CarModel), "Vehicle Added!", JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        JOptionPane.showMessageDialog(null, "Couldn\'t Add Vehicle", "Error Adding Vehicle", JOptionPane.ERROR_MESSAGE);
                    }
                }
                else{
                    JOptionPane.showMessageDialog(null, "Please Fill the Field", "Error Adding Vehicle", JOptionPane.ERROR_MESSAGE);

                }
            }
        });
        VehicleModifyRetrieveBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(VehicleModifyRetrieveBtn.getText().equalsIgnoreCase("Retrieve")) {
                    int OldCarNumber = Integer.parseInt(VehicleModifyOldCarNumber.getText().toString());
                    Admin a = new Admin();
                    Vehicle v = a.getVehicle(OldCarNumber);
                    if (v != null) {
                        VehicleModifyCarModel.setText(v.getCarModel());
                        VehicleModifyCompanyBrand.getModel().setSelectedItem(v.getCarBrand().getName());
                        VehicleModifyCarNumber.setText(""+v.getCarID());
                        VehicleModifyMakeYear.getModel().setSelectedItem(""+v.getMakeYear());
                        VehicleModifyCarUsage.getModel().setSelectedItem(""+v.getCarUsage());
                        VehicleModifySitCapacity.setText(""+v.getSitCapacity());
                        VehicleModifyEngineCapacity.setText(""+v.getEngineCapacity());
                        VehicleModifyCarType.getModel().setSelectedItem(v.getCarType());
                        VehicleModifyCarVariant.getModel().setSelectedItem(v.getCarVariant());
                        VehicleModifyRentValue.setText(""+v.getRentValue());
                        VehicleModifyIsRented.setText(""+v.getIsRented());
                        System.out.println(v);
                        //
                        VehicleModifyOldCarNumber.setEditable(false);
                        VehicleModifyOldCarNumber.setEnabled(false);
                        VehicleModifyUpdateBtn.setEnabled(true);
                        VehicleModifyDeleteBtn.setEnabled(true);
                        VehicleModifyRetrieveBtn.setText("Reset");
                    } else {
                        JOptionPane.showMessageDialog(null, "Couldn\'t find Vehicle", "Error Finding Vehicle", JOptionPane.ERROR_MESSAGE);
                    }
                }else{
                    VehicleModifyRetrieveBtn.setText("Retrieve");
                    VehicleModifyRetrieveBtn.setEnabled(true);
                    VehicleModifyOldCarNumber.setEditable(true);
                    VehicleModifyOldCarNumber.setEnabled(true);
                    VehicleModifyCarModel.setText("");
                    VehicleModifyCompanyBrand.setSelectedIndex(0);
                    VehicleModifyCarNumber.setText("");
                    VehicleModifyMakeYear.setSelectedIndex(0);
                    VehicleModifyCarUsage.setSelectedIndex(0);
                    VehicleModifySitCapacity.setText("");
                    VehicleModifyEngineCapacity.setText("");
                    VehicleModifyCarType.setSelectedIndex(0);
                    VehicleModifyCarVariant.setSelectedIndex(0);
                    VehicleModifyRentValue.setText("");
                    VehicleModifyOldCarNumber.setText("");
                    VehicleModifyUpdateBtn.setEnabled(false);
                    VehicleModifyDeleteBtn.setEnabled(false);
                }
            }
        });
        VehicleModifyUpdateBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(!VehicleModifyCarModel.getText().equals("")&& !VehicleModifyCarNumber.getText().equals("")&&
                        !VehicleModifySitCapacity.getText().equals("") && ! VehicleModifyCompanyBrand.getSelectedItem().equals("")) {
                    int OldCarNumber = Integer.parseInt(VehicleModifyOldCarNumber.getText());
                    String CarModel = VehicleModifyCarModel.getText();
                    String CarBrand = VehicleModifyCompanyBrand.getSelectedItem().toString();
                    int CarNumber = Integer.parseInt(VehicleModifyCarNumber.getText());
                    boolean isRented = Boolean.parseBoolean(VehicleModifyIsRented.getText());
                    int MakeYear = Integer.parseInt(VehicleModifyMakeYear.getSelectedItem().toString());
                    String CarUsage = VehicleModifyCarUsage.getSelectedItem().toString();
                    int SitCapacity = Integer.parseInt(VehicleModifySitCapacity.getText());
                    int EngineCapacity = Integer.parseInt(VehicleModifyEngineCapacity.getText());
                    String CarType = VehicleModifyCarType.getSelectedItem().toString();
                    String CarVariant = VehicleModifyCarVariant.getSelectedItem().toString();
                    double RentValue = Double.parseDouble(VehicleModifyRentValue.getText());
                    Admin a = new Admin();
                    CarBrand carBrand = a.getCarBrand(CarBrand);
                    Vehicle v = new Vehicle(CarNumber, CarModel, carBrand, MakeYear, CarUsage, SitCapacity, EngineCapacity, CarType, CarVariant, RentValue, isRented);
                    if (a.updateVehicle(OldCarNumber, v)) {
                        JOptionPane.showMessageDialog(null, String.format("Vehicle %s %s Updated successfully!", CarBrand, CarModel), "Vehicle Updated!", JOptionPane.INFORMATION_MESSAGE);
                    } else {
                        JOptionPane.showMessageDialog(null, "Couldn\'t Update Vehicle", "Error Updating Vehicle", JOptionPane.ERROR_MESSAGE);
                    }
                }
                else{
                    JOptionPane.showMessageDialog(null, "Please Fill all Field", "Error Updating Vehicle", JOptionPane.ERROR_MESSAGE);
                }

            }
        });


        VehicleModifyDeleteBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int OldCarNumber = Integer.parseInt(VehicleModifyOldCarNumber.getText());
                String CarModel=VehicleModifyCarModel.getText();
                String CarBrand=VehicleModifyCompanyBrand.getSelectedItem().toString();

                Admin a = new Admin();
                if(a.deleteVehicle(OldCarNumber)){
                    JOptionPane.showMessageDialog(null, String.format("Vehicle %s %s Deleted successfully!", CarBrand, CarModel), "Vehicle Deleted!", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(null, "Couldn\'t Delete Vehicle", "Error Deleting Vehicle", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        VehicleSearchSubmitBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(!VehicleSearchCarNumber.getText().equals("")) {
                    int CarNumber = Integer.parseInt(VehicleSearchCarNumber.getText());
                    Admin a = new Admin();
                    if (a.getVehicle(CarNumber) != null) {
                        VehicleModifyOldCarNumber.setText("" + CarNumber);
                        VehicleModifyRetrieveBtn.setText("Retreive");
                        VehicleModifyRetrieveBtn.doClick();
                        updateVehicleBtn.doClick();
                    } else {
                        JOptionPane.showMessageDialog(null, "Couldn\'t find Vehicle", "Error Finding Vehicle", JOptionPane.ERROR_MESSAGE);
                    }
                }else{
                    JOptionPane.showMessageDialog(null, "Please enter the ID", "Error Finding Vehicle", JOptionPane.ERROR_MESSAGE);

                }
            }
        });
        EmployeeListRetrieve.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ArrayList<Employee> EmployeeListingData = (ArrayList<Employee>) new Employee().getEmployees();
                Object[] Data = new Object[7];
                EmployeeListingModel.setRowCount(0);
                for(int i=0;i<EmployeeListingData.size();i++){

                    Data[0] = EmployeeListingData.get(i).getName();
                    Data[1] = EmployeeListingData.get(i).getUsername();
                    Data[2] = EmployeeListingData.get(i).getGender();
                    Data[3] = EmployeeListingData.get(i).getQualification();
                    Data[4] = EmployeeListingData.get(i).getAddress();
                    Date JoinDate = EmployeeListingData.get(i).getJoinDate();
                    Data[5] = ""+JoinDate.getDate()+"/"+JoinDate.getMonth()+"/"+JoinDate.getYear();
                    Date BirthDate = EmployeeListingData.get(i).getBirthDate();
                    Data[6] = ""+BirthDate.getDate()+"/"+BirthDate.getMonth()+"/"+BirthDate.getYear();
                    EmployeeListingModel.addRow(Data);
                }
                EmployeeListAll = new JTable(EmployeeListingModel);
            }
        });
        VehicleListSubmitBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String CarBrand = VehicleListCompanyBrand.getSelectedItem().toString();
                String CarUsage = VehicleListCarUsage.getSelectedItem().toString();
                boolean isRented = (VehicleListStatusRented.isSelected() ? true : false);
                ArrayList<Vehicle> VehicleListingData = (ArrayList<Vehicle>) new Vehicle().getSelectedVehicles(new CarBrand().getCarBrand(CarBrand), CarUsage, isRented);
                //VehicleListingModel = new DefaultTableModel(VehicleListingCols,0);
                VehicleListingModel.setRowCount(0);
                Object[] Data = new Object[11];
                System.out.println(VehicleListingData);
                for(int i=0;i<VehicleListingData.size();i++){
                    Data[0] = VehicleListingData.get(i).getCarID();
                    Data[1] = VehicleListingData.get(i).getCarModel();
                    Data[2] = VehicleListingData.get(i).getCarBrand().getName();
                    Data[3] = VehicleListingData.get(i).getMakeYear();
                    Data[4] = VehicleListingData.get(i).getCarUsage();
                    Data[5] = VehicleListingData.get(i).getSitCapacity();
                    Data[6] = VehicleListingData.get(i).getEngineCapacity();
                    Data[7] = VehicleListingData.get(i).getCarType();
                    Data[8] = VehicleListingData.get(i).getCarVariant();
                    Data[9] = VehicleListingData.get(i).getRentValue();
                    Data[10] = (VehicleListingData.get(i).getIsRented() ? "Yes" : "No");

                    VehicleListingModel.addRow(Data);
                }
                VehicleListAll = new JTable(VehicleListingModel);
            }
        });
        logOutButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Frame[] frames = Frame.getFrames();
                for(Frame x : frames)
                    x.dispose();
                new LoginFrame();
            }
        });
        searchDriversButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ArrayList<Driver> DriverListingData = (ArrayList<Driver>) new Admin().viewDrivers();
                DriverListingModel.setRowCount(0);
                Object[] Data = new Object[9];
                for(int i=0;i<DriverListingData.size();i++){
                    Data[0] = DriverListingData.get(i).getID();
                    Data[1] = DriverListingData.get(i).getName();
                    Data[2] = DriverListingData.get(i).getGender();
                    Data[3] = DriverListingData.get(i).getAddress();
                    Data[4] = DriverListingData.get(i).getPhoneNo();
                    Data[5] = DriverListingData.get(i).getExperience();
                    Data[6] = DriverListingData.get(i).getBirthDate().getDate() + "/" +DriverListingData.get(i).getBirthDate().getMonth() + "/" +DriverListingData.get(i).getBirthDate().getYear();
                    Data[7] = DriverListingData.get(i).getCompanyBrand().getName();
                    Data[8] = DriverListingData.get(i).getSitCapacity();
                    DriverListingModel.addRow(Data);
                }
            }
        });
    }

    private void SwitchColorsTab(String BtnType, JButton clicked, JButton ... normal){
        Color VisitedBg, VisitedTxt, NormalBg, NormalTxt;
        if(BtnType.equals("header")) {
            VisitedBg = VisitedHeaderBtnBg;
            VisitedTxt = VisitedHeaderBtnTxt;
            NormalBg = NormalHeaderBtnBg;
            NormalTxt = NormalHeaderBtnTxt;
        }else{
            VisitedBg = VisitedPanelBtnBg;
            VisitedTxt = VisitedPanelBtnTxt;
            NormalBg = NormalPanelBtnBg;
            NormalTxt = NormalPanelBtnTxt;
        }
        clicked.setBackground(VisitedBg);
        clicked.setForeground(VisitedTxt);
        for(JButton btn : normal){
            btn.setBackground(NormalBg);
            btn.setForeground(NormalTxt);
        }
    }
    private void createUIComponents() {
        // TODO: place custom component creation code here
        Object[][] CarBrandData = {{"Mostafa", "M", "Y1000"}, {"Youssef", "M", "$23123"}};
        String[] CarBrandColumns = {"Name", "Gender", "123"};
        //CarBrandListAll = new JTable(CarBrandData, CarBrandColumns);
        /**Car Brand Listing**/

        ArrayList<CarBrand> CarBrandListingData = (ArrayList<CarBrand>) new CarBrand().getCarBrands();
        CarBrandListingModel = new DefaultTableModel(CarBrandListingCols,0);

        Object[] Data = new Object[2];
        for(int i=0;i<CarBrandListingData.size();i++){

            Data[0] = CarBrandListingData.get(i).getName();
            Data[1] = CarBrandListingData.get(i).getDesc();
            CarBrandListingModel.addRow(Data);
        }
        CarBrandListAll = new JTable(CarBrandListingModel);

        /** End Car Brand Listing**/
        /*Vehicle**/
        String VehicleListingCols[] = {"ID", "Model", "Brand", "Make Year", "Usage", "Sitting Capacity", "Engine Capacity", "Type", "Variant", "Rent Value", "Rented"};
        VehicleListingModel = new DefaultTableModel(VehicleListingCols,0);
        VehicleListAll = new JTable(VehicleListingModel);
        /**End-Vehicle**/
        /**EmployeeList*/
        String EmployeeListingCols[] = {"Name", "Username", "Gender", "Qualification", "Address", "Join Date", "Birth Date"};
        ArrayList<Employee> EmployeeListingData = (ArrayList<Employee>) new Employee().getEmployees();
        EmployeeListingModel = new DefaultTableModel(EmployeeListingCols,0);
        Data = new Object[7];
        for(int i=0;i<EmployeeListingData.size();i++){

            Data[0] = EmployeeListingData.get(i).getName();
            Data[1] = EmployeeListingData.get(i).getUsername();
            Data[2] = EmployeeListingData.get(i).getGender();
            Data[3] = EmployeeListingData.get(i).getQualification();
            Data[4] = EmployeeListingData.get(i).getAddress();
            Date JoinDate = EmployeeListingData.get(i).getJoinDate();
            Data[5] = ""+JoinDate.getDate()+"/"+JoinDate.getMonth()+"/"+JoinDate.getYear();
            Date BirthDate = EmployeeListingData.get(i).getBirthDate();
            Data[6] = ""+BirthDate.getDate()+"/"+BirthDate.getMonth()+"/"+BirthDate.getYear();
            EmployeeListingModel.addRow(Data);
        }
        EmployeeListAll = new JTable(EmployeeListingModel);
        /**End**/
        /**Driverlist**/
        String DriverListingCols[] = {"ID", "Name", "Gender", "Address", "Phone", "Experience", "BirthDate", "Company Brand", "Sit Capacity", "Rent Value"};
        ArrayList<Driver> DriverListingData = (ArrayList<Driver>) new Admin().viewDrivers();
        DriverListingModel = new DefaultTableModel(DriverListingCols,0);
        ShowDriversList = new JTable(DriverListingModel);
        /**End**/
        /**ComboBoxes initializations*/
        ArrayList<CarBrand> CarBrandsValues = new CarBrand().getCarBrands();
        VehicleAddCompanyBrand = new JComboBox();
        VehicleModifyCompanyBrand = new JComboBox();
        VehicleListCompanyBrand = new JComboBox();
        for(CarBrand x: CarBrandsValues){
            VehicleAddCompanyBrand.addItem(x.getName());
            VehicleModifyCompanyBrand.addItem(x.getName());
            VehicleListCompanyBrand.addItem(x.getName());
        }
        VehicleAddCarUsage = new JComboBox();
        VehicleModifyCarUsage = new JComboBox();
        VehicleListCarUsage = new JComboBox();
        ArrayList<String> CarUsages = CustomObject.CarUsage;
        for(String x: CarUsages){
            VehicleAddCarUsage.addItem(x);
            VehicleModifyCarUsage.addItem(x);
            VehicleListCarUsage.addItem(x);
        }
        VehicleAddCarType = new JComboBox();
        VehicleModifyCarType = new JComboBox();
        ArrayList<String> CarTypes = CustomObject.VehicleType;
        for(String x: CarTypes){
            VehicleAddCarType.addItem(x);
            VehicleModifyCarType.addItem(x);
        }
        VehicleAddCarVariant = new JComboBox();
        VehicleModifyCarVariant = new JComboBox();
        ArrayList<String> CarVariants = CustomObject.CarVariant;
        for(String x: CarVariants){
            VehicleAddCarVariant.addItem(x);
            VehicleModifyCarVariant.addItem(x);
        }
        EmployeeAddQualification = new JComboBox();
        EmployeeModifyQualification = new JComboBox();
        ArrayList<String> Qualifications = CustomObject.Qualifications;
        for(String x: Qualifications){
            EmployeeAddQualification.addItem(x);
            EmployeeModifyQualification.addItem(x);
        }


    }

    /**
     * Method generated by IntelliJ IDEA GUI Designer
     * >>> IMPORTANT!! <<<
     * DO NOT edit this method OR call it in your code!
     *
     * @noinspection ALL
     */
    private void $$$setupUI$$$() {
        createUIComponents();
        MainAdminFramePanel = new JPanel();
        MainAdminFramePanel.setLayout(new BorderLayout(0, 0));
        leftPanelMain = new JPanel();
        leftPanelMain.setLayout(new GridBagLayout());
        leftPanelMain.setBackground(new Color(-3355444));
        MainAdminFramePanel.add(leftPanelMain, BorderLayout.WEST);
        carBrandsButton = new JButton();
        carBrandsButton.setBackground(new Color(-11316397));
        carBrandsButton.setBorderPainted(false);
        carBrandsButton.setContentAreaFilled(true);
        carBrandsButton.setFocusPainted(false);
        carBrandsButton.setFocusable(false);
        carBrandsButton.setForeground(new Color(-328966));
        carBrandsButton.setIcon(new ImageIcon(getClass().getResource("/car1.png")));
        carBrandsButton.setText("Car Brands");
        GridBagConstraints gbc;
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.anchor = GridBagConstraints.NORTH;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.ipadx = 30;
        gbc.ipady = 40;
        gbc.insets = new Insets(0, 0, 5, 0);
        leftPanelMain.add(carBrandsButton, gbc);
        vehiclesButton = new JButton();
        vehiclesButton.setBackground(new Color(-11316397));
        vehiclesButton.setBorderPainted(false);
        vehiclesButton.setContentAreaFilled(true);
        vehiclesButton.setFocusPainted(false);
        vehiclesButton.setFocusable(false);
        vehiclesButton.setForeground(new Color(-328966));
        vehiclesButton.setIcon(new ImageIcon(getClass().getResource("/car(3).png")));
        vehiclesButton.setText("Vehicles");
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.anchor = GridBagConstraints.NORTH;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.ipadx = 30;
        gbc.ipady = 40;
        gbc.insets = new Insets(0, 0, 5, 0);
        leftPanelMain.add(vehiclesButton, gbc);
        employeeButton = new JButton();
        employeeButton.setBackground(new Color(-11316397));
        employeeButton.setBorderPainted(false);
        employeeButton.setContentAreaFilled(true);
        employeeButton.setFocusPainted(false);
        employeeButton.setFocusable(false);
        employeeButton.setForeground(new Color(-328966));
        employeeButton.setHideActionText(true);
        employeeButton.setIcon(new ImageIcon(getClass().getResource("/employee1.png")));
        employeeButton.setText("Employee");
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.NORTH;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.ipadx = 30;
        gbc.ipady = 40;
        gbc.insets = new Insets(0, 0, 5, 0);
        leftPanelMain.add(employeeButton, gbc);
        logOutButton = new JButton();
        logOutButton.setBackground(new Color(-3140555));
        logOutButton.setBorderPainted(false);
        logOutButton.setContentAreaFilled(true);
        logOutButton.setFocusPainted(false);
        logOutButton.setFocusable(false);
        logOutButton.setForeground(new Color(-328966));
        logOutButton.setIcon(new ImageIcon(getClass().getResource("/thick-cross-mark(1).png")));
        logOutButton.setPreferredSize(new Dimension(86, 5));
        logOutButton.setText("Log Out");
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 4;
        gbc.weighty = 3.0;
        gbc.anchor = GridBagConstraints.SOUTH;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.ipadx = 30;
        gbc.ipady = 40;
        leftPanelMain.add(logOutButton, gbc);
        driversButton = new JButton();
        driversButton.setBackground(new Color(-11316397));
        driversButton.setBorderPainted(false);
        driversButton.setContentAreaFilled(true);
        driversButton.setFocusPainted(false);
        driversButton.setFocusable(false);
        driversButton.setForeground(new Color(-328966));
        driversButton.setIcon(new ImageIcon(getClass().getResource("/car(3).png")));
        driversButton.setText("Drivers");
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.weighty = 3.0;
        gbc.anchor = GridBagConstraints.NORTH;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.ipadx = 30;
        gbc.ipady = 40;
        gbc.insets = new Insets(0, 0, 5, 0);
        leftPanelMain.add(driversButton, gbc);
        CardMainCenterPanelHolder = new JPanel();
        CardMainCenterPanelHolder.setLayout(new CardLayout(0, 0));
        CardMainCenterPanelHolder.setBackground(new Color(-1513335));
        CardMainCenterPanelHolder.setEnabled(true);
        MainAdminFramePanel.add(CardMainCenterPanelHolder, BorderLayout.CENTER);
        CarBrandsMainPanel = new JPanel();
        CarBrandsMainPanel.setLayout(new BorderLayout(0, 0));
        CarBrandsMainPanel.setBackground(new Color(-1118482));
        CardMainCenterPanelHolder.add(CarBrandsMainPanel, "Card1");
        CarBrandsMainHeader = new JPanel();
        CarBrandsMainHeader.setLayout(new GridBagLayout());
        CarBrandsMainHeader.setBackground(new Color(-11551010));
        CarBrandsMainPanel.add(CarBrandsMainHeader, BorderLayout.NORTH);
        addCarBrandsBtn = new JButton();
        addCarBrandsBtn.setBackground(new Color(-16758415));
        addCarBrandsBtn.setBorderPainted(false);
        addCarBrandsBtn.setFocusPainted(false);
        addCarBrandsBtn.setFocusable(false);
        addCarBrandsBtn.setForeground(new Color(-328966));
        addCarBrandsBtn.setPreferredSize(new Dimension(120, 65));
        addCarBrandsBtn.setText("Add Car Brand");
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.weightx = 0.5;
        gbc.anchor = GridBagConstraints.EAST;
        gbc.insets = new Insets(0, 2, 0, 0);
        CarBrandsMainHeader.add(addCarBrandsBtn, gbc);
        updateCarBrandsBtn = new JButton();
        updateCarBrandsBtn.setBackground(new Color(-16758415));
        updateCarBrandsBtn.setBorderPainted(false);
        updateCarBrandsBtn.setFocusPainted(false);
        updateCarBrandsBtn.setFocusable(false);
        updateCarBrandsBtn.setForeground(new Color(-328966));
        updateCarBrandsBtn.setPreferredSize(new Dimension(120, 65));
        updateCarBrandsBtn.setText("Modify Car Brand");
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.EAST;
        gbc.insets = new Insets(0, 2, 0, 0);
        CarBrandsMainHeader.add(updateCarBrandsBtn, gbc);
        listAllCarBrandsBtn = new JButton();
        listAllCarBrandsBtn.setBackground(new Color(-16758415));
        listAllCarBrandsBtn.setBorderPainted(false);
        listAllCarBrandsBtn.setFocusPainted(false);
        listAllCarBrandsBtn.setFocusable(false);
        listAllCarBrandsBtn.setForeground(new Color(-328966));
        listAllCarBrandsBtn.setPreferredSize(new Dimension(120, 65));
        listAllCarBrandsBtn.setText("List All Car Brands");
        gbc = new GridBagConstraints();
        gbc.gridx = 2;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.EAST;
        gbc.insets = new Insets(0, 2, 0, 0);
        CarBrandsMainHeader.add(listAllCarBrandsBtn, gbc);
        CardCarBrandsContainer = new JPanel();
        CardCarBrandsContainer.setLayout(new CardLayout(0, 0));
        CarBrandsMainPanel.add(CardCarBrandsContainer, BorderLayout.CENTER);
        PanelCarBrandsAdd = new JPanel();
        PanelCarBrandsAdd.setLayout(new GridBagLayout());
        PanelCarBrandsAdd.setBackground(new Color(-1118482));
        CardCarBrandsContainer.add(PanelCarBrandsAdd, "Card1");
        CarBrandAddTxtFieldName = new JTextField();
        CarBrandAddTxtFieldName.setPreferredSize(new Dimension(170, 26));
        gbc = new GridBagConstraints();
        gbc.gridx = 2;
        gbc.gridy = 1;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.insets = new Insets(0, 0, 20, 0);
        PanelCarBrandsAdd.add(CarBrandAddTxtFieldName, gbc);
        final JLabel label1 = new JLabel();
        label1.setForeground(new Color(-14207416));
        label1.setText("Name");
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.ipadx = 40;
        gbc.ipady = 20;
        gbc.insets = new Insets(0, 0, 20, 0);
        PanelCarBrandsAdd.add(label1, gbc);
        final JLabel label2 = new JLabel();
        label2.setForeground(new Color(-14207416));
        label2.setText("Desc");
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.ipadx = 40;
        gbc.ipady = 20;
        gbc.insets = new Insets(0, 0, 20, 0);
        PanelCarBrandsAdd.add(label2, gbc);
        CarBrandAddTxtFieldDesc = new JTextField();
        CarBrandAddTxtFieldDesc.setPreferredSize(new Dimension(170, 26));
        gbc = new GridBagConstraints();
        gbc.gridx = 2;
        gbc.gridy = 2;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.insets = new Insets(0, 0, 20, 0);
        PanelCarBrandsAdd.add(CarBrandAddTxtFieldDesc, gbc);
        CarBrandAddSubmitBtn = new JButton();
        CarBrandAddSubmitBtn.setBackground(new Color(-11551010));
        CarBrandAddSubmitBtn.setForeground(new Color(-328966));
        CarBrandAddSubmitBtn.setText("Add Car Brand");
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.gridwidth = 3;
        gbc.insets = new Insets(40, 0, 0, 0);
        PanelCarBrandsAdd.add(CarBrandAddSubmitBtn, gbc);
        final JLabel label3 = new JLabel();
        Font label3Font = this.$$$getFont$$$("Lato", Font.BOLD, 24, label3.getFont());
        if (label3Font != null) label3.setFont(label3Font);
        label3.setForeground(new Color(-16777216));
        label3.setText("Adding a new Car Brand");
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 3;
        gbc.insets = new Insets(0, 0, 30, 0);
        PanelCarBrandsAdd.add(label3, gbc);
        PanelCarBrandsUpdate = new JPanel();
        PanelCarBrandsUpdate.setLayout(new GridBagLayout());
        CardCarBrandsContainer.add(PanelCarBrandsUpdate, "Card2");
        final JLabel label4 = new JLabel();
        label4.setForeground(new Color(-14207416));
        label4.setText("New Name");
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 3;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.ipadx = 40;
        gbc.ipady = 20;
        gbc.insets = new Insets(0, 0, 20, 0);
        PanelCarBrandsUpdate.add(label4, gbc);
        CarBrandModifyNewName = new JTextField();
        CarBrandModifyNewName.setPreferredSize(new Dimension(170, 26));
        gbc = new GridBagConstraints();
        gbc.gridx = 3;
        gbc.gridy = 3;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.insets = new Insets(0, 0, 20, 0);
        PanelCarBrandsUpdate.add(CarBrandModifyNewName, gbc);
        final JLabel label5 = new JLabel();
        Font label5Font = this.$$$getFont$$$("Lato", Font.BOLD, 24, label5.getFont());
        if (label5Font != null) label5.setFont(label5Font);
        label5.setForeground(new Color(-16777216));
        label5.setText("Modify Car Brand");
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 1;
        gbc.gridwidth = 3;
        gbc.insets = new Insets(0, 0, 30, 0);
        PanelCarBrandsUpdate.add(label5, gbc);
        CarBrandModifyUpdateBtn = new JButton();
        CarBrandModifyUpdateBtn.setBackground(new Color(-11551010));
        CarBrandModifyUpdateBtn.setEnabled(false);
        CarBrandModifyUpdateBtn.setForeground(new Color(-328966));
        CarBrandModifyUpdateBtn.setText("Update");
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 5;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.insets = new Insets(40, 0, 0, 0);
        PanelCarBrandsUpdate.add(CarBrandModifyUpdateBtn, gbc);
        final JLabel label6 = new JLabel();
        label6.setForeground(new Color(-14207416));
        label6.setText("Name");
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 2;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.ipadx = 40;
        gbc.ipady = 20;
        gbc.insets = new Insets(0, 0, 20, 0);
        PanelCarBrandsUpdate.add(label6, gbc);
        CarBrandModifyOldName = new JTextField();
        CarBrandModifyOldName.setPreferredSize(new Dimension(170, 26));
        gbc = new GridBagConstraints();
        gbc.gridx = 3;
        gbc.gridy = 2;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.insets = new Insets(0, 0, 20, 0);
        PanelCarBrandsUpdate.add(CarBrandModifyOldName, gbc);
        CarBrandModifyRetreiveBtn = new JButton();
        CarBrandModifyRetreiveBtn.setBackground(new Color(-16758415));
        CarBrandModifyRetreiveBtn.setBorderPainted(false);
        CarBrandModifyRetreiveBtn.setFocusPainted(false);
        CarBrandModifyRetreiveBtn.setFocusable(false);
        CarBrandModifyRetreiveBtn.setForeground(new Color(-328966));
        CarBrandModifyRetreiveBtn.setText("Retrieve");
        gbc = new GridBagConstraints();
        gbc.gridx = 4;
        gbc.gridy = 2;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.insets = new Insets(0, 0, 20, 0);
        PanelCarBrandsUpdate.add(CarBrandModifyRetreiveBtn, gbc);
        CarBrandModifyDeleteBtn = new JButton();
        CarBrandModifyDeleteBtn.setBackground(new Color(-3140555));
        CarBrandModifyDeleteBtn.setEnabled(false);
        CarBrandModifyDeleteBtn.setForeground(new Color(-328966));
        CarBrandModifyDeleteBtn.setText("Delete");
        gbc = new GridBagConstraints();
        gbc.gridx = 3;
        gbc.gridy = 5;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.insets = new Insets(40, 30, 0, 0);
        PanelCarBrandsUpdate.add(CarBrandModifyDeleteBtn, gbc);
        final JLabel label7 = new JLabel();
        label7.setForeground(new Color(-14207416));
        label7.setText("New Desc");
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 4;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.ipadx = 40;
        gbc.ipady = 20;
        gbc.insets = new Insets(0, 0, 20, 0);
        PanelCarBrandsUpdate.add(label7, gbc);
        CarBrandModifyNewDesc = new JTextField();
        CarBrandModifyNewDesc.setPreferredSize(new Dimension(170, 26));
        gbc = new GridBagConstraints();
        gbc.gridx = 3;
        gbc.gridy = 4;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.insets = new Insets(0, 0, 20, 0);
        PanelCarBrandsUpdate.add(CarBrandModifyNewDesc, gbc);
        PanelCarBrandList = new JPanel();
        PanelCarBrandList.setLayout(new GridBagLayout());
        CardCarBrandsContainer.add(PanelCarBrandList, "Card3");
        final JLabel label8 = new JLabel();
        Font label8Font = this.$$$getFont$$$("Lato", Font.BOLD, 24, label8.getFont());
        if (label8Font != null) label8.setFont(label8Font);
        label8.setText("Listing All Car Brands");
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.WEST;
        PanelCarBrandList.add(label8, gbc);
        refreshButton = new JButton();
        refreshButton.setBackground(new Color(-16758415));
        refreshButton.setForeground(new Color(-328966));
        refreshButton.setText("Refresh");
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.EAST;
        gbc.insets = new Insets(0, 40, 0, 0);
        PanelCarBrandList.add(refreshButton, gbc);
        final JScrollPane scrollPane1 = new JScrollPane();
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.gridwidth = 2;
        gbc.fill = GridBagConstraints.BOTH;
        PanelCarBrandList.add(scrollPane1, gbc);
        scrollPane1.setViewportView(CarBrandListAll);
        EmployeeMainPanel = new JPanel();
        EmployeeMainPanel.setLayout(new BorderLayout(0, 0));
        CardMainCenterPanelHolder.add(EmployeeMainPanel, "Card2");
        EmployeeMainHeader = new JPanel();
        EmployeeMainHeader.setLayout(new GridBagLayout());
        EmployeeMainHeader.setBackground(new Color(-11551010));
        EmployeeMainPanel.add(EmployeeMainHeader, BorderLayout.NORTH);
        addEmployeeBtn = new JButton();
        addEmployeeBtn.setActionCommand("Add Employee");
        addEmployeeBtn.setBackground(new Color(-16758415));
        addEmployeeBtn.setBorderPainted(false);
        addEmployeeBtn.setFocusPainted(false);
        addEmployeeBtn.setFocusable(false);
        addEmployeeBtn.setForeground(new Color(-328966));
        addEmployeeBtn.setPreferredSize(new Dimension(120, 65));
        addEmployeeBtn.setText("Add Employe");
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.weightx = 0.5;
        gbc.anchor = GridBagConstraints.EAST;
        gbc.insets = new Insets(0, 2, 0, 0);
        EmployeeMainHeader.add(addEmployeeBtn, gbc);
        updateEmployeeBtn = new JButton();
        updateEmployeeBtn.setActionCommand("Update Employee");
        updateEmployeeBtn.setBackground(new Color(-16758415));
        updateEmployeeBtn.setBorderPainted(false);
        updateEmployeeBtn.setFocusPainted(false);
        updateEmployeeBtn.setFocusable(false);
        updateEmployeeBtn.setForeground(new Color(-328966));
        updateEmployeeBtn.setPreferredSize(new Dimension(120, 65));
        updateEmployeeBtn.setText("Modify Employee");
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.EAST;
        gbc.insets = new Insets(0, 2, 0, 0);
        EmployeeMainHeader.add(updateEmployeeBtn, gbc);
        searchEmployeeBtn = new JButton();
        searchEmployeeBtn.setActionCommand("Update Employee");
        searchEmployeeBtn.setBackground(new Color(-16758415));
        searchEmployeeBtn.setBorderPainted(false);
        searchEmployeeBtn.setFocusPainted(false);
        searchEmployeeBtn.setFocusable(false);
        searchEmployeeBtn.setForeground(new Color(-328966));
        searchEmployeeBtn.setPreferredSize(new Dimension(120, 65));
        searchEmployeeBtn.setText("Search Employee");
        gbc = new GridBagConstraints();
        gbc.gridx = 2;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.EAST;
        gbc.insets = new Insets(0, 2, 0, 0);
        EmployeeMainHeader.add(searchEmployeeBtn, gbc);
        listEmployeesBtn = new JButton();
        listEmployeesBtn.setActionCommand("Update Employee");
        listEmployeesBtn.setBackground(new Color(-16758415));
        listEmployeesBtn.setBorderPainted(false);
        listEmployeesBtn.setFocusPainted(false);
        listEmployeesBtn.setFocusable(false);
        listEmployeesBtn.setForeground(new Color(-328966));
        listEmployeesBtn.setPreferredSize(new Dimension(120, 65));
        listEmployeesBtn.setText("List all Employee");
        gbc = new GridBagConstraints();
        gbc.gridx = 3;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.EAST;
        gbc.insets = new Insets(0, 2, 0, 0);
        EmployeeMainHeader.add(listEmployeesBtn, gbc);
        CardEmployeeContainer = new JPanel();
        CardEmployeeContainer.setLayout(new CardLayout(0, 0));
        EmployeeMainPanel.add(CardEmployeeContainer, BorderLayout.CENTER);
        PanelEmployeeAdd = new JPanel();
        PanelEmployeeAdd.setLayout(new GridBagLayout());
        CardEmployeeContainer.add(PanelEmployeeAdd, "Card1");
        final JLabel label9 = new JLabel();
        label9.setText("Name");
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.insets = new Insets(12, 0, 0, 0);
        PanelEmployeeAdd.add(label9, gbc);
        EmployeeAddTxtFieldName = new JTextField();
        EmployeeAddTxtFieldName.setColumns(20);
        EmployeeAddTxtFieldName.setMaximumSize(new Dimension(2147483647, 30));
        EmployeeAddTxtFieldName.setPreferredSize(new Dimension(274, 30));
        gbc = new GridBagConstraints();
        gbc.gridx = 2;
        gbc.gridy = 1;
        gbc.gridwidth = 7;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.insets = new Insets(12, 20, 0, 0);
        PanelEmployeeAdd.add(EmployeeAddTxtFieldName, gbc);
        final JLabel label10 = new JLabel();
        label10.setText("Username");
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.insets = new Insets(12, 0, 0, 0);
        PanelEmployeeAdd.add(label10, gbc);
        EmployeeAddTxtFieldUsername = new JTextField();
        EmployeeAddTxtFieldUsername.setColumns(20);
        EmployeeAddTxtFieldUsername.setMaximumSize(new Dimension(2147483647, 30));
        EmployeeAddTxtFieldUsername.setPreferredSize(new Dimension(274, 30));
        gbc = new GridBagConstraints();
        gbc.gridx = 2;
        gbc.gridy = 2;
        gbc.gridwidth = 7;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.insets = new Insets(12, 20, 0, 0);
        PanelEmployeeAdd.add(EmployeeAddTxtFieldUsername, gbc);
        final JLabel label11 = new JLabel();
        label11.setText("Password");
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.insets = new Insets(12, 0, 0, 0);
        PanelEmployeeAdd.add(label11, gbc);
        final JLabel label12 = new JLabel();
        label12.setText("Qualification");
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 4;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.insets = new Insets(12, 0, 0, 0);
        PanelEmployeeAdd.add(label12, gbc);
        final JLabel label13 = new JLabel();
        label13.setText("Join Date");
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 5;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.insets = new Insets(12, 0, 0, 0);
        PanelEmployeeAdd.add(label13, gbc);
        final JLabel label14 = new JLabel();
        label14.setText("Phone");
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 6;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.insets = new Insets(12, 0, 0, 0);
        PanelEmployeeAdd.add(label14, gbc);
        EmployeeAddTxtFieldPhone = new JTextField();
        EmployeeAddTxtFieldPhone.setColumns(20);
        EmployeeAddTxtFieldPhone.setMaximumSize(new Dimension(2147483647, 30));
        EmployeeAddTxtFieldPhone.setPreferredSize(new Dimension(274, 30));
        EmployeeAddTxtFieldPhone.setText("");
        gbc = new GridBagConstraints();
        gbc.gridx = 2;
        gbc.gridy = 6;
        gbc.gridwidth = 7;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.insets = new Insets(12, 20, 0, 0);
        PanelEmployeeAdd.add(EmployeeAddTxtFieldPhone, gbc);
        final JLabel label15 = new JLabel();
        label15.setText("Address");
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 7;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.insets = new Insets(12, 0, 0, 0);
        PanelEmployeeAdd.add(label15, gbc);
        final JLabel label16 = new JLabel();
        label16.setText("Gender");
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 8;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.insets = new Insets(12, 0, 0, 0);
        PanelEmployeeAdd.add(label16, gbc);
        final JLabel label17 = new JLabel();
        label17.setText("Birth Date");
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 9;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.insets = new Insets(12, 0, 0, 0);
        PanelEmployeeAdd.add(label17, gbc);
        EmployeeAddPwdField = new JPasswordField();
        EmployeeAddPwdField.setMaximumSize(new Dimension(2147483647, 30));
        EmployeeAddPwdField.setPreferredSize(new Dimension(14, 30));
        gbc = new GridBagConstraints();
        gbc.gridx = 2;
        gbc.gridy = 3;
        gbc.gridwidth = 7;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.insets = new Insets(12, 20, 0, 0);
        PanelEmployeeAdd.add(EmployeeAddPwdField, gbc);
        final JScrollPane scrollPane2 = new JScrollPane();
        gbc = new GridBagConstraints();
        gbc.gridx = 2;
        gbc.gridy = 7;
        gbc.gridwidth = 7;
        gbc.fill = GridBagConstraints.BOTH;
        gbc.insets = new Insets(12, 20, 0, 0);
        PanelEmployeeAdd.add(scrollPane2, gbc);
        EmployeeAddAddress = new JTextArea();
        EmployeeAddAddress.setRows(3);
        EmployeeAddAddress.setText("");
        scrollPane2.setViewportView(EmployeeAddAddress);
        EmployeeAddGenderMale = new JRadioButton();
        EmployeeAddGenderMale.setSelected(true);
        EmployeeAddGenderMale.setText("Male");
        gbc = new GridBagConstraints();
        gbc.gridx = 2;
        gbc.gridy = 8;
        gbc.gridwidth = 4;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.insets = new Insets(12, 20, 0, 0);
        PanelEmployeeAdd.add(EmployeeAddGenderMale, gbc);
        EmployeeAddGenderFemale = new JRadioButton();
        EmployeeAddGenderFemale.setText("Female");
        gbc = new GridBagConstraints();
        gbc.gridx = 8;
        gbc.gridy = 8;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.insets = new Insets(12, 0, 0, 0);
        PanelEmployeeAdd.add(EmployeeAddGenderFemale, gbc);
        EmployeeAddBirthDateMonth = new JComboBox();
        EmployeeAddBirthDateMonth.setBackground(new Color(-1));
        EmployeeAddBirthDateMonth.setMaximumSize(new Dimension(32767, 30));
        final DefaultComboBoxModel defaultComboBoxModel1 = new DefaultComboBoxModel();
        defaultComboBoxModel1.addElement("1");
        defaultComboBoxModel1.addElement("2");
        defaultComboBoxModel1.addElement("3");
        defaultComboBoxModel1.addElement("4");
        defaultComboBoxModel1.addElement("5");
        defaultComboBoxModel1.addElement("6");
        defaultComboBoxModel1.addElement("7");
        defaultComboBoxModel1.addElement("8");
        defaultComboBoxModel1.addElement("9");
        defaultComboBoxModel1.addElement("10");
        defaultComboBoxModel1.addElement("11");
        defaultComboBoxModel1.addElement("12");
        EmployeeAddBirthDateMonth.setModel(defaultComboBoxModel1);
        EmployeeAddBirthDateMonth.setPreferredSize(new Dimension(70, 30));
        gbc = new GridBagConstraints();
        gbc.gridx = 5;
        gbc.gridy = 9;
        gbc.gridwidth = 3;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.insets = new Insets(12, 20, 0, 0);
        PanelEmployeeAdd.add(EmployeeAddBirthDateMonth, gbc);
        EmployeeAddBirthDateYear = new JComboBox();
        EmployeeAddBirthDateYear.setBackground(new Color(-1));
        EmployeeAddBirthDateYear.setMaximumSize(new Dimension(32767, 30));
        final DefaultComboBoxModel defaultComboBoxModel2 = new DefaultComboBoxModel();
        defaultComboBoxModel2.addElement("1950");
        defaultComboBoxModel2.addElement("1951");
        defaultComboBoxModel2.addElement("1952");
        defaultComboBoxModel2.addElement("1953");
        defaultComboBoxModel2.addElement("1954");
        defaultComboBoxModel2.addElement("1955");
        defaultComboBoxModel2.addElement("1956");
        defaultComboBoxModel2.addElement("1957");
        defaultComboBoxModel2.addElement("1958");
        defaultComboBoxModel2.addElement("1959");
        defaultComboBoxModel2.addElement("1960");
        defaultComboBoxModel2.addElement("1961");
        defaultComboBoxModel2.addElement("1962");
        defaultComboBoxModel2.addElement("1963");
        defaultComboBoxModel2.addElement("1964");
        defaultComboBoxModel2.addElement("1965");
        defaultComboBoxModel2.addElement("1966");
        defaultComboBoxModel2.addElement("1967");
        defaultComboBoxModel2.addElement("1968");
        defaultComboBoxModel2.addElement("1969");
        defaultComboBoxModel2.addElement("1970");
        defaultComboBoxModel2.addElement("1971");
        defaultComboBoxModel2.addElement("1972");
        defaultComboBoxModel2.addElement("1973");
        defaultComboBoxModel2.addElement("1974");
        defaultComboBoxModel2.addElement("1975");
        defaultComboBoxModel2.addElement("1976");
        defaultComboBoxModel2.addElement("1977");
        defaultComboBoxModel2.addElement("1978");
        defaultComboBoxModel2.addElement("1979");
        defaultComboBoxModel2.addElement("1980");
        defaultComboBoxModel2.addElement("1981");
        defaultComboBoxModel2.addElement("1982");
        defaultComboBoxModel2.addElement("1983");
        defaultComboBoxModel2.addElement("1984");
        defaultComboBoxModel2.addElement("1985");
        defaultComboBoxModel2.addElement("1986");
        defaultComboBoxModel2.addElement("1987");
        defaultComboBoxModel2.addElement("1988");
        defaultComboBoxModel2.addElement("1989");
        defaultComboBoxModel2.addElement("1990");
        defaultComboBoxModel2.addElement("1991");
        defaultComboBoxModel2.addElement("1992");
        defaultComboBoxModel2.addElement("1993");
        defaultComboBoxModel2.addElement("1994");
        defaultComboBoxModel2.addElement("1995");
        defaultComboBoxModel2.addElement("1996");
        defaultComboBoxModel2.addElement("1997");
        defaultComboBoxModel2.addElement("1998");
        defaultComboBoxModel2.addElement("1999");
        defaultComboBoxModel2.addElement("2000");
        defaultComboBoxModel2.addElement("2001");
        defaultComboBoxModel2.addElement("2002");
        defaultComboBoxModel2.addElement("2003");
        defaultComboBoxModel2.addElement("2004");
        defaultComboBoxModel2.addElement("2005");
        defaultComboBoxModel2.addElement("2006");
        defaultComboBoxModel2.addElement("2007");
        defaultComboBoxModel2.addElement("2008");
        defaultComboBoxModel2.addElement("2009");
        defaultComboBoxModel2.addElement("2010");
        defaultComboBoxModel2.addElement("2011");
        defaultComboBoxModel2.addElement("2012");
        defaultComboBoxModel2.addElement("2013");
        defaultComboBoxModel2.addElement("2014");
        defaultComboBoxModel2.addElement("2015");
        defaultComboBoxModel2.addElement("2016");
        defaultComboBoxModel2.addElement("2017");
        defaultComboBoxModel2.addElement("2018");
        EmployeeAddBirthDateYear.setModel(defaultComboBoxModel2);
        EmployeeAddBirthDateYear.setPreferredSize(new Dimension(70, 30));
        gbc = new GridBagConstraints();
        gbc.gridx = 8;
        gbc.gridy = 9;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.insets = new Insets(12, 20, 0, 0);
        PanelEmployeeAdd.add(EmployeeAddBirthDateYear, gbc);
        EmployeeAddBirthDateDay = new JComboBox();
        EmployeeAddBirthDateDay.setBackground(new Color(-1));
        EmployeeAddBirthDateDay.setMaximumSize(new Dimension(32767, 30));
        final DefaultComboBoxModel defaultComboBoxModel3 = new DefaultComboBoxModel();
        defaultComboBoxModel3.addElement("1");
        defaultComboBoxModel3.addElement("2");
        defaultComboBoxModel3.addElement("3");
        defaultComboBoxModel3.addElement("4");
        defaultComboBoxModel3.addElement("5");
        defaultComboBoxModel3.addElement("6");
        defaultComboBoxModel3.addElement("7");
        defaultComboBoxModel3.addElement("8");
        defaultComboBoxModel3.addElement("9");
        defaultComboBoxModel3.addElement("10");
        defaultComboBoxModel3.addElement("11");
        defaultComboBoxModel3.addElement("12");
        defaultComboBoxModel3.addElement("13");
        defaultComboBoxModel3.addElement("14");
        defaultComboBoxModel3.addElement("15");
        defaultComboBoxModel3.addElement("16");
        defaultComboBoxModel3.addElement("17");
        defaultComboBoxModel3.addElement("18");
        defaultComboBoxModel3.addElement("19");
        defaultComboBoxModel3.addElement("20");
        defaultComboBoxModel3.addElement("21");
        defaultComboBoxModel3.addElement("22");
        defaultComboBoxModel3.addElement("23");
        defaultComboBoxModel3.addElement("24");
        defaultComboBoxModel3.addElement("25");
        defaultComboBoxModel3.addElement("26");
        defaultComboBoxModel3.addElement("27");
        defaultComboBoxModel3.addElement("28");
        defaultComboBoxModel3.addElement("29");
        defaultComboBoxModel3.addElement("30");
        defaultComboBoxModel3.addElement("31");
        EmployeeAddBirthDateDay.setModel(defaultComboBoxModel3);
        EmployeeAddBirthDateDay.setPreferredSize(new Dimension(70, 30));
        gbc = new GridBagConstraints();
        gbc.gridx = 2;
        gbc.gridy = 9;
        gbc.gridwidth = 3;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.insets = new Insets(12, 20, 0, 0);
        PanelEmployeeAdd.add(EmployeeAddBirthDateDay, gbc);
        EmployeeAddJoinDateMonth = new JComboBox();
        EmployeeAddJoinDateMonth.setBackground(new Color(-1));
        EmployeeAddJoinDateMonth.setMaximumSize(new Dimension(32767, 30));
        final DefaultComboBoxModel defaultComboBoxModel4 = new DefaultComboBoxModel();
        defaultComboBoxModel4.addElement("1");
        defaultComboBoxModel4.addElement("2");
        defaultComboBoxModel4.addElement("3");
        defaultComboBoxModel4.addElement("4");
        defaultComboBoxModel4.addElement("5");
        defaultComboBoxModel4.addElement("6");
        defaultComboBoxModel4.addElement("7");
        defaultComboBoxModel4.addElement("8");
        defaultComboBoxModel4.addElement("9");
        defaultComboBoxModel4.addElement("10");
        defaultComboBoxModel4.addElement("11");
        defaultComboBoxModel4.addElement("12");
        EmployeeAddJoinDateMonth.setModel(defaultComboBoxModel4);
        EmployeeAddJoinDateMonth.setPreferredSize(new Dimension(70, 30));
        gbc = new GridBagConstraints();
        gbc.gridx = 5;
        gbc.gridy = 5;
        gbc.gridwidth = 3;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.insets = new Insets(7, 20, 0, 0);
        PanelEmployeeAdd.add(EmployeeAddJoinDateMonth, gbc);
        EmployeeAddJoinDateYear = new JComboBox();
        EmployeeAddJoinDateYear.setBackground(new Color(-1));
        EmployeeAddJoinDateYear.setMaximumSize(new Dimension(32767, 30));
        final DefaultComboBoxModel defaultComboBoxModel5 = new DefaultComboBoxModel();
        defaultComboBoxModel5.addElement("1950");
        defaultComboBoxModel5.addElement("1951");
        defaultComboBoxModel5.addElement("1952");
        defaultComboBoxModel5.addElement("1953");
        defaultComboBoxModel5.addElement("1954");
        defaultComboBoxModel5.addElement("1955");
        defaultComboBoxModel5.addElement("1956");
        defaultComboBoxModel5.addElement("1957");
        defaultComboBoxModel5.addElement("1958");
        defaultComboBoxModel5.addElement("1959");
        defaultComboBoxModel5.addElement("1960");
        defaultComboBoxModel5.addElement("1961");
        defaultComboBoxModel5.addElement("1962");
        defaultComboBoxModel5.addElement("1963");
        defaultComboBoxModel5.addElement("1964");
        defaultComboBoxModel5.addElement("1965");
        defaultComboBoxModel5.addElement("1966");
        defaultComboBoxModel5.addElement("1967");
        defaultComboBoxModel5.addElement("1968");
        defaultComboBoxModel5.addElement("1969");
        defaultComboBoxModel5.addElement("1970");
        defaultComboBoxModel5.addElement("1971");
        defaultComboBoxModel5.addElement("1972");
        defaultComboBoxModel5.addElement("1973");
        defaultComboBoxModel5.addElement("1974");
        defaultComboBoxModel5.addElement("1975");
        defaultComboBoxModel5.addElement("1976");
        defaultComboBoxModel5.addElement("1977");
        defaultComboBoxModel5.addElement("1978");
        defaultComboBoxModel5.addElement("1979");
        defaultComboBoxModel5.addElement("1980");
        defaultComboBoxModel5.addElement("1981");
        defaultComboBoxModel5.addElement("1982");
        defaultComboBoxModel5.addElement("1983");
        defaultComboBoxModel5.addElement("1984");
        defaultComboBoxModel5.addElement("1985");
        defaultComboBoxModel5.addElement("1986");
        defaultComboBoxModel5.addElement("1987");
        defaultComboBoxModel5.addElement("1988");
        defaultComboBoxModel5.addElement("1989");
        defaultComboBoxModel5.addElement("1990");
        defaultComboBoxModel5.addElement("1991");
        defaultComboBoxModel5.addElement("1992");
        defaultComboBoxModel5.addElement("1993");
        defaultComboBoxModel5.addElement("1994");
        defaultComboBoxModel5.addElement("1995");
        defaultComboBoxModel5.addElement("1996");
        defaultComboBoxModel5.addElement("1997");
        defaultComboBoxModel5.addElement("1998");
        defaultComboBoxModel5.addElement("1999");
        defaultComboBoxModel5.addElement("2000");
        defaultComboBoxModel5.addElement("2001");
        defaultComboBoxModel5.addElement("2002");
        defaultComboBoxModel5.addElement("2003");
        defaultComboBoxModel5.addElement("2004");
        defaultComboBoxModel5.addElement("2005");
        defaultComboBoxModel5.addElement("2006");
        defaultComboBoxModel5.addElement("2007");
        defaultComboBoxModel5.addElement("2008");
        defaultComboBoxModel5.addElement("2009");
        defaultComboBoxModel5.addElement("2010");
        defaultComboBoxModel5.addElement("2011");
        defaultComboBoxModel5.addElement("2012");
        defaultComboBoxModel5.addElement("2013");
        defaultComboBoxModel5.addElement("2014");
        defaultComboBoxModel5.addElement("2015");
        defaultComboBoxModel5.addElement("2016");
        defaultComboBoxModel5.addElement("2017");
        EmployeeAddJoinDateYear.setModel(defaultComboBoxModel5);
        EmployeeAddJoinDateYear.setPreferredSize(new Dimension(70, 30));
        gbc = new GridBagConstraints();
        gbc.gridx = 8;
        gbc.gridy = 5;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.insets = new Insets(7, 20, 0, 0);
        PanelEmployeeAdd.add(EmployeeAddJoinDateYear, gbc);
        EmployeeAddJoinDateDay = new JComboBox();
        EmployeeAddJoinDateDay.setBackground(new Color(-1));
        EmployeeAddJoinDateDay.setMaximumSize(new Dimension(32767, 30));
        final DefaultComboBoxModel defaultComboBoxModel6 = new DefaultComboBoxModel();
        defaultComboBoxModel6.addElement("1");
        defaultComboBoxModel6.addElement("2");
        defaultComboBoxModel6.addElement("3");
        defaultComboBoxModel6.addElement("4");
        defaultComboBoxModel6.addElement("5");
        defaultComboBoxModel6.addElement("6");
        defaultComboBoxModel6.addElement("7");
        defaultComboBoxModel6.addElement("8");
        defaultComboBoxModel6.addElement("9");
        defaultComboBoxModel6.addElement("10");
        defaultComboBoxModel6.addElement("11");
        defaultComboBoxModel6.addElement("12");
        defaultComboBoxModel6.addElement("13");
        defaultComboBoxModel6.addElement("14");
        defaultComboBoxModel6.addElement("15");
        defaultComboBoxModel6.addElement("16");
        defaultComboBoxModel6.addElement("17");
        defaultComboBoxModel6.addElement("18");
        defaultComboBoxModel6.addElement("19");
        defaultComboBoxModel6.addElement("20");
        defaultComboBoxModel6.addElement("21");
        defaultComboBoxModel6.addElement("22");
        defaultComboBoxModel6.addElement("23");
        defaultComboBoxModel6.addElement("24");
        defaultComboBoxModel6.addElement("25");
        defaultComboBoxModel6.addElement("26");
        defaultComboBoxModel6.addElement("27");
        defaultComboBoxModel6.addElement("28");
        defaultComboBoxModel6.addElement("29");
        defaultComboBoxModel6.addElement("30");
        defaultComboBoxModel6.addElement("31");
        EmployeeAddJoinDateDay.setModel(defaultComboBoxModel6);
        EmployeeAddJoinDateDay.setPreferredSize(new Dimension(70, 30));
        gbc = new GridBagConstraints();
        gbc.gridx = 2;
        gbc.gridy = 5;
        gbc.gridwidth = 3;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.insets = new Insets(7, 20, 0, 0);
        PanelEmployeeAdd.add(EmployeeAddJoinDateDay, gbc);
        EmployeeAddSubmitAdd = new JButton();
        EmployeeAddSubmitAdd.setBackground(new Color(-11551010));
        EmployeeAddSubmitAdd.setForeground(new Color(-328966));
        EmployeeAddSubmitAdd.setText("Add Employee");
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 10;
        gbc.gridwidth = 9;
        gbc.ipadx = 10;
        gbc.insets = new Insets(20, 0, 0, 0);
        PanelEmployeeAdd.add(EmployeeAddSubmitAdd, gbc);
        final JLabel label18 = new JLabel();
        Font label18Font = this.$$$getFont$$$("Lato", Font.BOLD, 24, label18.getFont());
        if (label18Font != null) label18.setFont(label18Font);
        label18.setText("Add Employee");
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 9;
        gbc.insets = new Insets(0, 0, 20, 0);
        PanelEmployeeAdd.add(label18, gbc);
        EmployeeAddQualification.setBackground(new Color(-1));
        gbc = new GridBagConstraints();
        gbc.gridx = 2;
        gbc.gridy = 4;
        gbc.gridwidth = 7;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.insets = new Insets(12, 20, 0, 0);
        PanelEmployeeAdd.add(EmployeeAddQualification, gbc);
        PanelEmployeeUpdate = new JPanel();
        PanelEmployeeUpdate.setLayout(new GridBagLayout());
        PanelEmployeeUpdate.setBackground(new Color(-1513240));
        CardEmployeeContainer.add(PanelEmployeeUpdate, "Card2");
        final JLabel label19 = new JLabel();
        Font label19Font = this.$$$getFont$$$("Lato", Font.BOLD, 24, label19.getFont());
        if (label19Font != null) label19.setFont(label19Font);
        label19.setText("Modify Employee");
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 4;
        gbc.insets = new Insets(0, 0, 20, 0);
        PanelEmployeeUpdate.add(label19, gbc);
        EmployeeModifyName = new JTextField();
        EmployeeModifyName.setColumns(20);
        EmployeeModifyName.setPreferredSize(new Dimension(274, 30));
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 2;
        gbc.gridwidth = 3;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.insets = new Insets(14, 20, 0, 0);
        PanelEmployeeUpdate.add(EmployeeModifyName, gbc);
        final JLabel label20 = new JLabel();
        label20.setText("Name");
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.insets = new Insets(14, 0, 0, 0);
        PanelEmployeeUpdate.add(label20, gbc);
        final JLabel label21 = new JLabel();
        label21.setText("Join date");
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 6;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.insets = new Insets(14, 0, 0, 0);
        PanelEmployeeUpdate.add(label21, gbc);
        EmployeeModifyJoinDateDay = new JComboBox();
        EmployeeModifyJoinDateDay.setBackground(new Color(-1));
        final DefaultComboBoxModel defaultComboBoxModel7 = new DefaultComboBoxModel();
        defaultComboBoxModel7.addElement("1");
        defaultComboBoxModel7.addElement("2");
        defaultComboBoxModel7.addElement("3");
        defaultComboBoxModel7.addElement("4");
        defaultComboBoxModel7.addElement("5");
        defaultComboBoxModel7.addElement("6");
        defaultComboBoxModel7.addElement("7");
        defaultComboBoxModel7.addElement("8");
        defaultComboBoxModel7.addElement("9");
        defaultComboBoxModel7.addElement("10");
        defaultComboBoxModel7.addElement("11");
        defaultComboBoxModel7.addElement("12");
        defaultComboBoxModel7.addElement("13");
        defaultComboBoxModel7.addElement("14");
        defaultComboBoxModel7.addElement("15");
        defaultComboBoxModel7.addElement("16");
        defaultComboBoxModel7.addElement("17");
        defaultComboBoxModel7.addElement("18");
        defaultComboBoxModel7.addElement("19");
        defaultComboBoxModel7.addElement("20");
        defaultComboBoxModel7.addElement("21");
        defaultComboBoxModel7.addElement("22");
        defaultComboBoxModel7.addElement("23");
        defaultComboBoxModel7.addElement("24");
        defaultComboBoxModel7.addElement("25");
        defaultComboBoxModel7.addElement("26");
        defaultComboBoxModel7.addElement("27");
        defaultComboBoxModel7.addElement("28");
        defaultComboBoxModel7.addElement("29");
        defaultComboBoxModel7.addElement("30");
        defaultComboBoxModel7.addElement("31");
        EmployeeModifyJoinDateDay.setModel(defaultComboBoxModel7);
        EmployeeModifyJoinDateDay.setPreferredSize(new Dimension(82, 28));
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 6;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.insets = new Insets(14, 20, 0, 0);
        PanelEmployeeUpdate.add(EmployeeModifyJoinDateDay, gbc);
        EmployeeModifyJoinDateMonth = new JComboBox();
        EmployeeModifyJoinDateMonth.setBackground(new Color(-1));
        final DefaultComboBoxModel defaultComboBoxModel8 = new DefaultComboBoxModel();
        defaultComboBoxModel8.addElement("01");
        defaultComboBoxModel8.addElement("02");
        defaultComboBoxModel8.addElement("03");
        defaultComboBoxModel8.addElement("04");
        defaultComboBoxModel8.addElement("05");
        defaultComboBoxModel8.addElement("06");
        defaultComboBoxModel8.addElement("07");
        defaultComboBoxModel8.addElement("08");
        defaultComboBoxModel8.addElement("09");
        defaultComboBoxModel8.addElement("10");
        defaultComboBoxModel8.addElement("11");
        defaultComboBoxModel8.addElement("12");
        EmployeeModifyJoinDateMonth.setModel(defaultComboBoxModel8);
        EmployeeModifyJoinDateMonth.setPreferredSize(new Dimension(82, 28));
        gbc = new GridBagConstraints();
        gbc.gridx = 2;
        gbc.gridy = 6;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.insets = new Insets(14, 15, 0, 0);
        PanelEmployeeUpdate.add(EmployeeModifyJoinDateMonth, gbc);
        EmployeeModifyJoinDateYear = new JComboBox();
        EmployeeModifyJoinDateYear.setBackground(new Color(-1));
        final DefaultComboBoxModel defaultComboBoxModel9 = new DefaultComboBoxModel();
        defaultComboBoxModel9.addElement("1950");
        defaultComboBoxModel9.addElement("1951");
        defaultComboBoxModel9.addElement("1952");
        defaultComboBoxModel9.addElement("1953");
        defaultComboBoxModel9.addElement("1954");
        defaultComboBoxModel9.addElement("1955");
        defaultComboBoxModel9.addElement("1956");
        defaultComboBoxModel9.addElement("1957");
        defaultComboBoxModel9.addElement("1958");
        defaultComboBoxModel9.addElement("1959");
        defaultComboBoxModel9.addElement("1960");
        defaultComboBoxModel9.addElement("1961");
        defaultComboBoxModel9.addElement("1962");
        defaultComboBoxModel9.addElement("1963");
        defaultComboBoxModel9.addElement("1964");
        defaultComboBoxModel9.addElement("1965");
        defaultComboBoxModel9.addElement("1966");
        defaultComboBoxModel9.addElement("1967");
        defaultComboBoxModel9.addElement("1968");
        defaultComboBoxModel9.addElement("1969");
        defaultComboBoxModel9.addElement("1970");
        defaultComboBoxModel9.addElement("1971");
        defaultComboBoxModel9.addElement("1972");
        defaultComboBoxModel9.addElement("1973");
        defaultComboBoxModel9.addElement("1974");
        defaultComboBoxModel9.addElement("1975");
        defaultComboBoxModel9.addElement("1976");
        defaultComboBoxModel9.addElement("1977");
        defaultComboBoxModel9.addElement("1978");
        defaultComboBoxModel9.addElement("1979");
        defaultComboBoxModel9.addElement("1980");
        defaultComboBoxModel9.addElement("1981");
        defaultComboBoxModel9.addElement("1982");
        defaultComboBoxModel9.addElement("1983");
        defaultComboBoxModel9.addElement("1984");
        defaultComboBoxModel9.addElement("1985");
        defaultComboBoxModel9.addElement("1986");
        defaultComboBoxModel9.addElement("1987");
        defaultComboBoxModel9.addElement("1988");
        defaultComboBoxModel9.addElement("1989");
        defaultComboBoxModel9.addElement("1990");
        defaultComboBoxModel9.addElement("1991");
        defaultComboBoxModel9.addElement("1992");
        defaultComboBoxModel9.addElement("1993");
        defaultComboBoxModel9.addElement("1994");
        defaultComboBoxModel9.addElement("1995");
        defaultComboBoxModel9.addElement("1996");
        defaultComboBoxModel9.addElement("1997");
        defaultComboBoxModel9.addElement("1998");
        defaultComboBoxModel9.addElement("1999");
        defaultComboBoxModel9.addElement("2000");
        defaultComboBoxModel9.addElement("2001");
        defaultComboBoxModel9.addElement("2002");
        defaultComboBoxModel9.addElement("2003");
        defaultComboBoxModel9.addElement("2004");
        defaultComboBoxModel9.addElement("2005");
        defaultComboBoxModel9.addElement("2006");
        defaultComboBoxModel9.addElement("2007");
        defaultComboBoxModel9.addElement("2008");
        defaultComboBoxModel9.addElement("2009");
        defaultComboBoxModel9.addElement("2010");
        defaultComboBoxModel9.addElement("2011");
        defaultComboBoxModel9.addElement("2012");
        defaultComboBoxModel9.addElement("2013");
        defaultComboBoxModel9.addElement("2014");
        defaultComboBoxModel9.addElement("2015");
        defaultComboBoxModel9.addElement("2016");
        defaultComboBoxModel9.addElement("2017");
        defaultComboBoxModel9.addElement("2018");
        EmployeeModifyJoinDateYear.setModel(defaultComboBoxModel9);
        EmployeeModifyJoinDateYear.setPreferredSize(new Dimension(82, 28));
        gbc = new GridBagConstraints();
        gbc.gridx = 3;
        gbc.gridy = 6;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.insets = new Insets(14, 15, 0, 0);
        PanelEmployeeUpdate.add(EmployeeModifyJoinDateYear, gbc);
        final JLabel label22 = new JLabel();
        label22.setText("Gender");
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 9;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.insets = new Insets(14, 0, 0, 0);
        PanelEmployeeUpdate.add(label22, gbc);
        EmployeeModifyGenderMale = new JRadioButton();
        EmployeeModifyGenderMale.setContentAreaFilled(false);
        EmployeeModifyGenderMale.setSelected(true);
        EmployeeModifyGenderMale.setText("Male");
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 9;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.insets = new Insets(14, 20, 0, 0);
        PanelEmployeeUpdate.add(EmployeeModifyGenderMale, gbc);
        EmployeeModifyGenderFemale = new JRadioButton();
        EmployeeModifyGenderFemale.setContentAreaFilled(false);
        EmployeeModifyGenderFemale.setText("Female");
        gbc = new GridBagConstraints();
        gbc.gridx = 2;
        gbc.gridy = 9;
        gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.insets = new Insets(14, 0, 0, 0);
        PanelEmployeeUpdate.add(EmployeeModifyGenderFemale, gbc);
        EmployeeModifyUsername = new JTextField();
        EmployeeModifyUsername.setColumns(20);
        EmployeeModifyUsername.setPreferredSize(new Dimension(274, 30));
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 3;
        gbc.gridwidth = 3;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.insets = new Insets(14, 20, 0, 0);
        PanelEmployeeUpdate.add(EmployeeModifyUsername, gbc);
        final JLabel label23 = new JLabel();
        label23.setText("Username");
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.insets = new Insets(14, 0, 0, 0);
        PanelEmployeeUpdate.add(label23, gbc);
        final JLabel label24 = new JLabel();
        label24.setText("Password");
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 4;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.insets = new Insets(14, 0, 0, 0);
        PanelEmployeeUpdate.add(label24, gbc);
        final JLabel label25 = new JLabel();
        label25.setText("Birth Date");
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 10;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.insets = new Insets(14, 0, 0, 0);
        PanelEmployeeUpdate.add(label25, gbc);
        EmployeeModifyBirthDateDay = new JComboBox();
        EmployeeModifyBirthDateDay.setBackground(new Color(-1));
        final DefaultComboBoxModel defaultComboBoxModel10 = new DefaultComboBoxModel();
        defaultComboBoxModel10.addElement("1");
        defaultComboBoxModel10.addElement("2");
        defaultComboBoxModel10.addElement("3");
        defaultComboBoxModel10.addElement("4");
        defaultComboBoxModel10.addElement("5");
        defaultComboBoxModel10.addElement("6");
        defaultComboBoxModel10.addElement("7");
        defaultComboBoxModel10.addElement("8");
        defaultComboBoxModel10.addElement("9");
        defaultComboBoxModel10.addElement("10");
        defaultComboBoxModel10.addElement("11");
        defaultComboBoxModel10.addElement("12");
        defaultComboBoxModel10.addElement("13");
        defaultComboBoxModel10.addElement("14");
        defaultComboBoxModel10.addElement("15");
        defaultComboBoxModel10.addElement("16");
        defaultComboBoxModel10.addElement("17");
        defaultComboBoxModel10.addElement("18");
        defaultComboBoxModel10.addElement("19");
        defaultComboBoxModel10.addElement("20");
        defaultComboBoxModel10.addElement("21");
        defaultComboBoxModel10.addElement("22");
        defaultComboBoxModel10.addElement("23");
        defaultComboBoxModel10.addElement("24");
        defaultComboBoxModel10.addElement("25");
        defaultComboBoxModel10.addElement("26");
        defaultComboBoxModel10.addElement("27");
        defaultComboBoxModel10.addElement("28");
        defaultComboBoxModel10.addElement("29");
        defaultComboBoxModel10.addElement("30");
        defaultComboBoxModel10.addElement("31");
        EmployeeModifyBirthDateDay.setModel(defaultComboBoxModel10);
        EmployeeModifyBirthDateDay.setPreferredSize(new Dimension(82, 28));
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 10;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.insets = new Insets(14, 20, 0, 0);
        PanelEmployeeUpdate.add(EmployeeModifyBirthDateDay, gbc);
        EmployeeModifyBirthDateMonth = new JComboBox();
        EmployeeModifyBirthDateMonth.setBackground(new Color(-1));
        final DefaultComboBoxModel defaultComboBoxModel11 = new DefaultComboBoxModel();
        defaultComboBoxModel11.addElement("01");
        defaultComboBoxModel11.addElement("02");
        defaultComboBoxModel11.addElement("03");
        defaultComboBoxModel11.addElement("04");
        defaultComboBoxModel11.addElement("05");
        defaultComboBoxModel11.addElement("06");
        defaultComboBoxModel11.addElement("07");
        defaultComboBoxModel11.addElement("08");
        defaultComboBoxModel11.addElement("09");
        defaultComboBoxModel11.addElement("10");
        defaultComboBoxModel11.addElement("11");
        defaultComboBoxModel11.addElement("12");
        EmployeeModifyBirthDateMonth.setModel(defaultComboBoxModel11);
        EmployeeModifyBirthDateMonth.setPreferredSize(new Dimension(82, 28));
        gbc = new GridBagConstraints();
        gbc.gridx = 2;
        gbc.gridy = 10;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.insets = new Insets(14, 15, 0, 0);
        PanelEmployeeUpdate.add(EmployeeModifyBirthDateMonth, gbc);
        EmployeeModifyBirthDateYear = new JComboBox();
        EmployeeModifyBirthDateYear.setBackground(new Color(-1));
        final DefaultComboBoxModel defaultComboBoxModel12 = new DefaultComboBoxModel();
        defaultComboBoxModel12.addElement("1950");
        defaultComboBoxModel12.addElement("1951");
        defaultComboBoxModel12.addElement("1952");
        defaultComboBoxModel12.addElement("1953");
        defaultComboBoxModel12.addElement("1954");
        defaultComboBoxModel12.addElement("1955");
        defaultComboBoxModel12.addElement("1956");
        defaultComboBoxModel12.addElement("1957");
        defaultComboBoxModel12.addElement("1958");
        defaultComboBoxModel12.addElement("1959");
        defaultComboBoxModel12.addElement("1960");
        defaultComboBoxModel12.addElement("1961");
        defaultComboBoxModel12.addElement("1962");
        defaultComboBoxModel12.addElement("1963");
        defaultComboBoxModel12.addElement("1964");
        defaultComboBoxModel12.addElement("1965");
        defaultComboBoxModel12.addElement("1966");
        defaultComboBoxModel12.addElement("1967");
        defaultComboBoxModel12.addElement("1968");
        defaultComboBoxModel12.addElement("1969");
        defaultComboBoxModel12.addElement("1970");
        defaultComboBoxModel12.addElement("1971");
        defaultComboBoxModel12.addElement("1972");
        defaultComboBoxModel12.addElement("1973");
        defaultComboBoxModel12.addElement("1974");
        defaultComboBoxModel12.addElement("1975");
        defaultComboBoxModel12.addElement("1976");
        defaultComboBoxModel12.addElement("1977");
        defaultComboBoxModel12.addElement("1978");
        defaultComboBoxModel12.addElement("1979");
        defaultComboBoxModel12.addElement("1980");
        defaultComboBoxModel12.addElement("1981");
        defaultComboBoxModel12.addElement("1982");
        defaultComboBoxModel12.addElement("1983");
        defaultComboBoxModel12.addElement("1984");
        defaultComboBoxModel12.addElement("1985");
        defaultComboBoxModel12.addElement("1986");
        defaultComboBoxModel12.addElement("1987");
        defaultComboBoxModel12.addElement("1988");
        defaultComboBoxModel12.addElement("1989");
        defaultComboBoxModel12.addElement("1990");
        defaultComboBoxModel12.addElement("1991");
        defaultComboBoxModel12.addElement("1992");
        defaultComboBoxModel12.addElement("1993");
        defaultComboBoxModel12.addElement("1994");
        defaultComboBoxModel12.addElement("1995");
        defaultComboBoxModel12.addElement("1996");
        defaultComboBoxModel12.addElement("1997");
        defaultComboBoxModel12.addElement("1998");
        defaultComboBoxModel12.addElement("1999");
        defaultComboBoxModel12.addElement("2000");
        defaultComboBoxModel12.addElement("2001");
        defaultComboBoxModel12.addElement("2002");
        defaultComboBoxModel12.addElement("2003");
        defaultComboBoxModel12.addElement("2004");
        defaultComboBoxModel12.addElement("2005");
        defaultComboBoxModel12.addElement("2006");
        defaultComboBoxModel12.addElement("2007");
        defaultComboBoxModel12.addElement("2008");
        defaultComboBoxModel12.addElement("2009");
        defaultComboBoxModel12.addElement("2010");
        defaultComboBoxModel12.addElement("2011");
        defaultComboBoxModel12.addElement("2012");
        defaultComboBoxModel12.addElement("2013");
        defaultComboBoxModel12.addElement("2014");
        defaultComboBoxModel12.addElement("2015");
        defaultComboBoxModel12.addElement("2016");
        defaultComboBoxModel12.addElement("2017");
        defaultComboBoxModel12.addElement("2018");
        EmployeeModifyBirthDateYear.setModel(defaultComboBoxModel12);
        EmployeeModifyBirthDateYear.setPreferredSize(new Dimension(82, 28));
        gbc = new GridBagConstraints();
        gbc.gridx = 3;
        gbc.gridy = 10;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.insets = new Insets(14, 15, 0, 0);
        PanelEmployeeUpdate.add(EmployeeModifyBirthDateYear, gbc);
        EmployeeModifyPassword = new JPasswordField();
        EmployeeModifyPassword.setPreferredSize(new Dimension(14, 30));
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 4;
        gbc.gridwidth = 3;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.insets = new Insets(14, 20, 0, 0);
        PanelEmployeeUpdate.add(EmployeeModifyPassword, gbc);
        final JLabel label26 = new JLabel();
        label26.setText("Qualification");
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 5;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.insets = new Insets(14, 0, 0, 0);
        PanelEmployeeUpdate.add(label26, gbc);
        final JLabel label27 = new JLabel();
        label27.setText("Phone");
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 7;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.insets = new Insets(14, 0, 0, 0);
        PanelEmployeeUpdate.add(label27, gbc);
        EmployeeModifyPhone = new JTextField();
        EmployeeModifyPhone.setPreferredSize(new Dimension(14, 30));
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 7;
        gbc.gridwidth = 3;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.insets = new Insets(14, 20, 14, 0);
        PanelEmployeeUpdate.add(EmployeeModifyPhone, gbc);
        final JLabel label28 = new JLabel();
        label28.setText("Address");
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 8;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.insets = new Insets(14, 0, 0, 0);
        PanelEmployeeUpdate.add(label28, gbc);
        EmployeeModifyDeleteBtn = new JButton();
        EmployeeModifyDeleteBtn.setBackground(new Color(-3140555));
        EmployeeModifyDeleteBtn.setBorderPainted(false);
        EmployeeModifyDeleteBtn.setEnabled(false);
        EmployeeModifyDeleteBtn.setFocusPainted(false);
        EmployeeModifyDeleteBtn.setFocusable(false);
        EmployeeModifyDeleteBtn.setForeground(new Color(-328966));
        EmployeeModifyDeleteBtn.setText("Delete");
        gbc = new GridBagConstraints();
        gbc.gridx = 2;
        gbc.gridy = 11;
        gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.EAST;
        gbc.ipadx = 15;
        gbc.insets = new Insets(30, 0, 0, 0);
        PanelEmployeeUpdate.add(EmployeeModifyDeleteBtn, gbc);
        final JLabel label29 = new JLabel();
        label29.setText("Username");
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.anchor = GridBagConstraints.NORTHWEST;
        gbc.insets = new Insets(0, 0, 40, 0);
        PanelEmployeeUpdate.add(label29, gbc);
        EmployeeModifyOldUsername = new JTextField();
        EmployeeModifyOldUsername.setPreferredSize(new Dimension(14, 30));
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 1;
        gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.NORTHWEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.insets = new Insets(0, 20, 0, 0);
        PanelEmployeeUpdate.add(EmployeeModifyOldUsername, gbc);
        EmployeeModifyRetrieveBtn = new JButton();
        EmployeeModifyRetrieveBtn.setBackground(new Color(-16758415));
        EmployeeModifyRetrieveBtn.setBorderPainted(false);
        EmployeeModifyRetrieveBtn.setFocusPainted(false);
        EmployeeModifyRetrieveBtn.setFocusable(false);
        EmployeeModifyRetrieveBtn.setForeground(new Color(-328966));
        EmployeeModifyRetrieveBtn.setPreferredSize(new Dimension(79, 30));
        EmployeeModifyRetrieveBtn.setText("Retreive");
        gbc = new GridBagConstraints();
        gbc.gridx = 3;
        gbc.gridy = 1;
        gbc.anchor = GridBagConstraints.NORTH;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        PanelEmployeeUpdate.add(EmployeeModifyRetrieveBtn, gbc);
        EmployeeModifyUpdateBtn = new JButton();
        EmployeeModifyUpdateBtn.setBackground(new Color(-11551010));
        EmployeeModifyUpdateBtn.setBorderPainted(false);
        EmployeeModifyUpdateBtn.setEnabled(false);
        EmployeeModifyUpdateBtn.setFocusPainted(false);
        EmployeeModifyUpdateBtn.setFocusable(false);
        EmployeeModifyUpdateBtn.setForeground(new Color(-328966));
        EmployeeModifyUpdateBtn.setText("Update");
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 11;
        gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.ipadx = 15;
        gbc.insets = new Insets(30, 0, 0, 0);
        PanelEmployeeUpdate.add(EmployeeModifyUpdateBtn, gbc);
        final JScrollPane scrollPane3 = new JScrollPane();
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 8;
        gbc.gridwidth = 3;
        gbc.fill = GridBagConstraints.BOTH;
        gbc.insets = new Insets(0, 20, 0, 0);
        PanelEmployeeUpdate.add(scrollPane3, gbc);
        EmployeeModifyAddress = new JTextArea();
        EmployeeModifyAddress.setRows(3);
        scrollPane3.setViewportView(EmployeeModifyAddress);
        EmployeeModifyQualification.setBackground(new Color(-1));
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 5;
        gbc.gridwidth = 3;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.insets = new Insets(14, 20, 0, 0);
        PanelEmployeeUpdate.add(EmployeeModifyQualification, gbc);
        PanelEmployeeList = new JPanel();
        PanelEmployeeList.setLayout(new GridBagLayout());
        CardEmployeeContainer.add(PanelEmployeeList, "Card3");
        final JLabel label30 = new JLabel();
        Font label30Font = this.$$$getFont$$$("Lato", Font.BOLD, 24, label30.getFont());
        if (label30Font != null) label30.setFont(label30Font);
        label30.setText("List Employees");
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.insets = new Insets(0, 0, 20, 0);
        PanelEmployeeList.add(label30, gbc);
        final JScrollPane scrollPane4 = new JScrollPane();
        scrollPane4.setHorizontalScrollBarPolicy(30);
        scrollPane4.setMaximumSize(new Dimension(300, 400));
        scrollPane4.setVerticalScrollBarPolicy(20);
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.gridwidth = 2;
        gbc.fill = GridBagConstraints.BOTH;
        gbc.ipadx = 20;
        PanelEmployeeList.add(scrollPane4, gbc);
        EmployeeListAll.setEditingColumn(0);
        EmployeeListAll.setEditingRow(0);
        EmployeeListAll.setIntercellSpacing(new Dimension(0, 1));
        EmployeeListAll.setRowHeight(30);
        EmployeeListAll.setRowMargin(1);
        scrollPane4.setViewportView(EmployeeListAll);
        EmployeeListRetrieve = new JButton();
        EmployeeListRetrieve.setBackground(new Color(-16758415));
        EmployeeListRetrieve.setForeground(new Color(-328966));
        EmployeeListRetrieve.setText("Refresh");
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.EAST;
        gbc.insets = new Insets(0, 0, 20, 0);
        PanelEmployeeList.add(EmployeeListRetrieve, gbc);
        PanelEmployeeSearch = new JPanel();
        PanelEmployeeSearch.setLayout(new GridBagLayout());
        CardEmployeeContainer.add(PanelEmployeeSearch, "Card4");
        final JLabel label31 = new JLabel();
        label31.setText("Username");
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.anchor = GridBagConstraints.WEST;
        PanelEmployeeSearch.add(label31, gbc);
        EmployeeSearchOldUsername = new JTextField();
        EmployeeSearchOldUsername.setColumns(20);
        EmployeeSearchOldUsername.setPreferredSize(new Dimension(274, 30));
        EmployeeSearchOldUsername.setText("");
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 1;
        gbc.anchor = GridBagConstraints.NORTHWEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.insets = new Insets(0, 20, 0, 0);
        PanelEmployeeSearch.add(EmployeeSearchOldUsername, gbc);
        EmployeeSearchSubmitBtn = new JButton();
        EmployeeSearchSubmitBtn.setBackground(new Color(-11551010));
        EmployeeSearchSubmitBtn.setFocusTraversalPolicyProvider(false);
        EmployeeSearchSubmitBtn.setForeground(new Color(-328966));
        EmployeeSearchSubmitBtn.setText("Search");
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.gridwidth = 2;
        gbc.ipadx = 15;
        gbc.insets = new Insets(30, 0, 0, 0);
        PanelEmployeeSearch.add(EmployeeSearchSubmitBtn, gbc);
        final JLabel label32 = new JLabel();
        Font label32Font = this.$$$getFont$$$("Lato", Font.BOLD, 24, label32.getFont());
        if (label32Font != null) label32.setFont(label32Font);
        label32.setText("Search for Employee");
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 2;
        gbc.insets = new Insets(0, 0, 20, 0);
        PanelEmployeeSearch.add(label32, gbc);
        VehicleMainPanel = new JPanel();
        VehicleMainPanel.setLayout(new BorderLayout(0, 0));
        CardMainCenterPanelHolder.add(VehicleMainPanel, "Card3");
        vehicleMainHeader = new JPanel();
        vehicleMainHeader.setLayout(new GridBagLayout());
        vehicleMainHeader.setBackground(new Color(-11551010));
        VehicleMainPanel.add(vehicleMainHeader, BorderLayout.NORTH);
        updateVehicleBtn = new JButton();
        updateVehicleBtn.setBackground(new Color(-16758415));
        updateVehicleBtn.setBorderPainted(false);
        updateVehicleBtn.setFocusPainted(false);
        updateVehicleBtn.setFocusable(false);
        updateVehicleBtn.setForeground(new Color(-328966));
        updateVehicleBtn.setPreferredSize(new Dimension(120, 65));
        updateVehicleBtn.setText("Modify Vehicle");
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.EAST;
        gbc.insets = new Insets(0, 2, 0, 0);
        vehicleMainHeader.add(updateVehicleBtn, gbc);
        searchVehicleBtn = new JButton();
        searchVehicleBtn.setActionCommand("Search Car Brand");
        searchVehicleBtn.setBackground(new Color(-16758415));
        searchVehicleBtn.setBorderPainted(false);
        searchVehicleBtn.setFocusPainted(false);
        searchVehicleBtn.setFocusable(false);
        searchVehicleBtn.setForeground(new Color(-328966));
        searchVehicleBtn.setPreferredSize(new Dimension(120, 65));
        searchVehicleBtn.setText("Search Vehicle");
        gbc = new GridBagConstraints();
        gbc.gridx = 2;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.EAST;
        gbc.insets = new Insets(0, 2, 0, 0);
        vehicleMainHeader.add(searchVehicleBtn, gbc);
        ListAllVehicleBtn = new JButton();
        ListAllVehicleBtn.setBackground(new Color(-16758415));
        ListAllVehicleBtn.setBorderPainted(false);
        ListAllVehicleBtn.setFocusPainted(false);
        ListAllVehicleBtn.setFocusable(false);
        ListAllVehicleBtn.setForeground(new Color(-328966));
        ListAllVehicleBtn.setPreferredSize(new Dimension(120, 65));
        ListAllVehicleBtn.setText("List All Vehicles");
        gbc = new GridBagConstraints();
        gbc.gridx = 3;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.EAST;
        gbc.insets = new Insets(0, 2, 0, 0);
        vehicleMainHeader.add(ListAllVehicleBtn, gbc);
        addVehicleBtn = new JButton();
        addVehicleBtn.setBackground(new Color(-16758415));
        addVehicleBtn.setBorderPainted(false);
        addVehicleBtn.setFocusPainted(false);
        addVehicleBtn.setFocusable(false);
        addVehicleBtn.setForeground(new Color(-328966));
        addVehicleBtn.setPreferredSize(new Dimension(120, 65));
        addVehicleBtn.setText("Add Vehicle");
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.weightx = 0.5;
        gbc.anchor = GridBagConstraints.EAST;
        gbc.insets = new Insets(0, 2, 0, 0);
        vehicleMainHeader.add(addVehicleBtn, gbc);
        CardVehiclesContainer = new JPanel();
        CardVehiclesContainer.setLayout(new CardLayout(0, 0));
        VehicleMainPanel.add(CardVehiclesContainer, BorderLayout.CENTER);
        PanelVehicleAdd = new JPanel();
        PanelVehicleAdd.setLayout(new GridBagLayout());
        CardVehiclesContainer.add(PanelVehicleAdd, "Card1");
        final JLabel label33 = new JLabel();
        Font label33Font = this.$$$getFont$$$(null, -1, -1, label33.getFont());
        if (label33Font != null) label33.setFont(label33Font);
        label33.setForeground(new Color(-14207416));
        label33.setPreferredSize(new Dimension(90, 30));
        label33.setText("Car Model");
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.insets = new Insets(7, 0, 0, 0);
        PanelVehicleAdd.add(label33, gbc);
        final JLabel label34 = new JLabel();
        Font label34Font = this.$$$getFont$$$(null, -1, -1, label34.getFont());
        if (label34Font != null) label34.setFont(label34Font);
        label34.setForeground(new Color(-14207416));
        label34.setPreferredSize(new Dimension(160, 30));
        label34.setText("Company Brand");
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.insets = new Insets(7, 0, 0, 0);
        PanelVehicleAdd.add(label34, gbc);
        final JLabel label35 = new JLabel();
        Font label35Font = this.$$$getFont$$$(null, -1, -1, label35.getFont());
        if (label35Font != null) label35.setFont(label35Font);
        label35.setForeground(new Color(-14207416));
        label35.setPreferredSize(new Dimension(160, 30));
        label35.setText("Car Number");
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.insets = new Insets(7, 0, 0, 0);
        PanelVehicleAdd.add(label35, gbc);
        final JLabel label36 = new JLabel();
        Font label36Font = this.$$$getFont$$$(null, -1, -1, label36.getFont());
        if (label36Font != null) label36.setFont(label36Font);
        label36.setForeground(new Color(-14207416));
        label36.setPreferredSize(new Dimension(160, 30));
        label36.setText("Make Year");
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 4;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.insets = new Insets(7, 0, 0, 0);
        PanelVehicleAdd.add(label36, gbc);
        final JLabel label37 = new JLabel();
        Font label37Font = this.$$$getFont$$$(null, -1, -1, label37.getFont());
        if (label37Font != null) label37.setFont(label37Font);
        label37.setForeground(new Color(-14207416));
        label37.setPreferredSize(new Dimension(120, 30));
        label37.setText("Use As");
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 5;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.insets = new Insets(7, 0, 0, 0);
        PanelVehicleAdd.add(label37, gbc);
        final JLabel label38 = new JLabel();
        Font label38Font = this.$$$getFont$$$(null, -1, -1, label38.getFont());
        if (label38Font != null) label38.setFont(label38Font);
        label38.setForeground(new Color(-14207416));
        label38.setPreferredSize(new Dimension(120, 35));
        label38.setText("Type");
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 8;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.insets = new Insets(7, 0, 0, 0);
        PanelVehicleAdd.add(label38, gbc);
        final JLabel label39 = new JLabel();
        Font label39Font = this.$$$getFont$$$(null, -1, -1, label39.getFont());
        if (label39Font != null) label39.setFont(label39Font);
        label39.setForeground(new Color(-14207416));
        label39.setPreferredSize(new Dimension(120, 30));
        label39.setText("Variant");
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 9;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.insets = new Insets(7, 0, 0, 0);
        PanelVehicleAdd.add(label39, gbc);
        final JLabel label40 = new JLabel();
        Font label40Font = this.$$$getFont$$$(null, -1, -1, label40.getFont());
        if (label40Font != null) label40.setFont(label40Font);
        label40.setForeground(new Color(-14207416));
        label40.setPreferredSize(new Dimension(120, 30));
        label40.setText("Rent Value");
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 10;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.insets = new Insets(7, 0, 0, 0);
        PanelVehicleAdd.add(label40, gbc);
        VehicleAddMakeYear = new JComboBox();
        VehicleAddMakeYear.setBackground(new Color(-1));
        VehicleAddMakeYear.setFocusable(false);
        Font VehicleAddMakeYearFont = this.$$$getFont$$$(null, -1, -1, VehicleAddMakeYear.getFont());
        if (VehicleAddMakeYearFont != null) VehicleAddMakeYear.setFont(VehicleAddMakeYearFont);
        final DefaultComboBoxModel defaultComboBoxModel13 = new DefaultComboBoxModel();
        defaultComboBoxModel13.addElement("2017");
        defaultComboBoxModel13.addElement("2016");
        defaultComboBoxModel13.addElement("2015");
        defaultComboBoxModel13.addElement("2014");
        defaultComboBoxModel13.addElement("2013");
        defaultComboBoxModel13.addElement("2012");
        defaultComboBoxModel13.addElement("2011");
        defaultComboBoxModel13.addElement("2010");
        defaultComboBoxModel13.addElement("2009");
        defaultComboBoxModel13.addElement("2008");
        defaultComboBoxModel13.addElement("2007");
        defaultComboBoxModel13.addElement("2006");
        defaultComboBoxModel13.addElement("2005");
        defaultComboBoxModel13.addElement("2004");
        defaultComboBoxModel13.addElement("2003");
        defaultComboBoxModel13.addElement("2002");
        defaultComboBoxModel13.addElement("2001");
        defaultComboBoxModel13.addElement("2000");
        defaultComboBoxModel13.addElement("1999");
        defaultComboBoxModel13.addElement("1998");
        defaultComboBoxModel13.addElement("1997");
        defaultComboBoxModel13.addElement("1996");
        defaultComboBoxModel13.addElement("1995");
        defaultComboBoxModel13.addElement("1994");
        defaultComboBoxModel13.addElement("1993");
        defaultComboBoxModel13.addElement("1992");
        defaultComboBoxModel13.addElement("1991");
        defaultComboBoxModel13.addElement("1990");
        defaultComboBoxModel13.addElement("1989");
        defaultComboBoxModel13.addElement("1988");
        defaultComboBoxModel13.addElement("1987");
        defaultComboBoxModel13.addElement("1986");
        defaultComboBoxModel13.addElement("1985");
        defaultComboBoxModel13.addElement("1984");
        defaultComboBoxModel13.addElement("1983");
        defaultComboBoxModel13.addElement("1982");
        defaultComboBoxModel13.addElement("1981");
        defaultComboBoxModel13.addElement("1980");
        defaultComboBoxModel13.addElement("1979");
        defaultComboBoxModel13.addElement("1978");
        defaultComboBoxModel13.addElement("1977");
        defaultComboBoxModel13.addElement("1976");
        defaultComboBoxModel13.addElement("1975");
        defaultComboBoxModel13.addElement("1974");
        defaultComboBoxModel13.addElement("1973");
        defaultComboBoxModel13.addElement("1972");
        defaultComboBoxModel13.addElement("1971");
        defaultComboBoxModel13.addElement("1970");
        defaultComboBoxModel13.addElement("1969");
        defaultComboBoxModel13.addElement("1968");
        defaultComboBoxModel13.addElement("1967");
        defaultComboBoxModel13.addElement("1966");
        defaultComboBoxModel13.addElement("1965");
        defaultComboBoxModel13.addElement("1964");
        defaultComboBoxModel13.addElement("1963");
        defaultComboBoxModel13.addElement("1962");
        defaultComboBoxModel13.addElement("1961");
        defaultComboBoxModel13.addElement("1960");
        defaultComboBoxModel13.addElement("1959");
        defaultComboBoxModel13.addElement("1958");
        defaultComboBoxModel13.addElement("1957");
        defaultComboBoxModel13.addElement("1956");
        defaultComboBoxModel13.addElement("1955");
        defaultComboBoxModel13.addElement("1954");
        defaultComboBoxModel13.addElement("1953");
        defaultComboBoxModel13.addElement("1952");
        defaultComboBoxModel13.addElement("1951");
        defaultComboBoxModel13.addElement("1950");
        defaultComboBoxModel13.addElement("1949");
        defaultComboBoxModel13.addElement("1948");
        defaultComboBoxModel13.addElement("1947");
        defaultComboBoxModel13.addElement("1946");
        defaultComboBoxModel13.addElement("1945");
        defaultComboBoxModel13.addElement("1944");
        defaultComboBoxModel13.addElement("1943");
        defaultComboBoxModel13.addElement("1942");
        defaultComboBoxModel13.addElement("1941");
        defaultComboBoxModel13.addElement("1940");
        defaultComboBoxModel13.addElement("1939");
        defaultComboBoxModel13.addElement("1938");
        defaultComboBoxModel13.addElement("1937");
        defaultComboBoxModel13.addElement("1936");
        defaultComboBoxModel13.addElement("1935");
        defaultComboBoxModel13.addElement("1934");
        defaultComboBoxModel13.addElement("1933");
        defaultComboBoxModel13.addElement("1932");
        defaultComboBoxModel13.addElement("1931");
        defaultComboBoxModel13.addElement("1930");
        defaultComboBoxModel13.addElement("1929");
        defaultComboBoxModel13.addElement("1928");
        defaultComboBoxModel13.addElement("1927");
        defaultComboBoxModel13.addElement("1926");
        defaultComboBoxModel13.addElement("1925");
        defaultComboBoxModel13.addElement("1924");
        defaultComboBoxModel13.addElement("1923");
        defaultComboBoxModel13.addElement("1922");
        VehicleAddMakeYear.setModel(defaultComboBoxModel13);
        VehicleAddMakeYear.setPopupVisible(false);
        VehicleAddMakeYear.setPreferredSize(new Dimension(170, 26));
        gbc = new GridBagConstraints();
        gbc.gridx = 2;
        gbc.gridy = 4;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.insets = new Insets(7, 10, 5, 0);
        PanelVehicleAdd.add(VehicleAddMakeYear, gbc);
        VehicleAddRentValue = new JTextField();
        VehicleAddRentValue.setBackground(new Color(-1));
        VehicleAddRentValue.setCaretColor(new Color(-14207416));
        VehicleAddRentValue.setMaximumSize(new Dimension(160, 2147483647));
        VehicleAddRentValue.setPreferredSize(new Dimension(140, 30));
        gbc = new GridBagConstraints();
        gbc.gridx = 2;
        gbc.gridy = 10;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.insets = new Insets(7, 10, 0, 0);
        PanelVehicleAdd.add(VehicleAddRentValue, gbc);
        VehicleAddCarNumber = new JTextField();
        VehicleAddCarNumber.setBackground(new Color(-1));
        VehicleAddCarNumber.setCaretColor(new Color(-14207416));
        VehicleAddCarNumber.setMaximumSize(new Dimension(160, 2147483647));
        VehicleAddCarNumber.setPreferredSize(new Dimension(140, 30));
        gbc = new GridBagConstraints();
        gbc.gridx = 2;
        gbc.gridy = 3;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.insets = new Insets(7, 10, 0, 0);
        PanelVehicleAdd.add(VehicleAddCarNumber, gbc);
        VehicleAddSubmitBtn = new JButton();
        VehicleAddSubmitBtn.setBackground(new Color(-11551010));
        VehicleAddSubmitBtn.setBorderPainted(false);
        VehicleAddSubmitBtn.setFocusPainted(false);
        VehicleAddSubmitBtn.setFocusable(false);
        VehicleAddSubmitBtn.setForeground(new Color(-328966));
        VehicleAddSubmitBtn.setText("Add Vehicle");
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 11;
        gbc.gridwidth = 3;
        gbc.ipadx = 10;
        gbc.insets = new Insets(20, 0, 0, 0);
        PanelVehicleAdd.add(VehicleAddSubmitBtn, gbc);
        VehicleAddCarModel = new JTextField();
        VehicleAddCarModel.setBackground(new Color(-1));
        VehicleAddCarModel.setCaretColor(new Color(-14207416));
        VehicleAddCarModel.setMaximumSize(new Dimension(160, 2147483647));
        VehicleAddCarModel.setPreferredSize(new Dimension(140, 30));
        gbc = new GridBagConstraints();
        gbc.gridx = 2;
        gbc.gridy = 1;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.insets = new Insets(7, 10, 0, 0);
        PanelVehicleAdd.add(VehicleAddCarModel, gbc);
        final JLabel label41 = new JLabel();
        Font label41Font = this.$$$getFont$$$("Lato", Font.BOLD, 24, label41.getFont());
        if (label41Font != null) label41.setFont(label41Font);
        label41.setText("Add New Vehicle");
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 3;
        gbc.insets = new Insets(0, 0, 20, 0);
        PanelVehicleAdd.add(label41, gbc);
        final JLabel label42 = new JLabel();
        Font label42Font = this.$$$getFont$$$(null, -1, -1, label42.getFont());
        if (label42Font != null) label42.setFont(label42Font);
        label42.setForeground(new Color(-14207416));
        label42.setPreferredSize(new Dimension(120, 30));
        label42.setText("Engine Capacity");
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 7;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.insets = new Insets(7, 0, 0, 0);
        PanelVehicleAdd.add(label42, gbc);
        VehicleAddEngineCapacity = new JTextField();
        VehicleAddEngineCapacity.setBackground(new Color(-1));
        VehicleAddEngineCapacity.setCaretColor(new Color(-14207416));
        VehicleAddEngineCapacity.setMaximumSize(new Dimension(160, 2147483647));
        VehicleAddEngineCapacity.setPreferredSize(new Dimension(140, 30));
        gbc = new GridBagConstraints();
        gbc.gridx = 2;
        gbc.gridy = 7;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.insets = new Insets(7, 10, 0, 0);
        PanelVehicleAdd.add(VehicleAddEngineCapacity, gbc);
        final JLabel label43 = new JLabel();
        Font label43Font = this.$$$getFont$$$(null, -1, -1, label43.getFont());
        if (label43Font != null) label43.setFont(label43Font);
        label43.setForeground(new Color(-14207416));
        label43.setPreferredSize(new Dimension(120, 30));
        label43.setText("Sitting Capacity");
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 6;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.insets = new Insets(7, 0, 0, 0);
        PanelVehicleAdd.add(label43, gbc);
        VehicleAddSitCapacity = new JTextField();
        VehicleAddSitCapacity.setBackground(new Color(-1));
        VehicleAddSitCapacity.setCaretColor(new Color(-14207416));
        VehicleAddSitCapacity.setMaximumSize(new Dimension(160, 2147483647));
        VehicleAddSitCapacity.setPreferredSize(new Dimension(140, 30));
        gbc = new GridBagConstraints();
        gbc.gridx = 2;
        gbc.gridy = 6;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.insets = new Insets(7, 10, 0, 0);
        PanelVehicleAdd.add(VehicleAddSitCapacity, gbc);
        VehicleAddCompanyBrand.setBackground(new Color(-1));
        VehicleAddCompanyBrand.setEditable(false);
        gbc = new GridBagConstraints();
        gbc.gridx = 2;
        gbc.gridy = 2;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.insets = new Insets(7, 10, 0, 0);
        PanelVehicleAdd.add(VehicleAddCompanyBrand, gbc);
        VehicleAddCarUsage.setBackground(new Color(-1));
        gbc = new GridBagConstraints();
        gbc.gridx = 2;
        gbc.gridy = 5;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.insets = new Insets(7, 10, 5, 0);
        PanelVehicleAdd.add(VehicleAddCarUsage, gbc);
        VehicleAddCarType.setBackground(new Color(-1));
        gbc = new GridBagConstraints();
        gbc.gridx = 2;
        gbc.gridy = 8;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.insets = new Insets(7, 10, 5, 0);
        PanelVehicleAdd.add(VehicleAddCarType, gbc);
        VehicleAddCarVariant.setBackground(new Color(-1));
        gbc = new GridBagConstraints();
        gbc.gridx = 2;
        gbc.gridy = 9;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.insets = new Insets(7, 10, 5, 0);
        PanelVehicleAdd.add(VehicleAddCarVariant, gbc);
        PanelVehicleUpdate = new JPanel();
        PanelVehicleUpdate.setLayout(new GridBagLayout());
        CardVehiclesContainer.add(PanelVehicleUpdate, "Card2");
        final JPanel spacer1 = new JPanel();
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.fill = GridBagConstraints.VERTICAL;
        PanelVehicleUpdate.add(spacer1, gbc);
        final JLabel label44 = new JLabel();
        Font label44Font = this.$$$getFont$$$(null, -1, -1, label44.getFont());
        if (label44Font != null) label44.setFont(label44Font);
        label44.setForeground(new Color(-14207416));
        label44.setPreferredSize(new Dimension(90, 30));
        label44.setText("Car Model");
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 4;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.insets = new Insets(7, 0, 0, 0);
        PanelVehicleUpdate.add(label44, gbc);
        final JLabel label45 = new JLabel();
        Font label45Font = this.$$$getFont$$$(null, -1, -1, label45.getFont());
        if (label45Font != null) label45.setFont(label45Font);
        label45.setForeground(new Color(-14207416));
        label45.setPreferredSize(new Dimension(160, 30));
        label45.setText("Company Brand");
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 5;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.insets = new Insets(7, 0, 0, 0);
        PanelVehicleUpdate.add(label45, gbc);
        final JLabel label46 = new JLabel();
        Font label46Font = this.$$$getFont$$$(null, -1, -1, label46.getFont());
        if (label46Font != null) label46.setFont(label46Font);
        label46.setForeground(new Color(-14207416));
        label46.setPreferredSize(new Dimension(160, 30));
        label46.setText("Car Number");
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 6;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.insets = new Insets(7, 0, 0, 0);
        PanelVehicleUpdate.add(label46, gbc);
        final JLabel label47 = new JLabel();
        Font label47Font = this.$$$getFont$$$(null, -1, -1, label47.getFont());
        if (label47Font != null) label47.setFont(label47Font);
        label47.setForeground(new Color(-14207416));
        label47.setPreferredSize(new Dimension(160, 30));
        label47.setText("Make Year");
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 7;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.insets = new Insets(7, 0, 0, 0);
        PanelVehicleUpdate.add(label47, gbc);
        final JLabel label48 = new JLabel();
        Font label48Font = this.$$$getFont$$$(null, -1, -1, label48.getFont());
        if (label48Font != null) label48.setFont(label48Font);
        label48.setForeground(new Color(-14207416));
        label48.setPreferredSize(new Dimension(120, 30));
        label48.setText("Use As");
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 8;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.insets = new Insets(7, 0, 0, 0);
        PanelVehicleUpdate.add(label48, gbc);
        final JLabel label49 = new JLabel();
        Font label49Font = this.$$$getFont$$$(null, -1, -1, label49.getFont());
        if (label49Font != null) label49.setFont(label49Font);
        label49.setForeground(new Color(-14207416));
        label49.setPreferredSize(new Dimension(120, 35));
        label49.setText("Type");
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 11;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.insets = new Insets(7, 0, 0, 0);
        PanelVehicleUpdate.add(label49, gbc);
        final JLabel label50 = new JLabel();
        Font label50Font = this.$$$getFont$$$(null, -1, -1, label50.getFont());
        if (label50Font != null) label50.setFont(label50Font);
        label50.setForeground(new Color(-14207416));
        label50.setPreferredSize(new Dimension(120, 30));
        label50.setText("Variant");
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 12;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.insets = new Insets(7, 0, 0, 0);
        PanelVehicleUpdate.add(label50, gbc);
        final JLabel label51 = new JLabel();
        Font label51Font = this.$$$getFont$$$(null, -1, -1, label51.getFont());
        if (label51Font != null) label51.setFont(label51Font);
        label51.setForeground(new Color(-14207416));
        label51.setPreferredSize(new Dimension(120, 30));
        label51.setText("Rent Value");
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 13;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.insets = new Insets(7, 0, 0, 0);
        PanelVehicleUpdate.add(label51, gbc);
        VehicleModifyRentValue = new JTextField();
        VehicleModifyRentValue.setBackground(new Color(-1));
        VehicleModifyRentValue.setCaretColor(new Color(-14207416));
        VehicleModifyRentValue.setMaximumSize(new Dimension(160, 2147483647));
        VehicleModifyRentValue.setPreferredSize(new Dimension(140, 30));
        gbc = new GridBagConstraints();
        gbc.gridx = 3;
        gbc.gridy = 13;
        gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.insets = new Insets(7, 10, 0, 0);
        PanelVehicleUpdate.add(VehicleModifyRentValue, gbc);
        VehicleModifyCarNumber = new JTextField();
        VehicleModifyCarNumber.setBackground(new Color(-1));
        VehicleModifyCarNumber.setCaretColor(new Color(-14207416));
        VehicleModifyCarNumber.setMaximumSize(new Dimension(160, 2147483647));
        VehicleModifyCarNumber.setPreferredSize(new Dimension(140, 30));
        gbc = new GridBagConstraints();
        gbc.gridx = 3;
        gbc.gridy = 6;
        gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.insets = new Insets(7, 10, 0, 0);
        PanelVehicleUpdate.add(VehicleModifyCarNumber, gbc);
        VehicleModifyCarModel = new JTextField();
        VehicleModifyCarModel.setBackground(new Color(-1));
        VehicleModifyCarModel.setCaretColor(new Color(-14207416));
        VehicleModifyCarModel.setMaximumSize(new Dimension(160, 2147483647));
        VehicleModifyCarModel.setPreferredSize(new Dimension(140, 30));
        gbc = new GridBagConstraints();
        gbc.gridx = 3;
        gbc.gridy = 4;
        gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.insets = new Insets(7, 10, 0, 0);
        PanelVehicleUpdate.add(VehicleModifyCarModel, gbc);
        final JLabel label52 = new JLabel();
        Font label52Font = this.$$$getFont$$$("Lato", Font.BOLD, 24, label52.getFont());
        if (label52Font != null) label52.setFont(label52Font);
        label52.setText("Modifying Vehicle");
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 1;
        gbc.gridwidth = 4;
        gbc.gridheight = 2;
        gbc.insets = new Insets(0, 0, 20, 0);
        PanelVehicleUpdate.add(label52, gbc);
        final JLabel label53 = new JLabel();
        Font label53Font = this.$$$getFont$$$(null, -1, -1, label53.getFont());
        if (label53Font != null) label53.setFont(label53Font);
        label53.setForeground(new Color(-14207416));
        label53.setPreferredSize(new Dimension(120, 30));
        label53.setText("Engine Capacity");
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 10;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.insets = new Insets(7, 0, 0, 0);
        PanelVehicleUpdate.add(label53, gbc);
        VehicleModifyEngineCapacity = new JTextField();
        VehicleModifyEngineCapacity.setBackground(new Color(-1));
        VehicleModifyEngineCapacity.setCaretColor(new Color(-14207416));
        VehicleModifyEngineCapacity.setMaximumSize(new Dimension(160, 2147483647));
        VehicleModifyEngineCapacity.setPreferredSize(new Dimension(140, 30));
        gbc = new GridBagConstraints();
        gbc.gridx = 3;
        gbc.gridy = 10;
        gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.insets = new Insets(7, 10, 0, 0);
        PanelVehicleUpdate.add(VehicleModifyEngineCapacity, gbc);
        final JLabel label54 = new JLabel();
        Font label54Font = this.$$$getFont$$$(null, -1, -1, label54.getFont());
        if (label54Font != null) label54.setFont(label54Font);
        label54.setForeground(new Color(-14207416));
        label54.setPreferredSize(new Dimension(120, 30));
        label54.setText("Sitting Capacity");
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 9;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.insets = new Insets(7, 0, 0, 0);
        PanelVehicleUpdate.add(label54, gbc);
        VehicleModifySitCapacity = new JTextField();
        VehicleModifySitCapacity.setBackground(new Color(-1));
        VehicleModifySitCapacity.setCaretColor(new Color(-14207416));
        VehicleModifySitCapacity.setMaximumSize(new Dimension(160, 2147483647));
        VehicleModifySitCapacity.setPreferredSize(new Dimension(140, 30));
        gbc = new GridBagConstraints();
        gbc.gridx = 3;
        gbc.gridy = 9;
        gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.insets = new Insets(7, 10, 0, 0);
        PanelVehicleUpdate.add(VehicleModifySitCapacity, gbc);
        final JLabel label55 = new JLabel();
        label55.setText("Car Number");
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 3;
        gbc.anchor = GridBagConstraints.NORTHWEST;
        gbc.insets = new Insets(0, 0, 60, 0);
        PanelVehicleUpdate.add(label55, gbc);
        VehicleModifyOldCarNumber = new JTextField();
        VehicleModifyOldCarNumber.setPreferredSize(new Dimension(140, 30));
        gbc = new GridBagConstraints();
        gbc.gridx = 3;
        gbc.gridy = 3;
        gbc.anchor = GridBagConstraints.NORTH;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.insets = new Insets(0, 10, 0, 0);
        PanelVehicleUpdate.add(VehicleModifyOldCarNumber, gbc);
        VehicleModifyRetrieveBtn = new JButton();
        VehicleModifyRetrieveBtn.setBackground(new Color(-16758415));
        VehicleModifyRetrieveBtn.setForeground(new Color(-328966));
        VehicleModifyRetrieveBtn.setPreferredSize(new Dimension(95, 30));
        VehicleModifyRetrieveBtn.setText("Retrieve");
        gbc = new GridBagConstraints();
        gbc.gridx = 4;
        gbc.gridy = 3;
        gbc.anchor = GridBagConstraints.NORTHEAST;
        PanelVehicleUpdate.add(VehicleModifyRetrieveBtn, gbc);
        VehicleModifyDeleteBtn = new JButton();
        VehicleModifyDeleteBtn.setBackground(new Color(-3140555));
        VehicleModifyDeleteBtn.setBorderPainted(false);
        VehicleModifyDeleteBtn.setEnabled(false);
        VehicleModifyDeleteBtn.setFocusPainted(false);
        VehicleModifyDeleteBtn.setFocusable(false);
        VehicleModifyDeleteBtn.setForeground(new Color(-328966));
        VehicleModifyDeleteBtn.setMaximumSize(new Dimension(132, 40));
        VehicleModifyDeleteBtn.setText("Delete Vehicle");
        gbc = new GridBagConstraints();
        gbc.gridx = 3;
        gbc.gridy = 15;
        gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.EAST;
        gbc.ipadx = 10;
        gbc.insets = new Insets(20, 0, 0, 0);
        PanelVehicleUpdate.add(VehicleModifyDeleteBtn, gbc);
        VehicleModifyUpdateBtn = new JButton();
        VehicleModifyUpdateBtn.setBackground(new Color(-11551010));
        VehicleModifyUpdateBtn.setBorderPainted(false);
        VehicleModifyUpdateBtn.setEnabled(false);
        VehicleModifyUpdateBtn.setFocusPainted(false);
        VehicleModifyUpdateBtn.setFocusable(false);
        VehicleModifyUpdateBtn.setForeground(new Color(-328966));
        VehicleModifyUpdateBtn.setMaximumSize(new Dimension(132, 40));
        VehicleModifyUpdateBtn.setText("Update Vehicle");
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 15;
        gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.ipadx = 10;
        gbc.insets = new Insets(20, 0, 0, 0);
        PanelVehicleUpdate.add(VehicleModifyUpdateBtn, gbc);
        VehicleModifyIsRented = new JTextField();
        VehicleModifyIsRented.setBackground(new Color(-1));
        VehicleModifyIsRented.setCaretColor(new Color(-14207416));
        VehicleModifyIsRented.setMaximumSize(new Dimension(160, 2147483647));
        VehicleModifyIsRented.setPreferredSize(new Dimension(140, 30));
        VehicleModifyIsRented.setVisible(false);
        gbc = new GridBagConstraints();
        gbc.gridx = 3;
        gbc.gridy = 14;
        gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.insets = new Insets(7, 10, 0, 0);
        PanelVehicleUpdate.add(VehicleModifyIsRented, gbc);
        VehicleModifyCompanyBrand.setBackground(new Color(-1));
        gbc = new GridBagConstraints();
        gbc.gridx = 3;
        gbc.gridy = 5;
        gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.insets = new Insets(7, 10, 0, 0);
        PanelVehicleUpdate.add(VehicleModifyCompanyBrand, gbc);
        VehicleModifyMakeYear = new JComboBox();
        VehicleModifyMakeYear.setBackground(new Color(-1));
        final DefaultComboBoxModel defaultComboBoxModel14 = new DefaultComboBoxModel();
        defaultComboBoxModel14.addElement("1999");
        defaultComboBoxModel14.addElement("2000");
        defaultComboBoxModel14.addElement("2001");
        defaultComboBoxModel14.addElement("2002");
        defaultComboBoxModel14.addElement("2003");
        defaultComboBoxModel14.addElement("2004");
        defaultComboBoxModel14.addElement("2005");
        defaultComboBoxModel14.addElement("2006");
        defaultComboBoxModel14.addElement("2007");
        defaultComboBoxModel14.addElement("2008");
        defaultComboBoxModel14.addElement("2009");
        defaultComboBoxModel14.addElement("2010");
        defaultComboBoxModel14.addElement("2011");
        defaultComboBoxModel14.addElement("2012");
        defaultComboBoxModel14.addElement("2013");
        defaultComboBoxModel14.addElement("2014");
        defaultComboBoxModel14.addElement("2015");
        defaultComboBoxModel14.addElement("2016");
        defaultComboBoxModel14.addElement("2017");
        defaultComboBoxModel14.addElement("2018");
        VehicleModifyMakeYear.setModel(defaultComboBoxModel14);
        gbc = new GridBagConstraints();
        gbc.gridx = 3;
        gbc.gridy = 7;
        gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.insets = new Insets(7, 10, 0, 0);
        PanelVehicleUpdate.add(VehicleModifyMakeYear, gbc);
        VehicleModifyCarUsage.setBackground(new Color(-1));
        gbc = new GridBagConstraints();
        gbc.gridx = 3;
        gbc.gridy = 8;
        gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.insets = new Insets(7, 10, 0, 0);
        PanelVehicleUpdate.add(VehicleModifyCarUsage, gbc);
        VehicleModifyCarType.setBackground(new Color(-1));
        gbc = new GridBagConstraints();
        gbc.gridx = 3;
        gbc.gridy = 11;
        gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.insets = new Insets(7, 10, 0, 0);
        PanelVehicleUpdate.add(VehicleModifyCarType, gbc);
        VehicleModifyCarVariant.setBackground(new Color(-1));
        gbc = new GridBagConstraints();
        gbc.gridx = 3;
        gbc.gridy = 12;
        gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.insets = new Insets(7, 10, 0, 0);
        PanelVehicleUpdate.add(VehicleModifyCarVariant, gbc);
        PanelVehicleList = new JPanel();
        PanelVehicleList.setLayout(new GridBagLayout());
        CardVehiclesContainer.add(PanelVehicleList, "Card3");
        final JLabel label56 = new JLabel();
        Font label56Font = this.$$$getFont$$$("Lato", Font.BOLD, 24, label56.getFont());
        if (label56Font != null) label56.setFont(label56Font);
        label56.setText("List Vehicles");
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 27;
        gbc.insets = new Insets(0, 0, 20, 0);
        PanelVehicleList.add(label56, gbc);
        VehicleListSubmitBtn = new JButton();
        VehicleListSubmitBtn.setBackground(new Color(-11551010));
        VehicleListSubmitBtn.setForeground(new Color(-328966));
        VehicleListSubmitBtn.setHideActionText(false);
        VehicleListSubmitBtn.setText("List Vehicles");
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 3;
        gbc.gridwidth = 26;
        gbc.ipadx = 20;
        gbc.ipady = 5;
        gbc.insets = new Insets(14, 0, 14, 0);
        PanelVehicleList.add(VehicleListSubmitBtn, gbc);
        final JLabel label57 = new JLabel();
        label57.setText("Status");
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 2;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.insets = new Insets(14, 0, 0, 0);
        PanelVehicleList.add(label57, gbc);
        VehicleListStatusRented = new JRadioButton();
        VehicleListStatusRented.setSelected(true);
        VehicleListStatusRented.setText("Rented");
        gbc = new GridBagConstraints();
        gbc.gridx = 2;
        gbc.gridy = 2;
        gbc.gridwidth = 14;
        gbc.anchor = GridBagConstraints.EAST;
        gbc.insets = new Insets(14, 0, 0, 0);
        PanelVehicleList.add(VehicleListStatusRented, gbc);
        VehicleListStatusNotRented = new JRadioButton();
        VehicleListStatusNotRented.setText("Not Rented");
        gbc = new GridBagConstraints();
        gbc.gridx = 16;
        gbc.gridy = 2;
        gbc.gridwidth = 11;
        gbc.insets = new Insets(14, 0, 0, 0);
        PanelVehicleList.add(VehicleListStatusNotRented, gbc);
        VehicleListCompanyBrand.setBackground(new Color(-1));
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 1;
        gbc.gridwidth = 8;
        gbc.anchor = GridBagConstraints.SOUTHWEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        PanelVehicleList.add(VehicleListCompanyBrand, gbc);
        VehicleListCarUsage.setBackground(new Color(-1));
        gbc = new GridBagConstraints();
        gbc.gridx = 26;
        gbc.gridy = 1;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        PanelVehicleList.add(VehicleListCarUsage, gbc);
        final JScrollPane scrollPane5 = new JScrollPane();
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 4;
        gbc.gridwidth = 26;
        gbc.fill = GridBagConstraints.BOTH;
        PanelVehicleList.add(scrollPane5, gbc);
        scrollPane5.setViewportView(VehicleListAll);
        PanelVehicleSearch = new JPanel();
        PanelVehicleSearch.setLayout(new GridBagLayout());
        CardVehiclesContainer.add(PanelVehicleSearch, "Card4");
        final JLabel label58 = new JLabel();
        Font label58Font = this.$$$getFont$$$("Lato", Font.BOLD, 24, label58.getFont());
        if (label58Font != null) label58.setFont(label58Font);
        label58.setText("Search for a Vehicle");
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 2;
        gbc.insets = new Insets(0, 0, 20, 0);
        PanelVehicleSearch.add(label58, gbc);
        final JLabel label59 = new JLabel();
        label59.setText("Car Number");
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.ipady = 10;
        PanelVehicleSearch.add(label59, gbc);
        VehicleSearchCarNumber = new JTextField();
        VehicleSearchCarNumber.setPreferredSize(new Dimension(140, 26));
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 1;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.insets = new Insets(0, 20, 0, 0);
        PanelVehicleSearch.add(VehicleSearchCarNumber, gbc);
        VehicleSearchSubmitBtn = new JButton();
        VehicleSearchSubmitBtn.setBackground(new Color(-11551010));
        VehicleSearchSubmitBtn.setBorderPainted(false);
        VehicleSearchSubmitBtn.setFocusPainted(false);
        VehicleSearchSubmitBtn.setFocusable(false);
        VehicleSearchSubmitBtn.setForeground(new Color(-328966));
        VehicleSearchSubmitBtn.setText("Search");
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.NORTH;
        gbc.insets = new Insets(20, 0, 0, 0);
        PanelVehicleSearch.add(VehicleSearchSubmitBtn, gbc);
        DriverMainPanel = new JPanel();
        DriverMainPanel.setLayout(new GridBagLayout());
        CardMainCenterPanelHolder.add(DriverMainPanel, "Card4");
        final JPanel spacer2 = new JPanel();
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        DriverMainPanel.add(spacer2, gbc);
        final JPanel spacer3 = new JPanel();
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.fill = GridBagConstraints.VERTICAL;
        DriverMainPanel.add(spacer3, gbc);
        final JScrollPane scrollPane6 = new JScrollPane();
        gbc = new GridBagConstraints();
        gbc.gridx = 3;
        gbc.gridy = 3;
        gbc.fill = GridBagConstraints.BOTH;
        DriverMainPanel.add(scrollPane6, gbc);
        scrollPane6.setViewportView(ShowDriversList);
        searchDriversButton = new JButton();
        searchDriversButton.setBackground(new Color(-11551010));
        searchDriversButton.setPreferredSize(new Dimension(90, 40));
        searchDriversButton.setText("Refresh");
        gbc = new GridBagConstraints();
        gbc.gridx = 3;
        gbc.gridy = 2;
        gbc.anchor = GridBagConstraints.EAST;
        gbc.insets = new Insets(0, 0, 10, 0);
        DriverMainPanel.add(searchDriversButton, gbc);
        SearchDriver = new JLabel();
        Font SearchDriverFont = this.$$$getFont$$$("DejaVu Sans Mono", Font.BOLD, 24, SearchDriver.getFont());
        if (SearchDriverFont != null) SearchDriver.setFont(SearchDriverFont);
        SearchDriver.setText("View Drivers");
        gbc = new GridBagConstraints();
        gbc.gridx = 2;
        gbc.gridy = 2;
        gbc.anchor = GridBagConstraints.WEST;
        DriverMainPanel.add(SearchDriver, gbc);
        Footer = new JPanel();
        Footer.setLayout(new FlowLayout(FlowLayout.LEFT, 30, 20));
        Footer.setBackground(new Color(-7763575));
        MainAdminFramePanel.add(Footer, BorderLayout.SOUTH);
        final JLabel label60 = new JLabel();
        label60.setBackground(new Color(-328966));
        Font label60Font = this.$$$getFont$$$(null, Font.BOLD, -1, label60.getFont());
        if (label60Font != null) label60.setFont(label60Font);
        label60.setForeground(new Color(-328966));
        label60.setText("Vehicle Renting System");
        Footer.add(label60);
        ButtonGroup buttonGroup;
        buttonGroup = new ButtonGroup();
        buttonGroup.add(EmployeeModifyGenderFemale);
        buttonGroup.add(EmployeeModifyGenderMale);
        EmployeeAddGenderGp = new ButtonGroup();
        EmployeeAddGenderGp.add(EmployeeAddGenderMale);
        EmployeeAddGenderGp.add(EmployeeAddGenderFemale);
        buttonGroup = new ButtonGroup();
        buttonGroup.add(VehicleListStatusNotRented);
        buttonGroup.add(VehicleListStatusRented);
    }

    /**
     * @noinspection ALL
     */
    private Font $$$getFont$$$(String fontName, int style, int size, Font currentFont) {
        if (currentFont == null) return null;
        String resultName;
        if (fontName == null) {
            resultName = currentFont.getName();
        } else {
            Font testFont = new Font(fontName, Font.PLAIN, 10);
            if (testFont.canDisplay('a') && testFont.canDisplay('1')) {
                resultName = fontName;
            } else {
                resultName = currentFont.getName();
            }
        }
        return new Font(resultName, style >= 0 ? style : currentFont.getStyle(), size >= 0 ? size : currentFont.getSize());
    }

    /**
     * @noinspection ALL
     */
    public JComponent $$$getRootComponent$$$() {
        return MainAdminFramePanel;
    }
}

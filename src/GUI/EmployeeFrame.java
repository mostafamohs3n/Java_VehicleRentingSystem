package GUI;
import Code.*;
import Code.PDFGenerator;

import javax.imageio.ImageIO;
import javax.mail.MessagingException;
import javax.swing.*;
import javax.swing.event.ListDataListener;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedHashSet;

public class EmployeeFrame {
    private JPanel leftPanelMain;
    private JButton CustomerButton;
    private JButton vehiclesButton;
    private JButton DriverButton;
    private JPanel CardMainCenterPanelHolder;
    private JPanel DriverMainPanel;
    private JPanel DriverMainHeader;
    private JButton addDriverBtn;
    private JButton updateDriverBtn;
    private JButton listAllDriverBtn;
    private JPanel CardDriverContainer;
    private JPanel PanelDriverAdd;
    private JPanel InternalPanel;
    private JTextField DriverAddImagePath;
    private JTextField DriverAddCompany;
    private JTextField DriverAddSitCapacity;
    private JRadioButton DriverAddGenderMale;
    private JRadioButton DriverAddGenderFemale;
    private JComboBox DriverAddDateBirthDay;
    private JComboBox DriverAddDateBirthMonth;
    private JComboBox DriverAddDateBirthYear;
    private JPanel PanelDriverUpdate;
    private JPanel CustomerMainPanel;
    private JPanel CustomerMainHeader;
    private JButton addCustomerBtn;
    private JButton updateCustomerBtn;
    private JButton listCustomerBtn;
    private JPanel CardCustomerContainer;
    private JPanel PanelCustomerAdd;
    private JPanel PanelCustomerUpdate;
    private JPanel VehicleMainPanel;
    private JPanel vehicleMainHeader;
    private JButton addVehicleBtn;
    private JButton updateVehicleBtn;
    private JButton viewCarsBtn;
    private JPanel CardVehiclesContainer;
    private JPanel PanelVehicleViewCars;
    private JPanel PanelVehicleCustomer;
    private JPanel MainEmployeeFramePanel;
    private JButton DriverAddImageUpload;
    private JLabel DriverAddImageHolder;
    private JButton DriverUpdateRetrieveBtn;
    private JPanel PanelDriverList;
    private JTable DriverListAll;
    private JButton searchDriverBtn;
    private JPanel PanelDriverSearch;
    private JTable DriverSearchTable;
    private JTextField DriverSearchID;
    private JButton DriverSearchBtn;
    private JButton DriverUpdateImageUpload;
    private JLabel DriverUpdateImageHolder;
    private JTextField DriverUpdateImagePath;
    private JButton CustomerUpdateRetrieveBtn;
    private JPanel PanelCustomerList;
    private JTable CustomerListAll;
    private JPanel PanelCustomerSearch;
    private JTable CustomerSearchTable;
    private JButton searchCustomerBtn;
    private JButton customerVehicleBtn;
    private JTable VehicleListAll;
    private JTextField VehicleCustomerIDorUsername;
    private JButton VehicleCustomerRetrieveBtn;
    private JTable CustomerVehicleListAll;
    private JComboBox VehicleSearchCompanyBrand;
    private JRadioButton VehicleSearchStatusRented;
    private JComboBox VehicleSearchCarUsage;
    private JRadioButton VehicleSearchStatuUnRented;
    private JPanel Footer;
    private JTextField DriverAddID;
    private JTextField DriverAddName;
    private JTextArea DriverAddAddress;
    private JTextField DriverAddPhone;
    private JTextField DriverAddExperience;
    private JButton DriverAddSubmitAddBtn;
    private JComboBox DriverAddCompanyBrand;
    private JTextField DriverUpdateOldID;
    private JTextField DriverUpdateName;
    private JRadioButton DriverUpdateGenderMale;
    private JRadioButton DriverUpdateGenderFemale;
    private JTextArea DriverUpdateAddress;
    private JTextField DriverUpdatePhone;
    private JTextField DriverUpdateExperience;
    private JComboBox DriverUpdateBirthDay;
    private JComboBox DriverUpdateBirthMonth;
    private JComboBox DriverUpdateBirthYear;
    private JComboBox DriverUpdateCompanyBrand;
    private JTextField DriverUpdateSitCapacity;
    private JButton DriverUpdateSubmitUpdateBtn;
    private JButton DriverUpdateSubmitDeleteBtn;
    private JTextField DriverUpdateID;
    private JButton DriverListRefreshBtn;
    private JTextField CustomerAddID;
    private JTextField CustomerAddName;
    private JRadioButton CustomerAddGenderMale;
    private JTextArea CustomerAddAddress;
    private JComboBox CustomerAddBirthDay;
    private JComboBox CustomerAddBirthMonth;
    private JComboBox CustomerAddBirthYear;
    private JComboBox CustomerAddCarUsage;
    private JTextField CustomerAddRentingDaysNo;
    private JComboBox CustomerAddBookDay;
    private JComboBox CustomerAddBookMonth;
    private JComboBox CustomerAddBookYear;
    private JButton VehicleSearchRetrieveBtn;
    private JButton LogOutBtn;
    private JButton reportCarUsageBtn;
    private JButton reportCarStatusBtn;
    private JTextField RentCarTxtFieldCustomerId;
    private JTextField RentCarTxtFieldCustomerName;
    private JComboBox RentCarCompanyBrand;
    private JComboBox RentCarSittingCapacity;
    private JComboBox RentCarVehiclesAvailable;
    private JComboBox RentCarDriverAvailable;
    private JButton RentCarAddCustomerVehicleBtn;
    private JButton CustomerAddSubmitAddBtn;
    private JComboBox CustomerAddCompanyBrand;
    private JComboBox CustomerAddSittingCapacity;
    private JComboBox CustomerAddVehiclesAvailable;
    private JComboBox CustomerAddDriversAvailable;
    private JTextField CustomerAddPhone;
    private JComboBox CustomerUpdateCompanyBrand;
    private JTextField CustomerUpdateID;
    private JTextField CustomerUpdateName;
    private JRadioButton CustomerUpdateGenderMale;
    private JRadioButton CustomerUpdateGenderFemale;
    private JTextField CustomerUpdateEM;
    private JComboBox CustomerUpdateBirthDay;
    private JComboBox CustomerUpdateBirthMonth;
    private JComboBox CustomerUpdateBirthYear;
    private JComboBox CustomerUpdateCarUsage;
    private JTextField CustomerUpdateRentingDayNo;
    private JComboBox CustomerUpdateBookDay;
    private JComboBox CustomerUpdateBookMonth;
    private JComboBox CustomerUpdateBookYear;
    private JTextField CustomerUpdateTotalRent;
    private JButton CustomerUpdateSubmitUpdateBtn;
    private JButton CustomerUpdateSubmitDeleteBtn;
    private JTextField CustomerUpdatePhone;
    private JButton CustomerSearchBtn;
    private JTextField CustomerSearchID;
    private JButton CustomerListRefreshBtn;
    private JTextField CustomerUpdateOldID;
    private JTextField CustomerUpdateRetingDayNo;
    private JComboBox CustomerUpdateBrithDay;
    private JComboBox CustomerUpdateBrithMonth;
    private JTextField CustomerUpdateAddress;
    private JPanel MainPanelCustomerAdd;
    private JRadioButton CustomerAddGenderFamale;
    private JTextField CustomerAddEmail;
    private JPanel PanelCustomerVehicle;
    //private JComboBox CustomerSearchVehicleCompanyBrind;
    private JList CustomerCarsList;
    private JComboBox CustomerSearchVehicleSittingCapacity;
    private JComboBox CustomerSearchVehicleCompanyBrand;
    private JList CustomerSearchVehicleDriverList;
    private JList CustomerSearchVehicleVehicleList;
    private JTextField CustomerSearchVehicleTotalRent;
    private JButton sendEmailBtn;
    private JPanel PanelEmployeeEmail;
    private JTextField textFieldFrom;
    private JTextField textFieldTo;
    private JTextField textFieldSubject;
    private JTextArea textAreaCompose;
    private JButton Sendbutton;
    private JButton ResetButton;
    private JPanel PanelEmployeeActions;
    private JPanel PanelCustomerTicket;
    private JPanel Ticket;
    private JTextField CustomerTicketID;
    private JButton CustomerTicketPrintBtn;
    private JButton generateTicketBtn;
    private JComboBox CustomerSearchVehicleCompanyBrind;
    DefaultTableModel DriverListingModel;
    DefaultTableModel CustomerListingModel;
    DefaultTableModel VehicleListingModel;
    DefaultTableModel VehicleCustomerListingModel;
    DefaultListModel CustomerVehicleListModel;
    DefaultListModel CustomerDriverListModel;


    private Color NormalHeaderBtnBg = new Color(-16758415);
    private Color NormalHeaderBtnTxt = new Color(-328966);
    private Color VisitedHeaderBtnBg = new Color(-1118482);
    private Color VisitedHeaderBtnTxt = new Color(-16758415);

    private Color NormalPanelBtnBg = new Color(-11316397);
    private Color NormalPanelBtnTxt = new Color(-328966);
    private Color VisitedPanelBtnBg = new Color(137, 137, 137);
    private Color VisitedPanelBtnTxt = new Color(-328966);
    private int anInt;

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
    public EmployeeFrame() {

        $$$setupUI$$$();
        CustomerMainPanel.setVisible(false);
        DriverMainPanel.setVisible(false);
        VehicleMainPanel.setVisible(false);
        PanelEmployeeActions.setVisible(false);

        CardDriverContainer.setVisible(false);
        CardCustomerContainer.setVisible(false);
        CardVehiclesContainer.setVisible(false);

        CustomerButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CustomerMainPanel.setVisible(true);
                DriverMainPanel.setVisible(false);
                VehicleMainPanel.setVisible(false);
                CardCustomerContainer.setVisible(true);
                PanelCustomerAdd.setVisible(true);
                PanelEmployeeActions.setVisible(false);
                SwitchColorsTab("panel", CustomerButton, DriverButton, vehiclesButton);
                addCustomerBtn.doClick();
            }
        });

        DriverButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CustomerMainPanel.setVisible(false);
                DriverMainPanel.setVisible(true);
                VehicleMainPanel.setVisible(false);
                CardDriverContainer.setVisible(true);
                PanelDriverAdd.setVisible(true);
                PanelEmployeeActions.setVisible(false);
                SwitchColorsTab("panel", DriverButton, CustomerButton, vehiclesButton);
                addDriverBtn.doClick();
            }
        });
        DriverButton.doClick();
        vehiclesButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CustomerMainPanel.setVisible(false);
                DriverMainPanel.setVisible(false);
                VehicleMainPanel.setVisible(true);
                PanelVehicleViewCars.setVisible(true);
                PanelEmployeeActions.setVisible(false);
                SwitchColorsTab("panel", vehiclesButton, CustomerButton, DriverButton);
                addVehicleBtn.doClick();
            }
        });
        /**Top panel**/

        /**Driver**/
        addDriverBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CardCustomerContainer.setVisible(false);
                CardVehiclesContainer.setVisible(false);
                CardDriverContainer.setVisible(true);
                PanelDriverUpdate.setVisible(false);
                PanelDriverAdd.setVisible(true);
                PanelDriverSearch.setVisible(false);
                PanelDriverList.setVisible(false);
                SwitchColorsTab("header", addDriverBtn, updateDriverBtn, listAllDriverBtn, searchDriverBtn);


            }
        });
        addDriverBtn.doClick();
        updateDriverBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CardCustomerContainer.setVisible(false);
                CardVehiclesContainer.setVisible(false);
                CardDriverContainer.setVisible(true);
                PanelDriverUpdate.setVisible(true);
                PanelDriverAdd.setVisible(false);
                PanelDriverSearch.setVisible(false);
                PanelDriverList.setVisible(false);
                SwitchColorsTab("header", updateDriverBtn, addDriverBtn, listAllDriverBtn, searchDriverBtn);

            }
        });
        listAllDriverBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CardCustomerContainer.setVisible(false);
                CardVehiclesContainer.setVisible(false);
                CardDriverContainer.setVisible(true);
                PanelDriverUpdate.setVisible(false);
                PanelDriverAdd.setVisible(false);
                PanelDriverSearch.setVisible(false);
                PanelDriverList.setVisible(true);
                SwitchColorsTab("header", listAllDriverBtn, addDriverBtn, updateDriverBtn, searchDriverBtn);
            }
        });
        searchDriverBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CardCustomerContainer.setVisible(false);
                CardVehiclesContainer.setVisible(false);
                CardDriverContainer.setVisible(true);
                PanelDriverUpdate.setVisible(false);
                PanelDriverAdd.setVisible(false);
                PanelDriverSearch.setVisible(true);
                PanelDriverList.setVisible(false);
                SwitchColorsTab("header", searchDriverBtn, addDriverBtn, updateDriverBtn, listAllDriverBtn);

            }
        });


        /**Customer**/

        addCustomerBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CardDriverContainer.setVisible(false);
                CardVehiclesContainer.setVisible(false);
                CardCustomerContainer.setVisible(true);

                PanelCustomerUpdate.setVisible(false);
                MainPanelCustomerAdd.setVisible(true);
                PanelCustomerAdd.setVisible(true);
                PanelCustomerVehicle.setVisible(false);
                PanelCustomerTicket.setVisible(false);
                PanelCustomerSearch.setVisible(false);
                PanelCustomerList.setVisible(false);
                SwitchColorsTab("header", addCustomerBtn, updateCustomerBtn, searchCustomerBtn, listCustomerBtn, generateTicketBtn);
            }
        });
        updateCustomerBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CardDriverContainer.setVisible(false);
                CardVehiclesContainer.setVisible(false);
                CardCustomerContainer.setVisible(true);
                PanelCustomerAdd.setVisible(false);
                PanelCustomerUpdate.setVisible(true);

                MainPanelCustomerAdd.setVisible(false);
                PanelCustomerSearch.setVisible(false);
                PanelCustomerList.setVisible(false);
                PanelCustomerTicket.setVisible(false);
                SwitchColorsTab("header", updateCustomerBtn, addCustomerBtn, searchCustomerBtn, listCustomerBtn, generateTicketBtn);

            }
        });

        searchCustomerBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CardDriverContainer.setVisible(false);
                CardVehiclesContainer.setVisible(false);
                CardCustomerContainer.setVisible(true);
                MainPanelCustomerAdd.setVisible(false);
                PanelCustomerUpdate.setVisible(false);
                PanelCustomerAdd.setVisible(false);
                PanelCustomerSearch.setVisible(true);
                PanelCustomerList.setVisible(false);
                PanelCustomerTicket.setVisible(false);
                SwitchColorsTab("header", searchCustomerBtn, addCustomerBtn, updateCustomerBtn, listCustomerBtn, generateTicketBtn);

            }
        });

        listCustomerBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CardDriverContainer.setVisible(false);
                CardVehiclesContainer.setVisible(false);
                CardCustomerContainer.setVisible(true);

                PanelCustomerUpdate.setVisible(false);
                PanelCustomerAdd.setVisible(false);
                PanelCustomerSearch.setVisible(false);
                PanelCustomerList.setVisible(true);
                PanelCustomerTicket.setVisible(false);
                MainPanelCustomerAdd.setVisible(false);
                SwitchColorsTab("header", listCustomerBtn, addCustomerBtn, updateCustomerBtn, searchCustomerBtn, generateTicketBtn);


            }
        });

        generateTicketBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CardDriverContainer.setVisible(false);
                CardVehiclesContainer.setVisible(false);
                CardCustomerContainer.setVisible(true);
                PanelCustomerUpdate.setVisible(false);
                PanelCustomerAdd.setVisible(false);
                PanelCustomerSearch.setVisible(false);
                PanelCustomerList.setVisible(false);
                PanelCustomerTicket.setVisible(true);
                MainPanelCustomerAdd.setVisible(false);
                SwitchColorsTab("header", generateTicketBtn, listCustomerBtn, addCustomerBtn, updateCustomerBtn, searchCustomerBtn);


            }
        });


        /*** Vehicle**/
        viewCarsBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CardDriverContainer.setVisible(false);
                CardCustomerContainer.setVisible(false);
                CardVehiclesContainer.setVisible(true);
                PanelVehicleCustomer.setVisible(false);
                PanelVehicleViewCars.setVisible(true);
                SwitchColorsTab("header", viewCarsBtn, customerVehicleBtn);

            }
        });
        customerVehicleBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                CardDriverContainer.setVisible(false);
                CardCustomerContainer.setVisible(false);
                CardVehiclesContainer.setVisible(true);
                PanelVehicleViewCars.setVisible(false);
                PanelVehicleCustomer.setVisible(true);
                SwitchColorsTab("header", customerVehicleBtn, viewCarsBtn);

            }
        });

        /**Forms**/
        /**Driver**/
        /**Add**/
        DriverAddImageUpload.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String imageFileName = "root/IdeaProjects/driver1600.png";//
                JFileChooser imageChooser = new JFileChooser();
                imageChooser.showOpenDialog(null);
                if(imageChooser.getSelectedFile().isFile())
                    imageFileName = imageChooser.getSelectedFile().getAbsolutePath();
                try{
                    ImageIcon ImageRead = new ImageIcon(ImageIO.read(new File(imageFileName)));
                    ImageIcon imageIcon = new ImageIcon(new ImageIcon(imageFileName).getImage().getScaledInstance(60, 60, Image.SCALE_DEFAULT));
                    DriverAddImageHolder.setIcon(imageIcon);
                    DriverAddImageHolder.setText(DriverAddName.getText());

                }catch(Exception ex){
                    System.out.println(ex);
                }
                DriverAddImagePath.setText(imageFileName);

            }
        });
        /**Update**/
        DriverUpdateImageUpload.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String imageFileName = "root/IdeaProjects/driver1600.png";//
                JFileChooser imageChooser = new JFileChooser();
                imageChooser.showOpenDialog(null);
                if(imageChooser.getSelectedFile().isFile())
                    imageFileName = imageChooser.getSelectedFile().getAbsolutePath();

                try{
                    ImageIcon ImageRead = new ImageIcon(ImageIO.read(new File(imageFileName)));
                    ImageIcon imageIcon = new ImageIcon(new ImageIcon(imageFileName).getImage().getScaledInstance(60, 60, Image.SCALE_DEFAULT));
                    DriverUpdateImageHolder.setIcon(imageIcon);

                }catch(Exception ex){
                    System.out.println(ex);
                }
                DriverUpdateImagePath.setText(imageFileName);

            }
        });
        DriverAddSubmitAddBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int ID = Integer.parseInt(DriverAddID.getText());
                String Name = DriverAddName.getText().toString();
                char Gender = (DriverAddGenderMale.isSelected() ? 'M' : 'F');
                String Address = DriverAddAddress.getText().toString();
                String Phone = DriverAddPhone.getText().toString();
                String Exp = DriverAddExperience.getText().toString();
                int BirthDay = Integer.parseInt(DriverAddDateBirthDay.getSelectedItem().toString());
                int BirthMonth = Integer.parseInt(DriverAddDateBirthMonth.getSelectedItem().toString());
                int BirthYear = Integer.parseInt(DriverAddDateBirthYear.getSelectedItem().toString());
                String Photo = DriverAddImagePath.getText().toString();
                String Company = DriverAddCompanyBrand.getSelectedItem().toString();
                int SitCapacity = Integer.parseInt(DriverAddSitCapacity.getText().toString());
                Date Birthdate = new Date(BirthYear, BirthMonth, BirthDay);
                Employee emp = new Employee();
                if(emp.addNewDriver(ID,Name, Gender, Address,Birthdate, Phone, Exp, Photo, new CarBrand().getCarBrand(Company),SitCapacity)){
                    JOptionPane.showMessageDialog(null, String.format("Driver %s added successfully!", Name), "New Driver Added!", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(null, "Couldn\'t add Driver", "Error Adding New Driver", JOptionPane.ERROR_MESSAGE);
                }


            }
        });
        DriverUpdateRetrieveBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (DriverUpdateRetrieveBtn.getText().equalsIgnoreCase("retrieve")) {
                    int DriverOldID = Integer.parseInt(DriverUpdateOldID.getText());
                    Employee emp = new Employee();
                    Driver driver = emp.getDriver(DriverOldID);
                    if (driver != null) {
                        DriverUpdateID.setText(""+driver.getID());
                        DriverUpdateName.setText(""+driver.getName());
                        if(driver.getGender() == 'M'){
                            DriverUpdateGenderMale.setSelected(true);
                        }else{
                            DriverUpdateGenderFemale.setSelected(true);
                        }
                        DriverUpdateAddress.setText(""+driver.getAddress());
                        DriverUpdatePhone.setText(""+driver.getPhoneNo());
                        DriverUpdateExperience.setText(""+driver.getExperience());
                        DriverUpdateBirthDay.getModel().setSelectedItem(""+driver.getBirthDate().getDate());
                        DriverUpdateBirthMonth.getModel().setSelectedItem(""+driver.getBirthDate().getMonth());
                        DriverUpdateBirthDay.getModel().setSelectedItem(""+driver.getBirthDate().getYear());
                        DriverUpdateImagePath.setText(""+driver.getPhoto());
                        DriverUpdateCompanyBrand.getModel().setSelectedItem(""+driver.getCompanyBrand().getName());
                        DriverUpdateSitCapacity.setText(""+driver.getSitCapacity());
                        ImageIcon imageIcon = new ImageIcon(new ImageIcon(DriverUpdateImagePath.getText()).getImage().getScaledInstance(60, 60, Image.SCALE_DEFAULT));
                        DriverUpdateImageHolder.setIcon(imageIcon);
                        DriverUpdateImageHolder.setText(""+driver.getName());
                        DriverUpdateOldID.setEditable(false);
                        DriverUpdateOldID.setEnabled(false);
                        DriverUpdateSubmitUpdateBtn.setEnabled(true);
                        DriverUpdateSubmitDeleteBtn.setEnabled(true);
                        DriverUpdateRetrieveBtn.setText("Reset");
                    } else {
                        JOptionPane.showMessageDialog(null, "Couldn\'t find Driver", "Error Finding Driver", JOptionPane.ERROR_MESSAGE);
                    }
                } else {
                    DriverUpdateID.setText("");
                    DriverUpdateName.setText("");
                    DriverUpdateGenderMale.setSelected(true);
                    DriverUpdateGenderFemale.setSelected(false);
                    DriverUpdateAddress.setText("");
                    DriverUpdatePhone.setText("");
                    DriverUpdateExperience.setText("");
                    DriverUpdateBirthDay.setSelectedIndex(0);
                    DriverUpdateBirthMonth.setSelectedIndex(0);
                    DriverUpdateBirthDay.setSelectedIndex(0);
                    DriverUpdateImagePath.setText("");
                    DriverUpdateCompanyBrand.setSelectedIndex(0);
                    DriverUpdateSitCapacity.setText("");
                    DriverUpdateOldID.setText("");
                    DriverUpdateOldID.setEditable(true);
                    DriverUpdateOldID.setEnabled(true);

                    DriverUpdateRetrieveBtn.setText("Retrieve");
                    DriverUpdateSubmitUpdateBtn.setEnabled(false);
                    DriverUpdateSubmitDeleteBtn.setEnabled(false);
                }
            }
        });
        DriverUpdateSubmitUpdateBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int NewID = Integer.parseInt(DriverUpdateID.getText().toString());
                String Name = DriverUpdateName.getText().toString();
                char Gender = (DriverUpdateGenderMale.isSelected() ? 'M' : 'F');
                String Address = DriverUpdateAddress.getText().toString();
                String Phone = DriverUpdatePhone.getText().toString();
                String Exp = DriverUpdateExperience.getText().toString();
                int BirthDay = Integer.parseInt(DriverUpdateBirthDay.getSelectedItem().toString());
                int BirthMonth = Integer.parseInt(DriverUpdateBirthMonth.getSelectedItem().toString());
                int BirthYear = Integer.parseInt(DriverUpdateBirthYear.getSelectedItem().toString());
                String Photo = DriverUpdateImagePath.getText().toString();
                String CompanyBrand = DriverUpdateCompanyBrand.getSelectedItem().toString();
                int SitCapacity = Integer.parseInt(DriverUpdateSitCapacity.getText().toString());
                Date Birthdate = new Date(BirthYear, BirthMonth, BirthDay);
                Employee emp = new Employee();
                Driver dr = new Driver(NewID, Name, Gender, Address,Birthdate, Phone, Exp, Photo,new CarBrand().getCarBrand(CompanyBrand),SitCapacity);
                if(emp.updateDriver(Integer.parseInt(DriverUpdateOldID.getText()), dr)){
                    JOptionPane.showMessageDialog(null, String.format("Driver %s Updated successfully!", Name), "Driver Updated!", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(null, "Couldn\'t Update Driver", "Error Updating Driver", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        DriverUpdateSubmitDeleteBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int OldID = Integer.parseInt(DriverUpdateOldID.getText());
                Employee emp = new Employee();
                if(emp.deleteDriver(OldID)){
                    JOptionPane.showMessageDialog(null, String.format("Driver %s Deleted successfully!", DriverUpdateName.getText().toString()), "Driver Deleted!", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(null, "Couldn\'t Delete Driver", "Error Updating Driver", JOptionPane.ERROR_MESSAGE);
                }

            }
        });
        DriverSearchBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int ID = Integer.parseInt(DriverSearchID.getText().toString());
                Employee emp = new Employee();
                if (emp.getDriver(ID) != null) {
                    DriverUpdateOldID.setText(""+ID);
                    DriverUpdateRetrieveBtn.setText("Retrieve");
                    DriverUpdateRetrieveBtn.doClick();
                    updateDriverBtn.doClick();
                } else {
                    JOptionPane.showMessageDialog(null, "Couldn\'t find Driver", "Error Finding Driver", JOptionPane.ERROR_MESSAGE);
                }
            }
        });
        DriverListRefreshBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ArrayList<Driver> DriverListingData = (ArrayList<Driver>) new Employee().getDrivers();
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
                DriverListAll = new JTable(DriverListingModel);
            }
        });

        //farme
        // Customer
        //add

        CustomerAddSubmitAddBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                int ID = Integer.parseInt(CustomerAddID.getText().toString());
                String Name = CustomerAddName.getText().toString();
                char Gender = (CustomerAddGenderMale.isSelected() ? 'M' : 'F');
                String Address = CustomerAddAddress.getText().toString();
                int BirthDay = Integer.parseInt(CustomerAddBirthDay.getSelectedItem().toString());
                int BirthMonth = Integer.parseInt(CustomerAddBirthMonth.getSelectedItem().toString());
                int BirthYear = Integer.parseInt(CustomerAddBirthYear.getSelectedItem().toString());
                String Phone = CustomerAddPhone.getText().toString();
                //String CarUsage = CustomerAddCarUsage.getSelectedItem().toString();

                int RentDays = Integer.parseInt(CustomerAddRentingDaysNo.getText().toString());
                int BookDay = Integer.parseInt(CustomerAddBookDay.getSelectedItem().toString());
                int BookMonth = Integer.parseInt(CustomerAddBookMonth.getSelectedItem().toString());
                int BookYear = Integer.parseInt(CustomerAddBookYear.getSelectedItem().toString());

                Date BirthDate = new Date(BirthYear,BirthMonth,BirthDay);
                Date BookDate = new Date(BookYear,BookMonth,BookDay);
                String  EM = CustomerAddEmail.toString();

                Employee emp = new Employee();
                if(emp.addNewCustomer(ID,Name,Gender,Address,BookDate,Phone,"Taxi",RentDays,BookDate)){
                    JOptionPane.showMessageDialog(null, String.format("Customer %s added successfully!", Name), "New Customer Added!", JOptionPane.INFORMATION_MESSAGE);
                    PanelCustomerVehicle.setVisible(true);
                    PanelCustomerAdd.setVisible(false);
                }else {
                    JOptionPane.showMessageDialog(null, "Couldn\'t add Customer", "Error Adding New Customer", JOptionPane.ERROR_MESSAGE);
                }



            }
        });

        /**********************************************************************/

        /**Panel Add 2**/



        //String CustomerVehicleListingCols[] = {"Name ", " Make year ", " Engine Capacity ", " Rent Value "};
        //ArrayList<Vehicle> CustomerVehicleListingData = (ArrayList<Vehicle>) new Employee().getCarsCustomer(new CarBrand().getCarBrand(CarBrand),SittingCpacaty);
        /*CustomerSVehicleListModel = new DefaultListModel();
        CustomerSVehicleListModel.add(0,CustomerVehicleListingCols);
        Object[] DataV = new Object[4];
        for(int i=0;i<CustomerVehicleListingData.size();i++){
            DataV[0] = CustomerVehicleListingData.get(i).getCarBrand().getName();
            DataV[1] = CustomerVehicleListingData.get(i).getMakeYear();
            DataV[2] = CustomerVehicleListingData.get(i).getEngineCapacity();
            DataV[3] = CustomerVehicleListingData.get(i).getRentValue();

            CustomerSVehicleListModel.add(i,DataV[i]);
        }


        CustomerCarsList = new JList(CustomerSVehicleListModel);
        */

        /*
        String CustomerDriverListingCols[] = {"Name ", " Gender ", " Company Brand ", " Setting Capacity"};
        ArrayList<Driver> UNRentedDriver = (ArrayList<Driver>) new Employee().getDrivers();
        ArrayList<Driver> CustomerDriverListingData = null ;

        for(Driver x : UNRentedDriver){
            if(x.getIsRented() == false)
                CustomerDriverListingData.add(x);
        }
        /*CustomerDriverListModel = new DefaultListModel();
        CustomerDriverListModel.add(0,CustomerVehicleListingCols);
        Object[] DataD = new Object[4];
        for(int i=0;i<CustomerDriverListingData.size();i++){
            DataD[0] = CustomerDriverListingData.get(i).getName();
            DataD[1] = CustomerDriverListingData.get(i).getGender();
            DataD[2] = CustomerDriverListingData.get(i).getCompanyBrand().getName();
            DataD[3] = CustomerDriverListingData.get(i).getSitCapacity();

            CustomerDriverListModel.add(i,DataD[i]);
        }

        CustomerDriverList = new JList(CustomerDriverListModel);
        */


        /**Retrive**/

        CustomerUpdateRetrieveBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (CustomerUpdateRetrieveBtn.getText().equalsIgnoreCase("retrieve")) {
                    int CustomerOldID = Integer.parseInt(CustomerUpdateOldID.getText());
                    Employee emp = new Employee();
                    Customer customer = emp.getCustomer(CustomerOldID);
                    if (customer != null) {
                        CustomerUpdateID.setText(""+customer.getID());
                        CustomerUpdateName.setText(""+customer.getName());
                        if(customer.getGender() == 'M'){
                            CustomerUpdateGenderMale.setSelected(true);
                        }else{
                            CustomerUpdateGenderFemale.setSelected(true);
                        }
                        CustomerUpdateEM.setText(""+customer.getAddress());
                        CustomerUpdatePhone.setText(""+customer.getPhoneNo());
                        CustomerUpdateCarUsage.getModel().setSelectedItem("" +customer.getCarUsage());
                        CustomerUpdateBrithDay.getModel().setSelectedItem(""+customer.getBirthDate().getDate());
                        CustomerUpdateBrithMonth.getModel().setSelectedItem(""+customer.getBirthDate().getMonth());
                        CustomerUpdateBirthYear.getModel().setSelectedItem(""+customer.getBirthDate().getYear());
                        CustomerUpdateRetingDayNo.setText("" + customer.getRentingDaysNo());
                        CustomerUpdateBookDay.getModel().setSelectedItem(""+customer.getBookDate().getDate());
                        CustomerUpdateBookMonth.getModel().setSelectedItem(""+customer.getBookDate().getMonth());
                        CustomerUpdateBookYear.getModel().setSelectedItem(""+customer.getBookDate().getYear());
                        CustomerUpdateTotalRent.setText(""+customer.getTotalRent());

                        CustomerUpdateOldID.setEditable(false);
                        CustomerUpdateOldID.setEnabled(false);
                        CustomerUpdateSubmitUpdateBtn.setEnabled(true);
                        CustomerUpdateSubmitDeleteBtn.setEnabled(true);
                        CustomerUpdateRetrieveBtn.setText("Reset");
                    } else {
                        JOptionPane.showMessageDialog(null, "Couldn\'t find Customer", "Error Finding Customer", JOptionPane.ERROR_MESSAGE);
                    }
                } else {
                    CustomerUpdateID.setText("");
                    CustomerUpdateName.setText("");
                    CustomerUpdateGenderMale.setSelected(true);
                    CustomerUpdateGenderFemale.setSelected(false);
                    CustomerUpdateEM.setText("");
                    CustomerUpdatePhone.setText("");
                    CustomerUpdateCarUsage.setSelectedIndex(0);

                    CustomerUpdateBrithDay.setSelectedIndex(0);
                    CustomerUpdateBrithMonth.setSelectedIndex(0);
                    CustomerUpdateBirthYear.setSelectedIndex(0);

                    CustomerUpdateBookDay.setSelectedIndex(0);
                    CustomerUpdateBookMonth.setSelectedIndex(0);
                    CustomerUpdateBookYear.setSelectedIndex(0);

                    CustomerUpdateRetingDayNo.setText("");
                    CustomerUpdateTotalRent.setText("");
                    CustomerUpdateOldID.setText("");

                    CustomerUpdateOldID.setEditable(true);
                    CustomerUpdateOldID.setEnabled(true);

                    CustomerUpdateRetrieveBtn.setText("Retrieve");
                    CustomerUpdateSubmitUpdateBtn.setEnabled(false);
                    CustomerUpdateSubmitDeleteBtn.setEnabled(false);
                }
            }
        });

        /**Update**/

        CustomerUpdateSubmitUpdateBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int NewID = Integer.parseInt(CustomerUpdateID.getText().toString());
                String Name = CustomerUpdateName.getText().toString();
                char Gender = (CustomerUpdateGenderMale.isSelected() ? 'M' : 'F');
                String Address = CustomerUpdateEM.getText().toString();
                String Phone = CustomerUpdatePhone.getText().toString();

                int BirthDay = Integer.parseInt(CustomerUpdateBrithDay.getSelectedItem().toString());
                int BirthMonth = Integer.parseInt(CustomerUpdateBrithMonth.getSelectedItem().toString());
                int BirthYear = Integer.parseInt(CustomerUpdateBirthYear.getSelectedItem().toString());
                Date Birthdate = new Date(BirthYear, BirthMonth, BirthDay);

                int BookDay = Integer.parseInt(CustomerUpdateBookDay.getSelectedItem().toString());
                int BookMonth = Integer.parseInt(CustomerUpdateBookMonth.getSelectedItem().toString());
                int BookYear = Integer.parseInt(CustomerUpdateBookYear.getSelectedItem().toString());
                Date Bookdate = new Date(BookYear, BookMonth, BookDay);

                // String CarUsage = CustomerUpdateCarUsage.getSelectedItem().toString();
                int RetingDayNo = Integer.parseInt(CustomerUpdateRetingDayNo.getText().toString());


                Double TotalRent = Double.parseDouble(CustomerUpdateTotalRent.getText().toString());

                Employee emp = new Employee();

                Customer cu = new Customer(NewID,Name,'M',Address,Birthdate,Phone,"Taxi",RetingDayNo,Bookdate);

                if(emp.updateCustomer(Integer.parseInt(CustomerUpdateOldID.getText()), cu)){
                    JOptionPane.showMessageDialog(null, String.format("Customer %s Updated successfully!", Name), "Customer Updated!", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(null, "Couldn\'t Update Customer", "Error Updating Customer", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        /**Delete**/

        CustomerUpdateSubmitDeleteBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int OldID = Integer.parseInt(CustomerUpdateOldID.getText());
                Employee emp = new Employee();
                if(emp.deleteCustomer(OldID)){
                    JOptionPane.showMessageDialog(null, String.format("Customer %s Deleted successfully!", CustomerUpdateName.getText().toString()), "Customer Deleted!", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(null, "Couldn\'t Delete Customer", "Error Updating Customer", JOptionPane.ERROR_MESSAGE);
                }

            }
        });

        /**Search**/

        CustomerSearchBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int ID = Integer.parseInt(CustomerSearchID.getText().toString());
                Employee emp = new Employee();
                if (emp.getCustomer(ID) != null) {
                    CustomerUpdateOldID.setText(""+ID);
                    CustomerUpdateRetrieveBtn.setText("Retrieve");
                    CustomerUpdateRetrieveBtn.doClick();
                    updateCustomerBtn.doClick();
                } else {
                    JOptionPane.showMessageDialog(null, "Couldn\'t find Customer", "Error Finding Customer", JOptionPane.ERROR_MESSAGE);
                }
            }
        });


        /**List Customer*/
        CustomerListRefreshBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ArrayList<Customer> CustomerListingData = (ArrayList<Customer>) new Customer().getCustomers();
                CustomerListingModel.setRowCount(0);
                Object[] DataC = new Object[10];
                for(int i=0;i<CustomerListingData.size();i++){
                    DataC[0] = CustomerListingData.get(i).getID();
                    DataC[1] = CustomerListingData.get(i).getName();
                    DataC[2] = CustomerListingData.get(i).getGender();
                    DataC[3] = CustomerListingData.get(i).getAddress();
                    DataC[4] = CustomerListingData.get(i).getPhoneNo();
                    DataC[5] = CustomerListingData.get(i).getCarUsage();
                    DataC[6] = CustomerListingData.get(i).getBirthDate().getDate() + "/" +CustomerListingData.get(i).getBirthDate().getMonth() + "/" +CustomerListingData.get(i).getBirthDate().getYear();
                    DataC[7] = CustomerListingData.get(i).getRentingDaysNo();
                    DataC[8] = CustomerListingData.get(i).getBookDate().getDate() + "/" +CustomerListingData.get(i).getBookDate().getMonth() + "/" +CustomerListingData.get(i).getBookDate().getYear();
                    DataC[9] = CustomerListingData.get(i).getTotalRent();
                    DriverListingModel.addRow(DataC);
                }
                CustomerListAll = new JTable(CustomerListingModel);
            }
        });

        CustomerTicketPrintBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String Id  = CustomerTicketID.getText().toString();
                Employee emp =new Employee();
                Customer  c = emp.getCustomer(Integer.parseInt(Id));
                PDFGenerator t = new PDFGenerator(c.getName(), c);

            }
        });




        VehicleSearchRetrieveBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String CarBrand = VehicleSearchCompanyBrand.getSelectedItem().toString();
                String CarUsage = VehicleSearchCarUsage.getSelectedItem().toString();
                boolean isRented = (VehicleSearchStatusRented.isSelected() ? true : false);

                ArrayList<Vehicle> VehicleListingData = (ArrayList<Vehicle>) new Employee().getCars(new CarBrand().getCarBrand(CarBrand), CarUsage, isRented);
                VehicleListingModel.setRowCount(0);
                Object[] Data = new Object[11];

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
        VehicleCustomerRetrieveBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String CustomerQuery = VehicleCustomerIDorUsername.getText().toString();
                Customer cs;
                try {
                    int cq = Integer.parseInt(CustomerQuery);
                    cs = new Customer().getCustomer(cq  );
                }
                catch (NumberFormatException exp) {
                    //Not an int
                    cs = new Customer().getCustomer(CustomerQuery);
                }
                Vehicle VehicleListingData = cs.getRentedCar();
                if(VehicleListingData != null) {
                    VehicleCustomerListingModel.setRowCount(0);
                    Object[] Data = new Object[11];
                    Data[0] = VehicleListingData.getCarID();
                    Data[1] = VehicleListingData.getCarModel();
                    Data[2] = VehicleListingData.getCarBrand().getName();
                    Data[3] = VehicleListingData.getMakeYear();
                    Data[4] = VehicleListingData.getCarUsage();
                    Data[5] = VehicleListingData.getSitCapacity();
                    Data[6] = VehicleListingData.getEngineCapacity();
                    Data[7] = VehicleListingData.getCarType();
                    Data[8] = VehicleListingData.getCarVariant();
                    Data[9] = VehicleListingData.getRentValue();
                    Data[10] = (VehicleListingData.getIsRented() ? "Yes" : "No");

                    VehicleCustomerListingModel.addRow(Data);
                    CustomerVehicleListAll = new JTable(VehicleCustomerListingModel);
                }
            }
        });
        LogOutBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //MainEmployeeFramePanel.setVisible(false);
                Frame[] frames = Frame.getFrames();
                for(Frame x : frames)
                    x.dispose();
                new LoginFrame();
            }
        });

        reportCarUsageBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Reports Data
                Vehicle v = new Vehicle();
                ArrayList<Vehicle> ve = v.getVehicles();
                int size = ve.size();
                String[] carModel = new String[size];
                String[] carUsage = new String[size];
                for(int i=0;i<ve.size();++i){
                    carModel[i] = ve.get(i).getCarModel();
                    carUsage[i] = ve.get(i).getCarUsage();
                }
                new ReportCarUsage("Car Usage Report", carModel, carUsage);
            }
        });
        reportCarStatusBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Reports Data
                Vehicle v = new Vehicle();
                ArrayList<Vehicle> ve = v.getVehicles();
                int size = ve.size();
                String[] carModel = new String[size];
                boolean[] vehicleStatus = new boolean[size];
                for(int i=0;i<ve.size();++i){
                    carModel[i] = ve.get(i).getCarModel();
                    vehicleStatus[i] = ve.get(i).getIsRented();
                }
                new ReportCarStatus("Car Status Rport", carModel, vehicleStatus);
            }
        });
        sendEmailBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                SwitchColorsTab("panel", sendEmailBtn,CustomerButton, vehiclesButton, DriverButton);
                CustomerMainPanel.setVisible(false);
                DriverMainPanel.setVisible(false);
                VehicleMainPanel.setVisible(false);
                PanelEmployeeActions.setVisible(true);

            }
        });

        /*CustomerAddSubmitAddBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                int ID = Integer.parseInt(CustomerAddID.getText().toString());
                String Name = CustomerAddName.getText().toString();
                char Gender = (CustomerAddGenderMale.isSelected() ? 'M' : 'F');
                String Address = CustomerAddAddress.getText().toString();
                int BirthDay = Integer.parseInt(CustomerAddBirthDay.getSelectedItem().toString());
                int BirthMonth = Integer.parseInt(CustomerAddBirthMonth.getSelectedItem().toString());
                int BirthYear = Integer.parseInt(CustomerAddBirthYear.getSelectedItem().toString());
                String Phone = CustomerAddPhone.getText().toString();
                String CarUsage = "Taxi"; //CustomerAddCarUsage.getSelectedItem().toString();


                int RentDays = Integer.parseInt(CustomerAddRentingDaysNo.getText().toString());
                int BookDay = Integer.parseInt(CustomerAddBookDay.getSelectedItem().toString());
                int BookMonth = Integer.parseInt(CustomerAddBookMonth.getSelectedItem().toString());
                int BookYear = Integer.parseInt(CustomerAddBookYear.getSelectedItem().toString());

                Date BirthDate = new Date(BirthYear,BirthMonth,BirthDay);
                Date BookDate = new Date(BookYear,BookMonth,BookDay);

                Employee emp = new Employee();
                if(emp.addNewCustomer(ID,Name,Gender,Address,BookDate,Phone,"Taxi",RentDays,BookDate)){
                    JOptionPane.showMessageDialog(null, String.format("Customer %s added successfully!", Name), "New Customer Added!", JOptionPane.INFORMATION_MESSAGE);
                }else {
                    JOptionPane.showMessageDialog(null, "Couldn\'t add Customer", "Error Adding New Customer", JOptionPane.ERROR_MESSAGE);
                }

            }
        });*/
        CustomerUpdateRetrieveBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (CustomerUpdateRetrieveBtn.getText().equalsIgnoreCase("retrieve")) {
                    int CustomerID = Integer.parseInt(CustomerUpdateID.getText().toString());
                    Employee emp = new Employee();
                    Customer customer = emp.getCustomer(CustomerID);
                    if (customer != null) {
                        CustomerUpdateID.setText(""+customer.getID());
                        CustomerUpdateName.setText(""+customer.getName());
                        if(customer.getGender() == 'M'){
                            CustomerUpdateGenderMale.setSelected(true);
                        }else{
                            CustomerUpdateGenderFemale.setSelected(true);
                        }
                        CustomerUpdateEM.setText(""+customer.getAddress());
                        CustomerUpdatePhone.setText(""+customer.getPhoneNo());
                        CustomerUpdateCarUsage.getModel().setSelectedItem("" +customer.getCarUsage());
                        CustomerUpdateBirthDay.getModel().setSelectedItem(""+customer.getBirthDate().getDate());
                        CustomerUpdateBirthMonth.getModel().setSelectedItem(""+customer.getBirthDate().getMonth());
                        CustomerUpdateBirthYear.getModel().setSelectedItem(""+customer.getBirthDate().getYear());
                        CustomerUpdateRentingDayNo.setText("" + customer.getRentingDaysNo());
                        CustomerUpdateBookDay.getModel().setSelectedItem(""+customer.getBookDate().getDate());
                        CustomerUpdateBookMonth.getModel().setSelectedItem(""+customer.getBookDate().getMonth());
                        CustomerUpdateBookYear.getModel().setSelectedItem(""+customer.getBookDate().getYear());
                        CustomerUpdateTotalRent.setText(""+customer.getTotalRent());

                        CustomerUpdateID.setEditable(false);
                        CustomerUpdateID.setEnabled(false);
                        CustomerUpdateSubmitUpdateBtn.setEnabled(true);
                        CustomerUpdateSubmitDeleteBtn.setEnabled(true);
                        CustomerUpdateRetrieveBtn.setText("Reset");
                    } else {
                        JOptionPane.showMessageDialog(null, "Couldn\'t find Customer", "Error Finding Customer", JOptionPane.ERROR_MESSAGE);
                    }
                } else {
                    CustomerUpdateID.setText("");
                    CustomerUpdateName.setText("");
                    CustomerUpdateGenderMale.setSelected(true);
                    CustomerUpdateGenderFemale.setSelected(false);
                    CustomerUpdateEM.setText("");
                    CustomerUpdatePhone.setText("");
                    CustomerUpdateCarUsage.setSelectedIndex(0);

                    CustomerUpdateBirthDay.setSelectedIndex(0);
                    CustomerUpdateBirthMonth.setSelectedIndex(0);
                    CustomerUpdateBirthYear.setSelectedIndex(0);

                    CustomerUpdateBookDay.setSelectedIndex(0);
                    CustomerUpdateBookMonth.setSelectedIndex(0);
                    CustomerUpdateBookYear.setSelectedIndex(0);

                    CustomerUpdateRentingDayNo.setText("");
                    CustomerUpdateTotalRent.setText("");
                    CustomerUpdateID.setText("");

                    CustomerUpdateID.setEditable(true);
                    CustomerUpdateID.setEnabled(true);

                    CustomerUpdateRetrieveBtn.setText("Retrieve");
                    CustomerUpdateSubmitUpdateBtn.setEnabled(false);
                    CustomerUpdateSubmitDeleteBtn.setEnabled(false);
                }
            }
        });

        /**Search Customer **/
        CustomerSearchBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int ID = Integer.parseInt(CustomerSearchID.getText().toString());
                Employee emp = new Employee();
                if (emp.getCustomer(ID) != null) {
                    CustomerUpdateID.setText(""+ID);
                    CustomerUpdateRetrieveBtn.setText("Retrieve");
                    CustomerUpdateRetrieveBtn.doClick();
                    updateCustomerBtn.doClick();
                } else {
                    JOptionPane.showMessageDialog(null, "Couldn\'t find Customer", "Error Finding Customer", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        /**List Customer*/
        CustomerListRefreshBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ArrayList<Customer> CustomerListingData = (ArrayList<Customer>) new Employee().getCustomers();
                CustomerListingModel.setRowCount(0);
                Object[] DataC = new Object[10];
                for(int i=0;i<CustomerListingData.size();i++){
                    DataC[0] = CustomerListingData.get(i).getID();
                    DataC[1] = CustomerListingData.get(i).getName();
                    DataC[2] = CustomerListingData.get(i).getGender();
                    DataC[3] = CustomerListingData.get(i).getAddress();
                    DataC[4] = CustomerListingData.get(i).getPhoneNo();
                    DataC[5] = CustomerListingData.get(i).getCarUsage();
                    DataC[6] = CustomerListingData.get(i).getBirthDate().getDate() + "/" +CustomerListingData.get(i).getBirthDate().getMonth() + "/" +CustomerListingData.get(i).getBirthDate().getYear();
                    DataC[7] = CustomerListingData.get(i).getRentingDaysNo();
                    DataC[8] = CustomerListingData.get(i).getBookDate().getDate() + "/" +CustomerListingData.get(i).getBookDate().getMonth() + "/" +CustomerListingData.get(i).getBookDate().getYear();
                    DataC[9] = CustomerListingData.get(i).getTotalRent();
                    CustomerListingModel.addRow(DataC);
                }
                CustomerListAll = new JTable(CustomerListingModel);
            }
        });
        CustomerSearchVehicleCompanyBrand.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String CarBrand = CustomerSearchVehicleCompanyBrand.getSelectedItem().toString();
                int SittingCpacaty = Integer.parseInt(CustomerSearchVehicleSittingCapacity.getSelectedItem().toString());
                if(CarBrand != null){
                    ///JOptionPane.showMessageDialog(null, "7ist", "Show JLIst",JOptionPane.PLAIN_MESSAGE);
                    CustomerVehicleListModel.removeAllElements();
                    CustomerDriverListModel.removeAllElements();
                    String CustomerVehicleListingCols[] = {"Name ", " Make year ", " Engine Capacity ", " Rent Value "};
                    ArrayList<Vehicle> CustomerVehicleListingData = (ArrayList<Vehicle>) new Employee().getCarsCustomer(new CarBrand().getCarBrand(CarBrand),SittingCpacaty);
                    CustomerVehicleListModel.removeAllElements();

                    String DataV = new String();
                    for(int i=0;i<CustomerVehicleListingData.size();i++){
                        DataV = CustomerVehicleListingData.get(i).getCarModel()+" - "+CustomerVehicleListingData.get(i).getCarBrand().getName()+" - "+CustomerVehicleListingData.get(i).getMakeYear()+" - "
                                +  CustomerVehicleListingData.get(i).getEngineCapacity()+" - "+
                                CustomerVehicleListingData.get(i).getRentValue();
                        CustomerVehicleListModel.add(i,DataV);
                    };

                    //CustomerCarsList = new JList(CustomerVehicleListModel);



                    String CustomerDriverListingCols[] = {"Name ", " Gender ", " Company Brand ", " Setting Capacity"};
                    ArrayList<Driver> UNRentedDriver = (ArrayList<Driver>) new Employee().getDrivers();
                    ArrayList<Driver> CustomerDriverListingData = null ;

                    CustomerDriverListModel.removeAllElements();
                    for(Driver x : UNRentedDriver){
                        if(x.getIsRented() == false)
                            CustomerDriverListingData.add(x);
                    }
                    String DataD = new String();
                    for(int i=0;i<CustomerDriverListingData.size();i++){
                        DataD = CustomerDriverListingData.get(i).getName()+"   "+
                                CustomerDriverListingData.get(i).getGender()+"   "+
                                CustomerDriverListingData.get(i).getCompanyBrand().getName()+"   "
                                + CustomerDriverListingData.get(i).getSitCapacity();

                        CustomerDriverListModel.add(i,DataD);
                    }
                    String VehicleSelected[] = CustomerSearchVehicleVehicleList.getSelectedValue().toString().split(" - ");
                    String VehicleName = VehicleSelected[0];
                    String VehicleRent = VehicleSelected[5];
                    //CustomerSearchVehicleDriverList = new JList(CustomerDriverListModel);
                    CustomerSearchVehicleTotalRent.setText(""+(Double.parseDouble(CustomerAddRentingDaysNo.getText())* Double.parseDouble(VehicleRent)));
                }
            }
        });
        CustomerSearchVehicleSittingCapacity.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String CarBrand = CustomerSearchVehicleCompanyBrand.getSelectedItem().toString();
                int SittingCpacaty = Integer.parseInt(CustomerSearchVehicleSittingCapacity.getSelectedItem().toString());
                if(CarBrand != null){
                    JOptionPane.showMessageDialog(null, "Show JList", "Show JLIst",JOptionPane.PLAIN_MESSAGE);
                }
                ArrayList<Vehicle> CustomerVehicleListingData = (ArrayList<Vehicle>) new Employee().getCarsCustomer(new CarBrand().getCarBrand(CarBrand),SittingCpacaty);
                String DataV = new String();
                for(int i=0;i<CustomerVehicleListingData.size();i++){
                    DataV = CustomerVehicleListingData.get(i).getCarModel()+" - "+CustomerVehicleListingData.get(i).getCarBrand().getName()+" - "+CustomerVehicleListingData.get(i).getMakeYear()+" - "
                            +  CustomerVehicleListingData.get(i).getEngineCapacity()+" - "+
                            CustomerVehicleListingData.get(i).getRentValue();
                    CustomerVehicleListModel.add(i,DataV);
                };

                //CustomerCarsList = new JList(CustomerVehicleListModel);



                String CustomerDriverListingCols[] = {"Name ", " Gender ", " Company Brand ", " Setting Capacity"};
                ArrayList<Driver> UNRentedDriver = (ArrayList<Driver>) new Employee().getDrivers();
                ArrayList<Driver> CustomerDriverListingData = null ;

                CustomerDriverListModel.removeAllElements();
                for(Driver x : UNRentedDriver){
                    if(x.getIsRented() == false)
                        CustomerDriverListingData.add(x);
                }
                String DataD = new String();
                for(int i=0;i<CustomerDriverListingData.size();i++){
                    DataD = CustomerDriverListingData.get(i).getName()+"   "+
                            CustomerDriverListingData.get(i).getGender()+"   "+
                            CustomerDriverListingData.get(i).getCompanyBrand().getName()+"   "
                            + CustomerDriverListingData.get(i).getSitCapacity();

                    CustomerDriverListModel.add(i,DataD);
                }
                String VehicleSelected[] = CustomerSearchVehicleVehicleList.getSelectedValue().toString().split(" - ");
                String VehicleName = VehicleSelected[0];
                String VehicleRent = VehicleSelected[5];
                //CustomerSearchVehicleDriverList = new JList(CustomerDriverListModel);
                CustomerSearchVehicleTotalRent.setText(""+(Double.parseDouble(CustomerAddRentingDaysNo.getText())* Double.parseDouble(VehicleRent)));
                //CustomerSearchVehicleDriverList = new JList(CustomerDriverListModel);
                CustomerSearchVehicleTotalRent.setText(""+(Double.parseDouble(CustomerAddRentingDaysNo.getText())* Double.parseDouble(VehicleRent)));

            }
        });
        Sendbutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!textFieldFrom.getText().equals("") && !textAreaCompose.getText().equals("") && !textFieldSubject.getText().equals("") && !textFieldTo.getText().equals("")) {
                    try {

                        Email m = new Email(textFieldTo.getText(), textFieldFrom.getText(), textFieldSubject.getText(), textAreaCompose.getText());
                        m.generateAndSendEmail();
                        JOptionPane.showMessageDialog(null, "Your Message has been sent", "Sending Email", JOptionPane.ERROR_MESSAGE);

                    } catch (MessagingException ex) {
                        JOptionPane.showMessageDialog(null, "Your Message hasn't been sent", "Sending Email", JOptionPane.ERROR_MESSAGE);
                    }
                }
                JOptionPane.showMessageDialog(null, "Meassing required Field...please Complete them", "Sending Email", JOptionPane.ERROR_MESSAGE);

            }
            });
        ResetButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textFieldFrom.setText("");
                textFieldTo.setText("");
                textFieldSubject.setText("");
                textAreaCompose.setText("");

            }
        });

    }

    private void createUIComponents() {
        String[] DriverListAllColumns = {"ID", "Name", "Gender", "Phone"};
        Object[][] DriverListAllData = {
                {"1", "Mostafa", "M", "01000123"},
                {"2", "Youssef", "M", "124125123"}

        };

        /**Driver Listing**/
        String DriverListingCols[] = {"ID", "Name", "Gender", "Address", "Phone", "Experience", "BirthDate", "Company Brand", "Sit Capacity", "Rent Value"};
        ArrayList<Driver> DriverListingData = (ArrayList<Driver>) new Employee().getDrivers();
        DriverListingModel = new DefaultTableModel(DriverListingCols,0);
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
        DriverListAll = new JTable(DriverListingModel);
        /** End Driver Listing**/

        /**Customer Listing**/
        String CustomerListingCols[] = {"ID", "Name", "Gender", "Address", "Phone",  "BirthDate", "Car Usage", "Reting Day No", "BookDate" ,"totel Rent"};
        ArrayList<Customer> CustomerListingData = (ArrayList<Customer>) new Employee().getCustomers();
        CustomerListingModel = new DefaultTableModel(CustomerListingCols,0);
        Object[] DataC = new Object[10];
        for(int i=0;i < CustomerListingData.size();i++){
            DataC[0] = CustomerListingData.get(i).getID();
            DataC[1] = CustomerListingData.get(i).getName();
            DataC[2] = CustomerListingData.get(i).getGender();
            DataC[3] = CustomerListingData.get(i).getAddress();
            DataC[4] = CustomerListingData.get(i).getPhoneNo();
            DataC[5] = CustomerListingData.get(i).getCarUsage();
            DataC[6] = CustomerListingData.get(i).getBirthDate().getDate() + "/" +CustomerListingData.get(i).getBirthDate().getMonth() + "/" +CustomerListingData.get(i).getBirthDate().getYear();
            DataC[7] = CustomerListingData.get(i).getRentingDaysNo();
            DataC[8] = CustomerListingData.get(i).getBookDate().getDate() + "/" +CustomerListingData.get(i).getBookDate().getMonth() + "/" +CustomerListingData.get(i).getBookDate().getYear();
            DataC[9] = CustomerListingData.get(i).getTotalRent();
            CustomerListingModel.addRow(DataC);
        }
        CustomerListAll = new JTable(CustomerListingModel);

        /** End Customer Listing**/

        /* Vehicle Listing */
        String VehicleListingCols[] = {"ID", "Model", "Brand", "Make Year", "Usage", "Sitting Capacity", "Engine Capacity", "Type", "Variant", "Rent Value", "Rented"};
        VehicleListingModel = new DefaultTableModel(VehicleListingCols,0);
        VehicleListAll = new JTable(VehicleListingModel);
        /*End - Vehicle Listing */
        //DriverListAll.setTableHeader();
        //CustomerListAll = new JTable(DriverListAllData, DriverListAllColumns);
        CustomerSearchTable = new JTable(DriverListAllData, DriverListAllColumns);
        CustomerVehicleListAll= new JTable(DriverListAllData, DriverListAllColumns);
        /* Vehicle Listing */
        VehicleCustomerListingModel = new DefaultTableModel(VehicleListingCols,0);
        CustomerVehicleListAll = new JTable(VehicleCustomerListingModel);
        /*End - Vehicle Listing */
        /**Comboboxes initalizations*/
        DriverAddCompanyBrand = new JComboBox();
        DriverUpdateCompanyBrand = new JComboBox();
        VehicleSearchCompanyBrand = new JComboBox();
        CustomerSearchVehicleCompanyBrand = new JComboBox();
        //CustomerSearchVehicleCompanyBrind = new JComboBox();
        //CustomerAddCompanyBrand = new JComboBox();
        //CustomerUpdateCompanyBrand = new JComboBox();
        ArrayList<CarBrand> CarBrandsValues = new CarBrand().getCarBrands();
        for(CarBrand x: CarBrandsValues){
            DriverAddCompanyBrand.addItem(x.getName());
            DriverUpdateCompanyBrand.addItem(x.getName());
            VehicleSearchCompanyBrand.addItem(x.getName());
            CustomerSearchVehicleCompanyBrand.addItem(x.getName());
        }
        VehicleSearchCarUsage = new JComboBox();
        CustomerAddCarUsage = new JComboBox();
        //CustomerUpdateCarUsage = new JComboBox();
        ArrayList<String> CarUsages = CustomObject.CarUsage;
        for(String x: CarUsages){
            //CustomerUpdateCarUsage.addItem(x);
            VehicleSearchCarUsage.addItem(x);
            CustomerAddCarUsage.addItem(x);
        }
        //CustomerAddDriversAvailable = new JComboBox();
        ArrayList<Driver> drivers = new Driver().getDrivers();
        for(Driver x : drivers) {
            //CustomerAddDriversAvailable.addItem(x.getName());
        }
        CustomerSearchVehicleSittingCapacity = new JComboBox();
        ArrayList<Vehicle> vehicles = new Vehicle().getVehicles();
        for(Vehicle x : vehicles){
            // CustomerAddVehiclesAvailable.addItem(x.getCarModel());
        }

        //CustomerAddSittingCapacity = new JComboBox();
        LinkedHashSet<Integer> list = new LinkedHashSet<Integer>();
        for(int i =0;i<vehicles.size();++i) {
            list.add(vehicles.get(i).getSitCapacity());
        }
        for(int x : list) {
            CustomerSearchVehicleSittingCapacity.addItem(x);
        }
        /** Initialize Lists**/
        CustomerVehicleListModel = new DefaultListModel();
        CustomerDriverListModel = new DefaultListModel();
        CustomerSearchVehicleVehicleList = new JList(CustomerVehicleListModel);

        CustomerSearchVehicleDriverList = new JList(CustomerDriverListModel);
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
        MainEmployeeFramePanel = new JPanel();
        MainEmployeeFramePanel.setLayout(new BorderLayout(0, 0));
        leftPanelMain = new JPanel();
        leftPanelMain.setLayout(new GridBagLayout());
        leftPanelMain.setBackground(new Color(-3355444));
        MainEmployeeFramePanel.add(leftPanelMain, BorderLayout.WEST);
        CustomerButton = new JButton();
        CustomerButton.setBackground(new Color(-11316397));
        CustomerButton.setBorderPainted(false);
        CustomerButton.setContentAreaFilled(true);
        CustomerButton.setFocusPainted(false);
        CustomerButton.setFocusable(false);
        CustomerButton.setForeground(new Color(-328966));
        CustomerButton.setIcon(new ImageIcon(getClass().getResource("/man.png")));
        CustomerButton.setText("Customer");
        GridBagConstraints gbc;
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.anchor = GridBagConstraints.NORTH;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.ipadx = 30;
        gbc.ipady = 40;
        gbc.insets = new Insets(0, 0, 5, 0);
        leftPanelMain.add(CustomerButton, gbc);
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
        DriverButton = new JButton();
        DriverButton.setBackground(new Color(-11316397));
        DriverButton.setBorderPainted(false);
        DriverButton.setContentAreaFilled(true);
        DriverButton.setFocusPainted(false);
        DriverButton.setFocusable(false);
        DriverButton.setForeground(new Color(-328966));
        DriverButton.setIcon(new ImageIcon(getClass().getResource("/driver1.png")));
        DriverButton.setText("Driver");
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.NORTH;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.ipadx = 30;
        gbc.ipady = 40;
        gbc.insets = new Insets(0, 0, 5, 0);
        leftPanelMain.add(DriverButton, gbc);
        LogOutBtn = new JButton();
        LogOutBtn.setBackground(new Color(-3140555));
        LogOutBtn.setBorderPainted(false);
        LogOutBtn.setContentAreaFilled(true);
        LogOutBtn.setFocusPainted(false);
        LogOutBtn.setFocusable(false);
        LogOutBtn.setForeground(new Color(-328966));
        LogOutBtn.setIcon(new ImageIcon(getClass().getResource("/thick-cross-mark(1).png")));
        LogOutBtn.setPreferredSize(new Dimension(86, 5));
        LogOutBtn.setText("Log Out");
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 6;
        gbc.anchor = GridBagConstraints.SOUTH;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.ipadx = 30;
        gbc.ipady = 40;
        leftPanelMain.add(LogOutBtn, gbc);
        reportCarStatusBtn = new JButton();
        reportCarStatusBtn.setBackground(new Color(-11316397));
        reportCarStatusBtn.setBorderPainted(false);
        reportCarStatusBtn.setContentAreaFilled(true);
        reportCarStatusBtn.setFocusPainted(false);
        reportCarStatusBtn.setFocusable(false);
        reportCarStatusBtn.setForeground(new Color(-328966));
        reportCarStatusBtn.setIcon(new ImageIcon(getClass().getResource("/analytics.png")));
        reportCarStatusBtn.setPreferredSize(new Dimension(151, 5));
        reportCarStatusBtn.setText("Report Car Status");
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 4;
        gbc.anchor = GridBagConstraints.SOUTH;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.ipadx = 30;
        gbc.ipady = 40;
        gbc.insets = new Insets(0, 0, 5, 0);
        leftPanelMain.add(reportCarStatusBtn, gbc);
        sendEmailBtn = new JButton();
        sendEmailBtn.setBackground(new Color(-11316397));
        sendEmailBtn.setBorderPainted(false);
        sendEmailBtn.setContentAreaFilled(true);
        sendEmailBtn.setFocusPainted(false);
        sendEmailBtn.setFocusable(false);
        sendEmailBtn.setForeground(new Color(-328966));
        sendEmailBtn.setIcon(new ImageIcon(getClass().getResource("/email-icon.png")));
        sendEmailBtn.setPreferredSize(new Dimension(151, 5));
        sendEmailBtn.setText("Send Email");
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.weighty = 0.5;
        gbc.anchor = GridBagConstraints.SOUTH;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.ipadx = 30;
        gbc.ipady = 40;
        gbc.insets = new Insets(0, 0, 5, 0);
        leftPanelMain.add(sendEmailBtn, gbc);
        reportCarUsageBtn = new JButton();
        reportCarUsageBtn.setBackground(new Color(-11316397));
        reportCarUsageBtn.setBorderPainted(false);
        reportCarUsageBtn.setContentAreaFilled(true);
        reportCarUsageBtn.setFocusPainted(false);
        reportCarUsageBtn.setFocusable(false);
        reportCarUsageBtn.setForeground(new Color(-328966));
        reportCarUsageBtn.setIcon(new ImageIcon(getClass().getResource("/analytics.png")));
        reportCarUsageBtn.setPreferredSize(new Dimension(150, 5));
        reportCarUsageBtn.setText("Report Car Usage");
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 5;
        gbc.anchor = GridBagConstraints.SOUTH;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.ipadx = 30;
        gbc.ipady = 40;
        gbc.insets = new Insets(0, 0, 5, 0);
        leftPanelMain.add(reportCarUsageBtn, gbc);
        CardMainCenterPanelHolder = new JPanel();
        CardMainCenterPanelHolder.setLayout(new CardLayout(0, 0));
        CardMainCenterPanelHolder.setBackground(new Color(-328966));
        MainEmployeeFramePanel.add(CardMainCenterPanelHolder, BorderLayout.CENTER);
        DriverMainPanel = new JPanel();
        DriverMainPanel.setLayout(new BorderLayout(0, 0));
        CardMainCenterPanelHolder.add(DriverMainPanel, "Card1");
        DriverMainHeader = new JPanel();
        DriverMainHeader.setLayout(new GridBagLayout());
        DriverMainHeader.setBackground(new Color(-11551010));
        DriverMainPanel.add(DriverMainHeader, BorderLayout.NORTH);
        addDriverBtn = new JButton();
        addDriverBtn.setBackground(new Color(-16758415));
        addDriverBtn.setBorderPainted(false);
        addDriverBtn.setFocusPainted(false);
        addDriverBtn.setFocusable(false);
        Font addDriverBtnFont = this.$$$getFont$$$("Lato", Font.BOLD, 14, addDriverBtn.getFont());
        if (addDriverBtnFont != null) addDriverBtn.setFont(addDriverBtnFont);
        addDriverBtn.setForeground(new Color(-328966));
        addDriverBtn.setHorizontalAlignment(0);
        addDriverBtn.setLabel("Add Driver");
        addDriverBtn.setPreferredSize(new Dimension(120, 65));
        addDriverBtn.setRequestFocusEnabled(false);
        addDriverBtn.setText("Add Driver");
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.weightx = 0.5;
        gbc.anchor = GridBagConstraints.EAST;
        gbc.ipadx = 10;
        gbc.insets = new Insets(0, 2, 0, 0);
        DriverMainHeader.add(addDriverBtn, gbc);
        updateDriverBtn = new JButton();
        updateDriverBtn.setBackground(new Color(-16758415));
        updateDriverBtn.setBorderPainted(false);
        updateDriverBtn.setFocusPainted(false);
        updateDriverBtn.setFocusable(false);
        Font updateDriverBtnFont = this.$$$getFont$$$("Lato", Font.BOLD, 14, updateDriverBtn.getFont());
        if (updateDriverBtnFont != null) updateDriverBtn.setFont(updateDriverBtnFont);
        updateDriverBtn.setForeground(new Color(-328966));
        updateDriverBtn.setHorizontalAlignment(0);
        updateDriverBtn.setPreferredSize(new Dimension(120, 65));
        updateDriverBtn.setRequestFocusEnabled(false);
        updateDriverBtn.setText("Update Driver");
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.EAST;
        gbc.ipadx = 10;
        gbc.insets = new Insets(0, 2, 0, 0);
        DriverMainHeader.add(updateDriverBtn, gbc);
        searchDriverBtn = new JButton();
        searchDriverBtn.setBackground(new Color(-16758415));
        searchDriverBtn.setBorderPainted(false);
        searchDriverBtn.setFocusPainted(false);
        searchDriverBtn.setFocusable(false);
        Font searchDriverBtnFont = this.$$$getFont$$$("Lato", Font.BOLD, 14, searchDriverBtn.getFont());
        if (searchDriverBtnFont != null) searchDriverBtn.setFont(searchDriverBtnFont);
        searchDriverBtn.setForeground(new Color(-328966));
        searchDriverBtn.setHorizontalAlignment(0);
        searchDriverBtn.setPreferredSize(new Dimension(120, 65));
        searchDriverBtn.setRequestFocusEnabled(false);
        searchDriverBtn.setText("Search");
        gbc = new GridBagConstraints();
        gbc.gridx = 2;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.EAST;
        gbc.ipadx = 10;
        gbc.insets = new Insets(0, 2, 0, 0);
        DriverMainHeader.add(searchDriverBtn, gbc);
        listAllDriverBtn = new JButton();
        listAllDriverBtn.setBackground(new Color(-16758415));
        listAllDriverBtn.setBorderPainted(false);
        listAllDriverBtn.setFocusPainted(false);
        listAllDriverBtn.setFocusable(false);
        Font listAllDriverBtnFont = this.$$$getFont$$$("Lato", Font.BOLD, 14, listAllDriverBtn.getFont());
        if (listAllDriverBtnFont != null) listAllDriverBtn.setFont(listAllDriverBtnFont);
        listAllDriverBtn.setForeground(new Color(-328966));
        listAllDriverBtn.setHorizontalAlignment(0);
        listAllDriverBtn.setPreferredSize(new Dimension(120, 65));
        listAllDriverBtn.setRequestFocusEnabled(false);
        listAllDriverBtn.setText("List All Driver");
        gbc = new GridBagConstraints();
        gbc.gridx = 3;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.EAST;
        gbc.ipadx = 10;
        gbc.insets = new Insets(0, 2, 0, 0);
        DriverMainHeader.add(listAllDriverBtn, gbc);
        CardDriverContainer = new JPanel();
        CardDriverContainer.setLayout(new CardLayout(0, 0));
        DriverMainPanel.add(CardDriverContainer, BorderLayout.CENTER);
        PanelDriverAdd = new JPanel();
        PanelDriverAdd.setLayout(new GridBagLayout());
        CardDriverContainer.add(PanelDriverAdd, "Card1");
        InternalPanel = new JPanel();
        InternalPanel.setLayout(new GridBagLayout());
        InternalPanel.setBackground(new Color(-1118482));
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.gridheight = 2;
        PanelDriverAdd.add(InternalPanel, gbc);
        final JLabel label1 = new JLabel();
        Font label1Font = this.$$$getFont$$$(null, Font.PLAIN, 12, label1.getFont());
        if (label1Font != null) label1.setFont(label1Font);
        label1.setForeground(new Color(-12828863));
        label1.setText("ID :");
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.gridwidth = 5;
        gbc.anchor = GridBagConstraints.NORTHWEST;
        gbc.insets = new Insets(25, 150, 0, 0);
        InternalPanel.add(label1, gbc);
        final JLabel label2 = new JLabel();
        Font label2Font = this.$$$getFont$$$(null, Font.PLAIN, 12, label2.getFont());
        if (label2Font != null) label2.setFont(label2Font);
        label2.setForeground(new Color(-12828863));
        label2.setText("Name :");
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.gridwidth = 5;
        gbc.anchor = GridBagConstraints.NORTHWEST;
        gbc.insets = new Insets(25, 150, 0, 0);
        InternalPanel.add(label2, gbc);
        final JLabel label3 = new JLabel();
        Font label3Font = this.$$$getFont$$$(null, Font.PLAIN, 12, label3.getFont());
        if (label3Font != null) label3.setFont(label3Font);
        label3.setForeground(new Color(-12828863));
        label3.setText("Gender");
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.gridwidth = 5;
        gbc.anchor = GridBagConstraints.NORTHWEST;
        gbc.insets = new Insets(25, 150, 0, 0);
        InternalPanel.add(label3, gbc);
        final JLabel label4 = new JLabel();
        Font label4Font = this.$$$getFont$$$(null, Font.PLAIN, 12, label4.getFont());
        if (label4Font != null) label4.setFont(label4Font);
        label4.setForeground(new Color(-12828863));
        label4.setText("Address");
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 4;
        gbc.gridwidth = 5;
        gbc.anchor = GridBagConstraints.NORTHWEST;
        gbc.insets = new Insets(25, 150, 0, 0);
        InternalPanel.add(label4, gbc);
        final JLabel label5 = new JLabel();
        Font label5Font = this.$$$getFont$$$(null, Font.PLAIN, 12, label5.getFont());
        if (label5Font != null) label5.setFont(label5Font);
        label5.setForeground(new Color(-12828863));
        label5.setText("Phone Number");
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 5;
        gbc.gridwidth = 5;
        gbc.anchor = GridBagConstraints.NORTHWEST;
        gbc.insets = new Insets(25, 150, 0, 0);
        InternalPanel.add(label5, gbc);
        final JLabel label6 = new JLabel();
        Font label6Font = this.$$$getFont$$$(null, Font.PLAIN, 12, label6.getFont());
        if (label6Font != null) label6.setFont(label6Font);
        label6.setForeground(new Color(-12828863));
        label6.setText("Experience");
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 6;
        gbc.gridwidth = 5;
        gbc.anchor = GridBagConstraints.NORTHWEST;
        gbc.insets = new Insets(25, 150, 0, 0);
        InternalPanel.add(label6, gbc);
        final JLabel label7 = new JLabel();
        Font label7Font = this.$$$getFont$$$(null, Font.PLAIN, 12, label7.getFont());
        if (label7Font != null) label7.setFont(label7Font);
        label7.setForeground(new Color(-12828863));
        label7.setText("Date Of Birth");
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 7;
        gbc.gridwidth = 5;
        gbc.anchor = GridBagConstraints.NORTHWEST;
        gbc.insets = new Insets(25, 150, 0, 0);
        InternalPanel.add(label7, gbc);
        final JLabel label8 = new JLabel();
        Font label8Font = this.$$$getFont$$$(null, Font.PLAIN, 12, label8.getFont());
        if (label8Font != null) label8.setFont(label8Font);
        label8.setForeground(new Color(-12828863));
        label8.setText("Company Brand");
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 10;
        gbc.gridwidth = 5;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.insets = new Insets(25, 150, 0, 0);
        InternalPanel.add(label8, gbc);
        final JLabel label9 = new JLabel();
        Font label9Font = this.$$$getFont$$$(null, Font.PLAIN, 12, label9.getFont());
        if (label9Font != null) label9.setFont(label9Font);
        label9.setForeground(new Color(-12828863));
        label9.setText("Sitting Capacity");
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 11;
        gbc.gridwidth = 5;
        gbc.anchor = GridBagConstraints.NORTHWEST;
        gbc.insets = new Insets(25, 150, 0, 0);
        InternalPanel.add(label9, gbc);
        DriverAddID = new JTextField();
        DriverAddID.setBackground(new Color(-1));
        DriverAddID.setPreferredSize(new Dimension(200, 25));
        gbc = new GridBagConstraints();
        gbc.gridx = 7;
        gbc.gridy = 1;
        gbc.gridwidth = 4;
        gbc.anchor = GridBagConstraints.SOUTHWEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        InternalPanel.add(DriverAddID, gbc);
        DriverAddName = new JTextField();
        DriverAddName.setBackground(new Color(-1));
        DriverAddName.setPreferredSize(new Dimension(250, 25));
        gbc = new GridBagConstraints();
        gbc.gridx = 7;
        gbc.gridy = 2;
        gbc.gridwidth = 4;
        gbc.anchor = GridBagConstraints.SOUTHWEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        InternalPanel.add(DriverAddName, gbc);
        DriverAddPhone = new JTextField();
        DriverAddPhone.setBackground(new Color(-1));
        DriverAddPhone.setMinimumSize(new Dimension(250, 25));
        DriverAddPhone.setPreferredSize(new Dimension(200, 25));
        gbc = new GridBagConstraints();
        gbc.gridx = 7;
        gbc.gridy = 5;
        gbc.gridwidth = 4;
        gbc.anchor = GridBagConstraints.SOUTHWEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        InternalPanel.add(DriverAddPhone, gbc);
        DriverAddImagePath = new JTextField();
        DriverAddImagePath.setBackground(new Color(-1));
        DriverAddImagePath.setMinimumSize(new Dimension(200, 25));
        DriverAddImagePath.setText("");
        gbc = new GridBagConstraints();
        gbc.gridx = 7;
        gbc.gridy = 8;
        gbc.gridwidth = 3;
        gbc.anchor = GridBagConstraints.SOUTHWEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        InternalPanel.add(DriverAddImagePath, gbc);
        DriverAddSitCapacity = new JTextField();
        DriverAddSitCapacity.setBackground(new Color(-1));
        DriverAddSitCapacity.setMinimumSize(new Dimension(200, 25));
        gbc = new GridBagConstraints();
        gbc.gridx = 7;
        gbc.gridy = 11;
        gbc.gridwidth = 4;
        gbc.anchor = GridBagConstraints.SOUTHWEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        InternalPanel.add(DriverAddSitCapacity, gbc);
        DriverAddGenderMale = new JRadioButton();
        DriverAddGenderMale.setBackground(new Color(-1118482));
        Font DriverAddGenderMaleFont = this.$$$getFont$$$(null, Font.BOLD, 12, DriverAddGenderMale.getFont());
        if (DriverAddGenderMaleFont != null) DriverAddGenderMale.setFont(DriverAddGenderMaleFont);
        DriverAddGenderMale.setForeground(new Color(-12828863));
        DriverAddGenderMale.setSelected(true);
        DriverAddGenderMale.setText("Male");
        gbc = new GridBagConstraints();
        gbc.gridx = 7;
        gbc.gridy = 3;
        gbc.anchor = GridBagConstraints.SOUTHWEST;
        InternalPanel.add(DriverAddGenderMale, gbc);
        DriverAddGenderFemale = new JRadioButton();
        DriverAddGenderFemale.setBackground(new Color(-1118482));
        Font DriverAddGenderFemaleFont = this.$$$getFont$$$(null, Font.BOLD, 12, DriverAddGenderFemale.getFont());
        if (DriverAddGenderFemaleFont != null) DriverAddGenderFemale.setFont(DriverAddGenderFemaleFont);
        DriverAddGenderFemale.setForeground(new Color(-12828863));
        DriverAddGenderFemale.setText("Famale");
        gbc = new GridBagConstraints();
        gbc.gridx = 8;
        gbc.gridy = 3;
        gbc.gridwidth = 3;
        gbc.anchor = GridBagConstraints.SOUTHWEST;
        InternalPanel.add(DriverAddGenderFemale, gbc);
        DriverAddDateBirthDay = new JComboBox();
        DriverAddDateBirthDay.setAutoscrolls(false);
        DriverAddDateBirthDay.setBackground(new Color(-1));
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
        defaultComboBoxModel1.addElement("13");
        defaultComboBoxModel1.addElement("14");
        defaultComboBoxModel1.addElement("15");
        defaultComboBoxModel1.addElement("16");
        defaultComboBoxModel1.addElement("17");
        defaultComboBoxModel1.addElement("18");
        defaultComboBoxModel1.addElement("19");
        defaultComboBoxModel1.addElement("20");
        defaultComboBoxModel1.addElement("21");
        defaultComboBoxModel1.addElement("22");
        defaultComboBoxModel1.addElement("23");
        defaultComboBoxModel1.addElement("24");
        defaultComboBoxModel1.addElement("25");
        defaultComboBoxModel1.addElement("26");
        defaultComboBoxModel1.addElement("27");
        defaultComboBoxModel1.addElement("28");
        defaultComboBoxModel1.addElement("29");
        defaultComboBoxModel1.addElement("30");
        defaultComboBoxModel1.addElement("31");
        DriverAddDateBirthDay.setModel(defaultComboBoxModel1);
        DriverAddDateBirthDay.setPreferredSize(new Dimension(70, 26));
        gbc = new GridBagConstraints();
        gbc.gridx = 7;
        gbc.gridy = 7;
        gbc.anchor = GridBagConstraints.SOUTHWEST;
        InternalPanel.add(DriverAddDateBirthDay, gbc);
        DriverAddDateBirthMonth = new JComboBox();
        DriverAddDateBirthMonth.setAutoscrolls(false);
        DriverAddDateBirthMonth.setBackground(new Color(-1));
        final DefaultComboBoxModel defaultComboBoxModel2 = new DefaultComboBoxModel();
        defaultComboBoxModel2.addElement("1");
        defaultComboBoxModel2.addElement("2");
        defaultComboBoxModel2.addElement("3");
        defaultComboBoxModel2.addElement("4");
        defaultComboBoxModel2.addElement("5");
        defaultComboBoxModel2.addElement("6");
        defaultComboBoxModel2.addElement("7");
        defaultComboBoxModel2.addElement("8");
        defaultComboBoxModel2.addElement("9");
        defaultComboBoxModel2.addElement("10");
        defaultComboBoxModel2.addElement("11");
        defaultComboBoxModel2.addElement("12");
        DriverAddDateBirthMonth.setModel(defaultComboBoxModel2);
        DriverAddDateBirthMonth.setPreferredSize(new Dimension(70, 26));
        gbc = new GridBagConstraints();
        gbc.gridx = 8;
        gbc.gridy = 7;
        gbc.anchor = GridBagConstraints.SOUTHWEST;
        gbc.insets = new Insets(0, 20, 0, 0);
        InternalPanel.add(DriverAddDateBirthMonth, gbc);
        final JLabel label10 = new JLabel();
        Font label10Font = this.$$$getFont$$$("Lato", Font.BOLD, 24, label10.getFont());
        if (label10Font != null) label10.setFont(label10Font);
        label10.setHorizontalAlignment(0);
        label10.setHorizontalTextPosition(0);
        label10.setText("Adding a new Driver\n");
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 11;
        gbc.insets = new Insets(0, 0, 30, 0);
        InternalPanel.add(label10, gbc);
        DriverAddSubmitAddBtn = new JButton();
        DriverAddSubmitAddBtn.setBackground(new Color(-11551010));
        DriverAddSubmitAddBtn.setForeground(new Color(-328966));
        DriverAddSubmitAddBtn.setLabel("Add Driver");
        DriverAddSubmitAddBtn.setPreferredSize(new Dimension(150, 32));
        DriverAddSubmitAddBtn.setText("Add Driver");
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 12;
        gbc.gridwidth = 11;
        gbc.insets = new Insets(40, 150, 0, 0);
        InternalPanel.add(DriverAddSubmitAddBtn, gbc);
        DriverAddImageUpload = new JButton();
        DriverAddImageUpload.setBackground(new Color(-16758415));
        DriverAddImageUpload.setForeground(new Color(-328966));
        DriverAddImageUpload.setHorizontalAlignment(0);
        DriverAddImageUpload.setHorizontalTextPosition(0);
        DriverAddImageUpload.setText("Upload");
        DriverAddImageUpload.setVerticalAlignment(3);
        gbc = new GridBagConstraints();
        gbc.gridx = 10;
        gbc.gridy = 8;
        gbc.anchor = GridBagConstraints.SOUTH;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        InternalPanel.add(DriverAddImageUpload, gbc);
        DriverAddDateBirthYear = new JComboBox();
        DriverAddDateBirthYear.setAutoscrolls(false);
        DriverAddDateBirthYear.setBackground(new Color(-1));
        final DefaultComboBoxModel defaultComboBoxModel3 = new DefaultComboBoxModel();
        defaultComboBoxModel3.addElement("1980");
        defaultComboBoxModel3.addElement("1981");
        defaultComboBoxModel3.addElement("1982");
        defaultComboBoxModel3.addElement("1983");
        defaultComboBoxModel3.addElement("1984");
        defaultComboBoxModel3.addElement("1985");
        defaultComboBoxModel3.addElement("1986");
        defaultComboBoxModel3.addElement("1987");
        defaultComboBoxModel3.addElement("1988");
        defaultComboBoxModel3.addElement("1989");
        defaultComboBoxModel3.addElement("1990");
        defaultComboBoxModel3.addElement("1991");
        defaultComboBoxModel3.addElement("1992");
        defaultComboBoxModel3.addElement("1993");
        defaultComboBoxModel3.addElement("1994");
        defaultComboBoxModel3.addElement("1995");
        defaultComboBoxModel3.addElement("1996");
        defaultComboBoxModel3.addElement("1998");
        defaultComboBoxModel3.addElement("1999");
        defaultComboBoxModel3.addElement("2000");
        DriverAddDateBirthYear.setModel(defaultComboBoxModel3);
        DriverAddDateBirthYear.setPreferredSize(new Dimension(70, 26));
        gbc = new GridBagConstraints();
        gbc.gridx = 9;
        gbc.gridy = 7;
        gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.SOUTHWEST;
        gbc.insets = new Insets(0, 20, 0, 0);
        InternalPanel.add(DriverAddDateBirthYear, gbc);
        final JLabel label11 = new JLabel();
        Font label11Font = this.$$$getFont$$$(null, Font.PLAIN, 12, label11.getFont());
        if (label11Font != null) label11.setFont(label11Font);
        label11.setForeground(new Color(-12828863));
        label11.setText("Photo");
        gbc = new GridBagConstraints();
        gbc.gridx = 4;
        gbc.gridy = 8;
        gbc.anchor = GridBagConstraints.NORTHWEST;
        gbc.insets = new Insets(25, 150, 0, 0);
        InternalPanel.add(label11, gbc);
        DriverAddImageHolder = new JLabel();
        DriverAddImageHolder.setText("Username");
        gbc = new GridBagConstraints();
        gbc.gridx = 4;
        gbc.gridy = 9;
        gbc.anchor = GridBagConstraints.EAST;
        gbc.ipady = 20;
        InternalPanel.add(DriverAddImageHolder, gbc);
        final JScrollPane scrollPane1 = new JScrollPane();
        gbc = new GridBagConstraints();
        gbc.gridx = 7;
        gbc.gridy = 4;
        gbc.gridwidth = 4;
        gbc.fill = GridBagConstraints.BOTH;
        InternalPanel.add(scrollPane1, gbc);
        DriverAddAddress = new JTextArea();
        scrollPane1.setViewportView(DriverAddAddress);
        DriverAddExperience = new JTextField();
        gbc = new GridBagConstraints();
        gbc.gridx = 7;
        gbc.gridy = 6;
        gbc.gridwidth = 4;
        gbc.anchor = GridBagConstraints.SOUTHWEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        InternalPanel.add(DriverAddExperience, gbc);
        DriverAddCompanyBrand.setBackground(new Color(-1));
        gbc = new GridBagConstraints();
        gbc.gridx = 7;
        gbc.gridy = 10;
        gbc.gridwidth = 4;
        gbc.anchor = GridBagConstraints.SOUTHWEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        InternalPanel.add(DriverAddCompanyBrand, gbc);
        PanelDriverUpdate = new JPanel();
        PanelDriverUpdate.setLayout(new GridBagLayout());
        CardDriverContainer.add(PanelDriverUpdate, "Card2");
        final JPanel panel1 = new JPanel();
        panel1.setLayout(new GridBagLayout());
        panel1.setBackground(new Color(-1118482));
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        PanelDriverUpdate.add(panel1, gbc);
        final JLabel label12 = new JLabel();
        Font label12Font = this.$$$getFont$$$(null, -1, -1, label12.getFont());
        if (label12Font != null) label12.setFont(label12Font);
        label12.setForeground(new Color(-12828863));
        label12.setPreferredSize(new Dimension(18, 34));
        label12.setText("ID :");
        gbc = new GridBagConstraints();
        gbc.gridx = 4;
        gbc.gridy = 4;
        gbc.anchor = GridBagConstraints.NORTH;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.insets = new Insets(0, 150, 0, 0);
        panel1.add(label12, gbc);
        final JLabel label13 = new JLabel();
        Font label13Font = this.$$$getFont$$$(null, -1, -1, label13.getFont());
        if (label13Font != null) label13.setFont(label13Font);
        label13.setForeground(new Color(-12828863));
        label13.setText("Name :");
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 6;
        gbc.gridwidth = 5;
        gbc.anchor = GridBagConstraints.NORTHWEST;
        gbc.insets = new Insets(12, 150, 0, 0);
        panel1.add(label13, gbc);
        final JLabel label14 = new JLabel();
        Font label14Font = this.$$$getFont$$$(null, -1, -1, label14.getFont());
        if (label14Font != null) label14.setFont(label14Font);
        label14.setForeground(new Color(-12828863));
        label14.setText("Gender");
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 7;
        gbc.gridwidth = 5;
        gbc.anchor = GridBagConstraints.NORTHWEST;
        gbc.insets = new Insets(12, 150, 0, 0);
        panel1.add(label14, gbc);
        final JLabel label15 = new JLabel();
        Font label15Font = this.$$$getFont$$$(null, -1, -1, label15.getFont());
        if (label15Font != null) label15.setFont(label15Font);
        label15.setForeground(new Color(-12828863));
        label15.setText("Address");
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 8;
        gbc.gridwidth = 5;
        gbc.anchor = GridBagConstraints.NORTHWEST;
        gbc.insets = new Insets(12, 150, 0, 0);
        panel1.add(label15, gbc);
        final JLabel label16 = new JLabel();
        Font label16Font = this.$$$getFont$$$(null, -1, -1, label16.getFont());
        if (label16Font != null) label16.setFont(label16Font);
        label16.setForeground(new Color(-12828863));
        label16.setText("Phone Number");
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 9;
        gbc.gridwidth = 5;
        gbc.anchor = GridBagConstraints.NORTHWEST;
        gbc.insets = new Insets(12, 150, 0, 0);
        panel1.add(label16, gbc);
        final JLabel label17 = new JLabel();
        Font label17Font = this.$$$getFont$$$(null, -1, -1, label17.getFont());
        if (label17Font != null) label17.setFont(label17Font);
        label17.setForeground(new Color(-12828863));
        label17.setText("Experience");
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 10;
        gbc.gridwidth = 5;
        gbc.anchor = GridBagConstraints.NORTHWEST;
        gbc.insets = new Insets(12, 150, 0, 0);
        panel1.add(label17, gbc);
        final JLabel label18 = new JLabel();
        Font label18Font = this.$$$getFont$$$(null, -1, -1, label18.getFont());
        if (label18Font != null) label18.setFont(label18Font);
        label18.setForeground(new Color(-12828863));
        label18.setText("Date Of Birth");
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 11;
        gbc.gridwidth = 5;
        gbc.anchor = GridBagConstraints.NORTHWEST;
        gbc.insets = new Insets(12, 150, 0, 0);
        panel1.add(label18, gbc);
        final JLabel label19 = new JLabel();
        Font label19Font = this.$$$getFont$$$(null, -1, -1, label19.getFont());
        if (label19Font != null) label19.setFont(label19Font);
        label19.setForeground(new Color(-12828863));
        label19.setText("Company Brand");
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 14;
        gbc.gridwidth = 5;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.insets = new Insets(12, 150, 0, 0);
        panel1.add(label19, gbc);
        final JLabel label20 = new JLabel();
        Font label20Font = this.$$$getFont$$$(null, -1, -1, label20.getFont());
        if (label20Font != null) label20.setFont(label20Font);
        label20.setForeground(new Color(-12828863));
        label20.setText("Sitting Capacity");
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 15;
        gbc.gridwidth = 5;
        gbc.anchor = GridBagConstraints.NORTHWEST;
        gbc.insets = new Insets(12, 150, 0, 0);
        panel1.add(label20, gbc);
        DriverUpdateOldID = new JTextField();
        DriverUpdateOldID.setBackground(new Color(-1));
        DriverUpdateOldID.setPreferredSize(new Dimension(200, 25));
        gbc = new GridBagConstraints();
        gbc.gridx = 7;
        gbc.gridy = 4;
        gbc.gridwidth = 20;
        gbc.anchor = GridBagConstraints.NORTHWEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.insets = new Insets(0, 0, 20, 0);
        panel1.add(DriverUpdateOldID, gbc);
        DriverUpdateName = new JTextField();
        DriverUpdateName.setBackground(new Color(-1));
        DriverUpdateName.setPreferredSize(new Dimension(250, 25));
        gbc = new GridBagConstraints();
        gbc.gridx = 7;
        gbc.gridy = 6;
        gbc.gridwidth = 25;
        gbc.anchor = GridBagConstraints.SOUTHWEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel1.add(DriverUpdateName, gbc);
        DriverUpdatePhone = new JTextField();
        DriverUpdatePhone.setBackground(new Color(-1));
        DriverUpdatePhone.setMinimumSize(new Dimension(250, 25));
        DriverUpdatePhone.setPreferredSize(new Dimension(200, 25));
        gbc = new GridBagConstraints();
        gbc.gridx = 7;
        gbc.gridy = 9;
        gbc.gridwidth = 25;
        gbc.anchor = GridBagConstraints.SOUTHWEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel1.add(DriverUpdatePhone, gbc);
        DriverUpdateExperience = new JTextField();
        DriverUpdateExperience.setBackground(new Color(-1));
        DriverUpdateExperience.setPreferredSize(new Dimension(250, 25));
        gbc = new GridBagConstraints();
        gbc.gridx = 7;
        gbc.gridy = 10;
        gbc.gridwidth = 25;
        gbc.anchor = GridBagConstraints.SOUTHWEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel1.add(DriverUpdateExperience, gbc);
        DriverUpdateImagePath = new JTextField();
        DriverUpdateImagePath.setBackground(new Color(-1));
        DriverUpdateImagePath.setMinimumSize(new Dimension(200, 25));
        gbc = new GridBagConstraints();
        gbc.gridx = 7;
        gbc.gridy = 12;
        gbc.gridwidth = 24;
        gbc.anchor = GridBagConstraints.SOUTHWEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel1.add(DriverUpdateImagePath, gbc);
        DriverUpdateSitCapacity = new JTextField();
        DriverUpdateSitCapacity.setBackground(new Color(-1));
        DriverUpdateSitCapacity.setMinimumSize(new Dimension(200, 25));
        gbc = new GridBagConstraints();
        gbc.gridx = 7;
        gbc.gridy = 15;
        gbc.gridwidth = 25;
        gbc.anchor = GridBagConstraints.SOUTHWEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel1.add(DriverUpdateSitCapacity, gbc);
        DriverUpdateGenderMale = new JRadioButton();
        DriverUpdateGenderMale.setBackground(new Color(-1118482));
        Font DriverUpdateGenderMaleFont = this.$$$getFont$$$(null, Font.BOLD, 12, DriverUpdateGenderMale.getFont());
        if (DriverUpdateGenderMaleFont != null) DriverUpdateGenderMale.setFont(DriverUpdateGenderMaleFont);
        DriverUpdateGenderMale.setForeground(new Color(-12828863));
        DriverUpdateGenderMale.setText("Male");
        gbc = new GridBagConstraints();
        gbc.gridx = 7;
        gbc.gridy = 7;
        gbc.gridwidth = 3;
        gbc.anchor = GridBagConstraints.SOUTHWEST;
        panel1.add(DriverUpdateGenderMale, gbc);
        DriverUpdateGenderFemale = new JRadioButton();
        DriverUpdateGenderFemale.setBackground(new Color(-1118482));
        Font DriverUpdateGenderFemaleFont = this.$$$getFont$$$(null, Font.BOLD, 12, DriverUpdateGenderFemale.getFont());
        if (DriverUpdateGenderFemaleFont != null) DriverUpdateGenderFemale.setFont(DriverUpdateGenderFemaleFont);
        DriverUpdateGenderFemale.setForeground(new Color(-12828863));
        DriverUpdateGenderFemale.setText("Famale");
        gbc = new GridBagConstraints();
        gbc.gridx = 11;
        gbc.gridy = 7;
        gbc.gridwidth = 21;
        gbc.anchor = GridBagConstraints.SOUTHWEST;
        panel1.add(DriverUpdateGenderFemale, gbc);
        DriverUpdateBirthDay = new JComboBox();
        DriverUpdateBirthDay.setBackground(new Color(-1));
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
        defaultComboBoxModel4.addElement("13");
        defaultComboBoxModel4.addElement("14");
        defaultComboBoxModel4.addElement("15");
        defaultComboBoxModel4.addElement("16");
        defaultComboBoxModel4.addElement("17");
        defaultComboBoxModel4.addElement("18");
        defaultComboBoxModel4.addElement("19");
        defaultComboBoxModel4.addElement("20");
        defaultComboBoxModel4.addElement("21");
        defaultComboBoxModel4.addElement("22");
        defaultComboBoxModel4.addElement("23");
        defaultComboBoxModel4.addElement("24");
        defaultComboBoxModel4.addElement("25");
        defaultComboBoxModel4.addElement("26");
        defaultComboBoxModel4.addElement("27");
        defaultComboBoxModel4.addElement("28");
        defaultComboBoxModel4.addElement("29");
        defaultComboBoxModel4.addElement("30");
        defaultComboBoxModel4.addElement("31");
        DriverUpdateBirthDay.setModel(defaultComboBoxModel4);
        DriverUpdateBirthDay.setPreferredSize(new Dimension(70, 26));
        gbc = new GridBagConstraints();
        gbc.gridx = 7;
        gbc.gridy = 11;
        gbc.gridwidth = 3;
        gbc.anchor = GridBagConstraints.SOUTHWEST;
        panel1.add(DriverUpdateBirthDay, gbc);
        final JLabel label21 = new JLabel();
        Font label21Font = this.$$$getFont$$$("Lato", Font.BOLD, 24, label21.getFont());
        if (label21Font != null) label21.setFont(label21Font);
        label21.setHorizontalAlignment(0);
        label21.setHorizontalTextPosition(0);
        label21.setText("Updating a Driver");
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 32;
        gbc.gridheight = 4;
        gbc.insets = new Insets(0, 0, 20, 0);
        panel1.add(label21, gbc);
        DriverUpdateImageUpload = new JButton();
        DriverUpdateImageUpload.setBackground(new Color(-16758415));
        DriverUpdateImageUpload.setForeground(new Color(-328966));
        DriverUpdateImageUpload.setHorizontalAlignment(0);
        DriverUpdateImageUpload.setHorizontalTextPosition(0);
        DriverUpdateImageUpload.setText("Upload");
        DriverUpdateImageUpload.setVerticalAlignment(3);
        gbc = new GridBagConstraints();
        gbc.gridx = 31;
        gbc.gridy = 12;
        gbc.anchor = GridBagConstraints.SOUTH;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel1.add(DriverUpdateImageUpload, gbc);
        final JLabel label22 = new JLabel();
        Font label22Font = this.$$$getFont$$$(null, -1, -1, label22.getFont());
        if (label22Font != null) label22.setFont(label22Font);
        label22.setForeground(new Color(-12828863));
        label22.setText("Photo");
        gbc = new GridBagConstraints();
        gbc.gridx = 4;
        gbc.gridy = 12;
        gbc.anchor = GridBagConstraints.NORTHWEST;
        gbc.insets = new Insets(12, 150, 0, 0);
        panel1.add(label22, gbc);
        DriverUpdateImageHolder = new JLabel();
        DriverUpdateImageHolder.setText(" ");
        gbc = new GridBagConstraints();
        gbc.gridx = 4;
        gbc.gridy = 13;
        gbc.anchor = GridBagConstraints.EAST;
        gbc.ipady = 20;
        panel1.add(DriverUpdateImageHolder, gbc);
        DriverUpdateSubmitDeleteBtn = new JButton();
        DriverUpdateSubmitDeleteBtn.setBackground(new Color(-3140555));
        DriverUpdateSubmitDeleteBtn.setEnabled(false);
        DriverUpdateSubmitDeleteBtn.setForeground(new Color(-328966));
        DriverUpdateSubmitDeleteBtn.setLabel("Delete Driver");
        DriverUpdateSubmitDeleteBtn.setMargin(new Insets(2, 14, 2, 14));
        DriverUpdateSubmitDeleteBtn.setPreferredSize(new Dimension(150, 32));
        DriverUpdateSubmitDeleteBtn.setText("Delete Driver");
        gbc = new GridBagConstraints();
        gbc.gridx = 9;
        gbc.gridy = 16;
        gbc.gridwidth = 23;
        gbc.insets = new Insets(25, 150, 0, 0);
        panel1.add(DriverUpdateSubmitDeleteBtn, gbc);
        DriverUpdateBirthMonth = new JComboBox();
        DriverUpdateBirthMonth.setBackground(new Color(-1));
        final DefaultComboBoxModel defaultComboBoxModel5 = new DefaultComboBoxModel();
        defaultComboBoxModel5.addElement("1");
        defaultComboBoxModel5.addElement("2");
        defaultComboBoxModel5.addElement("3");
        defaultComboBoxModel5.addElement("4");
        defaultComboBoxModel5.addElement("5");
        defaultComboBoxModel5.addElement("6");
        defaultComboBoxModel5.addElement("7");
        defaultComboBoxModel5.addElement("8");
        defaultComboBoxModel5.addElement("9");
        defaultComboBoxModel5.addElement("10");
        defaultComboBoxModel5.addElement("11");
        defaultComboBoxModel5.addElement("12");
        DriverUpdateBirthMonth.setModel(defaultComboBoxModel5);
        DriverUpdateBirthMonth.setPreferredSize(new Dimension(70, 26));
        gbc = new GridBagConstraints();
        gbc.gridx = 10;
        gbc.gridy = 11;
        gbc.gridwidth = 7;
        gbc.anchor = GridBagConstraints.SOUTHWEST;
        gbc.insets = new Insets(0, 20, 0, 0);
        panel1.add(DriverUpdateBirthMonth, gbc);
        DriverUpdateSubmitUpdateBtn = new JButton();
        DriverUpdateSubmitUpdateBtn.setBackground(new Color(-11551010));
        DriverUpdateSubmitUpdateBtn.setEnabled(false);
        DriverUpdateSubmitUpdateBtn.setForeground(new Color(-328966));
        DriverUpdateSubmitUpdateBtn.setLabel("Update Driver");
        DriverUpdateSubmitUpdateBtn.setPreferredSize(new Dimension(150, 32));
        DriverUpdateSubmitUpdateBtn.setText("Update Driver");
        gbc = new GridBagConstraints();
        gbc.gridx = 4;
        gbc.gridy = 16;
        gbc.gridwidth = 3;
        gbc.insets = new Insets(25, 150, 0, 0);
        panel1.add(DriverUpdateSubmitUpdateBtn, gbc);
        DriverUpdateBirthYear = new JComboBox();
        DriverUpdateBirthYear.setBackground(new Color(-1));
        final DefaultComboBoxModel defaultComboBoxModel6 = new DefaultComboBoxModel();
        defaultComboBoxModel6.addElement("1980");
        defaultComboBoxModel6.addElement("1981");
        defaultComboBoxModel6.addElement("1982");
        defaultComboBoxModel6.addElement("1983");
        defaultComboBoxModel6.addElement("1984");
        defaultComboBoxModel6.addElement("1985");
        defaultComboBoxModel6.addElement("1986");
        defaultComboBoxModel6.addElement("1987");
        defaultComboBoxModel6.addElement("1988");
        defaultComboBoxModel6.addElement("1989");
        defaultComboBoxModel6.addElement("1990");
        defaultComboBoxModel6.addElement("1991");
        defaultComboBoxModel6.addElement("1992");
        defaultComboBoxModel6.addElement("1993");
        defaultComboBoxModel6.addElement("1994");
        defaultComboBoxModel6.addElement("1995");
        defaultComboBoxModel6.addElement("1996");
        defaultComboBoxModel6.addElement("1998");
        defaultComboBoxModel6.addElement("1999");
        defaultComboBoxModel6.addElement("2000");
        DriverUpdateBirthYear.setModel(defaultComboBoxModel6);
        DriverUpdateBirthYear.setPreferredSize(new Dimension(70, 26));
        gbc = new GridBagConstraints();
        gbc.gridx = 17;
        gbc.gridy = 11;
        gbc.gridwidth = 4;
        gbc.anchor = GridBagConstraints.SOUTHWEST;
        gbc.insets = new Insets(0, 20, 0, 0);
        panel1.add(DriverUpdateBirthYear, gbc);
        final JScrollPane scrollPane2 = new JScrollPane();
        gbc = new GridBagConstraints();
        gbc.gridx = 7;
        gbc.gridy = 8;
        gbc.gridwidth = 25;
        gbc.fill = GridBagConstraints.BOTH;
        panel1.add(scrollPane2, gbc);
        DriverUpdateAddress = new JTextArea();
        scrollPane2.setViewportView(DriverUpdateAddress);
        final JLabel label23 = new JLabel();
        Font label23Font = this.$$$getFont$$$(null, -1, -1, label23.getFont());
        if (label23Font != null) label23.setFont(label23Font);
        label23.setForeground(new Color(-12828863));
        label23.setText("New ID :");
        gbc = new GridBagConstraints();
        gbc.gridx = 4;
        gbc.gridy = 5;
        gbc.anchor = GridBagConstraints.NORTH;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.insets = new Insets(12, 150, 0, 0);
        panel1.add(label23, gbc);
        DriverUpdateID = new JTextField();
        DriverUpdateID.setBackground(new Color(-1));
        DriverUpdateID.setPreferredSize(new Dimension(200, 25));
        gbc = new GridBagConstraints();
        gbc.gridx = 7;
        gbc.gridy = 5;
        gbc.gridwidth = 25;
        gbc.anchor = GridBagConstraints.SOUTHWEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel1.add(DriverUpdateID, gbc);
        DriverUpdateRetrieveBtn = new JButton();
        DriverUpdateRetrieveBtn.setBackground(new Color(-16758415));
        DriverUpdateRetrieveBtn.setForeground(new Color(-328966));
        DriverUpdateRetrieveBtn.setText("Retrieve");
        gbc = new GridBagConstraints();
        gbc.gridx = 27;
        gbc.gridy = 4;
        gbc.gridwidth = 5;
        gbc.anchor = GridBagConstraints.NORTH;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.insets = new Insets(0, 0, 20, 0);
        panel1.add(DriverUpdateRetrieveBtn, gbc);
        DriverUpdateCompanyBrand.setBackground(new Color(-1));
        gbc = new GridBagConstraints();
        gbc.gridx = 7;
        gbc.gridy = 14;
        gbc.gridwidth = 25;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel1.add(DriverUpdateCompanyBrand, gbc);
        final JPanel spacer1 = new JPanel();
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        PanelDriverUpdate.add(spacer1, gbc);
        PanelDriverSearch = new JPanel();
        PanelDriverSearch.setLayout(new GridBagLayout());
        CardDriverContainer.add(PanelDriverSearch, "Card4");
        final JLabel label24 = new JLabel();
        Font label24Font = this.$$$getFont$$$("Lato", Font.BOLD, 24, label24.getFont());
        if (label24Font != null) label24.setFont(label24Font);
        label24.setText("Search for a Driver");
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.ipady = 30;
        PanelDriverSearch.add(label24, gbc);
        final JLabel label25 = new JLabel();
        label25.setPreferredSize(new Dimension(14, 26));
        label25.setText("ID");
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.anchor = GridBagConstraints.EAST;
        gbc.insets = new Insets(0, 0, 0, 20);
        PanelDriverSearch.add(label25, gbc);
        DriverSearchID = new JTextField();
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 1;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        PanelDriverSearch.add(DriverSearchID, gbc);
        DriverSearchBtn = new JButton();
        DriverSearchBtn.setBackground(new Color(-16758415));
        DriverSearchBtn.setForeground(new Color(-328966));
        DriverSearchBtn.setText("Search");
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 2;
        gbc.ipadx = 20;
        gbc.insets = new Insets(20, 0, 0, 0);
        PanelDriverSearch.add(DriverSearchBtn, gbc);
        PanelDriverList = new JPanel();
        PanelDriverList.setLayout(new GridBagLayout());
        CardDriverContainer.add(PanelDriverList, "Card3");
        final JLabel label26 = new JLabel();
        Font label26Font = this.$$$getFont$$$("Lato", Font.BOLD, 24, label26.getFont());
        if (label26Font != null) label26.setFont(label26Font);
        label26.setText("Listing all Drivers");
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.ipady = 30;
        PanelDriverList.add(label26, gbc);
        final JScrollPane scrollPane3 = new JScrollPane();
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.gridwidth = 3;
        gbc.fill = GridBagConstraints.BOTH;
        PanelDriverList.add(scrollPane3, gbc);
        DriverListAll.setPreferredSize(new Dimension(700, 400));
        DriverListAll.setRowHeight(30);
        DriverListAll.setRowMargin(2);
        scrollPane3.setViewportView(DriverListAll);
        DriverListRefreshBtn = new JButton();
        DriverListRefreshBtn.setBackground(new Color(-11551010));
        DriverListRefreshBtn.setForeground(new Color(-1));
        DriverListRefreshBtn.setText("Refresh");
        gbc = new GridBagConstraints();
        gbc.gridx = 2;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.EAST;
        gbc.ipadx = 20;
        PanelDriverList.add(DriverListRefreshBtn, gbc);
        CustomerMainPanel = new JPanel();
        CustomerMainPanel.setLayout(new BorderLayout(0, 0));
        CardMainCenterPanelHolder.add(CustomerMainPanel, "Card2");
        CustomerMainHeader = new JPanel();
        CustomerMainHeader.setLayout(new GridBagLayout());
        CustomerMainHeader.setBackground(new Color(-11551010));
        CustomerMainPanel.add(CustomerMainHeader, BorderLayout.NORTH);
        addCustomerBtn = new JButton();
        addCustomerBtn.setActionCommand("Add Employee");
        addCustomerBtn.setBackground(new Color(-16758415));
        addCustomerBtn.setBorderPainted(false);
        addCustomerBtn.setFocusPainted(false);
        addCustomerBtn.setFocusable(false);
        addCustomerBtn.setForeground(new Color(-328966));
        addCustomerBtn.setPreferredSize(new Dimension(160, 65));
        addCustomerBtn.setText("Add Customer");
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.weightx = 0.5;
        gbc.anchor = GridBagConstraints.EAST;
        gbc.insets = new Insets(0, 2, 0, 0);
        CustomerMainHeader.add(addCustomerBtn, gbc);
        updateCustomerBtn = new JButton();
        updateCustomerBtn.setActionCommand("Update Employee");
        updateCustomerBtn.setBackground(new Color(-16758415));
        updateCustomerBtn.setBorderPainted(false);
        updateCustomerBtn.setFocusPainted(false);
        updateCustomerBtn.setFocusable(false);
        updateCustomerBtn.setForeground(new Color(-328966));
        updateCustomerBtn.setPreferredSize(new Dimension(160, 65));
        updateCustomerBtn.setText("Update Customer");
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.EAST;
        gbc.insets = new Insets(0, 2, 0, 0);
        CustomerMainHeader.add(updateCustomerBtn, gbc);
        searchCustomerBtn = new JButton();
        searchCustomerBtn.setActionCommand("Update Employee");
        searchCustomerBtn.setBackground(new Color(-16758415));
        searchCustomerBtn.setBorderPainted(false);
        searchCustomerBtn.setFocusPainted(false);
        searchCustomerBtn.setFocusable(false);
        searchCustomerBtn.setForeground(new Color(-328966));
        searchCustomerBtn.setPreferredSize(new Dimension(160, 65));
        searchCustomerBtn.setText("Search Customer");
        gbc = new GridBagConstraints();
        gbc.gridx = 2;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.EAST;
        gbc.insets = new Insets(0, 2, 0, 0);
        CustomerMainHeader.add(searchCustomerBtn, gbc);
        listCustomerBtn = new JButton();
        listCustomerBtn.setActionCommand("Update Employee");
        listCustomerBtn.setBackground(new Color(-16758415));
        listCustomerBtn.setBorderPainted(false);
        listCustomerBtn.setFocusPainted(false);
        listCustomerBtn.setFocusable(false);
        listCustomerBtn.setForeground(new Color(-328966));
        listCustomerBtn.setPreferredSize(new Dimension(160, 65));
        listCustomerBtn.setText("List all Customer");
        gbc = new GridBagConstraints();
        gbc.gridx = 3;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.EAST;
        gbc.insets = new Insets(0, 2, 0, 0);
        CustomerMainHeader.add(listCustomerBtn, gbc);
        generateTicketBtn = new JButton();
        generateTicketBtn.setActionCommand("");
        generateTicketBtn.setBackground(new Color(-16758415));
        generateTicketBtn.setBorderPainted(false);
        generateTicketBtn.setFocusPainted(false);
        generateTicketBtn.setFocusable(false);
        generateTicketBtn.setForeground(new Color(-328966));
        generateTicketBtn.setLabel("Generate Ticket ");
        generateTicketBtn.setPreferredSize(new Dimension(160, 65));
        generateTicketBtn.setText("Generate Ticket ");
        gbc = new GridBagConstraints();
        gbc.gridx = 4;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.EAST;
        gbc.insets = new Insets(0, 2, 0, 0);
        CustomerMainHeader.add(generateTicketBtn, gbc);
        CardCustomerContainer = new JPanel();
        CardCustomerContainer.setLayout(new CardLayout(0, 0));
        CustomerMainPanel.add(CardCustomerContainer, BorderLayout.CENTER);
        PanelCustomerUpdate = new JPanel();
        PanelCustomerUpdate.setLayout(new GridBagLayout());
        CardCustomerContainer.add(PanelCustomerUpdate, "Card2");
        final JPanel panel2 = new JPanel();
        panel2.setLayout(new GridBagLayout());
        panel2.setBackground(new Color(-1118482));
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.gridwidth = 2;
        PanelCustomerUpdate.add(panel2, gbc);
        final JPanel spacer2 = new JPanel();
        gbc = new GridBagConstraints();
        gbc.gridx = 3;
        gbc.gridy = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel2.add(spacer2, gbc);
        final JPanel spacer3 = new JPanel();
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.fill = GridBagConstraints.VERTICAL;
        panel2.add(spacer3, gbc);
        final JLabel label27 = new JLabel();
        Font label27Font = this.$$$getFont$$$(null, Font.PLAIN, 12, label27.getFont());
        if (label27Font != null) label27.setFont(label27Font);
        label27.setForeground(new Color(-12828863));
        label27.setText("Name :");
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 3;
        gbc.anchor = GridBagConstraints.NORTHWEST;
        gbc.insets = new Insets(25, 150, 0, 0);
        panel2.add(label27, gbc);
        final JLabel label28 = new JLabel();
        Font label28Font = this.$$$getFont$$$(null, Font.PLAIN, 12, label28.getFont());
        if (label28Font != null) label28.setFont(label28Font);
        label28.setForeground(new Color(-12828863));
        label28.setText("Gender :");
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 4;
        gbc.anchor = GridBagConstraints.NORTHWEST;
        gbc.insets = new Insets(25, 150, 0, 0);
        panel2.add(label28, gbc);
        final JLabel label29 = new JLabel();
        Font label29Font = this.$$$getFont$$$(null, Font.PLAIN, 12, label29.getFont());
        if (label29Font != null) label29.setFont(label29Font);
        label29.setForeground(new Color(-12828863));
        label29.setText("E_Mail  :");
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 5;
        gbc.anchor = GridBagConstraints.NORTHWEST;
        gbc.insets = new Insets(25, 150, 0, 0);
        panel2.add(label29, gbc);
        final JLabel label30 = new JLabel();
        Font label30Font = this.$$$getFont$$$(null, Font.PLAIN, 12, label30.getFont());
        if (label30Font != null) label30.setFont(label30Font);
        label30.setForeground(new Color(-12828863));
        label30.setText("Date Of Brith :");
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 7;
        gbc.anchor = GridBagConstraints.NORTHWEST;
        gbc.insets = new Insets(25, 150, 0, 0);
        panel2.add(label30, gbc);
        final JLabel label31 = new JLabel();
        Font label31Font = this.$$$getFont$$$(null, Font.PLAIN, 12, label31.getFont());
        if (label31Font != null) label31.setFont(label31Font);
        label31.setForeground(new Color(-12828863));
        label31.setText("Car Usage :");
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 9;
        gbc.anchor = GridBagConstraints.NORTHWEST;
        gbc.insets = new Insets(25, 150, 0, 0);
        panel2.add(label31, gbc);
        final JLabel label32 = new JLabel();
        Font label32Font = this.$$$getFont$$$(null, Font.PLAIN, 12, label32.getFont());
        if (label32Font != null) label32.setFont(label32Font);
        label32.setForeground(new Color(-12828863));
        label32.setText("Reting Day Nomber :");
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 10;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.insets = new Insets(25, 150, 0, 0);
        panel2.add(label32, gbc);
        final JLabel label33 = new JLabel();
        Font label33Font = this.$$$getFont$$$(null, Font.PLAIN, 12, label33.getFont());
        if (label33Font != null) label33.setFont(label33Font);
        label33.setForeground(new Color(-12828863));
        label33.setText("Book Date :");
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 11;
        gbc.anchor = GridBagConstraints.SOUTHWEST;
        gbc.insets = new Insets(25, 150, 0, 0);
        panel2.add(label33, gbc);
        final JLabel label34 = new JLabel();
        Font label34Font = this.$$$getFont$$$(null, Font.PLAIN, 12, label34.getFont());
        if (label34Font != null) label34.setFont(label34Font);
        label34.setForeground(new Color(-12828863));
        label34.setText("Totel Rent :");
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 12;
        gbc.anchor = GridBagConstraints.SOUTHWEST;
        gbc.insets = new Insets(25, 150, 0, 0);
        panel2.add(label34, gbc);
        CustomerUpdateOldID = new JTextField();
        CustomerUpdateOldID.setBackground(new Color(-1));
        CustomerUpdateOldID.setPreferredSize(new Dimension(200, 25));
        gbc = new GridBagConstraints();
        gbc.gridx = 12;
        gbc.gridy = 1;
        gbc.gridwidth = 7;
        gbc.anchor = GridBagConstraints.SOUTH;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel2.add(CustomerUpdateOldID, gbc);
        CustomerUpdateName = new JTextField();
        CustomerUpdateName.setBackground(new Color(-1));
        CustomerUpdateName.setPreferredSize(new Dimension(200, 25));
        gbc = new GridBagConstraints();
        gbc.gridx = 12;
        gbc.gridy = 3;
        gbc.gridwidth = 8;
        gbc.anchor = GridBagConstraints.SOUTHWEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel2.add(CustomerUpdateName, gbc);
        CustomerUpdateEM = new JTextField();
        CustomerUpdateEM.setBackground(new Color(-1));
        CustomerUpdateEM.setPreferredSize(new Dimension(200, 25));
        gbc = new GridBagConstraints();
        gbc.gridx = 12;
        gbc.gridy = 5;
        gbc.gridwidth = 8;
        gbc.anchor = GridBagConstraints.SOUTHWEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel2.add(CustomerUpdateEM, gbc);
        CustomerUpdateRetingDayNo = new JTextField();
        CustomerUpdateRetingDayNo.setBackground(new Color(-1));
        CustomerUpdateRetingDayNo.setPreferredSize(new Dimension(200, 25));
        gbc = new GridBagConstraints();
        gbc.gridx = 12;
        gbc.gridy = 10;
        gbc.gridwidth = 8;
        gbc.anchor = GridBagConstraints.SOUTHWEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel2.add(CustomerUpdateRetingDayNo, gbc);
        CustomerUpdateTotalRent = new JTextField();
        CustomerUpdateTotalRent.setBackground(new Color(-1));
        CustomerUpdateTotalRent.setPreferredSize(new Dimension(200, 25));
        gbc = new GridBagConstraints();
        gbc.gridx = 12;
        gbc.gridy = 12;
        gbc.gridwidth = 8;
        gbc.anchor = GridBagConstraints.SOUTHWEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel2.add(CustomerUpdateTotalRent, gbc);
        CustomerUpdateGenderMale = new JRadioButton();
        CustomerUpdateGenderMale.setBackground(new Color(-1118482));
        Font CustomerUpdateGenderMaleFont = this.$$$getFont$$$(null, Font.BOLD, 12, CustomerUpdateGenderMale.getFont());
        if (CustomerUpdateGenderMaleFont != null) CustomerUpdateGenderMale.setFont(CustomerUpdateGenderMaleFont);
        CustomerUpdateGenderMale.setForeground(new Color(-12828863));
        CustomerUpdateGenderMale.setText("Male");
        gbc = new GridBagConstraints();
        gbc.gridx = 12;
        gbc.gridy = 4;
        gbc.anchor = GridBagConstraints.SOUTHWEST;
        panel2.add(CustomerUpdateGenderMale, gbc);
        CustomerUpdateBookDay = new JComboBox();
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
        CustomerUpdateBookDay.setModel(defaultComboBoxModel7);
        CustomerUpdateBookDay.setPreferredSize(new Dimension(70, 26));
        gbc = new GridBagConstraints();
        gbc.gridx = 12;
        gbc.gridy = 11;
        gbc.anchor = GridBagConstraints.SOUTHWEST;
        panel2.add(CustomerUpdateBookDay, gbc);
        CustomerUpdateBookMonth = new JComboBox();
        CustomerUpdateBookMonth.setBackground(new Color(-1118482));
        final DefaultComboBoxModel defaultComboBoxModel8 = new DefaultComboBoxModel();
        defaultComboBoxModel8.addElement("1");
        defaultComboBoxModel8.addElement("2");
        defaultComboBoxModel8.addElement("3");
        defaultComboBoxModel8.addElement("4");
        defaultComboBoxModel8.addElement("5");
        defaultComboBoxModel8.addElement("6");
        defaultComboBoxModel8.addElement("7");
        defaultComboBoxModel8.addElement("8");
        defaultComboBoxModel8.addElement("9");
        defaultComboBoxModel8.addElement("10");
        defaultComboBoxModel8.addElement("11");
        defaultComboBoxModel8.addElement("12");
        CustomerUpdateBookMonth.setModel(defaultComboBoxModel8);
        CustomerUpdateBookMonth.setPreferredSize(new Dimension(70, 26));
        gbc = new GridBagConstraints();
        gbc.gridx = 16;
        gbc.gridy = 11;
        gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.SOUTHEAST;
        gbc.insets = new Insets(0, 20, 0, 0);
        panel2.add(CustomerUpdateBookMonth, gbc);
        final JLabel label35 = new JLabel();
        Font label35Font = this.$$$getFont$$$("Lato", Font.BOLD, 24, label35.getFont());
        if (label35Font != null) label35.setFont(label35Font);
        label35.setText("Update Customer");
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.gridwidth = 17;
        gbc.insets = new Insets(0, 150, 15, 0);
        panel2.add(label35, gbc);
        CustomerUpdateID = new JTextField();
        CustomerUpdateID.setBackground(new Color(-1));
        CustomerUpdateID.setPreferredSize(new Dimension(180, 28));
        CustomerUpdateID.setText("");
        gbc = new GridBagConstraints();
        gbc.gridx = 12;
        gbc.gridy = 2;
        gbc.gridwidth = 8;
        gbc.anchor = GridBagConstraints.SOUTHWEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel2.add(CustomerUpdateID, gbc);
        final JLabel label36 = new JLabel();
        Font label36Font = this.$$$getFont$$$(null, Font.PLAIN, 12, label36.getFont());
        if (label36Font != null) label36.setFont(label36Font);
        label36.setForeground(new Color(-12828863));
        label36.setText("New ID :");
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 2;
        gbc.anchor = GridBagConstraints.NORTHWEST;
        gbc.insets = new Insets(25, 150, 0, 0);
        panel2.add(label36, gbc);
        CustomerUpdatePhone = new JTextField();
        CustomerUpdatePhone.setBackground(new Color(-1));
        CustomerUpdatePhone.setPreferredSize(new Dimension(200, 25));
        gbc = new GridBagConstraints();
        gbc.gridx = 12;
        gbc.gridy = 8;
        gbc.gridwidth = 8;
        gbc.anchor = GridBagConstraints.SOUTHWEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel2.add(CustomerUpdatePhone, gbc);
        final JLabel label37 = new JLabel();
        Font label37Font = this.$$$getFont$$$(null, Font.PLAIN, 12, label37.getFont());
        if (label37Font != null) label37.setFont(label37Font);
        label37.setForeground(new Color(-12828863));
        label37.setText("Phone :");
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 8;
        gbc.anchor = GridBagConstraints.NORTHWEST;
        gbc.insets = new Insets(25, 150, 0, 0);
        panel2.add(label37, gbc);
        CustomerUpdateCarUsage = new JComboBox();
        CustomerUpdateCarUsage.setBackground(new Color(-1));
        final DefaultComboBoxModel defaultComboBoxModel9 = new DefaultComboBoxModel();
        CustomerUpdateCarUsage.setModel(defaultComboBoxModel9);
        CustomerUpdateCarUsage.setPreferredSize(new Dimension(200, 26));
        gbc = new GridBagConstraints();
        gbc.gridx = 12;
        gbc.gridy = 9;
        gbc.gridwidth = 8;
        gbc.anchor = GridBagConstraints.SOUTH;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel2.add(CustomerUpdateCarUsage, gbc);
        final JLabel label38 = new JLabel();
        Font label38Font = this.$$$getFont$$$(null, Font.PLAIN, 12, label38.getFont());
        if (label38Font != null) label38.setFont(label38Font);
        label38.setForeground(new Color(-12828863));
        label38.setText("ID :");
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 1;
        gbc.anchor = GridBagConstraints.NORTHWEST;
        gbc.insets = new Insets(25, 150, 0, 0);
        panel2.add(label38, gbc);
        CustomerUpdateSubmitUpdateBtn = new JButton();
        CustomerUpdateSubmitUpdateBtn.setBackground(new Color(-11551010));
        CustomerUpdateSubmitUpdateBtn.setForeground(new Color(-328966));
        CustomerUpdateSubmitUpdateBtn.setLabel("Update Customer");
        CustomerUpdateSubmitUpdateBtn.setPreferredSize(new Dimension(150, 32));
        CustomerUpdateSubmitUpdateBtn.setText("Update Customer");
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 13;
        gbc.gridwidth = 16;
        gbc.anchor = GridBagConstraints.NORTHWEST;
        gbc.insets = new Insets(30, 150, 30, 0);
        panel2.add(CustomerUpdateSubmitUpdateBtn, gbc);
        CustomerUpdateSubmitDeleteBtn = new JButton();
        CustomerUpdateSubmitDeleteBtn.setBackground(new Color(-11551010));
        CustomerUpdateSubmitDeleteBtn.setForeground(new Color(-328966));
        CustomerUpdateSubmitDeleteBtn.setLabel("Delete Customer");
        CustomerUpdateSubmitDeleteBtn.setPreferredSize(new Dimension(150, 32));
        CustomerUpdateSubmitDeleteBtn.setText("Delete Customer");
        gbc = new GridBagConstraints();
        gbc.gridx = 17;
        gbc.gridy = 13;
        gbc.gridwidth = 3;
        gbc.anchor = GridBagConstraints.NORTHEAST;
        gbc.insets = new Insets(30, 150, 30, 0);
        panel2.add(CustomerUpdateSubmitDeleteBtn, gbc);
        CustomerUpdateRetrieveBtn = new JButton();
        CustomerUpdateRetrieveBtn.setBackground(new Color(-16758415));
        CustomerUpdateRetrieveBtn.setForeground(new Color(-328966));
        CustomerUpdateRetrieveBtn.setPreferredSize(new Dimension(150, 32));
        CustomerUpdateRetrieveBtn.setText("Retreive");
        gbc = new GridBagConstraints();
        gbc.gridx = 19;
        gbc.gridy = 1;
        gbc.anchor = GridBagConstraints.SOUTHEAST;
        panel2.add(CustomerUpdateRetrieveBtn, gbc);
        CustomerUpdateBrithDay = new JComboBox();
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
        CustomerUpdateBrithDay.setModel(defaultComboBoxModel10);
        CustomerUpdateBrithDay.setPreferredSize(new Dimension(70, 26));
        gbc = new GridBagConstraints();
        gbc.gridx = 12;
        gbc.gridy = 7;
        gbc.anchor = GridBagConstraints.SOUTHWEST;
        panel2.add(CustomerUpdateBrithDay, gbc);
        CustomerUpdateGenderFemale = new JRadioButton();
        CustomerUpdateGenderFemale.setBackground(new Color(-1118482));
        Font CustomerUpdateGenderFemaleFont = this.$$$getFont$$$(null, Font.BOLD, 12, CustomerUpdateGenderFemale.getFont());
        if (CustomerUpdateGenderFemaleFont != null) CustomerUpdateGenderFemale.setFont(CustomerUpdateGenderFemaleFont);
        CustomerUpdateGenderFemale.setForeground(new Color(-12828863));
        CustomerUpdateGenderFemale.setText("Female");
        gbc = new GridBagConstraints();
        gbc.gridx = 19;
        gbc.gridy = 4;
        gbc.anchor = GridBagConstraints.SOUTHEAST;
        panel2.add(CustomerUpdateGenderFemale, gbc);
        CustomerUpdateBirthYear = new JComboBox();
        final DefaultComboBoxModel defaultComboBoxModel11 = new DefaultComboBoxModel();
        defaultComboBoxModel11.addElement("1980");
        defaultComboBoxModel11.addElement("1981");
        defaultComboBoxModel11.addElement("1982");
        defaultComboBoxModel11.addElement("1983");
        defaultComboBoxModel11.addElement("1984");
        defaultComboBoxModel11.addElement("1985");
        defaultComboBoxModel11.addElement("1986");
        defaultComboBoxModel11.addElement("1987");
        defaultComboBoxModel11.addElement("1988");
        defaultComboBoxModel11.addElement("1989");
        defaultComboBoxModel11.addElement("1990");
        defaultComboBoxModel11.addElement("1991");
        defaultComboBoxModel11.addElement("1992");
        defaultComboBoxModel11.addElement("1993");
        defaultComboBoxModel11.addElement("1994");
        defaultComboBoxModel11.addElement("1995");
        defaultComboBoxModel11.addElement("1996");
        defaultComboBoxModel11.addElement("1998");
        defaultComboBoxModel11.addElement("1999");
        defaultComboBoxModel11.addElement("2000");
        CustomerUpdateBirthYear.setModel(defaultComboBoxModel11);
        CustomerUpdateBirthYear.setPreferredSize(new Dimension(70, 26));
        gbc = new GridBagConstraints();
        gbc.gridx = 18;
        gbc.gridy = 7;
        gbc.anchor = GridBagConstraints.SOUTHEAST;
        gbc.insets = new Insets(0, 20, 0, 0);
        panel2.add(CustomerUpdateBirthYear, gbc);
        CustomerUpdateBrithMonth = new JComboBox();
        CustomerUpdateBrithMonth.setBackground(new Color(-1118482));
        final DefaultComboBoxModel defaultComboBoxModel12 = new DefaultComboBoxModel();
        defaultComboBoxModel12.addElement("1");
        defaultComboBoxModel12.addElement("2");
        defaultComboBoxModel12.addElement("3");
        defaultComboBoxModel12.addElement("4");
        defaultComboBoxModel12.addElement("5");
        defaultComboBoxModel12.addElement("6");
        defaultComboBoxModel12.addElement("7");
        defaultComboBoxModel12.addElement("8");
        defaultComboBoxModel12.addElement("9");
        defaultComboBoxModel12.addElement("10");
        defaultComboBoxModel12.addElement("11");
        defaultComboBoxModel12.addElement("12");
        CustomerUpdateBrithMonth.setModel(defaultComboBoxModel12);
        CustomerUpdateBrithMonth.setPreferredSize(new Dimension(70, 26));
        gbc = new GridBagConstraints();
        gbc.gridx = 17;
        gbc.gridy = 7;
        gbc.anchor = GridBagConstraints.SOUTHWEST;
        gbc.insets = new Insets(0, 20, 0, 0);
        panel2.add(CustomerUpdateBrithMonth, gbc);
        CustomerUpdateBookYear = new JComboBox();
        final DefaultComboBoxModel defaultComboBoxModel13 = new DefaultComboBoxModel();
        defaultComboBoxModel13.addElement("1980");
        defaultComboBoxModel13.addElement("1981");
        defaultComboBoxModel13.addElement("1982");
        defaultComboBoxModel13.addElement("1983");
        defaultComboBoxModel13.addElement("1984");
        defaultComboBoxModel13.addElement("1985");
        defaultComboBoxModel13.addElement("1986");
        defaultComboBoxModel13.addElement("1987");
        defaultComboBoxModel13.addElement("1988");
        defaultComboBoxModel13.addElement("1989");
        defaultComboBoxModel13.addElement("1990");
        defaultComboBoxModel13.addElement("1991");
        defaultComboBoxModel13.addElement("1992");
        defaultComboBoxModel13.addElement("1993");
        defaultComboBoxModel13.addElement("1994");
        defaultComboBoxModel13.addElement("1995");
        defaultComboBoxModel13.addElement("1996");
        defaultComboBoxModel13.addElement("1998");
        defaultComboBoxModel13.addElement("1999");
        defaultComboBoxModel13.addElement("2000");
        CustomerUpdateBookYear.setModel(defaultComboBoxModel13);
        CustomerUpdateBookYear.setPreferredSize(new Dimension(70, 26));
        gbc = new GridBagConstraints();
        gbc.gridx = 18;
        gbc.gridy = 11;
        gbc.anchor = GridBagConstraints.SOUTHEAST;
        gbc.insets = new Insets(0, 20, 0, 0);
        panel2.add(CustomerUpdateBookYear, gbc);
        final JLabel label39 = new JLabel();
        Font label39Font = this.$$$getFont$$$(null, Font.PLAIN, 12, label39.getFont());
        if (label39Font != null) label39.setFont(label39Font);
        label39.setForeground(new Color(-12828863));
        label39.setText("Address :");
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 6;
        gbc.anchor = GridBagConstraints.NORTHWEST;
        gbc.insets = new Insets(25, 150, 0, 0);
        panel2.add(label39, gbc);
        CustomerUpdateAddress = new JTextField();
        CustomerUpdateAddress.setBackground(new Color(-1));
        CustomerUpdateAddress.setPreferredSize(new Dimension(200, 25));
        gbc = new GridBagConstraints();
        gbc.gridx = 12;
        gbc.gridy = 6;
        gbc.gridwidth = 8;
        gbc.anchor = GridBagConstraints.SOUTHWEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel2.add(CustomerUpdateAddress, gbc);
        PanelCustomerList = new JPanel();
        PanelCustomerList.setLayout(new GridBagLayout());
        CardCustomerContainer.add(PanelCustomerList, "Card3");
        final JScrollPane scrollPane4 = new JScrollPane();
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.gridwidth = 2;
        gbc.fill = GridBagConstraints.BOTH;
        PanelCustomerList.add(scrollPane4, gbc);
        scrollPane4.setViewportView(CustomerListAll);
        final JPanel spacer4 = new JPanel();
        gbc = new GridBagConstraints();
        gbc.gridx = 2;
        gbc.gridy = 1;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        PanelCustomerList.add(spacer4, gbc);
        final JPanel spacer5 = new JPanel();
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.gridwidth = 2;
        gbc.fill = GridBagConstraints.VERTICAL;
        PanelCustomerList.add(spacer5, gbc);
        final JLabel label40 = new JLabel();
        Font label40Font = this.$$$getFont$$$("Lato", Font.BOLD, 24, label40.getFont());
        if (label40Font != null) label40.setFont(label40Font);
        label40.setText("Listing all Customers");
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.ipady = 30;
        PanelCustomerList.add(label40, gbc);
        CustomerListRefreshBtn = new JButton();
        CustomerListRefreshBtn.setBackground(new Color(-11551010));
        CustomerListRefreshBtn.setForeground(new Color(-1));
        CustomerListRefreshBtn.setPreferredSize(new Dimension(150, 32));
        CustomerListRefreshBtn.setText("Refresh");
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.EAST;
        gbc.ipadx = 20;
        PanelCustomerList.add(CustomerListRefreshBtn, gbc);
        PanelCustomerSearch = new JPanel();
        PanelCustomerSearch.setLayout(new GridBagLayout());
        CardCustomerContainer.add(PanelCustomerSearch, "Card4");
        final JLabel label41 = new JLabel();
        Font label41Font = this.$$$getFont$$$("Lato", Font.BOLD, 24, label41.getFont());
        if (label41Font != null) label41.setFont(label41Font);
        label41.setText("Search for a Customer");
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.ipady = 30;
        PanelCustomerSearch.add(label41, gbc);
        final JLabel label42 = new JLabel();
        label42.setText("ID");
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.anchor = GridBagConstraints.WEST;
        PanelCustomerSearch.add(label42, gbc);
        final JScrollPane scrollPane5 = new JScrollPane();
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 2;
        gbc.gridwidth = 2;
        gbc.fill = GridBagConstraints.BOTH;
        gbc.insets = new Insets(40, 0, 0, 0);
        PanelCustomerSearch.add(scrollPane5, gbc);
        scrollPane5.setViewportView(CustomerSearchTable);
        CustomerSearchID = new JTextField();
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 1;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        PanelCustomerSearch.add(CustomerSearchID, gbc);
        CustomerSearchBtn = new JButton();
        CustomerSearchBtn.setBackground(new Color(-16758415));
        CustomerSearchBtn.setForeground(new Color(-328966));
        CustomerSearchBtn.setPreferredSize(new Dimension(150, 32));
        CustomerSearchBtn.setText("Search");
        gbc = new GridBagConstraints();
        gbc.gridx = 2;
        gbc.gridy = 1;
        gbc.anchor = GridBagConstraints.EAST;
        PanelCustomerSearch.add(CustomerSearchBtn, gbc);
        MainPanelCustomerAdd = new JPanel();
        MainPanelCustomerAdd.setLayout(new CardLayout(0, 0));
        CardCustomerContainer.add(MainPanelCustomerAdd, "Card7");
        PanelCustomerAdd = new JPanel();
        PanelCustomerAdd.setLayout(new GridBagLayout());
        MainPanelCustomerAdd.add(PanelCustomerAdd, "Card1");
        final JPanel panel3 = new JPanel();
        panel3.setLayout(new GridBagLayout());
        panel3.setAlignmentX(0.5f);
        panel3.setAlignmentY(0.5f);
        panel3.setBackground(new Color(-1118482));
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 2;
        PanelCustomerAdd.add(panel3, gbc);
        final JLabel label43 = new JLabel();
        Font label43Font = this.$$$getFont$$$(null, -1, -1, label43.getFont());
        if (label43Font != null) label43.setFont(label43Font);
        label43.setForeground(new Color(-12828863));
        label43.setText("ID :");
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 2;
        gbc.anchor = GridBagConstraints.NORTHWEST;
        gbc.insets = new Insets(25, 150, 0, 0);
        panel3.add(label43, gbc);
        final JPanel spacer6 = new JPanel();
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.fill = GridBagConstraints.VERTICAL;
        panel3.add(spacer6, gbc);
        final JLabel label44 = new JLabel();
        Font label44Font = this.$$$getFont$$$(null, -1, -1, label44.getFont());
        if (label44Font != null) label44.setFont(label44Font);
        label44.setForeground(new Color(-12828863));
        label44.setText("Name :");
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 3;
        gbc.anchor = GridBagConstraints.NORTHWEST;
        gbc.insets = new Insets(25, 150, 0, 0);
        panel3.add(label44, gbc);
        final JLabel label45 = new JLabel();
        Font label45Font = this.$$$getFont$$$(null, -1, -1, label45.getFont());
        if (label45Font != null) label45.setFont(label45Font);
        label45.setForeground(new Color(-12828863));
        label45.setText("Gender :");
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 4;
        gbc.anchor = GridBagConstraints.NORTHWEST;
        gbc.insets = new Insets(25, 150, 0, 0);
        panel3.add(label45, gbc);
        final JLabel label46 = new JLabel();
        Font label46Font = this.$$$getFont$$$(null, -1, -1, label46.getFont());
        if (label46Font != null) label46.setFont(label46Font);
        label46.setForeground(new Color(-12828863));
        label46.setText("Address :");
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 5;
        gbc.anchor = GridBagConstraints.NORTHWEST;
        gbc.insets = new Insets(25, 150, 0, 0);
        panel3.add(label46, gbc);
        final JLabel label47 = new JLabel();
        Font label47Font = this.$$$getFont$$$(null, -1, -1, label47.getFont());
        if (label47Font != null) label47.setFont(label47Font);
        label47.setForeground(new Color(-12828863));
        label47.setText("Date Of Brith :");
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 12;
        gbc.anchor = GridBagConstraints.NORTHWEST;
        gbc.insets = new Insets(25, 150, 0, 0);
        panel3.add(label47, gbc);
        final JLabel label48 = new JLabel();
        Font label48Font = this.$$$getFont$$$(null, -1, -1, label48.getFont());
        if (label48Font != null) label48.setFont(label48Font);
        label48.setForeground(new Color(-12828863));
        label48.setText("Phone :");
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 13;
        gbc.anchor = GridBagConstraints.NORTHWEST;
        gbc.insets = new Insets(25, 150, 0, 0);
        panel3.add(label48, gbc);
        final JLabel label49 = new JLabel();
        Font label49Font = this.$$$getFont$$$(null, -1, -1, label49.getFont());
        if (label49Font != null) label49.setFont(label49Font);
        label49.setForeground(new Color(-12828863));
        label49.setText("Reting Day Number :");
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 15;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.insets = new Insets(25, 150, 0, 0);
        panel3.add(label49, gbc);
        final JLabel label50 = new JLabel();
        Font label50Font = this.$$$getFont$$$(null, -1, -1, label50.getFont());
        if (label50Font != null) label50.setFont(label50Font);
        label50.setForeground(new Color(-12828863));
        label50.setText("Book Date :");
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 16;
        gbc.anchor = GridBagConstraints.SOUTHWEST;
        gbc.insets = new Insets(25, 150, 0, 0);
        panel3.add(label50, gbc);
        CustomerAddID = new JTextField();
        CustomerAddID.setBackground(new Color(-1));
        CustomerAddID.setPreferredSize(new Dimension(200, 25));
        gbc = new GridBagConstraints();
        gbc.gridx = 2;
        gbc.gridy = 0;
        gbc.gridwidth = 12;
        gbc.gridheight = 3;
        gbc.anchor = GridBagConstraints.SOUTHWEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel3.add(CustomerAddID, gbc);
        CustomerAddName = new JTextField();
        CustomerAddName.setBackground(new Color(-1));
        CustomerAddName.setPreferredSize(new Dimension(200, 25));
        gbc = new GridBagConstraints();
        gbc.gridx = 2;
        gbc.gridy = 3;
        gbc.gridwidth = 12;
        gbc.anchor = GridBagConstraints.SOUTHWEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel3.add(CustomerAddName, gbc);
        CustomerAddRentingDaysNo = new JTextField();
        CustomerAddRentingDaysNo.setBackground(new Color(-1));
        CustomerAddRentingDaysNo.setPreferredSize(new Dimension(200, 25));
        gbc = new GridBagConstraints();
        gbc.gridx = 2;
        gbc.gridy = 15;
        gbc.gridwidth = 12;
        gbc.anchor = GridBagConstraints.SOUTHWEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel3.add(CustomerAddRentingDaysNo, gbc);
        CustomerAddGenderMale = new JRadioButton();
        CustomerAddGenderMale.setBackground(new Color(-1118482));
        Font CustomerAddGenderMaleFont = this.$$$getFont$$$(null, Font.BOLD, 12, CustomerAddGenderMale.getFont());
        if (CustomerAddGenderMaleFont != null) CustomerAddGenderMale.setFont(CustomerAddGenderMaleFont);
        CustomerAddGenderMale.setForeground(new Color(-12828863));
        CustomerAddGenderMale.setText("Male");
        gbc = new GridBagConstraints();
        gbc.gridx = 2;
        gbc.gridy = 4;
        gbc.anchor = GridBagConstraints.SOUTHWEST;
        panel3.add(CustomerAddGenderMale, gbc);
        CustomerAddBirthDay = new JComboBox();
        CustomerAddBirthDay.setBackground(new Color(-1));
        final DefaultComboBoxModel defaultComboBoxModel14 = new DefaultComboBoxModel();
        defaultComboBoxModel14.addElement("1");
        defaultComboBoxModel14.addElement("2");
        defaultComboBoxModel14.addElement("3");
        defaultComboBoxModel14.addElement("4");
        defaultComboBoxModel14.addElement("5");
        defaultComboBoxModel14.addElement("6");
        defaultComboBoxModel14.addElement("7");
        defaultComboBoxModel14.addElement("8");
        defaultComboBoxModel14.addElement("9");
        defaultComboBoxModel14.addElement("10");
        defaultComboBoxModel14.addElement("11");
        defaultComboBoxModel14.addElement("12");
        defaultComboBoxModel14.addElement("13");
        defaultComboBoxModel14.addElement("14");
        defaultComboBoxModel14.addElement("15");
        defaultComboBoxModel14.addElement("16");
        defaultComboBoxModel14.addElement("17");
        defaultComboBoxModel14.addElement("18");
        defaultComboBoxModel14.addElement("19");
        defaultComboBoxModel14.addElement("20");
        defaultComboBoxModel14.addElement("21");
        defaultComboBoxModel14.addElement("22");
        defaultComboBoxModel14.addElement("23");
        defaultComboBoxModel14.addElement("24");
        defaultComboBoxModel14.addElement("25");
        defaultComboBoxModel14.addElement("26");
        defaultComboBoxModel14.addElement("27");
        defaultComboBoxModel14.addElement("28");
        defaultComboBoxModel14.addElement("29");
        defaultComboBoxModel14.addElement("30");
        defaultComboBoxModel14.addElement("31");
        CustomerAddBirthDay.setModel(defaultComboBoxModel14);
        CustomerAddBirthDay.setPreferredSize(new Dimension(70, 26));
        gbc = new GridBagConstraints();
        gbc.gridx = 2;
        gbc.gridy = 11;
        gbc.gridheight = 2;
        gbc.anchor = GridBagConstraints.SOUTHWEST;
        panel3.add(CustomerAddBirthDay, gbc);
        CustomerAddBirthMonth = new JComboBox();
        CustomerAddBirthMonth.setBackground(new Color(-1));
        final DefaultComboBoxModel defaultComboBoxModel15 = new DefaultComboBoxModel();
        defaultComboBoxModel15.addElement("1");
        defaultComboBoxModel15.addElement("2");
        defaultComboBoxModel15.addElement("3");
        defaultComboBoxModel15.addElement("4");
        defaultComboBoxModel15.addElement("5");
        defaultComboBoxModel15.addElement("6");
        defaultComboBoxModel15.addElement("7");
        defaultComboBoxModel15.addElement("8");
        defaultComboBoxModel15.addElement("9");
        defaultComboBoxModel15.addElement("10");
        defaultComboBoxModel15.addElement("11");
        defaultComboBoxModel15.addElement("12");
        CustomerAddBirthMonth.setModel(defaultComboBoxModel15);
        CustomerAddBirthMonth.setPreferredSize(new Dimension(70, 26));
        gbc = new GridBagConstraints();
        gbc.gridx = 11;
        gbc.gridy = 9;
        gbc.gridheight = 4;
        gbc.anchor = GridBagConstraints.SOUTHWEST;
        gbc.insets = new Insets(0, 20, 0, 0);
        panel3.add(CustomerAddBirthMonth, gbc);
        CustomerAddBirthYear = new JComboBox();
        CustomerAddBirthYear.setBackground(new Color(-1));
        final DefaultComboBoxModel defaultComboBoxModel16 = new DefaultComboBoxModel();
        defaultComboBoxModel16.addElement("1980");
        defaultComboBoxModel16.addElement("1981");
        defaultComboBoxModel16.addElement("1982");
        defaultComboBoxModel16.addElement("1983");
        defaultComboBoxModel16.addElement("1984");
        defaultComboBoxModel16.addElement("1985");
        defaultComboBoxModel16.addElement("1986");
        defaultComboBoxModel16.addElement("1987");
        defaultComboBoxModel16.addElement("1988");
        defaultComboBoxModel16.addElement("1989");
        defaultComboBoxModel16.addElement("1990");
        defaultComboBoxModel16.addElement("1991");
        defaultComboBoxModel16.addElement("1992");
        defaultComboBoxModel16.addElement("1993");
        defaultComboBoxModel16.addElement("1994");
        defaultComboBoxModel16.addElement("1995");
        defaultComboBoxModel16.addElement("1996");
        defaultComboBoxModel16.addElement("1998");
        defaultComboBoxModel16.addElement("1999");
        defaultComboBoxModel16.addElement("2000");
        CustomerAddBirthYear.setModel(defaultComboBoxModel16);
        CustomerAddBirthYear.setPreferredSize(new Dimension(70, 26));
        gbc = new GridBagConstraints();
        gbc.gridx = 12;
        gbc.gridy = 7;
        gbc.gridwidth = 2;
        gbc.gridheight = 6;
        gbc.anchor = GridBagConstraints.SOUTHWEST;
        gbc.insets = new Insets(0, 20, 0, 0);
        panel3.add(CustomerAddBirthYear, gbc);
        CustomerAddBookDay = new JComboBox();
        CustomerAddBookDay.setBackground(new Color(-1));
        final DefaultComboBoxModel defaultComboBoxModel17 = new DefaultComboBoxModel();
        defaultComboBoxModel17.addElement("1");
        defaultComboBoxModel17.addElement("2");
        defaultComboBoxModel17.addElement("3");
        defaultComboBoxModel17.addElement("4");
        defaultComboBoxModel17.addElement("5");
        defaultComboBoxModel17.addElement("6");
        defaultComboBoxModel17.addElement("7");
        defaultComboBoxModel17.addElement("8");
        defaultComboBoxModel17.addElement("9");
        defaultComboBoxModel17.addElement("10");
        defaultComboBoxModel17.addElement("11");
        defaultComboBoxModel17.addElement("12");
        defaultComboBoxModel17.addElement("13");
        defaultComboBoxModel17.addElement("14");
        defaultComboBoxModel17.addElement("15");
        defaultComboBoxModel17.addElement("16");
        defaultComboBoxModel17.addElement("17");
        defaultComboBoxModel17.addElement("18");
        defaultComboBoxModel17.addElement("19");
        defaultComboBoxModel17.addElement("20");
        defaultComboBoxModel17.addElement("21");
        defaultComboBoxModel17.addElement("22");
        defaultComboBoxModel17.addElement("23");
        defaultComboBoxModel17.addElement("24");
        defaultComboBoxModel17.addElement("25");
        defaultComboBoxModel17.addElement("26");
        defaultComboBoxModel17.addElement("27");
        defaultComboBoxModel17.addElement("28");
        defaultComboBoxModel17.addElement("29");
        defaultComboBoxModel17.addElement("30");
        defaultComboBoxModel17.addElement("31");
        CustomerAddBookDay.setModel(defaultComboBoxModel17);
        CustomerAddBookDay.setPreferredSize(new Dimension(70, 26));
        gbc = new GridBagConstraints();
        gbc.gridx = 2;
        gbc.gridy = 16;
        gbc.anchor = GridBagConstraints.SOUTHWEST;
        panel3.add(CustomerAddBookDay, gbc);
        CustomerAddBookMonth = new JComboBox();
        CustomerAddBookMonth.setBackground(new Color(-1));
        final DefaultComboBoxModel defaultComboBoxModel18 = new DefaultComboBoxModel();
        defaultComboBoxModel18.addElement("1");
        defaultComboBoxModel18.addElement("2");
        defaultComboBoxModel18.addElement("3");
        defaultComboBoxModel18.addElement("4");
        defaultComboBoxModel18.addElement("5");
        defaultComboBoxModel18.addElement("6");
        defaultComboBoxModel18.addElement("7");
        defaultComboBoxModel18.addElement("8");
        defaultComboBoxModel18.addElement("9");
        defaultComboBoxModel18.addElement("10");
        defaultComboBoxModel18.addElement("11");
        defaultComboBoxModel18.addElement("12");
        CustomerAddBookMonth.setModel(defaultComboBoxModel18);
        CustomerAddBookMonth.setPreferredSize(new Dimension(70, 26));
        gbc = new GridBagConstraints();
        gbc.gridx = 11;
        gbc.gridy = 16;
        gbc.anchor = GridBagConstraints.SOUTHWEST;
        gbc.insets = new Insets(0, 20, 0, 0);
        panel3.add(CustomerAddBookMonth, gbc);
        CustomerAddBookYear = new JComboBox();
        CustomerAddBookYear.setBackground(new Color(-1));
        final DefaultComboBoxModel defaultComboBoxModel19 = new DefaultComboBoxModel();
        defaultComboBoxModel19.addElement("1980");
        defaultComboBoxModel19.addElement("1981");
        defaultComboBoxModel19.addElement("1982");
        defaultComboBoxModel19.addElement("1983");
        defaultComboBoxModel19.addElement("1984");
        defaultComboBoxModel19.addElement("1985");
        defaultComboBoxModel19.addElement("1986");
        defaultComboBoxModel19.addElement("1987");
        defaultComboBoxModel19.addElement("1988");
        defaultComboBoxModel19.addElement("1989");
        defaultComboBoxModel19.addElement("1990");
        defaultComboBoxModel19.addElement("1991");
        defaultComboBoxModel19.addElement("1992");
        defaultComboBoxModel19.addElement("1993");
        defaultComboBoxModel19.addElement("1994");
        defaultComboBoxModel19.addElement("1995");
        defaultComboBoxModel19.addElement("1996");
        defaultComboBoxModel19.addElement("1998");
        defaultComboBoxModel19.addElement("1999");
        defaultComboBoxModel19.addElement("2000");
        CustomerAddBookYear.setModel(defaultComboBoxModel19);
        CustomerAddBookYear.setPreferredSize(new Dimension(70, 26));
        gbc = new GridBagConstraints();
        gbc.gridx = 12;
        gbc.gridy = 16;
        gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.SOUTHWEST;
        gbc.insets = new Insets(0, 20, 0, 0);
        panel3.add(CustomerAddBookYear, gbc);
        CustomerAddGenderFamale = new JRadioButton();
        CustomerAddGenderFamale.setBackground(new Color(-1118482));
        Font CustomerAddGenderFamaleFont = this.$$$getFont$$$(null, Font.BOLD, 12, CustomerAddGenderFamale.getFont());
        if (CustomerAddGenderFamaleFont != null) CustomerAddGenderFamale.setFont(CustomerAddGenderFamaleFont);
        CustomerAddGenderFamale.setForeground(new Color(-12828863));
        CustomerAddGenderFamale.setText("Female");
        gbc = new GridBagConstraints();
        gbc.gridx = 8;
        gbc.gridy = 4;
        gbc.gridwidth = 4;
        gbc.anchor = GridBagConstraints.SOUTHEAST;
        panel3.add(CustomerAddGenderFamale, gbc);
        final JScrollPane scrollPane6 = new JScrollPane();
        gbc = new GridBagConstraints();
        gbc.gridx = 2;
        gbc.gridy = 5;
        gbc.gridwidth = 12;
        gbc.fill = GridBagConstraints.BOTH;
        panel3.add(scrollPane6, gbc);
        CustomerAddAddress = new JTextArea();
        CustomerAddAddress.setMargin(new Insets(0, 0, 0, 0));
        CustomerAddAddress.setPreferredSize(new Dimension(0, 57));
        CustomerAddAddress.setRows(3);
        scrollPane6.setViewportView(CustomerAddAddress);
        final JLabel label51 = new JLabel();
        Font label51Font = this.$$$getFont$$$(null, -1, -1, label51.getFont());
        if (label51Font != null) label51.setFont(label51Font);
        label51.setForeground(new Color(-12828863));
        label51.setText("Car Usage :");
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 14;
        gbc.anchor = GridBagConstraints.NORTHWEST;
        gbc.insets = new Insets(25, 150, 0, 0);
        panel3.add(label51, gbc);
        CustomerAddPhone = new JTextField();
        CustomerAddPhone.setBackground(new Color(-1));
        CustomerAddPhone.setPreferredSize(new Dimension(200, 25));
        CustomerAddPhone.setText("");
        gbc = new GridBagConstraints();
        gbc.gridx = 2;
        gbc.gridy = 13;
        gbc.gridwidth = 12;
        gbc.anchor = GridBagConstraints.SOUTHWEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel3.add(CustomerAddPhone, gbc);
        CustomerAddSubmitAddBtn = new JButton();
        CustomerAddSubmitAddBtn.setBackground(new Color(-11551010));
        CustomerAddSubmitAddBtn.setForeground(new Color(-328966));
        CustomerAddSubmitAddBtn.setPreferredSize(new Dimension(150, 32));
        CustomerAddSubmitAddBtn.setText("Add Customer");
        gbc = new GridBagConstraints();
        gbc.gridx = 2;
        gbc.gridy = 17;
        gbc.gridwidth = 10;
        gbc.anchor = GridBagConstraints.EAST;
        gbc.insets = new Insets(40, 0, 0, 0);
        panel3.add(CustomerAddSubmitAddBtn, gbc);
        final JLabel label52 = new JLabel();
        Font label52Font = this.$$$getFont$$$(null, -1, -1, label52.getFont());
        if (label52Font != null) label52.setFont(label52Font);
        label52.setForeground(new Color(-12828863));
        label52.setText("E_Mail  :");
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 6;
        gbc.anchor = GridBagConstraints.NORTHWEST;
        gbc.insets = new Insets(25, 150, 0, 0);
        panel3.add(label52, gbc);
        CustomerAddEmail = new JTextField();
        CustomerAddEmail.setBackground(new Color(-1));
        CustomerAddEmail.setPreferredSize(new Dimension(200, 25));
        gbc = new GridBagConstraints();
        gbc.gridx = 2;
        gbc.gridy = 6;
        gbc.gridwidth = 12;
        gbc.anchor = GridBagConstraints.SOUTHWEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel3.add(CustomerAddEmail, gbc);
        CustomerAddCarUsage.setBackground(new Color(-1));
        gbc = new GridBagConstraints();
        gbc.gridx = 2;
        gbc.gridy = 14;
        gbc.gridwidth = 12;
        gbc.anchor = GridBagConstraints.SOUTHWEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel3.add(CustomerAddCarUsage, gbc);
        final JLabel label53 = new JLabel();
        Font label53Font = this.$$$getFont$$$("Lato", Font.BOLD, 24, label53.getFont());
        if (label53Font != null) label53.setFont(label53Font);
        label53.setText("Adding a new Customer");
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.insets = new Insets(0, 150, 30, 0);
        PanelCustomerAdd.add(label53, gbc);
        PanelCustomerVehicle = new JPanel();
        PanelCustomerVehicle.setLayout(new GridBagLayout());
        MainPanelCustomerAdd.add(PanelCustomerVehicle, "Card2");
        final JPanel panel4 = new JPanel();
        panel4.setLayout(new GridBagLayout());
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.NORTH;
        PanelCustomerVehicle.add(panel4, gbc);
        final JPanel spacer7 = new JPanel();
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 15;
        gbc.fill = GridBagConstraints.VERTICAL;
        panel4.add(spacer7, gbc);
        final JPanel spacer8 = new JPanel();
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 16;
        gbc.fill = GridBagConstraints.VERTICAL;
        panel4.add(spacer8, gbc);
        final JLabel label54 = new JLabel();
        label54.setText("Company Brand");
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 3;
        gbc.gridwidth = 4;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.ipadx = 10;
        panel4.add(label54, gbc);
        final JPanel spacer9 = new JPanel();
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 4;
        gbc.gridwidth = 28;
        gbc.fill = GridBagConstraints.VERTICAL;
        panel4.add(spacer9, gbc);
        final JPanel spacer10 = new JPanel();
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 12;
        gbc.gridwidth = 28;
        gbc.fill = GridBagConstraints.VERTICAL;
        panel4.add(spacer10, gbc);
        final JPanel spacer11 = new JPanel();
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 13;
        gbc.gridwidth = 28;
        gbc.fill = GridBagConstraints.VERTICAL;
        panel4.add(spacer11, gbc);
        final JPanel spacer12 = new JPanel();
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 1;
        gbc.gridwidth = 28;
        gbc.fill = GridBagConstraints.VERTICAL;
        panel4.add(spacer12, gbc);
        final JPanel spacer13 = new JPanel();
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 2;
        gbc.gridwidth = 28;
        gbc.fill = GridBagConstraints.VERTICAL;
        panel4.add(spacer13, gbc);
        final JLabel label55 = new JLabel();
        Font label55Font = this.$$$getFont$$$("Lato", Font.BOLD, 24, label55.getFont());
        if (label55Font != null) label55.setFont(label55Font);
        label55.setText("Search Vehicle");
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.gridwidth = 28;
        gbc.anchor = GridBagConstraints.WEST;
        panel4.add(label55, gbc);
        final JLabel label56 = new JLabel();
        Font label56Font = this.$$$getFont$$$(null, Font.PLAIN, 16, label56.getFont());
        if (label56Font != null) label56.setFont(label56Font);
        label56.setText("Driver List");
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 8;
        gbc.gridwidth = 4;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.insets = new Insets(30, 0, 20, 0);
        panel4.add(label56, gbc);
        final JLabel label57 = new JLabel();
        Font label57Font = this.$$$getFont$$$(null, Font.PLAIN, 16, label57.getFont());
        if (label57Font != null) label57.setFont(label57Font);
        label57.setRequestFocusEnabled(false);
        label57.setText("Vehicle  List");
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 11;
        gbc.gridwidth = 4;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.insets = new Insets(30, 0, 20, 0);
        panel4.add(label57, gbc);
        final JLabel label58 = new JLabel();
        label58.setText("Srtting Capacity");
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 5;
        gbc.anchor = GridBagConstraints.WEST;
        panel4.add(label58, gbc);
        gbc = new GridBagConstraints();
        gbc.gridx = 6;
        gbc.gridy = 3;
        gbc.gridwidth = 22;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel4.add(CustomerSearchVehicleCompanyBrand, gbc);
        final JPanel spacer14 = new JPanel();
        gbc = new GridBagConstraints();
        gbc.gridx = 23;
        gbc.gridy = 9;
        gbc.fill = GridBagConstraints.VERTICAL;
        panel4.add(spacer14, gbc);
        final JPanel spacer15 = new JPanel();
        gbc = new GridBagConstraints();
        gbc.gridx = 23;
        gbc.gridy = 10;
        gbc.fill = GridBagConstraints.VERTICAL;
        panel4.add(spacer15, gbc);
        gbc = new GridBagConstraints();
        gbc.gridx = 6;
        gbc.gridy = 8;
        gbc.gridwidth = 22;
        gbc.fill = GridBagConstraints.BOTH;
        panel4.add(CustomerSearchVehicleDriverList, gbc);
        final JPanel spacer16 = new JPanel();
        gbc = new GridBagConstraints();
        gbc.gridx = 27;
        gbc.gridy = 6;
        gbc.fill = GridBagConstraints.VERTICAL;
        panel4.add(spacer16, gbc);
        final JPanel spacer17 = new JPanel();
        gbc = new GridBagConstraints();
        gbc.gridx = 27;
        gbc.gridy = 7;
        gbc.fill = GridBagConstraints.VERTICAL;
        panel4.add(spacer17, gbc);
        gbc = new GridBagConstraints();
        gbc.gridx = 6;
        gbc.gridy = 11;
        gbc.gridwidth = 22;
        gbc.fill = GridBagConstraints.BOTH;
        panel4.add(CustomerSearchVehicleVehicleList, gbc);
        gbc = new GridBagConstraints();
        gbc.gridx = 6;
        gbc.gridy = 5;
        gbc.gridwidth = 22;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel4.add(CustomerSearchVehicleSittingCapacity, gbc);
        CustomerSearchVehicleTotalRent = new JTextField();
        CustomerSearchVehicleTotalRent.setEditable(false);
        CustomerSearchVehicleTotalRent.setEnabled(false);
        gbc = new GridBagConstraints();
        gbc.gridx = 6;
        gbc.gridy = 14;
        gbc.gridwidth = 22;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        panel4.add(CustomerSearchVehicleTotalRent, gbc);
        final JLabel label59 = new JLabel();
        Font label59Font = this.$$$getFont$$$(null, Font.PLAIN, 16, label59.getFont());
        if (label59Font != null) label59.setFont(label59Font);
        label59.setRequestFocusEnabled(false);
        label59.setText("Total Rent");
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 14;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.insets = new Insets(30, 0, 20, 0);
        panel4.add(label59, gbc);
        final JPanel spacer18 = new JPanel();
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        PanelCustomerVehicle.add(spacer18, gbc);
        final JPanel spacer19 = new JPanel();
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.fill = GridBagConstraints.VERTICAL;
        PanelCustomerVehicle.add(spacer19, gbc);
        PanelCustomerTicket = new JPanel();
        PanelCustomerTicket.setLayout(new GridBagLayout());
        CardCustomerContainer.add(PanelCustomerTicket, "Card1");
        Ticket = new JPanel();
        Ticket.setLayout(new GridBagLayout());
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        PanelCustomerTicket.add(Ticket, gbc);
        final JLabel label60 = new JLabel();
        label60.setForeground(new Color(-12828863));
        label60.setText("Customer ID :");
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.WEST;
        Ticket.add(label60, gbc);
        final JPanel spacer20 = new JPanel();
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        Ticket.add(spacer20, gbc);
        final JPanel spacer21 = new JPanel();
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.fill = GridBagConstraints.VERTICAL;
        Ticket.add(spacer21, gbc);
        CustomerTicketID = new JTextField();
        CustomerTicketID.setPreferredSize(new Dimension(250, 24));
        gbc = new GridBagConstraints();
        gbc.gridx = 2;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.BOTH;
        Ticket.add(CustomerTicketID, gbc);
        CustomerTicketPrintBtn = new JButton();
        CustomerTicketPrintBtn.setBackground(new Color(-11551010));
        CustomerTicketPrintBtn.setForeground(new Color(-328966));
        CustomerTicketPrintBtn.setPreferredSize(new Dimension(150, 32));
        CustomerTicketPrintBtn.setText("Print Ticket");
        gbc = new GridBagConstraints();
        gbc.gridx = 2;
        gbc.gridy = 2;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.insets = new Insets(40, 0, 0, 0);
        Ticket.add(CustomerTicketPrintBtn, gbc);
        final JPanel spacer22 = new JPanel();
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        PanelCustomerTicket.add(spacer22, gbc);
        final JPanel spacer23 = new JPanel();
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.fill = GridBagConstraints.VERTICAL;
        PanelCustomerTicket.add(spacer23, gbc);
        VehicleMainPanel = new JPanel();
        VehicleMainPanel.setLayout(new BorderLayout(0, 0));
        CardMainCenterPanelHolder.add(VehicleMainPanel, "Card3");
        vehicleMainHeader = new JPanel();
        vehicleMainHeader.setLayout(new GridBagLayout());
        vehicleMainHeader.setBackground(new Color(-11551010));
        VehicleMainPanel.add(vehicleMainHeader, BorderLayout.NORTH);
        viewCarsBtn = new JButton();
        viewCarsBtn.setActionCommand("Search Car Brand");
        viewCarsBtn.setBackground(new Color(-16758415));
        viewCarsBtn.setBorderPainted(false);
        viewCarsBtn.setFocusPainted(false);
        viewCarsBtn.setFocusable(false);
        viewCarsBtn.setForeground(new Color(-328966));
        viewCarsBtn.setPreferredSize(new Dimension(170, 65));
        viewCarsBtn.setText("View Cars");
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.weightx = 0.5;
        gbc.anchor = GridBagConstraints.EAST;
        gbc.insets = new Insets(0, 2, 0, 0);
        vehicleMainHeader.add(viewCarsBtn, gbc);
        customerVehicleBtn = new JButton();
        customerVehicleBtn.setActionCommand("Search Car Brand");
        customerVehicleBtn.setBackground(new Color(-16758415));
        customerVehicleBtn.setBorderPainted(false);
        customerVehicleBtn.setFocusPainted(false);
        customerVehicleBtn.setFocusable(false);
        customerVehicleBtn.setForeground(new Color(-328966));
        customerVehicleBtn.setPreferredSize(new Dimension(170, 65));
        customerVehicleBtn.setText("Customer Vehicle");
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.EAST;
        gbc.insets = new Insets(0, 2, 0, 0);
        vehicleMainHeader.add(customerVehicleBtn, gbc);
        CardVehiclesContainer = new JPanel();
        CardVehiclesContainer.setLayout(new CardLayout(0, 0));
        VehicleMainPanel.add(CardVehiclesContainer, BorderLayout.CENTER);
        PanelVehicleViewCars = new JPanel();
        PanelVehicleViewCars.setLayout(new GridBagLayout());
        CardVehiclesContainer.add(PanelVehicleViewCars, "Card1");
        final JScrollPane scrollPane7 = new JScrollPane();
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 12;
        gbc.gridwidth = 16;
        gbc.fill = GridBagConstraints.BOTH;
        PanelVehicleViewCars.add(scrollPane7, gbc);
        scrollPane7.setViewportView(VehicleListAll);
        final JPanel spacer24 = new JPanel();
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 10;
        gbc.fill = GridBagConstraints.VERTICAL;
        PanelVehicleViewCars.add(spacer24, gbc);
        final JPanel spacer25 = new JPanel();
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 11;
        gbc.fill = GridBagConstraints.VERTICAL;
        PanelVehicleViewCars.add(spacer25, gbc);
        final JLabel label61 = new JLabel();
        label61.setText("Company Brand");
        gbc = new GridBagConstraints();
        gbc.gridx = 2;
        gbc.gridy = 3;
        gbc.gridwidth = 4;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.ipadx = 10;
        PanelVehicleViewCars.add(label61, gbc);
        final JLabel label62 = new JLabel();
        label62.setText("Car Usage");
        gbc = new GridBagConstraints();
        gbc.gridx = 2;
        gbc.gridy = 5;
        gbc.gridwidth = 8;
        gbc.anchor = GridBagConstraints.WEST;
        PanelVehicleViewCars.add(label62, gbc);
        final JLabel label63 = new JLabel();
        label63.setText("Car Status");
        gbc = new GridBagConstraints();
        gbc.gridx = 2;
        gbc.gridy = 7;
        gbc.anchor = GridBagConstraints.WEST;
        PanelVehicleViewCars.add(label63, gbc);
        final JPanel spacer26 = new JPanel();
        gbc = new GridBagConstraints();
        gbc.gridx = 2;
        gbc.gridy = 4;
        gbc.gridwidth = 14;
        gbc.fill = GridBagConstraints.VERTICAL;
        PanelVehicleViewCars.add(spacer26, gbc);
        final JPanel spacer27 = new JPanel();
        gbc = new GridBagConstraints();
        gbc.gridx = 2;
        gbc.gridy = 6;
        gbc.gridwidth = 14;
        gbc.fill = GridBagConstraints.VERTICAL;
        PanelVehicleViewCars.add(spacer27, gbc);
        final JPanel spacer28 = new JPanel();
        gbc = new GridBagConstraints();
        gbc.gridx = 2;
        gbc.gridy = 8;
        gbc.gridwidth = 14;
        gbc.fill = GridBagConstraints.VERTICAL;
        PanelVehicleViewCars.add(spacer28, gbc);
        final JPanel spacer29 = new JPanel();
        gbc = new GridBagConstraints();
        gbc.gridx = 2;
        gbc.gridy = 1;
        gbc.gridwidth = 14;
        gbc.fill = GridBagConstraints.VERTICAL;
        PanelVehicleViewCars.add(spacer29, gbc);
        final JPanel spacer30 = new JPanel();
        gbc = new GridBagConstraints();
        gbc.gridx = 2;
        gbc.gridy = 2;
        gbc.gridwidth = 14;
        gbc.fill = GridBagConstraints.VERTICAL;
        PanelVehicleViewCars.add(spacer30, gbc);
        VehicleSearchRetrieveBtn = new JButton();
        VehicleSearchRetrieveBtn.setBackground(new Color(-16758415));
        VehicleSearchRetrieveBtn.setFocusPainted(false);
        VehicleSearchRetrieveBtn.setFocusable(false);
        VehicleSearchRetrieveBtn.setForeground(new Color(-328966));
        VehicleSearchRetrieveBtn.setText("Retrieve");
        gbc = new GridBagConstraints();
        gbc.gridx = 2;
        gbc.gridy = 9;
        gbc.gridwidth = 14;
        gbc.ipadx = 20;
        PanelVehicleViewCars.add(VehicleSearchRetrieveBtn, gbc);
        final JLabel label64 = new JLabel();
        Font label64Font = this.$$$getFont$$$("Lato", Font.BOLD, 24, label64.getFont());
        if (label64Font != null) label64.setFont(label64Font);
        label64.setText("Search Vehicle");
        gbc = new GridBagConstraints();
        gbc.gridx = 2;
        gbc.gridy = 0;
        gbc.gridwidth = 14;
        gbc.anchor = GridBagConstraints.WEST;
        PanelVehicleViewCars.add(label64, gbc);
        VehicleSearchStatuUnRented = new JRadioButton();
        VehicleSearchStatuUnRented.setText("Un Rented");
        gbc = new GridBagConstraints();
        gbc.gridx = 15;
        gbc.gridy = 7;
        gbc.anchor = GridBagConstraints.EAST;
        PanelVehicleViewCars.add(VehicleSearchStatuUnRented, gbc);
        VehicleSearchStatusRented = new JRadioButton();
        VehicleSearchStatusRented.setSelected(true);
        VehicleSearchStatusRented.setText("Rented");
        gbc = new GridBagConstraints();
        gbc.gridx = 14;
        gbc.gridy = 7;
        gbc.anchor = GridBagConstraints.WEST;
        PanelVehicleViewCars.add(VehicleSearchStatusRented, gbc);
        VehicleSearchCompanyBrand.setBackground(new Color(-1));
        gbc = new GridBagConstraints();
        gbc.gridx = 12;
        gbc.gridy = 3;
        gbc.gridwidth = 4;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        PanelVehicleViewCars.add(VehicleSearchCompanyBrand, gbc);
        VehicleSearchCarUsage.setBackground(new Color(-1));
        gbc = new GridBagConstraints();
        gbc.gridx = 12;
        gbc.gridy = 5;
        gbc.gridwidth = 4;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        PanelVehicleViewCars.add(VehicleSearchCarUsage, gbc);
        PanelVehicleCustomer = new JPanel();
        PanelVehicleCustomer.setLayout(new GridBagLayout());
        CardVehiclesContainer.add(PanelVehicleCustomer, "Card2");
        final JLabel label65 = new JLabel();
        label65.setText("Customer ID or Username");
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 1;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.ipadx = 10;
        PanelVehicleCustomer.add(label65, gbc);
        final JScrollPane scrollPane8 = new JScrollPane();
        scrollPane8.setBackground(new Color(-328966));
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 4;
        gbc.gridwidth = 13;
        gbc.fill = GridBagConstraints.BOTH;
        PanelVehicleCustomer.add(scrollPane8, gbc);
        scrollPane8.setViewportView(CustomerVehicleListAll);
        final JPanel spacer31 = new JPanel();
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 2;
        gbc.fill = GridBagConstraints.VERTICAL;
        PanelVehicleCustomer.add(spacer31, gbc);
        final JPanel spacer32 = new JPanel();
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 3;
        gbc.fill = GridBagConstraints.VERTICAL;
        PanelVehicleCustomer.add(spacer32, gbc);
        final JLabel label66 = new JLabel();
        Font label66Font = this.$$$getFont$$$("Lato", Font.BOLD, 24, label66.getFont());
        if (label66Font != null) label66.setFont(label66Font);
        label66.setText("Search Customer's Vehicle");
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.gridwidth = 13;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.ipady = 30;
        PanelVehicleCustomer.add(label66, gbc);
        VehicleCustomerRetrieveBtn = new JButton();
        VehicleCustomerRetrieveBtn.setBackground(new Color(-16758415));
        VehicleCustomerRetrieveBtn.setFocusPainted(false);
        VehicleCustomerRetrieveBtn.setFocusable(false);
        VehicleCustomerRetrieveBtn.setForeground(new Color(-328966));
        VehicleCustomerRetrieveBtn.setText("Retrieve");
        gbc = new GridBagConstraints();
        gbc.gridx = 13;
        gbc.gridy = 1;
        gbc.anchor = GridBagConstraints.EAST;
        PanelVehicleCustomer.add(VehicleCustomerRetrieveBtn, gbc);
        VehicleCustomerIDorUsername = new JTextField();
        VehicleCustomerIDorUsername.setMinimumSize(new Dimension(110, 26));
        VehicleCustomerIDorUsername.setPreferredSize(new Dimension(140, 26));
        gbc = new GridBagConstraints();
        gbc.gridx = 2;
        gbc.gridy = 1;
        gbc.gridwidth = 11;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        PanelVehicleCustomer.add(VehicleCustomerIDorUsername, gbc);
        PanelEmployeeActions = new JPanel();
        PanelEmployeeActions.setLayout(new BorderLayout(0, 0));
        CardMainCenterPanelHolder.add(PanelEmployeeActions, "Card4");
        PanelEmployeeEmail = new JPanel();
        PanelEmployeeEmail.setLayout(new GridBagLayout());
        PanelEmployeeActions.add(PanelEmployeeEmail, BorderLayout.CENTER);
        final JLabel label67 = new JLabel();
        label67.setPreferredSize(new Dimension(120, 24));
        label67.setText("From");
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.insets = new Insets(0, 0, 15, 0);
        PanelEmployeeEmail.add(label67, gbc);
        textFieldFrom = new JTextField();
        textFieldFrom.setPreferredSize(new Dimension(160, 26));
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 0;
        gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.insets = new Insets(0, 0, 15, 0);
        PanelEmployeeEmail.add(textFieldFrom, gbc);
        final JLabel label68 = new JLabel();
        label68.setPreferredSize(new Dimension(120, 24));
        label68.setText("To");
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.insets = new Insets(0, 0, 15, 0);
        PanelEmployeeEmail.add(label68, gbc);
        textFieldTo = new JTextField();
        textFieldTo.setPreferredSize(new Dimension(160, 26));
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 1;
        gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.insets = new Insets(0, 0, 15, 0);
        PanelEmployeeEmail.add(textFieldTo, gbc);
        final JLabel label69 = new JLabel();
        label69.setPreferredSize(new Dimension(120, 24));
        label69.setText("Subject");
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.insets = new Insets(0, 0, 15, 0);
        PanelEmployeeEmail.add(label69, gbc);
        textFieldSubject = new JTextField();
        textFieldSubject.setPreferredSize(new Dimension(160, 26));
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 2;
        gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.insets = new Insets(0, 0, 15, 0);
        PanelEmployeeEmail.add(textFieldSubject, gbc);
        final JLabel label70 = new JLabel();
        label70.setPreferredSize(new Dimension(120, 24));
        label70.setText("Compose Email");
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 3;
        gbc.anchor = GridBagConstraints.WEST;
        gbc.insets = new Insets(0, 0, 62, 0);
        PanelEmployeeEmail.add(label70, gbc);
        textAreaCompose = new JTextArea();
        textAreaCompose.setPreferredSize(new Dimension(300, 90));
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 3;
        gbc.gridwidth = 2;
        gbc.fill = GridBagConstraints.BOTH;
        gbc.insets = new Insets(20, 0, 0, 0);
        PanelEmployeeEmail.add(textAreaCompose, gbc);
        Sendbutton = new JButton();
        Sendbutton.setBackground(new Color(-11551010));
        Sendbutton.setPreferredSize(new Dimension(150, 32));
        Sendbutton.setText("Send");
        gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 4;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.insets = new Insets(30, 0, 0, 15);
        PanelEmployeeEmail.add(Sendbutton, gbc);
        ResetButton = new JButton();
        ResetButton.setBackground(new Color(-11551010));
        ResetButton.setPreferredSize(new Dimension(150, 32));
        ResetButton.setText("Reset");
        gbc = new GridBagConstraints();
        gbc.gridx = 2;
        gbc.gridy = 4;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.insets = new Insets(30, 0, 0, 0);
        PanelEmployeeEmail.add(ResetButton, gbc);
        final JPanel spacer33 = new JPanel();
        gbc = new GridBagConstraints();
        gbc.gridx = 1;
        gbc.gridy = 4;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.insets = new Insets(0, 0, 0, 140);
        PanelEmployeeEmail.add(spacer33, gbc);
        Footer = new JPanel();
        Footer.setLayout(new FlowLayout(FlowLayout.LEFT, 30, 20));
        Footer.setBackground(new Color(-7763575));
        MainEmployeeFramePanel.add(Footer, BorderLayout.SOUTH);
        final JLabel label71 = new JLabel();
        label71.setBackground(new Color(-328966));
        Font label71Font = this.$$$getFont$$$(null, Font.BOLD, -1, label71.getFont());
        if (label71Font != null) label71.setFont(label71Font);
        label71.setForeground(new Color(-328966));
        label71.setText("Vehicle Renting System");
        Footer.add(label71);
        ButtonGroup buttonGroup;
        buttonGroup = new ButtonGroup();
        buttonGroup.add(DriverAddGenderMale);
        buttonGroup.add(DriverAddGenderFemale);
        buttonGroup = new ButtonGroup();
        buttonGroup.add(DriverUpdateGenderFemale);
        buttonGroup.add(DriverUpdateGenderMale);
        buttonGroup = new ButtonGroup();
        buttonGroup.add(CustomerAddGenderMale);
        buttonGroup.add(CustomerAddGenderFamale);
        buttonGroup = new ButtonGroup();
        buttonGroup.add(VehicleSearchStatusRented);
        buttonGroup.add(VehicleSearchStatuUnRented);
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
        return MainEmployeeFramePanel;
    }
}

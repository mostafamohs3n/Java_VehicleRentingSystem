package Code;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.ChartUtilities;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.Plot;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.general.PieDataset;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.Date;

public class ReportCarStatus{

    private static String title;
    private static String[] carModel;
    private static boolean[] carStatus;
    private JButton saveChartBtn;
    private JButton goBackBtn;
    private JFreeChart chart;
    private JFrame f;

    public ReportCarStatus(String title, String[] carModel, boolean[] carStatus){
        this.title=title;
        this.carModel=carModel;
        this.carStatus=carStatus;
        chart = createChart(createDataset());
        ChartPanel panel = new ChartPanel(chart);
        f = new JFrame();
        f.setTitle(title);
        f.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        f.setLayout(new BorderLayout(0,0));
        f.add(panel, BorderLayout.CENTER);
        JPanel p = new JPanel(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        p.setBackground(new Color(204,204,204));
        c.insets = new Insets(0,0,0,50);
        // Save Chart Btn
        saveChartBtn = new JButton("Save Chart");
        saveChartBtn.setBackground(new Color(-11316397));
        saveChartBtn.setBorderPainted(false);
        saveChartBtn.setContentAreaFilled(true);
        saveChartBtn.setFocusPainted(false);
        saveChartBtn.setFocusable(false);
        saveChartBtn.setForeground(new Color(-328966));
        p.add(saveChartBtn, c);
        // Go Back Btn
        goBackBtn = new JButton("Close Chart");
        goBackBtn.setBackground(new Color(208,20,53));
        goBackBtn.setBorderPainted(false);
        goBackBtn.setContentAreaFilled(true);
        goBackBtn.setFocusPainted(false);
        goBackBtn.setFocusable(false);
        goBackBtn.setForeground(new Color(-328966));
        p.add(goBackBtn);
        // Add Listeners
        saveChartBtn.addActionListener(new MyListener(saveChartBtn.getText().toString()));
        goBackBtn.addActionListener(new MyListener(goBackBtn.getText().toString()));

        f.add(p, BorderLayout.SOUTH);
        f.pack();
        f.setVisible(true);
    }

    private static PieDataset createDataset(){
        DefaultPieDataset dataset = new DefaultPieDataset();
        int counterRented,counterNotRented;
        for(int i=0;i<carModel.length;++i){
            counterRented=0;
            counterNotRented=0;
            for(int k=0;k<carModel.length;++k){
                if(carModel[i].equals(carModel[k])){
                    if(carStatus[i] && carStatus[k]){
                        counterRented++;
                        dataset.setValue(carModel[i] + "Rented", counterRented);
                    }else if(carStatus[i]==false && carStatus[k]==false){
                        counterNotRented++;
                        dataset.setValue(carModel[i] + "Not Rented", counterNotRented);
                    }
                }
            }
        }
        return dataset;
    }


    private JFreeChart createChart(PieDataset dataset){
        JFreeChart chart = ChartFactory.createPieChart(
                title, //  Frame Title
                dataset, // Dataset that was Created
                true, // Legend
                true, // ToolTips when hover
                false // URLS
        );
        // Outer Background
        chart.setBackgroundPaint(new Color(204,204,204));
        // Inner Background
        Plot p = chart.getPlot();
        p.setBackgroundPaint(new Color(238,238,238));
        return chart;
    }

    // Listeners
    private class MyListener implements ActionListener{
        String btnTxt;
        public MyListener(String btnTxt){
            this.btnTxt=btnTxt;
        }
        public void actionPerformed(ActionEvent e){
            if(btnTxt.equals("Save Chart")){
                try{
                    Date date = new Date();
                    File imgChart = new File(String.format("ChartStatus%d%d%d_%d%d%d.png", date.getDate(), date.getMonth(), (date.getYear()+1900), date.getHours(), date.getMinutes(), date.getSeconds()));
                    ChartUtilities.saveChartAsPNG(imgChart, chart, 900, 600);
                }catch(Exception exception){
                    System.out.println(exception);
                }
            }else{
                f.dispose();
            }
        }
    }
}
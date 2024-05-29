package controllers;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import views.SystemView;

public class SettingController implements MouseListener{

    private SystemView views;
    
     public SettingController(SystemView views){
         this.views = views;
         this.views.jLabelProducts.addMouseListener(this);
         this.views.jLabelPurchases.addMouseListener(this);
         this.views.jLabelCustomers.addMouseListener(this);
         this.views.jLabelEmployees.addMouseListener(this);
         this.views.jLabelSupplier.addMouseListener(this);
         this.views.jLabelCategories.addMouseListener(this);
         this.views.jLabelReports.addMouseListener(this);
         this.views.jLabelSettings.addMouseListener(this);
         
         
     } 
    @Override
    public void mouseClicked(MouseEvent e) {
        
    }

    @Override
    public void mousePressed(MouseEvent e) {
        
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        
    }

    @Override
    public void mouseEntered(MouseEvent f) {
        if (f.getSource() == views.jLabelProducts) {
            views.jPanelProducts.setBackground(new Color(152, 202, 63));     
        }else if (f.getSource() == views.jLabelPurchases){
            views.jPanelPurchases.setBackground(new Color(152, 202, 63));
        }else if (f.getSource() == views.jLabelCategories) {
            views.jPanelCategories.setBackground(new Color(152, 202, 63));
        }else if (f.getSource() == views.jLabelCustomers) {
            views.jPanelCustomers.setBackground(new Color(152, 202, 63));
        }else if (f.getSource() == views.jLabelEmployees) {
            views.jPanelEmployees.setBackground(new Color(152, 202, 63));
        }else if (f.getSource() == views.jLabelReports) {
            views.jPanelReports.setBackground(new Color(152, 202, 63));
        }else if (f.getSource() == views.jLabelSettings) {
            views.jPanelSettings.setBackground(new Color(152, 202, 63));
        }else if (f.getSource() == views.jLabelSupplier) {
            views.jPanelSupplier.setBackground(new Color(152, 202, 63));
        }
    }

    @Override
    public void mouseExited(MouseEvent f) {
        if (f.getSource() == views.jLabelProducts) {
            views.jPanelProducts.setBackground(new Color(18, 45, 61));     
        }else if (f.getSource() == views.jLabelPurchases){
            views.jPanelPurchases.setBackground(new Color(18, 45, 61));
        }else if (f.getSource() == views.jLabelCategories) {
            views.jPanelCategories.setBackground(new Color(18, 45, 61));
        }else if (f.getSource() == views.jLabelCustomers) {
            views.jPanelCustomers.setBackground(new Color(18, 45, 61));
        }else if (f.getSource() == views.jLabelEmployees) {
            views.jPanelEmployees.setBackground(new Color(18, 45, 61));
        }else if (f.getSource() == views.jLabelReports) {
            views.jPanelReports.setBackground(new Color(18, 45, 61));
        }else if (f.getSource() == views.jLabelSettings) {
            views.jPanelSettings.setBackground(new Color(18, 45, 61));
        }else if (f.getSource() == views.jLabelSupplier) {
            views.jPanelSupplier.setBackground(new Color(18, 45, 61));
        }
    }

    
}

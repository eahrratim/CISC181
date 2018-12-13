package pkgApp.controller;

import java.net.URL;
import java.util.ResourceBundle;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import pkgApp.RetirementApp;
import pkgCore.Retirement;

public class RetirementController implements Initializable {

		
	private RetirementApp mainApp = null;
	
	@FXML 
	private Label ErrorIn;
	
	@FXML
	private Label ErrorInn;
	
	@FXML
	private Label TotalSaved;
	
	@FXML
	private TextField txtYearsToWork;
	
	@FXML
	private Label lblSaveEachMonth;
	
	@FXML
	private TextField AnnualReturnRetired;
	
	@FXML
	private TextField AnnualReturnWorking;
	
	@FXML
	private TextField MonthlySSI;
	
	@FXML
	private TextField MonthlyRequired;
	
	@FXML 
	private TextField YearsRetired;

	public RetirementApp getMainApp() {
		return mainApp;
	}

	public void setMainApp(RetirementApp mainApp) {
		this.mainApp = mainApp;
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {		
	}
	
	@FXML
	public void btnClear(ActionEvent event) {
		txtYearsToWork.setText("");
		AnnualReturnRetired.setText("");
		AnnualReturnWorking.setText("");
		MonthlySSI.setText("");
		MonthlyRequired.setText("");
		YearsRetired.setText("");
		lblSaveEachMonth.setText("");
		TotalSaved.setText(""); 
		ErrorIn.setText("");
		System.out.println("Clear pressed");
		
		//	TODO: Clear all the text inputs
	}
	
	@FXML
	public void btnCalculate(ActionEvent event) throws NumberFormatException {
		
	try {
		double ARR =  Double.parseDouble(AnnualReturnRetired.getText());
		int YTW = Integer.parseInt(txtYearsToWork.getText());
		double ARW = Double.parseDouble(AnnualReturnWorking.getText());
		int YR = Integer.parseInt(YearsRetired.getText());
		double RI = Double.parseDouble(MonthlyRequired.getText());
		double MSSI = Double.parseDouble(MonthlySSI.getText());
		Retirement R = new Retirement(YTW, ARW, YR, ARR, RI, MSSI);
		
		TotalSaved.setText(Double.toString(Math.floor(R.TotalAmountSaved()*100)/100));
		
		lblSaveEachMonth.setText(Double.toString(Math.floor(R.AmountToSave()*100)/100));
		//	TODO: Call AmountToSave and TotalAmountSaved and populate 
	}
		catch(NumberFormatException e) {
			ErrorIn.setText("All Entries Must Be Numeric");
			ErrorInn.setText("Years Must Be Entered As Whole Numbers");
		}
		
	}
}

	

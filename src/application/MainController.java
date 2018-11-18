package application;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.ProgressIndicator;
public class MainController implements Initializable{
 final Number num=new Number();
@FXML
private  Label Label;

@FXML
private  ProgressBar pbar;

@FXML
private ProgressIndicator pi;
@FXML
private Button add;
@FXML
private Button subtract;

@Override
	public void initialize(URL location, ResourceBundle resources) {
	
		num.setNumber(0);
		pbar.progressProperty().bind(num.numberProperty());
		pi.progressProperty().bind(num.numberProperty());
		num.numberProperty().addListener(new ChangeListener<Object>(){
			
			@Override
			public void changed(ObservableValue<? extends Object> observable,
				Object oldValue, Object newValue) {
				System.out.println("changed-1");
			
		Label.setText(new Double(num.getNumber()*5).toString());
		System.out.println("changed-2");
			}	
		});
	}
		public void BtnClick ( ActionEvent event) {
			System.out.println("BtnClick-1");
			add = ((Button) event.getSource());
			System.out.println("BtnClick-2");
			if(num.getNumber()>=1){
				System.out.println("BtnClick-3");
				add.setDisable(true);
				System.out.println("BtnClick-4");
				//subtract.setDisable(false);
	
			}
			
			num.setNumber(num.getNumber()+0.1);
		}
		public void BtnClick2 ( ActionEvent event) {
			System.out.println("BtnClick2-1");
			num.setNumber(num.getNumber()-0.1);
			System.out.println("BtnClick2-2");
			if(num.getNumber()<=1){
				System.out.println("BtnClick2-3");
				add.setDisable(false);
				//subtract.setDisable(true);
				System.out.println("BtnClick2-4");
			}
			if(num.getNumber()<=0){
				//subtract.setDisable(true);
			}
		}
		}
		




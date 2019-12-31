/*import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class A15dot5 extends Application {

	private Textfield tfInvestmentAmount = new Textfield();
	private Textfield tfNumberOfYears = new Textfield();
	private Textfield tfAnnualInterestRate = new Textfield();
	private TextField tfFutureValue = new Textfield();


	public static void main(String[] args) {
		Application.launch(args);
	}
	public void start(stage primaryStage) {
		GridPane gp = new GridPane();
		gp.setAlignment(Pos.CENTER);
		gp.setHgap(5);
		gp.setVgap(5);

		Scene scene = new Scene(gp, 350, 200);
		primaryStage.setTitle("Investment Calculator");
		primaryStage.setScene(scene);
		primaryStage.show();

		gp.add(new Label("InvestmentAmount"), 0, 0);
		gp.add(tfInvestmentAmount,1 ,0);

		gp.add(new Label("Number of Years"), 0, 1);
		gp.add(tfNumberOfYears,1 ,1);

		gp.add(new Label("Annual Interest Rate"), 0, 2);
		gp.add(tfAnnualInterestRate,1 ,2);

		gp.add(new Label("Future Value"), 0, 3);
		gp.add(tfFutureValue,1 ,3);
		tfFutureValue.setEditable(false);

		Button bCalc = new Button("Calculate");
		gp.add(bCalc, 0, 4);
		bCalc.setMinWidth(165);
		bCalc.setOnAction(e -> calculateValue());

		Button bReset = new Button("CReset");
		gp.add(bReset, 1, 4);
		bReset.setMinWidth(165);

	}
	private void calculateValue() {
		double amount = Double.parseDouble(tfInvestmentAmount.getText());
		double years = Double.parseDouble(tfNumberOfYears.getText());
		double rate = Double.parseDouble(tfAnnualInterestRate.getText());
		rate /= 1200.0;
		double futureValue = amount * Math.pow(1.0 + rate, years * 12.0);
		tfFutureValue.setText(String.format("%.2f", futureValue));
	} catch (NumberFormatException e) {
		tfFutureValue.setText("Please enter numbers");
	
	}
	}
}
*/
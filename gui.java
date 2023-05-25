import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
public class CarGui extends Application {
private TextField milesPerDayField, costPerGallonField, milesPerGallonField,
parkingFeesField, tollsPerDayField;
private Label dailyDrivingCostLabel;
private Button calculateButton;
public static void main(String[] args)
{
launch(args);
}
@Override

14
public void start(Stage primaryStage) {
milesPerDayField = new TextField();
costPerGallonField = new TextField();
milesPerGallonField = new TextField();
parkingFeesField = new TextField();
tollsPerDayField = new TextField();
dailyDrivingCostLabel = new Label();
calculateButton = new Button(&quot;Calculate&quot;);

VBox root = new VBox(
new Label(&quot;Total miles driven per day:&quot;), milesPerDayField,
new Label(&quot;Cost per gallon for gasoline:&quot;), costPerGallonField,
new Label(&quot;Average miles per gallon:&quot;), milesPerGallonField,
new Label(&quot;Parking fees per day:&quot;), parkingFeesField,
new Label(&quot;Tolls per day:&quot;), tollsPerDayField,
calculateButton,
dailyDrivingCostLabel
);
calculateButton.setOnAction(event -&gt; calculate());
primaryStage.setScene(new Scene(root));
primaryStage.setTitle(&quot;Daily Driving Cost Calculator&quot;);
primaryStage.show();

15

}
private void calculate() {
int milesPerDay = Integer.parseInt(milesPerDayField.getText());
int costPerGallon = Integer.parseInt(costPerGallonField.getText());
int milesPerGallon = Integer.parseInt(milesPerGallonField.getText());
int parkingFees = Integer.parseInt(parkingFeesField.getText());
int tollsPerDay = Integer.parseInt(tollsPerDayField.getText());
int dailyDrivingCost = ((milesPerDay / milesPerGallon) * costPerGallon) + parkingFees +
tollsPerDay;
dailyDrivingCostLabel.setText(&quot;Daily driving cost = &quot; + dailyDrivingCost);
}
}
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class TurnerFutureValueApp extends Application {

    private TextField tfInvestmentAmount = new TextField();
    private TextField tfYears = new TextField();
    private TextArea taFutureValue = new TextArea();
    private Label lblInvestmentAmount = new Label("Investment Amount:");
    private Label lblYears = new Label("Years:");
    private Label lblInterestRateFormat = new Label("Enter year as integer.");
    private Label lblFutureValue = new Label("Future Value:");
    private Label lblMonthlyPayment = new Label("Monthly Payment:");
    private Label lblInterestRate = new Label("Interest Rate:");
    private Button btnCalculate = new Button("Calculate");
    private Button btnClear = new Button("Clear");
    private ComboBox<Integer> cbInterestRate = new ComboBox<>();

    @Override
    public void start(Stage primaryStage) {
        GridPane gridPane = new GridPane();
        gridPane.setAlignment(Pos.CENTER);
        gridPane.setPadding(new Insets(11.5, 12.5, 13.5, 14.5));
        gridPane.setHgap(5.5);
        gridPane.setVgap(5.5);

        gridPane.add(lblInvestmentAmount, 0, 0);
        gridPane.add(tfInvestmentAmount, 1, 0);
        gridPane.add(lblYears, 0, 1);
        gridPane.add(tfYears, 1, 1);
        gridPane.add(lblInterestRateFormat, 0, 2);
        GridPane.setColumnSpan(lblInterestRateFormat, 2);
        GridPane.setHalignment(lblInterestRateFormat, javafx.geometry.HPos.RIGHT);
        gridPane.add(lblFutureValue, 0, 3);
        gridPane.add(taFutureValue, 1, 3);
        gridPane.add(lblMonthlyPayment, 0, 4);
        gridPane.add(lblInterestRate, 0, 5);

        HBox actionBtnContainer = new HBox(10);
        actionBtnContainer.setPadding(new Insets(15, 0, 15, 30));
        actionBtnContainer.getChildren().addAll(btnCalculate, btnClear);
        gridPane.add(actionBtnContainer, 1, 6);

        primaryStage.setTitle("Turner Future Value App");
        primaryStage.setScene(new Scene(gridPane, 400, 300));
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}

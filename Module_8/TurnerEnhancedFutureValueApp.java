import javafx.application.Application;
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
import java.text.SimpleDateFormat;
import java.util.Date;

public class TurnerEnhancedFutureValueApp extends Application {
    private TextField txtMonthlyPayment = new TextField();
    private TextField txtInterestRate = new TextField();
    private TextArea txtResults = new TextArea();
    private Label lblFutureValueDate = new Label();
    private ComboBox<Integer> cbYears = new ComboBox<>();

    private static final int MONTHS_IN_YEAR = 12;

    @Override
    public void start(Stage primaryStage) {
        // Set up UI components
        Label lblMonthlyPayment = new Label("Monthly Payment:");
        Label lblInterestRate = new Label("Interest Rate:");
        Label lblYears = new Label("Years:");
        Button btnClear = new Button("Clear");
        Button btnCalculate = new Button("Calculate");

        txtResults.setEditable(false);
        cbYears.getItems().addAll(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // Create event handlers
        btnClear.setOnAction(e -> clearFormFields());
        btnCalculate.setOnAction(e -> calculateResults());

        // Create layout
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setHgap(10);
        grid.setVgap(10);
        grid.add(lblMonthlyPayment, 0, 0);
        grid.add(txtMonthlyPayment, 1, 0);
        grid.add(lblInterestRate, 0, 1);
        grid.add(txtInterestRate, 1, 1);
        grid.add(lblYears, 0, 2);
        grid.add(cbYears, 1, 2);

        HBox btnContainer = new HBox(10);
        btnContainer.setAlignment(Pos.CENTER);
        btnContainer.getChildren().addAll(btnClear, btnCalculate);

        grid.add(btnContainer, 0, 3, 2, 1);
        grid.add(lblFutureValueDate, 0, 4, 2, 1);
        grid.add(txtResults, 0, 5, 2, 1);

        // Set up scene and stage
        Scene scene = new Scene(grid, 400, 300);
        primaryStage.setTitle("Turner Enhanced Future Value App");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void clearFormFields() {
        txtMonthlyPayment.clear();
        txtInterestRate.clear();
        txtResults.clear();
        lblFutureValueDate.setText("");
        cbYears.setValue(0);
    }

    private void calculateResults() {
        double monthlyPayment = Double.parseDouble(txtMonthlyPayment.getText());
        double rate = Double.parseDouble(txtInterestRate.getText());
        int years = cbYears.getValue();
        double futureValue = FinanceCalculator.calculateFutureValue(monthlyPayment, rate, years);
        String date = getFormattedDate();
        lblFutureValueDate.setText("Calculation as of " + date);
        txtResults.setText("The future value is " + futureValue);
    }

    private String getFormattedDate() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
        return dateFormat.format(new Date());
    }

    public static void main(String[] args) {
        launch(args);
    }
}

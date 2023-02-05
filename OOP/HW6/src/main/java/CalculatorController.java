import javax.swing.text.View;

public class CalculatorController {
    private NewCalculatorModel Model;
    private NewCalculatorView View;

    public CalculatorController(NewCalculatorModel Model, NewCalculatorView View) {
        this.Model = Model;
        this.View = View;
    }

    public void update() {
        Model.calculate(View.getNumber1(), View.getNumber2(), View.getOperator());
        View.show();
    }
}

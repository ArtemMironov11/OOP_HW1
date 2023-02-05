public class Main {
    public static void main(String[] args) {
        NewCalculatorModel Model = new CalculatorModel();
        NewCalculatorView View = new CalculatorView();
        CalculatorController controller = new CalculatorController(Model, View);

        controller.update();
    }
}
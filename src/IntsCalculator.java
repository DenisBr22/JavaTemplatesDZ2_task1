public class IntsCalculator implements Ints {

    protected final Calculator target;

    public IntsCalculator() {
        this.target = new Calculator();
    }


    @Override
    public int sum(int arg0, int arg1) {
        int resultSum = (int) target.newFormula()
                .addOperand(arg0)
                .addOperand(arg1)
                .calculate(Calculator.Operation.SUM)
                .result();
        return resultSum;
    }

    @Override
    public int mult(int arg0, int arg1) {
        int resultMult = (int) target.newFormula()
                .addOperand(arg0)
                .addOperand(arg1)
                .calculate(Calculator.Operation.MULT)
                .result();
        return resultMult;
    }

    @Override
    public int pow(int a, int b) {
        int resultPow = (int) target.newFormula()
                .addOperand(a)
                .addOperand(b)
                .calculate(Calculator.Operation.POW)
                .result();
        return resultPow;
    }
}
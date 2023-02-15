public class PermanentHire extends SalariedWorker{
    private int bonus = 1000;
    private double monthlyPay = calculateWeeklyPay() * 4;

    private PermanentHire(){

    }

    PermanentHire(String name, int social){
        super(name, social);
        calculateWeeklyPay();
    }

    PermanentHire(String name, int social, double monthlyPay){
        super(name, social, monthlyPay);
    }

    @Override
    public double calculateWeeklyPay(){
        return super.calculateWeeklyPay() + bonus;
    }
    
}

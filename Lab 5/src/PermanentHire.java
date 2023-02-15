public class PermanentHire extends SalariedWorker{
    private int bonus;
    private double monthlyPay = calculateWeeklyPay() * 4;

    PermanentHire(String name, int social){

    }

    PermanentHire(String name, int social, double monthlyPay){
        super(name, social, monthlyPay);
    }

    @Override
    public double calculateWeeklyPay(){
        return super.calculateWeeklyPay() + bonus;
    }

}

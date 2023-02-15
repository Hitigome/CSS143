public class Consultant extends HourlyWorker{
    private double hourlyPay = 30.0;

    Consultant(String name, int social){
        super(name, social);
    }

    Consultant(String name, int social, double monthlyPay){
        super(name, social, monthlyPay);
    }

    @Override
    public double calculateWeeklyPay(){
        return hourlyPay * 20;
    }
    
}

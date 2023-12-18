/*
Ashvin Ganesan
APCS Unit 9 Lab 2
Monday February 10th 2020
 */
public class InsuredMail extends Mail {
    private Mail mail;
    private double insurance;
    
    public InsuredMail(Mail mail, double insurance) {
        this.mail = mail;
        this.insurance = insurance;
    }
    public double calculatePostage() {
        double normalPostage = mail.calculatePostage();
        double insuranceCost = Math.ceil(insurance/100) * 0.5;//0.5*(insurance + 100 -(insurance % 100))/100;
        return normalPostage + insuranceCost;
    }
    
}

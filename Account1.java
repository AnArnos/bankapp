
public class Account1 {
       static Double bal = 0.0;

    public Double getBal() {
        return bal;
    }

    public void setBal(Double bal) {
        this.bal = bal;
    }
    
    public void depositMoney( Double a){
        bal = bal + a;
        
    }
public void withdrawMoneyMoney( Double a){
        bal = bal - a;
        
    }
    
    }



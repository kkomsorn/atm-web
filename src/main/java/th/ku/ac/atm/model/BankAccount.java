package th.ku.ac.atm.model;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class BankAccount {
        private int id;
        private int customerId;
        private String type;
        private double balance;
        private double depositOrWithdraw;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getDepositOrWithdraw() {
        return depositOrWithdraw;
    }

    public void setDepositOrWithdraw(double depositOrWithdraw) {
        this.depositOrWithdraw = depositOrWithdraw;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "id=" + id +
                ", customerId=" + customerId +
                ", type='" + type + '\'' +
                ", balance=" + balance +
                ", depositOrWithdraw=" + depositOrWithdraw +
                '}';
    }
}


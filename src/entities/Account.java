package entities;

public class Account {

    private Integer number;
    private String holder;
    private Double balance;
    private Double withdrawLimit;

    private Double withdraw;
    private Double amount;

    public Account() {
    }

    public Account(Integer number, String holder, Double balance, Double withdrawLimit) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
        this.withdrawLimit = withdrawLimit;

    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Double getWithdraw() {
        return withdraw;
    }

    public String getHolder() {
        return holder;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public Double getWithdrawLimit() {
        return withdrawLimit;
    }

    public void setWithdrawLimit(Double withdrawLimit) {
        this.withdrawLimit = withdrawLimit;
    }

    public void deposit(Double amount) {
        if (amount > 0) {
            this.balance += amount;
            System.out.println("Deposit of $" + amount + " successful");
        } else {
            System.out.println("Deposit amount should be greater than zero.");
        }
    }

    public void setWithdraw(Double amount) throws Exception {
        if (amount > 0 && amount <= this.balance && amount <= this.withdrawLimit) {
            this.balance -= amount;
            System.out.println("Withdraw of $" + amount + " successful");
        } else {
            System.out.println("Withdraw should be lower then the limit.");
        } if (amount > this.withdrawLimit) {
            throw new Error("Withdraw amount exceeds the limit.");
        }
    }

    public void setHolder(String holder) throws Exception {
        if (holder.matches(".*\\d.*")) {
            throw new Exception("You can't put numbers in holder's name.");
        }
        this.holder = holder;
    }

}



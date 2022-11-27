package entities;

public class TransInfo {
    // 이름, 거래일시, 계좌번호, 입금/출금 여부, 거래금액, 은행명, 잔고
    String accountNum;
    int transIndex;
    String transDate;
    String depositWithdrawal;
    int money;
    int amount;

    public TransInfo(String accountNum, int transIndex, String transDate, String depositWithdrawal, int money, int amount) {
        this.accountNum = accountNum;
        this.transIndex = transIndex;
        this.transDate = transDate;
        this.depositWithdrawal = depositWithdrawal;
        this.money = money;
        this.amount = amount;
    }

    public String getAccountNum() {
        return accountNum;
    }

    public void arrangeTransIndex(int transIndex) {
        this.transIndex = transIndex;
    }
    public int getTransIndex() {
        return transIndex;
    }


    public String getTransDate() {
        return transDate;
    }

    public String getDepositWithdrawal() {
        return depositWithdrawal;
    }

    public int getMoney() {
        return money;
    }

    public int getAmount() {
        return amount;
    }


}
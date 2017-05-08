package com.mkyong.rest.TransactionHistById;

import java.util.ArrayList;

/**
 * Created by bennettzhou on 29/04/2017.
 */
public class ResponseTransactionhistById {
    private String numOfTranx;
    private String displayname;
    private ArrayList<TransactionHistBean> TransactionList;

    public String getNumOfTranx() {
        return numOfTranx;
    }

    public void setNumOfTranx(String numOfTranx) {
        this.numOfTranx = numOfTranx;
    }

    public String getDisplayname() {
        return displayname;
    }

    public void setDisplayname(String displayname) {
        this.displayname = displayname;
    }

    public ArrayList<TransactionHistBean> getTransactionList() {
        return TransactionList;
    }

    public void setTransactionList(ArrayList<TransactionHistBean> transactionList) {
        TransactionList = transactionList;
    }


}

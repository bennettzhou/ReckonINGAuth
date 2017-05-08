package com.mkyong.rest.MyAccounts;


import com.mkyong.rest.OBPObjects.ResponseAccountById;

import java.util.ArrayList;

/**
 * Created by bennettzhou on 20/04/2017.
 */
public class ResponseMyAccounts {

    private String numOfAccounts;
    private String displayname;
    private ArrayList<ResponseAccountById> accountList;

    public String getNumOfAccounts() {
        return numOfAccounts;
    }

    public void setNumOfAccounts(String numOfAccounts) {
        this.numOfAccounts = numOfAccounts;
    }

    public String getDisplayname() {
        return displayname;
    }

    public void setDisplayname(String displayname) {
        this.displayname = displayname;
    }

    public ArrayList<ResponseAccountById> getAccountList() {
        return accountList;
    }

    public void setAccountList(ArrayList<ResponseAccountById> accountList) {
        this.accountList = accountList;
    }
}

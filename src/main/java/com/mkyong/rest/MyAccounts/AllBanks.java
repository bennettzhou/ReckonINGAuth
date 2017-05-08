package com.mkyong.rest.MyAccounts;

/**
 * Created by bennettzhou on 21/04/2017.
 */
public class AllBanks
{
    private Banks[] banks;

    public Banks[] getBanks ()
    {
        return banks;
    }

    public void setBanks (Banks[] banks)
    {
        this.banks = banks;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [banks = "+banks+"]";
    }
}
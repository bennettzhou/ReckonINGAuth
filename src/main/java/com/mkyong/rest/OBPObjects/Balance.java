package com.mkyong.rest.OBPObjects;

/**
 * Created by bennettzhou on 20/04/2017.
 */
public class Balance
{
    private String amount;

    private String currency;

    public String getAmount ()
    {
        return amount;
    }

    public void setAmount (String amount)
    {
        this.amount = amount;
    }

    public String getCurrency ()
    {
        return currency;
    }

    public void setCurrency (String currency)
    {
        this.currency = currency;
    }

    @Override
    public String toString()
    {
        return " [amount = "+amount+", currency = "+currency+"]";
    }
}

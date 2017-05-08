package com.mkyong.rest.MyTransactions;

/**
 * Created by bennettzhou on 26/04/2017.
 */
public class Charge
{
    private String summary;

    private Value value;

    public String getSummary ()
    {
        return summary;
    }

    public void setSummary (String summary)
    {
        this.summary = summary;
    }

    public Value getValue ()
    {
        return value;
    }

    public void setValue (Value value)
    {
        this.value = value;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [summary = "+summary+", value = "+value+"]";
    }
}

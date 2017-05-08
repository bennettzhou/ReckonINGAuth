package com.mkyong.rest.MyAccounts;

/**
 * Created by bennettzhou on 20/04/2017.
 */
public class Self
{
    private String href;

    public String getHref ()
    {
        return href;
    }

    public void setHref (String href)
    {
        this.href = href;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [href = "+href+"]";
    }
}

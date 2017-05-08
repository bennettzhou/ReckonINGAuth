package com.mkyong.rest.Objects.DepositAccounts;

import java.util.ArrayList;

/**
 * Created by bennettzhou on 05/04/2017.
 */
public class CASAAccountList
{
    private String categoryName;

    private ArrayList<SubCategoryList> subCategoryList;

    public String getCategoryName ()
    {
        return categoryName;
    }

    public void setCategoryName (String categoryName)
    {
        this.categoryName = categoryName;
    }

    public ArrayList<SubCategoryList> getSubCategoryList() {
        return subCategoryList;
    }

    public void setSubCategoryList(ArrayList<SubCategoryList> subCategoryList) {
        this.subCategoryList = subCategoryList;
    }

    @Override
    public String toString()
    {
        return "ClassPojo [categoryName = "+categoryName+", subCategoryList = "+subCategoryList+"]";
    }
}
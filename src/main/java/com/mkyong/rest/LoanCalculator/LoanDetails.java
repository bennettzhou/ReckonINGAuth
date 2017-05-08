package com.mkyong.rest.LoanCalculator;

import java.math.BigDecimal;

/**
 * Created by bennettzhou on 02/05/2017.
 */
public class LoanDetails {


    private String type;

    private String monthlyPayment;

    private String totalInterest;

    private String totalPayment;

    private String eligibleLoanAmount;

    private String interest;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getMonthlyPayment() {
        return monthlyPayment;
    }

    public void setMonthlyPayment(String monthlyPayment) {
        this.monthlyPayment = monthlyPayment;
    }

    public String getTotalInterest() {
        return totalInterest;
    }

    public void setTotalInterest(String totalInterest) {
        this.totalInterest = totalInterest;
    }

    public String getTotalPayment() {
        return totalPayment;
    }

    public void setTotalPayment(String totalPayment) {
        this.totalPayment = totalPayment;
    }

    public String getEligibleLoanAmount() {
        return eligibleLoanAmount;
    }

    public void setEligibleLoanAmount(String eligibleLoanAmount) {
        this.eligibleLoanAmount = eligibleLoanAmount;
    }

    public String getInterest() {
        return interest;
    }

    public void setInterest(String interest) {
        this.interest = interest;
    }
}


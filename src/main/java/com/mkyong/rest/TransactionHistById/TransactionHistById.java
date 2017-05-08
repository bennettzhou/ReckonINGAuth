package com.mkyong.rest.TransactionHistById;

/**
 * Created by bennettzhou on 29/04/2017.
 */
public class TransactionHistById {

        private Transactions[] transactions;

        public Transactions[] getTransactions ()
        {
            return transactions;
        }

        public void setTransactions (Transactions[] transactions)
        {
            this.transactions = transactions;
        }

        @Override
        public String toString()
        {
            return "ClassPojo [transactions = "+transactions+"]";
        }
    }

package com.mkyong.rest;

import com.github.scribejava.core.builder.ServiceBuilder;
import com.github.scribejava.core.exceptions.OAuthException;
import com.github.scribejava.core.model.*;
import com.github.scribejava.core.oauth.OAuth10aService;
import com.google.gson.Gson;
import com.mkyong.rest.Auth.OBPApi;
import com.mkyong.rest.Auth.UserAuthUtil;
import com.mkyong.rest.Auth.UserInfo;
import com.mkyong.rest.OBPObjects.ResponseAccountById;
import com.mkyong.rest.TransactionHistById.TransactionHistBean;
import com.mkyong.rest.Utils.CacheUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Vector;
import java.util.concurrent.ExecutionException;

/**
 * Created by bennettzhou on 28/04/2017.
 */
public class INGConstant {
    private final Logger log = LoggerFactory.getLogger(this.getClass());

    final static String DefaultUser="captionamerica";


    //this field contains the single instance every initialized.
    private static INGConstant ingConstant;
    private static Vector<String> Credentials;
    private static int thread=0;

    private INGConstant () {
        //initialize
        if(Credentials == null) {
            Credentials = new Vector<String>();
            Credentials.add("gz2nwffrme5b1uq4yv3mxxvsneraopbjr2bziu4x:do4vpv5e5a0oezhfqdx0egdsriuya5dtigmho1sv");
            Credentials.add("foevgypnjyc1sw5vtwb5bvujnpvssgv1u31aasgv:vdvdz4wdrpl4ui3zz1vph12howwnll5sctvgwfuc");
            Credentials.add("is0l2vtihve1uyrga4qi3f4xzfnsoiyqee22bmkv:ohz2xydxxfczit0sxe44z5wvagbfrsra5jr4uswz");
            Credentials.add("rocwy5b4uptia05fvg13rmulby2l12vl3fndr0xb:g2adj005y4kpx0kaoe0un1tkng2lcwtclvza1ccf");
            Credentials.add("fsc1gvcvjz54we4jhtgwljsb5ixgvcfnw2da203i:4zibylysxiz2dxf5oagg5pe4n2heqgsg1lj0z3df");
            Credentials.add("serfir2lrm4lj1zwl2q452bbsdyzxq1smbyqs0v5:do5unhtoxe1wrdofu5dnk55xgeojsi4bmdq3gunv");
        }
        initiateServices();
        log.info("INGConstant created...");
    }

    //this is the method to obtain the single instance
    public static INGConstant getInstance () {
        if (ingConstant == null) {
            synchronized (INGConstant.class) {
                if (ingConstant == null) {
                    ingConstant = new INGConstant();
                }
            }
        }
        return ingConstant;
    }

    final private static TestUser testuser = new TestUser();
    private static HashMap<String, String> BANKS;
    private static HashMap<String, String> BanksShortName;
    private static OAuth10aService service;
    private static HashMap<String, String> accountMap;
    private static HashMap<Integer, OAuth10aService> serviceMap;

    public static ArrayList<ResponseAccountById> accountList = new ArrayList<ResponseAccountById>();;
    public static HashMap<String, TransactionHistBean> MyTransactionHist = new HashMap<String, TransactionHistBean>();;
    public static int count = 0;

    public synchronized ArrayList<ResponseAccountById> getAccountList() {
        return accountList;
    }

    public synchronized HashMap<String, TransactionHistBean> getMyTransactionHist() {
        return MyTransactionHist;
    }

    public synchronized int getCount(){
        return count;
    }

    public synchronized void clearCount(){
        count=0;
    }

    public synchronized void increaseCount(){
        count++;
    }

    public void setAccountList(ArrayList<ResponseAccountById> accountList) {
        INGConstant.accountList = accountList;
    }

    public String getDefaultUser() {
        return DefaultUser;
    }

    public HashMap<String, String> getBanksShortName() {
        if(BanksShortName == null){
            BanksShortName = new HashMap<String, String>();
            BanksShortName.put("at02-1465--01", "Netherlands Bank");
            BanksShortName.put("at02-0182--01", "Spanish Bank");
            BanksShortName.put("at02-0019--01", "German Bank");
            BanksShortName.put("at02-0049--01", "Santander Bank");
            BanksShortName.put("at02-0073--01", "Open Bank");
            BanksShortName.put("at02-0075--01", "Banco Popular");
            BanksShortName.put("at02-2048--01", "Liber Bank");
        }
        return BanksShortName;
    }

    public TestUser getTestuser() {
        return testuser;
    }

    public HashMap<String, String> getBANKS() {
        return BANKS;
    }

    public void setBANKS(HashMap<String, String> BANKS) {
        INGConstant.BANKS = BANKS;
    }


    private void initiateServices() {
        serviceMap = new HashMap<Integer, OAuth10aService>();
        OAuth10aService tempService;
        int i = 0;
        for (String a : Credentials){
            tempService = new ServiceBuilder()
                    .apiKey(a.substring(0, a.indexOf(":")))
                    .apiSecret(a.substring(a.indexOf(":")+1))
                    .callback("https://auth-reckoning.herokuapp.com/ReckonINGExample/callBack/")
                    .build(OBPApi.instance());
            serviceMap.put(i++, tempService);
        }
    }

    public synchronized OAuth10aService getServices(){
        if(thread==Credentials.size()) thread=0;
        System.out.println("Thread running "+thread);
        return serviceMap.get(thread++);
    }

    public HashMap<String, String> getAccountMap() {
        if(accountMap == null){
            accountMap = new HashMap<String, String>();
        }
        return accountMap;
    }

    public synchronized void setAccountMap(HashMap<String, String> accountMap) {
        INGConstant.accountMap = accountMap;
    }


}

package cn.edu.sdu.middleware.axis2.services;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import javax.jws.WebService;
import cn.edu.sdu.middleware.axis2.modules.Account;

/**
 * 
 * @author Yonggang Yuan
 *
 */

@WebService
public class AccountServiceBean implements AccountService {

    /** 存放账户的缓存 **/
    public static List<Account> accounts = new ArrayList<Account>();

    @Override
    public String save(String name, Double balance) {
        Account account = new Account(name, balance);
        account.setId(UUID.randomUUID().toString());
        accounts.add(account);
        System.out.println(name + " has been saved successfully.");
        return account.getId();
    }

    @Override
    public Double getBalance(String id) {
        if(id == null || "".equals(id.trim())) {
            return -1.0;
        }
        for(Account a : accounts) {
            if(id.equals(a.getId())) {
                if(a.getBalance() < 0) {
                    return -1.0;
                }
                System.out.println("Geted balance is " + a.getBalance() + " RMB.");
                return a.getBalance();
            }
        }
        return -1.0;
    }

    @Override
    public Double deposit(String id, Double in) {
        if(id == null || "".equals(id.trim()) || in < 0) {
            return -1.0;
        }
        for(Account a : accounts) {
            if(id.equals(a.getId())) {
                a.setBalance(a.getBalance()+in);
                System.out.println("Deposited " + in + " RMB successfully.");
                return a.getBalance();
            }
        }
        return -1.0;
    }

    @Override
    public Double draw(String id, Double out) {
        if(id == null || "".equals(id.trim()) || out < 0) {
            return -1.0;
        }
        for(Account a : accounts) {
            if(id.equals(a.getId())) {
                if(a.getBalance() < 0 || a.getBalance() < out) {
                    return -1.0;
                }
                a.setBalance(a.getBalance() - out);
                System.out.println("Drawed " + out + " RMB successfully.");
                return a.getBalance();
            }
        }
        return -1.0;
    }

}

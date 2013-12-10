package cn.edu.sdu.middleware.axis2.clients;

import cn.edu.sdu.middleware.axis2.clients.stubs.AccountServiceBean;
import cn.edu.sdu.middleware.axis2.clients.stubs.AccountServiceBeanService;


/**
 * 
 * @author Yonggang Yuan
 *
 */

public class AccountClient {

    /** 声明Web Service **/
    public static AccountServiceBeanService actSvc = null;

    /** 声明Web Service的端口 **/
    public static AccountServiceBean actSvcBean = null;

    public static String FIRST_ID = null;

    /**
     * 初始化
     */
    static {
        actSvc = new AccountServiceBeanService();
        actSvcBean = actSvc.getPort(AccountServiceBean.class);
    }

    /**
     * 开始测试
     * @param args
     */
    public static void main(String[] args) {
        /* 注册一个账户 */
        testSave();

        /* 测试得到账户余额 */
        testGetBalance();

        /* 测试存款、取款 */
        testUpdate();
    }
    
    
    private static void testSave() {
        System.out.println("\n\n##### TEST REGISTER A NEW ACCOUNT #####");
        FIRST_ID = actSvcBean.save("Yonggan Yuan", 100.00);
        System.out.println("Yonggan Yuan has registered successfully.");
        System.out.println("#######################################\n\n");
    }

    private static void testGetBalance() {
        System.out.println("####### TEST GET BALANCE FOR A ACCOUNT ######");
        System.out.println("Yonggang Yuan's balance is : " + actSvcBean.getBalance(FIRST_ID));
        System.out.println("#############################################\n\n");
    }

    private static void testUpdate() {
        System.out.println("##### TEST DEPOSIT #####");
        System.out.println("Yonggang Yuan's balance BEFORE depositing is : " + actSvcBean.getBalance(FIRST_ID));
        System.out.println("Yonggang Yuan's balance AFTER depositing 100.00 RMB is : " + actSvcBean.deposit(FIRST_ID, 100.00));
        System.out.println("########################\n\n");

        System.out.println("##### TEST DRAW ######");
        System.out.println("Yonggang Yuan's balance BEFORE drating is : " + actSvcBean.getBalance(FIRST_ID));
        System.out.println("Yonggang Yuan's balance AFTER drating 50.00 RMB is : " + actSvcBean.draw(FIRST_ID, 50.00));
        System.out.println("######################\n\n");

        System.out.println("Yonggang Yuan's balance FINALLY is : " + actSvcBean.getBalance(FIRST_ID) + "\n\n");
    }

}

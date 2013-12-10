package account;

import stub.AccountServiceBean;
import stub.AccountServiceBeanService;


/**
 * 
 * @author Yonggang Yuan
 *
 */

public class AccountServiceTest {

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
        System.out.println("开始测试");
        /* 注册一个账户 */
        testSave();

        /* 测试得到账户余额 */
        testGetBalance();

        /* 测试存款、取款 */
        testUpdate();
        System.out.println("测试完毕");
    }
    
    
    private static void testSave() {
        System.out.println("测试注册账户：-----------------------------");
        System.out.println("注册账户：Yonggan Yuan");
        FIRST_ID = actSvcBean.save("Yonggan Yuan", 100.00);
    }

    private static void testGetBalance() {
        System.out.println("测试查询余额：-----------------------------");
        System.out.println("Yonggang Yuan的余额是：" + actSvcBean.getBalance(FIRST_ID));
    }

    private static void testUpdate() {
        System.out.println("测试存款：--------------------------------");
        System.out.println("Yonggang Yuan账户存款之前的余额：" + actSvcBean.getBalance(FIRST_ID));
        System.out.println("往Yongang Yuan账户存款100.00元之后的余额：" + actSvcBean.deposit(FIRST_ID, 100.00));

        System.out.println("测试取款：--------------------------------");
        System.out.println("Yonggang Yuan账户取款之前的余额：" + actSvcBean.getBalance(FIRST_ID));
        System.out.println("从Yonggang Yuan账户取款500.00元之后的余额：" + actSvcBean.draw(FIRST_ID, 50.00));

        System.out.println("Yonggang Yuan账户经过存取操作之后的余额：" + actSvcBean.getBalance(FIRST_ID));
    }

}

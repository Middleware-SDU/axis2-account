package cn.edu.sdu.middleware.axis2.services;

import javax.jws.WebService;

/**
 * 
 * @author Yonggang Yuan
 *
 */

@WebService
public interface AccountService {

    /**
     * 注册一个账户
     * @param name 账户名
     * @param balance 初始账面
     * @return 返回新注册的账户的ID
     */
    public String save(String name, Double balance);

    /**
     * 
     * @param id 账户ID
     * @return #1： 返回-1.0代表【账户不存在或者账户出现问题】
     *         #2：正常返回余额
     */
    public Double getBalance(String id);

    /**
     * 存款
     * @param id 账户ID
     * @param in 存款数额
     * @return #1： 返回-1.0代表【账户不存在或者传入的参数有问题】
     *         #2：正常返回存款后的余额
     */
    public Double deposit(String id, Double in);

    /**
     * 取款
     * @param id 账户ID
     * @param out 取款数额
     * @return #1： 返回-1.0代表【账户不存在或者余额不足或者传入的参数有问题】
     *         #2：正常返回取款后的余额
     */
    public Double draw(String id, Double out);

}

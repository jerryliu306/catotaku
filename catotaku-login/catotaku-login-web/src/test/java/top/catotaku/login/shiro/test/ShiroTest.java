package top.catotaku.login.shiro.test;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.*;
import org.apache.shiro.config.IniSecurityManagerFactory;
import org.apache.shiro.subject.Subject;
import org.apache.shiro.util.Factory;
import org.junit.Assert;
import org.junit.Test;

/**
 * shiro的测试类
 */
public class ShiroTest {

    @Test
    public void test1(){

        Factory<org.apache.shiro.mgt.SecurityManager> factory = new IniSecurityManagerFactory("classpath:shiro.ini");
        method(factory);

    }
    @Test
    public void test2(){

        Factory<org.apache.shiro.mgt.SecurityManager> factory = new IniSecurityManagerFactory("classpath:shiro-jdbc-realm.ini");
        method(factory);

    }

    public void method(Factory<org.apache.shiro.mgt.SecurityManager> factory){
        org.apache.shiro.mgt.SecurityManager securityManager = factory.getInstance();
        SecurityUtils.setSecurityManager(securityManager);
        Subject subject = SecurityUtils.getSubject();
        UsernamePasswordToken token = new UsernamePasswordToken("admin","admin");
        try {
            subject.login(token);
        } catch ( UnknownAccountException uae ) {
            System.out.println("不存在此用户");
        } catch ( IncorrectCredentialsException ice ) {
            System.out.println("密码错误");
        } catch ( LockedAccountException lae ) {
            System.out.println("用户被锁定");
        } catch ( AuthenticationException ae ) {
            System.out.println("未知异常");
        }
        Assert.assertTrue(subject.isAuthenticated());
    }


}

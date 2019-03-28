package springcloudsecurity.springcloudsecurity.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import springcloudsecurity.springcloudsecurity.service.UserDetailService;

/**
 * @Author: Leon
 * @Description:
 * @Date: Create in 1:27 AM 3/29/2019
 * @Modified By:
 */
@Configuration
@EnableWebSecurity
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {
    @Autowired
    private UserDetailService userDetailService;


    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(userDetailService);
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests().antMatchers("/","/hello","/login2","/aouth").permitAll() //指定不需要验证的页面，其他的默认会跳转到登录页
            .anyRequest()
            .authenticated()
            .and()
            .formLogin()  //支持表单提交
            .loginPage("/login2").permitAll()  //自定义登录页面
            .failureForwardUrl("/error")   //自定也错误
            .loginProcessingUrl("/login")  //提交action  也就是form表单中的action  login会调用security的登录不用自己实现
            .successForwardUrl("/hello")  //登录成功页面
            .and().logout()
            .permitAll();

        //        System.out.println(http.toString());
    }
}

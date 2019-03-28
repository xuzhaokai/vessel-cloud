package springcloudsecurity.springcloudsecurity.controller;

import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @Author: Leon
 * @Description:
 * @Date: Create in 1:32 AM 3/29/2019
 * @Modified By:
 */
public class OAuthController {

    @RequestMapping("/hello")
    String home(HttpServletRequest req,HttpServletResponse res) {return "hello world";
    }


}

/**
 * 
 * Create on 2017年1月3日
 */
package org.zl.springcloud.zuul;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Leo
 * @version 0.0.1
 */
@RestController
public class HomeController {

    @RequestMapping("/index")  
   public Object index() {  
       return "index";  
   }  
     
    @RequestMapping("/home")  
   public Object home() {  
       return "home";  
    } 

}

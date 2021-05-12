package acer.com.controller;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JasyptController {

    @Value("${info.username}")
    private String username;
    @Value("${info.password}")
    private String password;

    @RequestMapping("/jasypt")
    public String jasypt(){
        StringBuilder sb = new StringBuilder("{");
        sb.append(username);
        sb.append(",");
        sb.append(password);
        sb.append("}");
        return sb.toString();
    }
}

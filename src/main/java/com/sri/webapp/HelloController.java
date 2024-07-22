package com.sri.webapp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

    @RequestMapping("say-hello")
    @ResponseBody
    public String sayHello() {
        return "Hello world";
    }

    @RequestMapping("say-hello-html")
    @ResponseBody
    public String sayHelloHtml() {
        StringBuffer sb = new StringBuffer();
        sb.append("<html>\n" +
                "    <head>\n" +
                "        <title>My First HTML Page</title>\n" +
                "    </head>\n" +
                "    <body>\n" +
                "        <h1>My First HTML Page with Body</h1>\n" +
                "    </body>\n" +
                "</html>");
        return sb.toString();
    }

    // "say-hello-jsp" => sayHello.jsp
    // /src/main/resources/META-INF/resources/WEB-INF/jsp/sayHello.jsp
    @RequestMapping("say-hello-jsp")
    public String sayHelloJsp() {
        return "sayHello";
    }
}

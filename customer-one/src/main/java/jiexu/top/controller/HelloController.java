package jiexu.top.controller;

import jiexu.top.service.HelloService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Map;

/**
 * @author xujie
 */
@RestController
public class HelloController {

    @Resource
    private HelloService helloService;

    @RequestMapping("/hello")
    public Map hello(String name) {
        return helloService.oneService(name);
    }
}

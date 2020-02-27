package jiexu.top.controller;

import jiexu.top.domain.User;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @author xujie
 */
@RestController()
public class OneController {

    @Value("${server.port}")
    String port;

    @RequestMapping("/one")
    public Object one(String name) {

        Map<String, Object> map = new HashMap<>();
        User user = new User(1, name);
        String s = "one" + name + ",i am from port" + port;

        map.put("user", user);
        map.put("s", s);

        return map;
    }
}

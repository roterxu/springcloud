package jiexu.top.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Map;

/**
 * @author xujie
 */
@Service
public class HelloService {
    @Autowired
    private RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "oneServiceError")
    public Map oneService(String name) {
        return restTemplate.getForObject("http://service-one/one?name=" + name, Map.class);
    }

    public String oneServiceError() {
        return "oneService/hello is error";
    }
}

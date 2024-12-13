package ma.ensa.virtuelCard_service.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RefreshScope
public class VirtuelCardRestControllerTest {
    @Value("${global.params.p1}")
    String p1;
    @Value("${global.params.p2}")
    String p2;
    @Value("${virtuelCard.param.x}")
    String x;
    @Value("${virtuelCard.param.y}")
    String y;

    @GetMapping(path = "/getParams")
    public Map<String,String> getCustomerParams(){

        return Map.of("p1",p1,"p2",p2,"x",x,"y",y);
    }
}
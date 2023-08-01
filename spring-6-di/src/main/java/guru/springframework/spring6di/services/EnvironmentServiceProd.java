package guru.springframework.spring6di.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Controller;

@Profile("prod")
@Controller
public class EnvironmentServiceProd implements EnvironmentService {

    @Override
    public String getEnv() {
        return "prod";
    }
}

package mtg.edge;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

@EnableZuulProxy
@SpringBootApplication
public class MtgEdgeApplication {

	public static void main(String[] args) {
		SpringApplication.run(MtgEdgeApplication.class, args);
	}

}

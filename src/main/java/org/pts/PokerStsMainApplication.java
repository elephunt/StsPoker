package org.pts;

import org.pts.Runner.RunnerCmd;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;



/**
 * Created by romanm on 12/03/17.
 */
@SpringBootApplication
public class PokerStsMainApplication {


    public static void main(String args[]){
        SpringApplication.run(PokerStsMainApplication.class,args);
    }

    @Bean
    public RunnerCmd runnerCmd() {
        return new RunnerCmd();
    }
}

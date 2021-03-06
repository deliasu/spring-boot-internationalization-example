package net.csdcodes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

/**
 * creator: deliasu
 * site: https://csdcodes.net
 * date: 06/01/20
 */
@ServletComponentScan
@SpringBootApplication
public class Springbooti18nApplication {
    public static void  main(String[] args) {
        SpringApplication.run(Springbooti18nApplication.class, args);
    }
}

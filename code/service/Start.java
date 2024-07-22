package service;

import java.net.URL;
import java.util.Scanner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

class Start {
    public static void main(String[] data) {
        ApplicationContext context = SpringApplication.run(Setup.class);
    }
}

@SpringBootApplication
class Setup {}

@RestController
class Sample {

    @RequestMapping("/get-price")
    public String getPrice(@RequestParam("asset") String asset) {
        try {

            String baseUrl = "https://api.coinbase.com/v2/prices/";
            String endUrl = asset.toUpperCase() + "-USD/spot";
            
            String urlString = baseUrl + endUrl;
            
            URL url = new URL(urlString);
            Scanner input = new Scanner(url.openStream());
            StringBuilder read = new StringBuilder();
            
            while (input.hasNext()) {
                read.append(input.nextLine());
            }
            
            input.close();
            
            return read.toString();
            
        } catch (Exception e) {
            
            return "An Error Occurred";
            
        }
    }
}

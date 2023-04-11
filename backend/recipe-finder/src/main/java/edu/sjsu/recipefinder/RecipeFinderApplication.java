package edu.sjsu.recipefinder;

import edu.sjsu.recipefinder.service.DataLoader;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import redis.clients.jedis.Jedis;

@SpringBootApplication
public class RecipeFinderApplication {

    public static void main(String[] args) {
        SpringApplication.run(RecipeFinderApplication.class, args);

        Jedis jedis = new Jedis("localhost");
        System.out.println("Connection to server successfully");
        System.out.println("Server is running: "+jedis.ping());

        jedis.set("recipe-count","0");
        //jedis.incr("recipe-count");
        //System.out.println(jedis.get("recipe-count"));
        new DataLoader().loadData(jedis);
        }

    }


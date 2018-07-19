package academy.learnprogramming.console;

import academy.config.GameConfig;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@Slf4j
public class Main {

    // generated by Lombok
    // private static final Logger log = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        log.info("Guess the number name");

        // create context (container)
        //ConfigurableApplicationContext context = new ClassPathXmlApplicationContext(CONFIG_LOCATION);
        ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(GameConfig.class);

        /*
        NumberGenerator numberGenerator = context.getBean(NumberGenerator.class);

        // call next() to get a random number
        int number = numberGenerator.next();

        // log generated number
        log.info("number = {}", number);

        // get game bean form context(container)
        Game game = context.getBean(Game.class);

        MessageGenerator messageGenerator = context.getBean(MessageGenerator.class);
        log.info("getMainMessage() = {}", messageGenerator.getMainMessage());
        log.info("getResultMessage() = {}", messageGenerator.getResultMessage());
        */

        // close context
        context.close();
    }

}

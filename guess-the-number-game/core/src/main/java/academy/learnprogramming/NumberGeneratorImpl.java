package academy.learnprogramming;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class NumberGeneratorImpl implements NumberGenerator {

    private final Random random = new Random();

    // now we use constructor injection
    // @Autowired
    // @MaxNumber
    @Getter
    private final int maxNumber;

    // @Autowired
    // @MinNumber
    @Getter
    private final int minNumber;

    // autowire the constructor
    @Autowired
    public NumberGeneratorImpl(@MaxNumber int maxNumber, @MinNumber int minNumber) {
        this.maxNumber = maxNumber;
        this.minNumber = minNumber;
    }

    @Override
    public int next() {
        // return random.nextInt(maxNumber);
        return random.nextInt((maxNumber - minNumber) + 1) + minNumber;
    }

}

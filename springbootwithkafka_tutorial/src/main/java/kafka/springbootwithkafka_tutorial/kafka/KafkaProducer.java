package kafka.springbootwithkafka_tutorial.kafka;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaProducer {

    //This creates a logger instance of the KafkaProducer class, allowing you to log messages to the console or a file
    private static final Logger LOGGER = LoggerFactory.getLogger(KafkaProducer.class);

    //Spring-provided class that simplifies sending messages to Kafka Topics
    private KafkaTemplate<String,String> kafkaTemplate;

    public KafkaProducer(KafkaTemplate<String, String> kafkaTemplate){
        this.kafkaTemplate = kafkaTemplate;
    }

    public void sendMessage(String message){
        LOGGER.info(String.format("Message sent %s", message));
        kafkaTemplate.send("javaguides", message);
    }
}

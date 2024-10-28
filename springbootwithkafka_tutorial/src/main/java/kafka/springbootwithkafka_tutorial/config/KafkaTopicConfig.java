package kafka.springbootwithkafka_tutorial.config;


import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaTopicConfig {

    @Bean  //tells Spring container to create instance of the object so can allow dependency injection
    public NewTopic javaguidesTopic(){
        return TopicBuilder.name("javaguides")
                // .partitions(10)  //To create specific number of partitions
                .build();
    }

    @Bean  //tells Spring container to create instance of the object so can allow dependency injection
    public NewTopic javaguidesJsonTopic(){
        return TopicBuilder.name("javaguides_json")
                // .partitions(10)  //To create specific number of partitions
                .build();
    }


}

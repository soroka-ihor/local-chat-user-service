package es.local.chat.user.service.scheduled;

//import es.local.chat.user.service.producer.MessageProducer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.support.SendResult;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.util.concurrent.ListenableFuture;

import java.time.LocalDate;
import java.util.concurrent.ExecutionException;


@Component
public class SendMessageTask {

    private final Logger logger = LoggerFactory.getLogger(SendMessageTask.class);

//    private final MessageProducer producer;
//
//    public SendMessageTask(MessageProducer producer) {
//        this.producer = producer;
//    }

    // run every 3 sec
    // @Scheduled(fixedRateString = "3000")
//    public void send() throws ExecutionException, InterruptedException {
//        producer.sendMessage("my-topic", LocalDate.now().toString());
//    }

    @Scheduled(fixedRateString = "3000")
    public void currentTime() {
        logger.info(LocalDate.now().toString());
    }
}

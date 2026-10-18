package in.ganeshpandey.sb4_dynamic_logging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DynamicLogController {

    private static final Logger log = LoggerFactory.getLogger(DynamicLogController.class);

    @GetMapping("/logs")
    public String logMessages() {
        log.trace("This is a TRACE log message.");
        log.debug("This is a DEBUG log message.");
        log.info("This is an INFO log message.");
        log.warn("This is a WARN log message.");
        log.error("This is an ERROR log message.");

        return "Log messages generated for all log levels (TRACE, DEBUG, INFO, WARN, ERROR).";
    }
}

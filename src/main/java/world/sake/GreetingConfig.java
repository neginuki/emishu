package world.sake;

import io.quarkus.arc.config.ConfigProperties;
import org.eclipse.microprofile.config.inject.ConfigProperty;

@ConfigProperties(prefix = "greeting")
public interface GreetingConfig {

    @ConfigProperty(name = "message")
    String message();

}
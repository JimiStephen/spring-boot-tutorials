package com.jimi.spring.boot.mvc.conf;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.jimi.spring.boot.model.Result;
import org.springframework.boot.jackson.JsonComponent;

import java.io.IOException;

/**
 * Created by jimiStephen on 2019-04-12.
 */
@JsonComponent
public class JsonSerializeConfig {

    public static class Serializer extends JsonSerializer<Result> {
        @Override
        public void serialize(Result result, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {

        }

// ...
    }

    public static class Deserializer extends JsonDeserializer<Result> {
        @Override
        public Result deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException, JsonProcessingException {
            return null;
        }


// ...

    }
}

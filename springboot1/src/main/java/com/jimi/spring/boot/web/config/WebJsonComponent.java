package com.jimi.spring.boot.web.config;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.sun.deploy.net.HttpRequest;
import com.sun.deploy.net.HttpResponse;
import org.springframework.boot.jackson.JsonComponent;

import java.io.IOException;

/**
 * @author jimi
 * @version 1.0
 * @date 2020/7/21 16:32
 */
@JsonComponent
public class WebJsonComponent {

    public static class Serializer extends JsonSerializer<HttpResponse> {

        @Override
        public void serialize(HttpResponse httpResponse, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {

        }
    }

    public static class Deserializer extends JsonDeserializer<HttpRequest> {

        @Override
        public HttpRequest deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException, JsonProcessingException {

            return null;
        }
    }
}

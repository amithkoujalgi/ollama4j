package io.github.amithkoujalgi.ollama4j.core.models.chat;

import java.util.ArrayList;
import java.util.List;

import io.github.amithkoujalgi.ollama4j.core.OllamaStreamHandler;

public class OllamaChatStreamObserver {

    private OllamaStreamHandler streamHandler;

    private List<OllamaChatResponseModel> responseParts = new ArrayList<>();

    private String message = "";

    public OllamaChatStreamObserver(OllamaStreamHandler streamHandler) {
        this.streamHandler = streamHandler;
    }

    public void notify(OllamaChatResponseModel currentResponsePart){
        responseParts.add(currentResponsePart);
        handleCurrentResponsePart(currentResponsePart);
    }
    
    protected void handleCurrentResponsePart(OllamaChatResponseModel currentResponsePart){
        message = message + currentResponsePart.getMessage().getContent();
        streamHandler.accept(message);
    }


}

package de.jk.onesandheroes.lambda.handler.awsdefault;

import com.amazon.ask.dispatcher.request.handler.HandlerInput;
import com.amazon.ask.dispatcher.request.handler.RequestHandler;
import com.amazon.ask.model.Response;
import com.amazon.ask.model.SessionEndedRequest;
import com.amazon.ask.request.Predicates;

import java.util.Optional;

public class SessionEndedRequestHandler implements RequestHandler {

    @Override
    public boolean canHandle(HandlerInput input) {
        return input.matches((Predicates.requestType(SessionEndedRequest.class)));
    }

    @Override
    public Optional<Response> handle(HandlerInput input) {
        //any cleanup logic goes here
        return input.getResponseBuilder().build();
    }
}
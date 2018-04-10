package de.jk.onesandheroes.lambda.handler.awsdefault;

import java.util.Locale;
import java.util.Optional;
import java.util.ResourceBundle;

import com.amazon.ask.dispatcher.request.handler.HandlerInput;
import com.amazon.ask.dispatcher.request.handler.RequestHandler;
import com.amazon.ask.model.LaunchRequest;
import com.amazon.ask.model.Response;
import com.amazon.ask.request.Predicates;

import de.jk.onesandheroes.helper.LocaleConstants;

public class LaunchRequestHandler implements RequestHandler {
	  
    @Override
    public boolean canHandle(HandlerInput input) {
        return input.matches(Predicates.requestType(LaunchRequest.class));
    }

    @Override
    public Optional<Response> handle(HandlerInput input) {
    	Locale locale = Locale.forLanguageTag(input.getRequestEnvelope().getRequest().getLocale());
		ResourceBundle r = ResourceBundle.getBundle("Languages", locale);
		System.out.println("Locale: " +locale);
		String speechText = r.getString(LocaleConstants.ONLAUNCH);
		System.out.println("LaunchRequest");
		
        
        return input.getResponseBuilder()
                .withSpeech(speechText)
                .withSimpleCard("HelloWorld", speechText)
                .withReprompt(speechText)
                .build();
    }

}
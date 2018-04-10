package de.jk.onesandheroes.lambda.handler.lambda;

import com.amazon.ask.Skill;
import com.amazon.ask.SkillStreamHandler;
import com.amazon.ask.Skills;
import com.amazon.ask.model.SessionEndedRequest;

import de.jk.onesandheroes.lambda.HelloWorldIntentHandler;
import de.jk.onesandheroes.lambda.handler.awsdefault.CancelandStopIntentHandler;
import de.jk.onesandheroes.lambda.handler.awsdefault.HelpIntentHandler;
import de.jk.onesandheroes.lambda.handler.awsdefault.LaunchRequestHandler;
import de.jk.onesandheroes.lambda.handler.awsdefault.SessionEndedRequestHandler;

 public class LambdaStreamHandler extends SkillStreamHandler {
 
     private static Skill getSkill() {
         return Skills.standard()
                 .addRequestHandlers(new CancelandStopIntentHandler(), new HelloWorldIntentHandler(), new HelpIntentHandler(), new LaunchRequestHandler(), new SessionEndedRequestHandler())
                 .build();
     }
 
     public LambdaStreamHandler() {
         super(getSkill());
     }
 
 }
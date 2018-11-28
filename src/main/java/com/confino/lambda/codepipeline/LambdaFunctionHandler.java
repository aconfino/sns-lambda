package com.confino.lambda.codepipeline;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.amazonaws.services.lambda.runtime.events.SNSEvent;
import com.amazonaws.services.lambda.runtime.events.SNSEvent.SNS;

public class LambdaFunctionHandler implements RequestHandler<SNSEvent, Object> {
    
	public Object handleRequest(SNSEvent request, Context context){
    	if (request.getRecords().size() > 0) {
    		SNS sns = request.getRecords().get(0).getSNS();
    		if (sns.getMessage() != null) {
    			context.getLogger().log(sns.getMessage());
    		} else {
    			context.getLogger().log("No message. " + sns.getSignature() + " " + sns.getSubject());
    		}
    	}
    	return null;
	}

} 
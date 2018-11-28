package com.confino.lambda.codepipeline;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.amazonaws.services.lambda.runtime.events.SNSEvent;

public class LambdaFunctionHandler implements RequestHandler<SNSEvent, Object> {
    public Object handleRequest(SNSEvent request, Context context){
    context.getLogger().log(request.getRecords().get(0).getSNS().getMessage());
    return null;
    }
} 
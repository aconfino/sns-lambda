package com.confino.lambda.codepipeline;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.amazonaws.services.lambda.runtime.events.S3Event;
import com.amazonaws.services.s3.event.S3EventNotification;

public class LambdaFunctionHandler implements RequestHandler<S3Event, String> {
    

    @Override
    public String handleRequest(S3Event event, Context context) {
    	
        for (S3EventNotification.S3EventNotificationRecord record : event.getRecords()) {

            String s3Key = record.getS3().getObject().getKey();
            String s3Bucket = record.getS3().getBucket().getName();
            context.getLogger().log("Received record with bucket: " + s3Bucket + "  and key: " + s3Key);
            
        }
    	
        return "success!";

        
    }
}
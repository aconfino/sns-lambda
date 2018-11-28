package com.confino.lambda.codepipeline;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

public class LambdaFunctionHandler implements RequestHandler<CodeBuildStatus, Object> {
	
    public Object handleRequest(CodeBuildStatus request, Context context){
    String timeStamp = new SimpleDateFormat("yyyy-MM-dd_HH:mm:ss").format(Calendar.getInstance().getTime());
    context.getLogger().log("Invocation started: " + timeStamp);

    context.getLogger().log(request.getProjectName());
    context.getLogger().log(request.getBuildId());
    context.getLogger().log(request.getCompletedPhase());
    context.getLogger().log(request.getCompletedPhaseStatus());
    
    timeStamp = new SimpleDateFormat("yyyy-MM-dd_HH:mm:ss").format(Calendar.getInstance().getTime());
    context.getLogger().log("Invocation completed: " + timeStamp);
    
    return null;
    }
}
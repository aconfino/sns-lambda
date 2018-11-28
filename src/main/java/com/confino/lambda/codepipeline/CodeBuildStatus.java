package com.confino.lambda.codepipeline;

public class CodeBuildStatus {
	
	private String completedPhase;
	private String projectName;
	private String buildId;
	private String completedPhaseStatus;
	
	
	public String getCompletedPhase() {
		return completedPhase;
	}




	public void setCompletedPhase(String completedPhase) {
		this.completedPhase = completedPhase;
	}




	public String getProjectName() {
		return projectName;
	}




	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}




	public String getBuildId() {
		return buildId;
	}




	public void setBuildId(String buildId) {
		this.buildId = buildId;
	}




	public String getCompletedPhaseStatus() {
		return completedPhaseStatus;
	}




	public void setCompletedPhaseStatus(String completedPhaseStatus) {
		this.completedPhaseStatus = completedPhaseStatus;
	}


}

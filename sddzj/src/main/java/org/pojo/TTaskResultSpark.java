package org.pojo;

public class TTaskResultSpark {
    private Integer resultId;

    private String resultPath;

    private String resultLength;

    private Integer taskId;

    public Integer getResultId() {
        return resultId;
    }

    public void setResultId(Integer resultId) {
        this.resultId = resultId;
    }

    public String getResultPath() {
        return resultPath;
    }

    public void setResultPath(String resultPath) {
        this.resultPath = resultPath == null ? null : resultPath.trim();
    }

    public String getResultLength() {
        return resultLength;
    }

    public void setResultLength(String resultLength) {
        this.resultLength = resultLength == null ? null : resultLength.trim();
    }

    public Integer getTaskId() {
        return taskId;
    }

    public void setTaskId(Integer taskId) {
        this.taskId = taskId;
    }
}
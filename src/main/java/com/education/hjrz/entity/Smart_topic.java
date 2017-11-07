package com.education.hjrz.entity;

import java.util.Date;

public class Smart_topic {
    private Integer id;

    private Boolean type;

    private Date inputDate;

    private Boolean isDelete;

    private Integer difficulty;

    private Integer wrongTimes;

    private Integer totalTimes;

    private Double errorRate;

    private Integer commentCount;

    private Integer commentValue;

    private String questionFrom;

    private Integer shareCount;

    private Integer sumCommentValue;

    private String uploadCode;

    private Date uploadDate;

    private Integer uploadFlag;

    private Integer uploadId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Boolean getType() {
        return type;
    }

    public void setType(Boolean type) {
        this.type = type;
    }

    public Date getInputDate() {
        return inputDate;
    }

    public void setInputDate(Date inputDate) {
        this.inputDate = inputDate;
    }

    public Boolean getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Boolean isDelete) {
        this.isDelete = isDelete;
    }

    public Integer getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(Integer difficulty) {
        this.difficulty = difficulty;
    }

    public Integer getWrongTimes() {
        return wrongTimes;
    }

    public void setWrongTimes(Integer wrongTimes) {
        this.wrongTimes = wrongTimes;
    }

    public Integer getTotalTimes() {
        return totalTimes;
    }

    public void setTotalTimes(Integer totalTimes) {
        this.totalTimes = totalTimes;
    }

    public Double getErrorRate() {
        return errorRate;
    }

    public void setErrorRate(Double errorRate) {
        this.errorRate = errorRate;
    }

    public Integer getCommentCount() {
        return commentCount;
    }

    public void setCommentCount(Integer commentCount) {
        this.commentCount = commentCount;
    }

    public Integer getCommentValue() {
        return commentValue;
    }

    public void setCommentValue(Integer commentValue) {
        this.commentValue = commentValue;
    }

    public String getQuestionFrom() {
        return questionFrom;
    }

    public void setQuestionFrom(String questionFrom) {
        this.questionFrom = questionFrom == null ? null : questionFrom.trim();
    }

    public Integer getShareCount() {
        return shareCount;
    }

    public void setShareCount(Integer shareCount) {
        this.shareCount = shareCount;
    }

    public Integer getSumCommentValue() {
        return sumCommentValue;
    }

    public void setSumCommentValue(Integer sumCommentValue) {
        this.sumCommentValue = sumCommentValue;
    }

    public String getUploadCode() {
        return uploadCode;
    }

    public void setUploadCode(String uploadCode) {
        this.uploadCode = uploadCode == null ? null : uploadCode.trim();
    }

    public Date getUploadDate() {
        return uploadDate;
    }

    public void setUploadDate(Date uploadDate) {
        this.uploadDate = uploadDate;
    }

    public Integer getUploadFlag() {
        return uploadFlag;
    }

    public void setUploadFlag(Integer uploadFlag) {
        this.uploadFlag = uploadFlag;
    }

    public Integer getUploadId() {
        return uploadId;
    }

    public void setUploadId(Integer uploadId) {
        this.uploadId = uploadId;
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Smart_topic other = (Smart_topic) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getType() == null ? other.getType() == null : this.getType().equals(other.getType()))
            && (this.getInputDate() == null ? other.getInputDate() == null : this.getInputDate().equals(other.getInputDate()))
            && (this.getIsDelete() == null ? other.getIsDelete() == null : this.getIsDelete().equals(other.getIsDelete()))
            && (this.getDifficulty() == null ? other.getDifficulty() == null : this.getDifficulty().equals(other.getDifficulty()))
            && (this.getWrongTimes() == null ? other.getWrongTimes() == null : this.getWrongTimes().equals(other.getWrongTimes()))
            && (this.getTotalTimes() == null ? other.getTotalTimes() == null : this.getTotalTimes().equals(other.getTotalTimes()))
            && (this.getErrorRate() == null ? other.getErrorRate() == null : this.getErrorRate().equals(other.getErrorRate()))
            && (this.getCommentCount() == null ? other.getCommentCount() == null : this.getCommentCount().equals(other.getCommentCount()))
            && (this.getCommentValue() == null ? other.getCommentValue() == null : this.getCommentValue().equals(other.getCommentValue()))
            && (this.getQuestionFrom() == null ? other.getQuestionFrom() == null : this.getQuestionFrom().equals(other.getQuestionFrom()))
            && (this.getShareCount() == null ? other.getShareCount() == null : this.getShareCount().equals(other.getShareCount()))
            && (this.getSumCommentValue() == null ? other.getSumCommentValue() == null : this.getSumCommentValue().equals(other.getSumCommentValue()))
            && (this.getUploadCode() == null ? other.getUploadCode() == null : this.getUploadCode().equals(other.getUploadCode()))
            && (this.getUploadDate() == null ? other.getUploadDate() == null : this.getUploadDate().equals(other.getUploadDate()))
            && (this.getUploadFlag() == null ? other.getUploadFlag() == null : this.getUploadFlag().equals(other.getUploadFlag()))
            && (this.getUploadId() == null ? other.getUploadId() == null : this.getUploadId().equals(other.getUploadId()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getType() == null) ? 0 : getType().hashCode());
        result = prime * result + ((getInputDate() == null) ? 0 : getInputDate().hashCode());
        result = prime * result + ((getIsDelete() == null) ? 0 : getIsDelete().hashCode());
        result = prime * result + ((getDifficulty() == null) ? 0 : getDifficulty().hashCode());
        result = prime * result + ((getWrongTimes() == null) ? 0 : getWrongTimes().hashCode());
        result = prime * result + ((getTotalTimes() == null) ? 0 : getTotalTimes().hashCode());
        result = prime * result + ((getErrorRate() == null) ? 0 : getErrorRate().hashCode());
        result = prime * result + ((getCommentCount() == null) ? 0 : getCommentCount().hashCode());
        result = prime * result + ((getCommentValue() == null) ? 0 : getCommentValue().hashCode());
        result = prime * result + ((getQuestionFrom() == null) ? 0 : getQuestionFrom().hashCode());
        result = prime * result + ((getShareCount() == null) ? 0 : getShareCount().hashCode());
        result = prime * result + ((getSumCommentValue() == null) ? 0 : getSumCommentValue().hashCode());
        result = prime * result + ((getUploadCode() == null) ? 0 : getUploadCode().hashCode());
        result = prime * result + ((getUploadDate() == null) ? 0 : getUploadDate().hashCode());
        result = prime * result + ((getUploadFlag() == null) ? 0 : getUploadFlag().hashCode());
        result = prime * result + ((getUploadId() == null) ? 0 : getUploadId().hashCode());
        return result;
    }
}
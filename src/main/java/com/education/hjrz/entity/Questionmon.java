package com.education.hjrz.entity;

import java.util.Date;

public class Questionmon {
    private Long questionId;

    private Long courseId;

    private Integer optionCount;

    private Integer subQuestionFlag;

    private Long questionTypeId;

    private Integer difficulty;

    private Float difficultyValue;

    private Long firstKnowledgeId;

    private Long secondKnowledgeId;

    private Long thirdKnowledgeId;

    private Integer zujuanCount;

    private Integer commentCount;

    private Integer commentValue;

    private Integer sumCommentValue;

    private Integer shareCount;

    private String questionFrom;

    private Integer uploadFlag;

    private Long uploadId;

    private String uploadCode;

    private String uploadName;

    private Long uploadSchoolId;

    private String uploadImg;

    private Date uploadDate;

    private Long secondAuditId;

    private String secondAuditCode;

    private String secondAuditName;

    private Long secondAuditSchoolId;

    private String secondAuditImg;

    private Date secondAuditDate;

    private Integer goodFlag;

    private Integer status;

    private Integer sortNo;

    private Date inputDate;

    public Long getQuestionId() {
        return questionId;
    }

    public void setQuestionId(Long questionId) {
        this.questionId = questionId;
    }

    public Long getCourseId() {
        return courseId;
    }

    public void setCourseId(Long courseId) {
        this.courseId = courseId;
    }

    public Integer getOptionCount() {
        return optionCount;
    }

    public void setOptionCount(Integer optionCount) {
        this.optionCount = optionCount;
    }

    public Integer getSubQuestionFlag() {
        return subQuestionFlag;
    }

    public void setSubQuestionFlag(Integer subQuestionFlag) {
        this.subQuestionFlag = subQuestionFlag;
    }

    public Long getQuestionTypeId() {
        return questionTypeId;
    }

    public void setQuestionTypeId(Long questionTypeId) {
        this.questionTypeId = questionTypeId;
    }

    public Integer getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(Integer difficulty) {
        this.difficulty = difficulty;
    }

    public Float getDifficultyValue() {
        return difficultyValue;
    }

    public void setDifficultyValue(Float difficultyValue) {
        this.difficultyValue = difficultyValue;
    }

    public Long getFirstKnowledgeId() {
        return firstKnowledgeId;
    }

    public void setFirstKnowledgeId(Long firstKnowledgeId) {
        this.firstKnowledgeId = firstKnowledgeId;
    }

    public Long getSecondKnowledgeId() {
        return secondKnowledgeId;
    }

    public void setSecondKnowledgeId(Long secondKnowledgeId) {
        this.secondKnowledgeId = secondKnowledgeId;
    }

    public Long getThirdKnowledgeId() {
        return thirdKnowledgeId;
    }

    public void setThirdKnowledgeId(Long thirdKnowledgeId) {
        this.thirdKnowledgeId = thirdKnowledgeId;
    }

    public Integer getZujuanCount() {
        return zujuanCount;
    }

    public void setZujuanCount(Integer zujuanCount) {
        this.zujuanCount = zujuanCount;
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

    public Integer getSumCommentValue() {
        return sumCommentValue;
    }

    public void setSumCommentValue(Integer sumCommentValue) {
        this.sumCommentValue = sumCommentValue;
    }

    public Integer getShareCount() {
        return shareCount;
    }

    public void setShareCount(Integer shareCount) {
        this.shareCount = shareCount;
    }

    public String getQuestionFrom() {
        return questionFrom;
    }

    public void setQuestionFrom(String questionFrom) {
        this.questionFrom = questionFrom == null ? null : questionFrom.trim();
    }

    public Integer getUploadFlag() {
        return uploadFlag;
    }

    public void setUploadFlag(Integer uploadFlag) {
        this.uploadFlag = uploadFlag;
    }

    public Long getUploadId() {
        return uploadId;
    }

    public void setUploadId(Long uploadId) {
        this.uploadId = uploadId;
    }

    public String getUploadCode() {
        return uploadCode;
    }

    public void setUploadCode(String uploadCode) {
        this.uploadCode = uploadCode == null ? null : uploadCode.trim();
    }

    public String getUploadName() {
        return uploadName;
    }

    public void setUploadName(String uploadName) {
        this.uploadName = uploadName == null ? null : uploadName.trim();
    }

    public Long getUploadSchoolId() {
        return uploadSchoolId;
    }

    public void setUploadSchoolId(Long uploadSchoolId) {
        this.uploadSchoolId = uploadSchoolId;
    }

    public String getUploadImg() {
        return uploadImg;
    }

    public void setUploadImg(String uploadImg) {
        this.uploadImg = uploadImg == null ? null : uploadImg.trim();
    }

    public Date getUploadDate() {
        return uploadDate;
    }

    public void setUploadDate(Date uploadDate) {
        this.uploadDate = uploadDate;
    }

    public Long getSecondAuditId() {
        return secondAuditId;
    }

    public void setSecondAuditId(Long secondAuditId) {
        this.secondAuditId = secondAuditId;
    }

    public String getSecondAuditCode() {
        return secondAuditCode;
    }

    public void setSecondAuditCode(String secondAuditCode) {
        this.secondAuditCode = secondAuditCode == null ? null : secondAuditCode.trim();
    }

    public String getSecondAuditName() {
        return secondAuditName;
    }

    public void setSecondAuditName(String secondAuditName) {
        this.secondAuditName = secondAuditName == null ? null : secondAuditName.trim();
    }

    public Long getSecondAuditSchoolId() {
        return secondAuditSchoolId;
    }

    public void setSecondAuditSchoolId(Long secondAuditSchoolId) {
        this.secondAuditSchoolId = secondAuditSchoolId;
    }

    public String getSecondAuditImg() {
        return secondAuditImg;
    }

    public void setSecondAuditImg(String secondAuditImg) {
        this.secondAuditImg = secondAuditImg == null ? null : secondAuditImg.trim();
    }

    public Date getSecondAuditDate() {
        return secondAuditDate;
    }

    public void setSecondAuditDate(Date secondAuditDate) {
        this.secondAuditDate = secondAuditDate;
    }

    public Integer getGoodFlag() {
        return goodFlag;
    }

    public void setGoodFlag(Integer goodFlag) {
        this.goodFlag = goodFlag;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getSortNo() {
        return sortNo;
    }

    public void setSortNo(Integer sortNo) {
        this.sortNo = sortNo;
    }

    public Date getInputDate() {
        return inputDate;
    }

    public void setInputDate(Date inputDate) {
        this.inputDate = inputDate;
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
        Questionmon other = (Questionmon) that;
        return (this.getQuestionId() == null ? other.getQuestionId() == null : this.getQuestionId().equals(other.getQuestionId()))
            && (this.getCourseId() == null ? other.getCourseId() == null : this.getCourseId().equals(other.getCourseId()))
            && (this.getOptionCount() == null ? other.getOptionCount() == null : this.getOptionCount().equals(other.getOptionCount()))
            && (this.getSubQuestionFlag() == null ? other.getSubQuestionFlag() == null : this.getSubQuestionFlag().equals(other.getSubQuestionFlag()))
            && (this.getQuestionTypeId() == null ? other.getQuestionTypeId() == null : this.getQuestionTypeId().equals(other.getQuestionTypeId()))
            && (this.getDifficulty() == null ? other.getDifficulty() == null : this.getDifficulty().equals(other.getDifficulty()))
            && (this.getDifficultyValue() == null ? other.getDifficultyValue() == null : this.getDifficultyValue().equals(other.getDifficultyValue()))
            && (this.getFirstKnowledgeId() == null ? other.getFirstKnowledgeId() == null : this.getFirstKnowledgeId().equals(other.getFirstKnowledgeId()))
            && (this.getSecondKnowledgeId() == null ? other.getSecondKnowledgeId() == null : this.getSecondKnowledgeId().equals(other.getSecondKnowledgeId()))
            && (this.getThirdKnowledgeId() == null ? other.getThirdKnowledgeId() == null : this.getThirdKnowledgeId().equals(other.getThirdKnowledgeId()))
            && (this.getZujuanCount() == null ? other.getZujuanCount() == null : this.getZujuanCount().equals(other.getZujuanCount()))
            && (this.getCommentCount() == null ? other.getCommentCount() == null : this.getCommentCount().equals(other.getCommentCount()))
            && (this.getCommentValue() == null ? other.getCommentValue() == null : this.getCommentValue().equals(other.getCommentValue()))
            && (this.getSumCommentValue() == null ? other.getSumCommentValue() == null : this.getSumCommentValue().equals(other.getSumCommentValue()))
            && (this.getShareCount() == null ? other.getShareCount() == null : this.getShareCount().equals(other.getShareCount()))
            && (this.getQuestionFrom() == null ? other.getQuestionFrom() == null : this.getQuestionFrom().equals(other.getQuestionFrom()))
            && (this.getUploadFlag() == null ? other.getUploadFlag() == null : this.getUploadFlag().equals(other.getUploadFlag()))
            && (this.getUploadId() == null ? other.getUploadId() == null : this.getUploadId().equals(other.getUploadId()))
            && (this.getUploadCode() == null ? other.getUploadCode() == null : this.getUploadCode().equals(other.getUploadCode()))
            && (this.getUploadName() == null ? other.getUploadName() == null : this.getUploadName().equals(other.getUploadName()))
            && (this.getUploadSchoolId() == null ? other.getUploadSchoolId() == null : this.getUploadSchoolId().equals(other.getUploadSchoolId()))
            && (this.getUploadImg() == null ? other.getUploadImg() == null : this.getUploadImg().equals(other.getUploadImg()))
            && (this.getUploadDate() == null ? other.getUploadDate() == null : this.getUploadDate().equals(other.getUploadDate()))
            && (this.getSecondAuditId() == null ? other.getSecondAuditId() == null : this.getSecondAuditId().equals(other.getSecondAuditId()))
            && (this.getSecondAuditCode() == null ? other.getSecondAuditCode() == null : this.getSecondAuditCode().equals(other.getSecondAuditCode()))
            && (this.getSecondAuditName() == null ? other.getSecondAuditName() == null : this.getSecondAuditName().equals(other.getSecondAuditName()))
            && (this.getSecondAuditSchoolId() == null ? other.getSecondAuditSchoolId() == null : this.getSecondAuditSchoolId().equals(other.getSecondAuditSchoolId()))
            && (this.getSecondAuditImg() == null ? other.getSecondAuditImg() == null : this.getSecondAuditImg().equals(other.getSecondAuditImg()))
            && (this.getSecondAuditDate() == null ? other.getSecondAuditDate() == null : this.getSecondAuditDate().equals(other.getSecondAuditDate()))
            && (this.getGoodFlag() == null ? other.getGoodFlag() == null : this.getGoodFlag().equals(other.getGoodFlag()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getSortNo() == null ? other.getSortNo() == null : this.getSortNo().equals(other.getSortNo()))
            && (this.getInputDate() == null ? other.getInputDate() == null : this.getInputDate().equals(other.getInputDate()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getQuestionId() == null) ? 0 : getQuestionId().hashCode());
        result = prime * result + ((getCourseId() == null) ? 0 : getCourseId().hashCode());
        result = prime * result + ((getOptionCount() == null) ? 0 : getOptionCount().hashCode());
        result = prime * result + ((getSubQuestionFlag() == null) ? 0 : getSubQuestionFlag().hashCode());
        result = prime * result + ((getQuestionTypeId() == null) ? 0 : getQuestionTypeId().hashCode());
        result = prime * result + ((getDifficulty() == null) ? 0 : getDifficulty().hashCode());
        result = prime * result + ((getDifficultyValue() == null) ? 0 : getDifficultyValue().hashCode());
        result = prime * result + ((getFirstKnowledgeId() == null) ? 0 : getFirstKnowledgeId().hashCode());
        result = prime * result + ((getSecondKnowledgeId() == null) ? 0 : getSecondKnowledgeId().hashCode());
        result = prime * result + ((getThirdKnowledgeId() == null) ? 0 : getThirdKnowledgeId().hashCode());
        result = prime * result + ((getZujuanCount() == null) ? 0 : getZujuanCount().hashCode());
        result = prime * result + ((getCommentCount() == null) ? 0 : getCommentCount().hashCode());
        result = prime * result + ((getCommentValue() == null) ? 0 : getCommentValue().hashCode());
        result = prime * result + ((getSumCommentValue() == null) ? 0 : getSumCommentValue().hashCode());
        result = prime * result + ((getShareCount() == null) ? 0 : getShareCount().hashCode());
        result = prime * result + ((getQuestionFrom() == null) ? 0 : getQuestionFrom().hashCode());
        result = prime * result + ((getUploadFlag() == null) ? 0 : getUploadFlag().hashCode());
        result = prime * result + ((getUploadId() == null) ? 0 : getUploadId().hashCode());
        result = prime * result + ((getUploadCode() == null) ? 0 : getUploadCode().hashCode());
        result = prime * result + ((getUploadName() == null) ? 0 : getUploadName().hashCode());
        result = prime * result + ((getUploadSchoolId() == null) ? 0 : getUploadSchoolId().hashCode());
        result = prime * result + ((getUploadImg() == null) ? 0 : getUploadImg().hashCode());
        result = prime * result + ((getUploadDate() == null) ? 0 : getUploadDate().hashCode());
        result = prime * result + ((getSecondAuditId() == null) ? 0 : getSecondAuditId().hashCode());
        result = prime * result + ((getSecondAuditCode() == null) ? 0 : getSecondAuditCode().hashCode());
        result = prime * result + ((getSecondAuditName() == null) ? 0 : getSecondAuditName().hashCode());
        result = prime * result + ((getSecondAuditSchoolId() == null) ? 0 : getSecondAuditSchoolId().hashCode());
        result = prime * result + ((getSecondAuditImg() == null) ? 0 : getSecondAuditImg().hashCode());
        result = prime * result + ((getSecondAuditDate() == null) ? 0 : getSecondAuditDate().hashCode());
        result = prime * result + ((getGoodFlag() == null) ? 0 : getGoodFlag().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getSortNo() == null) ? 0 : getSortNo().hashCode());
        result = prime * result + ((getInputDate() == null) ? 0 : getInputDate().hashCode());
        return result;
    }
}
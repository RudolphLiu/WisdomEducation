package com.education.hjrz.entity;

public class QuestionmonWithBLOBs extends Questionmon {
    private String bodyHtml;

    private String bodyText;

    private String optionHtmlList;

    private String answer;

    private String answerHtml;

    private String anylysisHtml;

    private String commentHtml;

    private String subQuestionMon;

    public String getBodyHtml() {
        return bodyHtml;
    }

    public void setBodyHtml(String bodyHtml) {
        this.bodyHtml = bodyHtml == null ? null : bodyHtml.trim();
    }

    public String getBodyText() {
        return bodyText;
    }

    public void setBodyText(String bodyText) {
        this.bodyText = bodyText == null ? null : bodyText.trim();
    }

    public String getOptionHtmlList() {
        return optionHtmlList;
    }

    public void setOptionHtmlList(String optionHtmlList) {
        this.optionHtmlList = optionHtmlList == null ? null : optionHtmlList.trim();
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer == null ? null : answer.trim();
    }

    public String getAnswerHtml() {
        return answerHtml;
    }

    public void setAnswerHtml(String answerHtml) {
        this.answerHtml = answerHtml == null ? null : answerHtml.trim();
    }

    public String getAnylysisHtml() {
        return anylysisHtml;
    }

    public void setAnylysisHtml(String anylysisHtml) {
        this.anylysisHtml = anylysisHtml == null ? null : anylysisHtml.trim();
    }

    public String getCommentHtml() {
        return commentHtml;
    }

    public void setCommentHtml(String commentHtml) {
        this.commentHtml = commentHtml == null ? null : commentHtml.trim();
    }

    public String getSubQuestionMon() {
        return subQuestionMon;
    }

    public void setSubQuestionMon(String subQuestionMon) {
        this.subQuestionMon = subQuestionMon == null ? null : subQuestionMon.trim();
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
        QuestionmonWithBLOBs other = (QuestionmonWithBLOBs) that;
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
            && (this.getInputDate() == null ? other.getInputDate() == null : this.getInputDate().equals(other.getInputDate()))
            && (this.getBodyHtml() == null ? other.getBodyHtml() == null : this.getBodyHtml().equals(other.getBodyHtml()))
            && (this.getBodyText() == null ? other.getBodyText() == null : this.getBodyText().equals(other.getBodyText()))
            && (this.getOptionHtmlList() == null ? other.getOptionHtmlList() == null : this.getOptionHtmlList().equals(other.getOptionHtmlList()))
            && (this.getAnswer() == null ? other.getAnswer() == null : this.getAnswer().equals(other.getAnswer()))
            && (this.getAnswerHtml() == null ? other.getAnswerHtml() == null : this.getAnswerHtml().equals(other.getAnswerHtml()))
            && (this.getAnylysisHtml() == null ? other.getAnylysisHtml() == null : this.getAnylysisHtml().equals(other.getAnylysisHtml()))
            && (this.getCommentHtml() == null ? other.getCommentHtml() == null : this.getCommentHtml().equals(other.getCommentHtml()))
            && (this.getSubQuestionMon() == null ? other.getSubQuestionMon() == null : this.getSubQuestionMon().equals(other.getSubQuestionMon()));
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
        result = prime * result + ((getBodyHtml() == null) ? 0 : getBodyHtml().hashCode());
        result = prime * result + ((getBodyText() == null) ? 0 : getBodyText().hashCode());
        result = prime * result + ((getOptionHtmlList() == null) ? 0 : getOptionHtmlList().hashCode());
        result = prime * result + ((getAnswer() == null) ? 0 : getAnswer().hashCode());
        result = prime * result + ((getAnswerHtml() == null) ? 0 : getAnswerHtml().hashCode());
        result = prime * result + ((getAnylysisHtml() == null) ? 0 : getAnylysisHtml().hashCode());
        result = prime * result + ((getCommentHtml() == null) ? 0 : getCommentHtml().hashCode());
        result = prime * result + ((getSubQuestionMon() == null) ? 0 : getSubQuestionMon().hashCode());
        return result;
    }
}
package com.education.hjrz.entity;

public class Smart_topicWithBLOBs extends Smart_topic {
    private String content;

    private String options;

    private String reference;

    private String anylysis;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    public String getOptions() {
        return options;
    }

    public void setOptions(String options) {
        this.options = options == null ? null : options.trim();
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference == null ? null : reference.trim();
    }

    public String getAnylysis() {
        return anylysis;
    }

    public void setAnylysis(String anylysis) {
        this.anylysis = anylysis == null ? null : anylysis.trim();
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
        Smart_topicWithBLOBs other = (Smart_topicWithBLOBs) that;
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
            && (this.getUploadId() == null ? other.getUploadId() == null : this.getUploadId().equals(other.getUploadId()))
            && (this.getContent() == null ? other.getContent() == null : this.getContent().equals(other.getContent()))
            && (this.getOptions() == null ? other.getOptions() == null : this.getOptions().equals(other.getOptions()))
            && (this.getReference() == null ? other.getReference() == null : this.getReference().equals(other.getReference()))
            && (this.getAnylysis() == null ? other.getAnylysis() == null : this.getAnylysis().equals(other.getAnylysis()));
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
        result = prime * result + ((getContent() == null) ? 0 : getContent().hashCode());
        result = prime * result + ((getOptions() == null) ? 0 : getOptions().hashCode());
        result = prime * result + ((getReference() == null) ? 0 : getReference().hashCode());
        result = prime * result + ((getAnylysis() == null) ? 0 : getAnylysis().hashCode());
        return result;
    }
}
package com.education.hjrz.entity;

public class Questiontype {
    private Long id;

    private Long courseId;

    private String questionTypeName;

    private Integer questionTypeFlag;

    private Integer sortNo;

    private Integer status;

    private Integer kuPrice;

    private Integer withJxPrice;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCourseId() {
        return courseId;
    }

    public void setCourseId(Long courseId) {
        this.courseId = courseId;
    }

    public String getQuestionTypeName() {
        return questionTypeName;
    }

    public void setQuestionTypeName(String questionTypeName) {
        this.questionTypeName = questionTypeName == null ? null : questionTypeName.trim();
    }

    public Integer getQuestionTypeFlag() {
        return questionTypeFlag;
    }

    public void setQuestionTypeFlag(Integer questionTypeFlag) {
        this.questionTypeFlag = questionTypeFlag;
    }

    public Integer getSortNo() {
        return sortNo;
    }

    public void setSortNo(Integer sortNo) {
        this.sortNo = sortNo;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getKuPrice() {
        return kuPrice;
    }

    public void setKuPrice(Integer kuPrice) {
        this.kuPrice = kuPrice;
    }

    public Integer getWithJxPrice() {
        return withJxPrice;
    }

    public void setWithJxPrice(Integer withJxPrice) {
        this.withJxPrice = withJxPrice;
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
        Questiontype other = (Questiontype) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getCourseId() == null ? other.getCourseId() == null : this.getCourseId().equals(other.getCourseId()))
            && (this.getQuestionTypeName() == null ? other.getQuestionTypeName() == null : this.getQuestionTypeName().equals(other.getQuestionTypeName()))
            && (this.getQuestionTypeFlag() == null ? other.getQuestionTypeFlag() == null : this.getQuestionTypeFlag().equals(other.getQuestionTypeFlag()))
            && (this.getSortNo() == null ? other.getSortNo() == null : this.getSortNo().equals(other.getSortNo()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getKuPrice() == null ? other.getKuPrice() == null : this.getKuPrice().equals(other.getKuPrice()))
            && (this.getWithJxPrice() == null ? other.getWithJxPrice() == null : this.getWithJxPrice().equals(other.getWithJxPrice()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getCourseId() == null) ? 0 : getCourseId().hashCode());
        result = prime * result + ((getQuestionTypeName() == null) ? 0 : getQuestionTypeName().hashCode());
        result = prime * result + ((getQuestionTypeFlag() == null) ? 0 : getQuestionTypeFlag().hashCode());
        result = prime * result + ((getSortNo() == null) ? 0 : getSortNo().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getKuPrice() == null) ? 0 : getKuPrice().hashCode());
        result = prime * result + ((getWithJxPrice() == null) ? 0 : getWithJxPrice().hashCode());
        return result;
    }
}
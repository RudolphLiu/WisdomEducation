package com.education.hjrz.entity;

public class Course {
    private Long id;

    private Integer studyType;

    private String courseName;

    private Integer tikuFlag;

    private Integer resourceFlag;

    private Integer evaluationFlag;

    private Float paperDiscount;

    private Float paperAnaDiscount;

    private Integer guidLearnPrice;

    private Integer courseWarePrice;

    private Integer teachPlanPrice;

    private Integer sortNo;

    private Integer status;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getStudyType() {
        return studyType;
    }

    public void setStudyType(Integer studyType) {
        this.studyType = studyType;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName == null ? null : courseName.trim();
    }

    public Integer getTikuFlag() {
        return tikuFlag;
    }

    public void setTikuFlag(Integer tikuFlag) {
        this.tikuFlag = tikuFlag;
    }

    public Integer getResourceFlag() {
        return resourceFlag;
    }

    public void setResourceFlag(Integer resourceFlag) {
        this.resourceFlag = resourceFlag;
    }

    public Integer getEvaluationFlag() {
        return evaluationFlag;
    }

    public void setEvaluationFlag(Integer evaluationFlag) {
        this.evaluationFlag = evaluationFlag;
    }

    public Float getPaperDiscount() {
        return paperDiscount;
    }

    public void setPaperDiscount(Float paperDiscount) {
        this.paperDiscount = paperDiscount;
    }

    public Float getPaperAnaDiscount() {
        return paperAnaDiscount;
    }

    public void setPaperAnaDiscount(Float paperAnaDiscount) {
        this.paperAnaDiscount = paperAnaDiscount;
    }

    public Integer getGuidLearnPrice() {
        return guidLearnPrice;
    }

    public void setGuidLearnPrice(Integer guidLearnPrice) {
        this.guidLearnPrice = guidLearnPrice;
    }

    public Integer getCourseWarePrice() {
        return courseWarePrice;
    }

    public void setCourseWarePrice(Integer courseWarePrice) {
        this.courseWarePrice = courseWarePrice;
    }

    public Integer getTeachPlanPrice() {
        return teachPlanPrice;
    }

    public void setTeachPlanPrice(Integer teachPlanPrice) {
        this.teachPlanPrice = teachPlanPrice;
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
        Course other = (Course) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getStudyType() == null ? other.getStudyType() == null : this.getStudyType().equals(other.getStudyType()))
            && (this.getCourseName() == null ? other.getCourseName() == null : this.getCourseName().equals(other.getCourseName()))
            && (this.getTikuFlag() == null ? other.getTikuFlag() == null : this.getTikuFlag().equals(other.getTikuFlag()))
            && (this.getResourceFlag() == null ? other.getResourceFlag() == null : this.getResourceFlag().equals(other.getResourceFlag()))
            && (this.getEvaluationFlag() == null ? other.getEvaluationFlag() == null : this.getEvaluationFlag().equals(other.getEvaluationFlag()))
            && (this.getPaperDiscount() == null ? other.getPaperDiscount() == null : this.getPaperDiscount().equals(other.getPaperDiscount()))
            && (this.getPaperAnaDiscount() == null ? other.getPaperAnaDiscount() == null : this.getPaperAnaDiscount().equals(other.getPaperAnaDiscount()))
            && (this.getGuidLearnPrice() == null ? other.getGuidLearnPrice() == null : this.getGuidLearnPrice().equals(other.getGuidLearnPrice()))
            && (this.getCourseWarePrice() == null ? other.getCourseWarePrice() == null : this.getCourseWarePrice().equals(other.getCourseWarePrice()))
            && (this.getTeachPlanPrice() == null ? other.getTeachPlanPrice() == null : this.getTeachPlanPrice().equals(other.getTeachPlanPrice()))
            && (this.getSortNo() == null ? other.getSortNo() == null : this.getSortNo().equals(other.getSortNo()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getStudyType() == null) ? 0 : getStudyType().hashCode());
        result = prime * result + ((getCourseName() == null) ? 0 : getCourseName().hashCode());
        result = prime * result + ((getTikuFlag() == null) ? 0 : getTikuFlag().hashCode());
        result = prime * result + ((getResourceFlag() == null) ? 0 : getResourceFlag().hashCode());
        result = prime * result + ((getEvaluationFlag() == null) ? 0 : getEvaluationFlag().hashCode());
        result = prime * result + ((getPaperDiscount() == null) ? 0 : getPaperDiscount().hashCode());
        result = prime * result + ((getPaperAnaDiscount() == null) ? 0 : getPaperAnaDiscount().hashCode());
        result = prime * result + ((getGuidLearnPrice() == null) ? 0 : getGuidLearnPrice().hashCode());
        result = prime * result + ((getCourseWarePrice() == null) ? 0 : getCourseWarePrice().hashCode());
        result = prime * result + ((getTeachPlanPrice() == null) ? 0 : getTeachPlanPrice().hashCode());
        result = prime * result + ((getSortNo() == null) ? 0 : getSortNo().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        return result;
    }
}
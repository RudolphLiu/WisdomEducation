package com.education.hjrz.entity;

public class Smart_knowledge_info {
    private Integer id;

    private String name;

    private Integer PKnow;

    private Integer knowType;

    private Integer topicNum;

    private Integer level;

    private Boolean isDelete;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getPKnow() {
        return PKnow;
    }

    public void setPKnow(Integer PKnow) {
        this.PKnow = PKnow;
    }

    public Integer getKnowType() {
        return knowType;
    }

    public void setKnowType(Integer knowType) {
        this.knowType = knowType;
    }

    public Integer getTopicNum() {
        return topicNum;
    }

    public void setTopicNum(Integer topicNum) {
        this.topicNum = topicNum;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public Boolean getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Boolean isDelete) {
        this.isDelete = isDelete;
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
        Smart_knowledge_info other = (Smart_knowledge_info) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getPKnow() == null ? other.getPKnow() == null : this.getPKnow().equals(other.getPKnow()))
            && (this.getKnowType() == null ? other.getKnowType() == null : this.getKnowType().equals(other.getKnowType()))
            && (this.getTopicNum() == null ? other.getTopicNum() == null : this.getTopicNum().equals(other.getTopicNum()))
            && (this.getLevel() == null ? other.getLevel() == null : this.getLevel().equals(other.getLevel()))
            && (this.getIsDelete() == null ? other.getIsDelete() == null : this.getIsDelete().equals(other.getIsDelete()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getPKnow() == null) ? 0 : getPKnow().hashCode());
        result = prime * result + ((getKnowType() == null) ? 0 : getKnowType().hashCode());
        result = prime * result + ((getTopicNum() == null) ? 0 : getTopicNum().hashCode());
        result = prime * result + ((getLevel() == null) ? 0 : getLevel().hashCode());
        result = prime * result + ((getIsDelete() == null) ? 0 : getIsDelete().hashCode());
        return result;
    }
}
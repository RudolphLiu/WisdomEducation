package com.education.hjrz.entity;

public class Smart_topic_knowledge {
    private Integer id;

    private Boolean isDelete;

    private Integer knowledge_id;

    private Integer topicID_id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Boolean getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Boolean isDelete) {
        this.isDelete = isDelete;
    }

    public Integer getKnowledge_id() {
        return knowledge_id;
    }

    public void setKnowledge_id(Integer knowledge_id) {
        this.knowledge_id = knowledge_id;
    }

    public Integer getTopicID_id() {
        return topicID_id;
    }

    public void setTopicID_id(Integer topicID_id) {
        this.topicID_id = topicID_id;
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
        Smart_topic_knowledge other = (Smart_topic_knowledge) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getIsDelete() == null ? other.getIsDelete() == null : this.getIsDelete().equals(other.getIsDelete()))
            && (this.getKnowledge_id() == null ? other.getKnowledge_id() == null : this.getKnowledge_id().equals(other.getKnowledge_id()))
            && (this.getTopicID_id() == null ? other.getTopicID_id() == null : this.getTopicID_id().equals(other.getTopicID_id()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getIsDelete() == null) ? 0 : getIsDelete().hashCode());
        result = prime * result + ((getKnowledge_id() == null) ? 0 : getKnowledge_id().hashCode());
        result = prime * result + ((getTopicID_id() == null) ? 0 : getTopicID_id().hashCode());
        return result;
    }
}
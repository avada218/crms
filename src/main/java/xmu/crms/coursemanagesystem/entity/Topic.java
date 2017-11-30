package xmu.crms.coursemanagesystem.entity;

/**
 * @author badcode
 * @date 2017/11/30
 */
public class Topic {

    private Long id;
    private String name;
    private String description;
    private Integer groupList;
    private Integer groupLeft;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getGroupList() {
        return groupList;
    }

    public void setGroupList(Integer groupList) {
        this.groupList = groupList;
    }

    public Integer getGroupLeft() {
        return groupLeft;
    }

    public void setGroupLeft(Integer groupLeft) {
        this.groupLeft = groupLeft;
    }

    @Override
    public String toString() {
        return "Topic{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", groupList=" + groupList +
                ", groupLeft=" + groupLeft +
                '}';
    }
}

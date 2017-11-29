package xmu.crms.coursemanagesystem.vo;

/**
 * @author badcode
 * @date 2017/11/29
 */
public class GetClassVO {

    private Long id;
    private String name;

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

    @Override
    public String toString() {
        return "GetClassVO{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}

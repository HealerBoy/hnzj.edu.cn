package hnzj.edu.cn.entity;

public class Classes {
    private int id;
    private String classes;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getClasses() {
        return classes;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    @Override
    public String toString() {
        return "Classes{" +
                "id=" + id +
                ", classes='" + classes + '\'' +
                '}';
    }
}

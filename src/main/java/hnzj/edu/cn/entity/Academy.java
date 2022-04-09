package hnzj.edu.cn.entity;

public class Academy {
    private int id;
    private String twoCollegeName;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTwoCollegeName() {
        return twoCollegeName;
    }

    public void setTwoCollegeName(String twoCollegeName) {
        this.twoCollegeName = twoCollegeName;
    }
    @Override
    public String toString() {
        return "Academy{" +
                "id=" + id +
                ", twoCollegeName='" + twoCollegeName + '\'' +
                '}';
    }
}

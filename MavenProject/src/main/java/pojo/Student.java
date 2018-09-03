package pojo;

public class Student {
    private Integer sId;
    private String sName;
    private Integer sAge;
    private Integer sSex;
    private String sAdress;
    private Integer sClass;

    @Override
    public String toString() {
        return "Student{" +
                "sId=" + sId +
                ", sName='" + sName + '\'' +
                ", sAge=" + sAge +
                ", sSex=" + sSex +
                ", sAdress='" + sAdress + '\'' +
                ", sClass=" + sClass +
                '}';
    }

    public Integer getsId() {
        return sId;
    }

    public String getsName() {
        return sName;
    }

    public Integer getsAge() {
        return sAge;
    }

    public Integer getsSex() {
        return sSex;
    }

    public String getsAdress() {
        return sAdress;
    }

    public Integer getsClass() {
        return sClass;
    }

    public void setsId(Integer sId) {
        this.sId = sId;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public void setsAge(Integer sAge) {
        this.sAge = sAge;
    }

    public void setsSex(Integer sSex) {
        this.sSex = sSex;
    }

    public void setsAdress(String sAdress) {
        this.sAdress = sAdress;
    }

    public void setsClass(Integer sClass) {
        this.sClass = sClass;
    }
}

package Obj;

public class Dane {

    private String name;
    private int id;
    private String group;

    public Dane(String name, int id, String group) {
        this.name = name;
        this.id = id;
        this.group = group;
    }

    @Override
    public String toString() {
        return "Dane{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", group='" + group + '\'' +
                '}';
    }
}

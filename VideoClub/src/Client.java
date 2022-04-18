public class Client {

    private String name;
    private String tel;
    private String dir;

    public Client() {
    }

    public Client(String name, String tel, String dir) {
        this.name = name;
        this.tel = tel;
        this.dir = dir;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getDir() {
        return dir;
    }

    public void setDir(String dir) {
        this.dir = dir;
    }

    @Override
    public String toString() {
        return "Client{" +
                "name='" + name + '\'' +
                ", tel='" + tel + '\'' +
                ", dir='" + dir + '\'' +
                '}';
    }
}

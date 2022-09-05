import java.util.List;

public class User {
    private int id;
    private List<Integer> integers;

    public User(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public List<Integer> getIntegers() {
        return integers;
    }

    public void setIntegers(List<Integer> integers) {
        this.integers = integers;
    }
}

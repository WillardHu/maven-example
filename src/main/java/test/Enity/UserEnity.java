package test.Enity;

/**
 * @author Dong
 * @since
 */

public class UserEnity {

    private String userName;
    private int age;

    @Override
    public String toString() {
        return "UserEnity{" +
                "userName='" + userName + '\'' +
                ", age=" + age +
                '}';
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

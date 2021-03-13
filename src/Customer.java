public class Customer {

    private String name;
    private int age;

    //get and set name
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    //get and set age
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    //check user is old enough to watch film
    public boolean checkAge(int a, int cert){
        return a >= cert;
    }


}

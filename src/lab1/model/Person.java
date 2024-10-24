//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package lab1.model;

public abstract class Person {
    protected String fullName;
    protected int birth_year;
    protected String phone_number;
    protected int id;

    public Person(String fullName, int birth_year, String phone_number) {
        this.fullName = fullName;
        this.birth_year = birth_year;
        this.phone_number = phone_number;
    }

    public String toString() {
        return "Person{fullName='" + this.fullName + "', birth_year=" + this.birth_year + ", phone_number='" + this.phone_number + "'}";
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getFullName() {
        return this.fullName;
    }

    public void setBirth_year(int birth_year) {
        this.birth_year = birth_year;
    }

    public int getBirthYear() {
        return this.birth_year;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public String getPhoneNumber() {
        return this.phone_number;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return this.id;
    }
}

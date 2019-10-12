package academy.learnprogramming;

public class Person {
    private String firstName;
    private String lastName;
    private int age;

    public boolean isTeen(){
        if(getAge()> 12 && getAge()<20){
            return true;
        }
        return false;
    }

    public String getFullName(){
        if(getFirstName() == null || getFirstName().isEmpty()){
            if(getLastName() == null || getLastName().isEmpty()){
                return "";
            }else{
                return getLastName();
            }
        }else if (getLastName()==null || getLastName().isEmpty()){
            return getFirstName();
        }
        return getFirstName()+" "+getLastName();
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age < 0 || age > 100){
            this.age = 0;
        }else{
            this.age = age;
        }
    }
}

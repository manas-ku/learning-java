public class Info {
    private String name;
    private String address;
    private int age;
    private int phoneNumber;

    public void setName(String name){
        this.name = name;
    }

    public void setAddress(String address){
        this.address = address;
    }

    public void setAge(int age){
        this.age = age;
    }

    public void setPhoneNumber(int phoneNumber){
        this.phoneNumber = phoneNumber;
    }

    public int getPhoneNumber(){
        return phoneNumber;
    }

    public int getAge(){
        return age;
    }

    public String getAddress(){
        return address;
    }

    public String getName(){
        return name;
    }
}

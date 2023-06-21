public class Person {
    private String name;
    private String address;
    private String email;

    public Person(String name, String address, String email){
        this.name = name;
        this.address = address;
        this.email = email;
    }

    public String getName(){
        return this.name;
    }

    public String getAddress(){
        return this.address;
    }

    public String getEmail(){
        return this.email;
    }

    public void setName(String newName){
        this.name = newName;
    }

    public void setAddress(String newAddress){
        this.address = newAddress;
    }

    public void setEmail(String newEmail){
        this.email = newEmail;
    }
}
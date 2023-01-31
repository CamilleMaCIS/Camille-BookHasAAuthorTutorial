public class Author {

    //properties
    private String name;
    private String email;
    private char gender;

    //constructors
    public Author(String name, String email, char gender){
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    //methods
    public String getName(){
        return this.name;
    }
    public String getEmail(){
        return this.email;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public char getGender(){
        return this.gender;
    }
    public String toString(){
        return name + " (" + gender + ") at " + email;
    }
}

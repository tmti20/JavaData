public class Name {
    private String FirstName ;
    private String MiddleName ;
    private String LastName ;
    private String FullName ;

    public Name(String firstName, String lastName){
        FirstName = firstName;
        LastName = lastName;
    }
    public Name(){
        FirstName = "";
        LastName = "";
    }

    public String getFirstName(){
        return FirstName;
    }
    public String getMiddleName(){
        return MiddleName;
    }
    public String getLastName(){
        return LastName;
    }
    public String getFullName(){
        return FullName;
    }


    public void setFirstName(String firstName) {
        FirstName = firstName;
    }
    public void setMiddleName(String middleName) {
        MiddleName = middleName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public void setFullName(String fullName) {
        FullName = fullName;
    }

    public String toString(){
        return "Name: " + FirstName + " " + LastName;
    }


}


package co.escuelaing.edu.usersmicroservice.data;


public class User {
    private String id;
    private String name;
    private String email;
    private String lastName;
    private String createdAt;
    
    public User(String id,String name,String email,String lastName,String createdAt){
        this.id=id;
        this.name=name;
        this.email=email;
        this.lastName=lastName;
        this.createdAt=createdAt;
        
        
    }
    public String getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public String getEmail(){
        return email;
    }
    public String getLastName(){
        return lastName;
    }
    public String getCreatedAt(){
        return createdAt;
    }
    public void setName(String name){
        this.name=name;
    }
    public void setEmail(String email){
        this.email=email;
    }
    public void setLastName(String lastName){
        this.lastName=lastName;
    }
    public void setCreatedAt(String createdAt){
        this.createdAt=createdAt;
    }
    public void setId(String id){
        this.id=id;
    }
}

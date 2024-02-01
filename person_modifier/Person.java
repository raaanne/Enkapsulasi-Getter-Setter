package person_modifier;

class Person {

    private String username;
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Person() {
        System.out.println("eksekusi method constructor. . .");
    }
     public Person(String a) {
        System.out.println("eksekusi method constructor. . .");
    }
//    private String name;
//    
//    public void setName(String name) {
//        this.name = name;
//    }
//    public String getName(){
//        return this.name;
//    }
}

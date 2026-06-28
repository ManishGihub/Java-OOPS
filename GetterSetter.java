// Getter and Setters

class Account{
    private String password; //Private variable

    public String getPassword(){ //getter
        return this.password;
    }

    public void setPassword(String pass){ //setter
        this.password = pass;
    }
}

public class GetterSetter{
    public static void main(String[] args) {
        Account a1 = new Account();
        a1.setPassword("abcd");

        System.out.println(a1.getPassword());
    }
}
// abcd
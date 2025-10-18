public class Registration {


    private String email;
    private String userName;
    private String password;

     public void setEmail(String email) {
        if (email != null && email.endsWith("@yahoo.com")) {
            this.email = email;
            System.out.println("Email successfully set.");
        } else {
            System.out.println("Invalid email. Only Yahoo emails are accepted.");
        }
    }


    public void setUserName(String userName) {
        if (userName != null && userName.length() > 6) {
            this.userName = userName;
            System.out.println("Username successfully set.");
        } else {
            System.out.println("Invalid username. It must be longer than 6 characters.");
        }
    }


    public void setPassword(String password) {
        if (password != null && password.length() > 6) {
            if (this.userName != null && password.contains(this.userName)) {
                System.out.println("Invalid password. It cannot contain the username.");
            } else {
                this.password = password;
                System.out.println("Password successfully set.");
            }
        } else {
            System.out.println("Invalid password. It must be longer than 6 characters.");
        }
    }


    public void displayInfo() {
        System.out.println("\n--- User Registration Info ---");
        System.out.println("Email: " + email);
        System.out.println("Username: " + userName);
        System.out.println("Password: " + password);
    }


    public static void main(String[] args) {
        Registration user = new Registration();

        user.setEmail("felipe@yahoo.com");
        user.setUserName("felipetest");
        user.setPassword("strongPass123");

        user.displayInfo();


    }

}

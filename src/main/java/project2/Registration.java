package project2;

public class Registration {
    private String email;
    private String userName;
    private String password;

    public void setEmail(String email) {
      if (email.contains("@yahoo")) {
          this.email = email;
      } else {
          System.out.println("Is not valid");

      }
  }

  public void  setUserName(String userName ) {
       if (!userName.isEmpty() && userName.length() > 6) {
           this.userName = userName;
       } else {
           System.out.println("Invalid userName. It cannot be empty");

       }


   }
    void setPassword(String password) {
        if (!password.isEmpty() && password.length() > 6 && !password.contains(userName)) {
            this.password = password;
        } else {

            System.out.println("It is empty");

        }



}

    public static class RegistrationTester {
        public static void main(String[] args) {
            Registration r=new Registration();
            r.setEmail("abc@yahoo.com");
            r.setUserName("asdfghjhjk");
            r.setPassword("1234567890");



    
        }
    }
}

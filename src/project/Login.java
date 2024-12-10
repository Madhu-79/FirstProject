package project;

public class Login {
private String myusername="user";
private String mypassword="pass";

public void doLogin(String username,String password) {
	//local class
	class Validate{
		public boolean validatecreditials() {
			return myusername.equals(username)&&mypassword.equals(password);
		}
	}
	Validate v =new Validate();
	//anonymous display 1 time
	DisplayMessage dm= new DisplayMessage(){
		@Override
		public void showMessage(String message) {
			System.out.println(message);
		}
	};
	if (v.validatecreditials()) {
		dm.showMessage("login sucessful");
	}
	else {
		dm.showMessage("invalid credentials");
	}
}
interface DisplayMessage{
	void showMessage(String message);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Login l=new Login();
l.doLogin("user","pass");
l.doLogin("jg","hgjg");
	}

}

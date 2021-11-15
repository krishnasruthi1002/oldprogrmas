package Magneto;

import org.testng.annotations.Test;

public class Execution extends Repository {
  @Test
  public void f() throws Exception {
	  
	  Repository.login();
	  Thread.sleep(3000);
	  
  }
}

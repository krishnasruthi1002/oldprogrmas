package tripdetails;

import org.testng.annotations.Test;

public class Execution extends Repository{
  @Test
  public void f() throws Exception {
	  
	  Repository.flight();
	  Thread.sleep(50000);
  }
}

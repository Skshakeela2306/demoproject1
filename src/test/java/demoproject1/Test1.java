package demoproject1;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Test1 
{
  @Test
  public void f() 
  {
	  String s="Sonu";
	  String rev="";
	  for(int i=s.length()-1; i>=0;i--)
	  {
		  rev=rev+s.charAt(i);
	  }
  Reporter.log(rev);
  }
  }
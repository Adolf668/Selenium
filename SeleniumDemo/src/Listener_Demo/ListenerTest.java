package Listener_Demo;

	import org.testng.ITestContext;
	import org.testng.ITestListener;
	import org.testng.ITestResult;
	
	
	public class ListenerTest implements ITestListener {

		
		@Override		
	    public void onFinish(ITestContext Result) {								
	        		
	    }		

	    @Override		
	    public void onStart(ITestContext Result) {					
	        
	    }		

	    @Override		
	    public void onTestFailedButWithinSuccessPercentage(ITestResult Result) {					
	      		
	    }	
	 
	    //When Test case get failed, this method is called

	    @Override		
	    public void onTestFailure(ITestResult Result) {					
	  			
	    	System.out.println("The name of the testcase failed is :"+Result.getName());
	    }
	    
	    //When Test case get skipped, this method is called

	    @Override		
	    public void onTestSkipped(ITestResult Result) {					
			
	       System.out.println("The name of the testcase skipped is :"+Result.getInstanceName()); 		
	    }
	    
	    //When Test case get started, this method is called

	    @Override		
	    public void onTestStart(ITestResult Result) {					
	       System.out.println(Result.getName()+"test case started");			
	    }	
	    
	    //When Test case get passed, this method is called
       @Override		
	    public void onTestSuccess(ITestResult Result) {					
	      
    	   System.out.println("The name of the testcase passed is :"+Result.getName());
	        		
	    }
	}
		

	


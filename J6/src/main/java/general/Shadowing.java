package general;

public class Shadowing {
    private int int1;
    
    public void tt1() {
    	int int1 = 1; // valid
    	
    	System.out.println("int1: " + int1); //refers to local variable
    	System.out.println("this.int1: " + this.int1); //refers to instance variable
    }
    
    //valid
    public void tt2(int int1) {
    	System.out.println("int1: " + int1); //refers to local var
    	System.out.println("this.int1: " + this.int1); //refers to instance variable
    }
    
    //invalid
    public void tt3(int int1) {
    	int int1=1;
    }
}

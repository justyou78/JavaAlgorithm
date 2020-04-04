package com.example.test02;


class Super {
    int index = 5;
    int a =9;
    public void printVal() {
         System.out.println("Super");
    }
}
class Sub extends Super {
     int index = 2;
    
    public void printVal() {
    	
    	System.out.println("Sub");
    }
}
public class Runner {
    public static void main(String[] args) {
            Super sup=new Sub();
            System.out.println(sup.index + " ");
            Sub s = new Sub();
            
            if(sup instanceof Sub) {
            	Sub sub = (Sub)sup;
            	sub.printVal();
            	
            	System.out.println(sub.index);
            }
            
            sup.printVal();
    }
}

// Super : index, printVal("Super")
// Sub : index- S, @printVal("Sub"), index - Sub
package org.opentutorials.javatutorials.object;
 
class Calculator{
    int left, right;
      
    public void setOprands(int left, int right){
        this.left = left;  //이거 this 뭔지 알아야돼..
        this.right = right; //이게뭐야
    }
      
    public void sum(){
        System.out.println(this.left+this.right);
    }
      
    public void avg(){
        System.out.println((this.left+this.right)/2);
    }
}
  
public class CalculatorDemo4 {
      
    public static void main(String[] args) {
          
        Calculator c1 = new Calculator();
        c1.setOprands(10, 20);
        c1.sum();       
        c1.avg();       
          
        Calculator c2 = new Calculator();
        c2.setOprands(20, 40); 
        c2.sum();       
        c2.avg();
    }
  
}
// package lab3_07_03;

// import java.util.ArrayList;

class stack_basic {
 
    static int capacity=5;
    int arr[]=new int[capacity];
     int top;

    public boolean isEmpty(){
        return top==-1;
    }
    stack_basic(){
        top=-1;
    }
    public  void push(int data){

       if(top>=capacity-1){
          System.out.println("stack  overflow");
       }else{
          arr[++top]=data;
 
          System.out.println(data+" is push.");


          
       }

        
    }
    public  void pop() {
        if(isEmpty()){
            System.out.println("static is empty");
            return;
        }
        int val=arr[top];
        System.out.println(val+" is pop");
        top--;
        
        
    }

    public int peek(){

        if(isEmpty()){

            return -1;
        }
        return arr[top];

    }
    public static void main(String[] args){
        // System.out.println("hello jee");
        // System.out.println(arr.length);

        stack_basic stack=new stack_basic();
        stack.push(1);
        stack.push(2);
        stack.push(3);
  
        stack.push(4);
        stack.push(5);
        stack.pop();
        stack.pop();

        // stack_basic s1=new stack_basic();
        // System.out.println(s1.peek());
        // s1.push(1000);
        // System.out.println(s1.peek()+" top ele");

        
      



        System.out.println(stack.peek()+" top ele");


    }
    
}

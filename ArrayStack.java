package howard.edu.ood.hw2.collections;

public class ArrayStack{
public static void main(String args[]){
	StackOperations mystack = new StackOperations(10);
	for (int i = 0; i<6;i+=1){
		mystack.push(i);
	}
	System.out.println("Stack size is "+ mystack.getSize());
	System.out.println("Last element is "+mystack.peek());
	System.out.println("Popping: "+ mystack.pop());	
	System.out.println("Popping: "+ mystack.pop());	
	System.out.println("Stack size is "+ mystack.getSize());
	}
}
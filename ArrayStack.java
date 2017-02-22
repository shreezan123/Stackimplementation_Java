package howard.edu.ood.hw2.collections;
import java.util.*;
import java.io.*;

public class ArrayStack{
public static void main(String args[]){
	StackOperations mystack = new StackOperations(10);
	/*Although the stack size is instantiated as 10, the code works for insertion for as many 
	number of items as demonstrated below*/
	for (int i = 0; i<100;i+=1){
		mystack.push(i);
	}
	int stacksize = mystack.getSize();
	if (stacksize == 0){
		try{
			throw new NoSuchElementException();
		}catch (NoSuchElementException exc){
			System.out.println("There is no element present");
		}
	}
	System.out.println("Stack size is "+ mystack.getSize());
	System.out.println("Last element is "+mystack.peek());
	System.out.println("Popping: "+ mystack.pop());	
	System.out.println("Stack size is "+ mystack.getSize());
	System.out.println("Popping: "+ mystack.pop());	
	}
}
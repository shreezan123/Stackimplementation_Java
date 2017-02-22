package howard.edu.ood.hw2.collections;

public class StackOperations{
	int mystack[];
	int global_size;
	int counter = 0;
	public StackOperations(int size){
		this.mystack = new int[size]; //create a stack of size as mentioned while creating object
		this.global_size = size; //update the global variable 
	}
	//the below method will allow us to calculate the number of 
	
	public void push(int value){
		if (counter<global_size){
		mystack[counter] = value;
		counter += 1;//we have to do this unless counter < stacksize
		}
		else{
			this.mystack = new int[counter+1];
			mystack[counter] = value;
			counter += 1;
		}
	}
	public int getSize(){
		return counter;
	}
	public boolean isempty(){
		if (counter==0){
			return true;
		}
		return false;
	}
	public int peek(){
		return mystack[counter-1];
	}
	
	public int pop(){
		int lastelem = mystack[counter-1];
		int afterpopped[] = new int[counter];
		counter -= 1;
		for (int i = 0; i < counter-1; i+=1){
			afterpopped [i] = mystack[i];
		}
		return lastelem;
	}		
}
	
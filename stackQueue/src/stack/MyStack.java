package stack;

public class MyStack {
    public int[] arr;
    public int size;
    public int index = 0;
    public MyStack(int size){
        this.size = size;
        arr = new int[this.size];
    }

    public boolean isEmpty(){
        boolean status = false;
        if (index==0){
            status = true;
        }
        return status;
    }

    public boolean isFull(){
        boolean status = false;
        if (index>size){
            status = true;
        }
        return status;
    }

    public int size(){
        return this.size;
    }

    public void push(int e) throws Exception {
        if (isFull()){
            throw new Exception("stack is full");
        } else {
            arr[index] = e;
            index++;
        }
    }

    public int pop() throws Exception {
        if (isEmpty()){
            throw new Exception("stack is null");
        }
        return arr[--index];
    }
}

package Optional;

public class MyQueue {
    public int capacity;
    public int[] queueArr;
    public int head =0 ;
    public int tail = -1;
    public int size = 0;

    public MyQueue(int queueSize){
        this.capacity = queueSize;
        queueArr = new int[this.capacity];
    }

    public boolean isQueueFull(){
        boolean status = false;
        if (size==capacity){
            status = true;
        }
        return status;
    }

    public boolean isQueueEmpty(){
        boolean status = false;
        if (size==0){
            status=true;
        }
        return status;
    }

    public void enqueue(int e){
        if (isQueueFull()){
            System.out.println("Overflow ! Unable to add element: " + e);
        } else {
            tail++;
            if (tail==capacity-1){
                tail = 0;
            }
            queueArr[tail] = e;
            size++;
            System.out.println("Element " + e + " is pushed to Queue !");
        }
    }
    public void dequeue(){
        if (isQueueEmpty()){
            System.out.println("Underflow ! Unable to remove element from Queue");
        } else {
            head++;
            if (head==capacity-1){
                System.out.println("Pop operation done ! removed: " + queueArr[head - 1]);
                head = 0;
            } else {
                System.out.println("Pop operation done ! removed: " + queueArr[head - 1]);
            }
            size--;
        }
    }
}

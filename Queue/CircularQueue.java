
public class CircularQueue {

    static class Queue {

        static int arr[];
        static int rear;
        static int size;
        static int front;

        Queue(int n) {
            arr = new int[n];
            size = n;
            rear = -1;
            front =-1;
        }

        public boolean isEmpty() {
            return rear == -1 && front == -1;
        }

        public static boolean isFull(){
            return (rear+1) % size == front;
        }

        public void add(int num) {
            if (isFull()) {
                System.out.println("Queue is Full");
                return;
            }
            if(front == -1) {
                front = 0;
            }
            rear = (rear + 1) % size;
            arr[rear] = num;
        }

        public int remove() {
            if (isEmpty()) {
                System.out.println("Queue is Empty!");
                return -1;
            }
            int result = arr[front];
            front = (front+1) % size;

            // last el delete
            if(rear == front){
                rear = front = - 1;
            }else{
                front = (front+1)%size;
            }
            return result;
        }

        public int peek() {
            if (isEmpty()) {
                System.out.println("Queue is Empty!");
                return -1;
            }
            return arr[front];

        }

    }

    public static void main(String[] args) {
        Queue q = new Queue(5);
        q.add(1);
        q.add(2);
        q.add(3);

        while(!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
    }
}

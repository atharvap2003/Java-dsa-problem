// Queue Using Array::
public class test{
    static class Queue{
        static int arr[];
        static int size;

        static int rear;

        Queue(int n) {
            arr = new int[n];
            size = n;
            rear = -1;
        }

        public static boolean isEmpty(){
            return rear == -1;
        }

        public void add(int data){
            if(rear == size-1){
                System.out.println("Queue is Full");
                return ;
            }
            rear = rear + 1;
            arr[rear] = data;
        }

        public int remove(){
            if(isEmpty()){
                System.out.println("Queue is Empty");
                return -1;
            }
            int front = arr[0];
            for(int i=0;i<rear;i++){
                arr[i] = arr[i+1];  
            }
            return front;
        }

        public int peek(){
            if(isEmpty()){
                System.out.println("Queue is Empty!!");
                return -1;
            }
            return arr[0];
        }

    }
    public static void main(String[] args) {
        Queue q = new Queue(1);
        q.add(10);
        System.out.println(q.peek());
        q.add(20);
        q.add(30);

        q.remove();
        q.remove();

    }
}


// sa ga sa ma ga re sa
// re ma ga pa ma ga re
// ga pa ma dha pa ma ga
// Ma dha  Ni Dha pa ma
// Pa ni dha Sa Ni dha Pa
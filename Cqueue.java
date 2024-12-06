import java.util.Scanner;

public class Cqueue {
    static class Queue {
        static int arr[];
        static int size;
        static int rear =-1;
        static int front=-1;

        Queue(int n) {
            arr = new int[n];
            this.size = n;
        }
        public static boolean isEmpty() {
            return rear ==-1&& front ==-1;
        }

        public static boolean isFull(){
             return (rear+1) % size ==front;
        }

        //enqueue
        public static void add(int data){
            if(isFull()){
                System.out.println("full");
                return;

            }

            //1st element
            if(front == -1){
                front =0;

            }
            rear = (rear +1) % size;
            arr[rear] = data;

        }
        //dequeue

        public static int remove(){
            if(isEmpty()){
                System.out.println("empty");
                return -1;
            }
            int result = arr[front];
            if(rear == front){
                rear=front=-1;
            }else {
                front = (front+1)% size;
            }
            return result;
        }

        //peek

        public static int peek(){
            if(isEmpty()){
                System.out.println("empty");
                return -1;
            }
            return arr[front];
        }

        public static void main(String args[]){
            System.out.println("Enter the size of the Queue: ");
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();

            Queue q = new Queue(n);
            q.add(1);
            q.add(2);
            q.add(3);
            q.add(4);
            q.add(5);
            System.out.println(q.remove());
            q.add(6);
            System.out.println(q.remove());
            q.add(7);

            while(!q.isEmpty()){
                System.out.println(q.peek());
                q.remove();
            }
        }
    }
}

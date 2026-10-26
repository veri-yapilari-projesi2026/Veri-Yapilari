package datastructures;                        

public class TaskPriorityQueue{               
    public static class Task{
        int taskId;         
        int priority;        

        public Task(int taskId, int priority){
            this.taskId= taskId;
            this.priority=priority;
        }

    }
    private Task[] heap;

    private int size;

    private int capacity;

    public TaskPriorityQueue(int capacity){
        this.capacity=capacity;
        this.heap= new Task[capacity];
        this.size=0;
    }
    public TaskPriorityQueue(){
        this(50);
    }
    private int parent(int index){
        return(index-1)/2;
    }
    private int leftChild(int index){
        return(index*2)+1;
    }
    private int rightChild(int index){
        return(index*2)+2;
    }

    private void swap(int i, int j){
        Task temp=heap[i];
        heap[i]=heap[j];
        heap[j]=temp;
    }
    public void insert(int taskId,int priority){
        if(size>=capacity){
            System.out.println("Kuyruk doldu,daha fazla ekleme yapılamıyor.");
            return;
        }

        Task newTask= new Task(taskId,priority);
        heap[size]=newTask;
        int current=size;
        size++;

        while(current>0 && heap[current].priority< heap[parent(current)].priority){
            swap(current,parent(current));
            current= parent(current);
        }
    }
    public Task peek(){
        if(isEmpty()){
            System.out.println("Kuyrukta bekleyen görev yok.");
            return null;
        }
        return heap[0];
    }
    public Task extractMin(){
        if(isEmpty()){
            return null;
        }

        Task minTask= heap[0];
        heap[0]=heap[size-1];
        heap[size-1]=null;
        size--;

        if (size>0){
            bubbleDown(0);
        }
        return minTask;
    }

        private void bubbleDown(int index){
            int smallest=index;
            int left = leftChild(index);
            int right = rightChild(index);

            if(left< size && heap[left].priority<heap[smallest].priority){
                smallest=left;
            }
            if(right<size && heap[right].priority<heap[smallest].priority){
                smallest=right;
            }
            if (smallest!=index){
                swap(index,smallest);
                bubbleDown(smallest);
            }
        }
    public boolean isEmpty(){
        return size==0;
    }
    public int getSize(){
        return size;
    }
    public static void main(String[]args){
        TaskPriorityQueue queue = new TaskPriorityQueue();
        System.out.println("--- Görev Ekleme Testi ---");
        queue.insert(101, 3);
        queue.insert(102, 5);
        queue.insert(103, 1);
        queue.insert(104, 2);

        System.out.println("En acil görev : Görev ID = " + queue.peek().taskId + " (Öncelik: " + queue.peek().priority + ")");
        System.out.println("\n--- Görevleri Sırayla Kuyruktan Çekme ---");
        while (!queue.isEmpty()) {
            Task task = queue.extractMin();
            System.out.println("Çekilen Görev: ID = " + task.taskId + ", Öncelik = " + task.priority);
        }

    } 

}
package CodingFactory23A.src.gr.aueb.cf.ch19.collections;

public class MyStackApp {

    public static void main(String[] args) {
        gr.aueb.cf.ch19.collections.MyStack<Integer> myStack = new gr.aueb.cf.ch19.collections.MyStack<>();

        myStack.push(1);
        myStack.push(2);
        myStack.push(3);
        myStack.push(4);


        int lastNum = myStack.pop();
        System.out.println("last item: " + lastNum);

        myStack.forEach(System.out::println);
    }
}

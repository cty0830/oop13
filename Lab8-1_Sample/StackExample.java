
import java.util.ArrayList;
import java.util.List;

class MyStack<T> {
    private List<T> stack;

    // Constructor
    public MyStack() {
        this.stack = new ArrayList<>();
    }

    // Push an item onto the stack
    public void push(T item) {
        stack.add(item); // Adds the item to the end of the list
    }

    // Pop an item from the stack
    public T pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return stack.remove(stack.size() - 1); // Removes and returns the last item in the list
    }

    // Check if the stack is empty
    public boolean isEmpty() {
        return stack.isEmpty();
    }

    // Return the size of the stack
    public int size() {
        return stack.size();
    }

}

public class StackExample{
    public static void main(String[] args) {
        MyStack<Integer> stack = new MyStack<>();
        //do some test if needed
    }
}



//我的Junit測試會測這個Object，這邊以下請不要修改
//---------------------------------------------------------------------------------
class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + "}";
    }
}
//---------------------------------------------------------------------------------
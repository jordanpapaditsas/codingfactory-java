package gr.aueb.cf.ch19;

public class NodeGeneric<T> {
    private T value;
    private NodeGeneric<T> next;
    private NodeGeneric<T> prev;

    public NodeGeneric() {}

    public NodeGeneric(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public NodeGeneric<T> getNext() {
        return next;
    }

    public void setPrev(NodeGeneric<T> tails) {
    }

    public void setNext(NodeGeneric<T> head) {
    }

    public <T> NodeGeneric<T> getPrev() {
        return null;
    }

    @Override
    public String toString() {
        return "NodeGeneric{" +
                "value=" + value +
                ", next=" + next +
                ", prev=" + prev +
                '}';
    }
}

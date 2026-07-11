package DSA.LinkListDemo;

public class MyLinkedList<E> {

    private Node<E> head = null;

    public boolean isEmpty() {
        return head == null;
    }

    public void addLast(E data) {
        Node<E> newNode = new Node<>(data);

        if (isEmpty()) {
            head = newNode;
        } else {
            Node<E> temp = head;

            while (temp.next != null) {
                temp = temp.next;
            }

            temp.next = newNode;
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");

        if (!isEmpty()) {
            Node<E> temp = head;

            while (temp != null) {
                sb.append(temp.data);
                sb.append(",");
                temp = temp.next;
            }

            sb.deleteCharAt(sb.length() - 1);
        }

        sb.append("]");
        return sb.toString();
    }
}
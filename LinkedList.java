/*
 * Eskisehir Technical University Computer Engineering
 * BIM 213 Data Structure and Algorithm
 * @author Muhammed Ömer Keskin
 * 24808869768
 */
public class LinkedList<String> {
    private Node<String> head; //create head and tail values for Node
    private Node<String> tail;
    private int LenOfNode;
    //Linked List Constructor
    public LinkedList() {
        head = tail = null;
        LenOfNode = 0; }
    public void add(String item) { // add(String item) method appends new node to the end of the list.
        Node<String> temp = new Node<String>(item);
        if (head != null) { //Expected Time Complexity O(1)
            tail.setNext(temp);
            tail = temp; }
        else { //Expected Time Complexity O(1)
            head = tail = temp; }
        LenOfNode = LenOfNode + 1; }
    public void add(int location, String item) { // add(int location, String item) method inserts new node to the list at the specified location.
        Node<String> temp = new Node<String>(item);
        if (location == LenOfNode) {
            tail.setNext(temp);
            tail = temp; }
        else if (location == 0) {
            if (isEmpty()) {
                head = tail = temp; }
            else {
                temp.setNext(head);
                head = temp; } }
        else {
            Node<String> current = head;
            Node<String> prev = null;
            for (int j = 0; j < location; j = j + 1) { //Expected Time Complexity O(N)
                prev = current;
                current = current.getNext(); }
            assert prev != null;
            prev.setNext(temp);
            temp.setNext(current); }
        LenOfNode = LenOfNode + 1; }
    public int indexOf(String item) { // indexOf(String item) method returns the first index of the specified item from list.
        Node<String> temp = head;
        for (int j = 0; temp != null; j = j + 1) { //Expected Time Complexity O(N)
            if (temp.getData().equals(item)) {
                return j; }
            temp = temp.getNext(); }
        return -1; }
    boolean isEmpty() {return (head == null);}// isEmpty() method returns whether the list is empty.
    public void remove(String item) { // remove(String item) method deletes the first occurrence of the specified item from the list
        Node<String> prev = head, temp = head.getNext();
        while (temp != null) { //Expected Time Complexity O(N)
            if (temp.getData().equals(item)) {
                prev.setNext(temp.getNext());
                if (temp == tail) {
                    tail = prev; }
                LenOfNode -= 1;
                return; }
            prev = temp;
            temp = temp.getNext();
        } }
    public void remove(int location) { // remove(int location) method deletes the node at the specified location from list.
        Node<String> prev = head, temp = head.getNext();
        for (int j = 1; j < location; j++) { //Expected Time Complexity O(N)
            prev = temp = temp.getNext(); }
        prev.setNext(temp.getNext());
        if (temp == tail) {
            tail = prev; }
        LenOfNode = LenOfNode - 1; }
    public String first() { // first() method retrieves the item of the first node in the list.
        if (isEmpty()) { //Expected Time Complexity O(1)
            return null; }
        else { //Expected Time Complexity O(1)
            return head.getData(); } }
    public String last() { //last() method retrieves the item of the last node in the list.
        if (isEmpty()) { //Expected Time Complexity O(1)
            return null;}
        else { //Expected Time Complexity O(1)
            return tail.getData(); } }
    public String get(int location) { // get(int location) retrieves the item at the specified position.
        Node<String> temp = head;
        for (int j = 0; temp != null; j = j + 1) { //Expected Time Complexity O(N)
            if (location == j) {
                return temp.getData(); }
            temp = temp.getNext(); }
        return null; }
    public int size() { // int size() returns length of the list. //Expected Time Complexity O(1)
        return LenOfNode; } }
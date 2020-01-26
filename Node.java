/*
 * Eskisehir Technical University Computer Engineering
 * BIM 213 Data Structure and Algorithm
 * @author Muhammed Ömer Keskin
 * 24808869768
 */
public class Node<String> {
    private Node<String> next;
    private String data;
    Node(String data) {
        this.data = data;
        this.next = null; }
    Node<String> getNext() {
        return next; }
    void setNext(Node<String> next) {
        this.next = next; }
    String getData() {
        return data; }
    public void setData(String data) {
        this.data = data; }}
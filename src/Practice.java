public class Practice {
    public static void main(String[] args) {
        MyLL<Character> list = new MyLL<Character>();
        list.addToBack('z');
        list.addToBack('a');
        list.addToBack('b');
        list.addToBack('g');
        list.remove('a');
        list.printlist();

    }
}
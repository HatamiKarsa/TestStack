package tugas1;

public class testStack {
    public static void main(String[] args) {

        stack a = new stack(5);
        a.push("komik naruto");
        a.push("komik doraemon");
        a.push("komik doraemon s2");
        a.push("komik conan");
        a.push("komik avatar");
        a.print();

        System.out.println("================");
        System.out.println("buku yang telah dibaca");
        System.out.println(a.pop());
        System.out.println(a.pop());



    }
}

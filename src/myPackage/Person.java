package myPackage;

public class Person {
    public static class Kid{
        private int tuoi;

        public void hello() {
            System.out.println("Xin chao");
        }
    }

    public static void main(String[] args) {
        Person.Kid kid = new Person.Kid();
        kid.hello();
    }
}
// lop duoc dinh nghia trong cung lop voi tu khoa (static);
// ke thua inner class binh thuong;

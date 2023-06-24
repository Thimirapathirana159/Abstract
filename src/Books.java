abstract class Books {
    Books(){
        System.out.println("This is the constructor");
    }
    void name(){
        System.out.println("The name of the book");
    }
    abstract void ISBN();
    abstract void Author();
}
class EducationalBooks extends Books{
    @Override
    void name() {
        super.name();
        System.out.println("Education");
    }

    @Override
    void ISBN() {
        System.out.println("ISBN 1000");
    }

    @Override
    void Author() {
        System.out.println("English Author");
    }
}
class PupilsBooks extends EducationalBooks{
    @Override
    void name() {
        super.name();
        System.out.println("Pupils Books");
    }

    @Override
    void ISBN() {
        super.ISBN();
        System.out.println("ISBN 2000");
    }

    @Override
    void Author() {
        super.Author();
        System.out.println("Government Publish");
    }
}
class StoryBooks extends Books{
    @Override
    void name() {
        super.name();
        System.out.println("Story Books");
    }

    @Override
    void ISBN() {
        System.out.println("ISBN 3000");
    }

    @Override
    void Author() {
        System.out.println("Various Authors");
    }
}
class BooksTest{
    public static void main(String[] args) {
        Books a = new EducationalBooks();
        Books b = new PupilsBooks();
        EducationalBooks c = new PupilsBooks();
        Books d = new StoryBooks();
        a.name();
        a.ISBN();
        a.Author();
        b.name();
        b.ISBN();
        b.Author();
        c.name();
        c.ISBN();
        c.Author();
        d.name();
        d.ISBN();
        d.Author();
    }
}
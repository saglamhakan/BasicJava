package kodlab.ornekProje.gelismisKutuphane;

public class Books {

    private String writer;
    private String bookName;
    private String ISBN;

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public Books(String writer, String bookName, String ISBN) {
        this.writer = writer;
        this.bookName = bookName;
        this.ISBN = ISBN;
    }

    public void bilgileriYazdir(){
        System.out.println("Yazar : " + writer + "Kitap ismi : " + bookName + "ISBN " + ISBN);
    }
}

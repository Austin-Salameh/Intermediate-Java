/*Austin Salameh- 09/19/2020
*Assignment 5.1
*
*Create a class titled SchoolTextBook that contains fields for the author, title, page count, ISBN, and price. 
*This SchoolTextBook class will also provide setter and getter methods for all fields. Save this class in a file titled SchoolTextBook.java.
*/


import java.util.Comparator;

public class SchoolTextBook {

    private String author, title;
    private int pageCount;
    private long ISBN;
    private double price;

    public SchoolTextBook(String author, String title, int pageCount, long ISBN, double price) {
        this.author = author;
        this.title = title;
        this.pageCount = pageCount;
        this.ISBN = ISBN;
        this.price = price;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public int getPageCount() {
        return pageCount;
    }

    public long getISBN() {
        return ISBN;
    }

    public double getPrice() {
        return price;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public void setISBN(long ISBN) {
        this.ISBN = ISBN;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String toString() {
        return "SchoolTextBook:" +
                "|Author: '" + author +"'\t" +
                "Title: '" + title + "'\t\t" +
                "Page Count: " + pageCount + "\t" +
                "ISBN: " + ISBN + "\t" +
                "Price:" + price + "|\t";
    }

    static class CompareAuthor implements Comparator<SchoolTextBook> {
        public int compare(SchoolTextBook obj1, SchoolTextBook obj2) {
            String bookOne = obj1.getAuthor().toUpperCase();
            String bookTwo = obj2.getAuthor().toUpperCase();
            return bookOne.compareTo(bookTwo);
        }
    }

    static class CompareTitle implements Comparator<SchoolTextBook> {
        public int compare(SchoolTextBook obj1, SchoolTextBook obj2) {
            String bookOne = obj1.getTitle().toUpperCase();
            String bookTwo = obj2.getTitle().toUpperCase();
            return bookOne.compareTo(bookTwo);
        }
    }

    static class ComparePageCount implements Comparator<SchoolTextBook> {
        public int compare(SchoolTextBook obj1, SchoolTextBook obj2) {
            int bookOne = obj1.getPageCount();
            int bookTwo = obj2.getPageCount();
            if(bookOne > bookTwo) {
                return -1;
            } else if(bookOne == bookTwo) {
                return 0;
            }
            return 1;
        }
    }

    static class CompareISBN implements Comparator<SchoolTextBook> {
        public int compare(SchoolTextBook obj1, SchoolTextBook obj2) {
            long bookOne = obj1.getISBN();
            long bookTwo = obj2.getISBN();
            if(bookOne > bookTwo) {
                return -1;
            } else if(bookOne == bookTwo) {
                return 0;
            }
            return 1;
        }
    }

    static class ComparePrice implements Comparator<SchoolTextBook> {
        public int compare(SchoolTextBook obj1, SchoolTextBook obj2) {
            double bookOne = obj1.getPrice();
            double bookTwo = obj2.getPrice();
            if(bookOne > bookTwo) {
                return -1;
            } else if(bookOne == bookTwo) {
                return 0;
            }
            return 1;
        }
    }

}
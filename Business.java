package TextBook;

public class Business {
    private String title;
    private int year;
    private int pages;

    public Business(){
        this("The Study of Business by: James Cook", 2011, 275);
    }

    public Business(String name, int year, int pages) {
        this.title = name;
        this.year = year;
        this.pages = pages;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public void Textbook(){
        System.out.println("The Title and Author of the Textbook: " + title);
        System.out.println("The Year "+ title + " was published: " + year);
        System.out.println("The Number of pages in the textbook: "+ pages + " pages");
    }

    @Override
    public String toString() {
        return "Title and Author: " + title + "\nYear: " + year + "\nPage Number: " + pages+ " pages";
    }
}

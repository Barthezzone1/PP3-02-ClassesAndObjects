public class books {
    String bookName;
    String authorName;
    int pageAmount;
    int currentPage;

    void displayBookInfo() {
        System.out.println(bookName + ",written by" + authorName + "is" + pageAmount + "pages long.");
    }
    void nextPage() {
        if (currentPage == pageAmount) {
            System.out.println("You've reached the end of the book!");
        } else {
            currentPage++;
            System.out.println("You are now on page " + currentPage);
        }
    }
    
}

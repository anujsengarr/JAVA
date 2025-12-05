public class book {
    private String t;   
    private String a;   
    private boolean av; 
    public book(String t, String a) {
        this.t = t;
        this.a = a;
        this.av = true; 
    }
    public String getTitle() {
        return t;
    }
    public String getAuthor() {
        return a;
    }
    public boolean isAvailable() {
        return av;
    }
    public void issueBook() {
        if (av) {
            av = false;
            System.out.println("Book '" + t + "' issued.");
        } else {
            System.out.println("Book '" + t + "' already issued.");
        }
    }

   
    public void returnBook() {
        if (!av) {
            av = true;
            System.out.println("Book '" + t + "' returned.");
        } else {
            System.out.println("Book '" + t + "' was not issued.");
        }
    }
}

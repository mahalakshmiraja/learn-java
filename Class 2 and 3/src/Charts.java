import java.util.Scanner;


public class Charts {
    public static void main(String[] args) {
        //BOX_OFFICE Example with ARRAYS
        String[] top_10_movies = {"Black Panther", "Tomb Raider", "I can only imagine", "A wrinkle in time", "Love Simon", "Game Night", "Peter Rabbit", "The Stranger", "Red Sparrow", "Dealth wish"};
        double[] weekend_amount = {26.7, 23.6, 17.1, 16.3, 11.8, 5.6, 5.2, 4.7, 4.5, 3.4};
        System.out.println("Box office for the weekend of March 16-18");
        Scanner sc = new Scanner(System.in);
        /*while(sc.hasNextLine());{
            if (top_10_movies in sc);
            {
                System.out.println("Hi");
            }
        */


        int j = 1;
        for (int i = 0; i < top_10_movies.length; i++) {
            System.out.println("#" + j + " " + top_10_movies[i].toUpperCase() + ":" + "$" + weekend_amount[i] + "M");
            j++;
        }

        System.out.println("************************");
        //BOOKS & AUTHOR Example with STRINGS
        String[] book_title = {"Ready Player One", "Oathbringer", "Harry Potter and the Sorcerer's Stone", "Harry Potter and the Order of the Phoenix", "A Wrinkle in Time", "The Great Alone", "Harry Potter and the Goblet of Fire", "Origin", "Red Sparrow", "Little Fires Everywhere"};
        String[] author = {"ERNEST CLINE", "BRANDON SANDERSON", "J.K. ROWLING", "J.K. ROWLING", "MADELEINE L'ENGLE", "KRISTIN HANNAH", "J.K. ROWLING", "DAN BROWN", "JASON MATTHEWS", "CELESTE NG"};
        int count = 0;
        for (int k = 0; k < book_title.length; k++) {
            //System.out.println(book_title[k] + author[k]);
            if (book_title[k].contains("Harry Potter")){
                count++;
            }
            if(book_title[k].length()> book_title[0].length()){
                book_title[0]=book_title[k]

            }

        }
        System.out.println("Number of Harry Potter books: " + count);


    }


}


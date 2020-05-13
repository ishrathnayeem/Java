// 15.b
package javaProgrammes;

public class ManyMethAndInstSubClass {

    private String favMovie;                            // Creating a temperory variable to store the string

    public void setMovie(String movieName){             // Method to set a name to the variable
        favMovie = movieName;
    }

    public String getMovie(){                           // Method to return the string of the Temperory variable
        return favMovie;
    }

    public void fResult(){                              // Method to print the variable
        System.out.printf("Your favourite movie is %s", getMovie());
    }
}

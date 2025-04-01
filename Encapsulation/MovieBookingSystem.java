class Movie {
    private int movieID;
    private String title;
    private double rating;
    private int availableSeats;

    public Movie(int movieID, String title, double rating, int availableSeats) {
        this.movieID = movieID;
        this.title = title;
        this.rating = rating;
        this.availableSeats = availableSeats;
    }

    public int getMovieID() {
        return movieID;
    }

    public void setMovieID(int movieID) {
        this.movieID = movieID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public int getAvailableSeats() {
        return availableSeats;
    }

    public void setAvailableSeats(int availableSeats) {
        this.availableSeats = availableSeats;
    }

    public boolean bookTicket() {
        if (availableSeats > 0) {
            availableSeats--;
            return true;
        }
        return false;
    }

    public void cancelTicket() {
        availableSeats++;
    }
}

class Customer {
    private int customerID;
    private String name;
    private Movie[] bookedMovies;
    private int bookedMovieCount;

    public Customer(int customerID, String name, int maxBookings) {
        this.customerID = customerID;
        this.name = name;
        this.bookedMovies = new Movie[maxBookings];
        this.bookedMovieCount = 0;
    }

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void bookMovie(Movie movie) {
        if (movie.bookTicket()) {
            if (bookedMovieCount < bookedMovies.length) {
                bookedMovies[bookedMovieCount] = movie;
                bookedMovieCount++;
                System.out.println("Ticket booked for " + movie.getTitle());
            } else {
                System.out.println("Cannot book more movies. Max limit reached.");
            }
        } else {
            System.out.println("No available seats for " + movie.getTitle());
        }
    }

    public void cancelMovie(Movie movie) {
        boolean found = false;
        for (int i = 0; i < bookedMovieCount; i++) {
            if (bookedMovies[i] == movie) {
                movie.cancelTicket();
                bookedMovies[i] = bookedMovies[bookedMovieCount - 1];
                bookedMovies[bookedMovieCount - 1] = null;
                bookedMovieCount--;
                System.out.println("Ticket canceled for " + movie.getTitle());
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("You haven't booked this movie.");
        }
    }

    public void showBookedMovies() {
        if (bookedMovieCount == 0) {
            System.out.println("No movies booked yet.");
        } else {
            System.out.println("Booked Movies:");
            for (int i = 0; i < bookedMovieCount; i++) {
                System.out.println(bookedMovies[i].getTitle());
            }
        }
    }
}

public class MovieBookingSystem {
    public static void main(String[] args) {
        Movie movie1 = new Movie(1, "Avengers: Endgame", 8.9, 5);
        Movie movie2 = new Movie(2, "Joker", 8.5, 3);

        Customer customer1 = new Customer(101, "John", 5);

        customer1.bookMovie(movie1);
        customer1.bookMovie(movie2);
        customer1.showBookedMovies();

        customer1.cancelMovie(movie1);
        customer1.showBookedMovies();

        customer1.bookMovie(movie1);
    }
}


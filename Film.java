/*
 * You are the software developer put in charge of helping an online streaming website to organize
its film collection. Once you take a look at their software you realize that they have not used
object-oriented programming. The software they have is very difficult to reuse and update. You
decide that you will have to create a new design for the software and start completely from
scratch.
The development of this project must be done using object-oriented programming. All film
objects should contain the name of the film, the name of the director, and the year of release.
There should be non-static methods to access and mutate all the information stored as private
instance variables. You can assume that no films were released before 1890.
  */
public class Film {
private String filmName;
private String directorName;
private int yearReleased;

public Film() {
	filmName = " ";
	directorName = " ";
	yearReleased = 0;
}
public void setFilmName(String newFilmName ) {
	filmName = newFilmName;
}
public String getFilmName() {
	return filmName;
}
public void setDirectorName(String newDirectorName) {
	directorName = newDirectorName;
}
public String getDirectorName() {
	return directorName;
}
public void setYearReleased(int newYearReleased) {
	if(newYearReleased >= 1890 && newYearReleased  <= 2021) {
		yearReleased = newYearReleased;
	}
}
public int getYearReleased() {
	return yearReleased;
}

}


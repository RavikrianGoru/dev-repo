package interviews.asg;

import java.util.*;
import java.text.SimpleDateFormat;
import java.time.Instant;

public class MovieNight {

	  public static Boolean canViewAll(Collection<Movie> movies) {
			boolean flag = true;
			ArrayList<Movie> movieList = (ArrayList<Movie>) movies;
			Comparator<Movie> movieComparator = (o1, o2) -> ((int) (o1.getStart().getTime() - o2.getStart().getTime()));
			Collections.sort(movieList, movieComparator);
			
			for (int index = 0; index < movieList.size() - 1; index++) {
				long startDate1 = movieList.get(index).getStart().getTime();
				long endDate1 = movieList.get(index).getEnd().getTime();
				long startDate2 = movieList.get(index + 1).getStart().getTime();
				long endDate2 = movieList.get(index + 1).getEnd().getTime();
				flag = startDate1 <= endDate1 && endDate1<= startDate2 && startDate2 <= endDate2;
			}
			return flag;
		}

	public static void main(String[] args) throws Exception {
		SimpleDateFormat sdf = new SimpleDateFormat("y-M-d H:m");

		ArrayList<Movie> movies = new ArrayList<Movie>();
		movies.add(new Movie(sdf.parse("2015-01-01 21:30"), sdf.parse("2015-01-01 23:00")));
		movies.add(new Movie(sdf.parse("2015-01-01 20:00"), sdf.parse("2015-01-01 21:30")));
		movies.add(new Movie(sdf.parse("2015-01-01 23:10"), sdf.parse("2015-01-01 23:30")));
		movies.add(new Movie(sdf.parse("2015-01-01 21:30"), sdf.parse("2015-01-01 23:00")));

		System.out.println(MovieNight.canViewAll(movies));
	}
}

class Movie {
	private Date start, end;

	public Movie(Date start, Date end) {
		this.start = start;
		this.end = end;
	}

	public Date getStart() {
		return this.start;
	}

	public Date getEnd() {
		return this.end;
	}

	@Override
	public String toString() {
		return "[  " + this.start + " === " + this.end + " ]\n";
	}

}
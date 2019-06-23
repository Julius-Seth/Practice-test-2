class Movie{

 private String title;
 private String studio;
 private String rating;

 public  Movie(String title4, String studio7, String rating9){

title = "title4";
 studio = "studio7";
  rating = "PG";
 	
 }
 public static Movie[] getPG(Movie[] movis) {
 Movie[] pgMov = new Movie[movis.length];
 int newArrayIndex = 0;
 for (int i = 0; i < movis.length; i++) {
 if (movis[i].rating.equals(“PG”)) {
 pgMov[newArrayIndex] = movis[i];
 newArrayIndex++;
 }
 }
 return pgMovis;
}
Movie mov = new Movie(“Casino Royale”,”Eon
 Productions”,”PG-13”);




}
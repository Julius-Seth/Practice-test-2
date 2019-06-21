class Holiday{

private String name;
private int day;
private String month;

 public  Holiday(String name2, int day2, String month2){

 	String name= name2;
 	int day = day2;
    String month = month2;
}

 public boolean inSameMonth(Holiday holis){
 return this.month.equals(holis.month)


 }
  

  public static double avgDate(Holiday[] holis) {
 int sum = 0;
 for(int i = 0; i < hol.length; i++) {
 sum = sum + hol[i].day;
 }
 return ((double) sum)/hol.length;
}


Holiday holis = new Holiday(“Independence Day”, 4, “July”);
 }










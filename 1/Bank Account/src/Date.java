
 class Date {
	Date(int Year, int Month, int Day) {
		year = Year;
		month = Month;
		day = Day;
	}
	private int year;
	private int month;
	private int day;
	public void print() {
		System.out.println("Year: " + year);
		System.out.println("Month: " + month);
		System.out.println("Day: " + day);
	}
}
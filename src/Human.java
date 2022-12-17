public class Human {
    private int yearOfBirth;
    String name;
    private String town;
    String job;

    Human(int yearOfBirth, String name, String town, String job) {
        if (name == null || name.isEmpty()) {
            this.name = "Информация не указана";
        } else { this.name = name; }
        if (yearOfBirth < 0) {
            this.yearOfBirth = 0;
        } else { this.yearOfBirth = yearOfBirth; }
        if (town == null || town.isEmpty()) {
            this.town = "Информация не указана";
        } else { this.town = town; }
        if (job == null || job.isEmpty()) {
            this.job = "Информация не указана";
        } else { this.job = job; }
    }


    void humanWright() {
        System.out.println("Привет! Меня зовут " + name + ". Я из города " + town + ". Я родился в " + yearOfBirth + " году. Я работаю на должности " + job + ". Будем знакомы!");
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        if (yearOfBirth < 0) {
            this.yearOfBirth = 0;
        } else { this.yearOfBirth = yearOfBirth; }
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        if (town == null || town.isEmpty() || town.isBlank()) {
            this.town = "Информация не указана";
        } else { this.town = town; }
    }
}

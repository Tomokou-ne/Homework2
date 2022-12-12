public class humanTwo {
    int yearOfBirth;
    String name;
    String town;
    String job;

    humanTwo(int yearOfBirth, String name, String town, String job) {
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


    void humanTwo() {
        System.out.println("Привет! Меня зовут " + name + ". Я из города " + town + ". Я родился в " + yearOfBirth + " году. Я работаю на должности " + job + ". Будем знакомы!");
    }
}

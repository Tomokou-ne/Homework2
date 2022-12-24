package driver;

public class Driver {
    private String initials;
    private String driversLicence;
    private int experience;

    public Driver(String initials, String driversLicence, int experience) {
        if (initials == null || initials.isBlank() || initials.isEmpty()) {
            this.initials = "водитель";
        } else {
            this.initials = initials;
        } if (driversLicence == null || driversLicence.isBlank() || driversLicence.isEmpty()) {
            this.driversLicence = "отсутствуют";
        } else {
            this.driversLicence = driversLicence;
        } if (experience <= 0) {
            this.experience = Math.abs(experience);
        } else {
            this.experience = experience;
        }
    }

    public String getInitials() {
        return initials;
    }

    public void setInitials(String initials) {
        if (initials == null || initials.isBlank() || initials.isEmpty()) {
            this.initials = "водитель";
        } else {
            this.initials = initials;
        }
    }

    public String getDriversLicence() {
        return driversLicence;
    }

    public void setDriversLicence(String driversLicence) {
        if (driversLicence == null || driversLicence.isBlank() || driversLicence.isEmpty()) {
            this.driversLicence = "отсутствуют";
        } else {
            this.driversLicence = driversLicence;
        }
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        if (experience <= 0) {
            this.experience = Math.abs(experience);
        } else {
            this.experience = experience;
        }
    }
    public void startMoving1() {
        System.out.println("Водитель " + initials + " начал движение");
    }
    public void stopMoving1() {
        System.out.println("Водитель " + initials + " остановился");
    }
    public void refuelAuto() {
        System.out.println("Водителю " + initials + " необходимо заправить авто");
    }
    @Override
    public String toString() {
        return "ФИО: " + initials + " , водительские права: " + driversLicence + " , опыт вождения: " + experience;
    }
}

package mechanic;

public class Mechanic {
    private final String initials;
    private String company;
    private String workLicence;

    public Mechanic(String initials, String company, String workLicence) {
        this.initials = initials;
        this.company = company;
        this.workLicence = workLicence;
    }

    public String getInitials() {
        return initials;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getWorkLicence() {
        return workLicence;
    }

    public void setWorkLicence(String workLicence) {
        this.workLicence = workLicence;
    }
    public void maintenance(){}

    public void fix(){}
}

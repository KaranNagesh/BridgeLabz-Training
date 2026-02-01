package StreamAPI.hospitaldoctoravailability;
class Doctor {

    private String name;
    private String specialty;
    private boolean availableOnWeekend;

    public Doctor(String name, String specialty, boolean availableOnWeekend) {
        this.name = name;
        this.specialty = specialty;
        this.availableOnWeekend = availableOnWeekend;
    }

    public boolean isAvailableOnWeekend() {
        return availableOnWeekend;
    }

    public String getSpecialty() {
        return specialty;
    }

    @Override
    public String toString() {
        return name + " - " + specialty;
    }
}

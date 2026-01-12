package EduMentor;

class FullTimeCourse implements ICertifieable {
    private Learner learner;
    private int durationMonths;

    public FullTimeCourse(Learner learner, int durationMonths) {
        this.learner = learner;
        this.durationMonths = durationMonths;
    }

    @Override
    public String generateCertificate() {
        return "Official Diploma issued for Full-Time Course (" + durationMonths + " months). (Valid indefinitely)";
    }
}
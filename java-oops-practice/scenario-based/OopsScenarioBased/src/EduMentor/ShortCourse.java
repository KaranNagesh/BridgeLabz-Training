package EduMentor;

class ShortCourse implements ICertifieable {
    private Learner learner;

    public ShortCourse(Learner learner) {
        this.learner = learner;
    }

    @Override
    public String generateCertificate() {
        return "Certificate of Completion issued for Short Course. (Valid for 1 year)";
    }
}
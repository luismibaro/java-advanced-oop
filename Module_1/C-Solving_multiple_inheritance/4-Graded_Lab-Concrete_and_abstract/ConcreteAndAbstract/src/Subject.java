class Subject {
    String title;
    double credits;

    Subject(String title, double credits) {
        // TODO 4 Include the instance variables -
        //  title(a string) and credits(double) and
        //  define the class constructor
        this.title = title;
        this.credits = credits;
    }

    public String toString() {
        //TODO 5 Define toString() method,
        // return string representation of the Subject object
        return "The subject title is "+title+"and the number of credits are"+credits;
    }
}

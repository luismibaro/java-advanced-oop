class OnlineCourse extends Course  {
    //TODO 15: include videoLessons and weeks attributes
    String lessons;
    String week;

    OnlineCourse(Subject subject, String instructor, int fee) {
        super(subject, instructor, fee);
        //TODO 16: initialize other attributes
        this.lessons = lessons;
        this.week = week;
    }
}
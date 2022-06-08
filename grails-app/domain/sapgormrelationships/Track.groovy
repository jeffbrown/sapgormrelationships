package sapgormrelationships

class Track {
    String name
    static hasMany = [courses: Course]
    static constraints = {
        name minSize: 2
        courses nullable: true
    }

    @Override
    String toString() {
        return name
    }
}

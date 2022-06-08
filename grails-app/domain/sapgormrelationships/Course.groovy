package sapgormrelationships

class Course {
    String name
    static hasMany = [assignments: Assignment]
    static belongsTo = Track
    static constraints = {
        name nullable: false
        assignments nullable: true
    }

    @Override
    String toString() {
        return name
    }
}

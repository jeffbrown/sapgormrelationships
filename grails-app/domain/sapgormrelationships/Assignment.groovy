package sapgormrelationships

class Assignment {
    String name
    String description
    String url
    static belongsTo = Course
    static constraints = {
        name nullable: false
        description minSize: 20, widget: 'textarea'
        url nullable: true, url: true
    }

    @Override
    String toString() {
        return name
    }
}

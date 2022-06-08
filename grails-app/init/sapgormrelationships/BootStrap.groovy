package sapgormrelationships

import grails.gorm.transactions.Transactional

class BootStrap {

    def init = { servletContext ->
        populateData()
    }
    def destroy = {
    }

    @Transactional
    void populateData() {
        Assignment assignment1 = new Assignment(name: "Read Software Craftsman", description: "Software Craftsman " +
                "by Sandro Mancuso is one of the mandatory readings at Incubyte",
                url: "https://www.amazon.in/s?k=software+craftsmanship&sprefix=software+craftsman%2Caps%2C231&ref=nb_sb_ss_ts-doa-p_1_18")

        Assignment assignment2 = new Assignment(name: "Read Clean Coder", description: "Principles of clean coding is vital for the code readability. ",
                url: "https://www.amazon.in/Clean-Coder-Robert-C-Martin/dp/813178696X/ref=sr_1_1?crid=187IC46P73OZ7&keywords=clean+coder&qid=1654424906&sprefix=clean+coder%2Caps%2C451&sr=8-1")

        Course course = new Course(name: "Values and Practices of Software Development")
        Track track = new Track(name: "Practices").addToCourses(course)
        course.addToAssignments(assignment1).addToAssignments(assignment2)
        track.save()
        course.save()
        assignment1.save()
        assignment2.save()
        println track.getErrors()
    }
}

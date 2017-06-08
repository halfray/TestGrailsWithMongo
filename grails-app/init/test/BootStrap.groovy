package test

class BootStrap {

    def init = { servletContext ->
        println Test.findAll()
    }
    def destroy = {
    }
}

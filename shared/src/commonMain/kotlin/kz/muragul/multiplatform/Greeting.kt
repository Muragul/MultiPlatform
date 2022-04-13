package kz.muragul.multiplatform

class Greeting {
    fun greeting(): String {
        return "Hello, ${Platform().platform}!"
    }
}
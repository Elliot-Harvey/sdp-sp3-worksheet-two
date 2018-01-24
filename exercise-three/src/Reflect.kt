import java.lang.reflect.*

fun main(args: Array<String>){
    var theClass = Class.forName("StudentClass")
    theClass.declaredMethods.forEach{x ->
        println(x.defaultValue)
        println(x.returnType)
        println(x.toString())
    }
    theClass.declaredConstructors.forEach{x ->
        println(x.toString())
        println(x.parameters.count())

    }


}
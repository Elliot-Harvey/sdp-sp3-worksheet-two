import java.lang.reflect.Type

fun main(args: Array<String>) {
    if (args.size < 2) {
        println("Requires a class name and a list of arguments")
        System.exit(-1)
    }

    var theClass = Class.forName(args.get(0))
    var theInstance = theClass::class
    var theConstructors = theClass.constructors

    val theParameters = getParameters(args)
    //var theConstructor = theClass.getConstructor(theParameters)


    //println(theConstructor)
}

fun getParameters(args: Array<String>): Array<Type> {
    var theArgs = mutableListOf<Type>()
    for (x in 1..theArgs.size-1){
        theArgs.add(theArgs.get(x).javaClass)
    }
    val result = theArgs.toTypedArray()

    return result

}

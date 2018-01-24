fun main(args: Array<String>){
    var theClass = Class.forName("ExampleClass")
    var theInstance = ExampleClass::class.java.newInstance()
    println(toString(theClass))
}

/*
Constructors
Fields
Values
Functions
 */
fun <T> toString(theClass : Class<T>) : String {
    var theString : String = ""
    theString += "Constructors:\n"
    theClass.declaredConstructors.forEach{x ->
        theString += x.toString()
        theString+="\n"
    }
    theString+="\n"
    theString += "Fields:\n"
    theClass.declaredFields.forEach{x ->
        theString += x.toString()
        theString+="\n"
    }
    theString+="\n"
    theString += "Functions:\n"
    theClass.declaredMethods.forEach{x ->
        theString += x.toString()
        theString += "\n"
    }

    return theString
}

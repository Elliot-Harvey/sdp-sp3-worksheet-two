fun main(args: Array<String>) {
    if (args.size != 1) {
        println("Requires a class name as argument to program")
        System.exit(-1)
    }
    var theClass = Class.forName(args.get(0))
    theClass.getInterfaces().forEach{x -> println(x)}
}

import org.junit.Assert.*


class ReflectKtTest {
    val someArgs = arrayOf("java.lang.String")
    val someArgs2 = arrayOf("java.lang.Integer")
    @org.junit.Test
    fun test1() {
        main(someArgs)
    }

    @org.junit.Test
    fun test2() {
        main(someArgs2)
    }

}
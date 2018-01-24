import org.junit.Assert.*
import kotlin.reflect.jvm.kotlinProperty


class StudentTest {
    var theClass = Class.forName("StudentClass")

    @org.junit.Test
    fun haveFourFields(){
        assertTrue(theClass.declaredFields.size < 5)
    }

    @org.junit.Test
    fun haveNonPrivate(){
        theClass.declaredFields.forEach{x ->
            // this seems to be wrong
            assertFalse(x.isAccessible())
        }
    }

    @org.junit.Test
    fun anyMutableLists(){
        theClass.declaredFields.forEach{ x ->
            assertFalse(x.kotlinProperty.toString().contains("kotlin.collections.MutableList"))
        }
    }

    @org.junit.Test
    fun fewerThan2PrivateHelperMethods(){
        assertTrue(theClass.declaredMethods.filter{x ->
            x.toString().split(" ").get(0).equals("private")
        }.count() > 1)

    }

    @org.junit.Test
    fun canItThrow(){
        theClass.declaredMethods.forEach{x ->
            assertFalse(x.toString().contains(" throws "))
        }
    }

    @org.junit.Test
    fun anyReturnInts(){
        theClass.declaredMethods.forEach{x ->
            assertFalse(x.returnType.equals("int"))
        }
    }

    @org.junit.Test
    fun mustBeZeroArgumentConstructor(){
        var passed : Boolean = false
        theClass.declaredConstructors.forEach{x ->
            if (x.parameters.count() == 0){passed = true}
        }
        assertTrue(passed)
    }

}
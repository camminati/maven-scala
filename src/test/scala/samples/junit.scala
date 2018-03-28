package samples

import de.camminati.prototype.Main
import org.junit.Assert._
import org.junit._

@Test
class AppTest {

  @Test
  def testOK() = assertTrue(true)

  @Test
  def testArgs(): Unit = {
    val z = Array("some", "args")
    return assertEquals("someargs", Main.getArgs(z))
  }

}



import com.foursquare.fongo.Fongo
import org.scalatest.Suite

import org.scalatest._

class ScalaTest extends Suite {

  def testMongoOrFongoBug() {
    val fongo = new Fongo("InMemoryMongo")
    val db = fongo.getDB("myDB")
    val col = db.createCollection("myCollection", null)
    val result = col.findOne()
    assert(result == null)
  }

}

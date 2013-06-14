import com.foursquare.fongo.Fongo;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBObject;
import org.junit.Assert;
import org.junit.Test;

public class JavaTest {

    @Test
    public void testMongoOrFongoBug() {
        Fongo fongo = new Fongo("InMemoryMongo");
        DB db = fongo.getDB("myDB");
        DBCollection col = db.createCollection("myCollection", null);
        DBObject result = col.findOne();
        Assert.assertNull(result);
    }

}

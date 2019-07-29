package removeSpaces;

import com.tasks.removeSpaces.RemoveSpaces;
import org.junit.Assert;
import org.junit.Test;

public class RemoveSpacesTest {
    @Test
    public void removeSpacesTest(){
        String s = "If as increasing contrasted entreaties be. Course sir people worthy horses add entire suffer.";
        String s1 = "Ifasincreasingcontrastedentreatiesbe.Coursesirpeopleworthyhorsesaddentiresuffer.";
        Assert.assertEquals(s1, RemoveSpaces.removeSpaces(s));
        Assert.assertEquals(s1, RemoveSpaces.removeSpaces1(s));
        String s2 = "        ";
        String s3 = "";
        Assert.assertEquals(s3, RemoveSpaces.removeSpaces(s2));
        Assert.assertEquals(s3, RemoveSpaces.removeSpaces1(s2));

    }
}

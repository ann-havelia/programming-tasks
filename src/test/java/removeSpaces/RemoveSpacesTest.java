package removeSpaces;

import com.tasks.removeSpaces.RemoveSpaces;
import org.junit.Assert;
import org.junit.Test;

public class RemoveSpacesTest {
    @Test
    public void removeSpacesTest(){
        String input = "If as increasing contrasted entreaties be. Course sir people worthy horses add entire suffer.";
        String expectedResult = "Ifasincreasingcontrastedentreatiesbe.Coursesirpeopleworthyhorsesaddentiresuffer.";
        Assert.assertEquals(expectedResult, RemoveSpaces.removeSpaces(input));
    }
    @Test
    public void removeSpacesEmptyStringTest(){
        String input = "        ";
        String expectedResult = "";
        Assert.assertEquals(expectedResult, RemoveSpaces.removeSpaces(input));
    }
}

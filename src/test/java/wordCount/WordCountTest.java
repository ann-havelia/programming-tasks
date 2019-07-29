package wordCount;

import com.tasks.wordCount.WordCount;
import org.junit.Assert;
import org.junit.Test;

public class WordCountTest {
    @Test
    public void wordCountTest(){
        String sentence = "Zebra in an African horse, zebra is known for having black and white stripes and there are three main species of zebra, Grevy's Zebra, the Plains Zebra, and the Mountain Zebra ";
        String word = "zebra";
        Assert.assertEquals(6, WordCount.count(sentence, word));
    }


}

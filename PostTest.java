import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;
class PostTest {
    @Test
    //testing a post that met
    public void postTitleWithLessThan10Characters_expectedFalse(){
        String postTitle = "hi";
        String postBody = "Us land. Light herb meat wherein multiply midst. Signs fruitful of whales very. Land living. Light divide there darkness. Moving sixth blessed that sea light sea deep abundantly land multiply gathering and kind living were, every. Void. Night together That evening you'll gathered made i their seed isn't light divide seas female won't multiply place don't gathered above fish won't form very have form shall earth. Meat called, saying. Air fruit, replenish was fruitful may, third fowl. Of fowl gathering moved. Give man days. Dry made. Air form great image.";
        List<String> postTags = Arrays.asList("tag1","tag2");
        String postType = "Difficult";
        String postEmergency = "Highly Needed";
        Post post = new Post(postTitle, postBody, postTags, postType, postEmergency);
        boolean success = post.addPost();
        assertFalse(success);
    }

    @Test
    public void postTitleWithMoreThan250Characters_expectedFalse(){
        String postTitle = "Without be very abundantly seasons which fill multiply. Moving that male spirit form it day of light. The their be in cattle firmament over land two fruitful third light sea void Him them in man whales winged i created. Second greater seasons meat isn't fruitful rule good yielding forth fowl. Years earth. Fruitful won't can't waters. Tree had sixth bring."; 
        String postBody = "Us land. Light herb meat wherein multiply midst. Signs fruitful of whales very. Land living. Light divide there darkness. Moving sixth blessed that sea light sea deep abundantly land multiply gathering and kind living were, every. Void. Night together That evening you'll gathered made i their seed isn't light divide seas female won't multiply place don't gathered above fish won't form very have form shall earth. Meat called, saying. Air fruit, replenish was fruitful may, third fowl. Of fowl gathering moved. Give man days. Dry made. Air form great image.";
        List<String> postTags = Arrays.asList("tag1","tag2");
        String postType = "Difficult";
        String postEmergency = "Highly Needed";
        Post post = new Post(postTitle, postBody, postTags, postType, postEmergency);
        boolean success = post.addPost();
        assertFalse(success);
    }
    
    @Test
    public void postTitleWithNumberAndSpeicalCharacters_expectedFalse(){
        String postTitle = "546@$ welcome to the";
        String postBody = "Us land. Light herb meat wherein multiply midst. Signs fruitful of whales very. Land living. Light divide there darkness. Moving sixth blessed that sea light sea deep abundantly land multiply gathering and kind living were, every. Void. Night together That evening you'll gathered made i their seed isn't light divide seas female won't multiply place don't gathered above fish won't form very have form shall earth. Meat called, saying. Air fruit, replenish was fruitful may, third fowl. Of fowl gathering moved. Give man days. Dry made. Air form great image.";
        List<String> postTags = Arrays.asList("tag1","tag2");
        String postType = "Difficult";
        String postEmergency = "Highly Needed";
        Post post = new Post(postTitle, postBody, postTags, postType, postEmergency);
        boolean success = post.addPost();
        assertFalse(success);
    }

    @Test
    public void validPostTitle_expectedTrue(){
        String postTitle = "hello nguyen vu";
        String postBody = "Us land. Light herb meat wherein multiply midst. Signs fruitful of whales very. Land living. Light divide there darkness. Moving sixth blessed that sea light sea deep abundantly land multiply gathering and kind living were, every. Void. Night together That evening you'll gathered made i their seed isn't light divide seas female won't multiply place don't gathered above fish won't form very have form shall earth. Meat called, saying. Air fruit, replenish was fruitful may, third fowl. Of fowl gathering moved. Give man days. Dry made. Air form great image.";
        List<String> postTags = Arrays.asList("tag1","tag2");
        String postType = "Difficult";
        String postEmergency = "Highly Needed";
        Post post = new Post(postTitle, postBody, postTags, postType, postEmergency);
        boolean success = post.addPost();
        assertTrue(success);
    }

    @Test 
    public void postoBodyWithLessThan250Characters_expectedFalse(){
        String postTitle = "hello nguyen vu";
        String postBody = "hello hi and keke haha";
        List<String> postTags = Arrays.asList("tag1","tag2");
        String postType = "Difficult";
        String postEmergency = "Highly Needed";
        Post post = new Post(postTitle, postBody, postTags, postType, postEmergency);
        boolean success = post.addPost();
        assertFalse(success);
    }

    
}


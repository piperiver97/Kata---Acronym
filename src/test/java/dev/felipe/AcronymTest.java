package dev.felipe;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

import org.junit.jupiter.api.Test;

public class AcronymTest {

    @Test
    public void basic() {
        assertThat(new Acronym("Portable Network Graphics").get(), is(equalTo("PNG")));
    }

   
    @Test
    public void lowercaseWords() {
        assertThat(new Acronym("Ruby on Rails").get(), is(equalTo("ROR")));
    }

   
    @Test
    public void punctuation() {
        assertThat(new Acronym("First In, First Out").get(), is(equalTo("FIFO")));
                
    }

   
    @Test
    public void nonAcronymAllCapsWord() {
        assertThat(new Acronym("GNU Image Manipulation Program").get(), is(equalTo("GIMP")));
    }

   
    @Test
    public void punctuationWithoutWhitespace() {
        assertThat(new Acronym("Complementary metal-oxide semiconductor").get(), is(equalTo("CMOS")));
    }

   
    @Test
    public void veryLongAbbreviation() {
        assertThat(new Acronym("Rolling On The Floor Laughing So Hard That My Dogs Came Over And Licked Me").get(), is(equalTo("ROTFLSHTMDCOALM")));
    }

   
    @Test
    public void consecutiveDelimiters() {
        assertThat(new Acronym("Something - I made up from thin air").get(), is(equalTo("SIMUFTA")));
    }

  
    @Test
    public void apostrophes() {
        assertThat(new Acronym("Halley's Comet").get(), is(equalTo("HC")));
    }

 
    @Test
    public void underscoreEmphasis() {
        assertThat(new Acronym("The Road _Not_ Taken").get(), is(equalTo("TRNT")));
    }

}
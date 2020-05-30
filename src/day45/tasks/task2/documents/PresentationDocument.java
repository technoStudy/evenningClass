package day45.tasks.task2.documents;

import java.util.List;

public class PresentationDocument extends Document {

    private List<Slide> slides;

    public List<Slide> getSlides() {
        return slides;
    }

    public void setSlides(List<Slide> slides) {
        this.slides = slides;
    }
}

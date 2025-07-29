package basic.class1.ex;

public class MovieReviewMain1 {
    public static void main(String[] args) {
        MovieReview inception = new MovieReview();
        inception.title = "인셉션";
        inception.review = "인생은 무한루프";

        MovieReview aboutTime = new MovieReview();
        aboutTime.title = "어바웃 타임";
        aboutTime.review = "인생 시간 영화";

        MovieReview[] movieReviews = {inception, aboutTime};

        for (MovieReview movieReview : movieReviews) {
            System.out.println("제목 = " + movieReview.title + " reivew: " + movieReview.review);
        }
    }
}

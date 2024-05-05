package com.yahia.productapi.service;

import com.yahia.productapi.ProductApiApplication;
import com.yahia.productapi.model.Product;
import com.yahia.productapi.model.Recommendation;
import com.yahia.productapi.model.Review;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {


    private final ProductApiApplication productApiApplication;

    public ProductService(ProductApiApplication productApiApplication) {
        this.productApiApplication = productApiApplication;
    }

    public Product getProduct(){

        Recommendation recommendation1 = new Recommendation();
        recommendation1.setId(1);
        recommendation1.setName("Book 2");

        Recommendation recommendation2 = new Recommendation();
        recommendation2.setId(2);
        recommendation2.setName("Book 3");

        Recommendation recommendation3 = new Recommendation();
        recommendation3.setId(3);
        recommendation3.setName("Book 4");

        List<Recommendation> recommendations = new ArrayList<>();
        recommendations.add(recommendation1);
        recommendations.add(recommendation2);
        recommendations.add(recommendation3);

        Review review1 = new Review();
        review1.setReviewId(1);
        review1.setReviewText("best book");


        Review review2 = new Review();
        review2.setReviewId(2);
        review2.setReviewText("i like book");

        Review review3 = new Review();
        review3.setReviewId(13);
        review3.setReviewText(" this is a better book");

        List<Review> reviews = new ArrayList<>();
        reviews.add(review1);
        reviews.add(review2);
        reviews.add(review3);


        Product product1 = new Product();
        product1.setProductId(1);
        product1.setName("Book 1");
        product1.setRecommendations(recommendations);
        product1.setReviews(reviews);

        return product1;
    }
}

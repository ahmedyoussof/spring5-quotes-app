package com.springudemycourse.spring5quotesapp.services;

import com.springudemycourse.spring5quotesapp.utils.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class QuoteServiceImpl implements QuoteService {

    private final ChuckNorrisQuotes chuckNorrisQuotes;

    public QuoteServiceImpl () {
        this.chuckNorrisQuotes = new ChuckNorrisQuotes();
    }

    @Override
    public String getQuote() {
        return chuckNorrisQuotes.getRandomQuote();
    }
}

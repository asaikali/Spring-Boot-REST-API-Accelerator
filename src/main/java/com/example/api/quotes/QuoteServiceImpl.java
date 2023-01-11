package com.example.api.quotes;

import org.springframework.stereotype.Service;

@Service
class QuoteServiceImpl implements QuoteService {

    private final QuoteRepository quoteRepository;

    public QuoteServiceImpl(QuoteRepository quoteRepository) {
        this.quoteRepository = quoteRepository;
    }

    public Quote randomQuote() {
        QuoteEntity randomQuote = this.quoteRepository.findRandomQuote();
        var result = new Quote();
        result.setQuote(randomQuote.getQuote());
        result.setId(randomQuote.getId());
        result.setAuthor(randomQuote.getAuthor());
        return result;
    }
}

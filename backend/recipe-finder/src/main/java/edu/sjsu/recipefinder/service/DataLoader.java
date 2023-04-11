package edu.sjsu.recipefinder.service;

import com.lilittlecat.chatgpt.offical.ChatGPT;

public class DataLoader {
    public DataLoader() {
        ChatGPT chatGPT = new ChatGPT("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");
        String hello = chatGPT.ask("list the food ingredients from this text:  \n" +
                "['1 small kabocha or acorn squash (2–3 lb.)', '2 Tbsp. fresh lemon juice', '4 tsp. honey', '3 Tbsp. extra-virgin olive oil, divided', 'Kosher salt, freshly ground pepper', '8 oz. brussels sprouts, trimmed, halved', '2 Tbsp. unsalted butter', '2 sprigs thyme', '1 sprig rosemary', '1 garlic clove, lightly crushed', '2 Tbsp. white balsamic vinegar', '1/4 cup red wine vinegar', '1 Tbsp. Dijon mustard', '1 tsp. fresh lemon juice', 'Kosher salt', '1 small garlic clove', '1 1/2 tsp. crushed red pepper flakes', '1 1/2 tsp. dried oregano', '1/4 cup plus 2/3 cup extra-virgin olive oil', '1 (15.5-oz.) can chickpeas, rinsed', 'Kosher salt', '2 scallions, thinly sliced', '2 1/2 oz. fennel salami, sliced 1/8\" thick, slices cut into quarters (about 1/2 cup)', '1 cup chopped caciocavallo cheese', '1 cup Castelvetrano olives, pitted', '1/4 cup chopped dill', '4 cups torn mixed radicchio leaves', '4 cups torn Little Gem or romaine lettuce', '1/2 cup finely grated ricotta salata', '1/4 cup pomegranate seeds']");
        System.out.println(hello); // will be "\n\nHello! How may I assist you today?"
    }
}

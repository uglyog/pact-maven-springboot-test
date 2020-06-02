package com.github.uglyog;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class ArticlesController {
  private static final Logger LOGGER = LoggerFactory.getLogger(ArticlesController.class);

  @RequestMapping("/articles.json")
  public Map<String, Object> get_articles() {
    Map<String, Object> map = new HashMap<>();
    Map<String, Object> article = new HashMap<>();
    Map<String, Object> variants = new HashMap<>();
    Map<String, Object> variant = new HashMap<>();
    variant.put("description", "Variant Description");
    variants.put("0032", variant);
    article.put("variants", variants);
    List<Object> articles = Collections.singletonList(article);
    map.put("articles", articles);
    return map;
  }

  @RequestMapping(value = "/statechange", method = RequestMethod.POST, consumes = {"application/json"},
    produces = {"application/json"})
  public Map<String, Object> statechange(@RequestBody Map<String, Object> params) {
    LOGGER.error("statechange = " + params.toString());
    return new HashMap<>();
  }

}

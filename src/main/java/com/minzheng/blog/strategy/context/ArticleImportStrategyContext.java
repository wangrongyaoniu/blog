package com.minzheng.blog.strategy.context;

import com.minzheng.blog.enums.MarkdownTypeEnum;
import com.minzheng.blog.strategy.ArticleImportStrategy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.util.Map;

/**
 * 文章导入策略上下文
 *
 * @author linweiyuan
 * @date 2022/07/28
 */
@Service
public class ArticleImportStrategyContext {
    // map集合的自动注入，key默认的为类名（首字母小写），value为对象引用
    @Autowired
    private Map<String, ArticleImportStrategy> articleImportStrategyMap;

    public void importArticles(MultipartFile file, String type) {
        articleImportStrategyMap.get(MarkdownTypeEnum.getMarkdownType(type)).importArticles(file);
    }
}

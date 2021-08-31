package com.example.wshop.cache;

import org.springframework.cache.CacheManager;
import org.springframework.stereotype.Component;

@Component
public class WshopCacheManager {

    private CacheManager cacheManager;

    public WshopCacheManager(CacheManager cacheManager){
        this.cacheManager = cacheManager;
    }

    public void putCache(String cacheName, String key, Object o){
        if (cacheManager.getCache(cacheName) != null) {
            cacheManager.getCache(cacheName).put(key, o);
        }
    }

    public void remove(String cacheName, String key){
        if (cacheManager.getCache(cacheName) != null) {
            cacheManager.getCache(cacheName).evict(key);
        }
    }

}
